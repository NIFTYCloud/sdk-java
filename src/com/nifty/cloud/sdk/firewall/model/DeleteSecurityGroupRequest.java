/*******************************************************************************
 *  Copyright 2011 NIFTY Corporation All Rights Reserved.
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
 *  API Version: 1.9
 *  Date: 2011-08-25 09:46:38
 *
 */
package com.nifty.cloud.sdk.firewall.model;

import com.nifty.cloud.sdk.Request;
import com.nifty.cloud.sdk.annotation.Action;
import com.nifty.cloud.sdk.annotation.Query;

/**
 * DeleteSecurityGroupリクエストクラス。<br />
 * このクラスはDeleteSecurityGroupへのリクエストを構築します。
 */
@Action("DeleteSecurityGroup")
public class DeleteSecurityGroupRequest implements Request {

	/** 削除対象のファイアウォールグループ名 */
	private String groupName;

	/**
	 * デフォルトコンストラクタ。
	 */
	public DeleteSecurityGroupRequest() {
	}
	/**
	 * 削除対象のファイアウォールグループ名を指定し、DeleteSecurityGroupRequestを構築します。
	 * @param groupName 削除対象のファイアウォールグループ名
	 */
	public DeleteSecurityGroupRequest(String groupName) {
		this.groupName = groupName;
	}

	/**
	 * 削除対象のファイアウォールグループ名を取得します。
	 *
	 * @return 削除対象のファイアウォールグループ名
	 */
	@Query(name = "GroupName", require = true)
	public String getGroupName() {
		return groupName;
	}

	/**
	 * 削除対象のファイアウォールグループ名を設定します。
	 *
	 * @param groupName 削除対象のファイアウォールグループ名
	 */
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	/**
	 *
	 * 削除対象のファイアウォールグループ名を設定し、自オブジェクトを返します。
	 *
	 * @param groupName 削除対象のファイアウォールグループ名
	 * @return 自オブジェクト
	 */
	public DeleteSecurityGroupRequest withGroupName(String groupName) {
		setGroupName(groupName);
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
		builder.append("]");
		return builder.toString();
	}
}
