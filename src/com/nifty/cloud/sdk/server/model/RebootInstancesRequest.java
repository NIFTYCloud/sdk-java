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
package com.nifty.cloud.sdk.server.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.nifty.cloud.sdk.Request;
import com.nifty.cloud.sdk.annotation.Action;
import com.nifty.cloud.sdk.annotation.Query;

/**
 * RebootInstancesリクエストクラス。<br />
 * このクラスはRebootInstancesへのリクエストを構築します。
 */
@Action("RebootInstances")
public class RebootInstancesRequest implements Request {
	
	/** サーバー名リスト */
	private List<String>	instanceIds;
	
	/** 強制再起動モード  */
	private Boolean			force;

	/** サーバー起動時スクリプト*/
	private String userData;

	/** サーバー起動時スクリプトのエンコード **/
	private String userDataEncoding;
	/**
	 * デフォルトコンストラクタ。
	 */
	public RebootInstancesRequest() {
	}
	
	/**
	 * サーバー名リストを指定し、RebootInstancesRequestを構築します。
	 * 
	 * @param instanceIds サーバー名リスト 
	 */
	public RebootInstancesRequest(List<String> instanceIds) {
		this.instanceIds = instanceIds;
	}
	
	/**
	 * サーバー名リストを取得します。
	 * 
	 * @return サーバー名リスト
	 */
	@Query(name="InstanceId", require=true)	
	public List<String> getInstanceIds() {
		return instanceIds;
	}
	/**
	 * サーバー名リストを設定します。
	 * 
	 * @param instanceIds サーバー名リスト
	 */
	public void setInstanceIds(List<String> instanceIds) {
		this.instanceIds = instanceIds;
	}
	/**
	 * サーバー名の配列を設定し、自オブジェクトを返します。
	 *
	 * @param instanceIds サーバー名の配列
	 * @return 自オブジェクト	 
	 */
	public RebootInstancesRequest withInstanceIds(String ... instanceIds) {
		if(this.instanceIds == null) this.instanceIds = new ArrayList<String>();
		for(String instanceId : instanceIds) {
			getInstanceIds().add(instanceId);
		}
		return this;
	}
	/**
	 * サーバー名リストを設定し、自オブジェクトを返します。
	 *
	 * @param instanceIds サーバー名リスト
	 * @return 自オブジェクト	 
	 */
	public RebootInstancesRequest withInstanceIds(Collection<String> instanceIds) {
		if(this.instanceIds == null) this.instanceIds = new ArrayList<String>();
		if (instanceIds != null) {
			getInstanceIds().addAll(instanceIds);
		}
		return this;
	}
	
	/**
	 * 強制再起動モードを取得します。
	 * 
	 * @return 強制再起動モード
	 */
	@Query(name="Force")		
	public Boolean getForce() {
		return force;
	}
	/**
	 * 強制再起動モードを設定します。
	 * 
	 * @param force 強制再起動モード
	 */
	public void setForce(Boolean force) {
		this.force = force;
	}
	/**
	 * 強制再起動モードを設定し、自オブジェクトを返します。
	 *
	 * @param force 強制再起動モード
	 * @return 自オブジェクト	 
	 */
	public RebootInstancesRequest withForce(Boolean force) {
		setForce(force);
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
	public RebootInstancesRequest withUserData(String userData){
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
	public RebootInstancesRequest withUserDataEncoding(String userDataEncoding){
		setUserDataEncoding(userDataEncoding);
		return this;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("[instanceIds=");
		builder.append(instanceIds);
		builder.append(", force=");
		builder.append(force);
		builder.append(", userData=");
		builder.append(userData);
		builder.append(", userDataEncoding=");
		builder.append(userDataEncoding);
		builder.append("]");
		return builder.toString();
	}

}
