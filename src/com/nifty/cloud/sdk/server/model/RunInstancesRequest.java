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
package com.nifty.cloud.sdk.server.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.nifty.cloud.sdk.Request;
import com.nifty.cloud.sdk.annotation.Action;
import com.nifty.cloud.sdk.annotation.Query;

/**
 * RunInstancesリクエストクラス。<br />
 * このクラスはRunInstancesへのリクエストを構築します。
 */
@Action("RunInstances")
public class RunInstancesRequest implements Request {

	/** OSイメージID */
	private String imageId;

	private Integer	minCount;

	private Integer	maxCount;

	/** SSHキー名 */
	private String keyName;

	/** ファイアウォールグループ名 */
	private List<String> groupNames;

	private String additionalInfo;

	/** サーバー起動時スクリプト **/
	private String userData;

	/** サーバー起動時スクリプトのエンコード **/
	private String userDataEncoding;

	private String addressingType;

	/** サーバータイプ */
	private String instanceType;

	/** ゾーン情報 */
	private Placement placement;

	private String kernelId;

	private String ramdiskId;

	private List<BlockDeviceMapping> blockDeviceMappings;

	private Boolean	monitoring;

	private String subnetId;

	/** APIからのサーバー削除の可否フラグ  */
	private Boolean	disableApiTermination;

	private String instanceInitiatedShutdownBehavior;

	/** 利用料金タイプ  */
	private String accountingType;

	/** サーバー名 */
	private String instanceId;

	/** 管理者アカウント */
	private String admin;

	/** root/管理者アカウント　パスワード */
	private String password;

	/** IPアドレスタイプ */
	private String ipType;

	/** Redhat サブスプリクション入りを指定した場合の同意　*/
	private boolean agreement;

	/**
	 * デフォルトコンストラクタ。
	 */
	public RunInstancesRequest() {
	}


	/**
	 * OSイメージIDを指定し、RunInstancesRequestを構築します。
	 * @param imageId OSイメージID
	 */
	public RunInstancesRequest(String imageId) {
		this.imageId = imageId;
	}

	/**
	 * OSイメージIDを取得します。
	 *
	 * @return OSイメージID
	 */
	@Query(name="ImageId", require=true)
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
	public RunInstancesRequest withImageId(String imageId) {
		setImageId(imageId);
		return this;
	}

	/**
	 * minCountを取得します。
	 *
	 * @return minCount
	 */
	@Query(name="MinCount")
	public Integer getMinCount() {
		return minCount;
	}
	/**
	 * minCountを設定します。
	 *
	 * @param minCount
	 */
	public void setMinCount(Integer minCount) {
		this.minCount = minCount;
	}
	/**
	 * minCountを設定し、自オブジェクトを返します。
	 *
	 * @param minCount
	 * @return 自オブジェクト
	 */
	public RunInstancesRequest withMinCount(Integer minCount) {
		setMinCount(minCount);
		return this;
	}

	/**
	 * maxCountを取得します。
	 *
	 * @return maxCount
	 */
	@Query(name="MaxCount")
	public Integer getMaxCount() {
		return maxCount;
	}
	/**
	 * maxCountを設定します。
	 *
	 * @param maxCount
	 */
	public void setMaxCount(Integer maxCount) {
		this.maxCount = maxCount;
	}
	/**
	 * maxCountを設定し、自オブジェクトを返します。
	 *
	 * @param maxCount
	 * @return 自オブジェクト
	 */
	public RunInstancesRequest withMaxCount(Integer maxCount) {
		setMaxCount(maxCount);
		return this;
	}

	/**
	 * SSHキー名を取得します。
	 *
	 * @return SSHキー名
	 */
	@Query(name="KeyName")
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
	public RunInstancesRequest withKeyName(String keyName) {
		setKeyName(keyName);
		return this;
	}

	/**
	 * ファイアウォールグループ名を取得します。
	 *
	 * @return ファイアウォールグループ名
	 */
	@Query(name="SecurityGroup")
	public List<String> getGroupNames() {
		return groupNames;
	}
	/**
	 * ファイアウォールグループ名を設定します。
	 *
	 * @param groupNames ファイアウォールグループ名
	 */
	public void setGroupNames(List<String> groupNames) {
		this.groupNames = groupNames;
	}
	/**
	 * ファイアウォールグループ名の配列を設定し、自オブジェクトを返します。
	 *
	 * @param groupNames ファイアウォールグループ名の配列
	 * @return 自オブジェクト
	 */
	public RunInstancesRequest withGroupNames(String ... groupNames) {
		if(this.groupNames == null) this.groupNames = new ArrayList<String>();
		for (String groupName: groupNames) {
			getGroupNames().add(groupName);
		}
		return this;
	}
	/**
	 * ファイアウォールグループ名リストを設定し、自オブジェクトを返します。
	 *
	 * @param groupNames ファイアウォールグループ名リスト
	 * @return 自オブジェクト
	 */
	public RunInstancesRequest withGroupNames(Collection<String> groupNames) {
		if(this.groupNames == null) this.groupNames = new ArrayList<String>();
		if (groupNames!=null) {
			getGroupNames().addAll(groupNames);
		}
		return this;
	}

