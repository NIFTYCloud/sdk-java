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
package com.nifty.cloud.sdk.misc.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * ゾーン情報クラス。<br />
 * このクラスはゾーン情報を格納します。
 */
public class AvailabilityZone {
	
	/** ゾーン名 */
	private String	zoneName;
	
	/** ゾーンステータス */
	private String	state;
	
	/** リージョン名 */
	private String	regionName;
	
	/** メッセージリスト */
	private List<String> messages;
	
	/** ファイアウォール指定可否 */
	private Boolean securityGroupSupported;
	
	/** デフォルトゾーンかどうか */
	private Boolean isDefault;

	/**
	 * ゾーン名を取得します。
	 * 
	 * @return ゾーン名
	 */
	public String getZoneName() {
		return zoneName;
	}
	/**
	 * ゾーン名を設定します。
	 * 
	 * @param zoneName ゾーン名
	 */
	public void setZoneName(String zoneName) {
		this.zoneName = zoneName;
	}
	/**
	 * ゾーン名を設定し、自オブジェクトを返します。
	 *
	 * @param zoneName ゾーン名
	 * @return 自オブジェクト	 
	 */
	public AvailabilityZone withZoneName(String zoneName) {
		setZoneName(zoneName);
		return this;
	}
	
	/**
	 * ゾーンステータスを取得します。
	 * 
	 * @return ゾーンステータス
	 */
	public String getState() {
		return state;
	}
	/**
	 * ゾーンステータスを設定します。
	 * 
	 * @param state ゾーンステータス
	 */
	public void setState(String state) {
		this.state = state;
	}
	/**
	 * ゾーンステータスを設定し、自オブジェクトを返します。
	 *
	 * @param state ゾーンステータス
	 * @return 自オブジェクト	 
	 */
	public AvailabilityZone withState(String state) {
		setState(state);
		return this;
	}
	
	/**
	 * リージョン名を取得します。
	 * 
	 * @return リージョン名
	 */
	public String getRegionName() {
		return regionName;
	}
	/**
	 * リージョン名を設定します。
	 * 
	 * @param regionName リージョン名
	 */
	public void setRegionName(String regionName) {
		this.regionName = regionName;
	}
	/**
	 * リージョン名を設定し、自オブジェクトを返します。
	 *
	 * @param regionName リージョン名
	 * @return 自オブジェクト
	 */
	public AvailabilityZone withRegionName(String regionName) {
		setRegionName(regionName);
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
	public AvailabilityZone withMessages(String ... messages) {
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
	public AvailabilityZone withMessages(Collection<String> messages) {
		if(this.messages == null) this.messages = new ArrayList<String>();
		if (messages != null) {
			getMessages().addAll(messages);
		}
		return this;
	}
	
	/**
	 * ファイアウォール指定可否を取得します。
	 * @return ファイアウォール指定可否
	 */
	public Boolean getSecurityGroupSupported() {
		return securityGroupSupported;
	}
	/**
	 * ファイアウォール指定可否を設定します。
	 * @param securityGroupSupported ファイアウォール指定可否
	 */
	public void setSecurityGroupSupported(Boolean securityGroupSupported) {
		this.securityGroupSupported = securityGroupSupported;
	}
	/**
	 * ファイアウォール指定可否を設定し、自オブジェクトを返します。
	 * @param securityGroupSupported ファイアウォール指定可否
	 * @return 自オブジェクト
	 */
	public AvailabilityZone withSecurityGroupSupported(Boolean securityGroupSupported) {
		setSecurityGroupSupported(securityGroupSupported);
		return this;
	}
	
	/**
	 * デフォルトゾーンかどうかを取得します。
	 * @return デフォルトゾーンかどうか
	 */
	public Boolean getIsDefault() {
		return isDefault;
	}
	/**
	 * デフォルトゾーンかどうかを設定します。
	 * @param isDefault デフォルトゾーンかどうか
	 */
	public void setIsDefault(Boolean isDefault) {
		this.isDefault = isDefault;
	}
	/**
	 * デフォルトゾーンかどうかを設定し、自オブジェクトを返します。
	 * @param isDefault デフォルトゾーンかどうか
	 * @return 自オブジェクト
	 */
	public AvailabilityZone withIsDefault(Boolean isDefault) {
		setIsDefault(isDefault);
		return this;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("[zoneName=");
		builder.append(zoneName);
		builder.append(", state=");
		builder.append(state);
		builder.append(", regionName=");
		builder.append(regionName);
		builder.append(", messages=");
		builder.append(messages);
		builder.append(", securityGroupSupported=");
		builder.append(securityGroupSupported);
		builder.append(", isDefault=");
		builder.append(isDefault);
		builder.append("]");
		return builder.toString();
	}
	
}
