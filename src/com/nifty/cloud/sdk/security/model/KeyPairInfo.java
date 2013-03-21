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
 *  API Version: 1.11
 *  Date: 2011-08-25 09:46:38
 * 
 */
package com.nifty.cloud.sdk.security.model;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * SSHキーの情報クラス。<br />
 * このクラスはSSHキーの情報を格納します。
 */
public class KeyPairInfo {
	
	/** SSHキー名 */
	@XStreamAlias("keyName")	
	private String keyName;
	
	/** SHA-1エンコードキー */
	@XStreamAlias("keyFingerprint")	
	private String keyFingerprint;
	
	
	/**
	 * SSHキー名を取得します。
	 * 
	 * @return SSHキー名
	 */
	public String getKeyName() {
		return keyName;
	}
	/**
	 * SSHキー名を設定します。
	 * 
	 * @param keyName SSHキー名
	 */
	public void setKeyName(String keyName) {
		this.keyName = keyName;
	}
	/**
	 * SSHキー名を設定し、自オブジェクトを返します。
	 *
	 * @param keyName SSHキー名
	 * @return 自オブジェクト	 
	 */
	public KeyPairInfo withKeyName(String keyName) {
		setKeyName(keyName);
		return this;
	}
	
	/**
	 * SHA-1エンコードキーを取得します。
	 * 
	 * @return SHA-1エンコードキー
	 */
	public String getKeyFingerprint() {
		return keyFingerprint;
	}
	/**
	 * SHA-1エンコードキーを設定します。
	 * 
	 * @param keyFingerprint SHA-1エンコードキー
	 */
	public void setKeyFingerprint(String keyFingerprint) {
		this.keyFingerprint = keyFingerprint;
	}
	/**
	 * SHA-1エンコードキーを設定し、自オブジェクトを返します。
	 *
	 * @param keyFingerprint SHA-1エンコードキー
	 * @return 自オブジェクト	 
	 */
	public KeyPairInfo withKeyFingerprint(String keyFingerprint) {
		setKeyFingerprint(keyFingerprint);
		return this;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("[keyName=");
		builder.append(keyName);
		builder.append(", keyFingerprint=");
		builder.append(keyFingerprint);
		builder.append("]");
		return builder.toString();
	}

}
