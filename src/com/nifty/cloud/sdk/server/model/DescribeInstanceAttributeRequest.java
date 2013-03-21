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
 * DescribeInstanceAttributeリクエストクラス。<br />
 * このクラスはDescribeInstanceAttributeへのリクエストを構築します。
 *
 */
@Action("DescribeInstanceAttribute")
public class DescribeInstanceAttributeRequest implements Request {

	/** サーバー名 */
	String	instanceId;

	/** 属性名 */
	String	attribute;

	/**
	 * デフォルトコンストラクタ。
	 */
	public DescribeInstanceAttributeRequest() {
	}
	
	/**
	 * サーバー名を指定し、DescribeInstanceAttributeを構築します。
	 * @param instanceId サーバー名
	 */
	public DescribeInstanceAttributeRequest(String instanceId) {
		this.instanceId = instanceId;
	}
	
	/**
	 * サーバー名を取得します。
	 * 
	 * @return サーバー名
	 */
	@Query(name="InstanceId", require=true)	
	public String getInstanceId() {
		return instanceId;
	}
	/**
	 * サーバー名を設定します。
	 * 
	 * @param instanceId サーバー名
	 */
	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
	}
	/**
	 * サーバー名を設定し、自オブジェクトを返します。
	 *
	 * @param instanceId サーバー名
	 * @return 自オブジェクト	 
	 */
	public DescribeInstanceAttributeRequest withInstanceId(String instanceId) {
		setInstanceId(instanceId);
		return this;
	}

	/**
	 * 属性名を取得します。
	 * 
	 * @return 属性名
	 */
	@Query(name="Attribute")
	public String getAttribute() {
		return attribute;
	}
	/**
	 * 属性名を設定します。
	 * 
	 * @param attribute 属性名
	 */
	public void setAttribute(String attribute) {
		this.attribute = attribute;
	}
	/**
	 * 属性名を設定し、自オブジェクトを返します。
	 *
	 * @param attribute 属性名
	 * @return 自オブジェクト	 
	 */
	public DescribeInstanceAttributeRequest withAttribute(String attribute) {
		setAttribute(attribute);
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
		builder.append(", attribute=");
		builder.append(attribute);
		builder.append("]");
		return builder.toString();
	}
	
}
