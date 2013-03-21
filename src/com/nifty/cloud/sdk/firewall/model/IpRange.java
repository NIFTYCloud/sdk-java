/*******************************************************************************
 *  Copyright 2011 NIFTY Corporation All Rights Reserved.
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
 *  API Version: 1.11
 *  Date: 2011-08-25 09:46:38
 *
 */
package com.nifty.cloud.sdk.firewall.model;

import com.nifty.cloud.sdk.annotation.Query;

/**
 * 許可するIPアドレス情報クラス。<br />
 * このクラスは許可するIPアドレス情報を格納します。
 *
 */
public class IpRange {

	/** 許可するIPアドレス */
	private String cidrIp;

	/**
	 * 許可するIPアドレスを取得します。
	 *
	 * @return cidrIp 許可IPするアドレス
	 */
	@Query(name = "CidrIp")
	public String getCidrIp() {
		return cidrIp;
	}

	/**
	 * 許可するIPアドレスを設定します。
	 *
	 * @param cidrIp 許可するIPアドレス
	 */
	public void setCidrIp(String cidrIp) {
		this.cidrIp = cidrIp;
	}

	/**
	 * 許可するIPアドレスの配列を設定し、自オブジェクトを返します。
	 *
	 * @param cidrIp 許可するIPアドレスの配列
	 * @return 自オブジェクト
	 */
	public IpRange withCidrIp(String cidrIp) {
		setCidrIp(cidrIp);
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
		builder.append("[cidrIp=");
		builder.append(cidrIp);
		builder.append("]");
		return builder.toString();
	}
}
