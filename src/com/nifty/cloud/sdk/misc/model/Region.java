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
package com.nifty.cloud.sdk.misc.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * リージョン情報クラス。<br />
 * このクラスリージョン情報を格納します。
 *
 */
public class Region {
	/** リージョン名 */
	private String regionName;
	/** エンドポイント */
	private String regionEndpoint;
	/** メッセージリスト */
	private List<String> messages;
	/** デフォルトリージョンかどうか */
	private Boolean isDefault;

	/**
	 * リージョン名を取得します。
	 * @return リージョン名
	 */
	public String getRegionName() {
		return regionName;
	}
	/**
	 * リージョン名を設定します。
	 * @param regionName リージョン名
	 */
	public void setRegionName(String regionName) {
		this.regionName = regionName;
	}
	/**
	 * リージョン名を設定し、自オブジェクトを返します。
	 * @param regionName リージョン名
	 * @return 自オブジェクト
	 */
	public Region withRegionName(String regionName) {
		setRegionName(regionName);
		return this;
	}

	/**
	 * エンドポイントを取得します。
	 * @return エンドポイント
	 */
	public String getRegionEndpoint() {
		return regionEndpoint;
	}
	/**
	 * エンドポイントを設定します。
	 * @param regionEndpoint エンドポイント
	 */
	public void setRegionEndpoint(String regionEndpoint) {
		this.regionEndpoint = regionEndpoint;
	}
	/**
	 * エンドポイントを設定し、自オブジェクトを返します。
	 * @param regionEndpoint エンドポイント
	 * @return 自オブジェクト
	 */
	public Region withRegionEndpoint(String regionEndpoint){
		setRegionEndpoint(regionEndpoint);
		return this;
	}

	/**
	 * メッセージリストを取得します。
	 * 
	 * @return メッセージリスト
	 */
	public List<String> getMessages() {
		return messages;
	}
	/**
	 * メッセージリストを設定します。
	 * 
	 * @param messages メッセージリスト
	 */
	public void setMessages(List<String> messages) {
		this.messages = messages;
	}
	/**
	 * メッセージの配列を設定し、自オブジェクトを返します。
	 *
	 * @param messages メッセージの配列
	 * @return 自オブジェクト
	 */
	public Region withMessages(String ... messages) {
		if(this.messages == null) this.messages = new ArrayList<String>();
		for(String message: messages) {
			getMessages().add(message);
		}
		return this;
	}
	/**
	 * メッセージリストを設定し、自オブジェクトを返します。
	 *
	 * @param messages メッセージリスト
	 * @return 自オブジェクト
	 */
	public Region withMessages(Collection<String> messages) {
		if(this.messages == null) this.messages = new ArrayList<String>();
		if (messages != null) {
			getMessages().addAll(messages);
		}
		return this;
	}

	/**
	 * デフォルトリージョンかどうかを取得します。
	 * @return デフォルトリージョンかどうか
	 */
	public Boolean getIsDefault() {
		return isDefault;
	}
	/**
	 * デフォルトリージョンかどうかを設定します。
	 * @param isDefault デフォルトリージョンかどうか
	 */
	public void setIsDefault(Boolean isDefault) {
		this.isDefault = isDefault;
	}
	/**
	 * デフォルトリージョンかどうかを設定し、自オブジェクトを返します。
	 * @param isDefault デフォルトリージョンかどうか
	 * @return 自オブジェクト
	 */
	public Region withIsDefault(Boolean isDefault) {
		setIsDefault(isDefault);
		return this;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("[regionName=");
		builder.append(regionName);
		builder.append(", regionEndpoint=");
		builder.append(regionEndpoint);
		builder.append(", messages=");
		builder.append(messages);
		builder.append(", isDefault=");
		builder.append(isDefault);
		builder.append("]");
		return builder.toString();

	}
}
