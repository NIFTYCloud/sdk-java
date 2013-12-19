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
package com.nifty.cloud.sdk.loadbalancer.model;

/**
 * サーバー状態クラス。<br />
 * このクラスはサーバー状態の情報を格納します。
 */
public class InstanceState {
	
	/** サーバー名 */
	private String instanceId;
	
	/** ヘルスステータス */
	private String state;
	
	private String reasonCode;
	
	private String description;
	
	
	/**
	 * サーバー名を取得します。
	 * 
	 * @return サーバー名
	 */
	public String getInstanceId() {
		return instanceId;
	}
	/**
	 * サーバー名を設定します。
	 * 
	 * @param instanceId サーバー名
	 */
	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
	}
	/**
	 * サーバー名を設定し、自オブジェクトを返します。
	 *
	 * @param instanceId サーバー名
	 * @return 自オブジェクト
	 */
	public InstanceState withInstanceId(String instanceId) {
		setInstanceId(instanceId);
		return this;
	}
	
	/**
	 * ヘルスステータスを取得します。
	 * 
	 * @return ヘルスステータス
	 */
	public String getState() {
		return state;
	}
	/**
	 * ヘルスステータスを設定します。
	 * 
	 * @param state ヘルスステータス
	 */
	public void setState(String state) {
		this.state = state;
	}
	/**
	 * ヘルスステータスを設定し、自オブジェクトを返します。
	 *
	 * @param state ヘルスステータス
	 * @return 自オブジェクト
	 */
	public InstanceState withState(String state) {
		setState(state);
		return this;
	}
	
	/**
	 * reasonCodeを取得します。
	 * 
	 * @return reasonCode
	 */
	public String getReasonCode() {
		return reasonCode;
	}
	/**
	 * reasonCodeを設定します。
	 * 
	 * @param reasonCode
	 */
	public void setReasonCode(String reasonCode) {
		this.reasonCode = reasonCode;
	}
	/**
	 * reasonCodeを設定し、自オブジェクトを返します。
	 *
	 * @param reasonCode
	 * @return 自オブジェクト
	 */
	public InstanceState withReasonCode(String reasonCode) {
		setReasonCode(reasonCode);
		return this;
	}
	
	/**
	 * descriptionを取得します。
	 * 
	 * @return description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * descriptionを設定します。
	 * 
	 * @param description
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * descriptionを設定し、自オブジェクトを返します。
	 *
	 * @param description
	 * @return 自オブジェクト
	 */
	public InstanceState withDescription(String description) {
		setDescription(description);
		return this;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("[instanceId=");
		builder.append(instanceId);
		builder.append(", state=");
		builder.append(state);
		builder.append(", reasonCode=");
		builder.append(reasonCode);
		builder.append(", description=");
		builder.append(description);
		builder.append("]");
		return builder.toString();
	}

}
