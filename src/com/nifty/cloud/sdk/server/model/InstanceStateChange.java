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
 * サーバーの情報クラス。<br />
 * このクラスはサーバーの情報を格納します。
 */
public class InstanceStateChange {
	
	/** サーバー名 */
	private String			instanceId;
	
	/** サーバーの現在のステータス */
	private InstanceState	currentState;
	
	/** サーバーの１つ前のステータス */
	private InstanceState	previousState;
	
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
	public InstanceStateChange withInstanceId(String instanceId) {
		setInstanceId(instanceId);
		return this;
	}	
	
	/**
	 * サーバーの現在のステータスを取得します。
	 * 
	 * @return サーバーの現在のステータス
	 */
	public InstanceState getCurrentState() {
		return currentState;
	}
	/**
	 * サーバーの現在のステータスを設定します。
	 * 
	 * @param currentState サーバーの現在のステータス
	 */
	public void setCurrentState(InstanceState currentState) {
		this.currentState = currentState;
	}
	/**
	 * サーバーの現在のステータスを設定し、自オブジェクトを返します。
	 *
	 * @param currentState サーバーの現在のステータス
	 * @return 自オブジェクト	 
	 */
	public InstanceStateChange withCurrentState(InstanceState currentState) {
		setCurrentState(currentState);
		return this;
	}

	/**
	 * サーバーの１つ前のステータスを取得します。
	 * 
	 * @return サーバーの１つ前のステータス
	 */
	public InstanceState getPreviousState() {
		return previousState;
	}
	/**
	 * サーバーの１つ前のステータスを設定します。
	 * 
	 * @param previousState サーバーの１つ前のステータス
	 */
	public void setPreviousState(InstanceState previousState) {
		this.previousState = previousState;
	}
	/**
	 * サーバーの１つ前のステータスを設定し、自オブジェクトを返します。
	 *
	 * @param previousState サーバーの１つ前のステータス
	 * @return 自オブジェクト	 
	 */
	public InstanceStateChange withPreviousState(InstanceState previousState) {
		setPreviousState(previousState);
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
		builder.append(", currentState=");
		builder.append(currentState);
		builder.append(", previousState=");
		builder.append(previousState);
		builder.append("]");
		return builder.toString();
	}

}
