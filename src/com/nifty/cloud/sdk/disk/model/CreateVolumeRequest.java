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
package com.nifty.cloud.sdk.disk.model;

import com.nifty.cloud.sdk.Request;
import com.nifty.cloud.sdk.annotation.Action;
import com.nifty.cloud.sdk.annotation.Query;

/**
 * CreateVolumeリクエストクラス。<br />
 * このクラスはCreateVolumeへのリクエストを構築します。
 */
@Action("CreateVolume")
public class CreateVolumeRequest implements Request {
	
	/** ディスクサイズ */
	private String size;
	
	private String snapshotId;
	
	private String availabilityZone;
	
	/** ディスク名 */
	private String volumeId;
	
	/** ディスクタイプ */
	private String diskType;
	
	/** サーバー名 */
	private String instanceId;
	
	/** 利用料金タイプ */
	private String accountingType;
	/**
	 * デフォルトコンストラクタ。
	 */
	public CreateVolumeRequest() {
	}
	
	/**
	 * ディスクサイズ,サーバー名を指定し、CreateVolumeRequestを構築します。
	 * 
	 * @param size ディスクサイズ
	 * @param instanceId サーバー名
	 */
	public CreateVolumeRequest(String size, String instanceId) {
		this.size = size;
		this.instanceId = instanceId;
	}
	
	/**
	 * ディスクサイズを取得します。
	 *
	 * @return ディスクサイズ
	 */
	@Query(name="Size", require=true)		
	public String getSize() {
		return size;
	}
	/**
	 * ディスクサイズを設定します。
	 * 
	 * @param size ディスクサイズ
	 */
	public void setSize(String size) {
		this.size = size;
	}
	/**
	 * ディスクサイズを設定し、自オブジェクトを返します。
	 * 
	 * @param size ディスクサイズ
	 * @return 自オブジェクト
	 */
	public CreateVolumeRequest withSize(String size) {
		setSize(size);
		return this;
	}

	/**
	 * snapshotIdを取得します。
	 * 
	 * @return snapshotId
	 */
	@Query(name="SnapshotId")		
	public String getSnapshotId() {
		return snapshotId;
	}
	/**
	 * snapshotIdを設定します。
	 * 
	 * @param snapshotId
	 */
	public void setSnapshotId(String snapshotId) {
		this.snapshotId = snapshotId;
	}
	/**
	 * snapshotIdを設定し、自オブジェクトを返します。
	 * 
	 * @param snapshotId
	 * @return 自オブジェクト
	 */
	public CreateVolumeRequest withSnapshotId(String snapshotId) {
		setSnapshotId(snapshotId);
		return this;
	}

	/**
	 * availabilityZoneを取得します。
	 * 
	 * @return availabilityZone
	 */
	@Query(name="AvailabilityZone")		
	public String getAvailabilityZone() {
		return availabilityZone;
	}
	/**
	 * availabilityZoneを設定します。
	 * 
	 * @param availabilityZone
	 */
	public void setAvailabilityZone(String availabilityZone) {
		this.availabilityZone = availabilityZone;
	}
	/**
	 * availabilityZoneを設定し、自オブジェクトを返します。
	 * 
	 * @param availabilityZone
	 * @return 自オブジェクト
	 */
	public CreateVolumeRequest withAvailabilityZone(String availabilityZone) {
		setAvailabilityZone(availabilityZone);
		return this;
	}
	
	/**
	 * ディスク名を取得します。
	 * 
	 * @return ディスク名
	 */
	@Query(name="VolumeId")	
	public String getVolumeId() {
		return volumeId;
	}
	/**
	 * ディスク名を設定します。
	 * 
	 * @param volumeId ディスク名
	 */
	public void setVolumeId(String volumeId) {
		this.volumeId = volumeId;
	}
	/**
	 * ディスク名を設定し、自オブジェクトを返します。
	 * 
	 * @param volumeId ディスク名
	 * @return 自オブジェクト
	 */
	public CreateVolumeRequest withVolumeId(String volumeId) {
		setVolumeId(volumeId);
		return this;
	}
	
	/**
	 * ディスクタイプを取得します。
	 * 
	 * @return ディスクタイプ
	 */
	@Query(name="DiskType")	
	public String getDiskType() {
		return diskType;
	}
	/**
	 * ディスクタイプを設定します。
	 * 
	 * @param diskType ディスクタイプ
	 */
	public void setDiskType(String diskType) {
		this.diskType = diskType;
	}
	/**
	 * ディスクタイプを設定し、自オブジェクトを返します。
	 * 
	 * @param diskType ディスクタイプ
	 * @return 自オブジェクト
	 */
	public CreateVolumeRequest withDiskType(String diskType) {
		setDiskType(diskType);
		return this;
	}
	
	/**
	 * サーバー名を取得します。
	 * 
	 * @return サーバー名
	 */
	@Query(name="InstanceId", require=true)	
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
	public CreateVolumeRequest withInstanceId(String instanceId) {
		setInstanceId(instanceId);
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
	public CreateVolumeRequest withAccountingType(String accountingType) {
		setAccountingType(accountingType);
		return this;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("[size=");
		builder.append(size);
		builder.append(", snapshotId=");
		builder.append(snapshotId);
		builder.append(", availabilityZone=");
		builder.append(availabilityZone);
		builder.append(", volumeId=");
		builder.append(volumeId);
		builder.append(", diskType=");
		builder.append(diskType);
		builder.append(", instanceId=");
		builder.append(instanceId);
		builder.append(", accountingType=");
		builder.append(accountingType);
		builder.append("]");
		return builder.toString();
	}
	
	
}
