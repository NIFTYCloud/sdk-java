/*******************************************************************************
 *  Copyright 2014 NIFTY Corporation All Rights Reserved.
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
 *  API Version: 1.17
 *  Date: 2014-02-20 17:00:00
 *
 */
package com.nifty.cloud.sdk.image.model;

import com.nifty.cloud.sdk.annotation.Query;

/**
 * ebs情報クラス。<br />
 * このクラスはebs情報を格納します。
 */
public class EbsBlockDevice {

	/** ディスク名 */
	private String	snapshotId;

	/** ディスクサイズ */
	private Integer	volumeSize;

	/** ディスクタイプ */
	private String	diskType;

	/** イメージ削除時のディスク消去フラグ */
	private Boolean	deleteOnTermination;


	/**
	 * ディスク名を取得します。
	 *
	 * @return ディスク名
	 */
	@Query(name="SnapshotId")
	public String getSnapshotId() {
		return snapshotId;
	}
	/**
	 * ディスク名を設定します。
	 *
	 * @param snapshotId ディスク名
	 */
	public void setSnapshotId(String snapshotId) {
		this.snapshotId = snapshotId;
	}
	/**
	 * ディスク名を設定し、自オブジェクトを返します。
	 *
	 * @param snapshotId ディスク名
	 * @return 自オブジェクト
	 */
	public EbsBlockDevice withSnapshotId(String snapshotId) {
		setSnapshotId(snapshotId);
		return this;
	}

	/**
	 * ディスクサイズを取得します。
	 *
	 * @return ディスクサイズ
	 */
	@Query(name="VolumeSize")
	public Integer getVolumeSize() {
		return volumeSize;
	}
	/**
	 * ディスクサイズを設定します。
	 *
	 * @param volumeSize ディスクサイズ
	 */
	public void setVolumeSize(Integer volumeSize) {
		this.volumeSize = volumeSize;
	}
	/**
	 * ディスクサイズを設定し、自オブジェクトを返します。
	 *
	 * @param volumeSize ディスクサイズ
	 * @return 自オブジェクト
	 */
	public EbsBlockDevice withVolumeSize(Integer volumeSize) {
		setVolumeSize(volumeSize);
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
	public EbsBlockDevice withDiskType(String diskType) {
		setDiskType(diskType);
		return this;
	}

	/**
	 * イメージ削除時のディスク消去フラグを取得します。
	 *
	 * @return イメージ削除時のディスク消去フラグ
	 */
	@Query(name="DeleteOnTermination")
	public Boolean getDeleteOnTermination() {
		return deleteOnTermination;
	}
	/**
	 * イメージ削除時のディスク消去フラグを設定します。
	 *
	 * @param deleteOnTermination イメージ削除時のディスク消去フラグ
	 */
	public void setDeleteOnTermination(Boolean deleteOnTermination) {
		this.deleteOnTermination = deleteOnTermination;
	}
	/**
	 * イメージ削除時のディスク消去フラグを設定し、自オブジェクトを返します。
	 *
	 * @param deleteOnTermination イメージ削除時のディスク消去フラグ
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
		builder.append(", diskType=");
		builder.append(diskType);
		builder.append(", deleteOnTermination=");
		builder.append(deleteOnTermination);
		builder.append("]");
		return builder.toString();
	}


}
