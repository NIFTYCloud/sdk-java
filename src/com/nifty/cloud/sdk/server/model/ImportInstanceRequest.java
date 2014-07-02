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
 *  API Version: 1.18
 *  Date: 2014-05-23 17:00:00
 * 
 */
package com.nifty.cloud.sdk.server.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.nifty.cloud.sdk.Request;
import com.nifty.cloud.sdk.annotation.Action;
import com.nifty.cloud.sdk.annotation.Query;

/**
 * ImportInstanceリクエストクラス。<br />
 * このクラスはImportInstanceへのリクエストを構築します。
 */
@Action("ImportInstance")
public class ImportInstanceRequest implements Request {

	private String description;

	private String	architecture;

	/** ファイアウォールグループ名リスト */
	private List<String> groupIds;

	private String userData;

	/** サーバータイプ */
	private String instanceType;

	/** ゾーン情報 */
	private InstancePlacement placement;

	private Boolean monitoring;

	private String subnetId;

	private String instanceInitiatedShutdownBehavior;

	private String privateIpAddress;

	/** 利用料金タイプ  */
	private String accountingType;

	/** IPアドレスタイプ */
	private String ipType;

	/** 付替グローバルIPアドレス */
	private String publicIp;

	private List<DiskImage> diskImageSet;

	/** サーバー名 */
	private String instanceId;

	/** OVF */
	private String ovf;

	private Boolean keepPartialImports;

	private String platform;

	/**
	 * デフォルトコンストラクタ。
	 */
	public ImportInstanceRequest() {
	}

	/**
	 * OVFを指定し、ImportInstanceRequestを構築します。
	 * @param ovf OVF
	 */
	public ImportInstanceRequest(String ovf) {
		this.ovf = ovf;
	}


	/**
	 * descriptionを取得します。
	 * @return description
	 */
	@Query(name="Description")
	public String getDescription() {
		return description;
	}
	/**
	 * descriptionを設定します。
	 * @param description
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * descriptionを設定し、自オブジェクトを返します。
	 * @param description
	 * @return 自オブジェクト
	 */
	public ImportInstanceRequest withDescription(String description) {
		setDescription(description);
		return this;
	}

	/**
	 * architectureを取得します。
	 * @return architecture
	 */
	@Query(name="Architecture")
	public String getArchitecture() {
		return architecture;
	}
	/**
	 * architectureを設定します。
	 * @param architecture
	 */
	public void setArchitecture(String architecture) {
		this.architecture = architecture;
	}
	/**
	 * architectureを設定し、自オブジェクトを返します。
	 * @param architecture
	 * @return 自オブジェクト
	 */
	public ImportInstanceRequest withArchitecture(String architecture) {
		setArchitecture(architecture);
		return this;
	}

	/**
	 * ファイアウォールグループ名リストを取得します。
	 * @return ファイアウォールグループ名リスト
	 */
	@Query(name="SecurityGroup")
	public List<String> getGroupIds() {
		return groupIds;
	}
	/**
	 * ファイアウォールグループ名リストを設定します。
	 * @param groupIds ファイアウォールグループ名リスト
	 */
	public void setGroupIds(List<String> groupIds) {
		this.groupIds = groupIds;
	}
	/**
	 * ファイアウォールグループ名リストを設定し、自オブジェクトを返します。
	 * @param groupIds ファイアウォールグループ名リスト
	 * @return 自オブジェクト
	 */
	public ImportInstanceRequest withGroupIds(Collection<String> groupIds) {
		if (this.groupIds == null) this.groupIds = new ArrayList<String>();
		if (groupIds != null) {
			this.groupIds.addAll(groupIds);
		}
		return this;
	}
	/**
	 * ファイアウォールグループ名リストを設定し、自オブジェクトを返します。
	 *
	 * @param groupIds  ファイアウォールグループ名リスト
	 * @return 自オブジェクト
	 */
	public ImportInstanceRequest withGroupIds(String... groupIds) {
		if (this.groupIds == null) this.groupIds = new ArrayList<String>();
		for (String item : groupIds) {
			this.groupIds.add(item);
		}
		return this;
	}

