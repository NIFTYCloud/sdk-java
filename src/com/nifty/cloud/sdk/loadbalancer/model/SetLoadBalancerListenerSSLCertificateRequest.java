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

import com.nifty.cloud.sdk.Request;
import com.nifty.cloud.sdk.annotation.Action;
import com.nifty.cloud.sdk.annotation.Query;

/**
 * SetLoadBalancerListenerSSLCertificateリクエストクラス。<br />
 * このクラスはSetLoadBalancerListenerSSLCertificateへのリクエストを構築します。
 */
@Action("SetLoadBalancerListenerSSLCertificate")
public class SetLoadBalancerListenerSSLCertificateRequest implements Request{

	/** ロードバランサー名 */
	private String loadBalancerName;
	
	/** 待ち受けポート */
	private Integer loadBalancerPort;
	
	/** 宛先ポート */
	private Integer instancePort;

	/** SSL証明書の発行識別子 */
	private String sslCertificateId;
	
	/**
	 * デフォルトコンストラクタ。
	 */
	public SetLoadBalancerListenerSSLCertificateRequest() {
	}
	/**
	 * ロードバランサー名、待ち受けポート、宛先ポート、SSL証明書の発行識別子を指定し、SetLoadBalancerListenerSSLCertificateRequestを構築します。
	 * @param loadBalancerName ロードバランサー名
	 * @param loadBalancerPort 待ち受けポート
	 * @param instancePort 宛先ポート
	 * @param sslCertificateId SSL証明書の発行識別子
	 */
	public SetLoadBalancerListenerSSLCertificateRequest(String loadBalancerName, Integer loadBalancerPort, Integer instancePort, String sslCertificateId) {
		this.loadBalancerName = loadBalancerName;
		this.loadBalancerPort = loadBalancerPort;
		this.instancePort = instancePort;
		this.sslCertificateId = sslCertificateId;
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
	public SetLoadBalancerListenerSSLCertificateRequest withLoadBalancerName(String loadBalancerName) {
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
	public SetLoadBalancerListenerSSLCertificateRequest withLoadBalancerPort(Integer loadBalancerPort) {
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
	public SetLoadBalancerListenerSSLCertificateRequest withInstancePort(Integer instancePort) {
		setInstancePort(instancePort);
		return this;
	}
	/**
	 * SSL証明書の発行識別子を取得します。
	 * @return SSL証明書の発行識別子
	 */
	@Query(name="SSLCertificateId", require=true)
	public String getSslCertificateId() {
		return sslCertificateId;
	}
	/**
	 * SSL証明書の発行識別子を設定します。
	 * @param sslCertificateId SSL証明書の発行識別子
	 */
	public void setSslCertificateId(String sslCertificateId) {
		this.sslCertificateId = sslCertificateId;
	}
	/**
	 * SSL証明書の発行識別子を設定し、自オブジェクトを返します。
	 * @param sslCertificateId SSL証明書の発行識別子
	 * @return 自オブジェクト
	 */
	public SetLoadBalancerListenerSSLCertificateRequest withSslCertificateId(String sslCertificateId) {
		setSslCertificateId(sslCertificateId);
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
		builder.append(", sslCertificateId=");
		builder.append(sslCertificateId);
		builder.append("]");
		return builder.toString();
	}
}
