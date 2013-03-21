/******************************************************************************* 
 *  Copyright 2011 NIFTY Corporation All Rights Reserved.
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
 *  API Version: 1.11
 *  Date: 2011-11-29 14:07:10
 * 
 */
package com.nifty.cloud.sdk.dashboard.model;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * サービスステータス情報クラス。<br />
 * このクラスはサービスステータス情報を格納します。
 */
public class ServiceStatus {

	/** ステータス日付 */
	@XStreamAlias("date")
	private String date;

	/** サーバーのステータス */
	@XStreamAlias("instanceStatus")
	private String instanceStatus;

	/** ディスクのステータス */
	@XStreamAlias("diskStatus")
	private String diskStatus;

	/** ネットワークのステータス */
	@XStreamAlias("networkStatus")
	private String networkStatus;

	/** コントロールパネルのステータス */
	@XStreamAlias("controlPanelStatus")
	private String controlPanelStatus;

	/** クラウドストレージのステータス */
	@XStreamAlias("storageStatus")
	private String storageStatus;

	/**
	 * ステータス日付を取得します。
	 * 
	 * @return date ステータス日付
	 */
	public String getDate() {
		return date;
	}

	/**
	 * ステータス日付を設定します。
	 * 
	 * @param date ステータス日付
	 */
	public void setDate(String date) {
		this.date = date;
	}

	/**
	 * ステータス日付を設定し、自オブジェクトを返します。
	 * 
	 * @param date ステータス日付
	 * @return 自オブジェクト
	 */
	public ServiceStatus withDate(String date) {
		setDate(date);
		return this;
	}

	/**
	 * サーバーのステータスを取得します。
	 * 
	 * @return サーバーのステータス
	 */
	public String getInstanceStatus() {
		return instanceStatus;
	}

	/**
	 * サーバーのステータスを設定します。
	 * 
	 * @param instanceStatus サーバーのステータス
	 */
	public void setInstanceStatus(String instanceStatus) {
		this.instanceStatus = instanceStatus;
	}

	/**
	 * サーバーのステータスを設定し、自オブジェクトを返します。
	 * 
	 * @param instanceStatus サーバーのステータス
	 * @return 自オブジェクト
	 */
	public ServiceStatus withInstanceStatus(String instanceStatus) {
		setInstanceStatus(instanceStatus);
		return this;
	}

	/**
	 * ディスクのステータスを取得します。
	 * 
	 * @return diskStatus　ディスクのステータス
	 */
	public String getDiskStatus() {
		return diskStatus;
	}

	/**
	 * ディスクのステータスを設定します。
	 * 
	 * @param diskStatus ディスクのステータス
	 */
	public void setDiskStatus(String diskStatus) {
		this.diskStatus = diskStatus;
	}

	/**
	 * ディスクのステータスを設定し、自オブジェクトを返します。
	 * 
	 * @param diskStatus ディスクのステータス
	 * @return 自オブジェクト
	 */
	public ServiceStatus withDiskStatus(String diskStatus) {
		setDiskStatus(diskStatus);
		return this;
	}

	/**
	 * ネットワークのステータスを取得します。
	 * 
	 * @return networkStatus ネットワークのステータス
	 */
	public String getNetworkStatus() {
		return networkStatus;
	}

	/**
	 * ネットワークのステータスを設定します。
	 * 
	 * @param networkStatus ネットワークのステータス
	 */
	public void setNetworkStatus(String networkStatus) {
		this.networkStatus = networkStatus;
	}

	/**
	 * ネットワークのステータスを設定し、自オブジェクトを返します。
	 * 
	 * @param networkStatus ネットワークのステータス
	 * @return 自オブジェクト
	 */
	public ServiceStatus withNetworkStatus(String networkStatus) {
		setNetworkStatus(networkStatus);
		return this;
	}

	/**
	 * コントロールパネルのステータスを取得します。
	 * 
	 * @return コントロールパネルのステータス
	 */
	public String getControlPanelStatus() {
		return controlPanelStatus;
	}

	/**
	 * コントロールパネルのステータスを設定します。
	 * 
	 * @param controlPanelStatus コントロールパネルのステータス
	 */
	public void setControlPanelStatus(String controlPanelStatus) {
		this.controlPanelStatus = controlPanelStatus;
	}

	/**
	 * コントロールパネルのステータスを設定し、自オブジェクトを返します。
	 * 
	 * @param controlPanelStatus コントロールパネルのステータス
	 * @return 自オブジェクト
	 */
	public ServiceStatus withControlPanelStatus(String controlPanelStatus) {
		setControlPanelStatus(controlPanelStatus);
		return this;
	}

	/**
	 * クラウドストレージのステータスを取得します。
	 * 
	 * @return クラウドストレージのステータス
	 */
	public String getStorageStatus() {
		return storageStatus;
	}

	/**
	 * クラウドストレージのステータスを設定します。
	 * 
	 * @param storageStatus クラウドストレージのステータス
	 */
	public void setStorageStatus(String storageStatus) {
		this.storageStatus = storageStatus;
	}

	/**
	 * クラウドストレージのステータスを設定し、自オブジェクトを返します。
	 * 
	 * @param storageStatus クラウドストレージのステータス
	 * @return 自オブジェクト
	 */
	public ServiceStatus withStorageStatus(String storageStatus) {
		setStorageStatus(storageStatus);
		return this;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("[date=");
		builder.append(date);
		builder.append(", instanceStatus=");
		builder.append(instanceStatus);
		builder.append(", diskStasus=");
		builder.append(diskStatus);
		builder.append(", networkStatus=");
		builder.append(networkStatus);
		builder.append(", controlPanelStatus=");
		builder.append(controlPanelStatus);
		builder.append(", storageStatus=");
		builder.append(storageStatus);
		builder.append("]");
		return builder.toString();
	}
}
