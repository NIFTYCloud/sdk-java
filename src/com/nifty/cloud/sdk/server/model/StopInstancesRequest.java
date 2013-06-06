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
 * StopInstancesリクエストクラス。<br />
 * このクラスはStopInstancesへのリクエストを構築します。
 */
@Action("StopInstances")
public class StopInstancesRequest implements Request {
	
	/** サーバー名リスト */
	private List<String> instanceIds;
	
	/** 強制停止モード  */
	private Boolean		 force;
	
	/**
	 * デフォルトコンストラクタ。
	 */
	public StopInstancesRequest() {
	}
	
	/**
	 * サーバー名リストを指定し、StopInstancesRequestを構築します。
	 * 
	 * @param instanceIds サーバー名リスト
	 */
	public StopInstancesRequest(List<String> instanceIds) {
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
	public StopInstancesRequest withInstanceIds(String ... instanceIds) {
		if(this.instanceIds == null) this.instanceIds = new ArrayList<String>();
		for(String instanceId: instanceIds) {
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
	public StopInstancesRequest withInstanceIds(Collection<String> instanceIds) {
		if(this.instanceIds == null) this.instanceIds = new ArrayList<String>();
		if (instanceIds!=null) {
			getInstanceIds().addAll(instanceIds);
		}
		return this;
	}
	
	/**
	 * 強制停止モード を取得します。
	 * 
	 * @return 強制停止モード 
	 */
	@Query(name="Force")
	public Boolean getForce() {
		return force;
	}
	/**
	 * 強制停止モード を設定します。
	 * 
	 * @param force 強制停止モード 
	 */
	public void setForce(Boolean force) {
		this.force = force;
	}
	/**
	 * 強制停止モード を設定し、自オブジェクトを返します。
	 *
	 * @param force 強制停止モード 
	 * @return 自オブジェクト	 
	 */
	public StopInstancesRequest withForce(Boolean force) {
		setForce(force);
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
		builder.append("]");
		return builder.toString();
	}
	
	
}
