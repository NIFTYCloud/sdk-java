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
 *  API Version: 1.9
 *  Date: 2011-08-25 09:46:38
 * 
 */
package com.nifty.cloud.sdk.loadbalancer.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Policiesクラス。<br />
 * このクラスはPoliciesを格納します。
 */
public class Policies {
	
	private List<AppCookieStickinessPolicy>	appCookieStickinessPolicies;
	
	private List<LBCookiesStickinessPolicy>	lBCookieStickinessPolicies;
	
	/**
	 * appCookieStickinessPolicies情報リストを取得します。
	 * 
	 * @return appCookieStickinessPolicies
	 */
	public List<AppCookieStickinessPolicy> getAppCookieStickinessPolicies() {
		return appCookieStickinessPolicies;
	}
	/**
	 * appCookieStickinessPolicies情報リストを設定します。
	 * 
	 * @param appCookieStickinessPolicies
	 */
	public void setAppCookieStickinessPolicies(List<AppCookieStickinessPolicy> appCookieStickinessPolicies) {
		this.appCookieStickinessPolicies = appCookieStickinessPolicies;
	}
	/**
	 * appCookieStickinessPolicies情報の配列を設定し、自オブジェクトを返します。
	 *
	 * @param appCookieStickinessPolicies
	 * @return 自オブジェクト
	 */
	public Policies withAppCookieStickinessPolicies(AppCookieStickinessPolicy ... appCookieStickinessPolicies) {
		if(this.appCookieStickinessPolicies == null) this.appCookieStickinessPolicies = new ArrayList<AppCookieStickinessPolicy>();
		for (AppCookieStickinessPolicy appCookieStickinessPolicie: appCookieStickinessPolicies) {
			getAppCookieStickinessPolicies().add(appCookieStickinessPolicie);
		}
		return this;
	}
	/**
	 * appCookieStickinessPolicies情報リストを設定し、自オブジェクトを返します。
	 *
	 * @param  appCookieStickinessPolicies
	 * @return 自オブジェクト
	 */
	public Policies withAppCookieStickinessPolicies(Collection<AppCookieStickinessPolicy> appCookieStickinessPolicies) {
		if(this.appCookieStickinessPolicies == null) this.appCookieStickinessPolicies = new ArrayList<AppCookieStickinessPolicy>();
		if (appCookieStickinessPolicies!=null) {
			getAppCookieStickinessPolicies().addAll(appCookieStickinessPolicies);
		}
		return this;
	}

	/**
	 * lBCookieStickinessPolicies情報リストを取得します。
	 * 
	 * @return lBCookieStickinessPolicies 
	 */
	public List<LBCookiesStickinessPolicy> getLBCookiesStickinessPolicies() {
		return lBCookieStickinessPolicies;
	}
	/**
	 * lBCookieStickinessPolicies情報リストを設定します。
	 * 
	 * @param lBCookieStickinessPolicies
	 */
	public void setLBCookiesStickinessPolicies(List<LBCookiesStickinessPolicy> lBCookieStickinessPolicies) {
		this.lBCookieStickinessPolicies = lBCookieStickinessPolicies;
	}
	/**
	 * lBCookieStickinessPolicies情報の配列を設定し、自オブジェクトを返します。
	 *
	 * @param lBCookieStickinessPolicies
	 * @return 自オブジェクト
	 */
	public Policies withLBCookiesStickinessPolicies(LBCookiesStickinessPolicy ... lBCookieStickinessPolicies) {
		if(this.lBCookieStickinessPolicies == null) this.lBCookieStickinessPolicies = new ArrayList<LBCookiesStickinessPolicy>();
		for (LBCookiesStickinessPolicy lBCookieStickinessPolicie: lBCookieStickinessPolicies) {
			getLBCookiesStickinessPolicies().add(lBCookieStickinessPolicie);
		}
		return this;
	}
	/**
	 * lBCookieStickinessPolicies情報リストを設定し、自オブジェクトを返します。
	 *
	 * @param lBCookieStickinessPolicies
	 * @return 自オブジェクト
	 */
	public Policies withLBCookiesStickinessPolicies(Collection<LBCookiesStickinessPolicy> lBCookieStickinessPolicies) {
		if(this.lBCookieStickinessPolicies == null) this.lBCookieStickinessPolicies = new ArrayList<LBCookiesStickinessPolicy>();
		if (lBCookieStickinessPolicies!=null) {
			getLBCookiesStickinessPolicies().addAll(lBCookieStickinessPolicies);
		}
		return this;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("[appCookieStickinessPolicies=");
		builder.append(appCookieStickinessPolicies);
		builder.append(", lBCookieStickinessPolicies=");
		builder.append(lBCookieStickinessPolicies);
		builder.append("]");
		return builder.toString();
	}
	
}
