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
package com.nifty.cloud.sdk.usage.model;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * マルチアカウント利用情報クラス。<br />
 * このクラスはマルチアカウント利用情報を格納します。
 */
public class UsageMultiAccount {

	/** マルチアカウント利用情報 */
	@XStreamAlias("multiAccount")
	private UsageDetail multiAccount;

	/**
	 * マルチアカウント利用情報を取得します。
	 * 
	 * @return マルチアカウント利用情報
	 */
	public UsageDetail getMultiAccount() {
		return multiAccount;
	}

	/**
	 * マルチアカウント利用情報を設定します。
	 * 
	 * @param multiAccount マルチアカウント利用情報
	 */
	public void setMultiAccount(UsageDetail multiAccount) {
		this.multiAccount = multiAccount;
	}

	/**
	 * マルチアカウント利用情報を設定し、自オブジェクトを返します。
	 * 
	 * @param multiAccount マルチアカウント利用情報
	 * @return 自オブジェクト
	 */
	public UsageMultiAccount withMultiAccount(UsageDetail multiAccount) {
		setMultiAccount(multiAccount);
		return this;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("[multiAccount=");
		builder.append(multiAccount);
		builder.append("]");
		return builder.toString();
	}
}
