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
import com.nifty.cloud.sdk.loadbalancer.model.transform.InstancesConverter;
import com.nifty.cloud.sdk.loadbalancer.model.transform.RegisterInstancesWithLoadBalancerResponse;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamConverter;

/**
 * RegisterInstancesWithLoadBalancer結果処理クラス。<br />
 * このクラスはRegisterInstancesWithLoadBalancerのレスポンスを格納します。
 */
@Xml2Response(response=RegisterInstancesWithLoadBalancerResponse.class)
public class RegisterInstancesWithLoadBalancerResult extends Result {
	
	/** サーバー情報リスト */
	@XStreamAlias("Instances")
	@XStreamConverter(InstancesConverter.class)	
	private List<Instance> Instances;
	
	/**
	 * サーバー情報リストを取得します。
	 * 
	 * @return サーバー情報リスト
	 */
	public List<Instance> getInstances() {
		return Instances;
	}
	/**
	 * サーバー情報リストを設定します。
	 * 
	 * @param instances サーバー情報リスト
	 */
	public void setInstances(List<Instance> instances) {
		Instances = instances;
	}
	/**
	 * サーバー情報の配列を設定し、自オブジェクトを返します。
	 *
	 * @param instances サーバー情報の配列
	 * @return 自オブジェクト
	 */
	public RegisterInstancesWithLoadBalancerResult withInstances(Instance ... instances) {
		if(this.Instances == null) this.Instances = new ArrayList<Instance>();
		for (Instance instance: instances) {
			getInstances().add(instance);
		}
		return this; 
	}
	/**
	 * サーバー情報リストを設定し、自オブジェクトを返します。
	 *
	 * @param instances サーバー情報リスト
	 * @return 自オブジェクト
	 */
	public RegisterInstancesWithLoadBalancerResult withInstances(Collection<Instance> instances) {
		if(this.Instances == null) this.Instances = new ArrayList<Instance>();
		if (instances != null) {
			getInstances().addAll(instances);
		}
		return this; 
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("[Instances=");
		builder.append(Instances);
		builder.append("]");
		return builder.toString();
	}
	
}
