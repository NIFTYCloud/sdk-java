/******************************************************************************* 
 *  Copyright 2012 NIFTY Corporation All Rights Reserved.
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
 *  API Version: 1.12
 *  Date: 2012-12-21 17:00:00
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


	/** ユーザID */
	@XStreamAlias("Users")
	@XStreamConverter(UsersConverter.class)
	private List<UserInfo> userid;


	/**
	 * ユーザIDリストを取得します。
	 * @return List<UserInfo>
	 */
	public List<UserInfo> getUserInfo() {
		return userid;
	}
	/**
	 * ユーザIDリストを設定します。
	 * @param List<UserInfo>
	 */
	public void setUserInfo(List<UserInfo> userid) {
		this.userid = userid;
	}
	/**
	 * ユーザID配列を設定し、自オブジェクトを返します。
	 * @param UserInfo ユーザIDの配列
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
	 * ユーザIDリストを設定し、自オブジェクトを返します。
	 * @param List<UserInfo>
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
