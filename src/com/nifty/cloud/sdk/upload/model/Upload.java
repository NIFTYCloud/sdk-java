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
package com.nifty.cloud.sdk.upload.model;

import java.util.Date;

import com.nifty.cloud.sdk.Result;

/**
 * ディスクイメージの情報格納クラス。<br />
 * このクラスはディスクイメージの情報を格納します。
 */
public class Upload extends Result {
	/** アップロードID */
	private String conversionTaskId;

	/** 破棄予定時間 */
	private Date expirationTime;

	/** インポートサーバー情報 */
	private ImportInstance importInstance;

	/**
	 * アップロードIDを取得します。
	 * @return アップロードID
	 */
	public String getConversionTaskId() {
		return conversionTaskId;
	}
	/**
	 * アップロードIDを設定します。
	 * @param conversionTaskId アップロードID
	 */
	public void setConversionTaskId(String conversionTaskId) {
		this.conversionTaskId = conversionTaskId;
	}
	/**
	 * アップロードIDを設定し、自オブジェクトを返します。
	 * @param conversionTaskId アップロードID
	 * @return 自オブジェクト
	 */
	public Upload withConversionTaskId(String conversionTaskId) {
		setConversionTaskId(conversionTaskId);
		return this;
	}

	/**
	 * 破棄予定時間を取得します。
	 * @return 破棄予定時間
	 */
	public Date getExpirationTime() {
		return expirationTime;
	}
	/**
	 * 破棄予定時間を設定します。
	 * @param expirationTime 破棄予定時間
	 */
	public void setExpirationTime(Date expirationTime) {
		this.expirationTime = expirationTime;
	}
	/**
	 * 破棄予定時間を設定し、自オブジェクトを返します。
	 * @param expirationTime 破棄予定時間
	 * @return 自オブジェクト
	 */
	public Upload withExpirationTime(Date expirationTime) {
		setExpirationTime(expirationTime);
		return this;
	}

	/**
	 * インポートサーバー情報を取得します。
	 * @return インポートサーバー情報
	 */
	public ImportInstance getImportInstance() {
		return importInstance;
	}
	/**
	 * インポートサーバー情報を設定します。
	 * @param importInstance インポートサーバー情報
	 */
	public void setImportInstance(ImportInstance importInstance) {
		this.importInstance = importInstance;
	}
	/**
	 * インポートサーバー情報を設定し、自オブジェクトを返します。
	 * @param importInstance インポートサーバー情報
	 * @return 自オブジェクト
	 */
	public Upload withImportInstance(ImportInstance importInstance) {
		setImportInstance(importInstance);
		return this;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("[conversionTaskId=");
		builder.append(conversionTaskId);
		builder.append(", expirationTime=");
		builder.append(expirationTime);
		builder.append(", importInstance=");
		builder.append(importInstance);
		builder.append("]");
		return builder.toString();
	}

}
