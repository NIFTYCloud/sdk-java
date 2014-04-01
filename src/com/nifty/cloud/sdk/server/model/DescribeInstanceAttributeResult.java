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

import com.nifty.cloud.sdk.Result;
import com.nifty.cloud.sdk.server.model.transform.DescribeInstanceAttributeResultConverter;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamConverter;

/**
 * DescribeInstanceAttirbute結果処理クラス。<br />
 * このクラスはDescribeInstanceAttirbuteのレスポンスを格納します。
 *
 */
@XStreamAlias("DescribeInstanceAttributeResponse")
@XStreamConverter(DescribeInstanceAttributeResultConverter.class)
public class DescribeInstanceAttributeResult extends Result {
	/** リクエスト識別子 */	
	private String requestId;
	
	/** サーバー属性情報 */	
	private InstanceAttribute 	instanceAttribute;

	
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
	public DescribeInstanceAttributeResult withRequestId(String requestId) {
		setRequestId(requestId);
		return this;
	}
	
	/**
	 * サーバー属性情報を取得します。
	 * 
	 * @return サーバー属性情報
	 */
	public InstanceAttribute getInstanceAttribute() {
		return instanceAttribute;
	}
	/**
	 * サーバー属性情報を設定します。
	 * 
	 * @param instanceAttribute サーバー属性情報
	 */
	public void setInstanceAttribute(InstanceAttribute instanceAttribute) {
		this.instanceAttribute = instanceAttribute;
	}
	/**
	 * サーバー属性情報を設定し、自オブジェクトを返します。
	 *
	 * @param instanceAttribute サーバー属性情報
	 * @return 自オブジェクト	 
	 */
	public DescribeInstanceAttributeResult withInstanceAttribute(InstanceAttribute instanceAttribute) {
		setInstanceAttribute(instanceAttribute);
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
		builder.append(", instanceAttribute=");
		builder.append(instanceAttribute);
		builder.append("]");
		return builder.toString();
	}

}
