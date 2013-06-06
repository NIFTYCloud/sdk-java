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
 *  API Version: 1.14
 *  Date: 2013-03-28 17:00:00
 * 
 */
package com.nifty.cloud.sdk;

/**
 * 処理結果　抽象クラス。<br />
 * NIFTY Cloud APIから受信した処理結果の抽象クラスです。
 *
 */
public abstract class Result {

	/** ユーザーエージェント	*/
	private String userAgent;
	
	/** エンドポイント	*/
	private String url;
	
	/** クエリ */
	private String queryString;
	
	/** HTTP リクエストヘッダ	*/
	private String requestHeader;
	
	/** HTTP レスポンスステータス	*/
	private int status;
	
	/** HTTP レスポンスステータステキスト	*/
	private String statusText;
	
	/** HTTP レスポンスヘッダ */
	private String reseponseHeader;
	
	/** レスポンスXML	*/
	private String responseXml;

	/** プロキシ情報	*/
	private String proxy;
	
	/**
	 * ユーザーエージェントを取得します。
	 * 
	 * @return ユーザーエージェント
	 */
	public String getUserAgent() {
		return userAgent;
	}
	/**
	 * ユーザーエージェントを設定します。
	 * 
	 * @param userAgent ユーザーエージェント
	 */
	public void setUserAgent(String userAgent) {
		this.userAgent = userAgent;
	}
	
	/**
	 * エンドポイントを取得します。
	 * 
	 * @return エンドポイント
	 */
	public String getUrl() {
		return url;
	}
	/**
	 * エンドポイントを設定します。
	 * 
	 * @param url エンドポイント
	 */
	public void setUrl(String url) {
		this.url = url;
	}

	/**
	 * クエリを取得します。
	 * 
	 * @return　クエリ
	 */
	public String getQueryString() {
		return queryString;
	}
	/**
	 * クエリを設定します。
	 * 
	 * @param queryString クエリ
	 */
	public void setQueryString(String queryString) {
		this.queryString = queryString;
	}

	/**
	 * HTTPリクエストヘッダを取得します。
	 * 
	 * @return HTTPリクエストヘッダ
	 */
	public String getRequestHeader() {
		return requestHeader;
	}
	/**
	 * HTTPリクエストヘッダを設定します。
	 * 
	 * @param requestHeader HTTPリクエストヘッダ
	 */
	public void setRequestHeader(String requestHeader) {
		this.requestHeader = requestHeader;
	}

	/**
	 * HTTPステータスを取得します。
	 * 
	 * @return HTTPステータス
	 */
	public int getStatus() {
		return status;
	}
	/**
	 * HTTPステータスを設定します。
	 * 
	 * @param status HTTPステータス
	 */
	public void setStatus(int status) {
		this.status = status;
	}

	/**
	 * HTTPステータステキストを取得します。
	 * 
	 * @return HTTPステータステキスト
	 */
	public String getStatusText() {
		return statusText;
	}
	/**
	 * HTTPステータステキストを設定します。
	 * 
	 * @param statusText HTTPステータステキスト
	 */
	public void setStatusText(String statusText) {
		this.statusText = statusText;
	}

	/**
	 * HTTPレスポンスヘッダを取得します。
	 * 
	 * @return HTTPレスポンスヘッダ
	 */
	public String getReseponseHeader() {
		return reseponseHeader;
	}
	/**
	 * HTTPレスポンスヘッダを設定します。
	 * 
	 * @param reseponseHeader HTTPレスポンスヘッダ
	 */
	public void setReseponseHeader(String reseponseHeader) {
		this.reseponseHeader = reseponseHeader;
	}

	/**
	 * レスポンスXMLを取得します。
	 * 
	 * @return レスポンスXML
	 */
	public String getResponseXml() {
		return responseXml;
	}
	/**
	 * レスポンスXMLを設定します。
	 * 
	 * @param responseXml レスポンスXML
	 */
	public void setResponseXml(String responseXml) {
		this.responseXml = responseXml;
	}

	/**
	 * プロキシ情報を取得します。
	 * 
	 * @return プロキシ情報
	 */
	public String getProxy() {
		return proxy;
	}
	/**
	 * プロキシ情報を設定します。
	 * 
	 * @param proxy プロキシ情報
	 */
	public void setProxy(String proxy) {
		this.proxy = proxy;
	}

}
