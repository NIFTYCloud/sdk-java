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
 * CreateSecurityGroupリクエストクラス。<br />
 * このクラスはCreateSecurityGroupへのリクエストを構築します。
 */
@Action("UpdateSecurityGroup")
public class UpdateSecurityGroupRequest implements Request {

	/** ファイアウォールグループ名 */
	private String groupName;

	/** ファイアウォールグループ名の変更 */
	private String groupNameUpdate;

	/** ファイアウォールグループのメモの変更 */
	private String groupDescriptionUpdate;

	/** ファイアウォールグループのルール数上限の変更 */
	private Integer groupRuleLimitUpdate;

	/** ファイアウォールのログ取得件数の変更 */
	private Integer groupLogLimitUpdate;

	/** Windows サーバーのBroadCast通信ログの抑止の変更　*/
    private String groupLogFilterNetBios;

	/**
	 * デフォルトコンストラクタ。
	 */
	public UpdateSecurityGroupRequest() {
	}
	/**
	 * ファイアウォールグループ名を指定し、UpdateSecurityGroupRequestを構築します。
	 * @param groupName ファイアウォールグループ名
	 */
	public UpdateSecurityGroupRequest(String groupName) {
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
	public UpdateSecurityGroupRequest withGroupName(String groupName) {
		setGroupName(groupName);
		return this;
	}

	/**
	 * ファイアウォールグループ名の変更を取得します。
	 *
	 * @return ファイアウォールグループ名の変更
	 */
	@Query(name = "GroupNameUpdate")
	public String getGroupNameUpdate() {
		return groupNameUpdate;
	}

	/**
	 * ファイアウォールグループ名の変更を設定します。
	 *
	 * @param groupNameUpdate ファイアウォールグループ名の変更
	 */
	public void setGroupNameUpdate(String groupNameUpdate) {
		this.groupNameUpdate = groupNameUpdate;
	}

	/**
	 * ファイアウォールグループ名の変更を設定し、自オブジェクトを返します。
	 *
	 * @param groupNameUpdate ファイアウォールグループ名の変更
	 * @return 自オブジェクト
	 */
	public UpdateSecurityGroupRequest withGroupNameUpdate(String groupNameUpdate) {
		setGroupNameUpdate(groupNameUpdate);
		return this;
	}

	/**
	 * ファイアウォールグループのメモの変更を取得します。
	 *
	 * @return ファイアウォールグループのメモの変更
	 */
	@Query(name = "GroupDescriptionUpdate")
	public String getGroupDescriptionUpdate() {
		return groupDescriptionUpdate;
	}

	/**
	 * ファイアウォールグループのメモの変更を設定します。
	 *
	 * @param groupDescriptionUpdate ファイアウォールグループのメモの変更
	 */
	public void setGroupDescriptionUpdate(String groupDescriptionUpdate) {
		this.groupDescriptionUpdate = groupDescriptionUpdate;
	}

	/**
	 * ファイアウォールグループのメモの変更を設定し、自オブジェクトを返します。
	 *
	 * @param groupDescriptionUpdate ファイアウォールグループのメモの変更
	 * @return 自オブジェクト
	 */
	public UpdateSecurityGroupRequest withGroupDescriptionUpdate(
			String groupDescriptionUpdate) {
		setGroupDescriptionUpdate(groupDescriptionUpdate);
		return this;
	}

	/**
	 * ファイアウォールグループのルール数上限の変更を取得します。
	 *
	 * @return ファイアウォールグループのルール数上限の変更
	 * @deprecated オプションから削除
	 *
	 */
	@Query(name = "GroupRuleLimitUpdate")
	@Deprecated
	public Integer getGroupRuleLimitUpdate() {
		return groupRuleLimitUpdate;
	}

	/**
	 * ファイアウォールグループのルール数上限の変更設定します。
	 *
	 * @param groupRuleLimitUpdate ファイアウォールグループのルール数上限の変更
	 *　@deprecated オプションから削除
	 */
	@Deprecated
	public void setGroupRuleLimitUpdate(Integer groupRuleLimitUpdate) {
		this.groupRuleLimitUpdate = groupRuleLimitUpdate;
	}

	/**
	 * ファイアウォールグループのルール数上限の変更を設定し、自オブジェクトを返します。
	 * @param groupRuleLimitUpdate ファイアウォールグループのルール数上限の変更
	 * @return 自オブジェクト
	 */
	public UpdateSecurityGroupRequest withGroupRuleLimitUpdate(Integer groupRuleLimitUpdate) {
		setGroupRuleLimitUpdate(groupRuleLimitUpdate);
		return this;
	}

	/**
	 * ファイアウォールのログ取得件数の変更の変更を取得します。
	 *
	 * @return ファイアウォールのログ取得件数
	 */
	@Query(name = "GroupLogLimitUpdate")
	public Integer getGroupLogLimitUpdate() {
		return groupLogLimitUpdate;
	}

	/**
	 * ファイアウォールのログ取得件数の変更を設定します。
	 *
	 * @param groupLogLimitUpdate ファイアウォールのログ取得件数の変更
	 */
	public void setGroupLogLimitUpdate(Integer groupLogLimitUpdate) {
		this.groupLogLimitUpdate = groupLogLimitUpdate;
	}

	/**
	 * ファイアウォールのログ取得件数の変更を設定し、自オブジェクトを返します。
	 *
	 * @param groupLogLimitUpdate ファイアウォールのログ取得件数の変更
	 * @return 自オブジェクト
	 */
	public UpdateSecurityGroupRequest withGroupLogLimitUpdate(Integer groupLogLimitUpdate) {
		setGroupLogLimitUpdate(groupLogLimitUpdate);
		return this;
	}

	/**
	 * WindowsサーバーBroadcastログの抑止設定内容取得
	 * @return true:設定する  false:設定しない
	 */
	@Query(name = "GroupLogFilterNetBios")
	public String getGroupLogFilterNetBios() {
		return groupLogFilterNetBios;
	}

	/**
	 * WindowsサーバーBroadcaseログの抑止設定の登録をします。
	 * @param groupLogFilterNetBios  true:設定する  false:しない
	 */
	public void setGroupLogFilterNetBios(String groupLogFilterNetBios) {
		this.groupLogFilterNetBios = groupLogFilterNetBios;
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
		builder.append(", groupNameUpdate=");
		builder.append(groupNameUpdate);
		builder.append(", groupDescriptionUpdate=");
		builder.append(groupDescriptionUpdate);
		builder.append(", groupRuleLimitUpdate=");
		builder.append(groupRuleLimitUpdate);
		builder.append(", groupLogLimitUpdate=");
		builder.append(groupLogLimitUpdate);
		builder.append(", groupLogFilterNetBios=");
		builder.append(groupLogFilterNetBios);
		return builder.toString();
	}
}
