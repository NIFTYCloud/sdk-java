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
 *  API Version: 1.9
 *  Date: 2011-08-25 09:46:38
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
	
	private String	regionName;
	
	private List<String> messages;
	
	
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
	 * regionNameを取得します。
	 * 
	 * @return regionName
	 */
	public String getRegionName() {
		return regionName;
	}
	/**
	 * regionNameを設定します。
	 * 
	 * @param regionName
	 */
	public void setRegionName(String regionName) {
		this.regionName = regionName;
	}
	/**
	 * regionNameを設定し、自オブジェクトを返します。
	 *
	 * @param regionName
	 * @return 自オブジェクト
	 */
	public AvailabilityZone withRegionName(String regionName) {
		setRegionName(regionName);
		return this;
	}
	
	/**
	 * messagesを取得します。
	 * 
	 * @return messages
	 */
	public List<String> getMessages() {
		return messages;
	}
	/**
	 * messagesを設定します。
	 * 
	 * @param messages
	 */
	public void setMessages(List<String> messages) {
		this.messages = messages;
	}
	/**
	 * messagesの配列を設定し、自オブジェクトを返します。
	 *
	 * @param messages
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
	 * messagesを設定し、自オブジェクトを返します。
	 *
	 * @param messages
	 * @return 自オブジェクト
	 */
	public AvailabilityZone withMessages(Collection<String> messages) {
		if(this.messages == null) this.messages = new ArrayList<String>();
		if (messages != null) {
			getMessages().addAll(messages);
		}
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
		builder.append("]");
		return builder.toString();
	}
	
}
