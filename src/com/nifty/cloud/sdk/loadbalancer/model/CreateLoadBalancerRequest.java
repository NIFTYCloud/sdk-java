/******************************************************************************* 
 *  Copyright 2014 NIFTY Corporation All Rights Reserved.
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
 *  API Version: 1.17
 *  Date: 2014-02-20 17:00:00
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
 * CreateLoadBalancerリクエストクラス。<br />
 * このクラスはCreateLoadBalancerへのリクエストを構築します。
 */
@Action("CreateLoadBalancer")
public class CreateLoadBalancerRequest implements Request {
	
	/** ロードバランサー名 */
	private String	loadBalancerName;
	
	/** ロードバランサーの設定情報リスト */
	private List<Listener>	listeners;
	
	/** ゾーン名リスト */
	private List<String>	availabilityZones;
	
	/** 最大ネットワーク流量 */
	private Integer	networkVolume;
	
	/** VIPのIPアドレスバージョン */
	private String ipVersion;

	/** 利用料金タイプ */
	private String accountingType;

	/**
	 * デフォルトコンストラクタ。
	 */
	public CreateLoadBalancerRequest() {
	}
	
	/**
	 * ロードバランサー名を指定し、CreateLoadBalancerRequestを構築します。
	 * @param loadBalancerName ロードバランサー名
	 */
	public CreateLoadBalancerRequest(String loadBalancerName) {
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
	public CreateLoadBalancerRequest withLoadBalancerName(String loadBalancerName) {
		setLoadBalancerName(loadBalancerName);
		return this;
	}
	
	/**
	 * ロードバランサーの設定情報リストを取得します。
	 * 
	 * @return ロードバランサーの設定情報リスト
	 */
	@Query(name="Listeners.member")
	public List<Listener> getListeners() {
		return listeners;
	}
	/**
	 * ロードバランサーの設定情報をリスト設定します。
	 * 
	 * @param listeners ロードバランサーの設定情報リスト
	 */
	public void setListeners(List<Listener> listeners) {
		this.listeners = listeners;
	}
	/**
	 * ロードバランサーの設定情報の配列を設定し、自オブジェクトを返します。
	 *
	 * @param listeners ロードバランサーの設定情報の配列
	 * @return 自オブジェクト
	 */
	public CreateLoadBalancerRequest withListeners(Listener ... listeners) {
		if(this.listeners == null) this.listeners = new ArrayList<Listener>();
		for(Listener listener: listeners) {
			getListeners().add(listener);
		}
		return this;
	}
	/**
	 * ロードバランサーの設定情報リストを設定し、自オブジェクトを返します。
	 *
	 * @param listeners ロードバランサーの設定情報リスト
	 * @return 自オブジェクト
	 */
	public CreateLoadBalancerRequest withListeners(Collection<Listener> listeners) {
		if(this.listeners == null) this.listeners = new ArrayList<Listener>();
		if (listeners!=null) {
			getListeners().addAll(listeners);
		}
		return this;
	}
	
	/**
	 * ゾーン名リストを取得します。
	 * 
	 * @return ゾーン名リスト
	 */
	@Query(name="AvailabilityZones.member")
	public List<String> getAvailabilityZones() {
		return availabilityZones;
	}
	/**
	 * ゾーン名リストを設定します。
	 * 
	 * @param availabilityZones ゾーン名リスト
	 */
	public void setAvailabilityZones(List<String> availabilityZones) {
		this.availabilityZones = availabilityZones;
	}
	/**
	 * ゾーン名の配列を設定し、自オブジェクトを返します。
	 *
	 * @param availabilityZones ゾーン名の配列
	 * @return 自オブジェクト
	 */
	public CreateLoadBalancerRequest withAvailabilityZones(String ... availabilityZones) {
		if(this.availabilityZones == null) this.availabilityZones = new ArrayList<String>();
		for(String availabilityZone: availabilityZones) {
			getAvailabilityZones().add(availabilityZone);
		}
		return this;
	}
	/**
	 * ゾーン名リストを設定し、自オブジェクトを返します。
	 *
	 * @param availabilityZones ゾーン名リスト
	 * @return 自オブジェクト
	 */
	public CreateLoadBalancerRequest withAvailabilityZones(Collection<String> availabilityZones) {
		if(this.availabilityZones == null) this.availabilityZones = new ArrayList<String>();
		if (availabilityZones!=null) {
			getAvailabilityZones().addAll(availabilityZones);
		}
		return this;
	}
	
	/**
	 * 最大ネットワーク流量を取得します。
	 * 
	 * @return 最大ネットワーク流量
	 */
	@Query(name="NetworkVolume")
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
	public CreateLoadBalancerRequest withNetworkVolume(Integer networkVolume) {
		setNetworkVolume(networkVolume);
		return this;
	}
	
	/**
	 * VIPのIPアドレスバージョンを取得します。
	 * 
	 * @return VIPのIPアドレスバージョン
	 */
	@Query(name="IpVersion")
	public String getIpVersion() {
		return ipVersion;
	}
	/**
	 * VIPのIPアドレスバージョンを設定します。
	 * 
	 * @param ipVersion VIPのIPアドレスバージョン
	 */
	public void setIpVersion(String ipVersion) {
		this.ipVersion = ipVersion;
	}
	/**
	 * VIPのIPアドレスバージョンを設定し、自オブジェクトを返します。
	 *
	 * @param ipVersion VIPのIPアドレスバージョン
	 * @return 自オブジェクト
	 */
	public CreateLoadBalancerRequest withIpVersion(String ipVersion) {
		setIpVersion(ipVersion);
		return this;
	}

	/**
	 * 利用料金タイプを取得します。
	 * @return 利用料金タイプ
	 */
	@Query(name="AccountingType")
	public String getAccountingType() {
		return accountingType;
	}
	/**
	 * 利用料金タイプを設定します。
	 * @param accountingType 利用料金タイプ
	 */
	public void setAccountingType(String accountingType) {
		this.accountingType = accountingType;
	}
	/**
	 * 利用料金タイプを設定し、自オブジェクトを返します。
	 * @param accountingType 利用料金タイプ
	 * @return 自オブジェクト
	 */
	public CreateLoadBalancerRequest withAccountingType(String accountingType) {
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
		builder.append(", listeners=");
		builder.append(listeners);
		builder.append(", availabilityZones=");
		builder.append(availabilityZones);
		builder.append(", networkVolume=");
		builder.append(networkVolume);
		builder.append(", ipVersion=");
		builder.append(ipVersion);
		builder.append(", accountingType=");
		builder.append(accountingType);
		builder.append("]");
		return builder.toString();
	}

}
