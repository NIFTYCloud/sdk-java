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

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.nifty.cloud.sdk.Request;
import com.nifty.cloud.sdk.annotation.Action;
import com.nifty.cloud.sdk.annotation.Query;
import com.nifty.cloud.sdk.address.model.Filter;

/**
 * DescribeAddressesリクエストクラス。<br />
 * このクラスはDescribeAddressesへのリクエストを構築します。
 */
@Action("DescribeAddresses")
public class DescribeAddressesRequest implements Request {

	/** グローバルIPアドレスリスト */
	private List<String> publicIps;

	/** プライベートIPアドレスリスト */
	private List<String> privateIpAddresses;

	private List<String> allocationIds;

	private List<Filter> filters;

	/**
	 * グローバルIPアドレスリストを取得します。
	 *
	 * @return グローバルIPアドレスリスト
	 */
	@Query(name = "PublicIp")
	public List<String> getPublicIps() {
		return publicIps;
	}

	/**
	 * グローバルIPアドレスリストを設定します。
	 *
	 * @param publicIps グローバルIPアドレスリスト
	 */
	public void setPublicIps(List<String> publicIps) {
		this.publicIps = publicIps;
	}

	/**
	 * グローバルIPアドレスの配列を設定し、自オブジェクトを返します。
	 *
	 * @param publicIps グローバルIPアドレスの配列
	 * @return 自オブジェクト
	 */
	public DescribeAddressesRequest withPublicIps(String ... publicIps) {
		if (this.publicIps == null) this.publicIps = new ArrayList<String>();
		for (String publicIp: publicIps){
			getPublicIps().add(publicIp);
		}
		return this;
	}

	/**
	 * グローバルIPアドレスリストを設定し、自オブジェクトを返します。
	 *
	 * @param publicIps グローバルIPアドレスリスト
	 * @return 自オブジェクト
	 */
	public DescribeAddressesRequest withPublicIps(Collection<String> publicIps) {
		if (this.publicIps == null) this.publicIps = new ArrayList<String>();
		if (publicIps != null){
			getPublicIps().addAll(publicIps);
		}
		return this;
	}

	/**
	 * プライベートIPアドレスリストを取得します。
	 *
	 * @return プライベートIPアドレスリスト
	 */
	@Query(name = "PrivateIpAddress")
	public List<String> getPrivateIpAddresses() {
		return privateIpAddresses;
	}

	/**
	 * プライベートIPアドレスリストを設定します。
	 *
	 * @param privateIpAddresses プライベートIPアドレスリスト
	 */
	public void setPrivateIpAddresses(List<String> privateIpAddresses) {
		this.privateIpAddresses = privateIpAddresses;
	}

	/**
	 * プライベートIPアドレスの配列を設定し、自オブジェクトを返します。
	 *
	 * @param privateIpAddresses プライベートIPアドレスの配列
	 * @return 自オブジェクト
	 */
	public DescribeAddressesRequest withPrivateIpAddresses(String ... privateIpAddresses) {
		if (this.privateIpAddresses == null) this.privateIpAddresses = new ArrayList<String>();
		for (String privateIpAddress: privateIpAddresses) {
			getPrivateIpAddresses().add(privateIpAddress);
		}
		return this;
	}

	/**
	 * プライベートIPアドレスリストを設定し、自オブジェクトを返します。
	 *
	 * @param privateIpAddresses プライベートIPアドレスリスト
	 * @return 自オブジェクト
	 */
	public DescribeAddressesRequest withPrivateIpAddresses(Collection<String> privateIpAddresses) {
		if (this.privateIpAddresses == null) this.privateIpAddresses = new ArrayList<String>();
		if (privateIpAddresses != null) {
			getPrivateIpAddresses().addAll(privateIpAddresses);
		}
		return this;
	}

	/**
	 * allocationIdsを取得します。
	 *
	 * @return allocationIds
	 */
	@Query(name = "AllocationId")
	public List<String> getAllocationIds() {
		return allocationIds;
	}

	/**
	 * allocationIdsを設定します。
	 *
	 * @param allocationIds
	 */
	public void setAllocationIds(List<String> allocationIds) {
		this.allocationIds = allocationIds;
	}

	/**
	 * allocationIdsを設定し、自オブジェクトを返します。
	 *
	 * @param allocationIds
	 * @return 自オブジェクト
	 */
	public DescribeAddressesRequest withAllocationIds(String ... allocationIds) {
		if(this.allocationIds == null) this.allocationIds = new ArrayList<String>();
		for(String allocationId: allocationIds){
			getAllocationIds().add(allocationId);
		}
		return this;
	}

	/**
	 * allocationIdsを設定し、自オブジェクトを返します。
	 *
	 * @param allocationIds
	 * @return 自オブジェクト
	 */
	public DescribeAddressesRequest withAllocationIds(Collection<String> allocationIds) {
		if(this.allocationIds == null) this.allocationIds = new ArrayList<String>();
		if(allocationIds != null){
			getAllocationIds().addAll(allocationIds);
		}
		return this;
	}

	/**
	 * filtersを取得します。
	 *
	 * @return filters
	 */
	@Query(name = "Filter")
	public List<Filter> getFilters() {
		return filters;
	}

	/**
	 * filtersを設定します。
	 *
	 * @param filters
	 */
	public void setFilters(List<Filter> filters) {
		this.filters = filters;
	}

	/**
	 * filtersを設定し、自オブジェクトを返します。
	 *
	 * @param filters
	 * @return 自オブジェクト
	 */
	public DescribeAddressesRequest withFilters(Filter ... filters) {
		if(this.filters == null) this.filters = new ArrayList<Filter>();
		for(Filter filter: filters){
			getFilters().add(filter);
		}
		return this;
	}

	/**
	 * filtersを設定し、自オブジェクトを返します。
	 *
	 * @param filters
	 * @return 自オブジェクト
	 */
	public DescribeAddressesRequest withFilters(Collection<Filter> filters) {
		if(this.filters == null) this.filters = new ArrayList<Filter>();
		if(filters != null){
			getFilters().addAll(filters);
		}
		return this;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("[publicIps=");
		builder.append(publicIps);
		builder.append("privateIpAddresses=");
		builder.append(privateIpAddresses);
		builder.append(", allocationIds=");
		builder.append(allocationIds);
		builder.append(", filters=");
		builder.append(filters);
		builder.append("]");
		return builder.toString();
	}

}