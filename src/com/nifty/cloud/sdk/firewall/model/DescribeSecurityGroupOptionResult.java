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
 * DescribeSecurityGroupOption処理結果クラス。<br />
 * このクラスはDescribeSecurityGroupOptionのレスポンスを格納します。
 */
@XStreamAlias("DescribeSecurityGroupOptionResponse")
public class DescribeSecurityGroupOptionResult extends Result {

	/** リクエスト識別子 */
	@XStreamAlias("requestId")
	private String requestId;

	/** 有償・無償 */
	@XStreamAlias("course")
	private String course;

	/** グループ数上限 */
	@XStreamAlias("securityGroupLimit")
	private Integer securityGroupLimit;

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
	public DescribeSecurityGroupOptionResult withRequestId(String requestId) {
		setRequestId(requestId);
		return this;
	}

	/**
	 * 有償・無償を取得します。
	 * 
	 * @return 有償・無償
	 */
	public String getCourse() {
		return course;
	}

	/**
	 * 有償・無償を設定します。
	 * 
	 * @param course 有償・無償
	 */
	public void setCourse(String course) {
		this.course = course;
	}

	/**
	 * 有償・無償を設定し、自オブジェクトを返します。
	 * 
	 * @param course 有償・無償
	 * @return 自オブジェクト
	 */
	public DescribeSecurityGroupOptionResult withCoures(String course) {
		setCourse(course);
		return this;
	}

	/**
	 * グループ数上限を取得します。
	 * 
	 * @return グループ数上限
	 */
	public Integer getSecurityGroupLimit() {
		return securityGroupLimit;
	}

	/**
	 * グループ数上限を設定します。
	 * 
	 * @param securityGroupLimit グループ数上限
	 */
	public void setSecurityGroupLimit(Integer securityGroupLimit) {
		this.securityGroupLimit = securityGroupLimit;
	}

	/**
	 * グループ数上限を設定し、自オブジェクトを返します。
	 * 
	 * @param securityGroupLimit グループ数上限
	 * @return 自オブジェクト
	 */
	public DescribeSecurityGroupOptionResult withSecurityGroupLimit(Integer securityGroupLimit) {
		setSecurityGroupLimit(securityGroupLimit);
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
		builder.append(", course=");
		builder.append(course);
		builder.append(", securityGroupLimit=");
		builder.append(securityGroupLimit);
		builder.append("]");
		return builder.toString();
	}
}
