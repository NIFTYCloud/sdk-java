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
package com.nifty.cloud.sdk.usage.model;

import com.nifty.cloud.sdk.Request;
import com.nifty.cloud.sdk.annotation.Action;
import com.nifty.cloud.sdk.annotation.Query;

/**
 * DescribeUserActivitiesリクエストクラス。<br />
 * このクラスはDescribeUserActivitiesへのリクエストを構築します。
 */
@Action("DescribeUserActivities")
public class DescribeUserActivitiesRequest implements Request {

	/** 取得対象年月 */
	private String yearMonth;

	/**
	 * 取得対象年月を取得します。
	 * 
	 * @return 取得対象年月
	 */
	@Query(name="YearMonth")
	public String getYearMonth() {
		return yearMonth;
	}

	/**
	 * 取得対象年月を設定します。
	 * 
	 * @param yearMonth 取得対象年月
	 */
	public void setYearMonth(String yearMonth) {
		this.yearMonth = yearMonth;
	}

	/**
	 * 取得対象年月を設定し、自オブジェクトを返します。
	 * 
	 * @param yearMonth 取得対象年月
	 * @return 自オブジェクト
	 */
	public DescribeUserActivitiesRequest withYearMonth(String yearMonth) {
		setYearMonth(yearMonth);
		return this;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("[yearMonth=");
		builder.append(yearMonth);
		builder.append("]");
		return builder.toString();
	}
}
