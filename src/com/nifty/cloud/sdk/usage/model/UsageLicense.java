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
package com.nifty.cloud.sdk.usage.model;

import java.util.ArrayList;
import java.util.List;

import com.nifty.cloud.sdk.usage.model.transform.UsageDetailSetConverter;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamConverter;

/**
 * ライセンス情報クラス。<br />
 * このクラスはライセンス情報を格納します。
 */
public class UsageLicense {

	/** ライセンス利用情報リスト */
	@XStreamAlias("licenseMonthlyRateSet")
	@XStreamConverter(UsageDetailSetConverter.class)
	private List<UsageDetail> licenseMonthlyRates;

	/**
	 * ライセンス利用情報リストを取得します。
	 *
	 * @return ライセンス利用情報リスト
	 */
	public List<UsageDetail> getLicenseMonthlyRates() {
		return licenseMonthlyRates;
	}

	/**
	 * ライセンス利用情報リストを設定します。
	 *
	 * @param licenseMonthlyRates ライセンス利用情報リスト
	 */
	public void setLicenseMonthlyRates(List<UsageDetail> licenseMonthlyRates) {
		this.licenseMonthlyRates = licenseMonthlyRates;
	}

	/**
	 * ライセンス利用情報の配列を設定し、自オブジェクトを返します。
	 *
	 * @param licenseMonthlyRates ライセンス利用情報の配列
	 * @return 自オブジェクト
	 */
	public UsageLicense withLicenseMonthlyRates(UsageDetail... licenseMonthlyRates) {
		if (this.licenseMonthlyRates == null) this.licenseMonthlyRates = new ArrayList<UsageDetail>();
		for (UsageDetail licenseMonthlyRate : licenseMonthlyRates) {
			getLicenseMonthlyRates().add(licenseMonthlyRate);
		}
		return this;
	}

	/**
	 * ライセンス利用情報リストを設定し、自オブジェクトを返します。
	 *
	 * @param licenseMonthlyRates ライセンス利用情報リスト
	 * @return 自オブジェクト
	 */
	public UsageLicense withLicenseMonthlyRates(List<UsageDetail> licenseMonthlyRates) {
		if (this.licenseMonthlyRates == null) this.licenseMonthlyRates = new ArrayList<UsageDetail>();
		if (licenseMonthlyRates != null) {
			getLicenseMonthlyRates().addAll(licenseMonthlyRates);
		}
		return this;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("[licenseMonthlyRates=");
		builder.append(licenseMonthlyRates);
		builder.append("]");
		return builder.toString();
	}
}
