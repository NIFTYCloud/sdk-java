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

import com.nifty.cloud.sdk.Request;
import com.nifty.cloud.sdk.annotation.Action;
import com.nifty.cloud.sdk.annotation.Query;

/**
 * DescribeServiceStatusリクエストクラス。<br />
 * このクラスはDescribeServiceStatusへのリクエストを構築します。
 */
@Action("DescribeServiceStatus")

public class DescribeServiceStatusRequest implements Request {

	/** 取得開始日 */
	private String fromDate;

	/** 取得終了日 */
	private String toDate;

	/**
	 * 取得開始日を取得します。
	 * 
	 * @return 取得開始日
	 */
	@Query(name="FromDate")
	public String getFromDate() {
		return fromDate;
	}

	/**
	 * 取得開始日を設定します。
	 * 
	 * @param fromDate 取得開始日
	 */
	public void setFromDate(String fromDate) {
		this.fromDate = fromDate;
	}

	/**
	 * 取得開始日を設定し、自オブジェクトを返します。
	 * 
	 * @param fromDate 取得開始日
	 * @return 自オブジェクト
	 */
	public DescribeServiceStatusRequest withFromDate(String fromDate) {
		setFromDate(fromDate);
		return this;
	}

	/**
	 * 取得終了日を取得します。
	 * 
	 * @return 取得終了日
	 */
	@Query(name="ToDate")
	public String getToDate() {
		return toDate;
	}

	/**
	 * 取得終了日を設定します。
	 * 
	 * @param toDate 取得終了日
	 */
	public void setToDate(String toDate) {
		this.toDate = toDate;
	}

	/**
	 * 取得終了日を設定し、自オブジェクトを返します。
	 * 
	 * @param toDate 取得終了日
	 * @return 自オブジェクト
	 */
	public DescribeServiceStatusRequest withToDate(String toDate) {
		setToDate(toDate);
		return this;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("[fromDate=");
		builder.append(fromDate);
		builder.append(", toDate=");
		builder.append(toDate);
		builder.append("]");
		return builder.toString();
	}
}
