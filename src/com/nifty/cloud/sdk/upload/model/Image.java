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
 *  Date: 2011-11-29 14:07:10
 *
 */
package com.nifty.cloud.sdk.upload.model;

/**
 * ディスクイメージの情報格納クラス。<br />
 * このクラスはディスクイメージの情報を格納します。
 */
public class Image {
	/** イメージフォーマット */
	private String format;

	/** イメージサイズ */
	private Long size;

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
	public Image withFormat(String format) {
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
	 * イメージフォーマットを設定し、自オブジェクトを返します。
	 * @param size イメージサイズ
	 * @return 自オブジェクト
	 */
	public Image withSize(Long size) {
		setSize(size);
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
		builder.append("]");
		return builder.toString();
	}
}
