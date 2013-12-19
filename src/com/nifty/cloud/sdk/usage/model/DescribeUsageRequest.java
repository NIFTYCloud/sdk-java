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
 *  API Version: 1.16
 *  Date: 2013-10-18 17:00:00
 * 
 */
package com.nifty.cloud.sdk.usage.model;

import com.nifty.cloud.sdk.Request;
import com.nifty.cloud.sdk.annotation.Action;
import com.nifty.cloud.sdk.annotation.Query;

/**
 * DescribeUsageリクエストクラス。<br />
 * このクラスはDescribeUsageへのリクエストを構築します。
 */
@Action("DescribeUsage")
public class DescribeUsageRequest implements Request {

	/** 取得対象年月 */
	private String yearMonth;
	/** リージョン */
	private String region;

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
	public DescribeUsageRequest withYearMonth(String yearMonth) {
		setYearMonth(yearMonth);
		return this;
	}

	/**
	 * リージョンを取得します。
	 * @return リージョン
	 */
	@Query(name="Region")
	public String getRegion() {
		return region;
	}

	/**
	 * リージョンを設定します。
	 * @param region リージョン
	 */
	public void setRegion(String region) {
		this.region = region;
	}

	/**
	 * リージョンを設定し、自オブジェクトを返します。
	 * @param region リージョン
	 * @return 自オブジェクト
	 */
	public DescribeUsageRequest withRegion(String region) {
		setRegion(region);
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
		builder.append(", region=");
		builder.append(region);
		builder.append("]");
		return builder.toString();
	}
}
