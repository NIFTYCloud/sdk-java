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
 *  API Version: 1.14
 *  Date: 2013-03-28 17:00:00
 * 
 */
package com.nifty.cloud.sdk.server.model;

import java.util.ArrayList;
import java.util.List;

/**
 * インポートサーバー情報クラス。<br />
 * このクラスはインポートサーバー情報を格納します。
 */
public class ImportInstance {
	/** イメージ情報リスト */
	private List<ImportInstanceVolumeDetail> diskImageSet;

	/** サーバー名 */
	private String instanceId;

	private String platform;

	private String description;

	/**
	 * イメージ情報リストを取得します。
	 * @return イメージ情報リスト
	 */
	public List<ImportInstanceVolumeDetail> getDiskImageSet() {
		return diskImageSet;
	}
	/**
	 * イメージ情報リストを設定します。
	 * @param diskImageSet イメージ情報リスト
	 */
	public void setVolumeSet(List<ImportInstanceVolumeDetail> diskImageSet) {
		this.diskImageSet = diskImageSet;
	}
	/**
	 * イメージ情報リストを設定し、自オブジェクトを返します。
	 * @param diskImageSet イメージ情報リスト
	 * @return 自オブジェクト
	 */
	public ImportInstance withDiskImageSet(List<ImportInstanceVolumeDetail> diskImageSet) {
		if (this.diskImageSet == null) this.diskImageSet = new ArrayList<ImportInstanceVolumeDetail>();
		if (diskImageSet != null) {
			this.diskImageSet.addAll(diskImageSet);
		}
		return this;
	}
	/**
	 * イメージ情報リストを設定し、自オブジェクトを返します。
	 * @param diskImageSet イメージ情報リスト
	 * @return 自オブジェクト
	 */
	public ImportInstance withDiskImageSet(ImportInstanceVolumeDetail... diskImageSet) {
		if (this.diskImageSet == null) this.diskImageSet = new ArrayList<ImportInstanceVolumeDetail>();
		for (ImportInstanceVolumeDetail volume : diskImageSet) {
			this.diskImageSet.add(volume);
		}
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
	public ImportInstance withInstanceId(String instanceId) {
		setInstanceId(instanceId);
		return this;
	}

	/**
	 * platformを取得します。
	 * 
	 * @return platform
	 */
	public String getPlatform() {
		return platform;
	}
	/**
	 * platformを設定します。
	 * 
	 * @param platform
	 */
	public void setPlatform(String platform) {
		this.platform = platform;
	}
	/**
	 * platformを設定し、自オブジェクトを返します。
	 *
	 * @param platform
	 * @return 自オブジェクト
	 */
	public ImportInstance withPlatform(String platform) {
		setPlatform(platform);
		return this;
	}

	/**
	 * descriptionを取得します。
	 * @return description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * descriptionを設定します。
	 * @param description
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * descriptionを設定し、自オブジェクトを返します。
	 * @param description
	 * @return 自オブジェクト
	 */
	public ImportInstance withDescription(String description) {
		setDescription(description);
		return this;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("[diskImageSet=");
		builder.append(diskImageSet);
		builder.append(", instanceId=");
		builder.append(instanceId);
		builder.append(", platform=");
		builder.append(platform);
		builder.append(", description=");
		builder.append(description);
		builder.append("]");
		return builder.toString();
	}
}