	/**
	 * additionalInfoを取得します。
	 *
	 * @return additionalInfo
	 */
	@Query(name="AdditionalInfo")
	public String getAdditionalInfo() {
		return additionalInfo;
	}
	/**
	 * additionalInfoを設定します。
	 *
	 * @param additionalInfo
	 */
	public void setAdditionalInfo(String additionalInfo) {
		this.additionalInfo = additionalInfo;
	}
	/**
	 * additionalInfoを設定し、自オブジェクトを返します。
	 *
	 * @param additionalInfo
	 * @return 自オブジェクト
	 */
	public RunInstancesRequest withAdditionalInfo(String additionalInfo) {
		setAdditionalInfo(additionalInfo);
		return this;
	}

	/**
	 * サーバー起動時スクリプトを取得します。
	 *
	 * @return サーバー起動時スクリプト
	 */
	@Query(name="UserData")
	public String getUserData() {
		return userData;
	}
	/**
	 * サーバー起動時スクリプトを設定します。
	 *
	 * @param userData サーバー起動時スクリプト
	 */
	public void setUserData(String userData) {
		this.userData = userData;
	}
	/**
	 * サーバー起動時スクリプトを設定し、自オブジェクトを返します。
	 *
	 * @param userData サーバー起動時スクリプト
	 * @return 自オブジェクト
	 */
	public RunInstancesRequest withUserData(String userData) {
		setUserData(userData);
		return this;
	}

	/**
	 * サーバー起動時スクリプトのエンコードを取得します。
	 * @return サーバー起動時スクリプトのエンコード
	 */
	@Query(name="UserData.Encoding")
	public String getUserDataEncoding() {
		return userDataEncoding;
	}

	/**
	 * サーバー起動時スクリプトのエンコードを設定します。
	 * @param userDataEncoding サーバー起動時スクリプトのエンコード
	 *
	 */
	public void setUserDataEncoding(String userDataEncoding) {
		this.userDataEncoding = userDataEncoding;
	}

	/**
	 * サーバー起動時スクリプトのエンコードを設定し、自オブジェクトを返します。
	 * @param userDataEncoding サーバー起動時スクリプトのエンコード
	 * @return 自オブジェクト
	 */
	public RunInstancesRequest withUserDataEncoding(String userDataEncoding){
		setUserDataEncoding(userDataEncoding);
		return this;
	}

	/**
	 * addressingTypeを取得します。
	 *
	 * @return addressingType
	 */
	@Query(name="AddressingType")
	public String getAddressingType() {
		return addressingType;
	}
	/**
	 * addressingTypeを設定します。
	 *
	 * @param addressingType
	 */
	public void setAddressingType(String addressingType) {
		this.addressingType = addressingType;
	}
	/**
	 * addressingTypeを設定し、自オブジェクトを返します。
	 *
	 * @param addressingType
	 * @return 自オブジェクト
	 */
	public RunInstancesRequest withAddressingType(String addressingType) {
		setAddressingType(addressingType);
		return this;
	}

	/**
	 * サーバータイプを取得します。
	 *
	 * @return サーバータイプ
	 */
	@Query(name="InstanceType")
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
	public RunInstancesRequest withInstanceType(String instanceType) {
		setInstanceType(instanceType);
		return this;
	}

	/**
	 * ゾーン情報を取得します。
	 *
	 * @return ゾーン情報
	 */
	@Query(name="Placement")
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
	public RunInstancesRequest withPlacement(Placement placement) {
		setPlacement(placement);
		return this;
	}

	/**
	 * kernelIdを取得します。
	 *
	 * @return kernelId
	 */
	@Query(name="KernelId")
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
	public RunInstancesRequest withKernelId(String kernelId) {
		setKernelId(kernelId);
		return this;
	}

	/**
	 * ramdiskIdを取得します。
	 *
	 * @return ramdiskId
	 */
	@Query(name="RamdiskId")
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
	public RunInstancesRequest withRamdiskId(String ramdiskId) {
		setRamdiskId(ramdiskId);
		return this;
	}

