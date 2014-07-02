/******************************************************************************* 
 *  Copyright 2014 NIFTY Corporation All Rights Reserved.
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
 *  API Version: 1.18
 *  Date: 2014-05-23 17:00:00
 * 
 */
package com.nifty.cloud.sdk.auth;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Map;
import java.util.TreeMap;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

import org.apache.commons.codec.binary.Base64;

import static com.nifty.cloud.sdk.Const.*;

import com.nifty.cloud.sdk.NiftyClientException;
import com.nifty.cloud.sdk.tools.QueryStringGenarator;

/**
 * NIFTY Cloud API Signatureユーティリティクラス。<br />
 * Signatureに関するユーティリティクラスです。
 */
public final class SignatureUtils {
	
	/**
	 * SignatureVersion　列挙型。
	 */
	public enum SignatureVersion {
		/** SignatureVersion: バージョン0 */		
		Version_0(SIGNATURE_VERSION_0),
		/** SignatureVersion: バージョン1 */
		Version_1(SIGNATURE_VERSION_1),
		/** SignatureVersion: バージョン2 */
		Version_2(SIGNATURE_VERSION_2);

		/** SignatureVersion */
		private String value;
		
		/**
		 *  SignatureVersionを指定し列挙方を構築します。
		 *  
		 *  @param value SignatureVersionの文字列表現
		 */
		private SignatureVersion(String value) {
			this.value = value;
		}
		
		/**
		 * SignatureVersionの文字列表現を取得します。
		 * 
		 * @return value SignatureVersionの文字列表現 
		 */
		public String getValue() {
			return value;
		}
		
		/**
		 * SignatureVersionの文字列表現から列挙型の検索を行います。
		 * 
		 * @param value  SignatureVersionの文字列表現
		 * @return SignatureVersion列挙型
		 * @throws NiftyClientException 列挙型が検索できなかった場合
		 */
		public static SignatureVersion find(String value) {
			if      (Version_0.getValue().equals(value)) { return Version_0; }
			else if (Version_1.getValue().equals(value)) { return Version_1; }
			else if (Version_2.getValue().equals(value)) { return Version_2; }
			
			throw new NiftyClientException("Unsupported Signature version.");
		}
	}

	/**
 	 * SignatureMethod　列挙型。
	 */
	public enum SignatureMethod {
		/** SignatureMethod: HmacsSHA1 */		
		HmacSHA1(SIGNATUTE_METHOD_HMAC_SHA1),
		/** SignatureMethod: HmacsSHA256 */		
		HmacSHA256(SIGNATUTE_METHOD_HMAC_SHA256);
		
		/** アルゴリズム名 */
		private String algorithm;
		
		/**
		 * アルゴリズム名を指定し列挙方を構築します。
		 * 
		 * @param algorithm  アルゴリズム名
		 */
		private SignatureMethod(String algorithm) {
			this.algorithm = algorithm;
		}
		
		/**
		 * アルゴリズム名を取得します。
		 * 
		 * @return アルゴリズム名
		 */
		public String getAlgorithm() {
			return algorithm;
		}
		
		/**
		 * アルゴリズム名からSignatureMethodを検索します。
		 * 
		 * @param algorithm アルゴリズム名
		 * @return SignatureMethod
		 * @throws NiftyClientException 列挙型が検索できなかった場合
		 */
		public static SignatureMethod find(String algorithm) {
			if      (HmacSHA1.getAlgorithm().equals(algorithm)  ) { return HmacSHA1;   }
			else if (HmacSHA256.getAlgorithm().equals(algorithm)) { return HmacSHA256; }
			
			throw new NiftyClientException("Unsupported Signature method.");
		}
	}
	
