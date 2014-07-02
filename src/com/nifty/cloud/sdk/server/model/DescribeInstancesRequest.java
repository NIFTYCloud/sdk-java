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
 *  API Version: 1.18
 *  Date: 2014-05-23 17:00:00
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
 * DescribeInstancesリクエストクラス。<br />
 * このクラスはDescribeInstancesへのリクエストを構築します。
 *
 */
@Action("DescribeInstances")
public class DescribeInstancesRequest implements Request {

	/** サーバー名リスト */
	List<String> 	instanceIds;

	/**
	 * サーバー名リストを取得します。
	 * 
	 * @return サーバー名リスト
	 */
	@Query(name="InstanceId")		
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
	public DescribeInstancesRequest withInstanceIds(String ... instanceIds) {
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
	public DescribeInstancesRequest withInstanceIds(Collection<String> instanceIds) {
		if(this.instanceIds == null) this.instanceIds = new ArrayList<String>();
		if(instanceIds != null){
			getInstanceIds().addAll(instanceIds);
		}
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
		builder.append("]");
		return builder.toString();
	}

}
