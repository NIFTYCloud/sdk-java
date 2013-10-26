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

import com.nifty.cloud.sdk.Request;
import com.nifty.cloud.sdk.annotation.Action;
import com.nifty.cloud.sdk.annotation.Query;

/**
 * UpdateLoadBalancerOptionリクエストクラス。<br />
 * このクラスはUpdateLoadBalancerOptionへのリクエストを構築します。
 */
@Action("UpdateLoadBalancerOption")
public class UpdateLoadBalancerOptionRequest implements Request{

	/** ロードバランサー名 */
	private String loadBalancerName;
	
	/** 待ち受けポート */
	private Integer loadBalancerPort;
	
	/** 宛先ポート */
	private Integer instancePort;
	
	/** セッション固定オプション設定 */
	private SessionStickinessPolicyUpdate sessionStickinessPolicyUpdate;

	/** Sorryページオプション設定 */
	private SorryPageUpdate sorryPageUpdate;

	/** 携帯キャリアフィルターオプション設定 */
	private MobileFilterUpdate mobileFilterUpdate;
	
	/**
	 * デフォルトコンストラクタ。
	 */
	public UpdateLoadBalancerOptionRequest() {
	}
	/**
	 * ロードバランサー名、待ち受けポート、宛先ポートを指定し、UpdateLoadBalancerOptionRequestを構築します。
	 * @param loadBalancerName ロードバランサー名
	 * @param loadBalancerPort 待ち受けポート
	 * @param instancePort 宛先ポート
	 */
	public UpdateLoadBalancerOptionRequest(String loadBalancerName,	Integer loadBalancerPort, Integer instancePort) {
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
	public UpdateLoadBalancerOptionRequest withLoadBalancerName(String loadBalancerName) {
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
	public UpdateLoadBalancerOptionRequest withLoadBalancerPort(Integer loadBalancerPort) {
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
	public UpdateLoadBalancerOptionRequest withInstancePort(Integer instancePort) {
		setInstancePort(instancePort);
		return this;
	}

	/**
	 * セッション固定オプション設定を取得します。
	 * @return セッション固定オプション設定
	 */
	@Query(name="SessionStickinessPolicyUpdate")
	public SessionStickinessPolicyUpdate getSessionStickinessPolicyUpdate() {
		return sessionStickinessPolicyUpdate;
	}
	/**
	 * セッション固定オプション設定を設定します。
	 * @param sessionStickinessPolicyUpdate セッション固定オプション設定
	 */
	public void setSessionStickinessPolicyUpdate(
			SessionStickinessPolicyUpdate sessionStickinessPolicyUpdate) {
		this.sessionStickinessPolicyUpdate = sessionStickinessPolicyUpdate;
	}
	/**
	 * セッション固定オプション設定を設定し、自オブジェクトを返します。
	 * @param sessionStickinessPolicyUpdate セッション固定オプション設定
	 * @return 自オブジェクト
	 */
	public UpdateLoadBalancerOptionRequest withSessionStickinessPolicyUpdate(
			SessionStickinessPolicyUpdate sessionStickinessPolicyUpdate) {
		setSessionStickinessPolicyUpdate(sessionStickinessPolicyUpdate);
		return this;
	}
	/**
	 * Sorryページオプション設定を取得します。
	 * @return Sorryページオプション設定
	 */
	@Query(name="SorryPageUpdate")
	public SorryPageUpdate getSorryPageUpdate() {
		return sorryPageUpdate;
	}
	/**
	 * Sorryページオプション設定を設定します。
	 * @param sorryPageUpdate Sorryページオプション設定
	 */
	public void setSorryPageUpdate(SorryPageUpdate sorryPageUpdate) {
		this.sorryPageUpdate = sorryPageUpdate;
	}
	/**
	 * Sorryページオプション設定を設定し、自オブジェクトを返します。
	 * @param sorryPageUpdate Sorryページオプション設定
	 * @return 自オブジェクト
	 */
	public UpdateLoadBalancerOptionRequest withSorryPageUpdate(SorryPageUpdate sorryPageUpdate) {
		setSorryPageUpdate(sorryPageUpdate);
		return this;
	}
	/**
	 * 携帯キャリアフィルターオプション設定を取得します。
	 * @return 携帯キャリアフィルターオプション設定
	 */
	@Query(name="MobileFilterUpdate")
	public MobileFilterUpdate getMobileFilterUpdate() {
		return mobileFilterUpdate;
	}
	/**
	 * 携帯キャリアフィルターオプション設定を設定します。
	 * @param mobileFilterUpdate 携帯キャリアフィルターオプション設定
	 */
	public void setMobileFilterUpdate(MobileFilterUpdate mobileFilterUpdate) {
		this.mobileFilterUpdate = mobileFilterUpdate;
	}
	/**
	 * 携帯キャリアフィルターオプション設定を設定し、自オブジェクトを返します。
	 * @param mobileFilterUpdate 携帯キャリアフィルターオプション設定
	 * @return 自オブジェクト
	 */
	public UpdateLoadBalancerOptionRequest withMobileFilterUpdate(MobileFilterUpdate mobileFilterUpdate) {
		setMobileFilterUpdate(mobileFilterUpdate);
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
		builder.append(", sessionStickinessPolicyUpdate=");
		builder.append(sessionStickinessPolicyUpdate);
		builder.append(", sorryPageUpdate=");
		builder.append(sorryPageUpdate);
		builder.append(", mobileFilterUpdate=");
		builder.append(mobileFilterUpdate);
		builder.append("]");
		return builder.toString();
	}
}
