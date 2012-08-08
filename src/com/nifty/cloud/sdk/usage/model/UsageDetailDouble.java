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
package com.nifty.cloud.sdk.usage.model;

/**
 * 利用料金明細情報クラス。<br />
 * このクラスは利用料金明細情報を格納します。
 */
public class UsageDetailDouble {

	/** タイプ */
	private String type;

	/** 単位 */
	private String unit;

	/** 数量 */
	private Double value;

	/**
	 * タイプを取得します。
	 * 
	 * @return タイプ
	 */
	public String getType() {
		return type;
	}

	/**
	 * タイプを設定します。
	 * 
	 * @param type タイプ
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * タイプを設定し、自オブジェクトを返します。
	 * 
	 * @param type タイプ
	 * @return 自オブジェクト
	 */
	public UsageDetailDouble withType(String type) {
		setType(type);
		return this;
	}

	/**
	 * 単位を取得します。
	 * 
	 * @return 単位
	 */
	public String getUnit() {
		return unit;
	}

	/**
	 * 単位を設定します。
	 * 
	 * @param unit 単位
	 */
	public void setUnit(String unit) {
		this.unit = unit;
	}

	/**
	 * 単位を設定し、自オブジェクトを返します。
	 * 
	 * @param unit 単位
	 * @return 自オブジェクト
	 */
	public UsageDetailDouble withUnit(String unit) {
		setUnit(unit);
		return this;
	}

	/**
	 * 数量を取得します。
	 * 
	 * @return 数量
	 */
	public Double getValue() {
		return value;
	}

	/**
	 * 数量を設定します。
	 * 
	 * @param value 数量
	 */
	public void setValue(Double value) {
		this.value = value;
	}

	/**
	 * 数量を設定し、自オブジェクトを返します。
	 * 
	 * @param value 数量
	 * @return 自オブジェクト
	 */
	public UsageDetailDouble withValue(Double value) {
		setValue(value);
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
		builder.append(", unit=");
		builder.append(unit);
		builder.append(", value=");
		builder.append(value);
		builder.append("]");
		return builder.toString();
	}
}
