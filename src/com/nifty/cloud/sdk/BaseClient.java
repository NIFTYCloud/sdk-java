/******************************************************************************* 
 *  Copyright 2011 NIFTY Corporation All Rights Reserved.
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
 *  API Version: 1.9
 *  Date: 2011-08-25 09:46:38
 * 
 */
package com.nifty.cloud.sdk;

import com.nifty.cloud.sdk.auth.Credentials;
import com.nifty.cloud.sdk.tools.NiftyCloudApiClient;

/**
 * カテゴリ別クライアント　抽象クラス。<br />
 * このクラスはカテゴリ別クライアント抽象クラスです。
 */
public abstract class BaseClient {

	/**
	 * NIFTY Cloud API クライアント。
	 */
	protected NiftyCloudApiClient client;
	

	/**
	 * 認証情報、クライアント設定を指定し、カテゴリ別クライアントを構築します。
	 * 
	 * @param credential 認証情報
	 * @param configuration クライアント設定
	 */
	public BaseClient(Credentials credential, ClientConfiguration configuration) {
		client = new NiftyCloudApiClient(credential, configuration);
	}

	/**
	 * エンドポイントの設定を行います。
	 * 
	 * @param endpoint エンドポイント
	 */
	public void setEndpoint(String endpoint) {
		client.setEndpoint(endpoint);
	}
}
