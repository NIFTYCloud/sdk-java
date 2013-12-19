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
 *  API Version: 1.16
 *  Date: 2013-10-18 17:00:00
 * 
 */
package com.nifty.cloud.sdk.server.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.nifty.cloud.sdk.Request;
import com.nifty.cloud.sdk.annotation.Action;
import com.nifty.cloud.sdk.annotation.Query;

/**
 * ModifyInstanceAttributeリクエストクラス。<br />
 * このクラスはModifyInstanceAttributeへのリクエストを構築します。
 * 
 */
@Action("ModifyInstanceAttribute")
public class ModifyInstanceAttributeRequest implements Request {
	
	/** サーバー名 */
	private String	instanceId;
	
	/** 変更属性名  */
	private String	attribute;
	
	/** 変更値  */
	private String	value;
	
	private List<InstanceBlockDeviceMappingSpecification> blockDeviceMappings;

	/**
	 * デフォルトコンストラクタ。
	 */
	public ModifyInstanceAttributeRequest() {
	}
	
	/**
	 * サーバー名を指定し、ModifyInstanceAttributeRequestを構築します。
	 * @param instanceId サーバー名
	 */
	public ModifyInstanceAttributeRequest(String instanceId) {
		this.instanceId = instanceId;
	}
	
	/**
	 * サーバー名を取得します。
	 * 
	 * @return サーバー名
	 */
	@Query(name="InstanceId",require=true)		
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
	public ModifyInstanceAttributeRequest withInstanceId(String instanceId) {
		setInstanceId(instanceId);
		return this;
	}
	
	/**
	 * 変更属性名を取得します。
	 * 
	 * @return 変更属性名
	 */
	@Query(name="Attribute")		
	public String getAttribute() {
		return attribute;
	}
	/**
	 * 変更属性名を設定します。
	 * 
	 * @param attribute 変更属性名
	 */
	public void setAttribute(String attribute) {
		this.attribute = attribute;
	}
	/**
	 * 変更属性名を設定し、自オブジェクトを返します。
	 *
	 * @param attribute 変更属性名
	 * @return 自オブジェクト	 
	 */
	public ModifyInstanceAttributeRequest withAttribute(String attribute) {
		setAttribute(attribute);
		return this;
	}
	
	/**
	 * 変更値を取得します。
	 * 
	 * @return 変更値
	 */
	@Query(name="Value")		
	public String getValue() {
		return value;
	}
	/**
	 * 変更値を設定します。
	 * 
	 * @param value 変更値
	 */
	public void setValue(String value) {
		this.value = value;
	}
	/**
	 * 変更値を設定し、自オブジェクトを返します。
	 *
	 * @param value 変更値
	 * @return 自オブジェクト	 
	 */
	public ModifyInstanceAttributeRequest withValue(String value) {
		setValue(value);
		return this;
	}
	
	/**
	 * blockDeviceMappingsを取得します。
	 * 
	 * @return blockDeviceMappings
	 */
	@Query(name="")	
	public List<InstanceBlockDeviceMappingSpecification> getBlockDeviceMappings() {
		return blockDeviceMappings;
	}
	/**
	 * blockDeviceMappingsを設定します。
	 * 
	 * @param blockDeviceMappings
	 */
	public void setBlockDeviceMappings(List<InstanceBlockDeviceMappingSpecification> blockDeviceMappings) {
		this.blockDeviceMappings = blockDeviceMappings;
	}
	/**
	 * blockDeviceMappingsを設定し、自オブジェクトを返します。
	 *
	 * @param blockDeviceMappings
	 * @return 自オブジェクト	 
	 */
	public ModifyInstanceAttributeRequest withBlockDeviceMappings(InstanceBlockDeviceMappingSpecification ... blockDeviceMappings) {
		if(this.blockDeviceMappings == null) this.blockDeviceMappings = new ArrayList<InstanceBlockDeviceMappingSpecification>();
		for(InstanceBlockDeviceMappingSpecification blockDeviceMapping: blockDeviceMappings) {
			getBlockDeviceMappings().add(blockDeviceMapping);
		}
		return this;
	}
	/**
	 * blockDeviceMappingsを設定し、自オブジェクトを返します。
	 *
	 * @param blockDeviceMappings
	 * @return 自オブジェクト	 
	 */
	public ModifyInstanceAttributeRequest withBlockDeviceMappings(Collection<InstanceBlockDeviceMappingSpecification> blockDeviceMappings) {
		if(this.blockDeviceMappings == null) this.blockDeviceMappings = new ArrayList<InstanceBlockDeviceMappingSpecification>();
		if (blockDeviceMappings!=null) {
			getBlockDeviceMappings().addAll(blockDeviceMappings);
		}
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
		builder.append(", value=");
		builder.append(value);
		builder.append(", blockDeviceMappings=");
		builder.append(blockDeviceMappings);
		builder.append("]");
		return builder.toString();
	}

}
