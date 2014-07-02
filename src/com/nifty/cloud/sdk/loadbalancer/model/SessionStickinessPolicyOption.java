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
package com.nifty.cloud.sdk.loadbalancer.model;

/**
 * セッション固定オプション情報クラス。<br />
 * このクラスはセッション固定オプション情報を格納します。
 */
public class SessionStickinessPolicyOption {
	/** オプション利用フラグ */
	private Boolean enabled;
	/** セッション保持時間 */
	private Integer expirationPeriod;

	/**
	 * オプション利用フラグを取得します。
	 * @return オプション利用フラグ
	 */
	public Boolean getEnabled() {
		return enabled;
	}
	/**
	 * オプション利用フラグを設定します。
	 * @param enabled オプション利用フラグ
	 */
	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}
	/**
	 * オプション利用フラグを設定し、自オブジェクトを返します。
	 * @param enabled オプション利用フラグ
	 * @return 自オブジェクト
	 */
	public SessionStickinessPolicyOption withEnabled(Boolean enabled) {
		setEnabled(enabled);
		return this;
	}
	/**
	 * セッション保持時間を取得します。
	 * @return セッション保持時間
	 */
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
	public SessionStickinessPolicyOption withExpirationPeriod(Integer expirationPeriod) {
		setExpirationPeriod(expirationPeriod);
		return this;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("[enabled=");
		builder.append(enabled);
		builder.append(", expirationPeriod=");
		builder.append(expirationPeriod);
		builder.append("]");
		return builder.toString();
	}
}
