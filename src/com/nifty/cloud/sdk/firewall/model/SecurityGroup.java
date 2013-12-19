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

import com.nifty.cloud.sdk.firewall.model.transform.InstancesConverter;
import com.nifty.cloud.sdk.firewall.model.transform.IpPermissionConverter;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamConverter;

/**
 *
 * ファイアウォールグループ情報クラス。<br />
 * このクラスはファイアウォールグループ情報を格納します。
 *
 */
public class SecurityGroup {

	@XStreamAlias("ownerId")
	private String ownerId;

	/** ファイアウォールグループ名 */
	@XStreamAlias("groupName")
	private String groupName;

	/** ファイアウォールグループのメモ */
	@XStreamAlias("groupDescription")
	private String groupDescription;

	/** ファイアウォールグループの処理ステータス */
	@XStreamAlias("groupStatus")
	private String groupStatus;

	/** 許可ルール情報リスト */
	@XStreamAlias("ipPermissions")
	@XStreamConverter(IpPermissionConverter.class)
	private List<IpPermission> ipPermissions;

	/** 適用しているサーバー情報リスト */
	@XStreamAlias("instancesSet")
	@XStreamConverter(InstancesConverter.class)
	private List<String> instanceIds;

	/** ルール数上限 */
	private Integer groupRuleLimit;

	/** ログ取得件数 */
	private Integer groupLogLimit;

	/** Windows サーバー BroadCast 通信ログの抑止状態 */
	private Boolean groupLogFilterNetBios;

	/** ゾーン名 */
	private String availabilityZone;

	/**
	 * ownerIdを取得します。
	 * @return ownerId
	 */
	public String getOwnerId() {
		return ownerId;
	}

	/**
	 * ownerIdを設定します。
	 * @param ownerId
	 */
	public void setOwnerId(String ownerId) {
		this.ownerId = ownerId;
	}

