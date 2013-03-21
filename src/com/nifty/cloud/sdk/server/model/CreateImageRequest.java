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
 *  Date: 2012-02-20 10:57:31
 * 
 */
package com.nifty.cloud.sdk.server.model;

import com.nifty.cloud.sdk.Request;
import com.nifty.cloud.sdk.annotation.Action;
import com.nifty.cloud.sdk.annotation.Query;

/**
 * CreateImageリクエストクラス。<br />
 * このクラスはCreateImageへのリクエストを構築します。
 *
 */
@Action("CreateImage")
public class CreateImageRequest implements Request {
	
	/** イメージ化元サーバー */
	private String	instanceId;
	
	/** イメージ名 */
	private String	name;
	
	private String	description;
	
	private Boolean	noReboot;
	
	/** イメージ化元サーバー残存フラグ */
	private Boolean	leftInstance;
	
	/** リージョン・ゾーン情報 */
	private GlobalPlacement placement;

	/**
	 * イメージ化元サーバーを取得します。
	 * 
	 * @return イメージ化元サーバー
	 */
	@Query(name="InstanceId", require=true)	
	public String getInstanceId() {
		return instanceId;
	}
	/**
	 * イメージ化元サーバーを設定します。
	 * 
	 * @param instanceId イメージ化元サーバー
	 */
	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
	}
	/**
	 * イメージ化元サーバーを設定し、自オブジェクトを返します。
	 *
	 * @param instanceId イメージ化元サーバー
	 * @return 自オブジェクト	 
	 */
	public CreateImageRequest withInstanceId(String instanceId) {
		setInstanceId(instanceId);
		return this;
	}
	
	/**
	 * イメージ名を取得します。
	 * 
	 * @return イメージ名
	 */
	@Query(name="Name", require=true)	
	public String getName() {
		return name;
	}
	/**
	 * イメージ名を設定します。
	 * 
	 * @param name イメージ名
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * イメージ名を設定し、自オブジェクトを返します。
	 *
	 * @param name イメージ名
	 * @return 自オブジェクト	 
	 */
	public CreateImageRequest withName(String name) {
		setName(name);
		return this;
	}
	
	/**
	 * descriptionを取得します。
	 * 
	 * @return description
	 */
	@Query(name="Description")	
	public String getDescription() {
		return description;
	}
	/**
	 * descriptionを設定します。
	 * 
	 * @param description
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * descriptionを設定し、自オブジェクトを返します。
	 *
	 * @param description
	 * @return 自オブジェクト	 
	 */
	public CreateImageRequest withDescription(String description) {
		setDescription(description);
		return this;
	}
	
	/**
	 * noRebootを取得します。
	 * 
	 * @return noReboot
	 */
	@Query(name="NoReboot")	
	public Boolean getNoReboot() {
		return noReboot;
	}
	/**
	 * noRebootを設定します。
	 * 
	 * @param noReboot
	 */
	public void setNoReboot(Boolean noReboot) {
		this.noReboot = noReboot;
	}
	/**
	 * noRebootを設定し、自オブジェクトを返します。
	 *
	 * @param noReboot
	 * @return 自オブジェクト	 
	 */
	public CreateImageRequest withNoReboot(Boolean noReboot) {
		setNoReboot(noReboot);
		return this;
	}

	/**
	 * イメージ化元サーバー残存フラグを取得します。
	 * 
	 * @return イメージ化元サーバー残存フラグ
	 */
	@Query(name="LeftInstance")	
	public Boolean getLeftInstance() {
		return leftInstance;
	}
	/**
	 * イメージ化元サーバー残存フラグを設定します。
	 * 
	 * @param leftInstance イメージ化元サーバー残存フラグ
	 */
	public void setLeftInstance(Boolean leftInstance) {
		this.leftInstance = leftInstance;
	}
	/**
	 * イメージ化元サーバー残存フラグを設定し、自オブジェクトを返します。
	 *
	 * @param leftInstance イメージ化元サーバー残存フラグ
	 * @return 自オブジェクト	 
	 */
	public CreateImageRequest withLeftInstance(Boolean leftInstance) {
		setLeftInstance(leftInstance);
		return this;
	}

	/**
	 * リージョン・ゾーン情報を取得します。
	 * @return リージョン・ゾーン情報
	 */
	@Query(name="Placement")	
	public GlobalPlacement getPlacement() {
		return placement;
	}
	/**
	 * リージョン・ゾーン情報を設定します。
	 * @param placement リージョン・ゾーン情報
	 */
	public void setPlacement(GlobalPlacement placement) {
		this.placement = placement;
	}
	/**
	 * リージョン・ゾーン情報を設定し、自オブジェクトを返します。
	 * @param placement リージョン・ゾーン情報
	 * @return 自オブジェクト
	 */
	public CreateImageRequest withPlacement(GlobalPlacement placement) {
		setPlacement(placement);
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
		builder.append(", name=");
		builder.append(name);
		builder.append(", description=");
		builder.append(description);
		builder.append(", noReboot=");
		builder.append(noReboot);
		builder.append(", leftInstance=");
		builder.append(leftInstance);
		builder.append(", placement=");
		builder.append(placement);
		builder.append("]");
		return builder.toString();
	}

}
