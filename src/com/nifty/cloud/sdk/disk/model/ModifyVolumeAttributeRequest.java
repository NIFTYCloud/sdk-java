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
package com.nifty.cloud.sdk.disk.model;

import com.nifty.cloud.sdk.Request;
import com.nifty.cloud.sdk.annotation.Action;
import com.nifty.cloud.sdk.annotation.Query;

/**
 * ModifyVolumeAttributeリクエストクラス。<br />
 * このクラスはModifyVolumeAttributeへのリクエストを構築します。
 */
@Action("ModifyVolumeAttribute")
public class ModifyVolumeAttributeRequest implements Request {

	/** ディスク名 */
	private String	volumeId;
	
	/** 属性名 */
	private String attribute;
	
	/** 属性値 */
	private String value;

	/**
	 * デフォルトコンストラクタ。
	 */
	public ModifyVolumeAttributeRequest() {
	}

	/**
	 * ディスク名を指定し、ModifyVolumeAttributeRequestを構築します。
	 * @param volumeId
	 */
	public ModifyVolumeAttributeRequest(String volumeId) {
		this.volumeId = volumeId;
	}
	/**
	 * ディスク名を取得します。
	 * 
	 * @return ディスク名
	 */
	@Query(name="VolumeId", require=true)			
	public String getVolumeId() {
		return volumeId;
	}
	/**
	 * ディスク名を取得します。
	 * 
	 * @param volumeId ディスク名
	 */
	public void setVolumeId(String volumeId) {
		this.volumeId = volumeId;
	}
	/**
	 * ディスク名を取得し、自オブジェクトを返します。
	 * 
	 * @param volumeId ディスク名
	 * @return 自オブジェクト
	 */
	public ModifyVolumeAttributeRequest withVolumeId(String volumeId) {
		setVolumeId(volumeId);
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
	public ModifyVolumeAttributeRequest withAttribute(String attribute) {
		setAttribute(attribute);
		return this;
	}
	/**
	 * 属性値を取得します。
	 * 
	 * @return 属性値
	 */
	@Query(name="Value")		
	public String getValue() {
		return value;
	}
	/**
	 * 属性値を設定します。
	 * 
	 * @param value 属性値
	 */
	public void setValue(String value) {
		this.value = value;
	}
	/**
	 * 属性値を設定し、自オブジェクトを返します。
	 * 
	 * @param value 属性値
	 * @return 自オブジェクト
	 */
	public ModifyVolumeAttributeRequest withValue(String value) {
		setValue(value);
		return this;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("[volumeId=");
		builder.append(volumeId);
		builder.append(", attribute=");
		builder.append(attribute);
		builder.append(", value=");
		builder.append(value);
		builder.append("]");
		return builder.toString();
	}
}
