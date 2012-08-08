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
 *  Date: 2011-11-29 14:07:10
 * 
 */
package com.nifty.cloud.sdk.dashboard.model;

/**
 * サーバー情報クラス。<br />
 * このクラスはサーバー情報を格納します。
 */
public class ResourceInstance {

	/** サーバータイプ */
	private String type;

	/** サーバー数 */
	private Integer count;

	/**
	 * サーバータイプを取得します。
	 * 
	 * @return サーバータイプ
	 */
	public String getType() {
		return type;
	}

	/**
	 * サーバータイプを設定します。
	 * 
	 * @param type サーバータイプ
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * サーバータイプを設定し、自オブジェクトを返します。
	 * 
	 * @param type サーバータイプ
	 * @return 自オブジェクト
	 */
	public ResourceInstance withType(String type) {
		setType(type);
		return this;
	}

	/**
	 * サーバー数を取得します。
	 * 
	 * @return サーバー数
	 */
	public Integer getCount() {
		return count;
	}

	/**
	 * サーバー数を設定します。
	 * 
	 * @param count サーバー数
	 */
	public void setCount(Integer count) {
		this.count = count;
	}

	/**
	 * サーバー数を設定し、自オブジェクトを返します。
	 * 
	 * @param count サーバー数
	 * @return 自オブジェクト
	 */
	public ResourceInstance withCount(Integer count) {
		setCount(count);
		return this;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("[type=");
		builder.append(type);
		builder.append(", count=");
		builder.append(count);
		builder.append("]");
		return builder.toString();
	}
}
