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
package com.nifty.cloud.sdk.dashboard.model;

import java.util.ArrayList;
import java.util.List;

import com.nifty.cloud.sdk.dashboard.model.transform.InstanceItemSetConverter;
import com.nifty.cloud.sdk.dashboard.model.transform.PremiumSupportSetConverter;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamConverter;

/**
 * リソース情報クラス。<br />
 * このクラスはリソース情報を格納します。
 */
public class Resources {

	/** サーバー情報リスト */
	@XStreamAlias("instanceItemSet")
	@XStreamConverter(InstanceItemSetConverter.class)
	private List<ResourceInstance> instances;

	/** 動的IP数 */
	@XStreamAlias("dynamicIpCount")
	private Integer dynamicIpCount;

	/** カスタマイズイメージ数 */
	@XStreamAlias("customizeImageCount")
	private Integer customizeImageCount;

	/** 追加ディスク数 */
	@XStreamAlias("addDiskCount")
	private Integer addDiskCount;

	/** 追加ディスク総容量 */
	@XStreamAlias("addDiskTotalSize")
	private Integer addDiskTotalSize;

	/** ネットワーク転送量 */
	@XStreamAlias("networkFlowAmount")
	private Integer networkFlowAmount;

	/** ファイアウォールグループ数 */
	@XStreamAlias("securityGroupCount")
	private Integer securityGroupCount;

	/** ロードバランサーVIP数 */
	@XStreamAlias("loadBalancerCount")
	private Integer loadBalancerCount;

	/** SSL証明書数 */
	@XStreamAlias("sslCertCount")
	private Integer sslCertCount;

	/** 監視設定ルール数 */
	@XStreamAlias("monitoringRuleCount")
	private Integer monitoringRuleCount;

	/** オートスケール設定数 */
	@XStreamAlias("autoScaleCount")
	private Integer autoScaleCount;

	/** プライベートLAN設定数 */
	@XStreamAlias("privateLanCount")
	private Integer privateLanCount;

	/** プレミアムサポート情報リスト */
	@XStreamAlias("premiumSupportSet")
	@XStreamConverter(PremiumSupportSetConverter.class)
	private List<String> premiumSupports;

	/**
	 * サーバー情報リストを取得します。
	 * 
	 * @return サーバー情報リスト
	 */
	public List<ResourceInstance> getInstances() {
		return instances;
	}

	/**
	 * サーバー情報リストを設定します。
	 * 
	 * @param instances サーバー情報リスト
	 */
	public void setInstances(List<ResourceInstance> instances) {
		this.instances = instances;
	}

	/**
	 * サーバー情報の配列を設定し、自オブジェクトを返します。
	 * 
	 * @param instances サーバー情報の配列
	 * @return 自オブジェクト
	 */
	public Resources withInstances(ResourceInstance... instances) {
		if (this.instances == null) this.instances = new ArrayList<ResourceInstance>();
		for (ResourceInstance instance : instances) {
			getInstances().add(instance);
		}
		return this;
	}

	/**
	 * サーバー情報リストを設定し、自オブジェクトを返します。
	 * 
	 * @param instances サーバー情報リスト
	 * @return 自オブジェクト
	 */
	public Resources withInstances(List<ResourceInstance> instances) {
		if (this.instances == null) this.instances = new ArrayList<ResourceInstance>(); 
		if (instances != null) {
			getInstances().addAll(instances);
		}
		return this;
	}

	/**
	 * 動的IP数を取得します。
	 * 
	 * @return 動的IP数
	 */
	public Integer getDynamicIpCount() {
		return dynamicIpCount;
	}

	/**
	 * 動的IP数を設定します。
	 * 
	 * @param dynamicIpCount 動的IP数
	 */
	public void setDynamicIpCount(Integer dynamicIpCount) {
		this.dynamicIpCount = dynamicIpCount;
	}

	/**
	 * 動的IP数を設定し、自オブジェクトを返します。
	 * 
	 * @param dynamicIpCount 動的IP数
	 * @return 自オブジェクト
	 */
	public Resources withDynamicIpCount(Integer dynamicIpCount) {
		setDynamicIpCount(dynamicIpCount);
		return this;
	}

	/**
	 * カスタマイズイメージ数を取得します。
	 * 
	 * @return カスタマイズイメージ数
	 */
	public Integer getCustomizeImageCount() {
		return customizeImageCount;
	}

	/**
	 * カスタマイズイメージ数を設定します。
	 * 
	 * @param customizeImageCount カスタマイズイメージ数
	 */
	public void setCustomizeImageCount(Integer customizeImageCount) {
		this.customizeImageCount = customizeImageCount;
	}

	/**
	 * カスタマイズイメージ数を設定し、自オブジェクトを返します。
	 * 
	 * @param customizeImageCount カスタマイズイメージ数
	 * @return 自オブジェクト
	 */
	public Resources withCustomizeImageCount(Integer customizeImageCount) {
		setCustomizeImageCount(customizeImageCount);
		return this;
	}

