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

/**
 * IPアドレス情報クラス。<br />
 * このクラスはIPアドレス情報を格納します。
 *
 */
public class Address {

	/** グローバルIPアドレス */
	private String publicIp;

	/** プライベートIPアドレス */
	private String privateIpAddress;

	private String allocationId;

	private String domain;

	/** サーバー名 */
	private String instanceId;

	private String associationId;

	private String networkInterfaceId;

	private String networkInterfaceOwnerId;

	/** IPアドレスのメモ */
	private String description;

	/** ゾーン名 */
	private String availabilityZone;

	/**
	 * 絞り込み条件の項目名を取得します。
	 *
	 * @return 絞り込み条件の項目名
	 */

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
	public Address withPublicIp(String publicIp) {
		this.publicIp = publicIp;
		return this;
	}

	/**
	 * プライベートIPアドレスを取得します。
	 *
	 * @return プライベートIPアドレス
	 */
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
	public Address withPrivateIpAddress(String privateIpAddress) {
		this.privateIpAddress = privateIpAddress;
		return this;
	}

	/**
	 * allocationIdを取得します。
	 *
	 * @return allocationId
	 */
	public String getAllocationId() {
		return allocationId;
	}

	/**
	 * allocationIdを設定します。
	 *
	 * @param allocationId
	 */
	public void setAllocationId(String allocationId) {
		this.allocationId = allocationId;
	}

	/**
	 * allocationIdを設定し、自オブジェクトを返します。
	 *
	 * @param allocationId
	 * @return 自オブジェクト
	 */
	public Address withAllocationId(String allocationId) {
		this.allocationId = allocationId;
		return this;
	}

	/**
	 * domainを取得します。
	 *
	 * @return domain
	 */
	public String getDomain() {
		return domain;
	}

	/**
	 * domainを設定します。
	 *
	 * @param domain
	 */
	public void setDomain(String domain) {
		this.domain = domain;
	}

	/**
	 * domainを設定し、自オブジェクトを返します。
	 *
	 * @param domain
	 * @return 自オブジェクト
	 */
	public Address withDomain(String domain) {
		this.domain = domain;
		return this;
	}

	/**
	 * サーバー名を取得します。
	 *
	 * @return サーバー名
	 */

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
	public Address withInstanceId(String instanceId) {
		this.instanceId = instanceId;
		return this;
	}

	/**
	 * associationIdを取得します。
	 *
	 * @return associationId
	 */
	public String getAssociationId() {
		return associationId;
	}

	/**
	 * associationIdを設定します。
	 *
	 * @param associationId
	 */
	public void setAssociationId(String associationId) {
		this.associationId = associationId;
	}

	/**
	 * associationIdを設定し、自オブジェクトを返します。
	 *
	 * @param associationId
	 * @return 自オブジェクト
	 */
	public Address withAssociationId(String associationId) {
		this.associationId = associationId;
		return this;
	}

	/**
	 * networkInterfaceIdを取得します。
	 *
	 * @return networkInterfaceId
	 */

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
	public Address withNetworkInterfaceId(String networkInterfaceId) {
		this.networkInterfaceId = networkInterfaceId;
		return this;
	}
	/**
	 * networkInterfaceOwnerIdを取得します。
	 *
	 * @return networkInterfaceOwnerId
	 */

	public String getNetworkInterfaceOwnerId() {
		return networkInterfaceOwnerId;
	}

	/**
	 * networkInterfaceOwnerIdを設定します。
	 *
	 * @param networkInterfaceOwnerId
	 */
	public void setNetworkInterfaceOwnerId(String networkInterfaceOwnerId) {
		this.networkInterfaceOwnerId = networkInterfaceOwnerId;
	}

	/**
	 * networkInterfaceOwnerIdを設定し、自オブジェクトを返します。
	 *
	 * @param networkInterfaceOwnerId
	 * @return 自オブジェクト
	 */
	public Address withNetworkInterfaceOwnerId(String networkInterfaceOwnerId) {
		this.networkInterfaceOwnerId = networkInterfaceOwnerId;
		return this;
	}

	/**
	 * IPアドレスのメモを取得します。
	 *
	 * @return IPアドレスのメモ
	 */

	public String getDescription() {
		return description;
	}

	/**
	 * IPアドレスのメモを設定します。
	 *
	 * @param description IPアドレスのメモ
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * IPアドレスのメモを設定し、自オブジェクトを返します。
	 *
	 * @param description IPアドレスのメモ
	 * @return 自オブジェクト
	 */
	public Address withDescription(String description) {
		this.description = description;
		return this;
	}

	/**
	 * ゾーン名を取得します。
	 *
	 * @return ゾーン名
	 */
	public String getAvailabilityZone() {
		return availabilityZone;
	}

	/**
	 * ゾーン名を設定します。
	 *
	 * @param availabilityZone ゾーン名
	 */
	public void setAvailabilityZone(String availabilityZone) {
		this.availabilityZone = availabilityZone;
	}

	/**
	 * ゾーン名を設定し、自オブジェクトを返します。
	 *
	 * @param availabilityZone ゾーン名
	 * @return 自オブジェクト
	 */
	public Address withAvailabilityZone(String availabilityZone) {
		this.availabilityZone = availabilityZone;
		return this;
	}

	/*
	 * (non-Javadoc)
	 *
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
		builder.append(", domain=");
		builder.append(domain);
		builder.append(", instanceId=");
		builder.append(instanceId);
		builder.append(", associationId=");
		builder.append(associationId);
		builder.append(", networkInterfaceId=");
		builder.append(networkInterfaceId);
		builder.append(", networkInterfaceOwnerId=");
		builder.append(networkInterfaceOwnerId);
		builder.append(", description=");
		builder.append(description);
		builder.append(", availabilityZone=");
		builder.append(availabilityZone);
		builder.append("]");
		return builder.toString();
	}
}