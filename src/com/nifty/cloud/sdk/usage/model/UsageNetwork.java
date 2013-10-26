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
package com.nifty.cloud.sdk.usage.model;

import java.util.ArrayList;
import java.util.List;

import com.nifty.cloud.sdk.usage.model.transform.UsageDetailSetConverter;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamConverter;

/**
 * ネットワーク情報クラス。<br />
 * このクラスはネットワーク情報を格納します。
 */
public class UsageNetwork {

	/** ネットワーク通信情報リスト */
	@XStreamAlias("networkFlowSet")
	@XStreamConverter(UsageDetailSetConverter.class)
	private List<UsageDetail> networkFlows;

	/**
	 * ネットワーク通信情報リストを取得します。
	 * 
	 * @return ネットワーク通信情報リスト
	 */
	public List<UsageDetail> getNetworkFlows() {
		return networkFlows;
	}

	/**
	 * ネットワーク通信情報リストを設定します。
	 * 
	 * @param networkFlows ネットワーク通信情報リスト
	 */
	public void setNetworkFlows(List<UsageDetail> networkFlows) {
		this.networkFlows = networkFlows;
	}

	/**
	 * ネットワーク通信情報の配列を設定し、自オブジェクトを返します。
	 * 
	 * @param networkFlows ネットワーク通信情報の配列
	 * @return 自オブジェクト
	 */
	public UsageNetwork withNetworkFlows(UsageDetail... networkFlows) {
		if (this.networkFlows == null) this.networkFlows = new ArrayList<UsageDetail>();
		for (UsageDetail networkFlow : networkFlows) {
			getNetworkFlows().add(networkFlow);
		}
		return this;
	}

	/**
	 * ネットワーク通信情報リストを設定し、自オブジェクトを返します。
	 * 
	 * @param networkFlows ネットワーク通信情報リスト
	 * @return 自オブジェクト
	 */
	public UsageNetwork withNetworkFlows(List<UsageDetail> networkFlows) {
		if (this.networkFlows == null) this.networkFlows = new ArrayList<UsageDetail>();
		if (networkFlows != null) {
			getNetworkFlows().addAll(networkFlows);
		}
		return this;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("[networkFlows=");
		builder.append(networkFlows);
		builder.append("]");
		return builder.toString();
	}
}
