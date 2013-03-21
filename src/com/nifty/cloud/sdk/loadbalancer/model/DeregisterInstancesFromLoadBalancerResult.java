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
 *  API Version: 1.11
 *  Date: 2011-08-25 09:46:38
 * 
 */
package com.nifty.cloud.sdk.loadbalancer.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.nifty.cloud.sdk.Result;
import com.nifty.cloud.sdk.annotation.Xml2Response;
import com.nifty.cloud.sdk.loadbalancer.model.transform.DeregisterInstancesFromLoadBalancerResponse;
import com.nifty.cloud.sdk.loadbalancer.model.transform.InstancesConverter;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamConverter;

/**
 * DeregisterInstancesFromLoadBalancer結果処理クラス。<br />
 * このクラスはDeregisterInstancesFromLoadBalancerのレスポンスを格納します。
 */
@Xml2Response(response=DeregisterInstancesFromLoadBalancerResponse.class)
public class DeregisterInstancesFromLoadBalancerResult extends Result {
	
	/** サーバー情報リスト */
	@XStreamAlias("Instances")
	@XStreamConverter(InstancesConverter.class)
	private List<Instance> instances;

	/**
	 * サーバー情報リストを取得します。
	 * 
	 * @return サーバー情報リスト
	 */
	public List<Instance> getInstances() {
		return instances;
	}
	/**
	 * サーバー情報リストを設定します。
	 * 
	 * @param instances サーバー情報リスト
	 */
	public void setInstances(List<Instance> instances) {
		this.instances = instances;
	}
	/**
	 * サーバー情報の配列を設定し、自オブジェクトを返します。
	 *
	 * @param instances サーバー情報の配列
	 * @return 自オブジェクト
	 */
	public DeregisterInstancesFromLoadBalancerResult withInstances(Instance ... instances) {
		if(this.instances == null) this.instances = new ArrayList<Instance>();
		for(Instance instance: instances) {
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
	public DeregisterInstancesFromLoadBalancerResult withInstances(Collection<Instance> instances) {
		if(this.instances == null) this.instances = new ArrayList<Instance>();
		if (instances!=null) {
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
		builder.append("[instances=");
		builder.append(instances);
		builder.append("]");
		return builder.toString();
	}

}
