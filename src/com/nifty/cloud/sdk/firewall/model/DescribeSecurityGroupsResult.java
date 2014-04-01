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
package com.nifty.cloud.sdk.firewall.model;

import java.util.ArrayList;
import java.util.List;

import com.nifty.cloud.sdk.Result;
import com.nifty.cloud.sdk.firewall.model.transform.SecurityGroupConverter;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamConverter;

/**
 * DescribeSecurityGroups処理結果クラス。<br />
 * このクラスはDescribeSecurityGroupsのレスポンスを格納します。
 */
@XStreamAlias("DescribeSecurityGroupsResponse")
public class DescribeSecurityGroupsResult extends Result {

	/** リクエスト識別子 */
	@XStreamAlias("requestId")
	private String requestId;

	/** ファイアウォールグループ情報リスト */
	@XStreamAlias("securityGroupInfo")
	@XStreamConverter(SecurityGroupConverter.class)
	private List<SecurityGroup> securityGroups;

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
	public DescribeSecurityGroupsResult withRequestId(String requestId) {
		setRequestId(requestId);
		return this;
	}

	/**
	 * ファイアウォールグループ情報リストを取得します。
	 *
	 * @return ファイアウォールグループ情報リスト
	 */
	public List<SecurityGroup> getSecurityGroups() {
		return securityGroups;
	}

	/**
	 * ファイアウォールグループ情報リストを設定します。
	 *
	 * @param securityGroups ファイアウォールグループ情報リスト
	 */
	public void setSecurityGroups(List<SecurityGroup> securityGroups) {
		this.securityGroups = securityGroups;
	}

	/**
	 * ファイアウォールグループ情報の配列を設定し、自オブジェクトを返します。
	 *
	 * @param securityGroups ファイアウォールグループ情報の配列
	 * @return 自オブジェクト
	 */
	public DescribeSecurityGroupsResult withSecurityGroups(
			SecurityGroup... securityGroups) {
		if (this.securityGroups == null)
			this.securityGroups = new ArrayList<SecurityGroup>();
		for (SecurityGroup securityGroup : securityGroups) {
			getSecurityGroups().add(securityGroup);
		}
		return this;
	}

	/**
	 * ファイアウォールグループ情報リストを設定し、自オブジェクトを返します。
	 *
	 * @param securityGroups ファイアウォールグループ情報リスト
	 * @return 自オブジェクト
	 */
	public DescribeSecurityGroupsResult withSecurityGroups(
			List<SecurityGroup> securityGroups) {
		if (this.securityGroups == null)
			this.securityGroups = new ArrayList<SecurityGroup>();
		if (securityGroups != null) {
			getSecurityGroups().addAll(securityGroups);
		}
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
		builder.append(", securityGroups=");
		builder.append(securityGroups);
		builder.append("]");
		return builder.toString();
	}
}
