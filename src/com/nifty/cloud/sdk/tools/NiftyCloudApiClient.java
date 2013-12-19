/******************************************************************************* 
 *  Copyright 2013 NIFTY Corporation All Rights Reserved.
 *  
 *  Licensed under the Apache License, Version 2.0 (the "License"); 
 *  You may not use this file except in compliance with the License. 
 *  You may obtain a copy of the License at 
 *      http://www.apache.org/licenses/LICENSE-2.0
 *  
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 * ***************************************************************************** 
 * 
 *  NIFTY Cloud SDK for Java
 *  API Version: 1.16
 *  Date: 2013-10-18 17:00:00
 * 
 */
package com.nifty.cloud.sdk.tools;

import static com.nifty.cloud.sdk.Const.DEFAULT_END_POINT;
import static com.nifty.cloud.sdk.Const.DEFAULT_UPLOAD_END_POINT;
import static com.nifty.cloud.sdk.Const.ENCODING;
import static com.nifty.cloud.sdk.Const.HTTP_METHOD_POST;
import static com.nifty.cloud.sdk.Const.VERSION;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Authenticator;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.PasswordAuthentication;
import java.net.Proxy;
import java.net.Proxy.Type;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.httpclient.Header;
import org.apache.commons.httpclient.HttpException;
import org.apache.commons.httpclient.HttpMethod;
import org.apache.commons.httpclient.methods.ByteArrayRequestEntity;
import org.apache.commons.httpclient.methods.GetMethod;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.commons.httpclient.methods.StringRequestEntity;

import com.nifty.cloud.sdk.ClientConfiguration;
import com.nifty.cloud.sdk.Const;
import com.nifty.cloud.sdk.ErrorResult;
import com.nifty.cloud.sdk.NiftyClientException;
import com.nifty.cloud.sdk.NiftyServiceException;
import com.nifty.cloud.sdk.Request;
import com.nifty.cloud.sdk.Result;
import com.nifty.cloud.sdk.annotation.Action;
import com.nifty.cloud.sdk.auth.Credentials;
import com.nifty.cloud.sdk.auth.SignatureUtils;
import com.nifty.cloud.sdk.auth.SignatureUtils.SignatureVersion;
import com.nifty.cloud.sdk.upload.model.UploadRequest;
import com.nifty.cloud.sdk.upload.model.UploadResult;

/**
 * NIFTY Cloud API クライアント。<br />
 * このクラスはAPIクライアント情報を格納します。
 */
public class NiftyCloudApiClient {

	/** HTTPクライアント	*/
	private static HttpClient client = null;

	/** 認証情報 */
	private Credentials credential;

	/** クライアント設定情報 */
	private ClientConfiguration config;

	/** エンドポイント */
	private String endpoint = DEFAULT_END_POINT;

	/** エンドポイント */
	private String uploadEndpoint = DEFAULT_UPLOAD_END_POINT;

	/** GETメソッドを許容するリクエストURLのサイズ */
	private static final int MAX_REQUEST_URL_LENGTH = 1000;

	/** プロキシ認証 */
	private ProxyAuthenticator auth;

	/**
	 * 認証情報、クライアント設定情報を指定し、NIFTY Cloud API クライアントを構築します。
	 *
	 * @param credential - 認証情報
	 * @param config - クライアント設定情報
	 */
	public NiftyCloudApiClient(Credentials credential, ClientConfiguration config) {
		this.credential = credential;
		this.config     = config;
		if (client == null) {
			client = HttpClient.getInstance(config);
		}
		if(config.getConfigEndpoint() != null && !config.getConfigEndpoint().isEmpty()){
			this.endpoint = config.getConfigEndpoint();
		}
		if(config.getConfigUploadEndpoint() != null && !config.getConfigUploadEndpoint().isEmpty()){
			this.uploadEndpoint = config.getConfigUploadEndpoint();
		}
	}

	/**
	 * エンドポイントを設定します。
	 * @param endpoint - エンドポイント
	 */
	public void setEndpoint(String endpoint) {
		this.endpoint = endpoint;
	}

