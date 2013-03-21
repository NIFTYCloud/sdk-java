/******************************************************************************* 
 *  Copyright 2012 NIFTY Corporation All Rights Reserved.
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
 *  API Version: 1.12
 *  Date: 2012-12-21 17:00:00
 * 
 */
package com.nifty.cloud.sdk.usage.model;

import java.util.ArrayList;
import java.util.List;

import com.nifty.cloud.sdk.usage.model.transform.UsageDetailSetConverter;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamConverter;

/**
 * その他の利用情報クラス。<br />
 * このクラスはその他の利用情報を格納します。
 */
public class UsageExtraCharge {

	/** その他の月額利用情報リスト */
	@XStreamAlias("extraChargeMonthlyRateSet")
	@XStreamConverter(UsageDetailSetConverter.class)
	private List<UsageDetail> extraChargeMonthlyRates;

	/**
	 * その他の月額利用情報リストを取得します。
	 * @return その他の月額利用情報リスト
	 */
	public List<UsageDetail> getExtraChargeMonthlyRates() {
		return extraChargeMonthlyRates;
	}

	/**
	 * その他の月額利用情報リストを設定します。
	 * @param extraChargeMonthlyRates その他の月額利用情報リスト
	 */
	public void setExtraChargeMonthlyRates(List<UsageDetail> extraChargeMonthlyRates) {
		this.extraChargeMonthlyRates = extraChargeMonthlyRates;
	}
	/**
	 * その他の月額利用情報の配列を設定し、自オブジェクトを返します。
	 * @param extraChargeMonthlyRates その他の月額利用情報の配列
	 * @return 自オブジェクト
	 */
	public UsageExtraCharge withExtraChargeMonthlyRates(UsageDetail... extraChargeMonthlyRates) {
		if(this.extraChargeMonthlyRates == null) {
			this.extraChargeMonthlyRates = new ArrayList<UsageDetail>();
		}
		for(UsageDetail extraChargeMonthlyRate : extraChargeMonthlyRates){
			getExtraChargeMonthlyRates().add(extraChargeMonthlyRate);
		}
		return this;
	}
	/**
	 * その他の月額利用情報リストを設定し、自オブジェクトを返します。
	 * @param extraChargeMonthlyRates その他の月額利用情報リスト
	 * @return 自オブジェクト
	 */
	public UsageExtraCharge withExtraChargeMonthlyRates(List<UsageDetail> extraChargeMonthlyRates) {
		if(this.extraChargeMonthlyRates == null) {
			this.extraChargeMonthlyRates = new ArrayList<UsageDetail>();
		}
		if(extraChargeMonthlyRates != null){
			getExtraChargeMonthlyRates().addAll(extraChargeMonthlyRates);
		}
		return this;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("[extraChargeMonthlyRates=");
		builder.append(extraChargeMonthlyRates);
		builder.append("]");
		return builder.toString();
	}
}
