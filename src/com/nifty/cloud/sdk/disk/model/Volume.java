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

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

/**
 * ディスク情報クラス。<br />
 * このクラスはディスク情報を格納します。
 */
public class Volume {
	/** ディスク名 */
	private String volumeId;
	
	/** ディスクサイズ */
	private String size;
	
	/** ディスクタイプ */
	private String diskType;

	private String snapshotId;
	
	/** ゾーン名 */
	private String availabilityZone;
	
	/** 作成ステータス */
	private String status;
	
	/** ディスク作成日時 */
	private Date   createTime;
	
	/** 接続サーバー情報リスト */
	private List<VolumeAttachment> attachments;
	
	/** 利用料金タイプ */
	private String accountingType;
	
	/** 次月からの利用料金タイプ */
	private String nextMonthAccountingType;

	/**
	 * ディスク名を取得します。
	 *
	 * @return ディスク名
	 */
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
	public Volume withVolumeId(String volumeId) {
		setVolumeId(volumeId);
		return this;
	}
	
	/**
	 * ディスクサイズを取得します。
	 * 
	 * @return ディスクサイズ
	 */
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
	 * ディスクサイズを設定します。
	 * 
	 * @param size ディスクサイズ
	 * @return 自オブジェクト
	 */
	public Volume withSize(String size) {
		setSize(size);
		return this;
	}
	
	/**
	 * ディスクタイプを取得します。
	 * 
	 * @return ディスクタイプ
	 */
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
	 * ディスクタイプを設定します。
	 * 
	 * @param diskType ディスクタイプ
	 * @return 自オブジェクト
	 */
	public Volume withDiskType(String diskType) {
		setDiskType(diskType);
		return this;
	}

	/**
	 * snapshotIdを取得します。
	 *
	 * @return snapshotId
	 */
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
	public Volume withSnapshotId(String snapshotId) {
		setSnapshotId(snapshotId);
		return this;
	}
	
	/**
	 * ゾーン名を取得します。
	 *
	 * @return ゾーン名
	 */
	public String getAvailabilityZone() {
		return availabilityZone;
	}
	/**
	 * ゾーン名を設定します。
	 * 
	 * @param availabilityZone ゾーン名
	 */
	public void setAvailabilityZone(String availabilityZone) {
		this.availabilityZone = availabilityZone;
	}
	/**
	 * ゾーン名を設定し、自オブジェクトを返します。
	 * 
	 * @param availabilityZone ゾーン名
	 * @return 自オブジェクト
	 */
	public Volume withAvailabilityZone(String availabilityZone) {
		setAvailabilityZone(availabilityZone);
		return this;
	}
	
	/**
	 * 作成ステータスを取得します。
	 * 
	 * @return 作成ステータス
	 */
	public String getStatus() {
		return status;
	}
	/**
	 * 作成ステータスを設定します。
	 * 
	 * @param status 作成ステータス
	 */
	public void setStatus(String status) {
		this.status = status;
	}
	/**
	 * 作成ステータスを設定し、自オブジェクトを返します。
	 * 
	 * @param status 作成ステータス
	 * @return 自オブジェクト
	 */
	public Volume withStatus(String status) {
		setStatus(status);
		return this;
	}
	
	/**
	 * ディスク作成日時を取得します。
	 * 
	 * @return ディスク作成日時
	 */
	public Date getCreateTime() {
		return createTime;
	}
	/**
	 * ディスク作成日時を設定します。
	 * 
	 * @param createTime ディスク作成日時
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	/**
	 * ディスク作成日時を設定し、自オブジェクトを返します。
	 * 
	 * @param createTime ディスク作成日時
	 * @return 自オブジェクト
	 */
	public Volume withCreateTime(Date createTime) {
		setCreateTime(createTime);
		return this;
	}
	
	/**
	 * 接続サーバー情報リストを取得します。
	 * 
	 * @return 接続サーバー情報リスト
	 */
	public List<VolumeAttachment> getAttachments() {
		return attachments;
	}
	/**
	 * 接続サーバー情報リストを設定します。
	 * 
	 * @param attachments 接続サーバー情報リスト
	 */
	public void setAttachments(List<VolumeAttachment> attachments) {
		this.attachments = attachments;
	}
	/**
	 * 接続サーバー情報の配列を設定し、自オブジェクトを返します。
	 * 
	 * @param attachments 接続サーバー情報の配列
	 * @return 自オブジェクト
	 */
    public Volume withAttachments(VolumeAttachment... attachments) {
    	if(this.attachments == null) this.attachments = new ArrayList<VolumeAttachment>();
        for (VolumeAttachment attachment : attachments) {
        	getAttachments().add(attachment);
        }
        return this;
    }
	/**
	 * 接続サーバー情報リストを設定し、自オブジェクトを返します。
	 * 
	 * @param attachments 接続サーバー情報リスト
	 * @return 自オブジェクト
	 */
    public Volume withAttachments(Collection<VolumeAttachment> attachments) {
    	if(this.attachments == null) this.attachments = new ArrayList<VolumeAttachment>();
        if (attachments != null) {
        	getAttachments().addAll(attachments);
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
	public Volume withAccountingType(String accountingType) {
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
	public Volume withNextMonthAccountingType(String nextMonthAccountingType) {
		setNextMonthAccountingType(nextMonthAccountingType);
		return this;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("[volumeId=");
		builder.append(volumeId);
		builder.append(", size=");
		builder.append(size);
		builder.append(", diskType=");
		builder.append(diskType);
		builder.append(", snapshotId=");
		builder.append(snapshotId);
		builder.append(", availabilityZone=");
		builder.append(availabilityZone);
		builder.append(", status=");
		builder.append(status);
		builder.append(", createTime=");
		builder.append(createTime);
		builder.append(", accountingType=");
		builder.append(accountingType);
		builder.append(", nextMonthAccountingType=");
		builder.append(nextMonthAccountingType);
		builder.append(", attachments=");
		builder.append(attachments);
		builder.append("]");
		return builder.toString();
	}

}
