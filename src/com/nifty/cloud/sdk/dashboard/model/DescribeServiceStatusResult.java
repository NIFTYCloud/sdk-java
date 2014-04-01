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
 *  API Version: 1.17
 *  Date: 2014-02-20 17:00:00
 * 
 */
package com.nifty.cloud.sdk.dashboard.model;

import java.util.ArrayList;
import java.util.List;

import com.nifty.cloud.sdk.Result;
import com.nifty.cloud.sdk.dashboard.model.transform.ServiceStatusSetConverter;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamConverter;

/**
 * DescribeServiceStatus処理結果クラス。<br />
 * このクラスはDescribeServiceStatusのレスポンスを格納します。
 */
@XStreamAlias("DescribeServiceStatusResponse")

public class DescribeServiceStatusResult extends Result {

	/** リクエスト識別子 */
	@XStreamAlias("requestId")
	private String requestId;

	/** サービスステータス情報リスト */
	@XStreamAlias("serviceStatusSet")
	@XStreamConverter(ServiceStatusSetConverter.class)
	private List<ServiceStatus> serviceStatuses;

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
	public DescribeServiceStatusResult withRequestId(String requestId) {
		setRequestId(requestId);
		return this;
	}

	/**
	 * サービスステータス情報リストを取得します。
	 * 
	 * @return サービスステータス情報リスト
	 */
	public List<ServiceStatus> getServiceStatuses() {
		return serviceStatuses;
	}

	/**
	 * サービスステータス情報リストを設定します。
	 * 
	 * @param serviceStatuses サービスステータス情報リスト
	 */
	public void setServiceStatuses(List<ServiceStatus> serviceStatuses) {
		this.serviceStatuses = serviceStatuses;
	}

	/**
	 * サービスステータス情報の配列を設定し、自オブジェクトを返します。
	 * 
	 * @param serviceStatuses サービスステータス情報の配列
	 * @return 自オブジェクト
	 */
	public DescribeServiceStatusResult withServiceStatuses(ServiceStatus... serviceStatuses) {
		if (this.serviceStatuses == null) this.serviceStatuses = new ArrayList<ServiceStatus>();
		for (ServiceStatus serviceStatus : serviceStatuses) {
			getServiceStatuses().add(serviceStatus);
		}
		return this;
	}

	/**
	 * サービスステータス情報リストを設定し、自オブジェクトを返します。
	 * 
	 * @param serviceStatuses サービスステータス情報リスト
	 * @return 自オブジェクト
	 */
	public DescribeServiceStatusResult withServiceStatuses(List<ServiceStatus> serviceStatuses) {
		if (this.serviceStatuses == null) this.serviceStatuses = new ArrayList<ServiceStatus>();
		if (serviceStatuses != null) {
			getServiceStatuses().addAll(serviceStatuses);
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
		builder.append(", serviceStatuses=");
		builder.append(serviceStatuses);
		builder.append("]");
		return builder.toString();
	}
}
