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
package com.nifty.cloud.sdk.misc.model;

import com.nifty.cloud.sdk.Request;
import com.nifty.cloud.sdk.annotation.Action;
import com.nifty.cloud.sdk.annotation.Query;

/**
 * DescribeAssociatedUsersRequestクラス。<br />
 * このクラスDescribeAssociatedUsersRequest情報を格納します。
 *
 */
@Action("DescribeAssociatedUsers")
public class DescribeAssociatedUsersRequest  implements Request{

	private String FunctionName;

	/**
	 * 機能名を取得します。
	 *
	 * @return 機能名
	 */
	@Query(name = "FunctionName", require=true)
	public String getFunction() {
		return FunctionName;
	}

	/**
	 * 機能名を設定します。
	 *
	 * @param function 機能名
	 */
	public void setFunction(String function) {
		this.FunctionName = function;
	}

	/**
	 * 機能名を設定し、自オブジェクトを返します。
	 *
	 * @param function 機能名
	 * @return 自オブジェクト
	 */
	public DescribeAssociatedUsersRequest withFunction(String function) {
		this.FunctionName = function;
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
		builder.append("[functionName=");
		builder.append(FunctionName);
		builder.append("]");
		return builder.toString();
	}
}