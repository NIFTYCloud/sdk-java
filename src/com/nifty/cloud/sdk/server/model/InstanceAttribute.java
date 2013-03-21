/******************************************************************************* 
 *  Copyright 2012 NIFTY Corporation All Rights Reserved.
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
 *  API Version: 1.12
 *  Date: 2012-12-21 17:00:00
 * 
 */
package com.nifty.cloud.sdk.server.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * サーバー属性情報クラス。<br />
 * このクラスはサーバー属性情報を格納します。
 * 
 */
public class InstanceAttribute {
	
	/** サーバー名 */
	private String instanceId;
	
	/** サーバータイプ */
	private String instanceType;
	
	private String kernelId;
	
	private String ramdiskId;
	
	private String userData;
	
	/** APIからのサーバー削除可否フラグ    */
	private Boolean disableApiTermination;
	
	private String instanceInitiatedShutdownBehavior;
	
	private String rootDeviceName;
	
	/** 接続しているディスクの情報リスト */
	private List<InstanceBlockDeviceMapping> blockDeviceMappings;
	
	/** 利用料金タイプ  */
	private String accountingType;
	
	/** 次月の利用料金タイプ */
	private String nextMonthAccountingType;
	
	/** 適用しているロードバランサー情報リスト */
	private List<InstanceLoadBalancerMapping> loadbalancing;
	
	/** コピー元サーバー名 */
	private String copyInfo;
	
	/** スケールアウトサーバー情報  */
	private InstanceAutoScaleMapping autoscaling;
	
	/** IPアドレスタイプ */
	private String ipType;

