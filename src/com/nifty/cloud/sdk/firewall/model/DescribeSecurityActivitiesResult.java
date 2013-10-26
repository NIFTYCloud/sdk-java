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
 *  API Version: 1.15
 *  Date: 2013-06-28 17:00:00
 *
 */
package com.nifty.cloud.sdk.firewall.model;

import com.nifty.cloud.sdk.Result;
import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * DescribeSecurityActivities処理結果クラス。<br />
 * このクラスはDescribeSecurityActivitiesのレスポンスを格納します。
 */
@XStreamAlias("DescribeSecurityActivitiesResponse")
public class DescribeSecurityActivitiesResult extends Result {

	/** リクエスト識別子 */
	@XStreamAlias("requestId")
	private String requestId;

	/** ファイアウォールグループ名 */
	@XStreamAlias("GroupName")
	private String groupName;

	/** 指定範囲のログ情報 */
	@XStreamAlias("Log")
	private String log;

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
	public DescribeSecurityActivitiesResult withRequestId(String requestId) {
		setRequestId(requestId);
		return this;
	}

	/**
	 * ファイアウォールグループ名を取得します。
	 *
	 * @return ファイアウォールグループ名
	 */
	public String getGroupName() {
		return groupName;
	}

	/**
	 * ファイアウォールグループ名を設定します。
	 *
	 * @param groupName
	 *            ファイアウォールグループ名
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
	public DescribeSecurityActivitiesResult withGroupName(String groupName) {
		setGroupName(groupName);
		return this;
	}

	/**
	 * 指定範囲のログ情報を取得します。
	 *
	 * @return 指定範囲のログ情報
	 */
	public String getLog() {
		return log;
	}

	/**
	 * 指定範囲のログ情報を設定します。
	 *
	 * @param log 指定範囲のログ情報
	 */
	public void setLog(String log) {
		this.log = log;
	}

	/**
	 * 指定範囲のログ情報を設定し、自オブジェクトを返します。
	 *
	 * @param log 指定範囲のログ情報
	 * @return 自オブジェクト
	 */
	public DescribeSecurityActivitiesResult withLog(String log) {
		setLog(log);
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
		builder.append("[requestId=");
		builder.append(requestId);
		builder.append(", groupName=");
		builder.append(groupName);
		builder.append(", log=");
		builder.append(log);
		builder.append("]");
		return builder.toString();
	}
}
