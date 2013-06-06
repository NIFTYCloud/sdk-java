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
 *  API Version: 1.14
 *  Date: 2013-03-28 17:00:00
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
@Action("CreateSecurityGroup")
public class CreateSecurityGroupRequest implements Request {

	/** ファイアウォールグループ名 */
	private String groupName;

	/** ファイアウォールグループのメモ */
	private String groupDescription;

	/** ゾーン情報 */
	private Placement placement;
	/**
	 * デフォルトコンストラクタ。
	 */
	public CreateSecurityGroupRequest() {
	}
	/**
	 * ファイアウォールグループ名を指定し、CreateSecurityGroupRequestを構築します。
	 * @param groupName ファイアウォールグループ名
	 */
	public CreateSecurityGroupRequest(String groupName) {
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
	public CreateSecurityGroupRequest withGroupName(String groupName) {
		setGroupName(groupName);
		return this;
	}

	/**
	 * ファイアウォールグループのメモを取得します。
	 *
	 * @return ファイアウォールグループのメモ
	 */
	@Query(name = "GroupDescription")
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
	public CreateSecurityGroupRequest withGroupDescription(
			String groupDescription) {
		setGroupDescription(groupDescription);
		return this;
	}
	/**
	 * ゾーン情報を取得します。
	 * 
	 * @return ゾーン情報
	 */
	@Query(name="Placement")
	public Placement getPlacement() {
		return placement;
	}
	/**
	 * ゾーン情報を設定します。
	 * 
	 * @param placement ゾーン情報
	 */
	public void setPlacement(Placement placement) {
		this.placement = placement;
	}
	/**
	 * ゾーン情報を設定し、自オブジェクトを返します。
	 *
	 * @param placement ゾーン情報
	 * @return 自オブジェクト
	 */
	public CreateSecurityGroupRequest withPlacement(Placement placement) {
		setPlacement(placement);
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
		builder.append(", groupDescription=");
		builder.append(groupDescription);
		builder.append(", placement=");
		builder.append(placement);
		builder.append("]");
		return builder.toString();
	}
}