	/**
	 * blockDeviceMappingsを取得します。
	 *
	 * @return blockDeviceMappings
	 */
	@Query(name="BlockDeviceMapping")
	public List<BlockDeviceMapping> getBlockDeviceMappings() {
		return blockDeviceMappings;
	}
	/**
	 * blockDeviceMappingsを設定します。
	 *
	 * @param blockDeviceMappings
	 */
	public void setBlockDeviceMappings(List<BlockDeviceMapping> blockDeviceMappings) {
		this.blockDeviceMappings = blockDeviceMappings;
	}
	/**
	 * blockDeviceMappingsを設定し、自オブジェクトを返します。
	 *
	 * @param blockDeviceMappings
	 * @return 自オブジェクト
	 */
	public RunInstancesRequest withBlockDeviceMappings(BlockDeviceMapping ... blockDeviceMappings) {
		if(this.blockDeviceMappings == null) this.blockDeviceMappings = new ArrayList<BlockDeviceMapping>();
		for (BlockDeviceMapping blockDeviceMapping: blockDeviceMappings) {
			getBlockDeviceMappings().add(blockDeviceMapping);
		}
		return this;
	}
	/**
	 * blockDeviceMappingsを設定し、自オブジェクトを返します。
	 *
	 * @param blockDeviceMappings
	 * @return 自オブジェクト
	 */
	public RunInstancesRequest withBlockDeviceMappings(Collection<BlockDeviceMapping> blockDeviceMappings) {
		if(this.blockDeviceMappings == null) this.blockDeviceMappings = new ArrayList<BlockDeviceMapping>();
		if (blockDeviceMappings!=null) {
			getBlockDeviceMappings().addAll(blockDeviceMappings);
		}
		return this;
	}

	/**
	 * monitoringを取得します。
	 *
	 * @return monitoring
	 */
	@Query(name="Monitoring.Enabled")
	public Boolean getMonitoring() {
		return monitoring;
	}
	/**
	 * monitoringを設定します。
	 *
	 * @param monitoring
	 */
	public void setMonitoring(Boolean monitoring) {
		this.monitoring = monitoring;
	}
	/**
	 * monitoringを設定し、自オブジェクトを返します。
	 *
	 * @param monitoring
	 * @return 自オブジェクト
	 */
	public RunInstancesRequest withMonitoring(Boolean monitoring) {
		setMonitoring(monitoring);
		return this;
	}

	/**
	 * subnetIdを取得します。
	 *
	 * @return subnetId
	 */
	@Query(name="SubnetId")
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
	public RunInstancesRequest withSubnetId(String subnetId) {
		setSubnetId(subnetId);
		return this;
	}

	/**
	 * APIからのサーバー削除の可否フラグを取得します。
	 *
	 * @return APIからのサーバー削除の可否フラグ
	 */
	@Query(name="DisableApiTermination")
	public Boolean getDisableApiTermination() {
		return disableApiTermination;
	}
	/**
	 * APIからのサーバー削除の可否フラグを設定します。
	 *
	 * @param disableApiTermination APIからのサーバー削除の可否フラグ
	 */
	public void setDisableApiTermination(Boolean disableApiTermination) {
		this.disableApiTermination = disableApiTermination;
	}
	/**
	 * APIからのサーバー削除の可否フラグを設定し、自オブジェクトを返します。
	 *
	 * @param disableApiTermination APIからのサーバー削除の可否フラグ
	 * @return 自オブジェクト
	 */
	public RunInstancesRequest withDisableApiTermination(Boolean disableApiTermination) {
		setDisableApiTermination(disableApiTermination);
		return this;
	}

	/**
	 * instanceInitiatedShutdownBehaviorを取得します。
	 *
	 * @return instanceInitiatedShutdownBehavior
	 */
	@Query(name="InstanceInitiatedShutdownBehavior")
	public String getInstanceInitiatedShutdownBehavior() {
		return instanceInitiatedShutdownBehavior;
	}
	/**
	 * instanceInitiatedShutdownBehaviorを設定します。
	 *
	 * @param instanceInitiatedShutdownBehavior
	 */
	public void setInstanceInitiatedShutdownBehavior(
			String instanceInitiatedShutdownBehavior) {
		this.instanceInitiatedShutdownBehavior = instanceInitiatedShutdownBehavior;
	}
	/**
	 * instanceInitiatedShutdownBehaviorを設定し、自オブジェクトを返します。
	 *
	 * @param instanceInitiatedShutdownBehavior
	 * @return 自オブジェクト
	 */
	public RunInstancesRequest withInstanceInitiatedShutdownBehavior(String instanceInitiatedShutdownBehavior) {
		setInstanceInitiatedShutdownBehavior(instanceInitiatedShutdownBehavior);
		return this;
	}

