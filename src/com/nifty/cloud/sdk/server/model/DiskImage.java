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
 * DiskImageクラス。<br />
 * このクラスはDiskImageを格納します。
 */
public class DiskImage {

	private DiskImageDetail image;

	private String description;

	private DiskImageVolume volume;

	/**
	 * imageを取得します。
	 * @return image
	 */
	@Query(name="Image")
	public DiskImageDetail getImage() {
		return image;
	}
	/**
	 * imageを設定します。
	 * @param image
	 */
	public void setImage(DiskImageDetail image) {
		this.image = image;
	}
	/**
	 * imageを設定し、自オブジェクトを返します。
	 * @param image
	 * @return 自オブジェクト
	 */
	public DiskImage withImage(DiskImageDetail image) {
		setImage(image);
		return this;
	}

	/**
	 * descriptionを取得します。
	 * @return description
	 */
	@Query(name="Description")
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
	public DiskImage withDescription(String description) {
		setDescription(description);
		return this;
	}

	/**
	 * volumeを取得します。
	 * @return volume
	 */
	@Query(name="Volume")
	public DiskImageVolume getVolume() {
		return volume;
	}
	/**
	 * volumeを設定します。
	 * @param volume
	 */
	public void setVolume(DiskImageVolume volume) {
		this.volume = volume;
	}
	/**
	 * volumeを設定し、自オブジェクトを返します。
	 * @param volume
	 * @return 自オブジェクト
	 */
	public DiskImage withVolume(DiskImageVolume volume) {
		setVolume(volume);
		return this;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("[image=");
		builder.append(image);
		builder.append(", description=");
		builder.append(description);
		builder.append(", volume=");
		builder.append(volume);
		builder.append("]");
		return builder.toString();
	}
}
