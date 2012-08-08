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
package com.nifty.cloud.sdk.server.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.nifty.cloud.sdk.Request;
import com.nifty.cloud.sdk.annotation.Action;
import com.nifty.cloud.sdk.annotation.Query;

/**
 * StartInstancesリクエストクラス。<br />
 * このクラスはStartInstancesへのリクエストを構築します。
 */
@Action("StartInstances")
public class StartInstancesRequest implements Request {
	
	/** サーバー情報リスト */
	private List<InstanceIdSet> instances;

	/** サーバー起動時スクリプト*/
	private String userData;

	/** サーバー起動時スクリプトのエンコード **/
	private String userDataEncoding;

	/**
	 * サーバー情報リストを取得します。
	 * 
	 * @return サーバー情報リスト
	 */
	@Query(name="", alias="InstanceIdSet", require=true)
	public List<InstanceIdSet> getInstances() {
		return instances;
	}
	/**
	 * サーバー情報リストを設定します。
	 * 
	 * @param instanceSets サーバー情報リスト
	 */
	public void setInstances(List<InstanceIdSet> instanceSets) {
		this.instances = instanceSets;
	}
	/**
	 * サーバー情報の配列を設定し、自オブジェクトを返します。
	 *
	 * @param instanceSets サーバー情報の配列
	 * @return 自オブジェクト	 
	 */
	public StartInstancesRequest withInstances(InstanceIdSet ... instanceSets) {
		if(this.instances == null) this.instances = new ArrayList<InstanceIdSet>();
		for(InstanceIdSet instanceSet: instanceSets) {
			getInstances().add(instanceSet);
		}
		return this;
	}
	/**
	 * サーバー情報リストを設定し、自オブジェクトを返します。
	 *
	 * @param instanceSets サーバー情報リスト
	 * @return 自オブジェクト	 
	 */
	public StartInstancesRequest withInstances(Collection<InstanceIdSet> instanceSets) {
		if(this.instances == null) this.instances = new ArrayList<InstanceIdSet>();
		if (instanceSets!=null) {
			getInstances().addAll(instanceSets);
		}
		return this;
	}

	/**
	 * サーバー起動時スクリプトを取得します。
	 * 
	 * @return サーバー起動時スクリプト
	 */
	@Query(name="UserData")
	public String getUserData() {
		return userData;
	}

	/**
	 * サーバー起動時スクリプトを設定します。
	 * 
	 * @param userData サーバー起動時スクリプト
	 */
	public void setUserData(String userData) {
		this.userData = userData;
	}

	/**
	 * サーバー起動時スクリプトを設定し、自オブジェクトを返します。
	 *
	 * @param userData サーバー起動時スクリプト
	 * @return 自オブジェクト	 
	 */
	public StartInstancesRequest withUserData(String userData){
		setUserData(userData);
		return this;
	}

	/**
	 * サーバー起動時スクリプトのエンコード を取得します。
	 * 
	 * @return サーバー起動時スクリプトのエンコード 
	 */
	@Query(name="UserData.Encoding")
	public String getUserDataEncoding() {
		return userDataEncoding;
	}

	/**
	 * サーバー起動時スクリプトのエンコード を設定します。
	 * 
	 * @param userDataEncoding サーバー起動時スクリプトのエンコード 
	 */
	public void setUserDataEncoding(String userDataEncoding) {
		this.userDataEncoding = userDataEncoding;
	}

	/**
	 * サーバー起動時スクリプトのエンコード を設定し、自オブジェクトを返します。
	 *
	 * @param userDataEncoding サーバー起動時スクリプトのエンコード 
	 * @return 自オブジェクト	 
	 */
	public StartInstancesRequest withUserDataEncoding(String userDataEncoding){
		setUserDataEncoding(userDataEncoding);
		return this;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("[instances=");
		builder.append(instances);
		builder.append(", userData=");
		builder.append(userData);
		builder.append(", userDataEncoding=");
		builder.append(userDataEncoding);
		builder.append("]");
		return builder.toString();
	}

}