	/** ファイアウォールのグループ名 */
	private String groupId;

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
	public InstanceAttribute withInstanceId(String instanceId) {
		setInstanceId(instanceId);
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
	public InstanceAttribute withInstanceType(String instanceType) {
		setInstanceType(instanceType);
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
	public InstanceAttribute withKernelId(String kernelId) {
		setKernelId(kernelId);
		return this;
	}
	
	/**
	 * ramdiskIdを取得します。
	 * 
	 * @return ramdiskId
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
	public InstanceAttribute withRamdiskId(String ramdiskId) {
		setRamdiskId(ramdiskId);
		return this;
	}
	
	/**
	 * userDataを取得します。
	 * 
	 * @return userData
	 */
	public String getUserData() {
		return userData;
	}
	/**
	 * userDataを設定します。
	 * 
	 * @param userData
	 */
	public void setUserData(String userData) {
		this.userData = userData;
	}
	/**
	 * userDataを設定し、自オブジェクトを返します。
	 *
	 * @param userData
	 * @return 自オブジェクト	 
	 */
	public InstanceAttribute withUserData(String userData) {
		setUserData(userData);
		return this;
	}
	
	/**
	 * APIからのサーバー削除可否フラグを取得します。
	 * 
	 * @return APIからのサーバー削除可否フラグ
	 */
	public Boolean getDisableApiTermination() {
		return disableApiTermination;
	}
	/**
	 * APIからのサーバー削除可否フラグを設定します。
	 * 
	 * @param disableApiTermination APIからのサーバー削除可否フラグ
	 */
	public void setDisableApiTermination(Boolean disableApiTermination) {
		this.disableApiTermination = disableApiTermination;
	}
	/**
	 * APIからのサーバー削除可否フラグを設定し、自オブジェクトを返します。
	 *
	 * @param disableApiTermination APIからのサーバー削除可否フラグ
	 * @return 自オブジェクト	 
	 */
	public InstanceAttribute withDisableApiTermination(Boolean disableApiTermination) {
		setDisableApiTermination(disableApiTermination);
		return this;
	}
	
	/**
	 * instanceInitiatedShutdownBehaviorを取得します。
	 * 
	 * @return instanceInitiatedShutdownBehavior
	 */
	public String getInstanceInitiatedShutdownBehavior() {
		return instanceInitiatedShutdownBehavior;
	}
	/**
	 * instanceInitiatedShutdownBehaviorを設定します。
	 * 
	 * @param instanceInitiatedShutdownBehavior
	 */
	public void setInstanceInitiatedShutdownBehavior(String instanceInitiatedShutdownBehavior) {
		this.instanceInitiatedShutdownBehavior = instanceInitiatedShutdownBehavior;
	}
	/**
	 * instanceInitiatedShutdownBehaviorを設定し、自オブジェクトを返します。
	 *
	 * @param instanceInitiatedShutdownBehavior
	 * @return 自オブジェクト	 
	 */
	public InstanceAttribute withInstanceInitiatedShutdownBehavior(String instanceInitiatedShutdownBehavior) {
		setInstanceInitiatedShutdownBehavior(instanceInitiatedShutdownBehavior);
		return this;
	}
	
	/**
	 * rootDeviceNameを取得します。
	 * 
	 * @return rootデバイス名
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
	public InstanceAttribute withRootDeviceName(String rootDeviceName) {
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
	public void setBlockDeviceMappings(
			List<InstanceBlockDeviceMapping> blockDeviceMappings) {
		this.blockDeviceMappings = blockDeviceMappings;
	}
	/**
	 * 接続しているディスクの情報リストを設定し、自オブジェクトを返します。
	 *
	 * @param blockDeviceMappings 接続しているディスクの情報リスト
	 * @return 自オブジェクト	 
	 */
	public InstanceAttribute withBlockDeviceMappings(InstanceBlockDeviceMapping ... blockDeviceMappings) {
		if(this.blockDeviceMappings == null) this.blockDeviceMappings = new ArrayList<InstanceBlockDeviceMapping>();
		for (InstanceBlockDeviceMapping blockDeviceMapping: blockDeviceMappings) {
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
	public InstanceAttribute withBlockDeviceMappings(Collection<InstanceBlockDeviceMapping> blockDeviceMappings) {
		if(this.blockDeviceMappings == null) this.blockDeviceMappings = new ArrayList<InstanceBlockDeviceMapping>();
		if (blockDeviceMappings!=null) {
			getBlockDeviceMappings().addAll(blockDeviceMappings);
		}
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
	public InstanceAttribute withAccountingType(String accountingType) {
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
	public InstanceAttribute withNextMonthAccountingType(String nextMonthAccountingType) {
		setNextMonthAccountingType(nextMonthAccountingType);
		return this;
	}
	/**
	 * 適用しているロードバランサー情報リストを取得します。
	 * 
	 * @return 適用しているロードバランサー情報リスト
	 */
	public List<InstanceLoadBalancerMapping> getLoadBalancing() {
		return loadbalancing;
	}
	/**
	 * 適用しているロードバランサー情報リストを設定します。
	 * 
	 * @param loadbalancing 適用しているロードバランサー情報リスト
	 */
	public void setLoadBalancing(List<InstanceLoadBalancerMapping> loadbalancing) {
		this.loadbalancing = loadbalancing;
	}
	/**
	 * 適用しているロードバランサー情報の配列を設定し、自オブジェクトを返します。
	 *
	 * @param loadbalancing 適用しているロードバランサー情報の配列
	 * @return 自オブジェクト	 
	 */
	public InstanceAttribute withLoadBalancing(InstanceLoadBalancerMapping ... loadbalancing) {
		if(this.loadbalancing == null) this.loadbalancing = new ArrayList<InstanceLoadBalancerMapping>();
		for (InstanceLoadBalancerMapping lb: loadbalancing) {
			getLoadBalancing().add(lb);
		}
		return this;
	}
	/**
	 * 適用しているロードバランサー情報リストを設定し、自オブジェクトを返します。
	 *
	 * @param loadbalancing 適用しているロードバランサー情報リスト
	 * @return 自オブジェクト	 
	 */
	public InstanceAttribute withLoadBalancing(Collection<InstanceLoadBalancerMapping> loadbalancing) {
		if(this.loadbalancing == null) this.loadbalancing = new ArrayList<InstanceLoadBalancerMapping>();
		if (loadbalancing!=null) {
			getLoadBalancing().addAll(loadbalancing);
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
	public InstanceAttribute withCopyInfo(String copyInfo) {
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
	public InstanceAttribute withAutoscaling(InstanceAutoScaleMapping autoscaling) {
		setAutoscaling(autoscaling);
		return this;
	}
	
	/**
	 * IPアドレスタイプを取得します。
	 * 
	 * @return IPアドレスタイプ
	 */
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
	public InstanceAttribute withIpType(String ipType) {
		setIpType(ipType);
		return this;
	}

	/**
	 * ファイアウォールのグループ名を取得します。
	 * 
	 * @return ファイアウォールのグループ名
	 */
	public String getGroupId() {
		return groupId;
	}
	/**
	 * ファイアウォールのグループ名を設定します。
	 * 
	 * @param groupId ファイアウォールのグループ名
	 */
	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}
	/**
	 * ファイアウォールのグループ名を設定し、自オブジェクトを返します。
	 *
	 * @param groupId ファイアウォールのグループ名
	 * @return 自オブジェクト	 
	 */
	public InstanceAttribute withGroupId(String groupId) {
		setGroupId(groupId);
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
	public InstanceAttribute withDescription(String description) {
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
		builder.append(", instanceType=");
		builder.append(instanceType);
		builder.append(", kernelId=");
		builder.append(kernelId);
		builder.append(", ramdiskId=");
		builder.append(ramdiskId);
		builder.append(", userData=");
		builder.append(userData);
		builder.append(", disableApiTermination=");
		builder.append(disableApiTermination);
		builder.append(", instanceInitiatedShutdownBehavior=");
		builder.append(instanceInitiatedShutdownBehavior);
		builder.append(", rootDeviceName=");
		builder.append(rootDeviceName);
		builder.append(", blockDeviceMappings=");
		builder.append(blockDeviceMappings);
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
		builder.append(", groupId=");
		builder.append(groupId);
		builder.append(", description=");
		builder.append(description);
		builder.append("]");
		return builder.toString();
	}
}
