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
package com.nifty.cloud.sdk.loadbalancer.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.nifty.cloud.sdk.Request;
import com.nifty.cloud.sdk.annotation.Action;
import com.nifty.cloud.sdk.annotation.Query;

/**
 * DescribeLoadBalancersリクエストクラス。<br />
 * このクラスはDescribeLoadBalancersへのリクエストを構築します。
 */
@Action("DescribeLoadBalancers")
public class DescribeLoadBalancersRequest implements Request {
	/** ロードバランサー情報リスト */
	private List<LoadBalancer> loadBalancers;

	/**
	 * ロードバランサー情報リストを取得します。
	 * 
	 * @return ロードバランサー情報リスト
	 */
	@Query(name="LoadBalancerNames")	
	public List<LoadBalancer> getLoadBalancers() {
		return loadBalancers;
	}
	/**
	 * ロードバランサー情報リストを設定します。
	 * 
	 * @param loadBalancers ロードバランサー情報リスト
	 */
	public void setLoadBalancers(List<LoadBalancer> loadBalancers) {
		this.loadBalancers = loadBalancers;
	}
	/**
	 * ロードバランサー情報の配列を設定し、自オブジェクトを返します。
	 *
	 * @param loadBalancers ロードバランサー情報の配列
	 * @return 自オブジェクト
	 */
	public DescribeLoadBalancersRequest withLoadBalancers(LoadBalancer ... loadBalancers) {
		if(this.loadBalancers == null) this.loadBalancers = new ArrayList<LoadBalancer>();
		for (LoadBalancer loadBalancer: loadBalancers) {
			getLoadBalancers().add(loadBalancer);
		}
		return this;
	}
	/**
	 * ロードバランサー情報リストを設定し、自オブジェクトを返します。
	 *
	 * @param loadBalancers ロードバランサー情報リスト
	 * @return 自オブジェクト
	 */
	public DescribeLoadBalancersRequest withLoadBalancers(Collection<LoadBalancer> loadBalancers) {
		if(this.loadBalancers == null) this.loadBalancers = new ArrayList<LoadBalancer>();
		if (loadBalancers!=null) {
			getLoadBalancers().addAll(loadBalancers);
		}
		return this;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("[loadBalancers=");
		builder.append(loadBalancers);
		builder.append("]");
		return builder.toString();
	}

}
