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
 *  API Version: 1.16
 *  Date: 2013-10-18 17:00:00
 * 
 */
package com.nifty.cloud.sdk.loadbalancer.model;

import com.nifty.cloud.sdk.annotation.Query;
/**
 * セッション固定オプション設定情報クラス。<br />
 * このクラスはセッション固定オプション設定情報を格納します。
 */
public class SessionStickinessPolicyUpdate {
	/** オプション利用設定 */
	private Boolean enable;
	/** セッション保持時間 */
	private Integer expirationPeriod;

	/**
	 * オプション利用設定を取得します。
	 * @return オプション利用設定
	 */
	@Query(name="Enable")
	public Boolean getEnable() {
		return enable;
	}
	/**
	 * オプション利用設定を設定します。
	 * @param enable オプション利用設定
	 */
	public void setEnable(Boolean enable) {
		this.enable = enable;
	}
	/**
	 * オプション利用設定を設定し、自オブジェクトを返します。
	 * @param enable オプション利用設定
	 * @return 自オブジェクト
	 */
	public SessionStickinessPolicyUpdate withEnable(Boolean enable) {
		setEnable(enable);
		return this;
	}
	/**
	 * セッション保持時間を取得します。
	 * @return セッション保持時間
	 */
	@Query(name="ExpirationPeriod")
	public Integer getExpirationPeriod() {
		return expirationPeriod;
	}
	/**
	 * セッション保持時間を設定します。
	 * @param expirationPeriod セッション保持時間
	 */
	public void setExpirationPeriod(Integer expirationPeriod) {
		this.expirationPeriod = expirationPeriod;
	}
	/**
	 * セッション保持時間を設定し、自オブジェクトを返します。
	 * @param expirationPeriod セッション保持時間
	 * @return 自オブジェクト
	 */
	public SessionStickinessPolicyUpdate withExpirationPeriod(Integer expirationPeriod) {
		setExpirationPeriod(expirationPeriod);
		return this;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("[enable=");
		builder.append(enable);
		builder.append(", expirationPeriod=");
		builder.append(expirationPeriod);
		builder.append("]");
		return builder.toString();
	}
}
