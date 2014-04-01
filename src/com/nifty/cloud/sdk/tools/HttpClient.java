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
 *  API Version: 1.17
 *  Date: 2014-02-20 17:00:00
 * 
 */
package com.nifty.cloud.sdk.tools;

import java.io.IOException;

import org.apache.commons.httpclient.DefaultHttpMethodRetryHandler;
import org.apache.commons.httpclient.HttpMethod;
import org.apache.commons.httpclient.ProxyHost;
import org.apache.commons.httpclient.UsernamePasswordCredentials;
import org.apache.commons.httpclient.auth.AuthScope;
import org.apache.commons.httpclient.params.HttpMethodParams;

import com.nifty.cloud.sdk.ClientConfiguration;
import com.nifty.cloud.sdk.Const;

/**
 *　HTTPクライアントクラス。<br />
 *　HTTPクライアント情報を格納します。
 */
public class HttpClient extends org.apache.commons.httpclient.HttpClient {

	/** Commons HTTP　Client  	 */
	private static HttpClient httpClient = new HttpClient();
	
	/**	初期化用フラグ  	 */
	private static String initialize = "";
	

	private HttpClient() {
		super();
	}
	

	/**
	 *　HTTPクライアントクラスを取得します。
	 * 常に同一オブジェクトを取得します。
	 * 
	 * @param config - 設定情報
	 * @return  HTTPクライアント
	 */
	public static HttpClient getInstance(ClientConfiguration config) {
		
		if (initialize.isEmpty()) {
			synchronized (initialize) {

				if(config.getProxyHost() != null && !config.getProxyHost().isEmpty()) {
					ProxyHost proxyHost = (config.getProxyPort()!= 0) ? 
											new ProxyHost(config.getProxyHost(), config.getProxyPort()) :
											new ProxyHost(config.getProxyHost());
					httpClient.getHostConfiguration().setProxyHost(proxyHost);

					if (config.getProxyUsername() != null && !config.getProxyUsername().isEmpty() && 
						config.getProxyPassword() != null && !config.getProxyPassword().isEmpty()) {
						httpClient.getState().setProxyCredentials(
								new AuthScope(config.getProxyHost(), config.getProxyPort()),
								new UsernamePasswordCredentials(config.getProxyUsername(), config.getProxyPassword()));
					}
				}
				
				httpClient.getParams().setParameter(HttpMethodParams.RETRY_HANDLER, 
					new DefaultHttpMethodRetryHandler(config.getMaxErrorRetry(), false) {
						@Override
						public boolean retryMethod(HttpMethod method, IOException exception, int executionCount) {
							boolean retry = super.retryMethod(method, exception, executionCount);
							if (retry) {
								try {
									Thread.sleep(300);
								} catch (InterruptedException e) {}
							}
							return retry;
						}
					});
				
				String userAgent = config.getUserAgent();
				if(userAgent != null && !userAgent.isEmpty()){
					httpClient.getParams().setParameter(
							HttpMethodParams.USER_AGENT,
							userAgent.equals(Const.DEFAULT_USER_AGENT) ? userAgent + "/" + Const.VERSION : userAgent);
				}

				httpClient.getHttpConnectionManager().getParams().setMaxTotalConnections(config.getMaxConnections());
				httpClient.getHttpConnectionManager().getParams().setConnectionTimeout(config.getConnectionTimeout() * 1000);
				httpClient.getHttpConnectionManager().getParams().setSoTimeout(config.getSocketTimeout() * 1000);

				
				int [] bufferSizes = config.getSocketBufferSizeHints();
				if (bufferSizes[0] != 0) {
					httpClient.getHttpConnectionManager().getParams().setSendBufferSize(bufferSizes[0]);
				}
				if (bufferSizes[1] != 0) {
					httpClient.getHttpConnectionManager().getParams().setSendBufferSize(bufferSizes[1]);
				}
				
				initialize = "initialized";
			}
		}
		
		return httpClient;
	}
}
