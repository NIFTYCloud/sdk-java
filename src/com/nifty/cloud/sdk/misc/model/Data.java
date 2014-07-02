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
package com.nifty.cloud.sdk.misc.model;

/**
 * チャート結果情報クラス。<br />
 * このクラスはチャート結果情報を格納します。
 */
public class Data {

	/** チャート出力日時 */
	private String dateTime;

	/** チャート出力結果の値 */
	private Integer value;

	/**
	 * チャート出力日時を取得します。
	 *
	 * @return チャート出力日時
	 */
	public String getDateTime() {
		return dateTime;
	}
	/**
	 * チャート出力日時を設定します。
	 *
	 * @param dateTime チャート出力日時
	 */
	public void setDateTime(String dateTime) {
		this.dateTime = dateTime;
	}
	/**
	 * チャート出力日時を設定し、自オブジェクトを返します。
	 *
	 * @param dateTime チャート出力日時
	 * @return 自オブジェクト
	 */
	public Data withDateTime(String dateTime) {
		setDateTime(dateTime);
		return this;
	}

	/**
	 * チャート出力結果の値を取得します。
	 *
	 * @return チャート出力結果の値
	 */
	public Integer getValue() {
		return value;
	}
	/**
	 * チャート出力結果の値を設定します。
	 *
	 * @param value チャート出力結果の値
	 */
	public void setValue(Integer value) {
		this.value = value;
	}
	/**
	 * チャート出力結果の値を設定し、自オブジェクトを返します。
	 *
	 * @param value チャート出力結果の値
	 * @return 自オブジェクト
	 */
	public Data withValue(Integer value) {
		setValue(value);
		return this;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("[dateTime=");
		builder.append(dateTime);
		builder.append(", value=");
		builder.append(value);
		builder.append("]");
		return builder.toString();
	}
}