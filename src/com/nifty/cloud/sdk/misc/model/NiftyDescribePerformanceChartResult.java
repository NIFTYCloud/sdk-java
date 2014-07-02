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

import com.nifty.cloud.sdk.Result;
import com.nifty.cloud.sdk.misc.model.transform.PerformanceChartSetConverter;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamConverter;


/**
 * NiftyDescribePerformanceChart処理結果クラス。<br />
 * このクラスはNiftyDescribePerformanceChartのレスポンスを格納します。
 */
@XStreamAlias("NiftyDescribePerformanceChartResponse")
public class NiftyDescribePerformanceChartResult extends Result {

	/** リクエスト識別子 */
	@XStreamAlias("requestId")
	private String requestId;

	/** チャート対象の機能名 */
	@XStreamAlias("functionName")
	private String functionName;

	/** チャート対象の出力タイプ */
	@XStreamAlias("valueType")
	private String valueType;

	/** チャート情報 */
	@XStreamAlias("performanceChartSet")
	@XStreamConverter(PerformanceChartSetConverter.class)
	private List<PerformanceChart> performanceCharts;

	/**
	 * リクエスト識別子を取得します。
	 *
	 * @return リクエスト識別子
	 */
	public String getRequestId() {
		return requestId;
	}
	/**
	 * リクエスト識別子を設定します。
	 *
	 * @param requestId リクエスト識別子
	 */
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}
	/**
	 * リクエスト識別子を設定し、自オブジェクトを返します。
	 *
	 * @param requestId リクエスト識別子
	 * @return 自オブジェクト
	 */
	public NiftyDescribePerformanceChartResult withRequestId(String requestId) {
		setRequestId(requestId);
		return this;
	}

	/**
	 * チャート対象の機能名を取得します。
	 *
	 * @return チャート対象の機能名
	 */
	public String getFunctionName() {
		return functionName;
	}
	/**
	 * チャート対象の機能名を設定します。
	 *
	 * @param functionName チャート対象の機能名
	 */
	public void setFunctionName(String functionName) {
		this.functionName = functionName;
	}
	/**
	 * チャート対象の機能名を設定し、自オブジェクトを返します。
	 *
	 * @param functionName チャート対象の機能名
	 * @return 自オブジェクト
	 */
	public NiftyDescribePerformanceChartResult withFunctionName(String functionName) {
		setFunctionName(functionName);
		return this;
	}

	/**
	 * チャート対象の出力タイプを取得します。
	 *
	 * @return チャート対象の出力タイプ
	 */
	public String getValueType() {
		return valueType;
	}
	/**
	 * チャート対象の出力タイプを設定します。
	 *
	 * @param valueType チャート対象の出力タイプ
	 */
	public void setValueType(String valueType) {
		this.valueType = valueType;
	}
	/**
	 * チャート対象の出力タイプを設定し、自オブジェクトを返します。
	 *
	 * @param valueType チャート対象の出力タイプ
	 * @return 自オブジェクト
	 */
	public NiftyDescribePerformanceChartResult withValueType(String valueType) {
		setValueType(valueType);
		return this;
	}

	/**
	 * チャート情報リストを取得します。
	 * @return チャート情報IDリスト
	 */
	public List<PerformanceChart> getPerformanceCharts() {
		return performanceCharts;
	}
	/**
	 * チャート情報リストを設定します。
	 * @param performanceCharts チャート情報リスト
	 */
	public void setPerformanceCharts(List<PerformanceChart> performanceCharts) {
		this.performanceCharts = performanceCharts;
	}
	/**
	 * チャート情報の配列を設定し、自オブジェクトを返します。
	 * @param performanceCharts チャート情報の配列
	 * @return 自オブジェクト
	 */
	public NiftyDescribePerformanceChartResult withPerformanceCharts(PerformanceChart... performanceCharts) {
		if (this.performanceCharts == null) this.performanceCharts = new ArrayList<PerformanceChart>();
		for (PerformanceChart performanceChart: performanceCharts) {
			getPerformanceCharts().add(performanceChart);
		}
		return this;
	}
	/**
	 * チャート情報リストを設定し、自オブジェクトを返します。
	 * @param performanceCharts チャート情報リスト
	 * @return 自オブジェクト
	 */
	public NiftyDescribePerformanceChartResult withPerformanceCharts(Collection<PerformanceChart> performanceCharts) {
		if (this.performanceCharts == null) this.performanceCharts = new ArrayList<PerformanceChart>();
		if (performanceCharts != null) {
			getPerformanceCharts().addAll(performanceCharts);
		}
		return this;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("[requestId=");
		builder.append(requestId);
		builder.append("functionName=");
		builder.append(functionName);
		builder.append("valueType=");
		builder.append(valueType);
		builder.append("performanceCharts=");
		builder.append(performanceCharts);
		builder.append("]");
		return builder.toString();
	}
}