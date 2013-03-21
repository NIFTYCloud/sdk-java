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
 *  Date: 2011-11-10 09:56:54
 * 
 */
package com.nifty.cloud.sdk.loadbalancer.model;

import com.nifty.cloud.sdk.Request;
import com.nifty.cloud.sdk.annotation.Action;
import com.nifty.cloud.sdk.annotation.Query;

/**
 * UpdateLoadBalancerリクエストクラス。<br />
 * このクラスはUpdateLoadBalancerへのリクエストを構築します。
 */
@Action("UpdateLoadBalancer")
public class UpdateLoadBalancerRequest implements Request {
	
	/** ロードバランサー名 */
	private String loadBalancerName;
	
	/** 変更後ポート情報 */
	private ListenerUpdate listenerUpdate;
	
	/** 最大ネットワーク流量  */
	private Integer networkVolume;
	
	/** 利用料金タイプ */
	private String accountingType;
	
	/**
	 * デフォルトコンストラクタ。
	 */
	public UpdateLoadBalancerRequest() {
	}
	
	/**
	 * ロードバランサー名を指定し、UpdateLoadBalancerRequestを構築します。
	 * @param loadBalancerName ロードバランサー名
	 */
	public UpdateLoadBalancerRequest(String loadBalancerName) {
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
	public UpdateLoadBalancerRequest withLoadBalancerName(String loadBalancerName) {
		setLoadBalancerName(loadBalancerName);
		return this;
	}
	
	/**
	 * 変更後ポート情報を取得します。
	 * 
	 * @return 変更後ポート情報
	 */
	@Query(name="ListenerUpdate")		
	public ListenerUpdate getListenerUpdate() {
		return listenerUpdate;
	}
	/**
	 * 変更後ポート情報を設定します。
	 * 
	 * @param listenerUpdate 変更後ポート情報
	 */
	public void setListenerUpdate(ListenerUpdate listenerUpdate) {
		this.listenerUpdate = listenerUpdate;
	}
	/**
	 * 変更後ポート情報を設定し、自オブジェクトを返します。
	 *
	 * @param listenerUpdate 変更後ポート情報
	 * @return 自オブジェクト
	 */
	public UpdateLoadBalancerRequest withListenerUpdate(ListenerUpdate listenerUpdate) {
		setListenerUpdate(listenerUpdate);
		return this;
	}
	
	/**
	 * 最大ネットワーク流量を取得します。
	 * 
	 * @return 最大ネットワーク流量
	 */
	@Query(name="NetworkVolumeUpdate")		
	public Integer getNetworkVolume() {
		return networkVolume;
	}
	/**
	 * 最大ネットワーク流量を設定します。
	 * 
	 * @param networkVolume 最大ネットワーク流量
	 */
	public void setNetworkVolume(Integer networkVolume) {
		this.networkVolume = networkVolume;
	}
	/**
	 * 最大ネットワーク流量を設定し、自オブジェクトを返します。
	 *
	 * @param networkVolume 最大ネットワーク流量
	 * @return 自オブジェクト
	 */
	public UpdateLoadBalancerRequest withNetworkVolume(Integer networkVolume) {
		setNetworkVolume(networkVolume);
		return this;
	}
	/**
	 * 利用料金タイプを取得します。
	 * 
	 * @return 利用料金タイプ
	 */
	@Query(name="AccountingTypeUpdate")
	public String getAccountingType() {
		return accountingType;
	}
	/**
	 * 利用料金タイプを設定します。
	 * 
	 * @param accountingType 利用料金タイプ
	 */
	public void setAccountingType(String accountingType) {
		this.accountingType = accountingType;
	}
	/**
	 * 利用料金タイプを設定し、自オブジェクトを返します。
	 *
	 * @param accountingType 利用料金タイプ
	 * @return 自オブジェクト
	 */
	public UpdateLoadBalancerRequest withAccountingType(String accountingType) {
		setAccountingType(accountingType);
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
		builder.append(", listenerUpdate=");
		builder.append(listenerUpdate);
		builder.append(", networkVolume=");
		builder.append(networkVolume);
		builder.append(", accountingType=");
		builder.append(accountingType);
		builder.append("]");
		return builder.toString();
	}

}
