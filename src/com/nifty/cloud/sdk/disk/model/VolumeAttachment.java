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
 *  API Version: 1.9
 *  Date: 2011-08-25 09:46:38
 * 
 */
package com.nifty.cloud.sdk.disk.model;

import java.util.Date;

/**
 * ディスク接続情報クラス。<br />
 * このクラスはディスクの接続先サーバー情報を格納します。
 */
public class VolumeAttachment {

	/** ディスク名 */
	private String volumeId;

	/** サーバー名 */
	private String instanceId;

	/** ディスク接続デバイス */
	private String device;

	/** 接続ステータス */
	private String state;

	/** ディスク接続日時 */
	private Date   attachTime;

	/** サーバー削除時のディスク消去フラグ */
	private Boolean deleteOnTermination;

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
	public VolumeAttachment withVolumeId(String volumeId) {
		setVolumeId(volumeId);
		return this;
	}

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
	public VolumeAttachment withInstanceId(String instanceId) {
		setInstanceId(instanceId);
		return this;
	}

	/**
	 * ディスク接続デバイスを取得します。
	 *
	 * @return ディスク接続デバイス
	 */
	public String getDevice() {
		return device;
	}
	/**
	 * ディスク接続デバイスを設定します。
	 *
	 * @param device ディスク接続デバイス
	 */
	public void setDevice(String device) {
		this.device = device;
	}
	/**
	 * ディスク接続デバイスを設定し、自オブジェクトを返します。
	 *
	 * @param device ディスク接続デバイス
	 * @return 自オブジェクト
	 */
	public VolumeAttachment withDevice(String device) {
		setDevice(device);
		return this;
	}

	/**
	 * 接続ステータスを取得します。
	 *
	 * @return 接続ステータス
	 */
	public String getState() {
		return state;
	}
	/**
	 * 接続ステータスを設定します。
	 *
	 * @param state 接続ステータス
	 */
	public void setState(String state) {
		this.state = state;
	}
	/**
	 * 接続ステータスを設定し、自オブジェクトを返します。
	 *
	 * @param state 接続ステータス
	 * @return 自オブジェクト
	 */
	public VolumeAttachment withState(String state) {
		setState(state);
		return this;
	}

	/**
	 * ディスク接続日時を取得します。
	 *
	 * @return ディスク接続日時
	 */
	public Date getAttachTime() {
		return attachTime;
	}
	/**
	 * ディスク接続日時を設定します。
	 *
	 * @param attachTime ディスク接続日時
	 */
	public void setAttachTime(Date attachTime) {
		this.attachTime = attachTime;
	}
	/**
	 * ディスク接続日時を設定し、自オブジェクトを返します。
	 *
	 * @param attachTime ディスク接続日時
	 * @return 自オブジェクト
	 */
	public VolumeAttachment withAttachTime(Date attachTime) {
		setAttachTime(attachTime);
		return this;
	}

	/**
	 * サーバー削除時のディスク消去フラグを取得します。
	 *
	 * @return サーバー削除時のディスク消去フラグ
	 */
	public Boolean getDeleteOnTermination() {
		return deleteOnTermination;
	}
	/**
	 * サーバー削除時のディスク消去フラグを設定します。
	 *
	 * @param deleteOnTermination サーバー削除時のディスク消去フラグ
	 */
	public void setDeleteOnTermination(Boolean deleteOnTermination) {
		this.deleteOnTermination = deleteOnTermination;
	}
	/**
	 * サーバー削除時のディスク消去フラグを設定し、自オブジェクトを返します。
	 *
	 * @param deleteOnTermination サーバー削除時のディスク消去フラグ
	 * @return 自オブジェクト
	 */
	public VolumeAttachment withDeleteOnTermination(Boolean deleteOnTermination) {
		setDeleteOnTermination(deleteOnTermination);
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
		builder.append(", instanceId=");
		builder.append(instanceId);
		builder.append(", device=");
		builder.append(device);
		builder.append(", state=");
		builder.append(state);
		builder.append(", attachTime=");
		builder.append(attachTime);
		builder.append(", deleteOnTermination=");
		builder.append(deleteOnTermination);
		builder.append("]");
		return builder.toString();
	}



}