	/**
	 * エンドポイントを設定します。
	 * @param uploadEndpoint - エンドポイント
	 */
	public void setUploadEndpoint(String uploadEndpoint) {
		this.uploadEndpoint = uploadEndpoint;
	}

	/**
	 * 指定されたリクエストオブジェクトに対応するNIFTY Cloud APIを実行し、
	 * 処理結果を取得します。
	 *
	 * @param request - リクエストオブジェクト
	 * @param clazz - 処理結果クラス
	 * @return 処理結果オブジェクト
	 */
	public Result execute(Request request, Class<? extends Result> clazz) {
		try {
			String url       = getUrl();
			String action    = getAction(request);
			String timeStamp = getTimeStamp();

			QueryStringGenarator queryString = new QueryStringGenarator();
			queryString.parseRequest(request);
			queryString.put("AccessKeyId",      credential.getAccessKeyId());
			queryString.put("Action",           action);
			queryString.put("Timestamp",        timeStamp);
			queryString.put("Version",          VERSION);
			queryString.put("SignatureVersion", config.getSignatureVersion().getValue());
			if (!(config.getSignatureVersion()==SignatureVersion.Version_0 ||
				  config.getSignatureVersion()==SignatureVersion.Version_1)) {
				queryString.put("SignatureMethod",  config.getSignatureMethod().getAlgorithm());
			}

			String signature = SignatureUtils.caluculateSignature(config.getSignatureVersion(),
																  config.getSignatureMethod(),
																  credential.getSecretKey(),
																  config.getRequestMethod(),
																  url,
																  queryString);
			queryString.put("Signature", signature);
			NiftyCloudApiResult niftyCloudApiResult = null;
			try {
				niftyCloudApiResult = executeApi(url, queryString);
			} catch (HttpException e) {
				throw new NiftyServiceException(e);
			} catch (IOException e) {
				throw new NiftyServiceException(e);
			}

			Result result = XmlUtils.xml2Bean(niftyCloudApiResult.getResponseXml(), clazz);
			if (result == null) {
				result = clazz.newInstance();
			}

			String userAgent = config.getUserAgent();
			result.setUserAgent(userAgent.equals(Const.DEFAULT_USER_AGENT) ? userAgent + "/" + Const.VERSION : userAgent);
			result.setUrl(endpoint);
			result.setQueryString(queryString.toQueryString());
			result.setRequestHeader(niftyCloudApiResult.getRequestHeader());
			result.setStatus(niftyCloudApiResult.getStatus());
			result.setStatusText(niftyCloudApiResult.getStatusText());
			result.setReseponseHeader(niftyCloudApiResult.getReseponseHeader());
			result.setResponseXml(niftyCloudApiResult.getResponseXml());
			if (config.getProxyHost()!=null && !config.getProxyHost().isEmpty()) {
				if (config.getProxyPort() != 0) {
					result.setProxy(config.getProxyHost() + ':' + config.getProxyPort());
				}
				else {
					result.setProxy(config.getProxyHost());
				}
			}

			if (result instanceof ErrorResult) {
				throw new NiftyServiceException(((ErrorResult) result).getFaultMessage());
			}

			return result;

		} catch(NiftyClientException e) {
			throw e;
		} catch (Exception e) {
			throw new NiftyClientException(e);
		}

	}