	/**
	 * 利用料金タイプを取得します。
	 *
	 * @return 利用料金タイプ
	 */
	@Query(name="AccountingType")
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
	public RunInstancesRequest withAccountingType(String accountingType) {
		setAccountingType(accountingType);
		return this;
	}

	/**
	 * サーバー名を取得します。
	 *
	 * @return サーバー名
	 */
	@Query(name="InstanceId")
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
	public RunInstancesRequest withInstanceId(String instanceId) {
		setInstanceId(instanceId);
		return this;
	}

	/**
	 * 管理者アカウントを取得します。
	 *
	 * @return 管理者アカウント
	 */
	@Query(name="Admin")
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
	public RunInstancesRequest withAdmin(String admin) {
		setAdmin(admin);
		return this;
	}

	/**
	 * root/管理者パスワードを取得します。
	 *
	 * @return root/管理者パスワード
	 */
	@Query(name="Password")
	public String getPassword() {
		return password;
	}
	/**
	 * root/管理者パスワードを設定します。
	 *
	 * @param password root/管理者パスワード
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * root/管理者パスワードを設定し、自オブジェクトを返します。
	 *
	 * @param password root/管理者パスワード
	 * @return 自オブジェクト
	 */
	public RunInstancesRequest withPassword(String password) {
		setPassword(password);
		return this;
	}

	/**
	 * IPアドレスタイプを取得します。
	 *
	 * @return IPアドレスタイプ
	 */
	@Query(name="IpType")
	public String getIpType() {
		return ipType;
	}
	/**
	 * IPアドレスタイプを設定します。
	 *
	 * @param ipType IPアドレスタイプ
	 */
	public void setIpType(String ipType) {
		this.ipType = ipType;
	}
	/**
	 * IPアドレスタイプを設定し、自オブジェクトを返します。
	 *
	 * @param ipType IPアドレスタイプ
	 * @return 自オブジェクト
	 */
	public RunInstancesRequest withIpType(String ipType) {
		setIpType(ipType);
		return this;
	}

	/**
	 * Redhat サブスクリプション入りを指定した場合の同意を取得します。
	 *
	 * @return Redhat サブスクリプション入りを指定した場合の同意
	 */
	@Query(name="Agreement")
	public boolean isAgreement() {
		return agreement;
	}

	/**
	 * Redhat サブスクリプション入りを指定した場合の同意を設定します。
	 *
	 * @param agreement Redhat サブスクリオプション入りをした場合の同意
	 */
	public void setAgreement(boolean agreement) {
		this.agreement = agreement;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("[imageId=");
		builder.append(imageId);
		builder.append(", minCount=");
		builder.append(minCount);
		builder.append(", maxCount=");
		builder.append(maxCount);
		builder.append(", keyName=");
		builder.append(keyName);
		builder.append(", groupNames=");
		builder.append(groupNames);
		builder.append(", additionalInfo=");
		builder.append(additionalInfo);
		builder.append(", userData=");
		builder.append(userData);
		builder.append(", userDataEncoding=");
		builder.append(userDataEncoding);
		builder.append(", addressingType=");
		builder.append(addressingType);
		builder.append(", instanceType=");
		builder.append(instanceType);
		builder.append(", placement=");
		builder.append(placement);
		builder.append(", kernelId=");
		builder.append(kernelId);
		builder.append(", ramdiskId=");
		builder.append(ramdiskId);
		builder.append(", blockDeviceMappings=");
		builder.append(blockDeviceMappings);
		builder.append(", monitoring=");
		builder.append(monitoring);
		builder.append(", subnetId=");
		builder.append(subnetId);
		builder.append(", disableApiTermination=");
		builder.append(disableApiTermination);
		builder.append(", instanceInitiatedShutdownBehavior=");
		builder.append(instanceInitiatedShutdownBehavior);
		builder.append(", accountingType=");
		builder.append(accountingType);
		builder.append(", instanceId=");
		builder.append(instanceId);
		builder.append(", admin=");
		builder.append(admin);
		builder.append(", password=");
		builder.append(password);
		builder.append(", ipType=");
		builder.append(ipType);
		builder.append(", agreement=");
		builder.append(agreement);
		builder.append("]");
		return builder.toString();
	}

}
