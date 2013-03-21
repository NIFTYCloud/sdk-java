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

import com.nifty.cloud.sdk.Request;
import com.nifty.cloud.sdk.annotation.Action;
import com.nifty.cloud.sdk.annotation.Query;

/**
 * CopyInstancesリクエストクラス。<br />
 * このクラスはCopyInstancesへのリクエストを構築します。
 *
 */
@Action("CopyInstances")
public class CopyInstancesRequest implements Request {
	
	/** コピー元サーバー名 */
	private String	     instanceId;
	
	/** コピー後サーバー情報 */
	private CopyInstance copyInstance;
	
	/** コピー台数 */
	private Integer	     copyCount;

	/**
	 * デフォルトコンストラクタ。
	 */
	public CopyInstancesRequest() {
	}
	
	/**
	 * コピー元サーバー名を指定し、CopyInstancesRequestを構築します。
	 * @param instanceId コピー元サーバー名
	 */
	public CopyInstancesRequest(String instanceId) {
		this.instanceId = instanceId;
	}
	
	/**
	 * コピー元サーバー名を取得します。
	 * 
	 * @return コピー元サーバー名
	 */
	@Query(name="InstanceId", require=true)	
	public String getInstanceId() {
		return instanceId;
	}
	/**
	 * コピー元サーバー名を設定します。
	 * 
	 * @param instanceId コピー元サーバー名
	 */
	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
	}
	/**
	 * コピー元サーバー名を設定し、自オブジェクトを返します。
	 *
	 * @param instanceId コピー元サーバー名
	 * @return 自オブジェクト	 
	 */
	public CopyInstancesRequest withInstanceId(String instanceId) {
		setInstanceId(instanceId);
		return this;
	}
	
	/**
	 * コピー後サーバー情報を取得します。
	 * 
	 * @return コピー後サーバー情報
	 */
	@Query(name="CopyInstance", require=true)	
	public CopyInstance getCopyInstance() {
		return copyInstance;
	}
	/**
	 * コピー後サーバー情報を設定します。
	 * 
	 * @param copyInstance コピー後サーバー情報
	 */
	public void setCopyInstance(CopyInstance copyInstance) {
		this.copyInstance = copyInstance;
	}
	/**
	 * コピー後サーバー情報を設定し、自オブジェクトを返します。
	 *
	 * @param copyInstance コピー後サーバー情報
	 * @return 自オブジェクト	 
	 */
	public CopyInstancesRequest withCopyInstance(CopyInstance copyInstance) {
		setCopyInstance(copyInstance);
		return this;
	}
	
	/**
	 * コピー台数を取得します。
	 * 
	 * @return コピー台数
	 */
	@Query(name="CopyCount")	
	public Integer getCopyCount() {
		return copyCount;
	}
	/**
	 * コピー台数を設定します。
	 * 
	 * @param copyCount コピー台数
	 */
	public void setCopyCount(Integer copyCount) {
		this.copyCount = copyCount;
	}
	/**
	 * コピー台数を設定し、自オブジェクトを返します。
	 *
	 * @param copyCount コピー台数
	 * @return 自オブジェクト	 
	 */
	public CopyInstancesRequest withCopyCount(Integer copyCount) {
		setCopyCount(copyCount);
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
		builder.append(", copyInstance=");
		builder.append(copyInstance);
		builder.append(", copyCount=");
		builder.append(copyCount);
		builder.append("]");
		return builder.toString();
	}

}
