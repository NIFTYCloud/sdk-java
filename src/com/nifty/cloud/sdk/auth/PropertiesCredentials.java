/******************************************************************************* 
 *  Copyright 2012 NIFTY Corporation All Rights Reserved.
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
 *  API Version: 1.12
 *  Date: 2012-12-21 17:00:00
 * 
 */
package com.nifty.cloud.sdk.auth;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * 認証情報をプロパティファイルに設定した際に使用します。
 * プロパティファイルのフォーマットは<br />
 * accessKey=AccessKeyId<br />
 * secretKey=SecretKey<br />
 * とします。
 */
public class PropertiesCredentials implements Credentials {

	/** AccessKeyId	*/
	private String accessKeyId;

	/** SecretKey */
	private String secretKey;

	/**
	 * ファイルを指定して、認証情報の構築します。
	 * 
	 * @param file プロパティファイル
	 * @throws IOException プロパティファイルへのアクセスがエラーとなった場合
	 */
	public PropertiesCredentials(File file) throws IOException {
        this(new FileInputStream(file));
	}

	/**
	 * 入力ストリームを指定して、認証情報の構築します。
	 * 
	 * @param is 入力ストリーム
	 * @throws IOException プロパティファイルへのアクセスがエラーとなった場合
	 */
	public PropertiesCredentials(InputStream is) throws IOException {
		Properties props = new Properties();
		try {
			props.load(is);
		} finally {
			if (is != null) {
				try {is.close();} catch(Exception e) {}
			}
		}
		
		accessKeyId = props.getProperty("accessKey");
		secretKey   = props.getProperty("secretKey");
		
		if (accessKeyId == null || accessKeyId.isEmpty() ||
			secretKey   == null || secretKey.isEmpty()) {
			throw new IllegalArgumentException("Not exists access key id and secret key Credential file");
		}
	}

	
	/* (non-Javadoc)
	 * @see com.nifty.cloud.sdk.auth.Credentials#getAccessKeyId()
	 */
	@Override
	public String getAccessKeyId() {
		return accessKeyId;
	}

	/* (non-Javadoc)
	 * @see com.nifty.cloud.sdk.auth.Credentials#getSecretKey()
	 */
	@Override
	public String getSecretKey() {
		return secretKey;
	}

}
