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
import java.util.Date;
import java.util.List;

/**
 * ロードバランサー情報クラス。<br />
 * このクラスはロードバランサー情報を格納します。
 */
public class LoadBalancerDescription {
	
	/** ロードバランサー名 */
	private String loadBalancerName;
	
	/** グローバルIPアドレス */
	private String dNSName;
	
	/** 最大ネットワーク流量 */
	private Integer networkVolume;
	
	/** ロードバランサーの設定情報リスト */
	private List<ListenerDescription> listenerDescriptions;
	
	private Policies policies;
	
	/** ゾーン名リスト */
	private List<String> availabilityZones;
	
	/** 設定されているサーバー情報リスト */
	private List<Instance> instances;
	
	/** ヘルスチェック情報 */
	private HealthCheck healthCheck;
	
	/** フィルター情報 */
	private Filter filter;
	
	/** 作成日時 */
	private Date createdTime;
	
	/** 当月の利用料金タイプ */
	private String accountingType;
	
	/** 次月からの利用料金タイプ */
	private String nextMonthAccountingType;
	
	/** ロードバランサーオプション情報 */
	private LoadBalancerOption option;
	/**
	 * ロードバランサー名を取得します。
	 * 
	 * @return ロードバランサー名
	 */
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
	public LoadBalancerDescription withLoadBalancerName(String loadBalancerName) {
		setLoadBalancerName(loadBalancerName);
		return this;
	}
	
	/**
	 * グローバルIPアドレスを取得します。
	 * 
	 * @return グローバルIPアドレス
	 */
	public String getDNSName() {
		return dNSName;
	}
	/**
	 * グローバルIPアドレスを設定します。
	 * 
	 * @param dNSName グローバルIPアドレス
	 */
	public void setDNSName(String dNSName) {
		this.dNSName = dNSName;
	}
	/**
	 * グローバルIPアドレスを設定し、自オブジェクトを返します。
	 *
	 * @param dNSName グローバルIPアドレス
	 * @return 自オブジェクト
	 */
	public LoadBalancerDescription withDNSName(String dNSName) {
		setDNSName(dNSName);
		return this;
	}
	
	/**
	 * 最大ネットワーク流量を取得します。
	 * 
	 * @return 最大ネットワーク流量
	 */
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
	public LoadBalancerDescription withNetworkVolume(Integer networkVolume) {
		setNetworkVolume(networkVolume);
		return this;
	}
	
	/**
	 * ロードバランサーの設定情報リストを取得します。
	 * 
	 * @return ロードバランサーの設定情報リスト
	 */
	public List<ListenerDescription> getListenerDescriptions() {
		return listenerDescriptions;
	}
	/**
	 * ロードバランサーの設定情報リストを設定します。
	 * 
	 * @param listenerDescriptions ロードバランサーの設定情報リスト
	 */
	public void setListenerDescriptions(
			List<ListenerDescription> listenerDescriptions) {
		this.listenerDescriptions = listenerDescriptions;
	}
	/**
	 * ロードバランサーの設定情報の配列を設定し、自オブジェクトを返します。
	 *
	 * @param listenerDescriptions ロードバランサーの設定情報の配列
	 * @return 自オブジェクト
	 */
	public LoadBalancerDescription withListenerDescriptions(ListenerDescription ... listenerDescriptions) {
		if(this.listenerDescriptions == null) this.listenerDescriptions = new ArrayList<ListenerDescription>();
		for (ListenerDescription listenerDescription: listenerDescriptions) {
			getListenerDescriptions().add(listenerDescription);
		}
		return this;
	}
	/**
	 * ロードバランサーの設定情報リストを設定し、自オブジェクトを返します。
	 *
	 * @param listenerDescriptions ロードバランサーの設定情報リスト
	 * @return 自オブジェクト
	 */
	public LoadBalancerDescription withListenerDescriptions(Collection<ListenerDescription> listenerDescriptions) {
		if(this.listenerDescriptions == null) this.listenerDescriptions = new ArrayList<ListenerDescription>();
		if (listenerDescriptions!=null) {
			getListenerDescriptions().addAll(listenerDescriptions);
		}
		return this;
	}
	
