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
 *  Date: 2011-08-25 09:46:38
 * 
 */
package com.nifty.cloud.sdk.disk.model;

import com.nifty.cloud.sdk.Request;
import com.nifty.cloud.sdk.annotation.Action;
import com.nifty.cloud.sdk.annotation.Query;

/**
 * AttachVolumeリクエストクラス。<br />
 * このクラスはAttachVolumeへのリクエストを構築します。
 */
@Action("AttachVolume")
public class AttachVolumeRequest implements Request {
	
	/** ディスク名 */
	private String volumeId;
	
	/** サーバー名 */
	private String instanceId;
	
	private String device;
	
	/**
	 * デフォルトコンストラクタ。
	 */
	public AttachVolumeRequest() {
	}
	
	/**
	 * ディスク名、サーバー名を指定し、AttachVolumeRequestを構築します。
	 * 
	 * @param volumeId ディスク名
	 * @param instanceId サーバー名
	 */
	public AttachVolumeRequest(String volumeId, String instanceId) {
		this.volumeId = volumeId;
		this.instanceId = instanceId;
	}
	
	
	/**
	 * ディスク名を取得します。
	 * 
	 * @return ディスク名
	 */
	@Query(name="VolumeId", require=true)
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
	public AttachVolumeRequest withVolumeId(String volumeId) {
		setVolumeId(volumeId);
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
	public AttachVolumeRequest withInstanceId(String instanceId) {
		setInstanceId(instanceId);
		return this;
	}
	
	/**
	 * deviceを取得します。
	 * 
	 * @return device
	 */
	@Query(name="Device")		
	public String getDevice() {
		return device;
	}
	/**
	 * deviceを設定します。
	 * 
	 * @param device
	 */
	public void setDevice(String device) {
		this.device = device;
	}
	/**
	 * deviceを設定し、自オブジェクトを返します。
	 * 
	 * @param device
	 * @return 自オブジェクト
	 */
	public AttachVolumeRequest withDevice(String device) {
		setDevice(device);
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
		builder.append("]");
		return builder.toString();
	}
}
