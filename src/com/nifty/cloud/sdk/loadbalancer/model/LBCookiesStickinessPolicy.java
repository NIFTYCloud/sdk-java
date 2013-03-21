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
package com.nifty.cloud.sdk.loadbalancer.model;

/**
 * LBCookiesStickinessPolicyクラス。<br />
 * このクラスはLBCookiesStickinessPolicyを格納します。
 */
public class LBCookiesStickinessPolicy {
	
	private String policyName;
	
	private String cookieExpirationPeriod;
	
	/**
	 * policyNameを取得します。
	 * 
	 * @return policyName
	 */	public String getPolicyName() {
		return policyName;
	}
	/**
	 * policyNameを設定します。
	 * 
	 * @param policyName
	 */
	public void setPolicyName(String policyName) {
		this.policyName = policyName;
	}
	/**
	 * policyNameを設定し、自オブジェクトを返します。
	 *
	 * @param policyName
	 * @return 自オブジェクト
	 */
	public LBCookiesStickinessPolicy withPolicyName(String policyName) {
		setPolicyName(policyName);
		return this;
	}

	/**
	 * cookieExpirationPeriodを取得します。
	 * 
	 * @return cookieExpirationPeriod
	 */	public String getCookieExpirationPeriod() {
		return cookieExpirationPeriod;
	}
	/**
	 * cookieExpirationPeriodを設定します。
	 * 
	 * @param cookieExpirationPeriod
	 */
	public void setCookieExpirationPeriod(String cookieExpirationPeriod) {
		this.cookieExpirationPeriod = cookieExpirationPeriod;
	}
	/**
	 * cookieExpirationPeriodを設定し、自オブジェクトを返します。
	 *
	 * @param cookieExpirationPeriod
	 * @return 自オブジェクト
	 */
	public LBCookiesStickinessPolicy withCookieExpirationPeriod(String cookieExpirationPeriod) {
		setCookieExpirationPeriod(cookieExpirationPeriod);
		return this;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("[policyName=");
		builder.append(policyName);
		builder.append(", cookieExpirationPeriod=");
		builder.append(cookieExpirationPeriod);
		builder.append("]");
		return builder.toString();
	}

	
}
