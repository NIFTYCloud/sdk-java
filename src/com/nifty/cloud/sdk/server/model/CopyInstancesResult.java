/******************************************************************************* 
 *  Copyright 2012 NIFTY Corporation All Rights Reserved.
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
 *  API Version: 1.12
 *  Date: 2012-12-21 17:00:00
 * 
 */
package com.nifty.cloud.sdk.server.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.nifty.cloud.sdk.Result;
import com.nifty.cloud.sdk.server.model.transform.CopyInstanceSetConverter;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamConverter;

/**
 * CopyInstances結果処理クラス。<br />
 * このクラスはCopyInstancesのレスポンスを格納します。
 *
 */
@XStreamAlias("CopyInstancesResponse")
public class CopyInstancesResult extends Result {

	/** リクエスト識別子 */
	@XStreamAlias("requestId")
	private String requestId;
	
	/** コピー後のサーバー情報リスト */
	@XStreamAlias("copyInstanceSet")
	@XStreamConverter(CopyInstanceSetConverter.class)
	private List<CopyInstanceSet> copyInstances;
	
	
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
	public CopyInstancesResult withRequestId(String requestId) {
		setRequestId(requestId);
		return this;
	}
	
	/**
	 * コピー後のサーバー情報リストを取得します。
	 * 
	 * @return コピー後のサーバー情報リスト
	 */
	public List<CopyInstanceSet> getCopyInstances() {
		return copyInstances;
	}
	/**
	 * コピー後のサーバー情報リストを設定します。
	 * 
	 * @param copyInstances コピー後のサーバー情報リスト
	 */
	public void setCopyInstances(List<CopyInstanceSet> copyInstances) {
		this.copyInstances = copyInstances;
	}
	/**
	 * コピー後のサーバー情報配列を設定し、自オブジェクトを返します。
	 *
	 * @param copyInstances コピー後のサーバー情報配列
	 * @return 自オブジェクト	 
	 */
	public CopyInstancesResult withCopyInstances(CopyInstanceSet ... copyInstances) {
		if(this.copyInstances == null) this.copyInstances = new ArrayList<CopyInstanceSet>();
		for(CopyInstanceSet copyInstance : copyInstances) {
			getCopyInstances().add(copyInstance);
		}
		return this;
	}
	/**
	 * コピー後のサーバー情報リストを設定し、自オブジェクトを返します。
	 *
	 * @param copyInstances コピー後のサーバー情報リスト
	 * @return 自オブジェクト	 
	 */
	public CopyInstancesResult withCopyInstances(Collection<CopyInstanceSet> copyInstances) {
		if(this.copyInstances == null) this.copyInstances = new ArrayList<CopyInstanceSet>();
		if(copyInstances != null){
			getCopyInstances().addAll(copyInstances);
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
		builder.append(", copyInstances=");
		builder.append(copyInstances);
		builder.append("]");
		return builder.toString();
	}
	
}
