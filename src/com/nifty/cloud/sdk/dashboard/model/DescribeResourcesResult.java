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

import com.nifty.cloud.sdk.Result;
import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * DescribeResources処理結果クラス。<br />
 * このクラスはDescribeResourcesのレスポンスを格納します。
 */
@XStreamAlias("DescribeResourcesResponse")
public class DescribeResourcesResult extends Result {

	/** リクエスト識別子 */
	@XStreamAlias("requestId")
	private String requestId; 

	/** リソース情報 */
	@XStreamAlias("resourceInfo")
	private Resources resource;

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
	public DescribeResourcesResult withRequestId(String requestId) {
		setRequestId(requestId);
		return this;
	}

	/**
	 * リソース情報を取得します。
	 * 
	 * @return リソース情報
	 */
	public Resources getResource() {
		return resource;
	}

	/**
	 * リソース情報を設定します。
	 * 
	 * @param resource リソース情報
	 */
	public void setResource(Resources resource) {
		this.resource = resource;
	}

	/**
	 * リソース情報を設定し、自オブジェクトを返します。
	 * 
	 * @param resource リソース情報
	 * @return 自オブジェクト
	 */
	public DescribeResourcesResult withResource(Resources resource) {
		setResource(resource);
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
		builder.append(", resource=");
		builder.append(resource);
		builder.append("]");
		return builder.toString();
	}
}
