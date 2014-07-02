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
import com.nifty.cloud.sdk.address.model.Placement;

/**
 * AllocateAddressリクエストクラス。<br />
 * このクラスはAllocateAddressへのリクエストを構築します。
 */
@Action("AllocateAddress")
public class AllocateAddressRequest implements Request {

	private String domain;

	/** プライベートIP */
	private Boolean niftyPrivateIp;

	/** ゾーン情報 */
	private Placement placement;

	/**
	 * domainを取得します。
	 *
	 * @return domain
	 */
	@Query(name = "Domain")
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
	public AllocateAddressRequest withDomain(String domain) {
		setDomain(domain);
		return this;
	}

	/**
	 * プライベートIPを取得します。
	 *
	 * @return プライベートIP
	 */
	@Query(name = "NiftyPrivateIp")
	public Boolean getNiftyPrivateIp() {
		return niftyPrivateIp;
	}

	/**
	 * プライベートIPを設定します。
	 *
	 * @param niftyPrivateIp プライベートIP
	 */
	public void setNiftyPrivateIp(Boolean niftyPrivateIp) {
		this.niftyPrivateIp = niftyPrivateIp;
	}

	/**
	 * プライベートIPを設定し、自オブジェクトを返します。
	 *
	 * @param niftyPrivateIp プライベートIP
	 * @return 自オブジェクト
	 */
	public AllocateAddressRequest withNiftyPrivateIp(Boolean niftyPrivateIp) {
		setNiftyPrivateIp(niftyPrivateIp);
		return this;
	}

	/**
	 * ゾーン情報を取得します。
	 *
	 * @return ゾーン情報
	 */
	@Query(name = "Placement")
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
	public AllocateAddressRequest withPlacement(Placement placement) {
		setPlacement(placement);
		return this;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("[domain=");
		builder.append(domain);
		builder.append(", niftyPrivateIp=");
		builder.append(niftyPrivateIp);
		builder.append(", placement=");
		builder.append(placement);
		builder.append("]");
		return builder.toString();
	}
}
