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
 *  API Version: 1.11
 *  Date: 2011-08-25 09:46:38
 *
 */
package com.nifty.cloud.sdk.firewall.model;

import java.util.ArrayList;
import java.util.List;

import com.nifty.cloud.sdk.Result;
import com.nifty.cloud.sdk.firewall.model.transform.InstancesConverter;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamConverter;

/**
 * DeregisterInstancesFromSecurityGroup処理結果クラス。<br />
 * このクラスはDeregisterInstancesFromSecurityGroupのレスポンスを格納します。
 */
@XStreamAlias("DeregisterInstancesFromSecurityGroupResponse")
public class DeregisterInstancesFromSecurityGroupResult extends Result {

	/** リクエスト識別子 */
	@XStreamAlias("requestId")
	private String requestId;

	/** 解除に成功したサーバーの情報リスト */
	@XStreamAlias("instancesSet")
	@XStreamConverter(InstancesConverter.class)
	private List<String> instanceIds;

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
	public DeregisterInstancesFromSecurityGroupResult withRequestId(
			String requestId) {
		setRequestId(requestId);
		return this;
	}

	/**
	 * 解除に成功したサーバーの情報リストを取得します。
	 *
	 * @return 解除に成功したサーバーの情報リスト
	 */
	public List<String> getInstanceIds() {
		return instanceIds;
	}

	/**
	 * 解除に成功したサーバーの情報リストを設定します。
	 *
	 * @param instanceIds 解除に成功したサーバーの情報リスト
	 */
	public void setInstanceIds(List<String> instanceIds) {
		this.instanceIds = instanceIds;
	}

	/**
	 * 解除に成功したサーバーの情報の配列を設定し、自オブジェクトを返します。
	 *
	 * @param instanceIds 解除に成功したサーバーの情報の配列
	 * @return 自オブジェクト
	 */
	public DeregisterInstancesFromSecurityGroupResult withInstanceIds(
			String... instanceIds) {
		if (this.instanceIds == null)
			this.instanceIds = new ArrayList<String>();
		for (String instanceId : instanceIds) {
			getInstanceIds().add(instanceId);
		}
		return this;
	}

	/**
	 * 解除に成功したサーバーの情報リストを設定し、自オブジェクトを返します。
	 *
	 * @param instanceIds 解除に成功したサーバーの情報リスト
	 * @return 自オブジェクト
	 */
	public DeregisterInstancesFromSecurityGroupResult withInstanceIds(
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
		builder.append("[requestId=");
		builder.append(requestId);
		builder.append(", instanceIds=");
		builder.append(instanceIds);
		builder.append("]");
		return builder.toString();
	}
}
