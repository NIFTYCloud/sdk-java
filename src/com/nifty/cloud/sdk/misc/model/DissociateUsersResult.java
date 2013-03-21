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
 *  Date: 2012-09-12 09:46:38
 * 
 */
package com.nifty.cloud.sdk.misc.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.nifty.cloud.sdk.Result;
import com.nifty.cloud.sdk.annotation.Xml2Response;
import com.nifty.cloud.sdk.misc.model.transform.DissociateUsersResponse;
import com.nifty.cloud.sdk.misc.model.transform.UsersConverter;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamConverter;

/**
 * DissociateUsers処理結果クラス。<br />
 * このクラスはDissociateUsersのレスポンスを格納します。
 */
@Xml2Response(response=DissociateUsersResponse.class)
public class DissociateUsersResult extends Result {

	/** ユーザID */
	@XStreamAlias("Users")
	@XStreamConverter(UsersConverter.class)
	private List<UserInfo> userinfo;


	/**
	 * ユーザIDリストを取得します。
	 * @return List<UserInfo>
	 */
	public List<UserInfo> getUserInfo() {
		return userinfo;
	}
	/**
	 * ユーザIDリストを設定します。
	 * @param List<UserInfo>
	 */
	public void setUserInfo(List<UserInfo> uinfo) {
		this.userinfo = uinfo;
	}
	/**
	 * ユーザIDの配列を設定し、自オブジェクトを返します。
	 * @param  UserInfo
	 * @return 自オブジェクト
	 */
	public DissociateUsersResult withUserInfo(UserInfo ... uinfo) {
		if(this.userinfo == null) this.userinfo = new ArrayList<UserInfo>();
		for(UserInfo usr: uinfo) {
			getUserInfo().add(usr);
		}
		return this;
	}
	/**
	 * ユーザIDリストを設定し、自オブジェクトを返します。
	 * @param  Collection<UserInfo>
	 * @return 自オブジェクト
	 */
	public DissociateUsersResult withUserInfo(Collection<UserInfo> uinfo) {
		if(this.userinfo == null) this.userinfo = new ArrayList<UserInfo>();
		if (uinfo!=null) {
			getUserInfo().addAll(uinfo);
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
		builder.append(userinfo);
		builder.append("]");
		return builder.toString();
	}

}
