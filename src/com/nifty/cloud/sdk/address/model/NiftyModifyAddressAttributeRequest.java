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
package com.nifty.cloud.sdk.address.model;

import com.nifty.cloud.sdk.Request;
import com.nifty.cloud.sdk.annotation.Action;
import com.nifty.cloud.sdk.annotation.Query;

/**
 * NiftyModifyAddressAttributeリクエストクラス。<br />
 * このクラスはNiftyModifyAddressAttributeへのリクエストを構築します。
 */
@Action("NiftyModifyAddressAttribute")
public class NiftyModifyAddressAttributeRequest implements Request {

	/** グローバルIPアドレス */
	private String publicIp;

	/** プライベートIPアドレス */
	private String privateIpAddress;

	/** 変更属性名 */
	private String attribute;

	/** 変更値 */
	private String value;

	/**
	 * グローバルIPアドレスを取得します。
	 *
	 * @return グローバルIPアドレス
	 */
	@Query(name = "PublicIp")
	public String getPublicIp() {
		return publicIp;
	}

	/**
	 * グローバルIPアドレスを設定します。
	 *
	 * @param publicIp グローバルIPアドレス
	 */
	public void setPublicIp(String publicIp) {
		this.publicIp = publicIp;
	}

	/**
	 * グローバルIPアドレスを設定し、自オブジェクトを返します。
	 *
	 * @param publicIp グローバルIPアドレス
	 * @return 自オブジェクト
	 */
	public NiftyModifyAddressAttributeRequest withPublicIp(String publicIp) {
		setPublicIp(publicIp);
		return this;
	}

	/**
	 * プライベートIPアドレスを取得します。
	 *
	 * @return プライベートIPアドレス
	 */
	@Query(name = "PrivateIpAddress")
	public String getPrivateIpAddress() {
		return privateIpAddress;
	}

	/**
	 * プライベートIPアドレスを設定します。
	 *
	 * @param privateIpAddress プライベートIPアドレス
	 */
	public void setPrivateIpAddress(String privateIpAddress) {
		this.privateIpAddress = privateIpAddress;
	}

	/**
	 * プライベートIPアドレスを設定し、自オブジェクトを返します。
	 *
	 * @param privateIpAddress プライベートIPアドレス
	 * @return 自オブジェクト
	 */
	public NiftyModifyAddressAttributeRequest withPrivateIpAddress(String privateIpAddress) {
		setPrivateIpAddress(privateIpAddress);
		return this;
	}

	/**
	 * 変更属性名を取得します。
	 *
	 * @return 変更属性名
	 */
	@Query(name ="Attribute")
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
	public NiftyModifyAddressAttributeRequest withAttribute(String attribute) {
		setAttribute(attribute);
		return this;
	}

	/**
	 * 変更値を取得します。
	 *
	 * @return 変更値
	 */
	@Query(name = "Value")
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
	public NiftyModifyAddressAttributeRequest withValue(String value) {
		setValue(value);
		return this;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("[publicIp=");
		builder.append(publicIp);
		builder.append(", privateIpAddress=");
		builder.append(privateIpAddress);
		builder.append(", attribute=");
		builder.append(attribute);
		builder.append(", value=");
		builder.append(value);
		builder.append("]");
		return builder.toString();
	}
}