	/**
	 * 追加ディスク数を取得します。
	 * 
	 * @return 追加ディスク数
	 */
	public Integer getAddDiskCount() {
		return addDiskCount;
	}

	/**
	 * 追加ディスク数を設定します。
	 * 
	 * @param addDiskCount 追加ディスク数
	 */
	public void setAddDiskCount(Integer addDiskCount) {
		this.addDiskCount = addDiskCount;
	}

	/**
	 * 追加ディスク数を設定し、自オブジェクトを返します。
	 * 
	 * @param addDiskCount 追加ディスク数
	 * @return 自オブジェクト
	 */
	public Resources withAddDiskCount(Integer addDiskCount) {
		setAddDiskCount(addDiskCount);
		return this;
	}

	/**
	 * 追加ディスク総容量を取得します。
	 * 
	 * @return 追加ディスク総容量
	 */
	public Integer getAddDiskTotalSize() {
		return addDiskTotalSize;
	}

	/**
	 * 追加ディスク総容量設定します。
	 * 
	 * @param addDiskTotalSize 追加ディスク総容量
	 */
	public void setAddDiskTotalSize(Integer addDiskTotalSize) {
		this.addDiskTotalSize = addDiskTotalSize;
	}

	/**
	 * 追加ディスク総容量を設定し、自オブジェクトを返します。
	 * 
	 * @param addDiskTotalSize 追加ディスク総容量
	 * @return 自オブジェクト
	 */
	public Resources withAddDiskTotalSize(Integer addDiskTotalSize) {
		setAddDiskTotalSize(addDiskTotalSize);
		return this;
	}

	/**
	 * ネットワーク転送量を取得します。
	 * 
	 * @return ネットワーク転送量
	 */
	public Integer getNetworkFlowAmount() {
		return networkFlowAmount;
	}

	/**
	 * ネットワーク転送量を設定します。
	 * 
	 * @param networkFlowAmount ネットワーク転送量
	 */
	public void setNetworkFlowAmount(Integer networkFlowAmount) {
		this.networkFlowAmount = networkFlowAmount;
	}

	/**
	 * ネットワーク転送量を設定し、自オブジェクトを返します。
	 * 
	 * @param networkFlowAmount ネットワーク転送量
	 * @return 自オブジェクト
	 */
	public Resources withNetworkFlowAmount(Integer networkFlowAmount) {
		setNetworkFlowAmount(networkFlowAmount);
		return this;
	}

	/**
	 * ファイアウォールグループ数を取得します。
	 * 
	 * @return ファイアウォールグループ数
	 */
	public Integer getSecurityGroupCount() {
		return securityGroupCount;
	}

	/**
	 * ファイアウォールグループ数を設定します。
	 * 
	 * @param securityGroupCount ファイアウォールグループ数
	 */
	public void setSecurityGroupCount(Integer securityGroupCount) {
		this.securityGroupCount = securityGroupCount;
	}

	/**
	 * ファイアウォールグループ数を設定し、自オブジェクトを返します。
	 * 
	 * @param securityGroupCount ファイアウォールグループ数
	 * @return 自オブジェクト
	 */
	public Resources withSecurityGroupCount(Integer securityGroupCount) {
		setSecurityGroupCount(securityGroupCount);
		return this;
	}

	/**
	 * ロードバランサーVIP数を取得します。
	 * 
	 * @return ロードバランサーVIP数
	 */
	public Integer getLoadBalancerCount() {
		return loadBalancerCount;
	}

	/**
	 * ロードバランサーVIP数を設定します。
	 * 
	 * @param loadBalancerCount ロードバランサーVIP数
	 */
	public void setLoadBalancerCount(Integer loadBalancerCount) {
		this.loadBalancerCount = loadBalancerCount;
	}

	/**
	 * ロードバランサーVIP数を設定し、自オブジェクトを返します。
	 * 
	 * @param loadBalancerCount ロードバランサーVIP数
	 * @return 自オブジェクト
	 */
	public Resources withLoadBalancerCount(Integer loadBalancerCount) {
		setLoadBalancerCount(loadBalancerCount);
		return this;
	}

	/**
	 * SSL証明書数を取得します。
	 * 
	 * @return SSL証明書数
	 */
	public Integer getSslCertCount() {
		return sslCertCount;
	}

	/**
	 * SSL証明書数設定します。
	 * 
	 * @param sslCertCount SSL証明書数
	 */
	public void setSslCertCount(Integer sslCertCount) {
		this.sslCertCount = sslCertCount;
	}

	/**
	 * SSL証明書数を設定し、自オブジェクトを返します。
	 * 
	 * @param sslCertCount SSL証明書数
	 * @return 自オブジェクト
	 */
	public Resources withSslCertCount(Integer sslCertCount) {
		setSslCertCount(sslCertCount);
		return this;
	}

