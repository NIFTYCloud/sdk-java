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

import com.nifty.cloud.sdk.Request;
import com.nifty.cloud.sdk.annotation.Action;
import com.nifty.cloud.sdk.annotation.Query;

/**
 * NiftyDescribePerformanceChartRequestクラス。<br />
 * このクラスNiftyDescribePerformanceChartRequest情報を格納します。
 *
 */
@Action("NiftyDescribePerformanceChart")
public class NiftyDescribePerformanceChartRequest  implements Request{

	/** 機能名 */
	private String functionName;

	/** 対象リソース名 */
	private List<String> resourceNames;

	/** チャート出力開始日 */
	private String fromDate;

	/** チャート出力終了日 */
	private String toDate;

	/** チャート出力項目 */
	private List<String> dataTypes;

	/** チャート出力タイプ */
	private String valueType;

	/**
	 * デフォルトコンストラクタ。
	 */
	public NiftyDescribePerformanceChartRequest() {
	}

	/**
	 * 機能名,対象リソース名を指定し、NiftyDescribePerformanceChartRequestを構築します。
	 *
	 * @param functionName 機能名
	 * @param resourceNames リソース名のリスト
	 */
	public NiftyDescribePerformanceChartRequest(String functionName, List<String> resourceNames) {
		this.functionName = functionName;
		this.resourceNames = resourceNames;
	}

	/**
	 * 機能名を取得します。
	 *
	 * @return 機能名
	 */
	@Query(name = "FunctionName", require=true)
	public String getFunctionName() {
		return functionName;
	}

	/**
	 * 機能名を設定します。
	 *
	 * @param functionName 機能名
	 */
	public void setFunctionName(String functionName) {
		this.functionName = functionName;
	}

	/**
	 * 機能名を設定し、自オブジェクトを返します。
	 *
	 * @param functionName 機能名
	 * @return 自オブジェクト
	 */
	public NiftyDescribePerformanceChartRequest withFunctionName(String functionName) {
		setFunctionName(functionName);
		return this;
	}

	/**
	 * 対象リソース名を取得します。
	 * @return 対象リソース名リスト
	 */
	@Query(name="ResourceName", require=true, reverseSequence=true)
	public List<String> getResourceNames() {
		return resourceNames;
	}

	/**
	 * 対象リソース名を設定します。
	 *
	 * @param resourceNames 対象リソース名リスト
	 */
	public void setResourceNames(List<String> resourceNames) {
		this.resourceNames = resourceNames;
	}

	/**
	 * 対象リソース名の配列を設定し、自オブジェクトを返します。
	 *
	 * @param resourceNames 対象リソース名の配列
	 * @return 自オブジェクト
	 */
	public NiftyDescribePerformanceChartRequest withResourceNames(String... resourceNames) {
		if (this.resourceNames == null) this.resourceNames = new ArrayList<String>();
		for (String resourceName: resourceNames) {
			getResourceNames().add(resourceName);
		}
		return this;
	}

	/**
	 * 対象リソース名リストを設定し、自オブジェクトを返します。
	 *
	 * @param resourceNames 対象リソース名リスト
	 * @return 自オブジェクト
	 */
	public NiftyDescribePerformanceChartRequest withResourceNames(Collection<String> resourceNames) {
		if (this.resourceNames == null) this.resourceNames = new ArrayList<String>();
		if (resourceNames != null) {
			getResourceNames().addAll(resourceNames);
		}
		return this;
	}

	/**
	 * チャート出力開始日を取得します。
	 *
	 * @return チャート出力開始日
	 */
	@Query(name = "FromDate")
	public String getFromDate() {
		return fromDate;
	}

	/**
	 * チャート出力開始日を設定します。
	 *
	 * @param fromDate チャート出力開始日
	 */
	public void setFromDate(String fromDate) {
		this.fromDate = fromDate;
	}

	/**
	 * チャート出力開始日を設定し、自オブジェクトを返します。
	 *
	 * @param fromDate チャート出力開始日
	 * @return 自オブジェクト
	 */
	public NiftyDescribePerformanceChartRequest withFromDate(String fromDate) {
		setFromDate(fromDate);
		return this;
	}

	/**
	 * チャート出力終了日を取得します。
	 *
	 * @return チャート出力終了日
	 */
	@Query(name = "ToDate")
	public String getToDate() {
		return toDate;
	}

	/**
	 * チャート出力終了日を設定します。
	 *
	 * @param toDate チャート出力終了日
	 */
	public void setToDate(String toDate) {
		this.toDate = toDate;
	}

	/**
	 * チャート出力終了日を設定し、自オブジェクトを返します。
	 *
	 * @param toDate チャート出力終了日
	 * @return 自オブジェクト
	 */
	public NiftyDescribePerformanceChartRequest withToDate(String toDate) {
		setToDate(toDate);
		return this;
	}

	/**
	 * チャート出力項目リストを取得します。
	 *
	 * @return チャート出力項目リスト
	 */
	@Query(name = "DataType", reverseSequence=true)
	public List<String> getDataTypes() {
		return dataTypes;
	}

	/**
	 * チャート出力項目リストを設定します。
	 *
	 * @param dataTypes チャート出力項目リスト
	 */
	public void setDataTypes(List<String> dataTypes) {
		this.dataTypes = dataTypes;
	}

	/**
	 * チャート出力項目の配列を設定し、自オブジェクトを返します。
	 *
	 * @param dataTypes チャート出力項目の配列
	 * @return 自オブジェクト
	 */
	public NiftyDescribePerformanceChartRequest withDataTypes(String... dataTypes) {
		if (this.dataTypes == null) this.dataTypes = new ArrayList<String>();
		for (String dataType: dataTypes) {
			getDataTypes().add(dataType);
		}
		return this;
	}

	/**
	 * チャート出力項目リストを設定し、自オブジェクトを返します。
	 *
	 * @param dataTypes チャート出力項目リスト
	 * @return 自オブジェクト
	 */
	public NiftyDescribePerformanceChartRequest withDataTypes(Collection<String> dataTypes) {
		if (this.dataTypes == null) this.dataTypes = new ArrayList<String>();
		if (dataTypes != null) {
			getDataTypes().addAll(dataTypes);
		}
		return this;
	}

	/**
	 * チャート出力タイプを取得します。
	 *
	 * @return チャート出力タイプ
	 */
	@Query(name = "ValueType")
	public String getValueType() {
		return valueType;
	}

	/**
	 * チャート出力タイプを設定します。
	 *
	 * @param valueType チャート出力タイプ
	 */
	public void setValueType(String valueType) {
		this.valueType = valueType;
	}

	/**
	 * チャート出力タイプを設定し、自オブジェクトを返します。
	 *
	 * @param valueType チャート出力タイプ
	 * @return 自オブジェクト
	 */
	public NiftyDescribePerformanceChartRequest withValueType(String valueType) {
		setValueType(valueType);
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
		builder.append("[functionName=");
		builder.append(functionName);
		builder.append(", resourceNames=");
		builder.append(resourceNames);
		builder.append(", fromDate=");
		builder.append(fromDate);
		builder.append(", toDate=");
		builder.append(toDate);
		builder.append(", dataTypes=");
		builder.append(dataTypes);
		builder.append(", valueType=");
		builder.append(valueType);
		builder.append("]");
		return builder.toString();
	}
}