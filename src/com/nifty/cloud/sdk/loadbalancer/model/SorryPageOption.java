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
package com.nifty.cloud.sdk.loadbalancer.model;

/**
 * Sorryページオプション情報クラス。<br />
 * このクラスはSorryページオプション情報を格納します。
 */
public class SorryPageOption {
	/** オプション利用フラグ */
	private Boolean enabled;
	/** レスポンスコード */
	private Integer statusCode;

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
	public SorryPageOption withEnabled(Boolean enabled) {
		setEnabled(enabled);
		return this;
	}
	/**
	 * レスポンスコードを取得します。
	 * @return レスポンスコード
	 */
	public Integer getStatusCode() {
		return statusCode;
	}
	/**
	 * レスポンスコードを設定します。
	 * @param statusCode レスポンスコード
	 */
	public void setStatusCode(Integer statusCode) {
		this.statusCode = statusCode;
	}
	/**
	 * レスポンスコードを設定し、自オブジェクトを返します。
	 * @param statusCode レスポンスコード
	 * @return 自オブジェクト
	 */
	public SorryPageOption withStatusCode(Integer statusCode) {
		setStatusCode(statusCode);
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
		builder.append(", statusCode=");
		builder.append(statusCode);
		builder.append("]");
		return builder.toString();
	}
}