	/**
	 * policiesを取得します。
	 * 
	 * @return policies
	 */
	public Policies getPolicies() {
		return policies;
	}
	/**
	 * policiesを設定します。
	 * 
	 * @param policies
	 */
	public void setPolicies(Policies policies) {
		this.policies = policies;
	}
	/**
	 * policiesを設定し、自オブジェクトを返します。
	 *
	 * @param policies
	 * @return 自オブジェクト
	 */
	public LoadBalancerDescription withPolicies(Policies policies) {
		setPolicies(policies);
		return this;
	}
	
	/**
	 * ゾーン名リストを取得します。
	 * 
	 * @return ゾーン名リスト
	 */
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
	public LoadBalancerDescription withAvailabilityZones(String ... availabilityZones) {
		if(this.availabilityZones == null) this.availabilityZones = new ArrayList<String>();
		for (String availabilityZone: availabilityZones) {
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
	public LoadBalancerDescription withAvailabilityZones(Collection<String> availabilityZones) {
		if(this.availabilityZones == null) this.availabilityZones = new ArrayList<String>();
		if (availabilityZones!=null) {
			getAvailabilityZones().addAll(availabilityZones);
		}
		return this;
	}
	
	/**
	 * 設定されているサーバー情報リストを取得します。
	 * 
	 * @return 設定されているサーバー情報リスト
	 */
	public List<Instance> getInstances() {
		return instances;
	}
	/**
	 * 設定されているサーバー情報リストを設定します。
	 * 
	 * @param instances 設定されているサーバー情報リスト
	 */
	public void setInstances(List<Instance> instances) {
		this.instances = instances;
	}
	/**
	 * 設定されているサーバー情報の配列を設定し、自オブジェクトを返します。
	 *
	 * @param instances 設定されているサーバー情報の配列
	 * @return 自オブジェクト
	 */
	public LoadBalancerDescription withInstances(Instance ... instances) {
		if(this.instances == null) this.instances = new ArrayList<Instance>();
		for(Instance instance: instances) {
			getInstances().add(instance);
		}
		return this;
	}
	/**
	 * 設定されているサーバー情報リストを設定し、自オブジェクトを返します。
	 *
	 * @param instances 設定されているサーバー情報リスト
	 * @return 自オブジェクト
	 */
	public LoadBalancerDescription withInstances(Collection<Instance> instances) {
		if(this.instances == null) this.instances = new ArrayList<Instance>();
		if (instances!=null) {
			getInstances().addAll(instances);
		}
		return this;
	}
	
	/**
	 * ヘルスチェック情報を取得します。
	 * 
	 * @return ヘルスチェック情報
	 */
	public HealthCheck getHealthCheck() {
		return healthCheck;
	}
	/**
	 * ヘルスチェック情報を設定します。
	 * 
	 * @param healthCheck ヘルスチェック情報
	 */
	public void setHealthCheck(HealthCheck healthCheck) {
		this.healthCheck = healthCheck;
	}
	/**
	 * ヘルスチェック情報を設定し、自オブジェクトを返します。
	 *
	 * @param healthCheck ヘルスチェック情報
	 * @return 自オブジェクト
	 */
	public LoadBalancerDescription withHealthCheck(HealthCheck healthCheck) {
		setHealthCheck(healthCheck);
		return this;
	}
	
	/**
	 * フィルター情報を取得します。
	 * 
	 * @return フィルター情報
	 */
	public Filter getFilter() {
		return filter;
	}
	/**
	 * フィルター情報を設定します。
	 * 
	 * @param filter フィルター情報
	 */
	public void setFilter(Filter filter) {
		this.filter = filter;
	}
	/**
	 * フィルター情報を設定し、自オブジェクトを返します。
	 *
	 * @param filter フィルター情報
	 * @return 自オブジェクト
	 */
	public LoadBalancerDescription withFilter(Filter filter) {
		setFilter(filter);
		return this;
	}
	
	/**
	 * 作成日時を取得します。
	 * 
	 * @return 作成日時
	 */
	public Date getCreatedTime() {
		return createdTime;
	}
	/**
	 * 作成日時を設定します。
	 * 
	 * @param createdTime 作成日時
	 */
	public void setCreatedTime(Date createdTime) {
		this.createdTime = createdTime;
	}
	/**
	 * 作成日時を設定し、自オブジェクトを返します。
	 *
	 * @param createdTime 作成日時
	 * @return 自オブジェクト
	 */
	public LoadBalancerDescription withCreatedTime(Date createdTime) {
		setCreatedTime(createdTime);
		return this;
	}
	
	/**
	 * 当月の利用料金タイプを取得します。
	 * 
	 * @return 当月の利用料金タイプ
	 */
	public String getAccountingType() {
		return accountingType;
	}
	/**
	 * 当月の利用料金タイプを設定します。
	 * 
	 * @param accountingType 当月の利用料金タイプ
	 */
	public void setAccountingType(String accountingType) {
		this.accountingType = accountingType;
	}
	/**
	 * 当月の利用料金タイプを設定し、自オブジェクトを返します。
	 *
	 * @param accountingType 当月の利用料金タイプ
	 * @return 自オブジェクト
	 */
	public LoadBalancerDescription withAccountingType(String accountingType) {
		setAccountingType(accountingType);
		return this;
	}
	/**
	 * 次月からの利用料金タイプを取得します。
	 * 
	 * @return 次月からの利用料金タイプ
	 */
	public String getNextMonthAccountingType() {
		return nextMonthAccountingType;
	}
	/**
	 * 次月からの利用料金タイプを設定します。
	 * 
	 * @param nextMonthAccountingType 次月からの利用料金タイプ
	 */
	public void setNextMonthAccountingType(String nextMonthAccountingType) {
		this.nextMonthAccountingType = nextMonthAccountingType;
	}
	/**
	 * 次月からの利用料金タイプを設定し、自オブジェクトを返します。
	 *
	 * @param nextMonthAccountingType 次月からの利用料金タイプ
	 * @return 自オブジェクト
	 */
	public LoadBalancerDescription withNextMonthAccountingType(String nextMonthAccountingType) {
		setNextMonthAccountingType(nextMonthAccountingType);
		return this;
	}

	/**
	 * ロードバランサーオプション情報を取得します。
	 * @return ロードバランサーオプション情報
	 */
	public LoadBalancerOption getOption() {
		return option;
	}
	/**
	 * ロードバランサーオプション情報を設定します。
	 * @param option ロードバランサーオプション情報
	 */
	public void setOption(LoadBalancerOption option) {
		this.option = option;
	}
	/**
	 * ロードバランサーオプション情報を設定し、自オブジェクトを返します。
	 * @param option ロードバランサーオプション情報
	 * @return 自オブジェクト
	 */
	public LoadBalancerDescription withOption(LoadBalancerOption option) {
		setOption(option);
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
		builder.append(", dNSName=");
		builder.append(dNSName);
		builder.append(", networkVolume=");
		builder.append(networkVolume);
		builder.append(", listenerDescriptions=");
		builder.append(listenerDescriptions);
		builder.append(", policies=");
		builder.append(policies);
		builder.append(", availabilityZones=");
		builder.append(availabilityZones);
		builder.append(", instances=");
		builder.append(instances);
		builder.append(", healthCheck=");
		builder.append(healthCheck);
		builder.append(", filter=");
		builder.append(filter);
		builder.append(", createdTime=");
		builder.append(createdTime);
		builder.append(", accountingType=");
		builder.append(accountingType);
		builder.append(", nextMonthAccountingType=");
		builder.append(nextMonthAccountingType);
		builder.append(", option=");
		builder.append(option);
		builder.append("]");
		return builder.toString();
	}

}
