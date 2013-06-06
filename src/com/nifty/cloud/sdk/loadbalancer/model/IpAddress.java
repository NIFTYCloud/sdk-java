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
package com.nifty.cloud.sdk.loadbalancer.model;

import com.nifty.cloud.sdk.annotation.Query;

/**
 * フィルター対象のアクセス元IPアドレスの情報クラス<br />
 * このクラスはフィルター対象のアクセス元IPアドレスの情報を格納します。
 */
public class IpAddress {
	
	/** アクセス元IPアドレス */
	private String ipAddress;
	
	/** 追加フラグ */
	private Boolean addOnFilter;
	
	/**
	 * アクセス元IPアドレス を取得します。
	 * 
	 * @return アクセス元IPアドレス 
	 */
	@Query(name="IPAddress")		
	public String getIpAddress() {
		return ipAddress;
	}
	/**
	 * アクセス元IPアドレス を設定します。
	 * 
	 * @param ipAddress アクセス元IPアドレス 
	 */
	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}
	/**
	 * アクセス元IPアドレス を設定し、自オブジェクトを返します。
	 *
	 * @param ipAddress アクセス元IPアドレス 
	 * @return 自オブジェクト
	 */
	public IpAddress withIpAddress(String ipAddress) {
		setIpAddress(ipAddress);
		return this;
	}
	
	/**
	 * 追加フラグを取得します。
	 * 
	 * @return 追加フラグ
	 */
	@Query(name="AddOnFilter")		
	public Boolean getAddOnFilter() {
		return addOnFilter;
	}
	/**
	 * 追加フラグを設定します。
	 * 
	 * @param addOnFilter 追加フラグ
	 */
	public void setAddOnFilter(Boolean addOnFilter) {
		this.addOnFilter = addOnFilter;
	}
	/**
	 * 追加フラグを設定し、自オブジェクトを返します。
	 *
	 * @param addOnFilter 追加フラグ
	 * @return 自オブジェクト
	 */
	public IpAddress withAddOnFilter(Boolean addOnFilter) {
		setAddOnFilter(addOnFilter);
		return this;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("[ipAddress=");
		builder.append(ipAddress);
		builder.append(", addOnFilter=");
		builder.append(addOnFilter);
		builder.append("]");
		return builder.toString();
	}
	
}
