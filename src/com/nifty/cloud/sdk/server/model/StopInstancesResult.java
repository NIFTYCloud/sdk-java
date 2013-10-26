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
package com.nifty.cloud.sdk.server.model;

import java.util.ArrayList;
import java.util.List;

import com.nifty.cloud.sdk.Result;
import com.nifty.cloud.sdk.server.model.transform.InstanceStateChangeSetConverter;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamConverter;

/**
 * StopInstances結果処理クラス。<br />
 * このクラスはStopInstancesのレスポンスを格納します。
 */
@XStreamAlias("StopInstancesResponse")
public class StopInstancesResult extends Result {

	/** リクエスト識別子 */
	@XStreamAlias("requestId")
	private String		requestId;

	/** 対象サーバーの情報リスト */
	@XStreamAlias("instancesSet")
	@XStreamConverter(InstanceStateChangeSetConverter.class)
	private List<InstanceStateChange>	stoppingInstances;

	/**
	 * リクエスト識別子を取得します。
	 *
	 * @return リクエスト識別子
	 */
	public String getRequestId() {
		return requestId;
	}
	/**
	 * リクエスト識別子を設定します。
	 *
	 * @param requestId リクエスト識別子
	 */
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}
	/**
	 * リクエスト識別子を設定し、自オブジェクトを返します。
	 *
	 * @param requestId リクエスト識別子
	 * @return 自オブジェクト
	 */
	public StopInstancesResult withRequestId(String requestId) {
		setRequestId(requestId);
		return this;
	}

	/**
	 * 対象サーバーの情報リストを取得します。
	 *
	 * @return 対象サーバーの情報リスト
	 */
	public List<InstanceStateChange> getStoppingInstances() {
		return stoppingInstances;
	}
	/**
	 * 対象サーバーの情報リストを設定します。
	 *
	 * @param stoppingInstances 対象サーバーの情報リスト
	 */
	public void setStoppingInstances(List<InstanceStateChange> stoppingInstances) {
		this.stoppingInstances = stoppingInstances;
	}
	/**
	 * 対象サーバーの情報の配列を設定し、自オブジェクトを返します。
	 *
	 * @param stoppingInstances 対象サーバーの情報の配列
	 * @return 自オブジェクト
	 */
	public StopInstancesResult withStoppingInstances(InstanceStateChange ... stoppingInstances) {
		if(this.stoppingInstances == null) this.stoppingInstances = new ArrayList<InstanceStateChange>();
		for(InstanceStateChange stoppingInstance: stoppingInstances) {
			getStoppingInstances().add(stoppingInstance);
		}
		return this;
	}
	/**
	 * 対象サーバーの情報リストを設定し、自オブジェクトを返します。
	 *
	 * @param stoppingInstances 対象サーバーの情報リスト
	 * @return 自オブジェクト
	 */
	public StopInstancesResult withStoppingInstances(List<InstanceStateChange> stoppingInstances) {
		if(this.stoppingInstances == null) this.stoppingInstances = new ArrayList<InstanceStateChange>();
		if (stoppingInstances!=null) {
			getStoppingInstances().addAll(stoppingInstances);
		}
		return this;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("[requestId=");
		builder.append(requestId);
		builder.append(", stoppingInstances=");
		builder.append(stoppingInstances);
		builder.append("]");
		return builder.toString();
	}

}
