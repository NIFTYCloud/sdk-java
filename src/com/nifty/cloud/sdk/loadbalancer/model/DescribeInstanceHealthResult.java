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
package com.nifty.cloud.sdk.loadbalancer.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.nifty.cloud.sdk.Result;
import com.nifty.cloud.sdk.annotation.Xml2Response;
import com.nifty.cloud.sdk.loadbalancer.model.transform.DescribeInstanceHealthResponse;
import com.nifty.cloud.sdk.loadbalancer.model.transform.InstanceStatesConverter;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamConverter;

/**
 * DescribeInstanceHealth結果処理クラス。<br />
 * このクラスはDescribeInstanceHealthのレスポンスを格納します。
 */
@Xml2Response(response=DescribeInstanceHealthResponse.class)
public class DescribeInstanceHealthResult extends Result {
	
	/** サーバー状態リスト */
	@XStreamAlias("InstanceStates")
	@XStreamConverter(InstanceStatesConverter.class)
	private List<InstanceState> instanceStates;
	

	/**
	 * サーバー状態リストを取得します。
	 * 
	 * @return サーバー状態リスト
	 */
	public List<InstanceState> getInstanceStates() {
		return instanceStates;
	}
	/**
	 * サーバー状態リストを設定します。
	 * 
	 * @param instanceStates サーバー状態リスト
	 */
	public void setInstanceStates(List<InstanceState> instanceStates) {
		this.instanceStates = instanceStates;
	}
	/**
	 * サーバー状態の配列を設定し、自オブジェクトを返します。
	 *
	 * @param instanceStates サーバー状態の配列
	 * @return 自オブジェクト
	 */
	public DescribeInstanceHealthResult withInstanceStates(InstanceState ... instanceStates) {
		if(this.instanceStates == null) this.instanceStates = new ArrayList<InstanceState>();
		for(InstanceState instanceState: instanceStates) {
			getInstanceStates().add(instanceState);
		}
		return this;
	}
	/**
	 * サーバー状態リストを設定し、自オブジェクトを返します。
	 *
	 * @param instanceStates サーバー状態リスト
	 * @return 自オブジェクト
	 */
	public DescribeInstanceHealthResult withInstanceStates(Collection<InstanceState> instanceStates) {
		if(this.instanceStates == null) this.instanceStates = new ArrayList<InstanceState>();
		if (instanceStates!=null) {
			getInstanceStates().addAll(instanceStates);
		}
		return this;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("[instanceStates=");
		builder.append(instanceStates);
		builder.append("]");
		return builder.toString();
	}

}
