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

/**
 * ディスクイメージ詳細情報クラス。<br />
 * このクラスはディスクイメージ詳細情報を格納します。
 */
public class DiskImageDescription {
	/** イメージフォーマット */
	private String format;
	/** イメージサイズ */
	private Long size;

	private String importManifestUrl;

	private Integer checksum;

	/**
	 * イメージフォーマットを取得します。
	 * @return イメージフォーマット
	 */
	public String getFormat() {
		return format;
	}
	/**
	 * イメージフォーマットを設定します。
	 * @param format イメージフォーマット
	 */
	public void setFormat(String format) {
		this.format = format;
	}
	/**
	 * イメージフォーマットを設定し、自オブジェクトを返します。
	 * @param format イメージフォーマット
	 * @return 自オブジェクト
	 */
	public DiskImageDescription withFormat(String format) {
		setFormat(format);
		return this;
	}

	/**
	 * イメージサイズを取得します。
	 * @return イメージサイズ
	 */
	public Long getSize() {
		return size;
	}
	/**
	 * イメージサイズを設定します。
	 * @param size イメージサイズ
	 */
	public void setSize(Long size) {
		this.size = size;
	}
	/**
	 * イメージサイズを設定し、自オブジェクトを返します。
	 * @param size イメージサイズ
	 * @return 自オブジェクト
	 */
	public DiskImageDescription withSize(Long size) {
		setSize(size);
		return this;
	}

	/**
	 * importManifestUrlを取得します。
	 * @return importManifestUrl
	 */
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
	public DiskImageDescription withImportManifestUrl(String importManifestUrl) {
		setImportManifestUrl(importManifestUrl);
		return this;
	}

	/**
	 * checksumを取得します。
	 * @return checksum
	 */
	public Integer getChecksum() {
		return checksum;
	}
	/**
	 * checksumを設定します。
	 * @param checksum
	 */
	public void setChecksum(Integer checksum) {
		this.checksum = checksum;
	}
	/**
	 * checksumを設定し、自オブジェクトを返します。
	 * @param checksum
	 * @return 自オブジェクト
	 */
	public DiskImageDescription withChecksum(Integer checksum) {
		setChecksum(checksum);
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
		builder.append(", size=");
		builder.append(size);
		builder.append(", importManifestUrl=");
		builder.append(importManifestUrl);
		builder.append(", checksum=");
		builder.append(checksum);
		builder.append("]");
		return builder.toString();
	}
}