	/**
	 * userDataを取得します。
	 * @return userData
	 */
	@Query(name="UserData")
	public String getUserData() {
		return userData;
	}
	/**
	 * userDataを設定します。
	 * @param userData
	 */
	public void setUserData(String userData) {
		this.userData = userData;
	}
	/**
	 * userDataを設定し、自オブジェクトを返します。
	 * @param userData
	 * @return 自オブジェクト
	 */
	public ImportInstanceRequest withUserData(String userData) {
		setUserData(userData);
		return this;
	}

	/**
	 * サーバータイプを取得します。
	 * @return サーバータイプ
	 */
	@Query(name="InstanceType")
	public String getInstanceType() {
		return instanceType;
	}
	/**
	 * サーバータイプを設定します。
	 * @param instanceType サーバータイプ
	 */
	public void setInstanceType(String instanceType) {
		this.instanceType = instanceType;
	}
	/**
	 * サーバータイプを設定し、自オブジェクトを返します。
	 * @param instanceType サーバータイプ
	 * @return 自オブジェクト
	 */
	public ImportInstanceRequest withInstanceType(String instanceType) {
		setInstanceType(instanceType);
		return this;
	}

	/**
	 * ゾーン情報を取得します。
	 * @return ゾーン情報
	 */
	@Query(name="Placement")
	public InstancePlacement getPlacement() {
		return placement;
	}
	/**
	 * ゾーン情報を設定します。
	 * @param placement ゾーン情報
	 */
	public void setPlacement(InstancePlacement placement) {
		this.placement = placement;
	}
	/**
	 * ゾーン情報を設定し、自オブジェクトを返します。
	 * @param placement ゾーン情報
	 * @return 自オブジェクト
	 */
	public ImportInstanceRequest withPlacement(InstancePlacement placement) {
		setPlacement(placement);
		return this;
	}

	/**
	 * monitoringを取得します。
	 * @return monitoring
	 */
	@Query(name="Monitoring.Enabled")
	public Boolean getMonitoring() {
		return monitoring;
	}
	/**
	 * monitoringを設定します。
	 * @param monitoring
	 */
	public void setMonitoring(Boolean monitoring) {
		this.monitoring = monitoring;
	}
	/**
	 * monitoringを設定し、自オブジェクトを返します。
	 * @param monitoring
	 * @return 自オブジェクト
	 */
	public ImportInstanceRequest withMonitoring(Boolean monitoring) {
		setMonitoring(monitoring);
		return this;
	}

	/**
	 * subnetIdを取得します。
	 * @return subnetId
	 */
	@Query(name="SubnetId")
	public String getSubnetId() {
		return subnetId;
	}
	/**
	 * subnetIdを設定します。
	 * @param subnetId
	 */
	public void setSubnetId(String subnetId) {
		this.subnetId = subnetId;
	}
	/**
	 * subnetIdを設定し、自オブジェクトを返します。
	 * @param subnetId
	 * @return 自オブジェクト
	 */
	public ImportInstanceRequest withSubnetId(String subnetId) {
		setSubnetId(subnetId);
		return this;
	}

	/**
	 * instanceInitiatedShutdownBehaviorを取得します。
	 * @return instanceInitiatedShutdownBehavior
	 */
	@Query(name="InstanceInitiatedShutdownBehavior")
	public String getInstanceInitiatedShutdownBehavior() {
		return instanceInitiatedShutdownBehavior;
	}
	/**
	 * instanceInitiatedShutdownBehaviorを設定します。
	 * @param instanceInitiatedShutdownBehavior
	 */
	public void setInstanceInitiatedShutdownBehavior(String instanceInitiatedShutdownBehavior) {
		this.instanceInitiatedShutdownBehavior = instanceInitiatedShutdownBehavior;
	}
	/**
	 * instanceInitiatedShutdownBehaviorを設定し、自オブジェクトを返します。
	 * @param instanceInitiatedShutdownBehavior
	 * @return 自オブジェクト
	 */
	public ImportInstanceRequest withInstanceInitiatedShutdownBehavior(String instanceInitiatedShutdownBehavior) {
		setInstanceInitiatedShutdownBehavior(instanceInitiatedShutdownBehavior);
		return this;
	}

