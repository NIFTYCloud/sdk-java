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
 * ebs情報クラス。<br />
 * このクラスはebs情報を格納します。
 */
public class EbsBlockDevice {

	private String	snapshotId;

	private Integer	volumeSize;

	private Boolean	deleteOnTermination;
	
	
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
	public EbsBlockDevice withSnapshotId(String snapshotId) {
		setSnapshotId(snapshotId);
		return this;
	}

	/**
	 * volumeSizeを取得します。
	 * 
	 * @return volumeSize
	 */
	@Query(name="VolumeSize")
	public Integer getVolumeSize() {
		return volumeSize;
	}
	/**
	 * volumeSizeを設定します。
	 * 
	 * @param volumeSize
	 */
	public void setVolumeSize(Integer volumeSize) {
		this.volumeSize = volumeSize;
	}
	/**
	 * volumeSizeを設定し、自オブジェクトを返します。
	 * 
	 * @param volumeSize
	 * @return 自オブジェクト
	 */
	public EbsBlockDevice withVolumeSize(Integer volumeSize) {
		setVolumeSize(volumeSize);
		return this;
	}
	
	/**
	 * deleteOnTerminationを取得します。
	 * 
	 * @return Boolean.FALSE
	 */
	@Query(name="DeleteOnTermination")
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
	public EbsBlockDevice withDeleteOnTermination(Boolean deleteOnTermination) {
		setDeleteOnTermination(deleteOnTermination);
		return this;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("[snapshotId=");
		builder.append(snapshotId);
		builder.append(", volumeSize=");
		builder.append(volumeSize);
		builder.append(", deleteOnTermination=");
		builder.append(deleteOnTermination);
		builder.append("]");
		return builder.toString();
	}

	
}
