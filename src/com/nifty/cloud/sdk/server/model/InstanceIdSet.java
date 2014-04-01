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

import com.nifty.cloud.sdk.annotation.Query;

/**
 * サーバー情報クラス。<br />
 * このクラスはサーバー情報を格納します。
 */
public class InstanceIdSet {
	
	/** サーバー名 */
	private String instanceId;
	
	/** サーバータイプ */
	private String instanceType;
	
	/** 利用料金タイプ */
	private String accountingType;
	
	
	/**
	 * サーバー名を取得します。
	 * 
	 * @return サーバー名
	 */
	@Query(name="InstanceId", require=true, reverseSequence=true)
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
	public InstanceIdSet withInstanceId(String instanceId) {
		setInstanceId(instanceId);
		return this;
	}	
	
	/**
	 * サーバータイプを取得します。
	 * 
	 * @return サーバータイプ
	 */
	@Query(name="InstanceType", reverseSequence=true)
	public String getInstanceType() {
		return instanceType;
	}
	/**
	 * サーバータイプを設定します。
	 * 
	 * @param instanceType サーバータイプ
	 */
	public void setInstanceType(String instanceType) {
		this.instanceType = instanceType;
	}
	/**
	 * サーバータイプを設定し、自オブジェクトを返します。
	 *
	 * @param instanceType サーバータイプ
	 * @return 自オブジェクト	 
	 */
	public InstanceIdSet withInstanceType(String instanceType) {
		setInstanceType(instanceType);
		return this;
	}

	/**
	 * 利用料金タイプを取得します。
	 * 
	 * @return 利用料金タイプ
	 */
	@Query(name="AccountingType", reverseSequence=true)
	public String getAccountingType() {
		return accountingType;
	}
	/**
	 * 利用料金タイプを設定します。
	 * 
	 * @param accountingType 利用料金タイプ
	 */
	public void setAccountingType(String accountingType) {
		this.accountingType = accountingType;
	}
	/**
	 * 利用料金タイプを設定し、自オブジェクトを返します。
	 *
	 * @param accountingType 利用料金タイプ
	 * @return 自オブジェクト	 
	 */
	public InstanceIdSet withAccountingType(String accountingType) {
		setAccountingType(accountingType);
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
		builder.append(", instanceType=");
		builder.append(instanceType);
		builder.append(", accountingType=");
		builder.append(accountingType);
		builder.append("]");
		return builder.toString();
	}

}
