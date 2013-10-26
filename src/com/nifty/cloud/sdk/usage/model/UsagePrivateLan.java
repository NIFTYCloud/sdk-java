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
 *  API Version: 1.15
 *  Date: 2013-06-28 17:00:00
 * 
 */
package com.nifty.cloud.sdk.usage.model;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * プライベートLAN情報クラス。<br />
 * このクラスはプライベートLAN情報を格納します。
 */
public class UsagePrivateLan {

	/** プライベートLAN情報 */
	@XStreamAlias("privateLan")
	private UsageDetail privateLan;

	/**
	 * プライベートLAN情報を取得します。
	 * 
	 * @return プライベートLAN情報
	 */
	public UsageDetail getPrivateLan() {
		return privateLan;
	}

	/**
	 * プライベートLAN情報設定します。
	 * 
	 * @param privateLan プライベートLAN情報
	 */
	public void setPrivateLan(UsageDetail privateLan) {
		this.privateLan = privateLan;
	}

	/**
	 * プライベートLAN情報を設定し、自オブジェクトを返します。
	 * 
	 * @param privateLan プライベートLAN情報
	 * @return 自オブジェクト
	 */
	public UsagePrivateLan withPrivateLan(UsageDetail privateLan) {
		setPrivateLan(privateLan);
		return this;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("[privateLan=");
		builder.append(privateLan);
		builder.append("]");
		return builder.toString();
	}
}
