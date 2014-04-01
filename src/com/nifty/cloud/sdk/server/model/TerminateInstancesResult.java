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

import java.util.ArrayList;
import java.util.List;

import com.nifty.cloud.sdk.Result;
import com.nifty.cloud.sdk.server.model.transform.InstanceStateChangeSetConverter;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamConverter;

/**
 * TerminateInstances結果処理クラス。<br />
 * このクラスはTerminateInstancesのレスポンスを格納します。
 */
@XStreamAlias("TerminateInstancesResponse")
public class TerminateInstancesResult extends Result {
	
	/** リクエスト識別子 */	
	@XStreamAlias("requestId")	
	private String		requestId;
	
	/** 対象サーバーの情報リスト */	
	@XStreamAlias("instancesSet")
	@XStreamConverter(InstanceStateChangeSetConverter.class)		
	private List<InstanceStateChange>	terminatingInstances;
	
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
	public TerminateInstancesResult withRequestId(String requestId) {
		setRequestId(requestId);
		return this;
	}	
	
	/**
	 * 対象サーバーの情報リストを取得します。
	 * 
	 * @return サーバーステータス情報リスト
	 */
	public List<InstanceStateChange> getTerminatingInstances() {
		return terminatingInstances;
	}
	/**
	 * 対象サーバーの情報リストを設定します。
	 * 
	 * @param terminatingInstances 対象サーバーの情報リスト
	 */
	public void setTerminatingInstances(
			List<InstanceStateChange> terminatingInstances) {
		this.terminatingInstances = terminatingInstances;
	}
	/**
	 * 対象サーバーの情報の配列を設定し、自オブジェクトを返します。
	 *
	 * @param terminatingInstances 対象サーバーの情報配列
	 * @return 自オブジェクト	 
	 */
	public TerminateInstancesResult withTerminatingInstances(InstanceStateChange ... terminatingInstances) {
		if(this.terminatingInstances == null) this.terminatingInstances = new ArrayList<InstanceStateChange>();
		for(InstanceStateChange terminatingInstance: terminatingInstances) {
			getTerminatingInstances().add(terminatingInstance);
		}
		return this;
	}
	/**
	 * 対象サーバーの情報リストを設定し、自オブジェクトを返します。
	 *
	 * @param terminatingInstances 対象サーバーの情報リスト
	 * @return 自オブジェクト	 
	 */
	public TerminateInstancesResult withTerminatingInstances(List<InstanceStateChange> terminatingInstances) {
		if(this.terminatingInstances == null) this.terminatingInstances = new ArrayList<InstanceStateChange>();
		if (terminatingInstances!=null) {
			getTerminatingInstances().addAll(terminatingInstances);
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
		builder.append(", terminatingInstances=");
		builder.append(terminatingInstances);
		builder.append("]");
		return builder.toString();
	}	
	
}