	/**
	 * エンドポイントにクエリを指定しリクエストを行い、HTTPステータス、HTTPヘッダ、レスポンスXMLを取得します。
	 *
	 * @param url - エンドポイント
	 * @param queryString - クエリ
	 * @return レスポンスXML
	 * @throws IOException
	 * @throws HttpException
	 */
	private NiftyCloudApiResult executeApi(String url, QueryStringGenarator queryString) throws HttpException, IOException {
		HttpMethod method = null;
		int status;
		String statusText = null;
		String requestHeaders = null;
		String responseHeaders = null;
		String responseXml = null;
		String query = queryString.toQueryString();

		try {
			if (!config.getRequestMethod().equals(HTTP_METHOD_POST)) {
				String requestUrl = url + query;
				if (requestUrl.length() >= MAX_REQUEST_URL_LENGTH) {
					throw new NiftyClientException(
						"Length of request URL exceeds the limit. Please use POST method instead of GET method.");
				}
				method = new GetMethod(url);
				method.setQueryString(query);
			}
			else {
				method = new PostMethod(url);
				((PostMethod)method).setRequestEntity(new StringRequestEntity(query, null, null));
			}
			method.getParams().setContentCharset(ENCODING);
			status = client.executeMethod(method);

			statusText = method.getStatusText();
			requestHeaders = getRequestHeaders(method);
			responseHeaders = getResponseHeaders(method);
			responseXml = getResponseBody(method);

		} finally {
			if (method != null) {
				method.releaseConnection();
			}
		}

		return new NiftyCloudApiResult(status, statusText, requestHeaders, responseHeaders, responseXml);
	}

	/**
	 * レスポンス内容を文字列として取得します。
	 * @param method HTTPメソッド
	 * @return 文字列
	 * @throws IOException
	 */
	private String getResponseBody(HttpMethod method) throws IOException {
		int length = 0;
		int offset = 0;
		byte[] tmp = new byte[1024];
		InputStream is = method.getResponseBodyAsStream();
		while ((length = is.read(tmp, offset, tmp.length-offset))!= -1) {
			offset += length;
			if (tmp.length == offset) {
				byte[] newTmp = new byte[tmp.length*2];
				System.arraycopy(tmp, 0, newTmp, 0, tmp.length);
				tmp = newTmp;
			}
		}
		is.close();
		return new String(tmp, 0, offset, ENCODING);
	}

	/**
	 * アップロードエンドポイントに、実アップロード以外のリクエストを送信します。
	 *
	 * @param request - リクエストオブジェクト
	 * @param clazz - 処理結果クラス
	 * @return 処理結果オブジェクト
	 */
	public UploadResult processLargeSizeUpload(UploadRequest request, Class<? extends UploadResult> clazz) {
		File file = request.getFile();
		if (file == null) throw new IllegalArgumentException("The upload file cannot be null.");
		if (!file.exists()) throw new IllegalArgumentException("The upload file must exists.");

		PostMethod method = new PostMethod(getUploadUrl());
		fillUploadRequest(method, request, new HashMap<String, String>(), 0);

		try {
			client.executeMethod(method);
			return createUploadResult(method, clazz);
		} catch (Exception e) {
			throw new NiftyClientException(e);
		} finally {
			method.releaseConnection();
		}
	}

	/**
	 * アップロードエンドポイントにリクエストし、アップロードを実行します。
	 *
	 * @param request - リクエストオブジェクト
	 * @param clazz - 処理結果クラス
	 * @return 処理結果オブジェクト
	 */
	public UploadResult executeLargeSizeUpload(UploadRequest request, Class<? extends UploadResult> clazz) {
		File file = request.getFile();
		if (file == null) throw new IllegalArgumentException("The upload file cannot be null.");
		if (!file.exists()) throw new IllegalArgumentException("The upload file must exists.");

		int partSize = request.getPartSize();

		Map<String, String> headerMap = new HashMap<String, String>();

		FileChannel fc = null;
		UploadResult result = null;
		try {
			fc = new FileInputStream(request.getFile()).getChannel();
			ByteBuffer bb = null;
			for (long i = request.getOffset(), fileLength = file.length(), sent = 0; i < fileLength; i += request.getPartSize()) {
				if (fileLength - i < partSize) {
					partSize = (int)(fileLength - i);
					bb = ByteBuffer.allocate(partSize);
				} else if (bb == null) {
					bb = ByteBuffer.allocate(partSize);
				}
				bb.rewind();
				fc.read(bb, i);
				PostMethod method = new PostMethod(getUploadUrl());
				method.setRequestEntity(new ByteArrayRequestEntity(bb.array()));
				fillUploadRequest(method, request, headerMap, partSize);
				method.setRequestHeader("content-type", "application/octet-stream");
				try {
					client.executeMethod(method);
				} finally {
					method.releaseConnection();
				}
				result = createUploadResult(method, clazz);

				request.setPosition(result.getPosition().longValue());
				sent += partSize;
				request.notifyProgress(partSize, sent);
				Thread.sleep(100);
			}
		} catch (Exception e) {
			throw new NiftyClientException(e);
		} finally {
			if (fc != null) {
				try { fc.close(); } catch (IOException e) {}
			}
		}

		return result;
	}

