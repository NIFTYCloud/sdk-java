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

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * チャート情報クラス。<br />
 * このクラスはチャート情報を格納します。
 */
public class PerformanceChart {

	/** チャート情報のリソース名 */
	private String resourceName;

	/** チャート情報の項目 */
	private String dataType;

	/** チャート結果 */
	private List<Data> datas;

	/**
	 * チャート情報のリソース名を取得します。
	 *
	 * @return チャート情報のリソース名
	 */
	public String getResourceName() {
		return resourceName;
	}
	/**
	 * チャート情報のリソース名を設定します。
	 *
	 * @param resourceName チャート情報のリソース名
	 */
	public void setResourceName(String resourceName) {
		this.resourceName = resourceName;
	}
	/**
	 * チャート情報のリソース名を設定し、自オブジェクトを返します。
	 *
	 * @param resourceName チャート情報のリソース名
	 * @return 自オブジェクト
	 */
	public PerformanceChart withResourceName(String resourceName) {
		setResourceName(resourceName);
		return this;
	}

	/**
	 * チャート情報の項目を取得します。
	 *
	 *
	 * @return チャート情報の項目
	 */
	public String getDataType() {
		return dataType;
	}
	/**
	 * チャート情報の項目を設定します。
	 *
	 * @param dataType チャート情報の項目
	 */
	public void setDataType(String dataType) {
		this.dataType = dataType;
	}
	/**
	 * チャート情報の項目を設定し、自オブジェクトを返します。
	 *
	 * @param dataType チャート情報の項目
	 * @return 自オブジェクト
	 */
	public PerformanceChart withDataType(String dataType) {
		setDataType(dataType);
		return this;
	}


	/**
	 * チャート結果リストを取得します。
	 *
	 * @return チャート結果リスト
	 */
	public List<Data> getDatas() {
		return datas;
	}
	/**
	 * チャート結果リストを設定します。
	 *
	 * @param datas チャート結果リスト
	 */
	public void setDatas(List<Data> datas) {
		this.datas = datas;
	}
	/**
	 * チャート結果の配列を設定し、自オブジェクトを返します。
	 *
	 * @param datas チャート結果の配列
	 * @return 自オブジェクト
	 */
	public PerformanceChart withDatas(Data... datas) {
		if (this.datas == null) this.datas = new ArrayList<Data>();
		for (Data data: datas) {
			getDatas().add(data);
		}
		return this;
	}
	/**
	 * チャート結果リストを設定し、自オブジェクトを返します。
	 *
	 * @param datas チャート結果リスト
	 * @return 自オブジェクト
	 */
	public PerformanceChart withDatas(Collection<Data> datas) {
		if (this.datas == null) this.datas = new ArrayList<Data>();
		if (datas != null) {
			getDatas().addAll(datas);
		}
		return this;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("[resourceName=");
		builder.append(resourceName);
		builder.append(", dataType=");
		builder.append(dataType);
		builder.append(", datas=");
		builder.append(datas);
		builder.append("]");
		return builder.toString();
	}
}