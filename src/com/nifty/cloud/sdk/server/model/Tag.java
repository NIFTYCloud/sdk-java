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
package com.nifty.cloud.sdk.server.model;

/**
 * tag格納クラス。<br />
 * このクラスはtagを格納します。
 */
public class Tag {

	private String key;

	private String value;

	/**
	 * keyを取得します。
	 * @return key
	 */
	public String getKey() {
		return key;
	}
	/**
	 * keyを設定します。
	 * @param key
	 */
	public void setKey(String key) {
		this.key = key;
	}
	/**
	 * keyを設定し、自オブジェクトを返します。
	 * @param key
	 * @return 自オブジェクト
	 */
	public Tag withKey(String key) {
		setKey(key);
		return this;
	}

	/**
	 * valueを取得します。
	 * @return value
	 */
	public String getValue() {
		return value;
	}
	/**
	 * valueを設定します。
	 * @param value
	 */
	public void setValue(String value) {
		this.value = value;
	}
	/**
	 * valueを設定し、自オブジェクトを返します。
	 * @param value
	 * @return 自オブジェクト
	 */
	public Tag withValue(String value) {
		setValue(value);
		return this;
	}

}
