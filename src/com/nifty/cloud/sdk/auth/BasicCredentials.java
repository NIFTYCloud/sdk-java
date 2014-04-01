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
package com.nifty.cloud.sdk.auth;

/**
 * 認証情報クラス。<br />
 * 認証情報を引数で指定する際に使用します。
 *
 */
public class BasicCredentials implements Credentials {

	/** AccessKeyId	*/
	private String accessKeyId;

	/** SecretKey */
	private String secretKey;
	
	/**
	 * AccessKeyId,SecretKeyを指定し認証情報を構築します。
	 * @param accessKeyId AccessKeyId
	 * @param secretKey SecretKey
	 */
	public BasicCredentials(String accessKeyId, String secretKey) {
		this.accessKeyId = accessKeyId;
		this.secretKey = secretKey;
	}
	
	/**
	 * @see com.nifty.cloud.sdk.auth.Credentials#getAccessKeyId()
	 */
	@Override
	public String getAccessKeyId() {
		return accessKeyId;
	}

	/**
	 * @see com.nifty.cloud.sdk.auth.Credentials#getSecretKey()
	 */
	@Override
	public String getSecretKey() {
		return secretKey;
	}

}
