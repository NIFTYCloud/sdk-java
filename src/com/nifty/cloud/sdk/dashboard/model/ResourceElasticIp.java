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
 *  API Version: 1.18
 *  Date: 2014-05-23 17:00:00
 *
 */
package com.nifty.cloud.sdk.dashboard.model;

/**
 * 付替IPアドレス情報クラス。<br />
 * このクラスは付替IPアドレス情報を格納します。
 */
public class ResourceElasticIp {

	/** IPタイプ */
	private String type;

	/** 付替IPアドレス数 */
	private Integer count;

	/**
	 * IPタイプを取得します。
	 *
	 * @return IPタイプ
	 */
	public String getType() {
		return type;
	}

	/**
	 * IPタイプを設定します。
	 *
	 * @param type IPタイプ
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * IPタイプを設定し、自オブジェクトを返します。
	 *
	 * @param type IPタイプ
	 * @return 自オブジェクト
	 */
	public ResourceElasticIp withType(String type) {
		setType(type);
		return this;
	}

	/**
	 * 付替IPアドレス数を取得します。
	 *
	 * @return 付替IPアドレス数
	 */
	public Integer getCount() {
		return count;
	}

	/**
	 * 付替IPアドレス数を設定します。
	 *
	 * @param count 付替IPアドレス数
	 */
	public void setCount(Integer count) {
		this.count = count;
	}

	/**
	 * 付替IPアドレス数を設定し、自オブジェクトを返します。
	 *
	 * @param count 付替IPアドレス数
	 * @return 自オブジェクト
	 */
	public ResourceElasticIp withCount(Integer count) {
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
