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
package com.nifty.cloud.sdk.firewall.model;

import java.util.ArrayList;
import java.util.List;

import com.nifty.cloud.sdk.annotation.Query;

/**
 * 絞り込み情報クラス。<br />
 * このクラスは絞り込み情報を格納します。
 *
 */
public class Filter {

	/** 絞り込み条件の項目名 */
	private String name;

	/** 絞り込み条件の値リスト */
	private List<String> values;

	/**
	 * 絞り込み条件の項目名を取得します。
	 *
	 * @return 絞り込み条件の項目名
	 */
	@Query(name = "Name")
	public String getName() {
		return name;
	}

	/**
	 * 絞り込み条件の項目名を設定します。
	 *
	 * @param name 絞り込み条件の項目名
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 絞り込み条件の項目名を設定し、自オブジェクトを返します。
	 *
	 * @param name 絞り込み条件の項目名
	 * @return 自オブジェクト
	 */
	public Filter withName(String name) {
		this.name = name;
		return this;
	}

	/**
	 * 絞り込み条件の値リストを取得します。
	 *
	 * @return values 絞り込み条件値のリスト
	 */
	@Query(name = "Value")
	public List<String> getValues() {
		return values;
	}

	/**
	 * 絞り込み条件の値リストを設定します。
	 *
	 * @param values 絞り込み条件の値リスト
	 */
	public void setValues(List<String> values) {
		this.values = values;
	}

	/**
	 * 絞り込み条件の値の配列を設定し、自オブジェクトを返します。
	 *
	 * @param values 絞り込み条件の値の配列
	 * @return 自オブジェクト
	 */
	public Filter withValues(String... values) {
		if (this.values == null)
			this.values = new ArrayList<String>();
		for (String value : values) {
			getValues().add(value);
		}
		return this;
	}

	/**
	 * 絞り込み条件の値リストを設定し、自オブジェクトを返します。
	 *
	 * @param values 絞り込み条件の値リスト
	 * @return 自オブジェクト
	 */
	public Filter withValues(List<String> values) {
		if (this.values == null)
			this.values = new ArrayList<String>();
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
		builder.append("[namee=");
		builder.append(name);
		builder.append(", values=");
		builder.append(values);
		builder.append("]");
		return builder.toString();
	}
}