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
package com.nifty.cloud.sdk.image.model;

import com.nifty.cloud.sdk.annotation.Query;

/**
 * BlockDeviceMappingクラス。<br />
 * このクラスはBlockDeviceMapping情報を格納します。
 */
public class BlockDeviceMapping {
	
	private String deviceName;
	
	private String virtualName;
	
	private EbsBlockDevice ebs;
	
	private String noDevice;
	
	
	/**
	 * deviceNameを取得します。
	 * 
	 * @return deviceName
	 */
	@Query(name="DeviceName")
	public String getDeviceName() {
		return deviceName;
	}
	/**
	 * deviceNameを設定します。
	 * 
	 * @param deviceName
	 */
	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}
	/**
	 * deviceNameを設定し、自オブジェクトを返します。
	 * 
	 * @param deviceName
	 * @return 自オブジェクト
	 */
	public BlockDeviceMapping withDeviceName(String deviceName) {
		setDeviceName(deviceName);
		return this;
	}
	
	
	/**
	 * virtualNameを取得します。
	 * 
	 * @return virtualName
	 */
	@Query(name="VirtualName")
	public String getVirtualName() {
		return virtualName;
	}
	/**
	 * virtualNameを設定します。
	 * 
	 * @param virtualName
	 */
	public void setVirtualName(String virtualName) {
		this.virtualName = virtualName;
	}
	/**
	 * virtualNameを設定し、自オブジェクトを返します。
	 * 
	 * @param virtualName
	 * @return 自オブジェクト
	 */
	public BlockDeviceMapping withVirtualName(String virtualName) {
		setVirtualName(virtualName);
		return this;
	}
	
	/**
	 * ebsを取得します。
	 * 
	 * @return ebs
	 */
	@Query(name="Ebs")
	public EbsBlockDevice getEbs() {
		return ebs;
	}
	/**
	 * ebsを設定します。
	 * 
	 * @param ebs
	 */
	public void setEbs(EbsBlockDevice ebs) {
		this.ebs = ebs;
	}
	/**
	 * ebsを設定し、自オブジェクトを返します。
	 * 
	 * @param ebs
	 * @return 自オブジェクト
	 */
	public BlockDeviceMapping withEbs(EbsBlockDevice ebs) {
		setEbs(ebs);
		return this;
	}
	
	/**
	 * noDeviceを取得します。
	 * 
	 * @return noDevice
	 */
	@Query(name="NoDevice")
	public String getNoDevice() {
		return noDevice;
	}
	/**
	 * noDeviceを設定します。
	 * 
	 * @param noDevice
	 */
	public void setNoDevice(String noDevice) {
		this.noDevice = noDevice;
	}
	/**
	 * noDeviceを設定し、自オブジェクトを返します。
	 * 
	 * @param noDevice
	 * @return 自オブジェクト
	 */
	public BlockDeviceMapping withNoDevice(String noDevice) {
		setNoDevice(noDevice);
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
		builder.append(", virtualName=");
		builder.append(virtualName);
		builder.append(", ebs=");
		builder.append(ebs);
		builder.append(", noDevice=");
		builder.append(noDevice);
		builder.append("]");
		return builder.toString();
	}
	
	

}
