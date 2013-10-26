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
 *  API Version: 1.15
 *  Date: 2013-06-28 17:00:00
 * 
 */
package com.nifty.cloud.sdk.image.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.nifty.cloud.sdk.Request;
import com.nifty.cloud.sdk.annotation.Action;
import com.nifty.cloud.sdk.annotation.Query;

/**
 * ModifyImageAttributeリクエストクラス。<br />
 * このクラスはModifyImageAttributeへのリクエストを構築します。
 */
@Action("ModifyImageAttribute")
public class ModifyImageAttributeRequest implements Request {
	
	/** OSイメージID */
	private String imageId;
	
	/** 属性名 */
	private String attribute;
	
	private String operationType;
	
	private List<String> userIds;
	
	private List<String> userGroups;
	
	private List<String> productCodes;
	
	/** 属性値 */
	private String value;
	
	/**
	 * デフォルトコンストラクタ。
	 */
	public ModifyImageAttributeRequest() {
	}
	
	/**
	 * OSイメージIDを指定し、ModifyImageAttributeRequestを構築します。
	 * 
	 * @param imageId OSイメージID
	 */
	public ModifyImageAttributeRequest(String imageId) {
		this.imageId = imageId;
	}
	
	/**
	 * OSイメージIDを取得します。
	 * 
	 * @return OSイメージID
	 */
	@Query(name="ImageId", require=true)		
	public String getImageId() {
		return imageId;
	}
	/**
	 * OSイメージIDを設定します。
	 * 
	 * @param imageId OSイメージID
	 */
	public void setImageId(String imageId) {
		this.imageId = imageId;
	}
	/**
	 * OSイメージIDを設定し、自オブジェクトを返します。
	 * 
	 * @param imageId OSイメージID
	 * @return 自オブジェクト
	 */
	public ModifyImageAttributeRequest withImageId(String imageId) {
		setImageId(imageId);
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
	public ModifyImageAttributeRequest withAttribute(String attribute) {
		setAttribute(attribute);
		return this;
	}
	
	
	/**
	 * operationTypeを取得します。
	 * 
	 * @return operationType
	 */
	@Query(name="OperationType")		
	public String getOperationType() {
		return operationType;
	}
	/**
	 * operationTypeを設定します。
	 * 
	 * @param operationType
	 */
	public void setOperationType(String operationType) {
		this.operationType = operationType;
	}
	/**
	 * operationTypeを設定し、自オブジェクトを返します。
	 * 
	 * @param operationType
	 * @return 自オブジェクト
	 */
	public ModifyImageAttributeRequest withOperationType(String operationType) {
		setOperationType(operationType);
		return this;
	}
	
	/**
	 * userIdsを取得します。
	 * 
	 * @return userIds
	 */
	@Query(name="UserId")		
	public List<String> getUserIds() {
		return userIds;
	}
	/**
	 * userIdsを設定します。
	 * 
	 * @param userIds
	 */
	public void setUserIds(List<String> userIds) {
		this.userIds = userIds;
	}
	/**
	 * userIdsの配列を設定し、自オブジェクトを返します。
	 * 
	 * @param userIds
	 * @return 自オブジェクト
	 */
	public ModifyImageAttributeRequest withUserIds(String ... userIds) {
		if(this.userIds == null) this.userIds = new ArrayList<String>();
		for(String userId: userIds) {
			getUserIds().add(userId);
		}
		return this;
	}
	/**
	 * userIdsを設定し、自オブジェクトを返します。
	 * 
	 * @param userIds
	 * @return 自オブジェクト
	 */
	public ModifyImageAttributeRequest withUserIds(Collection<String> userIds) {
		if(this.userIds == null) this.userIds = new ArrayList<String>();
		if (userIds!=null) {
			getUserIds().addAll(userIds);
		}
		return this;
	}
	
	/**
	 * userGroupsを取得します。
	 * 
	 * @return userGroups
	 */
	@Query(name="Group")		
	public List<String> getUserGroups() {
		return userGroups;
	}
	/**
	 * userGroupsを設定します。
	 * 
	 * @param userGroups
	 */
	public void setUserGroups(List<String> userGroups) {
		this.userGroups = userGroups;
	}
	/**
	 * userGroupsの配列を設定し、自オブジェクトを返します。
	 * 
	 * @param userGroups
	 * @return 自オブジェクト
	 */
	public ModifyImageAttributeRequest withUserGroups(String ... userGroups) {
		if(this.userGroups == null) this.userGroups = new ArrayList<String>();
		for (String userGroup: userGroups) {
			getUserGroups().add(userGroup);
		}
		return this;
	}
	/**
	 * userGroupsを設定し、自オブジェクトを返します。
	 * 
	 * @param userGroups
	 * @return 自オブジェクト
	 */
	public ModifyImageAttributeRequest withUserGroups(Collection<String> userGroups) {
		if(this.userGroups == null) this.userGroups = new ArrayList<String>();
		if (userGroups!=null) {
			getUserGroups().addAll(userGroups);
		}
		return this;
	}
	
	/**
	 * productCodesを取得します。
	 * 
	 * @return productCodes
	 */
	@Query(name="ProductCode")		
	public List<String> getProductCodes() {
		return productCodes;
	}
	/**
	 * productCodesを設定します。
	 * 
	 * @param productCodes
	 */
	public void setProductCodes(List<String> productCodes) {
		this.productCodes = productCodes;
	}
	/**
	 * productCodesの配列を設定し、自オブジェクトを返します。
	 * 
	 * @param productCodes
	 * @return 自オブジェクト
	 */
	public ModifyImageAttributeRequest withProductCodes(String ... productCodes) {
		if(this.productCodes == null) this.productCodes = new ArrayList<String>();
		for(String productCode : productCodes) {
			getProductCodes().add(productCode);
		}
		return this;
	}
	/**
	 * productCodesを設定し、自オブジェクトを返します。
	 * 
	 * @param productCodes
	 * @return 自オブジェクト
	 */
	public ModifyImageAttributeRequest withProductCodes(Collection<String> productCodes) {
		if(this.productCodes == null) this.productCodes = new ArrayList<String>();
		if (productCodes!=null) {
			getProductCodes().addAll(productCodes);
		}
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
	public ModifyImageAttributeRequest withValue(String value) {
		setValue(value);
		return this;
	}
	
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("[imageId=");
		builder.append(imageId);
		builder.append(", attribute=");
		builder.append(attribute);
		builder.append(", operationType=");
		builder.append(operationType);
		builder.append(", userIds=");
		builder.append(userIds);
		builder.append(", userGroups=");
		builder.append(userGroups);
		builder.append(", productCodes=");
		builder.append(productCodes);
		builder.append(", value=");
		builder.append(value);
		builder.append("]");
		return builder.toString();
	}
	
}