	/**
	 * アップロード用リクエストメソッドにヘッダーを設定します。
	 * @param method HttpMethod
	 * @param request リクエストオブジェクト
	 * @param headerMap ワークマップ
	 * @param partSize 送信するブロックサイズ
	 */
	private void fillUploadRequest(HttpMethod method, UploadRequest request, Map<String, String>headerMap, int partSize) {
		request.getHeaders(headerMap, partSize);
		for (Map.Entry<String, String> entry : headerMap.entrySet()) {
			method.setRequestHeader(entry.getKey(), entry.getValue());
		}
	}

	private UploadResult createUploadResult(PostMethod method, Class<? extends UploadResult> clazz) throws Exception {
		int status = method.getStatusCode();
		UploadResult result = clazz.newInstance();
		result.applyResponse(method);

		String errorMessage = result.getErrorMessage();
		if (errorMessage != null) {
			throw new NiftyServiceException(errorMessage);
		}

		String userAgent = config.getUserAgent();
		result.setUserAgent(userAgent.equals(Const.DEFAULT_USER_AGENT) ? userAgent + "/" + Const.VERSION : userAgent);
		result.setUrl(endpoint);
		result.setRequestHeader(getRequestHeaders(method));
		result.setStatus(status);
		result.setStatusText(method.getStatusText());
		result.setReseponseHeader(getResponseHeaders(method));
		Header nextPosition = method.getResponseHeader("x-nifty-upload-next-position");
		if (nextPosition != null) {
			result.setPosition(Long.valueOf(nextPosition.getValue()));
		}
		if (config.getProxyHost() != null && !config.getProxyHost().isEmpty()) {
			result.setProxy(
				(config.getProxyPort() == 0) ? config.getProxyHost() : config.getProxyHost() + ':' + config.getProxyPort()
			);
		}

		return result;
	}

	/**
	 * 指定されたURLのコンテンツを文字列に出力します。
	 *
	 * @param url URL
	 * @return 文字列
	 * @throws IOException
	 */
	public String getHttpText(String url) throws IOException {
		String proxyHost = config.getProxyHost();
		BufferedReader reader = null;
		HttpURLConnection urlCon = null;
		String httpText;

		try {
			if (this.auth == null && proxyHost != null
			 && config.getProxyUsername() != null && config.getProxyPassword() != null) {
				this.auth = new ProxyAuthenticator(proxyHost
						, config.getProxyUsername(), config.getProxyPassword());
				Authenticator.setDefault(auth);
			}
			URL urlObj = new URL(url);
			if (proxyHost == null) {
				urlCon = (HttpURLConnection) urlObj.openConnection();
			} else {
				int proxyPort = config.getProxyPort();
				Proxy proxy = new Proxy(Type.HTTP, new InetSocketAddress(proxyHost, proxyPort));
				urlCon = (HttpURLConnection) urlObj.openConnection(proxy);
			}
			reader = new BufferedReader(new InputStreamReader(urlCon.getInputStream(), ENCODING));
			StringBuilder buf = new StringBuilder();
			for (String line; (line = reader.readLine()) != null; ) {
				buf.append(line);
				buf.append('\n');
			}
			httpText = buf.toString();
		} finally {
			if (reader != null) {
				try {
					reader.close();
				} catch (IOException e) {
					throw new NiftyServiceException(e);
				}
			}
			if (urlCon != null) {
				urlCon.disconnect();
			}
		}
		return httpText;
	}

