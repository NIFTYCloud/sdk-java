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
package com.nifty.cloud.sdk.misc.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.nifty.cloud.sdk.Request;
import com.nifty.cloud.sdk.annotation.Action;
import com.nifty.cloud.sdk.annotation.Query;

/**
 * AssociateUsersRequestクラス。<br />
 * このクラスAssociateUsersRequest情報を格納します。
 *
 */
@Action("AssociateUsers")
public class AssociateUsersRequest  implements Request{

	private String FunctionName;
	private List<UserInfo> userinfo;


	/**
	 * デフォルトコンストラクタ。
	 */
	public AssociateUsersRequest() {
	}

	/**
	 * 機能名を指定し、AssociateUsersRequestを構築します。
	 *
	 * @param functionName 機能名
	 */
	public AssociateUsersRequest(String functionName) {
		this.FunctionName = functionName;
	}

	/**
	 * 機能名を取得します。
	 *
	 * @return 機能名
	 */
	@Query(name = "FunctionName", require=true)
	public String getFunctionName() {
		return FunctionName;
	}

	/**
	 * 機能名を設定します。
	 *
	 * @param function 機能名
	 */
	public void setFunctionName(String function) {
		this.FunctionName = function;
	}

	/**
	 * 機能名を設定し、自オブジェクトを返します。
	 *
	 * @param function 機能名
	 * @return 自オブジェクト
	 */
	public AssociateUsersRequest withFunctionName(String function) {
		setFunctionName(function);
		return this;
	}

	/**
	 * 共有設定する＠nifty法人IDリストを取得します。
	 * @return 共有設定する＠nifty法人IDリスト
	 */
	@Query(name="Users.member", require=true)
	public List<UserInfo> getUserInfo() {
		return userinfo;
	}

	/**
	 * 共有設定する＠nifty法人IDリストを設定します。
	 *
	 * @param uinfo 共有設定する＠nifty法人IDリスト
	 */
	public void setUserInfo(List<UserInfo> uinfo) {
		this.userinfo = uinfo;
	}

	/**
	 * 共有設定する＠nifty法人IDの配列を設定し、自オブジェクトを返します。
	 *
	 * @param uinfo 共有設定する＠nifty法人IDの配列
	 * @return 自オブジェクト
	 */
	public AssociateUsersRequest withUserInfo(UserInfo ... uinfo) {
		if(this.userinfo == null) this.userinfo = new ArrayList<UserInfo>();
		for(UserInfo userinfo: uinfo) {
			getUserInfo().add(userinfo);
		}
		return this;
	}

	/**
	 * 共有設定する＠nifty法人IDリストを設定し、自オブジェクトを返します。
	 *
	 * @param uinfo 共有設定する＠nifty法人IDリスト
	 * @return 自オブジェクト
	 */
	public AssociateUsersRequest withUserInfo(Collection<UserInfo> uinfo) {
		if(this.userinfo == null) this.userinfo = new ArrayList<UserInfo>();
		if (uinfo!=null) {
			getUserInfo().addAll(uinfo);
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
		builder.append("[functionName=");
		builder.append(FunctionName);
		builder.append(", userid=");
		builder.append(userinfo);
		builder.append("]");
		return builder.toString();
	}
}