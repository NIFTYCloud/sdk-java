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

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.nifty.cloud.sdk.Result;
import com.nifty.cloud.sdk.server.model.transform.InstanceStateChangeSetConverter;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamConverter;

/**
 * StartInstances結果処理クラス。<br />
 * このクラスはStartInstancesのレスポンスを格納します。
 */
@XStreamAlias("StartInstancesResponse")
public class StartInstancesResult extends Result {
	
	/** リクエスト識別子 */	
	@XStreamAlias("requestId")
	private String requestId;
	
	/** 対象サーバーの情報リスト */
	@XStreamAlias("instancesSet")
	@XStreamConverter(InstanceStateChangeSetConverter.class)
	private List<InstanceStateChange>	startingInstances;
	
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
	public StartInstancesResult withRequestId(String requestId) {
		setRequestId(requestId);
		return this;
	}
	
	/**
	 * 対象サーバーのステータス情報リストを取得します。
	 * 
	 * @return 対象サーバーのステータス情報リスト
	 */
	public List<InstanceStateChange> getStartingInstances() {
		return startingInstances;
	}
	/**
	 * 対象サーバーのステータス情報リストを設定します。
	 * 
	 * @param startingInstances 対象サーバーのステータス情報リスト
	 */
	public void setStartingInstances(List<InstanceStateChange> startingInstances) {
		this.startingInstances = startingInstances;
	}
	/**
	 * サーバー状態変更情報の配列を設定し、自オブジェクトを返します。
	 *
	 * @param startingInstances サーバー状態変更情報の配列
	 * @return 自オブジェクト	 
	 */
	public StartInstancesResult withStartingInstances(InstanceStateChange ... startingInstances) {
		if(this.startingInstances == null) this.startingInstances = new ArrayList<InstanceStateChange>();
		for(InstanceStateChange startingInstance: startingInstances) {
			getStartingInstances().add(startingInstance);
		}
		return this;
	}
	/**
	 * 対象サーバーのステータス情報リストを設定し、自オブジェクトを返します。
	 *
	 * @param startingInstances 対象サーバーのステータス情報リスト
	 * @return 自オブジェクト	 
	 */
	public StartInstancesResult withStartingInstances(Collection<InstanceStateChange> startingInstances) {
		if(this.startingInstances == null) this.startingInstances = new ArrayList<InstanceStateChange>();
		if (startingInstances!=null) {
			getStartingInstances().addAll(startingInstances);
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
		builder.append(", startingInstances=");
		builder.append(startingInstances);
		builder.append("]");
		return builder.toString();
	}

}
