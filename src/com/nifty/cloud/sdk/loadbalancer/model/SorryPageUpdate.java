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
 *  API Version: 1.15
 *  Date: 2013-06-28 17:00:00
 * 
 */
package com.nifty.cloud.sdk.loadbalancer.model;

import com.nifty.cloud.sdk.annotation.Query;
/**
 * Sorryページオプション設定情報クラス。<br />
 * このクラスはSorryページオプション設定情報を格納します。
 */
public class SorryPageUpdate {
	/** オプション利用フラグ */
	private Boolean enable;
	/** レスポンスコード */
	private Integer statusCode;

	/**
	 * オプション利用フラグを取得します。
	 * @return オプション利用フラグ
	 */
	@Query(name="Enable")
	public Boolean getEnable() {
		return enable;
	}
	/**
	 * オプション利用フラグを設定します。
	 * @param enable オプション利用フラグ
	 */
	public void setEnable(Boolean enable) {
		this.enable = enable;
	}
	/**
	 * オプション利用フラグを設定し、自オブジェクトを返します。
	 * @param enable オプション利用フラグ
	 * @return 自オブジェクト
	 */
	public SorryPageUpdate withEnable(Boolean enable) {
		setEnable(enable);
		return this;
	}
	/**
	 * レスポンスコードを取得します。
	 * @return レスポンスコード
	 */
	@Query(name="StatusCode")
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
	public SorryPageUpdate withStatusCode(Integer statusCode) {
		setStatusCode(statusCode);
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
		builder.append(", statusCode=");
		builder.append(statusCode);
		builder.append("]");
		return builder.toString();
	}
}
