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
package com.nifty.cloud.sdk.loadbalancer.model;

import com.nifty.cloud.sdk.annotation.Query;

/**
 * 変更ポート情報クラス。<br />
 * このクラスはポート情報を格納します。
 */
public class ListenerUpdate {
	
	/** 待ち受けポート */
	private Integer LoadBalancerPort;
	
	/** 宛先ポート */
	private Integer InstancePort;
	
	/** ロードバランサーの更新情報  */
	private Listener listener;
	
	
	/**
	 * 待ち受けポートを取得します。
	 * 
	 * @return 待ち受けポート
	 */
	@Query(name="LoadBalancerPort")	
	public Integer getLoadBalancerPort() {
		return LoadBalancerPort;
	}
	/**
	 * 待ち受けポートを設定します。
	 * 
	 * @param loadBalancerPort 待ち受けポート
	 */
	public void setLoadBalancerPort(Integer loadBalancerPort) {
		LoadBalancerPort = loadBalancerPort;
	}
	/**
	 * 待ち受けポートを設定し、自オブジェクトを返します。
	 *
	 * @param loadBalancerPort 待ち受けポート
	 * @return 自オブジェクト
	 */
	public ListenerUpdate withLoadBalancerPort(Integer loadBalancerPort) {
		setLoadBalancerPort(loadBalancerPort);
		return this;
	}
	
	/**
	 * 宛先ポートを取得します。
	 * 
	 * @return 宛先ポート
	 */
	@Query(name="InstancePort")	
	public Integer getInstancePort() {
		return InstancePort;
	}
	/**
	 * 宛先ポートを設定します。
	 * 
	 * @param instancePort 宛先ポート
	 */
	public void setInstancePort(Integer instancePort) {
		InstancePort = instancePort;
	}
	/**
	 * 宛先ポートを設定し、自オブジェクトを返します。
	 *
	 * @param instancePort 宛先ポート
	 * @return 自オブジェクト
	 */
	public ListenerUpdate withInstancePort(Integer instancePort) {
		setInstancePort(instancePort);
		return this;
	}
	
	/**
	 * ロードバランサーの更新情報を取得します。
	 * 
	 * @return ロードバランサーの更新情報
	 */
	@Query(name="Listener")	
	public Listener getListener() {
		return listener;
	}
	/**
	 * ロードバランサーの更新情報を設定します。
	 * 
	 * @param listener ロードバランサーの更新情報 
	 */
	public void setListener(Listener listener) {
		this.listener = listener;
	}
	/**
	 * ロードバランサーの更新情報を設定し、自オブジェクトを返します。
	 *
	 * @param listener ロードバランサーの更新情報
	 * @return 自オブジェクト
	 */
	public ListenerUpdate withListener(Listener listener) {
		setListener(listener);
		return this;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("[LoadBalancerPort=");
		builder.append(LoadBalancerPort);
		builder.append(", InstancePort=");
		builder.append(InstancePort);
		builder.append(", listener=");
		builder.append(listener);
		builder.append("]");
		return builder.toString();
	}
	
}
