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
 *  API Version: 1.15
 *  Date: 2013-06-28 17:00:00
 * 
 */
package com.nifty.cloud.sdk.server.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * アップロードタスク情報クラス。<br />
 * このクラスはアップロードタスク情報を格納します。
 */
public class ConversionTask {
	/** アップロードID */
	private String conversionTaskId;

	/** 破棄予定時間 */
	private Date expirationTime;

	/** インポートサーバー情報 */
	private ImportInstance importInstance;

	private String state;
	private String statusMessage;
	private List<Tag> tagSet;

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
	public ConversionTask withConversionTaskId(String conversionTaskId) {
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
	public ConversionTask withExpirationTime(Date expirationTime) {
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
	public ConversionTask withImportInstance(ImportInstance importInstance) {
		setImportInstance(importInstance);
		return this;
	}

	/**
	 * stateを取得します。
	 * @return state
	 */
	public String getState() {
		return state;
	}
	/**
	 * stateを設定します。
	 * @param state
	 */
	public void setState(String state) {
		this.state = state;
	}
	/**
	 * stateを設定し、自オブジェクトを返します。
	 * @param state
	 * @return 自オブジェクト
	 */
	public ConversionTask withState(String state) {
		setState(state);
		return this;
	}

	/**
	 * statusMessageを取得します。
	 * @return statusMessage
	 */
	public String getStatusMessage() {
		return statusMessage;
	}
	/**
	 * statusMessageを設定します。
	 * @param statusMessage
	 */
	public void setStatusMessage(String statusMessage) {
		this.statusMessage = statusMessage;
	}
	/**
	 * statusMessageを設定し、自オブジェクトを返します。
	 * @param statusMessage
	 * @return 自オブジェクト
	 */
	public ConversionTask withStatusMessage(String statusMessage) {
		setStatusMessage(statusMessage);
		return this;
	}

	/**
	 * tagSetを取得します。
	 * @return tagSet
	 */
	public List<Tag> getTagSet() {
		return tagSet;
	}
	/**
	 * tagSetを設定します。
	 * @param tagSet
	 */
	public void setTagSet(List<Tag> tagSet) {
		this.tagSet = tagSet;
	}
	/**
	 * tagSetを設定し、自オブジェクトを返します。
	 * @param tagSet
	 * @return 自オブジェクト
	 */
	public ConversionTask withTagSet(List<Tag> tagSet) {
		if (this.tagSet == null) this.tagSet = new ArrayList<Tag>();
		if (tagSet != null) {
			this.tagSet.addAll(tagSet);
		}
		return this;
	}
	/**
	 * tagSetを設定し、自オブジェクトを返します。
	 * @param tagSet
	 * @return 自オブジェクト
	 */
	public ConversionTask withTagSet(Tag... tagSet) {
		if (this.tagSet == null) this.tagSet = new ArrayList<Tag>();
		for (Tag tag : tagSet) {
			this.tagSet.add(tag);
		}
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
		builder.append(", tagSet=");
		builder.append(tagSet);
		builder.append("]");
		return builder.toString();
	}
}
