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
 * プレミアムサポート情報クラス。<br />
 * このクラスはプレミアムサポート情報を格納します。
 */
public class UsagePremiumSupport {

	/** プレミアムサポート情報リスト */
	@XStreamAlias("premiumSupportSet")
	@XStreamConverter(UsageDetailSetConverter.class)
	private List<UsageDetail> premiumSupports;

	/**
	 * プレミアムサポート情報リストを取得します。
	 * 
	 * @return プレミアムサポート情報リスト
	 */
	public List<UsageDetail> getPremiumSupports() {
		return premiumSupports;
	}

	/**
	 * プレミアムサポート情報リストを設定します。
	 * 
	 * @param premiumSupports プレミアムサポート情報リスト
	 */
	public void setPremiumSupports(List<UsageDetail> premiumSupports) {
		this.premiumSupports = premiumSupports;
	}

	/**
	 * プレミアムサポート情報の配列を設定し、自オブジェクトを返します。
	 * 
	 * @param premiumSupports プレミアムサポート情報の配列
	 * @return 自オブジェクト
	 */
	public UsagePremiumSupport withPremiumSupports(UsageDetail... premiumSupports) {
		if (this.premiumSupports == null) this.premiumSupports = new ArrayList<UsageDetail>();
		for (UsageDetail premiumSupport : premiumSupports) {
			getPremiumSupports().add(premiumSupport);
		}
		return this;
	}

	/**
	 * プレミアムサポート情報リストを設定し、自オブジェクトを返します。
	 * 
	 * @param premiumSupports プレミアムサポート情報リスト
	 * @return 自オブジェクト
	 */
	public UsagePremiumSupport withPremiumSupports(List<UsageDetail> premiumSupports) {
		if (this.premiumSupports == null) this.premiumSupports = new ArrayList<UsageDetail>();
		if (premiumSupports != null) {
			getPremiumSupports().addAll(premiumSupports);
		}
		return this;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("[premiumSupports=");
		builder.append(premiumSupports);
		builder.append("]");
		return builder.toString();
	}
}
