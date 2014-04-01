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
 * DisassociateAddressリクエストクラス。<br />
 * このクラスはDisassociateAddressへのリクエストを構築します。
 */
@Action("DisassociateAddress")
public class DisassociateAddressRequest implements Request {

	/** グローバルIPアドレス */
	private String publicIp;

	/** プライベートIPアドレス */
	private String privateIpAddress;

	/** 再起動オプション */
	private String niftyReboot;

	private String associationId;

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
	public DisassociateAddressRequest withPublicIp(String publicIp) {
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
	public DisassociateAddressRequest withPrivateIpAddress(String privateIpAddress) {
		setPrivateIpAddress(privateIpAddress);
		return this;
	}

	/**
	 * 再起動オプションを取得します。
	 *
	 * @return 再起動オプション
	 */
	@Query(name = "NiftyReboot")
	public String getNiftyReboot() {
		return niftyReboot;
	}

	/**
	 * 再起動オプションを設定します。
	 *
	 * @param niftyReboot 再起動オプション
	 */
	public void setNiftyReboot(String niftyReboot) {
		this.niftyReboot = niftyReboot;
	}

	/**
	 * 再起動オプションを設定し、自オブジェクトを返します。
	 *
	 * @param niftyReboot 再起動オプション
	 * @return 自オブジェクト
	 */
	public DisassociateAddressRequest withNiftyReboot(String niftyReboot) {
		setNiftyReboot(niftyReboot);
		return this;
	}

	/**
	 * associationIdを取得します。
	 *
	 * @return associationId
	 */
	@Query(name = "AssociationId")
	public String getAssociationId() {
		return associationId;
	}

	/**
	 * associationIdを設定します。
	 *
	 * @param associationId
	 */
	public void setAssociationId (String associationId){
		this.associationId = associationId;
	}

	/**
	 * associationIdを設定し、自オブジェクトを返します。
	 *
	 * @param associationId
	 * @return 自オブジェクト
	 */
	public DisassociateAddressRequest withAssociationId(String associationId) {
		setAssociationId(associationId);
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
		builder.append(", niftyReboot=");
		builder.append(niftyReboot);
		builder.append(", associationId=");
		builder.append(associationId);
		builder.append("]");
		return builder.toString();
	}
}