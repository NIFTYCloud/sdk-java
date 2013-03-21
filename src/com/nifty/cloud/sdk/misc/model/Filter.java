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
 *  Date: 2012-02-20 10:57:31
 *
 */
package com.nifty.cloud.sdk.misc.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.nifty.cloud.sdk.annotation.Query;

/**
 * Filterクラス。<br />
 * このクラスFilter情報を格納します。
 *
 */
public class Filter {

	private String name;

	private List<String> values;

	/**
	 * nameを取得します。
	 *
	 * @return name
	 */
	@Query(name = "Name")
	public String getName() {
		return name;
	}

	/**
	 * nameを設定します。
	 *
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * nameを設定し、自オブジェクトを返します。
	 *
	 * @param name
	 * @return 自オブジェクト
	 */
	public Filter withName(String name) {
		this.name = name;
		return this;
	}

	/**
	 *valuesを取得します。
	 *
	 * @return values
	 */
	@Query(name = "Value")
	public List<String> getValues() {
		return values;
	}

	/**
	 * valuesを設定します。
	 *
	 * @param values
	 */
	public void setValues(List<String> values) {
		this.values = values;
	}

	/**
	 * valuesの値の配列を設定し、自オブジェクトを返します。
	 *
	 * @param values
	 * @return 自オブジェクト
	 */
	public Filter withValues(String... values) {
		if (this.values == null) this.values = new ArrayList<String>();
		for (String value : values) {
			getValues().add(value);
		}
		return this;
	}

	/**
	 * valuesリストを設定し、自オブジェクトを返します。
	 *
	 * @param values
	 * @return 自オブジェクト
	 */
	public Filter withValues(Collection<String> values) {
		if (this.values == null) this.values = new ArrayList<String>();
		if (values != null) {
			getValues().addAll(values);
		}
		return this;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("[name=");
		builder.append(name);
		builder.append(", values=");
		builder.append(values);
		builder.append("]");
		return builder.toString();
	}
}