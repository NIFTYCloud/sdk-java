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
package com.nifty.cloud.sdk.server.model;

import com.nifty.cloud.sdk.Request;
import com.nifty.cloud.sdk.annotation.Action;
import com.nifty.cloud.sdk.annotation.Query;

/**
 * CancelCopyInstancesリクエストクラス。<br />
 * このクラスはCancelCopyInstancesへのリクエストを構築します。
 * 
 */
@Action("CancelCopyInstances")
public class CancelCopyInstancesRequest implements Request {
	
	/** キャンセル対象のサーバー名  */
	private String instanceId;

	/**
	 * デフォルトコンストラクタ。
	 */
	public CancelCopyInstancesRequest(){
	}
	
	/**
	 * 
	 * キャンセル対象のサーバー名を指定し、CancelCopyInstancesRequestを構築します。
	 * @param instanceId キャンセル対象のサーバー名
	 */
	public CancelCopyInstancesRequest(String instanceId) {
		this.instanceId = instanceId;
	}
	
	/**
	 * キャンセル対象のサーバー名を取得します。
	 * 
	 * @return キャンセル対象のサーバー名
	 */
	@Query(name="InstanceId", require=true)
	public String getInstanceId() {
		return instanceId;
	}
	/**
	 * キャンセル対象のサーバー名を設定します。
	 * 
	 * @param instanceId キャンセル対象のサーバー名
	 */
	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
	}
	/**
	 * キャンセル対象のサーバー名を設定し、自オブジェクトを返します。
	 *
	 * @param instanceId キャンセル対象のサーバー名
	 * @return 自オブジェクト	 
	 */
	public CancelCopyInstancesRequest withInstanceId(String instanceId) {
		setInstanceId(instanceId);
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
		builder.append("]");
		return builder.toString();
	}
	
}