	/**
	 * ownerIdを設定し、自オブジェクトを返します。
	 * @param ownerId
	 * @return 自オブジェクト
	 */
	public SecurityGroup withOwnerId(String ownerId) {
		this.ownerId = ownerId;
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
	public SecurityGroup withGroupName(String groupName) {
		setGroupName(groupName);
		return this;
	}

	/**
	 * ファイアウォールグループのメモを取得します。
	 *
	 * @return ファイアウォールグループのメモ
	 */
	public String getGroupDescription() {
		return groupDescription;
	}

	/**
	 * ファイアウォールグループのメモを設定します。
	 *
	 * @param groupDescription ファイアウォールグループのメモ
	 */
	public void setGroupDescription(String groupDescription) {
		this.groupDescription = groupDescription;
	}

	/**
	 * ファイアウォールグループのメモを設定し、自オブジェクトを返します。
	 *
	 * @param groupDescription ファイアウォールグループのメモ
	 * @return 自オブジェクト
	 */
	public SecurityGroup withGroupDescription(String groupDescription) {
		setGroupDescription(groupDescription);
		return this;
	}

	/**
	 * ファイアウォールグループの処理ステータスを取得します。
	 * @return groupStatus ファイアウォールグループの処理ステータス
	 */
	public String getGroupStatus() {
		return groupStatus;
	}

	/**
	 * ファイアウォールグループの処理ステータスを設定します。
	 * @param groupStatus ファイアウォールグループの処理ステータス
	 */
	public void setGroupStatus(String groupStatus) {
		this.groupStatus = groupStatus;
	}

	/**
	 * フファイアウォールグループの処理ステータスを設定し、自オブジェクトを返します。
	 *
	 * @param groupStatus ファイアウォールグループの処理ステータス
	 * @return 自オブジェクト
	 */
	public SecurityGroup withGroupStatus(String groupStatus) {
		setGroupStatus(groupStatus);
		return this;
	}

	/**
	 * 許可ルール情報リストを取得します。
	 *
	 * @return 許可ルール情報リスト
	 */
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
	public SecurityGroup withIpPermissions(IpPermission... ipPermissions) {
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
	public SecurityGroup withIpPermissions(List<IpPermission> ipPermissions) {
		if (this.ipPermissions == null)
			this.ipPermissions = new ArrayList<IpPermission>();
		if (ipPermissions != null) {
			getIpPermissions().addAll(ipPermissions);
		}
		return this;
	}

	/**
	 * 適用しているサーバー情報リストを取得します。
	 *
	 * @return 適用しているサーバー情報リスト
	 */
	public List<String> getInstanceIds() {
		return instanceIds;
	}

	/**
	 * 適用しているサーバー情報リストを設定します。
	 *
	 * @param instanceIds 適用しているサーバー情報リスト
	 */
	public void setInstanceIds(List<String> instanceIds) {
		this.instanceIds = instanceIds;
	}

	/**
	 * 適用しているサーバー情報の配列を設定し、自オブジェクトを返します。
	 *
	 * @param instanceIds 適用しているサーバー情報の配列
	 * @return 自オブジェクト
	 */
	public SecurityGroup withInstanceIds(String... instanceIds) {
		if (this.instanceIds == null)
			this.instanceIds = new ArrayList<String>();
		for (String instanceId : instanceIds) {
			getInstanceIds().add(instanceId);
		}
		return this;
	}

	/**
	 * 適用しているサーバー情報リストを設定し、自オブジェクトを返します。
	 *
	 * @param instanceIds 適用しているサーバー情報リスト
	 * @return 自オブジェクト
	 */
	public SecurityGroup withInstanceIds(List<String> instanceIds) {
		if (this.instanceIds == null)
			this.instanceIds = new ArrayList<String>();
		if (instanceIds != null) {
			getInstanceIds().addAll(instanceIds);
		}
		return this;
	}

	/**
	 * ルール数上限を取得します。
	 *
	 * @return ルール数上限
	 */
	public Integer getGroupRuleLimit() {
		return groupRuleLimit;
	}

	/**
	 * ルール数上限を設定します。
	 *
	 * @param groupRuleLimit ルール数上限
	 */
	public void setGroupRuleLimit(Integer groupRuleLimit) {
		this.groupRuleLimit = groupRuleLimit;
	}

	/**
	 * ルール数上限を設定し、自オブジェクトを返します。
	 * @param groupRuleLimit ルール数上限
	 * @return 自オブジェクト
	 */
	public SecurityGroup withGroupRuleLimit(Integer groupRuleLimit) {
		setGroupRuleLimit(groupRuleLimit);
		return this;
	}

	/**
	 * ログ取得件数を取得します。
	 *
	 * @return ログ取得件数
	 */
	public Integer getGroupLogLimit() {
		return groupLogLimit;
	}

	/**
	 * ログ取得件数を設定します。
	 *
	 * @param groupLogLimit ログ取得件数
	 */
	public void setGroupLogLimit(Integer groupLogLimit) {
		this.groupLogLimit = groupLogLimit;
	}

	/**
	 * ログ取得件数を設定し、自オブジェクトを返します。
	 *
	 * @param groupLogLimit ログ取得件数
	 * @return 自オブジェクト
	 */
	public SecurityGroup withGroupLogLimit(Integer groupLogLimit) {
		setGroupLogLimit(groupLogLimit);
		return this;
	}


	/**
	 * WindowsサーバーBroadcastログの抑止設定情報を取得します
	 * @return boolean true:設定する  false:設定しない
	 */
	public Boolean isGroupLogFilterNetBios() {
		return groupLogFilterNetBios;
	}

	/**
	 * WindowsサーバーBroadcastログの抑止設定を登録します
	 * @param groupLogFilterNetBios  (true:設定する  false:設定しない)
	 */
	public void setGroupLogFilterNetBios(boolean groupLogFilterNetBios) {
		this.groupLogFilterNetBios = groupLogFilterNetBios;
	}

	/**
	 * WindowsサーバーBroadcastログの抑止設定を登録し、自オブジェクトを返します
	 * @param groupLogFilterNetBios (true:設定する  false:設定しない)
	 * @return 自オブジェクト
	 */
	public SecurityGroup withGroupLogFilterNetBios(boolean groupLogFilterNetBios) {
		setGroupLogFilterNetBios(groupLogFilterNetBios);
		return this;
	}


	/**
	 * ゾーン名を取得します。
	 * @return ゾーン名
	 */
	public String getAvailabilityZone() {
		return availabilityZone;
	}

	/**
	 * ゾーン名を設定します。
	 * @param availabilityZone ゾーン名
	 */
	public void setAvailabilityZone(String availabilityZone) {
		this.availabilityZone = availabilityZone;
	}

	/**
	 * ゾーン名を設定し、自オブジェクトを返します。
	 * @param availabilityZone ゾーン名
	 * @return 自オブジェクト
	 */


	public SecurityGroup withAvailabilityZone(String availabilityZone) {
		setAvailabilityZone(availabilityZone);
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
		builder.append("[ownerId=");
		builder.append(ownerId);
		builder.append(", groupName=");
		builder.append(groupName);
		builder.append(", groupDescription=");
		builder.append(groupDescription);
		builder.append(", groupStatus=");
		builder.append(groupStatus);
		builder.append(", ipPermissions=");
		builder.append(ipPermissions);
		builder.append(", instanceIds=");
		builder.append(instanceIds);
		builder.append(", groupRuleLimit=");
		builder.append(groupRuleLimit);
		builder.append(", groupLogLimit=");
		builder.append(groupLogLimit);
		builder.append(" ,groupLogFilterNetBios=");
		builder.append(groupLogFilterNetBios);
		builder.append(" ,availabilityZone=");
		builder.append(availabilityZone);
		builder.append("]");
		return builder.toString();
	}
}
