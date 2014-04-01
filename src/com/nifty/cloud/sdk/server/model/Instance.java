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
package com.nifty.cloud.sdk.server.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

/**
 * サーバー情報クラス。<br />
 * このクラスはサーバー情報を格納します。
 */
public class Instance {
	
	/** サーバー名 */
	private String	instanceId;
	
	/** OSイメージID */
	private String	imageId;
	
	/** サーバーステータス情報 */
	private InstanceState	state;
	
	/** プライベートIPアドレス */ 
	private String	privateDnsName;
	
	/** グローバルIPアドレス */ 
	private String	dnsName;
	
	/** 異常時のエラーコード  */
	private String	reason;
	
	/** SSHキー名 */
	private String	keyName;
	
	/** 管理者アカウント */
	private String	admin;
	
	private String	amiLaunchIndex;
	
	private List<ProductCode>	productCodes;
	
	/** サーバータイプ */
	private String	instanceType;
	
	/** サーバーの作成日時 */
	private Date	launchTime;
	
	/** ゾーン情報 */
	private Placement	placement;
	
	private String 	kernelId;
	
	private String	ramdiskId;
	
	/** OS種別  */
	private String	platform;
	
	/** 監視情報 */
	private Monitoring	monitoring;
	
	private String	subnetId;
	
	private String	vpcId;
	
	/** プライベートIPアドレス */
	private String	privateIpAddress;
	
	/** グローバルIPアドレス */
	private String	ipAddress;
	
	/** プライベートIPアドレス（IPv6） */
	private String	privateIpAddressV6;
	
	/** グローバルIPアドレス（IPv6） */
	private String	ipAddressV6;
	
	private StateReason	stateReason;
	
	/** OSイメージアーキテクチャ */
	private String	architecture;
	
	/** ディスクの種類 */
	private String	rootDeviceType;
	
	private String	rootDeviceName;
	
	/** 接続しているディスクの情報リスト */
	private List<InstanceBlockDeviceMapping>	blockDeviceMappings;
	
	private String	instanceLifecycle;
	
	private String spotInstanceRequestId;
	
	/** 利用料金タイプ */
	private String	accountingType;

	/** 次月からの利用料金タイプ */
	private String nextMonthAccountingType;

	/** 適用しているロードバランサー情報リスト */
	private List<InstanceLoadBalancerMapping> loadbalancing;
	
	/** コピー元サーバー名 */
	private String	copyInfo;
	
	/** スケールアウトサーバー情報 */
	private InstanceAutoScaleMapping autoscaling;
	
	/** グローバルIPアドレスタイプ */
	private String ipType;
	
	/** プライベートIPアドレスタイプ */
	private String niftyPrivateIpType;

	/** メモ情報 */
	private String description;
	
