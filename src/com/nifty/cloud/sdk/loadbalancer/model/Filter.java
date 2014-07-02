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
 *  API Version: 1.18
 *  Date: 2014-05-23 17:00:00
 * 
 */
package com.nifty.cloud.sdk.loadbalancer.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * フィルター情報クラス。<br />
 * このクラスはフィルター情報を格納します。
 */
public class Filter {
	
	/** 指定したアクセス元IPアドレスへの対処  */
	private String filterType;
	
	/** フィルター対象のアクセス元IPアドレスの情報リスト */
	private List<String> ipAddresses;
	
	
	/**
	 * 指定したアクセス元IPアドレスへの対処を取得します。
	 * 
	 * @return 指定したアクセス元IPアドレスへの対処
	 */
	public String getFilterType() {
		return filterType;
	}
	/**
	 * 指定したアクセス元IPアドレスへの対処を設定します。
	 * 
	 * @param filterType 指定したアクセス元IPアドレスへの対処
	 */
	public void setFilterType(String filterType) {
		this.filterType = filterType;
	}
	/**
	 * 指定したアクセス元IPアドレスへの対処を設定し、自オブジェクトを返します。
	 *
	 * @param filterType 指定したアクセス元IPアドレスへの対処
	 * @return 自オブジェクト
	 */
	public Filter withFilterType(String filterType) {
		setFilterType(filterType);
		return this;
	}
	
	/**
	 * フィルター対象のアクセス元IPアドレスの情報リストを取得します。
	 * 
	 * @return フィルター対象のアクセス元IPアドレスの情報リスト
	 */
	public List<String> getIpAddresses() {
		return ipAddresses;
	}
	/**
	 * フィルター対象のアクセス元IPアドレスの情報リストを設定します。
	 * 
	 * @param ipAddresses フィルター対象のアクセス元IPアドレスの情報リスト
	 */
	public void setIpAddresses(List<String> ipAddresses) {
		this.ipAddresses = ipAddresses;
	}
	/**
	 * フィルター対象のアクセス元IPアドレスの情報の配列を設定し、自オブジェクトを返します。
	 *
	 * @param ipAddresses フィルター対象のアクセス元IPアドレスの情報の配列
	 * @return 自オブジェクト
	 */
	public Filter withIpAddresses(String ... ipAddresses) {
		if(this.ipAddresses == null) this.ipAddresses = new ArrayList<String>();
		for(String ipAddress: ipAddresses) {
			getIpAddresses().add(ipAddress);
		}
		return this;
	}
	/**
	 * フィルター対象のアクセス元IPアドレスの情報リストを設定し、自オブジェクトを返します。
	 *
	 * @param ipAddresses フィルター対象のアクセス元IPアドレスの情報リスト
	 * @return 自オブジェクト
	 */
	public Filter withIpAddresses(Collection<String> ipAddresses) {
		if(this.ipAddresses == null) this.ipAddresses = new ArrayList<String>();
		if(ipAddresses!=null) {
			getIpAddresses().addAll(ipAddresses);
		}
		return this;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("[filterType=");
		builder.append(filterType);
		builder.append(", ipAddresses=");
		builder.append(ipAddresses);
		builder.append("]");
		return builder.toString();
	}
	
}
