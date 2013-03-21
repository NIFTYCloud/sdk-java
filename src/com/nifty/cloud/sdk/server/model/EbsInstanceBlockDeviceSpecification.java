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

import com.nifty.cloud.sdk.annotation.Query;

/**
 * EbsInstanceBlockDeviceSpecificationクラス。<br />
 * このクラスはEbsInstanceBlockDeviceSpecificationを格納します。
 */
public class EbsInstanceBlockDeviceSpecification {
	
	private String	volumeId;
	
	private Boolean	deleteOnTermination;
	
	
	/**
	 * volumeIdを取得します。
	 * 
	 * @return volumeId
	 */
	@Query(name="VolumeId")
	public String getVolumeId() {
		return volumeId;
	}
	/**
	 * volumeIdを設定します。
	 * 
	 * @param volumeId
	 */
	public void setVolumeId(String volumeId) {
		this.volumeId = volumeId;
	}
	/**
	 * volumeIdを設定し、自オブジェクトを返します。
	 *
	 * @param volumeId
	 * @return 自オブジェクト	 
	 */
	public EbsInstanceBlockDeviceSpecification withVolumeId(String volumeId) {
		setVolumeId(volumeId);
		return this;
	}
	
	/**
	 * deleteOnTerminationを取得します。
	 * 
	 * @return deleteOnTermination
	 */
	@Query(name="DeteleOnTermination")
	public Boolean getDeleteOnTermination() {
		return deleteOnTermination;
	}
	/**
	 * deleteOnTerminationを設定します。
	 * 
	 * @param deleteOnTermination
	 */
	public void setDeleteOnTermination(Boolean deleteOnTermination) {
		this.deleteOnTermination = deleteOnTermination;
	}
	/**
	 * deleteOnTerminationを設定し、自オブジェクトを返します。
	 *
	 * @param deleteOnTermination
	 * @return 自オブジェクト	 
	 */
	public EbsInstanceBlockDeviceSpecification withDeleteOnTermination(Boolean deleteOnTermination) {
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
		builder.append(", deleteOnTermination=");
		builder.append(deleteOnTermination);
		builder.append("]");
		return builder.toString();
	}
	
	
}
