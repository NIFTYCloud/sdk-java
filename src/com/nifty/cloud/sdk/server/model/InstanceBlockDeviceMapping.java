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
package com.nifty.cloud.sdk.server.model;

/**
 * 接続しているディスクの情報クラス。<br />
 * このクラスは接続しているディスクの情報を格納します。
 */
public class InstanceBlockDeviceMapping {
	
	/** 接続デバイス  */
	private String	deviceName;
	
	/** 接続しているディスクの詳細情報 */
	private EbsInstanceBlockDevice	ebs;
	
	/**
	 * 接続デバイスを取得します。
	 * 
	 * @return 接続デバイス
	 */
	public String getDeviceName() {
		return deviceName;
	}
	/**
	 * 接続デバイスを設定します。
	 * 
	 * @param deviceName 接続デバイス
	 */
	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}
	/**
	 * 接続デバイスを設定し、自オブジェクトを返します。
	 *
	 * @param deviceName 接続デバイス
	 * @return 自オブジェクト	 
	 */
	public InstanceBlockDeviceMapping withDeviceName(String deviceName) {
		setDeviceName(deviceName);
		return this;
	}
	
	/**
	 * 接続しているディスクの詳細情報を取得します。
	 * 
	 * @return 接続しているディスクの詳細情報
	 */
	public EbsInstanceBlockDevice getEbs() {
		return ebs;
	}
	/**
	 * 接続しているディスクの詳細情報を設定します。
	 * 
	 * @param ebs 接続しているディスクの詳細情報
	 */
	public void setEbs(EbsInstanceBlockDevice ebs) {
		this.ebs = ebs;
	}
	/**
	 * 接続しているディスクの詳細情報を設定し、自オブジェクトを返します。
	 *
	 * @param ebs 接続しているディスクの詳細情報 
	 * @return 自オブジェクト	 
	 */
	public InstanceBlockDeviceMapping withEbs(EbsInstanceBlockDevice ebs) {
		setEbs(ebs);
		return this;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("[deviceName=");
		builder.append(deviceName);
		builder.append(", ebs=");
		builder.append(ebs);
		builder.append("]");
		return builder.toString();
	}
	
}