	/**
	 * 監視設定ルール数を取得します。
	 * 
	 * @return 監視設定ルール数
	 */
	public Integer getMonitoringRuleCount() {
		return monitoringRuleCount;
	}

	/**
	 * 監視設定ルール数設定します。
	 * 
	 * @param monitoringRuleCount 監視設定ルール数
	 */
	public void setMonitoringRuleCount(Integer monitoringRuleCount) {
		this.monitoringRuleCount = monitoringRuleCount;
	}
	
	/**
	 * 監視設定ルール数設定し、自オブジェクトを返します。
	 * 
	 * @param monitoringRuleCount 監視設定ルール数
	 * @return 自オブジェクト
	 */
	public Resources withMonitoringRuleCount(Integer monitoringRuleCount) {
		setMonitoringRuleCount(monitoringRuleCount);
		return this;
	}

	/**
	 * オートスケール設定数を取得します。
	 * 
	 * @return オートスケール設定数
	 */
	public Integer getAutoScaleCount() {
		return autoScaleCount;
	}

	/**
	 * オートスケール設定数を設定します。
	 * 
	 * @param autoScaleCount オートスケール設定数
	 */
	public void setAutoScaleCount(Integer autoScaleCount) {
		this.autoScaleCount = autoScaleCount;
	}

	/**
	 * オートスケール設定数を設定し、自オブジェクトを返します。
	 * 
	 * @param autoScaleCount オートスケール設定数
	 * @return 自オブジェクト
	 */
	public Resources withAutoScaleCount(Integer autoScaleCount) {
		setAutoScaleCount(autoScaleCount);
		return this;
	}

	/**
	 * プライベートLAN設定数を取得します。
	 * 
	 * @return プライベートLAN設定数
	 */
	public Integer getPrivateLanCount() {
		return privateLanCount;
	}

	/**
	 * プライベートLAN設定数設定します。
	 * 
	 * @param privateLanCount プライベートLAN設定数
	 */
	public void setPrivateLanCount(Integer privateLanCount) {
		this.privateLanCount = privateLanCount;
	}
	
	/**
	 * プライベートLAN設定数を設定し、自オブジェクトを返します。
	 * 
	 * @param privateLanCount プライベートLAN設定数
	 */
	public Resources withPrivateLanCount(Integer privateLanCount) {
		setPrivateLanCount(privateLanCount);
		return this;
	}

	/**
	 * プレミアムサポート情報リストを取得します。
	 * 
	 * @return プレミアムサポート情報リスト
	 */
	public List<String> getPremiumSupports() {
		return premiumSupports;
	}

	/**
	 * プレミアムサポート情報リストを設定します。
	 * 
	 * @param premiumSupports プレミアムサポート情報リスト
	 */
	public void setPremiumSupports(List<String> premiumSupports) {
		this.premiumSupports = premiumSupports;
	}

	/**
	 * プレミアムサポート情報の配列を設定し、自オブジェクトを返します。
	 * 
	 * @param premiumSupports プレミアム背ポート情報の配列
	 * @return 自オブジェクト
	 */
	public Resources withPremiumSupports(String... premiumSupports) {
		if (this.premiumSupports == null) this.premiumSupports = new ArrayList<String>();
		for (String premiumSupport : premiumSupports) {
			getPremiumSupports().add(premiumSupport);
		}
		return this;
	}

	/**
	 * プレミアムサポート情報リストを設定し、自オブジェクトを返します。
	 * 
	 * @param premiumSupports プレミアムサポート情報リスト
	 * @return 自オブジェクト
	 */
	public Resources withPremiumSupports(List<String> premiumSupports) {
		if (this.premiumSupports == null) this.premiumSupports = new ArrayList<String>();
		if (premiumSupports != null) {
			getPremiumSupports().addAll(premiumSupports);
		}
		return this;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("[instances=");
		builder.append(instances);
		builder.append(", dynamicIpCount=");
		builder.append(dynamicIpCount);
		builder.append(", customizeImageCount=");
		builder.append(customizeImageCount);
		builder.append(", addDiskCount=");
		builder.append(addDiskCount);
		builder.append(", addDiskTotalSize=");
		builder.append(addDiskTotalSize);
		builder.append(", networkFlowAmount=");
		builder.append(networkFlowAmount);
		builder.append(", securityGroupCount=");
		builder.append(securityGroupCount);
		builder.append(", loadBalancerCount=");
		builder.append(loadBalancerCount);
		builder.append(", sslCertCount=");
		builder.append(sslCertCount);
		builder.append(", monitoringRuleCount=");
		builder.append(monitoringRuleCount);
		builder.append(", autoScaleCount=");
		builder.append(autoScaleCount);
		builder.append(", privateLanCount=");
		builder.append(privateLanCount);
		builder.append(", premiumSupports=");
		builder.append(premiumSupports);
		builder.append("]");
		return builder.toString();
	}
}