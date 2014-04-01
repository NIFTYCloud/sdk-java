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
package com.nifty.cloud.sdk.server.model;

/**
 * DiskImageVolumeDescriptionクラス。<br />
 * このクラスはDiskImageVolumeDescriptionを格納します。
 */
public class DiskImageVolumeDescription {
	private Long size;

	private String id;

	/**
	 * sizeを取得します。
	 * @return size
	 */
	public Long getSize() {
		return size;
	}
	/**
	 * sizeを設定します。
	 * @param size
	 */
	public void setSize(Long size) {
		this.size = size;
	}
	/**
	 * sizeを設定し、自オブジェクトを返します。
	 * @param size
	 * @return 自オブジェクト
	 */
	public DiskImageVolumeDescription withSize(Long size) {
		setSize(size);
		return this;
	}

	/**
	 * idを取得します。
	 * @return id
	 */
	public String getId() {
		return id;
	}
	/**
	 * idを設定します。
	 * @param id
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * idを設定し、自オブジェクトを返します。
	 * @param id
	 * @return 自オブジェクト
	 */
	public DiskImageVolumeDescription withId(String id) {
		setId(id);
		return this;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("[size=");
		builder.append(size);
		builder.append(", id=");
		builder.append(id);
		builder.append("]");
		return builder.toString();
	}

}
