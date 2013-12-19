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

import com.nifty.cloud.sdk.annotation.Query;

/**
 * ロードバランサーの設定情報クラス。<br />
 * このクラスはロードバランサーの設定情報を格納します。
 */
public class Listener {
	
	/** プロトコル */
	private String	protocol;
	
	/** 待ち受けポート */
	private Integer	loadBalancerPort;
	
	/** 宛先ポート */
	private Integer	instancePort;
	
	/** ロードバランス方式 */
	private String	balancingType;
	
	/** SSL証明書の発行識別子 */
	private String sslCertificateId;
	/**
	 * プロトコルを取得します。
	 * 
	 * @return プロトコル
	 */
	@Query(name="Protocol")
	public String getProtocol() {
		return protocol;
	}
	/**
	 * プロトコルを設定します。
	 * 
	 * @param protocol プロトコル
	 */
	public void setProtocol(String protocol) {
		this.protocol = protocol;
	}
	/**
	 * プロトコルを設定し、自オブジェクトを返します。
	 *
	 * @param protocol プロトコル
	 * @return 自オブジェクト
	 */
	public Listener withProtocol(String protocol) {
		setProtocol(protocol);
		return this;
	}
	
	/**
	 * 待ち受けポートを取得します。
	 * 
	 * @return 待ち受けポート
	 */
	@Query(name="LoadBalancerPort")
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
	public Listener withLoadBalancerPort(Integer loadBalancerPort) {
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
	public Listener withInstancePort(Integer instancePort) {
		setInstancePort(instancePort);
		return this;
	}
	
	/**
	 * ロードバランス方式を取得します。
	 * 
	 * @return ロードバランス方式
	 */
	@Query(name="BalancingType")
	public String getBalancingType() {
		return balancingType;
	}
	/**
	 * ロードバランス方式を設定します。
	 * 
	 * @param balancingType ロードバランス方式
	 */
	public void setBalancingType(String balancingType) {
		this.balancingType = balancingType;
	}
	/**
	 * ロードバランス方式を設定し、自オブジェクトを返します。
	 *
	 * @param balancingType ロードバランス方式
	 * @return 自オブジェクト
	 */
	public Listener withBalancingType(String balancingType) {
		setBalancingType(balancingType);
		return this;
	}
	
	/**
	 * SSL証明書の発行識別子を取得します。
	 * 
	 * @return SSL証明書の発行識別子
	 */
	@Query(name="SSLCertificateId")
	public String getSslCertificateId() {
		return sslCertificateId;
	}
	/**
	 * SSL証明書の発行識別子を設定します。
	 * 
	 * @param sslCertificateId SSL証明書の発行識別子
	 */
	public void setSslCertificateId(String sslCertificateId) {
		this.sslCertificateId = sslCertificateId;
	}
	/**
	 * SSL証明書の発行識別子を設定し、自オブジェクトを返します。
	 *
	 * @param sslCertificateId SSL証明書の発行識別子
	 * @return 自オブジェクト
	 */
	public Listener withSslCertificateId(String sslCertificateId) {
		setSslCertificateId(sslCertificateId);
		return this;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("[protocol=");
		builder.append(protocol);
		builder.append(", loadBalancerPort=");
		builder.append(loadBalancerPort);
		builder.append(", instancePort=");
		builder.append(instancePort);
		builder.append(", balancingType=");
		builder.append(balancingType);
		builder.append(", sslCertificateId=");
		builder.append(sslCertificateId);
		builder.append("]");
		return builder.toString();
	}
	
}
