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
 * サーバーコピー情報クラス。<br />
 * このクラスはサーバーコピー情報を格納します。
 */
public class UsageCopy {

	/** サーバーコピー情報 */
	@XStreamAlias("instanceCopy")
	private UsageDetail instanceCopy;

	/**
	 * サーバーコピー情報を取得します。
	 * 
	 * @return サーバーコピー情報
	 */
	public UsageDetail getInstanceCopy() {
		return instanceCopy;
	}

	/**
	 * サーバーコピー情報を設定します。
	 * 
	 * @param instanceCopy サーバーコピー情報
	 */
	public void setInstanceCopy(UsageDetail instanceCopy) {
		this.instanceCopy = instanceCopy;
	}
	
	/**
	 * サーバーコピー情報を設定し、自オブジェクトを返します。
	 * 
	 * @param instanceCopy サーバーコピー情報
	 * @return 自オブジェクト
	 */
	public UsageCopy withInstanceCopy(UsageDetail instanceCopy) {
		setInstanceCopy(instanceCopy);
		return this;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("[instanceCopy=");
		builder.append(instanceCopy);
		builder.append("]");
		return builder.toString();
	}
}
