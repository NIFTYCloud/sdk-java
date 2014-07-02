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
 * AssociateAddressリクエストクラス。<br />
 * このクラスはAssociateAddressへのリクエストを構築します。
 */
@Action("AssociateAddress")
public class AssociateAddressRequest implements Request {

	/** グローバルIPアドレス */
	private String publicIp;

	/** プライベートIPアドレス */
	private String privateIpAddress;

	/** サーバー名 */
	private String instanceId;

	/** 再起動オプション */
	private String niftyReboot;

	private String allocationId;

	private String networkInterfaceId;

	private Boolean allowReassociation;

	/**
	 * デフォルトコンストラクタ。
	 */
	public AssociateAddressRequest() {
	}

	/**
	 * サーバー名を指定し、AssociateAddressRequestを構築します。
	 *
	 * @param instanceId サーバー名
	 */
	public AssociateAddressRequest(String instanceId) {
		this.instanceId = instanceId;
	}

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
	public AssociateAddressRequest withPublicIp(String publicIp) {
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
	public AssociateAddressRequest withPrivateIpAddress(String privateIpAddress) {
		setPrivateIpAddress(privateIpAddress);
		return this;
	}

	/**
	 * サーバー名を取得します。
	 *
	 * @return サーバー名
	 */
	@Query(name = "InstanceId", require = true)
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
	public AssociateAddressRequest withInstanceId(String instanceId) {
		setInstanceId(instanceId);
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
	public AssociateAddressRequest withNiftyReboot(String niftyReboot) {
		setNiftyReboot(niftyReboot);
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
	public AssociateAddressRequest withAllocationId(String allocationId) {
		setAllocationId(allocationId);
		return this;
	}

	/**
	 * networkInterfaceIdを取得します。
	 *
	 * @return networkInterfaceId
	 */
	@Query(name="NetworkInterfaceId")
	public String getNetworkInterfaceId() {
		return networkInterfaceId;
	}

	/**
	 * networkInterfaceIdを設定します。
	 *
	 * @param networkInterfaceId
	 */
	public void setNetworkInterfaceId(String networkInterfaceId) {
		this.networkInterfaceId = networkInterfaceId;
	}

	/**
	 * networkInterfaceIdを設定し、自オブジェクトを返します。
	 *
	 * @param networkInterfaceId
	 * @return 自オブジェクト
	 */
	public AssociateAddressRequest withNetworkInterfaceId(String networkInterfaceId) {
		setNetworkInterfaceId(networkInterfaceId);
		return this;
	}

	/**
	 * allowReassociationを取得します。
	 *
	 * @return allowReassociation
	 */
	@Query(name="AllowReassociation")
	public Boolean getAllowReassociation() {
		return allowReassociation;
	}

	/**
	 * allowReassociationを設定します。
	 *
	 * @param allowReassociation
	 */
	public void setAllowReassociation(Boolean allowReassociation) {
		this.allowReassociation = allowReassociation;
	}

	/**
	 * allowReassociationを設定し、自オブジェクトを返します。
	 *
	 * @param allowReassociation
	 * @return 自オブジェクト
	 */
	public AssociateAddressRequest withAllowReassociation(Boolean allowReassociation) {
		setAllowReassociation(allowReassociation);
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
		builder.append(", instanceId=");
		builder.append(instanceId);
		builder.append(", niftyReboot=");
		builder.append(niftyReboot);
		builder.append(", allocationId=");
		builder.append(allocationId);
		builder.append(", networkInterfaceId=");
		builder.append(networkInterfaceId);
		builder.append(", allowReassociation=");
		builder.append(allowReassociation);
		builder.append("]");
		return builder.toString();
	}
}