	/**
	 * エンドポイントの取得を行います。
	 *
	 * @return エンドポイントに"://"が含まれていればendpoint,含まれない場合設定情報のプロトコルを前に連結し返します。
	 */
	private String getUrl() {
		if (endpoint.contains("://")) {
			return endpoint;
		}
		return config.getProtocol().toString() + "://" + endpoint;
	}


	/**
	 * エンドポイントの取得を行います。
	 *
	 * @return エンドポイントに"://"が含まれていればendpoint,含まれない場合設定情報のプロトコルを前に連結し返します。
	 */
	private String getUploadUrl() {
		if (uploadEndpoint.contains("://")) {
			return uploadEndpoint;
		}
		return config.getProtocol().toString() + "://" + uploadEndpoint;
	}

	/**
	 * クライアント設定情報を取得します。
	 *
	 * @return クライアント設定情報
	 */
	public ClientConfiguration getConfig() {
		return config;
	}

	/**
	 * リクエストからアクションの値を取得します。
	 *
	 *
	 * @param request - リクエストオブジェクト
	 * @return アクション値
	 */
	private String getAction(Request request) {
		Action action = request.getClass().getAnnotation(Action.class);
		if (action == null) {
			throw new NiftyClientException("Not found action name.");
		}

		return action.value();
	}

	/**
	 * 現在時刻をISO 8601形式に変換した文字列を取得します。
	 * @see <a href="http://www.w3.org/TR/NOTE-datetime">W3C Date and Time Formats</a>
	 *
	 * @return 現在時刻文字列
	 */
	private String getTimeStamp() {
		return DateUtils.toISO8601FormatedString(new Date());
	}

	/**
	 * HTTPメソッドからHTTPリクエストヘッダを取得します。
	 *
	 * @param method - HTTPメソッド
	 * @return HTTPリクエストヘッダ文字列
	 */
	private String getRequestHeaders(HttpMethod method) {
		return concatHeaders(method.getRequestHeaders());
	}

	/**
	 * HTTPメソッドからHTTPレスポンスヘッダを取得します。
	 *
	 * @param method - HTTPメソッド
	 * @return HTTPレスポンスヘッダ文字列
	 */
	private String getResponseHeaders(HttpMethod method) {
		return concatHeaders(method.getResponseHeaders());
	}

	/**
	 * Header配列の全てのヘッダ名とヘッダ値を連結します。
	 *
	 * @param headers Header配列
	 * @return　連結されたヘッダ文字列
	 */
	private String concatHeaders(Header[] headers) {
		StringBuilder sb = new StringBuilder();
		for (Header header: headers) {
			sb.append(header.getName()).append(": ").append(header.getValue()).append("\n");
		}

		return sb.toString();
	}

	/**
	 * レスポンス一時受け用クラス。
	 */
	private class NiftyCloudApiResult extends Result {

		public NiftyCloudApiResult(int status, String statusText, String requestHeaders, String reseponseHeader, String responseXml) {
			super();
			setStatus(status);
			setStatusText(statusText);
			setRequestHeader(requestHeaders);
			setReseponseHeader(reseponseHeader);
			setResponseXml(responseXml);
		}
	}

	public static class ProxyAuthenticator extends Authenticator {
		private URL url;
		private PasswordAuthentication auth;

		public ProxyAuthenticator(String proxyhost, String userid, String password) throws IOException {
			this.url = new URL(Const.PROTOCOL_HTTP + "://" +  proxyhost);
			this.auth = new PasswordAuthentication(userid, password.toCharArray());
		}

		@Override
		public URL getRequestingURL() {
			return url;
		}

		@Override
		protected RequestorType getRequestorType() {
			return RequestorType.PROXY;
		}

		@Override
		protected PasswordAuthentication getPasswordAuthentication() {
			return auth;
		}
	}
}
