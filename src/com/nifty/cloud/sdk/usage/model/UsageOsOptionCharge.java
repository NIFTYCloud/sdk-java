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
package com.nifty.cloud.sdk.usage.model;

import java.util.List;

import com.nifty.cloud.sdk.usage.model.transform.UsageDetailSetConverter;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamConverter;

/**
 * OSオプション利用情報クラス。<br />
 * このクラスはOSオプション利用情報を格納します。
 */
public class UsageOsOptionCharge {

	/** OSオプション月額利用情報リスト */
	@XStreamAlias("osOptionChargeMonthlyRateSet")
	@XStreamConverter(UsageDetailSetConverter.class)
	private List<UsageDetail> osOptionMonthlyRates;

	/**
	 * OSオプション月額利用情報を返します。
	 * @return OSオプション月額利用情報
	 */
	public List<UsageDetail> getOsOptionChargeMonthlyRates() {
		return osOptionMonthlyRates;
	}

	/**
	 * OSオプション月額利用情報を設定します。
	 * @param osOptionMonthlyRates OSオプション月額利用情報
	 */
	public void setOsOptionChargeMonthlyRates(List<UsageDetail> osOptionMonthlyRates) {
		this.osOptionMonthlyRates = osOptionMonthlyRates;
	}

	/**
	 * OSオプション月額利用情報を設定し、自オブジェクトを返します。
	 * @param osOptionMonthlyRates OSオプション月額利用情報
	 * @return 自オブジェクト
	 */
	public UsageOsOptionCharge withOsOptionChargeMonthlyRates(List<UsageDetail> osOptionMonthlyRates) {
		setOsOptionChargeMonthlyRates(osOptionMonthlyRates);
		return this;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("[osOptionMonthlyRates=");
		builder.append(osOptionMonthlyRates);
		builder.append("]");
		return builder.toString();
	}
}
