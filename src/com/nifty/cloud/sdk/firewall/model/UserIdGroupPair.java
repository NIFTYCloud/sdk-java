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
package com.nifty.cloud.sdk.firewall.model;

import com.nifty.cloud.sdk.annotation.Query;

/**
 * 許可ファイアウォールグループクラス。<br />
 * このクラスは許可ファイアウォールグループ情報を格納します。
 */
public class UserIdGroupPair {

	private String userId;

	/** 許可するファイアウォールグループ名 */
	private String groupName;

	/**
	 * userIdを取得します。
	 * @return userId
	 */
	@Query(name = "UserId")
	public String getUserId() {
		return userId;
	}

	/**
	 * userIdを設定します。
	 * @param userId
	 */
	public void settUserId(String userId) {
		this.userId = userId;
	}

	/**
	 * userIdを設定し、自オブジェクトを返します。
	 * @param userId
	 * @return 自オブジェクト
	 */
	public UserIdGroupPair withtUserId(String userId) {
		this.userId = userId;
		return this;
	}

	/**
	 * 許可するファイアウォールグループ名を取得します。
	 *
	 * @return 許可するファイアウォールグループ名
	 */
	@Query(name = "GroupName")
	public String getGroupName() {
		return groupName;
	}

	/**
	 * 許可するファイアウォールグループ名を設定します。
	 *
	 * @param groupName 許可するファイアウォールグループ名
	 */
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	/**
	 * 許可するファイアウォールグループ名を設定し、自オブジェクトを返します。
	 *
	 * @param groupName 許可するファイアウォールグループ名
	 * @return 自オブジェクト
	 */
	public UserIdGroupPair withGroupName(String groupName) {
		this.groupName = groupName;
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
		builder.append("[userId=");
		builder.append(userId);
		builder.append(", groupName=");
		builder.append(groupName);
		builder.append("]");
		return builder.toString();
	}
}
