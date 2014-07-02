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
package com.nifty.cloud.sdk.usage.model;

import java.util.ArrayList;
import java.util.List;

import com.nifty.cloud.sdk.usage.model.transform.UsageDetailSetConverter;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamConverter;

/**
 * 付替IP利用情報クラス。<br />
 * このクラスは付替IP利用情報を格納します。
 */
public class UsageElasticIp {

	/** 付替IP利用情報リスト */
	@XStreamAlias("elasticIpSet")
	@XStreamConverter(UsageDetailSetConverter.class)
	private List<UsageDetail> elasticIps;

	/**
	 * 付替IP情報リストを取得します。
	 * @return 付替IP利用情報リスト
	 */
	public List<UsageDetail> getElasticIps() {
		return elasticIps;
	}

	/**
	 * 付替IP利用情報リストを設定します。
	 * @param elasticIps 付替IP利用情報リスト
	 */
	public void setElasticIps(List<UsageDetail> elasticIps) {
		this.elasticIps = elasticIps;
	}
	/**
	 * 付替IP利用情報の配列を設定し、自オブジェクトを返します。
	 * @param elasticIps 付替IP利用情報の配列
	 * @return 自オブジェクト
	 */
	public UsageElasticIp withElasticIps(UsageDetail... elasticIps) {
		if(this.elasticIps == null) {
			this.elasticIps = new ArrayList<UsageDetail>();
		}
		for(UsageDetail elasticIp : elasticIps){
			getElasticIps().add(elasticIp);
		}
		return this;
	}
	/**
	 * 付替IP利用情報リストを設定し、自オブジェクトを返します。
	 * @param elasticIps 付替IP利用情報リスト
	 * @return 自オブジェクト
	 */
	public UsageElasticIp withElasticIps(List<UsageDetail> elasticIps) {
		if(this.elasticIps == null) {
			this.elasticIps = new ArrayList<UsageDetail>();
		}
		if(elasticIps != null){
			getElasticIps().addAll(elasticIps);
		}
		return this;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("[elasticIps=");
		builder.append(elasticIps);
		builder.append("]");
		return builder.toString();
	}
}
