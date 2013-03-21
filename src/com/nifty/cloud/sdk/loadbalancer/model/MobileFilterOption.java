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
 * 携帯キャリアフィルターオプション情報クラス。<br />
 * このクラスは携帯キャリアフィルターオプション情報を格納します。
 */
public class MobileFilterOption {
	/** オプション利用フラグ */
	private Boolean enabled;

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
	public MobileFilterOption withEnabled(Boolean enabled) {
		setEnabled(enabled);
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
		builder.append("]");
		return builder.toString();
	}
}
