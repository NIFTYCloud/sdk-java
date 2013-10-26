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

import com.nifty.cloud.sdk.Request;
import com.nifty.cloud.sdk.annotation.Action;
import com.nifty.cloud.sdk.annotation.Query;

/**
 * RegisterPortWithLoadBalancerリクエストクラス。<br />
 * このクラスはRegisterPortWithLoadBalancerへのリクエストを構築します。
 */
@Action("RegisterPortWithLoadBalancer")
public class RegisterPortWithLoadBalancerRequest implements Request {
	
	/** ロードバランサー名 */
	private String loadBalancerName;
	
	/** ポート情報リスト */
	private List<Listener> listeners;

	/**
	 * デフォルトコンストラクタ。
	 */
	public RegisterPortWithLoadBalancerRequest() {
	}
	
	/**
	 * ロードバランサー名を指定し、RegisterPortWithLoadBalancerRequestを構築します。
	 * 
	 * @param loadBalancerName ロードバランサー名
	 */
	public RegisterPortWithLoadBalancerRequest(String loadBalancerName) {
		this.loadBalancerName = loadBalancerName;
	}
	
	
	/**
	 * ロードバランサー名を取得します。
	 * 
	 * @return ロードバランサー名
	 */
	@Query(name="LoadBalancerName", require=true)	
	public String getLoadBalancerName() {
		return loadBalancerName;
	}
	/**
	 * ロードバランサー名を設定します。
	 * 
	 * @param loadBalancerName ロードバランサー名
	 */
	public void setLoadBalancerName(String loadBalancerName) {
		this.loadBalancerName = loadBalancerName;
	}
	/**
	 * ロードバランサー名を設定し、自オブジェクトを返します。
	 *
	 * @param loadBalancerName ロードバランサー名
	 * @return 自オブジェクト
	 */
	public RegisterPortWithLoadBalancerRequest withLoadBalancerName(String loadBalancerName) {
		setLoadBalancerName(loadBalancerName);
		return this;
	}
	
	/**
	 * ポート情報リストを取得します。
	 * 
	 * @return ポート情報リスト
	 */
	@Query(name="Listeners.member")	
	public List<Listener> getListeners() {
		return listeners;
	}
	/**
	 * ポート情報リストを設定します。
	 * 
	 * @param listeners ポート情報リスト
	 */
	public void setListeners(List<Listener> listeners) {
		this.listeners = listeners;
	}
	/**
	 * ポート情報の配列を設定し、自オブジェクトを返します。
	 *
	 * @param listeners ポート情報の配列
	 * @return 自オブジェクト
	 */
	public RegisterPortWithLoadBalancerRequest withListeners(Listener ... listeners) {
		if(this.listeners == null) this.listeners = new ArrayList<Listener>();
		for (Listener listener: listeners) {
			getListeners().add(listener);
		}
		return this;
	}
	/**
	 * ポート情報リストを設定し、自オブジェクトを返します。
	 *
	 * @param listeners ポート情報リスト
	 * @return 自オブジェクト
	 */
	public RegisterPortWithLoadBalancerRequest withListeners(Collection<Listener> listeners) {
		if(this.listeners == null) this.listeners = new ArrayList<Listener>();
		if (listeners != null) {
			getListeners().addAll(listeners);
		}
		return this;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("[loadBalancerName=");
		builder.append(loadBalancerName);
		builder.append(", listeners=");
		builder.append(listeners);
		builder.append("]");
		return builder.toString();
	}

}
