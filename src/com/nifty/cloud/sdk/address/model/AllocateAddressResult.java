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

import com.nifty.cloud.sdk.Result;
import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * AllocateAddress処理結果クラス。<br />
 * このクラスはAllocateAddressのレスポンスを格納します。
 *
 */
@XStreamAlias("AllocateAddressResponse")
public class AllocateAddressResult extends Result {

	/** リクエスト識別子 */
	@XStreamAlias("requestId")
	private String requestId;

	/** 割り当てられたグローバルIPアドレス */
	@XStreamAlias("publicIp")
	private String publicIp;

	/** 割り当てられたプライベートIPアドレス */
	@XStreamAlias("privateIpAddress")
	private String privateIpAddress;

	@XStreamAlias("domain")
	private String domain;

	@XStreamAlias("allocationId")
	private String allocationId;

	/** ゾーン情報 */
	@XStreamAlias("placement")
	private Placement placement;

	/**
	 * リクエスト識別子を取得します。
	 *
	 * @return リクエスト識別子
	 */
	public String getRequestId() {
		return requestId;
	}

	/**
	 * リクエスト識別子を設定します。
	 *
	 * @param requestId リクエスト識別子
	 */
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	/**
	 * リクエスト識別子を設定し、自オブジェクトを返します。
	 *
	 * @param requestId リクエスト識別子
	 * @return 自オブジェクト
	 */
	public AllocateAddressResult withRequestId(String requestId) {
		setRequestId(requestId);
		return this;
	}

	/**
	 * 割り当てられたグローバルIPアドレスを取得します。
	 *
	 * @return 割り当てられたグローバルIPアドレス
	 */
	public String getPublicIp() {
		return publicIp;
	}

	/**
	 * 割り当てられたグローバルIPアドレスを設定します。
	 *
	 * @param publicIp 割り当てられたグローバルIPアドレス
	 */
	public void setPublicIp(String publicIp) {
		this.publicIp = publicIp;
	}

	/**
	 * 割り当てられたグローバルIPアドレスを設定し、自オブジェクトを返します。
	 *
	 * @param publicIp 割り当てられたグローバルIPアドレス
	 * @return 自オブジェクト
	 */
	public AllocateAddressResult withPublicIp(String publicIp) {
		setPublicIp(publicIp);
		return this;
	}

	/**
	 * 割り当てられたプライベートIPアドレスを取得します。
	 *
	 * @return 割り当てられたプライベートIPアドレス
	 */
	public String getPrivateIpAddress() {
		return privateIpAddress;
	}

	/**
	 * 割り当てられたプライベートIPアドレスを設定します。
	 *
	 * @param privateIpAddress 割り当てられたプライベートIPアドレス
	 */
	public void setPrivateIpAddress(String privateIpAddress) {
		this.privateIpAddress = privateIpAddress;
	}

	/**
	 * 割り当てられたプライベートIPアドレスを設定し、自オブジェクトを返します。
	 *
	 * @param privateIpAddress 割り当てられたプライベートIPアドレス
	 * @return 自オブジェクト
	 */
	public AllocateAddressResult withPrivateIpAddress(String privateIpAddress) {
		setPrivateIpAddress(privateIpAddress);
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
	public AllocateAddressResult withDomain(String domain) {
		setDomain(domain);
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
	public AllocateAddressResult withAllocationId(String allocationId) {
		setAllocationId(allocationId);
		return this;
	}

	/**
	 * ゾーン情報を取得します。
	 *
	 * @return ゾーン情報
	 */
	public Placement getPlacement() {
		return placement;
	}

	/**
	 * ゾーン情報を設定します。
	 *
	 * @param placement ゾーン情報
	 */
	public void setPlacement(Placement placement) {
		this.placement = placement;
	}

	/**
	 * ゾーン情報を設定し、自オブジェクトを返します。
	 *
	 * @param placement ゾーン情報
	 * @return 自オブジェクト
	 */
	public AllocateAddressResult withPlacement(Placement placement) {
		setPlacement(placement);
		return this;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("[requestId=");
		builder.append(requestId);
		builder.append(", publicIp=");
		builder.append(publicIp);
		builder.append(", privateIpAddress=");
		builder.append(privateIpAddress);
		builder.append(", domain=");
		builder.append(domain);
		builder.append(", allocationId=");
		builder.append(allocationId);
		builder.append(", placement=");
		builder.append(placement);
		builder.append("]");
		return builder.toString();
	}
}