	/**
	 * サーバー名を取得します。
	 * 
	 * @return サーバー名
	 */
	public String getInstanceId() {
		return instanceId;
	}
	/**
	 * サーバー名を設定します。
	 * 
	 * @param instanceId サーバー名
	 */
	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
	}
	/**
	 * サーバー名を設定し、自オブジェクトを返します。
	 *
	 * @param instanceId サーバー名
	 * @return 自オブジェクト	 
	 */
	public Instance withInstanceId(String instanceId) {
		setInstanceId(instanceId);
		return this;
	}
	
	/**
	 * OSイメージIDを取得します。
	 * 
	 * @return OSイメージID
	 */
	public String getImageId() {
		return imageId;
	}
	/**
	 * OSイメージIDを設定します。
	 * 
	 * @param imageId OSイメージID
	 */
	public void setImageId(String imageId) {
		this.imageId = imageId;
	}
	/**
	 * OSイメージIDを設定し、自オブジェクトを返します。
	 *
	 * @param imageId OSイメージID
	 * @return 自オブジェクト	 
	 */
	public Instance withImageId(String imageId) {
		setImageId(imageId);
		return this;
	}
	
	/**
	 * サーバーステータス情報を取得します。
	 * 
	 * @return サーバーステータス情報
	 */
	public InstanceState getState() {
		return state;
	}
	/**
	 * サーバーステータス情報を設定します。
	 * 
	 * @param state サーバーステータス情報
	 */
	public void setState(InstanceState state) {
		this.state = state;
	}
	/**
	 * サーバーステータス情報を設定し、自オブジェクトを返します。
	 *
	 * @param state サーバーステータス情報
	 * @return 自オブジェクト	 
	 */
	public Instance withState(InstanceState state) {
		setState(state);
		return this;
	}
	
	/**
	 * プライベートIPアドレスを取得します。
	 * 
	 * @return プライベートIPアドレス
	 */
	public String getPrivateDnsName() {
		return privateDnsName;
	}
	/**
	 * プライベートIPアドレスを設定します。
	 * 
	 * @param privateDnsName プライベートIPアドレス
	 */
	public void setPrivateDnsName(String privateDnsName) {
		this.privateDnsName = privateDnsName;
	}
	/**
	 * プライベートIPアドレスを設定し、自オブジェクトを返します。
	 *
	 * @param privateDnsName プライベートIPアドレス
	 * @return 自オブジェクト	 
	 */
	public Instance withPrivateDnsName(String privateDnsName) {
		setPrivateDnsName(privateDnsName);
		return this;
	}
	
	/**
	 * グローバルIPアドレスを取得します。
	 * 
	 * @return グローバルIPアドレス
	 */
	public String getDnsName() {
		return dnsName;
	}
	/**
	 * グローバルIPアドレスを設定します。
	 * 
	 * @param dnsName グローバルIPアドレス
	 */
	public void setDnsName(String dnsName) {
		this.dnsName = dnsName;
	}
	/**
	 * グローバルIPアドレスを設定し、自オブジェクトを返します。
	 *
	 * @param dnsName グローバルIPアドレス
	 * @return 自オブジェクト	 
	 */
	public Instance withDnsName(String dnsName) {
		setDnsName(dnsName);
		return this;
	}
	
	/**
	 * 異常時のエラーコードを取得します。
	 * 
	 * @return 異常時のエラーコード
	 */
	public String getReason() {
		return reason;
	}
	/**
	 * 異常時のエラーコードを設定します。
	 * 
	 * @param reason 異常時のエラーコード
	 */
	public void setReason(String reason) {
		this.reason = reason;
	}
	/**
	 * 異常時のエラーコードを設定し、自オブジェクトを返します。
	 *
	 * @param reason 異常時のエラーコード
	 * @return 自オブジェクト	 
	 */
	public Instance withReason(String reason) {
		setReason(reason);
		return this;
	}
	
	/**
	 * SSHキー名を取得します。
	 * 
	 * @return SSHキー名
	 */
	public String getKeyName() {
		return keyName;
	}
	/**
	 * SSHキー名を設定します。
	 * 
	 * @param keyName SSHキー名
	 */
	public void setKeyName(String keyName) {
		this.keyName = keyName;
	}
	/**
	 * SSHキー名を設定し、自オブジェクトを返します。
	 *
	 * @param keyName SSHキー名
	 * @return 自オブジェクト	 
	 */
	public Instance withKeyName(String keyName) {
		setKeyName(keyName);
		return this;
	}
	
	/**
	 * 管理者アカウントを取得します。
	 * 
	 * @return 管理者アカウント
	 */
	public String getAdmin() {
		return admin;
	}
	/**
	 * 管理者アカウントを設定します。
	 * 
	 * @param admin 管理者アカウント
	 */
	public void setAdmin(String admin) {
		this.admin = admin;
	}
	/**
	 * 管理者アカウントを設定し、自オブジェクトを返します。
	 *
	 * @param admin 管理者アカウント
	 * @return 自オブジェクト	 
	 */
	public Instance withAdmin(String admin) {
		setAdmin(admin);
		return this;
	}
	
	/**
	 * amiLaunchIndexを取得します。
	 * 
	 * @return amiLaunchIndex
	 */
	public String getAmiLaunchIndex() {
		return amiLaunchIndex;
	}
	/**
	 * amiLaunchIndexを設定します。
	 * 
	 * @param amiLaunchIndex
	 */
	public void setAmiLaunchIndex(String amiLaunchIndex) {
		this.amiLaunchIndex = amiLaunchIndex;
	}
	/**
	 * amiLaunchIndexを設定し、自オブジェクトを返します。
	 *
	 * @param amiLaunchIndex
	 * @return 自オブジェクト	 
	 */
	public Instance withAmiLaunchIndex(String amiLaunchIndex) {
		setAmiLaunchIndex(amiLaunchIndex);
		return this;
	}
	
	/**
	 * productCodesを取得します。
	 * 
	 * @return productCodes
	 */
	public List<ProductCode> getProductCodes() {
		return productCodes;
	}
	/**
	 * productCodesを設定します。
	 * 
	 * @param productCodes
	 */
	public void setProductCodes(List<ProductCode> productCodes) {
		this.productCodes = productCodes;
	}
	/**
	 * productCodesを設定し、自オブジェクトを返します。
	 *
	 * @param productCodes
	 * @return 自オブジェクト	 
	 */
	public Instance withProductCodes(ProductCode ... productCodes) {
		if(this.productCodes == null) this.productCodes = new ArrayList<ProductCode>();
		for(ProductCode productCode: productCodes) {
			getProductCodes().add(productCode);
		}
		return this;
	}
	/**
	 * productCodesを設定し、自オブジェクトを返します。
	 *
	 * @param productCodes
	 * @return 自オブジェクト	 
	 */
	public Instance withProductCodes(Collection<ProductCode> productCodes) {
		if(this.productCodes == null) this.productCodes = new ArrayList<ProductCode>();
		if (productCodes!=null) {
			getProductCodes().addAll(productCodes);
		}
		return this;
	}
	
	/**
	 * サーバータイプを取得します。
	 * 
	 * @return サーバータイプ
	 */
	public String getInstanceType() {
		return instanceType;
	}
	/**
	 * サーバータイプを設定します。
	 * 
	 * @param instanceType サーバータイプ
	 */
	public void setInstanceType(String instanceType) {
		this.instanceType = instanceType;
	}
	/**
	 * サーバータイプを設定し、自オブジェクトを返します。
	 *
	 * @param instanceType サーバータイプ
	 * @return 自オブジェクト	 
	 */
	public Instance withInstanceType(String instanceType) {
		setInstanceType(instanceType);
		return this;
	}
	
	/**
	 * サーバーの作成日時を取得します。
	 * 
	 * @return サーバーの作成日時
	 */
	public Date getLaunchTime() {
		return launchTime;
	}
	/**
	 * サーバーの作成日時を設定します。
	 * 
	 * @param launchTime サーバーの作成日時
	 */
	public void setLaunchTime(Date launchTime) {
		this.launchTime = launchTime;
	}
	/**
	 * サーバーの作成日時を設定し、自オブジェクトを返します。
	 *
	 * @param launchTime サーバーの作成日時
	 * @return 自オブジェクト	 
	 */
	public Instance withLaunchTime(Date launchTime) {
		setLaunchTime(launchTime);
		return this;
	}
	
	/**
	 * ゾーン情報を取得します。
	 * 
	 * @return ゾーン情報
	 */
	public Placement getPlacement() {
		return placement;
	}
	/**
	 * ゾーン情報を設定します。
	 * 
	 * @param placement ゾーン情報
	 */
	public void setPlacement(Placement placement) {
		this.placement = placement;
	}
	/**
	 * ゾーン情報を設定し、自オブジェクトを返します。
	 *
	 * @param placement ゾーン情報
	 * @return 自オブジェクト	 
	 */
	public Instance withPlacement(Placement placement) {
		setPlacement(placement);
		return this;
	}
	
	/**
	 * kernelIdを取得します。
	 * 
	 * @return kernelId
	 */
	public String getKernelId() {
		return kernelId;
	}
	/**
	 * kernelIdを設定します。
	 * 
	 * @param kernelId
	 */
	public void setKernelId(String kernelId) {
		this.kernelId = kernelId;
	}
	/**
	 * kernelIdを設定し、自オブジェクトを返します。
	 *
	 * @param kernelId
	 * @return 自オブジェクト	 
	 */
	public Instance withKernelId(String kernelId) {
		setKernelId(kernelId);
		return this;
	}
	
	/**
	 * ramdiskIdを取得します。
	 * 
	 * @return RAMディスクID
	 */
	public String getRamdiskId() {
		return ramdiskId;
	}
	/**
	 * ramdiskIdを設定します。
	 * 
	 * @param ramdiskId
	 */
	public void setRamdiskId(String ramdiskId) {
		this.ramdiskId = ramdiskId;
	}
	/**
	 * ramdiskIdを設定し、自オブジェクトを返します。
	 *
	 * @param ramdiskId
	 * @return 自オブジェクト	 
	 */
	public Instance withRamdiskId(String ramdiskId) {
		setRamdiskId(ramdiskId);
		return this;
	}
	
	/**
	 * OS種別を取得します。
	 * 
	 * @return OS種別
	 */
	public String getPlatform() {
		return platform;
	}
	/**
	 * OS種別を設定します。
	 * 
	 * @param platform OS種別
	 */
	public void setPlatform(String platform) {
		this.platform = platform;
	}
	/**
	 * OS種別を設定し、自オブジェクトを返します。
	 *
	 * @param platform OS種別
	 * @return 自オブジェクト	 
	 */
	public Instance withPlatform(String platform) {
		setPlatform(platform);
		return this;
	}
	
	/**
	 * 監視情報を取得します。
	 * 
	 * @return 監視情報
	 */
	public Monitoring getMonitoring() {
		return monitoring;
	}
	/**
	 * 監視情報を設定します。
	 * 
	 * @param monitoring 監視情報
	 */
	public void setMonitoring(Monitoring monitoring) {
		this.monitoring = monitoring;
	}
	/**
	 * 監視情報を設定し、自オブジェクトを返します。
	 *
	 * @param monitoring 監視情報
	 * @return 自オブジェクト	 
	 */
	public Instance withMonitoring(Monitoring monitoring) {
		setMonitoring(monitoring);
		return this;
	}
	
	/**
	 * subnetIdを取得します。
	 * 
	 * @return subnetId
	 */
	public String getSubnetId() {
		return subnetId;
	}
	/**
	 * subnetIdを設定します。
	 * 
	 * @param subnetId
	 */
	public void setSubnetId(String subnetId) {
		this.subnetId = subnetId;
	}
	/**
	 * subnetIdを設定し、自オブジェクトを返します。
	 *
	 * @param subnetId
	 * @return 自オブジェクト	 
	 */
	public Instance withSubnetId(String subnetId) {
		setSubnetId(subnetId);
		return this;
	}
	
	/**
	 * vpcIdを取得します。
	 * 
	 * @return vpcId
	 */
	public String getVpcId() {
		return vpcId;
	}
	/**
	 * vpcIdを設定します。
	 * 
	 * @param vpcId
	 */
	public void setVpcId(String vpcId) {
		this.vpcId = vpcId;
	}
	/**
	 * vpcIdを設定し、自オブジェクトを返します。
	 *
	 * @param vpcId
	 * @return 自オブジェクト	 
	 */
	public Instance withVpcId(String vpcId) {
		setVpcId(vpcId);
		return this;
	}
	
	/**
	 * プライベートIPアドレスを取得します。
	 * 
	 * @return プライベートIPアドレス
	 */
	public String getPrivateIpAddress() {
		return privateIpAddress;
	}
	/**
	 * プライベートIPアドレスを設定します。
	 * 
	 * @param privateIpAddress プライベートIPアドレス
	 */
	public void setPrivateIpAddress(String privateIpAddress) {
		this.privateIpAddress = privateIpAddress;
	}
	/**
	 * プライベートIPアドレスを設定し、自オブジェクトを返します。
	 *
	 * @param privateIpAddress プライベートIPアドレス
	 * @return 自オブジェクト	 
	 */
	public Instance withPrivateIpAddress(String privateIpAddress) {
		setPrivateIpAddress(privateIpAddress);
		return this;
	}
	
	/**
	 * グローバルIPアドレスを取得します。
	 * 
	 * @return グローバルIPアドレス
	 */
	public String getIpAddress() {
		return ipAddress;
	}
	/**
	 * グローバルIPアドレスを設定します。
	 * 
	 * @param ipAddress グローバルIPアドレス
	 */
	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}
	/**
	 * グローバルIPアドレスを設定し、自オブジェクトを返します。
	 *
	 * @param ipAddress グローバルIPアドレス
	 * @return 自オブジェクト	 
	 */
	public Instance withIpAddress(String ipAddress) {
		setIpAddress(ipAddress);
		return this;
	}
	
	/**
	 * プライベートIPアドレス（IPv6）を取得します。
	 * 
	 * @return プライベートIPアドレス（IPv6）
	 */
	public String getPrivateIpAddressV6() {
		return privateIpAddressV6;
	}
	/**
	 * プライベートIPアドレス（IPv6）を設定します。
	 * 
	 * @param privateIpAddressV6 プライベートIPアドレス（IPv6）
	 */
	public void setPrivateIpAddressV6(String privateIpAddressV6) {
		this.privateIpAddressV6 = privateIpAddressV6;
	}
	/**
	 * プライベートIPアドレス（IPv6）を設定し、自オブジェクトを返します。
	 *
	 * @param privateIpAddressV6 プライベートIPアドレス（IPv6）
	 * @return 自オブジェクト	 
	 */
	public Instance withPrivateIpAddressV6(String privateIpAddressV6) {
		setPrivateIpAddressV6(privateIpAddressV6);
		return this;
	}
	
	/**
	 * グローバルIPアドレス（IPv6）を取得します。
	 * 
	 * @return グローバルIPアドレス（IPv6）
	 */
	public String getIpAddressV6() {
		return ipAddressV6;
	}
	/**
	 * グローバルIPアドレス（IPv6）を設定します。
	 * 
	 * @param ipAddressV6 グローバルIPアドレス（IPv6）
	 */
	public void setIpAddressV6(String ipAddressV6) {
		this.ipAddressV6 = ipAddressV6;
	}
	/**
	 * グローバルIPアドレス（IPv6）を設定し、自オブジェクトを返します。
	 *
	 * @param ipAddressV6 グローバルIPアドレス（IPv6）
	 * @return 自オブジェクト	 
	 */
	public Instance withIpAddressV6(String ipAddressV6) {
		setIpAddressV6(ipAddressV6);
		return this;
	}
	
	/**
	 * stateReasonを取得します。
	 * 
	 * @return stateReason
	 */
	public StateReason getStateReason() {
		return stateReason;
	}
	/**
	 * stateReasonを設定します。
	 * 
	 * @param stateReason
	 */
	public void setStateReason(StateReason stateReason) {
		this.stateReason = stateReason;
	}
	/**
	 * stateReasonを設定し、自オブジェクトを返します。
	 *
	 * @param stateReason
	 * @return 自オブジェクト	 
	 */
	public Instance withStateReason(StateReason stateReason) {
		setStateReason(stateReason);
		return this;
	}
	
	/**
	 * OSイメージアーキテクチャを取得します。
	 * 
	 * @return OSイメージアーキテクチャ
	 */
	public String getArchitecture() {
		return architecture;
	}
	/**
	 * OSイメージアーキテクチャを設定します。
	 * 
	 * @param architecture OSイメージアーキテクチャ
	 */
	public void setArchitecture(String architecture) {
		this.architecture = architecture;
	}
	/**
	 * OSイメージアーキテクチャを設定し、自オブジェクトを返します。
	 *
	 * @param architecture OSイメージアーキテクチャ
	 * @return 自オブジェクト	 
	 */
	public Instance withArchitecture(String architecture) {
		setArchitecture(architecture);
		return this;
	}
	
	/**
	 * ディスクの種類を取得します。
	 * 
	 * @return ディスクの種類
	 */
	public String getRootDeviceType() {
		return rootDeviceType;
	}
	/**
	 * ディスクの種類を設定します。
	 * 
	 * @param rootDeviceType ディスクの種類
	 */
	public void setRootDeviceType(String rootDeviceType) {
		this.rootDeviceType = rootDeviceType;
	}
	/**
	 * ディスクの種類を設定し、自オブジェクトを返します。
	 *
	 * @param rootDeviceType ディスクの種類
	 * @return 自オブジェクト	 
	 */
	public Instance withRootDeviceType(String rootDeviceType) {
		setRootDeviceType(rootDeviceType);
		return this;
	}
	
	/**
	 * rootDeviceNameを取得します。
	 * 
	 * @return rootDeviceName
	 */
	public String getRootDeviceName() {
		return rootDeviceName;
	}
	/**
	 * rootDeviceNameを設定します。
	 * 
	 * @param rootDeviceName
	 */
	public void setRootDeviceName(String rootDeviceName) {
		this.rootDeviceName = rootDeviceName;
	}
	/**
	 * rootDeviceNameを設定し、自オブジェクトを返します。
	 *
	 * @param rootDeviceName
	 * @return 自オブジェクト	 
	 */
	public Instance withRootDeviceName(String rootDeviceName) {
		setRootDeviceName(rootDeviceName);
		return this;
	}
	
	/**
	 * 接続しているディスクの情報リストを取得します。
	 * 
	 * @return 接続しているディスクの情報リスト
	 */
	public List<InstanceBlockDeviceMapping> getBlockDeviceMappings() {
		return blockDeviceMappings;
	}
	/**
	 * 接続しているディスクの情報リストを設定します。
	 * 
	 * @param blockDeviceMappings 接続しているディスクの情報リスト
	 */
	public void setBlockDeviceMappings(List<InstanceBlockDeviceMapping> blockDeviceMappings) {
		this.blockDeviceMappings = blockDeviceMappings;
	}
	/**
	 * 接続しているディスクの情報の配列を設定し、自オブジェクトを返します。
	 *
	 * @param blockDeviceMappings 接続しているディスクの情報の配列
	 * @return 自オブジェクト	 
	 */
	public Instance withBlockDeviceMappings(InstanceBlockDeviceMapping ... blockDeviceMappings) {
		if(this.blockDeviceMappings == null) this.blockDeviceMappings = new ArrayList<InstanceBlockDeviceMapping>();
		for(InstanceBlockDeviceMapping blockDeviceMapping: blockDeviceMappings) {
			getBlockDeviceMappings().add(blockDeviceMapping);
		}
		return this;
	}
	/**
	 * 接続しているディスクの情報リストを設定し、自オブジェクトを返します。
	 *
	 * @param blockDeviceMappings 接続しているディスクの情報リスト
	 * @return 自オブジェクト	 
	 */
	public Instance withBlockDeviceMappings(Collection<InstanceBlockDeviceMapping> blockDeviceMappings) {
		if(this.blockDeviceMappings == null) this.blockDeviceMappings = new ArrayList<InstanceBlockDeviceMapping>();
		if (blockDeviceMappings!=null) {
			getBlockDeviceMappings().addAll(blockDeviceMappings);
		}
		return this;
	}
	
	/**
	 * instanceLifecycleを取得します。
	 * 
	 * @return instanceLifecycle
	 */
	public String getInstanceLifecycle() {
		return instanceLifecycle;
	}
	/**
	 * instanceLifecycleを設定します。
	 * 
	 * @param instanceLifecycle
	 */
	public void setInstanceLifecycle(String instanceLifecycle) {
		this.instanceLifecycle = instanceLifecycle;
	}
	/**
	 * instanceLifecycleを設定し、自オブジェクトを返します。
	 *
	 * @param instanceLifecycle
	 * @return 自オブジェクト	 
	 */
	public Instance withInstanceLifecycle(String instanceLifecycle) {
		setInstanceLifecycle(instanceLifecycle);
		return this;
	}
	
	/**
	 * spotInstanceRequestIdを取得します。
	 * 
	 * @return スポットサーバーリクエストID
	 */
	public String getSpotInstanceRequestId() {
		return spotInstanceRequestId;
	}
	/**
	 * spotInstanceRequestIdを設定します。
	 * 
	 * @param spotInstanceRequestId
	 */
	public void setSpotInstanceRequestId(String spotInstanceRequestId) {
		this.spotInstanceRequestId = spotInstanceRequestId;
	}
	/**
	 * spotInstanceRequestIdを設定し、自オブジェクトを返します。
	 *
	 * @param spotInstanceRequestId
	 * @return 自オブジェクト	 
	 */
	public Instance withSpotInstanceRequestId(String spotInstanceRequestId) {
		setSpotInstanceRequestId(spotInstanceRequestId);
		return this;
	}
	
	/**
	 * 利用料金タイプを取得します。
	 * 
	 * @return 利用料金タイプ
	 */
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
	public Instance withAccountingType(String accountingType) {
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
	public Instance withNextMonthAccountingType(String nextMonthAccountingType){
		setNextMonthAccountingType(nextMonthAccountingType);
		return this;
	}
	/**
	 * ロードバランサー情報リストを取得します。
	 * 
	 * @return ロードバランサー情報リスト
	 */
	public List<InstanceLoadBalancerMapping> getLoadbalancing() {
		return loadbalancing;
	}
	/**
	 * 適用しているロードバランサー情報リストを設定します。
	 * 
	 * @param loadbalancing 適用しているロードバランサー情報リスト
	 */
	public void setLoadbalancing(List<InstanceLoadBalancerMapping> loadbalancing) {
		this.loadbalancing = loadbalancing;
	}
	/**
	 * 適用しているロードバランサー情報の配列を設定し、自オブジェクトを返します。
	 *
	 * @param loadbalancing 適用しているロードバランサー情報リスト
	 * @return 自オブジェクト	 
	 */
	public Instance withLoadbalancing(InstanceLoadBalancerMapping ... loadbalancing) {
		if(this.loadbalancing == null) this.loadbalancing = new ArrayList<InstanceLoadBalancerMapping>();
		for(InstanceLoadBalancerMapping lb: loadbalancing) {
			getLoadbalancing().add(lb);
		}		
		return this;
	}
	/**
	 * 適用しているロードバランサー情報リストを設定し、自オブジェクトを返します。
	 *
	 * @param loadbalancing 適用しているロードバランサー情報リスト
	 * @return 自オブジェクト	 
	 */
	public Instance withLoadbalancing(Collection<InstanceLoadBalancerMapping> loadbalancing) {
		if(this.loadbalancing == null) this.loadbalancing = new ArrayList<InstanceLoadBalancerMapping>();
		if (loadbalancing!=null) {
			getLoadbalancing().addAll(loadbalancing);
		}
		return this;
	}
	
	/**
	 * コピー元サーバー名を取得します。
	 * 
	 * @return コピー元サーバー名
	 */
	public String getCopyInfo() {
		return copyInfo;
	}
	/**
	 * コピー元サーバー名を設定します。
	 * 
	 * @param copyInfo コピー元サーバー名
	 */
	public void setCopyInfo(String copyInfo) {
		this.copyInfo = copyInfo;
	}
	/**
	 * コピー元サーバー名を設定し、自オブジェクトを返します。
	 *
	 * @param copyInfo コピー元サーバー名
	 * @return 自オブジェクト	 
	 */
	public Instance withCopyInfo(String copyInfo) {
		setCopyInfo(copyInfo);
		return this;
	}
	
	/**
	 * スケールアウトサーバー情報を取得します。
	 * 
	 * @return スケールアウトサーバー情報
	 */
	public InstanceAutoScaleMapping getAutoscaling() {
		return autoscaling;
	}
	/**
	 * スケールアウトサーバー情報を設定します。
	 * 
	 * @param autoscaling スケールアウトサーバー情報
	 */
	public void setAutoscaling(InstanceAutoScaleMapping autoscaling) {
		this.autoscaling = autoscaling;
	}
	/**
	 * スケールアウトサーバー情報を設定し、自オブジェクトを返します。
	 *
	 * @param autoscaling スケールアウトサーバー情報
	 * @return 自オブジェクト	 
	 */
	public Instance withAutoscaling(InstanceAutoScaleMapping autoscaling) {
		setAutoscaling(autoscaling);
		return this;
	}

	/**
	 * グローバルIPアドレスタイプを取得します。
	 * 
	 * @return グローバルIPアドレスタイプ
	 */
	public String getIpType() {
		return ipType;
	}
	/**
	 * グローバルIPアドレスタイプを設定します。
	 * 
	 * @param ipType グローバルIPアドレスタイプ
	 */
	public void setIpType(String ipType) {
		this.ipType = ipType;
	}
	/**
	 * グローバルIPアドレスタイプを設定し、自オブジェクトを返します。
	 *
	 * @param ipType グローバルIPアドレスタイプ
	 * @return 自オブジェクト	 
	 */
	public Instance withIpType(String ipType) {
		setIpType(ipType);
		return this;
	}

	/**
	 * プライベートIPアドレスタイプを取得します。
	 *
	 * @return プライベートIPアドレスタイプ
	 */
	public String getNiftyPrivateIpType() {
		return niftyPrivateIpType;
	}
	/**
	 * プライベートIPアドレスタイプを設定します。
	 *
	 * @param niftyPrivateIpType プライベートIPアドレスタイプ
	 */
	public void setNiftyPrivateIpType(String niftyPrivateIpType) {
		this.niftyPrivateIpType = niftyPrivateIpType;
	}
	/**
	 * プライベートIPアドレスタイプを設定し、自オブジェクトを返します。
	 *
	 * @param niftyPrivateIpType プライベートIPアドレスタイプ
	 * @return 自オブジェクト
	 */
	public Instance withNiftyPrivateIpType(String niftyPrivateIpType) {
		setNiftyPrivateIpType(niftyPrivateIpType);
		return this;
	}

	/**
	 * メモ情報を取得します。
	 * 
	 * @return メモ情報
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * メモ情報を設定します。
	 * 
	 * @param description メモ情報
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * メモ情報を設定し、自オブジェクトを返します。
	 *
	 * @param description メモ情報
	 * @return 自オブジェクト	 
	 */
	public Instance withDescription(String description) {
		setDescription(description);
		return this;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("[instanceId=");
		builder.append(instanceId);
		builder.append(", imageId=");
		builder.append(imageId);
		builder.append(", state=");
		builder.append(state);
		builder.append(", privateDnsName=");
		builder.append(privateDnsName);
		builder.append(", dnsName=");
		builder.append(dnsName);
		builder.append(", reason=");
		builder.append(reason);
		builder.append(", keyName=");
		builder.append(keyName);
		builder.append(", admin=");
		builder.append(admin);
		builder.append(", amiLaunchIndex=");
		builder.append(amiLaunchIndex);
		builder.append(", productCodes=");
		builder.append(productCodes);
		builder.append(", instanceType=");
		builder.append(instanceType);
		builder.append(", launchTime=");
		builder.append(launchTime);
		builder.append(", placement=");
		builder.append(placement);
		builder.append(", kernelId=");
		builder.append(kernelId);
		builder.append(", ramdiskId=");
		builder.append(ramdiskId);
		builder.append(", platform=");
		builder.append(platform);
		builder.append(", monitoring=");
		builder.append(monitoring);
		builder.append(", subnetId=");
		builder.append(subnetId);
		builder.append(", vpcId=");
		builder.append(vpcId);
		builder.append(", privateIpAddress=");
		builder.append(privateIpAddress);
		builder.append(", ipAddress=");
		builder.append(ipAddress);
		builder.append(", stateReason=");
		builder.append(stateReason);
		builder.append(", architecture=");
		builder.append(architecture);
		builder.append(", rootDeviceType=");
		builder.append(rootDeviceType);
		builder.append(", rootDeviceName=");
		builder.append(rootDeviceName);
		builder.append(", blockDeviceMappings=");
		builder.append(blockDeviceMappings);
		builder.append(", instanceLifecycle=");
		builder.append(instanceLifecycle);
		builder.append(", spotInstanceRequestId=");
		builder.append(spotInstanceRequestId);
		builder.append(", accountingType=");
		builder.append(accountingType);
		builder.append(", nextMonthAccountingType=");
		builder.append(nextMonthAccountingType);
		builder.append(", loadbalancing=");
		builder.append(loadbalancing);
		builder.append(", copyInfo=");
		builder.append(copyInfo);
		builder.append(", autoscaling=");
		builder.append(autoscaling);
		builder.append(", ipType=");
		builder.append(ipType);
		builder.append(", niftyPrivateIpType=");
		builder.append(niftyPrivateIpType);
		builder.append(", description=");
		builder.append(description);
		builder.append("]");
		return builder.toString();
	}
	
}
