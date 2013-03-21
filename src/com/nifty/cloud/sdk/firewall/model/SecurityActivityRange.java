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
package com.nifty.cloud.sdk.firewall.model;

import com.nifty.cloud.sdk.Request;
import com.nifty.cloud.sdk.annotation.Query;

/**
 * 取得したいログの絞り込み条件（件数）クラス。<br />
 * このクラスは取得したいログの絞り込み条件（件数）情報を格納します。
 */
public class SecurityActivityRange implements Request {

	/** 指定日内を全件取得 */
	private Boolean all;

	/** 取得開始件数 */
	private Integer startNumber;

	/** 取得終了件数 */
	private Integer endNumber;

	/**
	 * 指定日内を全件取得を取得します。
	 *
	 * @return 指定日内を全件取得
	 */
	@Query(name = "All")
	public Boolean getAll() {
		return all;
	}

	/**
	 * 指定日内を全件取得を設定します。
	 *
	 * @param all 指定日内を全件取得
	 */
	public void setAll(Boolean all) {
		this.all = all;
	}

	/**
	 * 指定日内を全件取得を設定し、自オブジェクトを返します。
	 *
	 * @param all 指定日内を全件取得
	 * @return 自オブジェクト
	 */
	public SecurityActivityRange withAll(Boolean all) {
		setAll(all);
		return this;
	}

	/**
	 * 取得開始件数を取得します。
	 *
	 * @return 取得開始件数
	 */
	@Query(name = "StartNumber")
	public Integer getStartNumber() {
		return startNumber;
	}

	/**
	 * 取得開始件数を設定します。
	 *
	 * @param startNumber 取得開始件数
	 */
	public void setStartNumber(Integer startNumber) {
		this.startNumber = startNumber;
	}

	/**
	 * 取得開始件数を設定し、自オブジェクトを返します。
	 *
	 * @param startNumber 取得開始件数
	 * @return 自オブジェクト
	 */
	public SecurityActivityRange withStartNumber(Integer startNumber) {
		setStartNumber(startNumber);
		return this;
	}

	/**
	 * 取得終了件数を取得します。
	 *
	 * @return 取得終了件数
	 */
	@Query(name = "EndNumber")
	public Integer getEndNumber() {
		return endNumber;
	}

	/**
	 * 取得終了件数を設定します。
	 *
	 * @param endNumber 取得終了件数
	 */
	public void setEndNumber(Integer endNumber) {
		this.endNumber = endNumber;
	}

	/**
	 * 取得終了件数を設定し、自オブジェクトを返します。
	 *
	 * @param endNumber 取得終了件数
	 * @return 自オブジェクト
	 */
	public SecurityActivityRange withEndNumber(Integer endNumber) {
		setEndNumber(endNumber);
		return this;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("[all=");
		builder.append(all);
		builder.append(", startNumber=");
		builder.append(startNumber);
		builder.append(", endNumber=");
		builder.append(endNumber);
		builder.append("]");
		return builder.toString();
	}
}
