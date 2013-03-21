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
 *  Date: 2011-08-25 09:46:38
 * 
 */
package com.nifty.cloud.sdk.server.model;

/**
 * サーバー情報クラス。<br />
 * このクラスはコピー後のサーバー情報を格納します。
 */
public class CopyInstanceSet {
	
	/** サーバー名 */
	private String	instanceId;
	
	/** サーバーステータス */
	private String	instanceState;
	
	
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
	public CopyInstanceSet withInstanceId(String instanceId) {
		setInstanceId(instanceId);
		return this;
	}
	
	/**
	 * サーバーステータスを取得します。
	 * 
	 * @return サーバーステータス
	 */
	public String getInstanceState() {
		return instanceState;
	}
	/**
	 * サーバーステータスを設定します。
	 * 
	 * @param instanceState サーバーステータス
	 */
	public void setInstanceState(String instanceState) {
		this.instanceState = instanceState;
	}
	/**
	 * サーバーステータスを設定し、自オブジェクトを返します。
	 *
	 * @param instanceState サーバーステータス
	 * @return 自オブジェクト	 
	 */
	public CopyInstanceSet withInstanceState(String instanceState) {
		setInstanceState(instanceState);
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
		builder.append(", instanceState=");
		builder.append(instanceState);
		builder.append("]");
		return builder.toString();
	}

}