	/**
	 * Signatureの生成を行います。
	 * HTTPメソッド、URL,クエリ文字列よりSignatureVersionにあった符丁を作成し、
	 * SignatureMethodのアルゴリズムにより暗号化を行い署名を作成します。
	 * 作成された書名はbase64エンコーディングにより文字列化を行います。
	 * 
	 * @param version SignatureVersion
	 * @param method SignatureMethod
	 * @param secretAccessKey SecretAccessKey
	 * @param httpVerb HTTPメソッド
	 * @param url エンドポイント
	 * @param query クエリ生成クラス
	 * @return base64エンコーディングされた署名
	 * @throws NiftyClientException 不正なSignatureVersionが指定された場合
	 */
	public static String caluculateSignature(SignatureVersion version,
											 SignatureMethod method,
											 String secretAccessKey,
											 String httpVerb,
											 String url,
											 QueryStringGenarator query) {
		SignatureMethod signatureMethod = SignatureMethod.HmacSHA1;
		
		try {		
			String sign = null;
			switch (version) {
			case Version_0:
				sign = version0Sign(query);
				break;
			case Version_1:
				sign = version1Sign(query);
				break;
			case Version_2:
				signatureMethod = method;
				sign = version2Sign(httpVerb, url, query);
				break;
			default:
				throw new NiftyClientException("Unknown Signature Version.");
			}
			
			Mac mac = Mac.getInstance(signatureMethod.getAlgorithm());
			mac.init(new SecretKeySpec(secretAccessKey.getBytes(ENCODING), signatureMethod.getAlgorithm()));
		    byte[] signature = mac.doFinal(sign.getBytes(ENCODING));

		    return new String(Base64.encodeBase64(signature));
		}catch(Exception e) {
			throw new NiftyClientException(e);
		}
	}

	/**
	 * Version0用符丁の生成を行います。
	 *
	 * @param query  クエリ生成クラス
	 * @return  Version1
	 */
	private static String version0Sign(QueryStringGenarator query) {
		StringBuilder sign = new StringBuilder();
		
		sign.append(query.get("Action"))
			.append(query.get("Timestamp"));
		
		return sign.toString();
	}
	
	/**
	 * Version1用符丁の生成を行います。
	 * クエリの名前を大文字、小文字を区別せずソートした順番で作成したクエリ文字列を取得します。
	 *
	 * @param query  クエリ生成クラス
	 * @return  Version1
	 */
	private static String version1Sign(QueryStringGenarator query) {
		StringBuilder sign = new StringBuilder();
		
		Map<String, String> map = new TreeMap<String, String>(String.CASE_INSENSITIVE_ORDER);
		map.putAll(query);
		
		for (Map.Entry<String, String> e : map.entrySet()) {
			sign.append(e.getKey()).append(e.getValue());
		}
		
		return sign.toString();
	}
	
	/**
	 * Version2用符丁の生成を行います。
	 * 以下の文字列を改行コードで連結した文字列を取得します。<br/>
	 * <ul>
	 * <li>HTTPメソッド</li>
	 * <li>小文字に変換したエンドポイントのホスト名</li>
	 * <li>エンドポイントのパス</li>
	 * <li>クエリの名前を大文字、小文字を区別しソートした順番で作成したクエリ文字列</li>
	 * </ul>
	 *  
	 * @param httpVerb  HTTPメソッド
	 * @param url  エンドポイント
	 * @param query  クエリ生成クラス
	 * @return Version2用符丁
	 * @throws MalformedURLException 
	 */
	private static String version2Sign(String httpVerb,
								  	   String url,
								  	   QueryStringGenarator query) throws MalformedURLException {
	
		URL getUrl = new URL(url);
		StringBuilder sign = new StringBuilder();
		sign.append(httpVerb).append("\n").
			 append(getHost(url)).append("\n").
			 append(QueryStringGenarator.urlEncode(getUrl.getPath(),true,true)).append("\n").
			 append(query.toQueryString(true));
			
		return sign.toString();
	}

	/**
	 * エンドポイントのホスト名を小文字に変換した文字列を取得します。
	 * 
	 * @param url   エンドポイント
	 * @return 小文字に変換されたホスト名
	 * @throws MalformedURLException urlのフォーマットが正しくない場合
	 */
	private static String getHost(String url) throws MalformedURLException {
		return new URL(url.toLowerCase()).getHost();
	}

}
