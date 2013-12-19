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
 *  API Version: 1.16
 *  Date: 2013-10-18 17:00:00
 * 
 */
package com.nifty.cloud.sdk.server.model;

import com.nifty.cloud.sdk.annotation.Query;

/**
 * DiskImageDetailクラス。<br />
 * このクラスはDiskImageDetailを格納します。
 */
public class DiskImageDetail {

	private String format;

	private Long bytes;

	private String importManifestUrl;

	/**
	 * formatを取得します。
	 * @return format
	 */
	@Query(name="Format")
	public String getFormat() {
		return format;
	}
	/**
	 * formatを設定します。
	 * @param format
	 */
	public void setFormat(String format) {
		this.format = format;
	}
	/**
	 * formatを設定し、自オブジェクトを返します。
	 * @param format
	 * @return 自オブジェクト
	 */
	public DiskImageDetail withFormat(String format) {
		setFormat(format);
		return this;
	}

	/**
	 * bytesを取得します。
	 * @return bytes
	 */
	@Query(name="Bytes")
	public Long getBytes() {
		return bytes;
	}
	/**
	 * bytesを設定します。
	 * @param bytes
	 */
	public void setBytes(Long bytes) {
		this.bytes = bytes;
	}
	/**
	 * bytesを設定し、自オブジェクトを返します。
	 * @param bytes
	 * @return 自オブジェクト
	 */
	public DiskImageDetail withBytes(Long bytes) {
		setBytes(bytes);
		return this;
	}

	/**
	 * importManifestUrlを取得します。
	 * @return importManifestUrl
	 */
	@Query(name="ImportManifestUrl")
	public String getImportManifestUrl() {
		return importManifestUrl;
	}
	/**
	 * importManifestUrlを設定します。
	 * @param importManifestUrl importManifestUrl
	 */
	public void setImportManifestUrl(String importManifestUrl) {
		this.importManifestUrl = importManifestUrl;
	}
	/**
	 * importManifestUrlを設定し、自オブジェクトを返します。
	 * @param importManifestUrl
	 * @return 自オブジェクト
	 */
	public DiskImageDetail withImportManifestUrl(String importManifestUrl) {
		setImportManifestUrl(importManifestUrl);
		return this;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("[format=");
		builder.append(format);
		builder.append(", bytes=");
		builder.append(bytes);
		builder.append(", importManifestUrl=");
		builder.append(importManifestUrl);
		builder.append("]");
		return builder.toString();
	}
}
