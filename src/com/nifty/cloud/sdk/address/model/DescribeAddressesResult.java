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

import java.util.ArrayList;

import java.util.Collection;
import java.util.List;

import com.nifty.cloud.sdk.Result;
import com.nifty.cloud.sdk.address.model.transform.AddressConverter;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamConverter;

/**
 * DescribeAddresses処理結果クラス。<br />
 * このクラスはDescribeAddressesのレスポンスを格納します。
 */
@XStreamAlias("DescribeAddressesResponse")
public class DescribeAddressesResult extends Result {

	/** リクエスト識別子 */
	@XStreamAlias("requestId")
	private String requestId;

	/** IPアドレス情報セットリスト */
	@XStreamAlias("addressesSet")
	@XStreamConverter(AddressConverter.class)
	private List<Address> addresses;

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
	public DescribeAddressesResult withRequestId(String requestId) {
		setRequestId(requestId);
		return this;
	}

	/**
	 * IPアドレス情報セットリストを取得します。
	 *
	 * @return IPアドレス情報セットリスト
	 */
	public List<Address> getAddresses() {
		return addresses;
	}

	/**
	 * IPアドレス情報セットリストを設定します。
	 *
	 * @param addresses IPアドレス情報セットリスト
	 */
	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}

	/**
	 * IPアドレス情報セットの配列を設定し、自オブジェクトを返します。
	 *
	 * @param addresses IPアドレス情報セットの配列
	 * @return 自オブジェクト
	 */
	public DescribeAddressesResult withAddresses(Address ... addresses) {
		if (this.addresses == null) this.addresses = new ArrayList<Address>();
		for (Address address: addresses) {
			getAddresses().add(address);
		}
		return this;
	}

	/**
	 * IPアドレス情報セットリストを設定し、自オブジェクトを返します。
	 *
	 * @param addresses IPアドレス情報セットリスト
	 * @return 自オブジェクト
	 */
	public DescribeAddressesResult withAddresses(Collection<Address> addresses) {
		if (this.addresses == null) this.addresses = new ArrayList<Address>();
		if (addresses != null) {
			getAddresses().addAll(addresses);
		}
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
		builder.append(", addresses=");
		builder.append(addresses);
		builder.append("]");
		return builder.toString();
	}
}