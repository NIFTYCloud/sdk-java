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

import java.util.ArrayList;
import java.util.List;

import com.nifty.cloud.sdk.Request;
import com.nifty.cloud.sdk.annotation.Action;
import com.nifty.cloud.sdk.annotation.Query;

/**
 * DeregisterInstancesFromSecurityGroupリクエストクラス。<br />
 * このクラスはDeregisterInstancesFromSecurityGroupへのリクエストを構築します。
 */
@Action("DeregisterInstancesFromSecurityGroup")
public class DeregisterInstancesFromSecurityGroupRequest implements Request {

	/** ファイアウォールグループ名 */
	private String groupName;

	/** 解除対象のサーバー情報リスト */
	private List<String> instanceIds;

	/**
	 * デフォルトコンストラクタ。
	 */
	public DeregisterInstancesFromSecurityGroupRequest() {
	}
	/**
	 * ファイアウォールグループ名, 解除対象のサーバー情報リストを指定し、DeregisterInstancesFromSecurityGroupRequestを構築します。
	 * @param groupName ファイアウォールグループ名
	 * @param instanceIds 解除対象のサーバー情報リスト
	 */
	public DeregisterInstancesFromSecurityGroupRequest(String groupName,
			List<String> instanceIds) {
		this.groupName = groupName;
		this.instanceIds = instanceIds;
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
	public DeregisterInstancesFromSecurityGroupRequest withGroupName(
			String groupName) {
		setGroupName(groupName);
		return this;
	}

	/**
	 * 解除対象のサーバー情報リストを取得します。
	 *
	 * @return 解除対象サーバーの情報リスト
	 */
	@Query(name = "InstanceId", require = true)
	public List<String> getInstanceIds() {
		return instanceIds;
	}

	/**
	 * 解除対象のサーバー情報リストを設定します。
	 *
	 * @param instanceIds 解除対象のサーバー情報リスト
	 */
	public void setInstanceIds(List<String> instanceIds) {
		this.instanceIds = instanceIds;
	}

	/**
	 * 解除対象のサーバー情報の配列を設定し、自オブジェクトを返します。
	 *
	 * @param instanceIds 解除対象のサーバー情報の配列
	 * @return 自オブジェクト
	 */
	public DeregisterInstancesFromSecurityGroupRequest withInstanceIds(
			String... instanceIds) {
		if (this.instanceIds == null)
			this.instanceIds = new ArrayList<String>();
		for (String instanceId : instanceIds) {
			getInstanceIds().add(instanceId);
		}
		return this;
	}

	/**
	 * 解除対象のサーバー情報リストを設定し、自オブジェクトを返します。
	 *
	 * @param instanceIds 解除対象のサーバー情報リスト
	 * @return 自オブジェクト
	 */
	public DeregisterInstancesFromSecurityGroupRequest withInstanceIds(
			List<String> instanceIds) {
		if (this.instanceIds == null)
			this.instanceIds = new ArrayList<String>();
		if (instanceIds != null) {
			getInstanceIds().addAll(instanceIds);
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
		builder.append(", instanceIds=");
		builder.append(instanceIds);
		builder.append("]");
		return builder.toString();
	}
}
