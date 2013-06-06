/******************************************************************************* 
 *  Copyright 2013 NIFTY Corporation All Rights Reserved.
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
 *  API Version: 1.14
 *  Date: 2013-03-28 17:00:00
 * 
 */
package com.nifty.cloud.sdk.loadbalancer.model;

/**
 * ロードバランサーオプション情報クラス。<br />
 * このクラスはロードバランサーオプション情報を格納します。
 */
public class LoadBalancerOption {
	/** セッション固定オプション情報 */
	SessionStickinessPolicyOption sessionStickinessPolicy;
	/** Sorryページオプション情報 */
	SorryPageOption sorryPage;
	/** 携帯キャリアフィルターオプション情報 */
	MobileFilterOption mobileFilter;

	/**
	 * セッション固定オプション情報を取得します。
	 * @return セッション固定オプション情報
	 */
	public SessionStickinessPolicyOption getSessionStickinessPolicy() {
		return sessionStickinessPolicy;
	}
	/**
	 * セッション固定オプション情報を設定します。
	 * @param sessionStickinessPolicy セッション固定オプション情報
	 */
	public void setSessionStickinessPolicy(
			SessionStickinessPolicyOption sessionStickinessPolicy) {
		this.sessionStickinessPolicy = sessionStickinessPolicy;
	}
	/**
	 * セッション固定オプション情報を設定し、自オブジェクトを返します。
	 * @param sessionStickinessPolicy セッション固定オプション情報
	 * @return 自オブジェクト
	 */
	public LoadBalancerOption withSessionStickinessPolicy(
			SessionStickinessPolicyOption sessionStickinessPolicy) {
		setSessionStickinessPolicy(sessionStickinessPolicy);
		return this;
	}
	/**
	 * Sorryページオプション情報を取得します。
	 * @return Sorryページオプション情報
	 */
	public SorryPageOption getSorryPage() {
		return sorryPage;
	}
	/**
	 * Sorryページオプション情報を設定します。
	 * @param sorryPage Sorryページオプション情報
	 */
	public void setSorryPage(SorryPageOption sorryPage) {
		this.sorryPage = sorryPage;
	}
	/**
	 * Sorryページオプション情報を設定し、自オブジェクトを返します。
	 * @param sorryPage Sorryページオプション情報
	 * @return 自オブジェクト
	 */
	public LoadBalancerOption withSorryPage(SorryPageOption sorryPage) {
		setSorryPage(sorryPage);
		return this;
	}
	/**
	 * 携帯キャリアフィルターオプション情報を取得します。
	 * @return 携帯キャリアフィルターオプション情報
	 */
	public MobileFilterOption getMobileFilter() {
		return mobileFilter;
	}
	/**
	 * 携帯キャリアフィルターオプション情報を設定します。
	 * @param mobileFilter 携帯キャリアフィルターオプション情報
	 */
	public void setMobileFilter(MobileFilterOption mobileFilter) {
		this.mobileFilter = mobileFilter;
	}
	/**
	 * 携帯キャリアフィルターオプション情報を設定し、自オブジェクトを返します。
	 * @param mobileFilter 携帯キャリアフィルターオプション情報
	 * @return 自オブジェクト
	 */
	public LoadBalancerOption withMobileFilter(MobileFilterOption mobileFilter) {
		setMobileFilter(mobileFilter);
		return this;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("[sessionStickinessPolicy=");
		builder.append(sessionStickinessPolicy);
		builder.append(", sorryPage=");
		builder.append(sorryPage);
		builder.append(", mobileFilter=");
		builder.append(mobileFilter);
		builder.append("]");
		return builder.toString();
	}
}
