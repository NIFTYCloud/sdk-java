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
package com.nifty.cloud.sdk.misc.model;

import com.nifty.cloud.sdk.annotation.Query;

/**
 * UserInfoクラス。<br />
 * ＠nifty法人ID情報を格納します。
 *
 */
public class UserInfo {
	private String UserId;

	/**
	 * ＠nifty法人IDを取得します。
	 *
	 * @return ＠nifty法人ID
	 */
	@Query(name="UserId")
	public String getUserId() {
		return UserId;
	}
	/**
	 * ＠nifty法人IDを設定します。
	 *
	 * @param UserId ＠nifty法人ID
	 */
	public void setUserId(String UserId) {
		this.UserId = UserId;
	}
	/**
	 * ＠nifty法人IDを設定し、自オブジェクトを返します。
	 *
	 * @param  UserId ＠nifty法人ID
	 * @return 自オブジェクト
	 */
	public UserInfo withUserId(String UserId) {
		setUserId(UserId);
		return this;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(UserId);
		return builder.toString();
	}

}