	/**
	 * privateIpAddressを取得します。
	 * @return privateIpAddress
	 */
	@Query(name="PrivateIpAddress")
	public String getPrivateIpAddress() {
		return privateIpAddress;
	}
	/**
	 * privateIpAddressを設定します。
	 * @param privateIpAddress
	 */
	public void setPrivateIpAddress(String privateIpAddress) {
		this.privateIpAddress = privateIpAddress;
	}
	/**
	 * privateIpAddressを設定し、自オブジェクトを返します。
	 * @param privateIpAddress
	 * @return 自オブジェクト
	 */
	public ImportInstanceRequest withPrivateIpAddress(String privateIpAddress) {
		setPrivateIpAddress(privateIpAddress);
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
	public ImportInstanceRequest withAccountingType(String accountingType) {
		setAccountingType(accountingType);
		return this;
	}

	/**
	 * IPアドレスタイプを取得します。
	 * @return IPアドレスタイプ
	 */
	@Query(name="IpType")
	public String getIpType() {
		return ipType;
	}
	/**
	 * IPアドレスタイプを設定します。
	 * @param ipType IPアドレスタイプ
	 */
	public void setIpType(String ipType) {
		this.ipType = ipType;
	}
	/**
	 * IPアドレスタイプを設定し、自オブジェクトを返します。
	 * @param ipType IPアドレスタイプ
	 * @return 自オブジェクト
	 */
	public ImportInstanceRequest withIpType(String ipType) {
		setIpType(ipType);
		return this;
	}

	/**
	 * 付替グローバルIPアドレスを取得します。
	 *
	 * @return 付替グローバルIPアドレス
	 */
	@Query(name="PublicIp")
	public String getPublicIp() {
		return publicIp;
	}
	/**
	 * 付替グローバルIPアドレスを設定します。
	 *
	 * @param publicIp 付替グローバルIPアドレス
	 */
	public void setPublicIp(String publicIp) {
		this.publicIp = publicIp;
	}
	/**
	 * 付替グローバルIPアドレスを設定し、自オブジェクトを返します。
	 *
	 * @param publicIp 付替グローバルIPアドレス
	 * @return 自オブジェクト
	 */
	public ImportInstanceRequest withPublicIp(String publicIp) {
		setPublicIp(publicIp);
		return this;
	}

	/**
	 * diskImageSetを取得します。
	 * @return diskImageSet
	 */
	@Query(name="DiskImage")
	public List<DiskImage> getDiskImageSet() {
		return diskImageSet;
	}
	/**
	 * diskImageSetを設定します。
	 * @param diskImageSet
	 */
	public void setDiskImageSet(List<DiskImage> diskImageSet) {
		this.diskImageSet = diskImageSet;
	}
	/**
	 * diskImageSetを設定し、自オブジェクトを返します。
	 * @param diskImageSet
	 * @return 自オブジェクト
	 */
	public ImportInstanceRequest withDiskImageSet(Collection<DiskImage> diskImageSet) {
		if (this.diskImageSet == null) this.diskImageSet = new ArrayList<DiskImage>();
		if (diskImageSet != null) {
			this.diskImageSet.addAll(diskImageSet);
		}
		return this;
	}
	/**
	 * diskImageSetを設定し、自オブジェクトを返します。
	 *
	 * @param diskImageSet 
	 * @return 自オブジェクト
	 */
	public ImportInstanceRequest withDiskImageSet(DiskImage... diskImageSet) {
		if (this.diskImageSet == null) this.diskImageSet = new ArrayList<DiskImage>();
		for (DiskImage item : diskImageSet) {
			this.diskImageSet.add(item);
		}
		return this;
	}

	/**
	 * サーバー名を取得します。
	 * @return サーバー名
	 */
	@Query(name="InstanceId")
	public String getInstanceId() {
		return instanceId;
	}
	/**
	 * サーバー名を設定します。
	 * @param instanceId サーバー名
	 */
	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
	}
	/**
	 * サーバー名を設定し、自オブジェクトを返します。
	 * @param instanceId サーバー名
	 * @return 自オブジェクト
	 */
	public ImportInstanceRequest withInstanceId(String instanceId) {
		setInstanceId(instanceId);
		return this;
	}

