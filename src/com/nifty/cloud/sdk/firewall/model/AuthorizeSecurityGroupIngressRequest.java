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

import java.util.ArrayList;
import java.util.List;

import com.nifty.cloud.sdk.Request;
import com.nifty.cloud.sdk.annotation.Action;
import com.nifty.cloud.sdk.annotation.Query;

/**
 * AuthorizeSecurityGroupIngressリクエストクラス。<br />
 * このクラスはAuthorizeSecurityGroupIngressへのリクエストを構築します。
 */
@Action("AuthorizeSecurityGroupIngress")
public class AuthorizeSecurityGroupIngressRequest implements Request {

	private String userId;

	/** ファイアウォールグループ名 */
	private String groupName;

	/** 許可ルール情報リスト */
	private List<IpPermission> ipPermissions;

	/**
	 * デフォルトコンストラクタ。
	 */
	public AuthorizeSecurityGroupIngressRequest() {
	}
	/**
	 * ファイアウォールグループ名, 許可ルール情報リストを指定し、AuthorizeSecurityGroupIngressRequestを構築します。
	 * @param groupName ファイアウォールグループ名
	 * @param ipPermissions 許可ルール情報リスト
	 */
	public AuthorizeSecurityGroupIngressRequest(String groupName,
			List<IpPermission> ipPermissions) {
		this.groupName = groupName;
		this.ipPermissions = ipPermissions;
	}

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
	public void setUserId(String userId) {
		this.userId = userId;
	}

	/**
	 * userIdを設定し、自オブジェクトを返します。
	 * @param userId
	 * @return 自オブジェクト
	 */
	public AuthorizeSecurityGroupIngressRequest withtUserId(String userId) {
		this.userId = userId;
		return this;
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
	public AuthorizeSecurityGroupIngressRequest withGroupName(String groupName) {
		setGroupName(groupName);
		return this;
	}

	/**
	 * 許可ルール情報リストを取得します。
	 *
	 * @return 許可リスト情報リスト
	 */
	@Query(name = "IpPermissions", require = true)
	public List<IpPermission> getIpPermissions() {
		return ipPermissions;
	}

	/**
	 * 許可ルール情報リストを設定します。
	 *
	 * @param ipPermissions 許可ルール情報リスト
	 */
	public void setIpPermissions(List<IpPermission> ipPermissions) {
		this.ipPermissions = ipPermissions;
	}

	/**
	 * 許可ルール情報の配列を設定し、自オブジェクトを返します。
	 *
	 * @param ipPermissions 許可ルール情報の配列
	 * @return 自オブジェクト
	 */
	public AuthorizeSecurityGroupIngressRequest withIpPermissions(
			IpPermission... ipPermissions) {
		if (this.ipPermissions == null)
			this.ipPermissions = new ArrayList<IpPermission>();
		for (IpPermission ipPermission : ipPermissions) {
			getIpPermissions().add(ipPermission);
		}
		return this;
	}

	/**
	 * 許可ルール情報リストを設定し、自オブジェクトを返します。
	 *
	 * @param ipPermissions 許可ルール情報リスト
	 * @return 自オブジェクト
	 */
	public AuthorizeSecurityGroupIngressRequest withIpPermissions(
			List<IpPermission> ipPermissions) {
		if (this.ipPermissions == null)
			this.ipPermissions = new ArrayList<IpPermission>();
		if (ipPermissions != null) {
			getIpPermissions().addAll(ipPermissions);
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
		builder.append("[groupName=");
		builder.append(groupName);
		builder.append(", ipPermissions=");
		builder.append(ipPermissions);
		builder.append("]");
		return builder.toString();
	}
}
