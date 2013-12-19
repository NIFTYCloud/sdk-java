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
 *  API Version: 1.16
 *  Date: 2013-10-18 17:00:00
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
 * SetFilterForLoadBalancerリクエストクラス。<br />
 * このクラスはSetFilterForLoadBalancerへのリクエストを構築します。
 */
@Action("SetFilterForLoadBalancer")
public class SetFilterForLoadBalancerRequest implements Request {
	
	/** ロードバランサー名 */
	private String loadBalancerName;
	
	/** 待ち受けポート */
	private Integer loadBalancerPort;
	
	/** 宛先ポート */
	private Integer instancePort;
	
	/** アクセス元IPアドレスの情報リスト */
	private List<IpAddress> ipAddresses;
	
	/** 指定したアクセス元IPアドレスへの対処  */
	private String filterType;
	
	/**
	 * デフォルトコンストラクタ。
	 */
	public SetFilterForLoadBalancerRequest() {
	}
	
	/**
	 * ロードバランサー名、待ち受けポート、宛先ポートを指定し、SetFilterForLoadBalancerRequestを構築します。
	 * @param loadBalancerName ロードバランサー名
	 * @param loadBalancerPort 待ち受けポート
	 * @param instancePort 宛先ポート
	 */
	public SetFilterForLoadBalancerRequest(String loadBalancerName,	Integer loadBalancerPort, Integer instancePort) {
		this.loadBalancerName = loadBalancerName;
		this.loadBalancerPort = loadBalancerPort;
		this.instancePort = instancePort;
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
	public SetFilterForLoadBalancerRequest withLoadBalancerName(String loadBalancerName) {
		setLoadBalancerName(loadBalancerName);
		return this;
	}
	
	/**
	 * 待ち受けポートを取得します。
	 * 
	 * @return 待ち受けポート
	 */
	@Query(name="LoadBalancerPort", require=true)		
	public Integer getLoadBalancerPort() {
		return loadBalancerPort;
	}
	/**
	 * 待ち受けポートを設定します。
	 * 
	 * @param loadBalancerPort 待ち受けポート
	 */
	public void setLoadBalancerPort(Integer loadBalancerPort) {
		this.loadBalancerPort = loadBalancerPort;
	}
	/**
	 * 待ち受けポートを設定し、自オブジェクトを返します。
	 *
	 * @param loadBalancerPort 待ち受けポート
	 * @return 自オブジェクト
	 */
	public SetFilterForLoadBalancerRequest withLoadBalancerPort(Integer loadBalancerPort) {
		setLoadBalancerPort(loadBalancerPort);
		return this;
	}
	
	/**
	 * 宛先ポートを取得します。
	 * 
	 * @return 宛先ポート
	 */
	@Query(name="InstancePort", require=true)		
	public Integer getInstancePort() {
		return instancePort;
	}
	/**
	 * 宛先ポートを設定します。
	 * 
	 * @param instancePort 宛先ポート
	 */
	public void setInstancePort(Integer instancePort) {
		this.instancePort = instancePort;
	}
	/**
	 * 宛先ポートを設定し、自オブジェクトを返します。
	 *
	 * @param instancePort 宛先ポート
	 * @return 自オブジェクト
	 */
	public SetFilterForLoadBalancerRequest withInstancePort(Integer instancePort) {
		setInstancePort(instancePort);
		return this;
	}
	
	/**
	 * アクセス元IPアドレスの情報リストを取得します。
	 * 
	 * @return アクセス元IPアドレスの情報リスト
	 */
	@Query(name="IPAddresses.member")		
	public List<IpAddress> getIpAddresses() {
		return ipAddresses;
	}
	/**
	 * アクセス元IPアドレスの情報リストを設定します。
	 * 
	 * @param ipAddresses アクセス元IPアドレスの情報リスト
	 */
	public void setIpAddresses(List<IpAddress> ipAddresses) {
		this.ipAddresses = ipAddresses;
	}
	/**
	 * アクセス元IPアドレスの情報の配列を設定し、自オブジェクトを返します。
	 *
	 * @param ipAddresses アクセス元IPアドレスの情報の配列
	 * @return 自オブジェクト
	 */
	public SetFilterForLoadBalancerRequest withIpAddresses(IpAddress ... ipAddresses) {
		if(this.ipAddresses == null) this.ipAddresses = new ArrayList<IpAddress>();
		for(IpAddress ipAddress: ipAddresses) {
			getIpAddresses().add(ipAddress);
		}
		return this;
	}
	/**
	 * アクセス元IPアドレスの情報リストを設定し、自オブジェクトを返します。
	 *
	 * @param ipAddresses アクセス元IPアドレスの情報リスト
	 * @return 自オブジェクト
	 */
	public SetFilterForLoadBalancerRequest withIpAddresses(Collection<IpAddress> ipAddresses) {
		if(this.ipAddresses == null) this.ipAddresses = new ArrayList<IpAddress>();
		if (ipAddresses != null) {
			getIpAddresses().addAll(ipAddresses);
		}
		return this;
	}

	/**
	 * 指定したアクセス元IPアドレスへの対処を取得します。
	 * 
	 * @return 指定したアクセス元IPアドレスへの対処
	 */
	@Query(name="FilterType")		
	public String getFilterType() {
		return filterType;
	}
	/**
	 * 指定したアクセス元IPアドレスへの対処を設定します。
	 * 
	 * @param filterType 指定したアクセス元IPアドレスへの対処
	 */
	public void setFilterType(String filterType) {
		this.filterType = filterType;
	}
	/**
	 * 指定したアクセス元IPアドレスへの対処を設定し、自オブジェクトを返します。
	 *
	 * @param filterType 指定したアクセス元IPアドレスへの対処
	 * @return 自オブジェクト
	 */
	public SetFilterForLoadBalancerRequest withFilterType(String filterType) {
		setFilterType(filterType);
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
		builder.append(", loadBalancerPort=");
		builder.append(loadBalancerPort);
		builder.append(", instancePort=");
		builder.append(instancePort);
		builder.append(", ipAddresses=");
		builder.append(ipAddresses);
		builder.append(", filterType=");
		builder.append(filterType);
		builder.append("]");
		return builder.toString();
	}

}
