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
package com.nifty.cloud.sdk.firewall.model;

import com.nifty.cloud.sdk.Request;
import com.nifty.cloud.sdk.annotation.Action;
import com.nifty.cloud.sdk.annotation.Query;

/**
 * DescribeSecurityActivitiesリクエストクラス。<br />
 * このクラスはDescribeSecurityActivitiesへのリクエストを構築します。
 */
@Action("DescribeSecurityActivities")
public class DescribeSecurityActivitiesRequest implements Request {

	/** ファイアウォールグループ名 */
	private String groupName;

	/** 取得したいログの絞り込み条件（日） */
	private String activityDate;

	/** 取得したいログの絞り込み条件（件数） */
	private SecurityActivityRange range;

	/**
	 * デフォルトコンストラクタ。
	 */
	public DescribeSecurityActivitiesRequest() {
	}
	/**
	 * ファイアウォールグループ名を指定し、DescribeSecurityActivitiesRequestを構築します。
	 * @param groupName ファイアウォールグループ名
	 */
	public DescribeSecurityActivitiesRequest(String groupName) {
		this.groupName = groupName;
	}

	/**
	 * ファイアウォールグループ名を取得します。
	 *
	 * @return ファイアウォールグループ名
	 */
	@Query(name = "GroupName", require = true)
	public String getGroupName() {
		return groupName;
	}

	/**
	 * ファイアウォールグループ名を設定します。
	 *
	 * @param groupName ファイアウォールグループ名
	 */
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	/**
	 * ファイアウォールグループ名を設定し、自オブジェクトを返します。
	 *
	 * @param groupName ファイアウォールグループ名
	 * @return 自オブジェクト
	 */
	public DescribeSecurityActivitiesRequest withGroupName(String groupName) {
		setGroupName(groupName);
		return this;
	}

	/**
	 * 取得したいログの絞り込み条件（日）を取得します。
	 *
	 * @return 取得したいログの絞り込み条件（日）
	 */
	@Query(name = "ActivityDate")
	public String getActivityDate() {
		return activityDate;
	}

	/**
	 * 取得したいログの絞り込み条件（日）を設定します。
	 *
	 * @param activityDate 取得したいログの絞り込み条件（日）
	 */
	public void setActivityDate(String activityDate) {
		this.activityDate = activityDate;
	}

	/**
	 * 取得したいログの絞り込み条件（日）を設定し、自オブジェクトを返します。
	 *
	 * @param activityDate 取得したいログの絞り込み条件（日）
	 * @return 自オブジェクト
	 */
	public DescribeSecurityActivitiesRequest withActivityDate(
			String activityDate) {
		setActivityDate(activityDate);
		return this;
	}

	/**
	 * 取得したいログの絞り込み条件（件数）を取得します。
	 *
	 * @return 取得したいログの絞り込み条件（件数）
	 */
	@Query(name = "Range")
	public SecurityActivityRange getRange() {
		return range;
	}

	/**
	 * 取得したいログの絞り込み条件（件数）を設定します。
	 *
	 * @param range 取得したいログの絞り込み条件（件数）
	 */
	public void setRange(SecurityActivityRange range) {
		this.range = range;
	}

	/**
	 * 取得したいログの絞り込み条件（件数）を設定し、自オブジェクトを返します。
	 *
	 * @param range 取得したいログの絞り込み条件（件数）
	 * @return 自オブジェクト
	 */
	public DescribeSecurityActivitiesRequest withRange(
			SecurityActivityRange range) {
		setRange(range);
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
		builder.append("[groupName=");
		builder.append(groupName);
		builder.append(", activityDate=");
		builder.append(activityDate);
		builder.append(", range=");
		builder.append(range);
		builder.append("]");
		return builder.toString();
	}
}
