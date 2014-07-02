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
 *  API Version: 1.18
 *  Date: 2014-05-23 17:00:00
 *
 */
package com.nifty.cloud.sdk.address.model;

import com.nifty.cloud.sdk.Request;
import com.nifty.cloud.sdk.annotation.Action;
import com.nifty.cloud.sdk.annotation.Query;

/**
 * ReleaseAddressリクエストクラス。<br />
 * このクラスはReleaseAddressへのリクエストを構築します。
 */
@Action("ReleaseAddress")
public class ReleaseAddressRequest implements Request {

	/** グローバルIPアドレス */
	private String publicIp;

	/** プライベートIPアドレス */
	private String privateIpAddress;

	private String allocationId;

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
	public ReleaseAddressRequest withPublicIp(String publicIp) {
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
	public ReleaseAddressRequest withPrivateIpAddress(String privateIpAddress) {
		setPrivateIpAddress(privateIpAddress);
		return this;
	}

	/**
	 * allocationIdを取得します。
	 *
	 * @return allocationId
	 */
	@Query(name = "AllocationId")
	public String getAllocationId() {
		return allocationId;
	}

	/**
	 * allocationIdを設定します。
	 *
	 * @param allocationId
	 */
	public void setAllocationId (String allocationId){
		this.allocationId = allocationId;
	}

	/**
	 * allocationIdを設定し、自オブジェクトを返します。
	 *
	 * @param allocationId
	 * @return 自オブジェクト
	 */
	public ReleaseAddressRequest withAllocationId(String allocationId) {
		setAllocationId(allocationId);
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
		builder.append(", allocationId=");
		builder.append(allocationId);
		builder.append("]");
		return builder.toString();
	}
}