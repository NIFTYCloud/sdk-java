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
 *  API Version: 1.15
 *  Date: 2013-06-28 17:00:00
 * 
 */
package com.nifty.cloud.sdk.loadbalancer.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.nifty.cloud.sdk.Result;
import com.nifty.cloud.sdk.annotation.Xml2Response;
import com.nifty.cloud.sdk.loadbalancer.model.transform.DescribeLoadBalancersResponse;
import com.nifty.cloud.sdk.loadbalancer.model.transform.LoadBalancerDescriptionsConverter;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamConverter;

/**
 * DescribeLoadBalancers結果処理クラス。<br />
 * このクラスはDescribeLoadBalancersのレスポンスを格納します。
 */
@Xml2Response(response=DescribeLoadBalancersResponse.class)
public class DescribeLoadBalancersResult extends Result {

	/** ロードバランサー情報リスト */
	@XStreamAlias("LoadBalancerDescriptions")
	@XStreamConverter(LoadBalancerDescriptionsConverter.class)	
	private List<LoadBalancerDescription> loadBalancerDescriptions;
	
	
	/**
	 * ロードバランサー情報リストを取得します。
	 * 
	 * @return ロードバランサー情報リスト
	 */
	public List<LoadBalancerDescription> getLoadBalancerDescriptions() {
		return loadBalancerDescriptions;
	}
	/**
	 * ロードバランサー情報リストを設定します。
	 * 
	 * @param loadBalancerDescriptions ロードバランサー情報リスト
	 */
	public void setLoadBalancerDescriptions(List<LoadBalancerDescription> loadBalancerDescriptions) {
		this.loadBalancerDescriptions = loadBalancerDescriptions;
	}
	/**
	 * ロードバランサー情報の配列を設定し、自オブジェクトを返します。
	 *
	 * @param loadBalancerDescriptions ロードバランサー情報の配列
	 * @return 自オブジェクト
	 */
	public DescribeLoadBalancersResult withLoadBalancerDescriptions(LoadBalancerDescription ... loadBalancerDescriptions) {
		if(this.loadBalancerDescriptions == null) this.loadBalancerDescriptions = new ArrayList<LoadBalancerDescription>();
		for (LoadBalancerDescription loadBalancerDescription: loadBalancerDescriptions) {
			getLoadBalancerDescriptions().add(loadBalancerDescription);
		}
		return this;
	}
	/**
	 * ロードバランサー情報リストを設定し、自オブジェクトを返します。
	 *
	 * @param loadBalancerDescriptions ロードバランサー情報リスト
	 * @return 自オブジェクト
	 */
	public DescribeLoadBalancersResult withLoadBalancerDescriptions(Collection<LoadBalancerDescription> loadBalancerDescriptions) {
		if(this.loadBalancerDescriptions == null) this.loadBalancerDescriptions = new ArrayList<LoadBalancerDescription>();
		if (loadBalancerDescriptions!=null) {
			getLoadBalancerDescriptions().addAll(loadBalancerDescriptions);
		}
		return this;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("[loadBalancerDescriptions=");
		builder.append(loadBalancerDescriptions);
		builder.append("]");
		return builder.toString();
	}

}
