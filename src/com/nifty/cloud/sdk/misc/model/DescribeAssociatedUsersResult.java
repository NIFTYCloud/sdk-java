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
package com.nifty.cloud.sdk.misc.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.nifty.cloud.sdk.Result;
import com.nifty.cloud.sdk.annotation.Xml2Response;
import com.nifty.cloud.sdk.misc.model.transform.UsersConverter;
import com.nifty.cloud.sdk.misc.model.transform.DescribeAssociatedUsersResponse;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamConverter;

/**
 * DescribeAssociatedUsersResult処理結果クラス。<br />
 * このクラスはDescribeAssociatedUsersResultのレスポンスを格納します。
 */

@Xml2Response(response=DescribeAssociatedUsersResponse.class)
public class DescribeAssociatedUsersResult extends Result {


	/** 共有している＠nifty法人IDリスト */
	@XStreamAlias("Users")
	@XStreamConverter(UsersConverter.class)
	private List<UserInfo> userid;


	/**
	 * 共有している＠nifty法人IDリストを取得します。
	 * @return 共有設定する＠nifty法人ID
	 */
	public List<UserInfo> getUserInfo() {
		return userid;
	}
	/**
	 * 共有している＠nifty法人IDリストを設定します。
	 * @param userid 共有設定する＠nifty法人IDリスト
	 */
	public void setUserInfo(List<UserInfo> userid) {
		this.userid = userid;
	}
	/**
	 * 共有している＠nifty法人IDの配列を設定し、自オブジェクトを返します。
	 * @param UserInfo 共有設定する＠nifty法人IDの配列
	 * @return 自オブジェクト
	 */
	public DescribeAssociatedUsersResult withUserid(UserInfo... userid) {
		if (this.userid == null) this.userid = new ArrayList<UserInfo>();
		for(UserInfo uid : userid){
			getUserInfo().add(uid);
		}
		return this;
	}
	/**
	 * 共有している＠nifty法人IDリストを設定し、自オブジェクトを返します。
	 * @param userid 共有設定する＠nifty法人IDリスト
	 * @return 自オブジェクト
	 */
	public DescribeAssociatedUsersResult withUserid(Collection<UserInfo> userid) {
		if (this.userid == null) this.userid = new ArrayList<UserInfo>();
		if(userid != null){
			getUserInfo().addAll(userid);
		}
		return this;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("[userid=");
		builder.append(userid);
		builder.append("]");
		return builder.toString();
	}

}