	/**
	 * OVFを取得します。
	 * @return OVF
	 */
	@Query(name="Ovf", require=true)
	public String getOvf() {
		return ovf;
	}
	/**
	 * OVFを設定します。
	 * @param ovf OVF
	 */
	public void setOvf(String ovf) {
		this.ovf = ovf;
	}
	/**
	 * OVFを設定し、自オブジェクトを返します。
	 * @param ovf OVF
	 * @return 自オブジェクト
	 */
	public ImportInstanceRequest withOvf(String ovf) {
		setOvf(ovf);
		return this;
	}

	/**
	 * keepPartialImportsを取得します。
	 * @return keepPartialImports
	 */
	@Query(name="KeepPartialImports")
	public Boolean getKeepPartialImports() {
		return keepPartialImports;
	}
	/**
	 * keepPartialImportsを設定します。
	 * @param keepPartialImports
	 */
	public void setKeepPartialImports(Boolean keepPartialImports) {
		this.keepPartialImports = keepPartialImports;
	}
	/**
	 * keepPartialImportsを設定し、自オブジェクトを返します。
	 * @param keepPartialImports
	 * @return 自オブジェクト
	 */
	public ImportInstanceRequest withKeepPartialImports(Boolean keepPartialImports) {
		setKeepPartialImports(keepPartialImports);
		return this;
	}

	/**
	 * platformを取得します。
	 * @return platform
	 */
	@Query(name="Platform")
	public String getPlatform() {
		return platform;
	}
	/**
	 * platformを設定します。
	 * @param platform
	 */
	public void setPlatform(String platform) {
		this.platform = platform;
	}
	/**
	 * platformを設定し、自オブジェクトを返します。
	 * @param platform
	 * @return 自オブジェクト
	 */
	public ImportInstanceRequest withPlatform(String platform) {
		setPlatform(platform);
		return this;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("[description=");
		builder.append(description);
		builder.append(", architecture=");
		builder.append(architecture);
		builder.append(", groupIds=");
		builder.append(groupIds);
		builder.append(", userData=");
		builder.append(userData);
		builder.append(", instanceType=");
		builder.append(instanceType);
		builder.append(", placement=");
		builder.append(placement);
		builder.append(", monitoring=");
		builder.append(monitoring);
		builder.append(", subnetId=");
		builder.append(subnetId);
		builder.append(", instanceInitiatedShutdownBehavior=");
		builder.append(instanceInitiatedShutdownBehavior);
		builder.append(", privateIpAddress=");
		builder.append(privateIpAddress);
		builder.append(", accountingType=");
		builder.append(accountingType);
		builder.append(", ipType=");
		builder.append(ipType);
		builder.append(", publicIp=");
		builder.append(publicIp);
		builder.append(", diskImageSet=");
		builder.append(diskImageSet);
		builder.append(", instanceId=");
		builder.append(instanceId);
		builder.append(", ovf=");
		builder.append(ovf);
		builder.append(", keepPartialImports=");
		builder.append(keepPartialImports);
		builder.append(", platform=");
		builder.append(platform);
		builder.append("]");
		return builder.toString();
	}
}
