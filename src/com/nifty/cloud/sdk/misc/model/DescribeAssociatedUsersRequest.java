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
package com.nifty.cloud.sdk.misc.model;



import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

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
	 * @return String FunctionName
	 */
	@Query(name = "FunctionName")
	public String getFunction() {
		return FunctionName;
	}

	/**
	 * 機能名を設定します。
	 *
	 * @param String function
	 */
	public void setFunction(String function) {
		this.FunctionName = function;
	}

	/**
	 * functionを設定し、自オブジェクトを返します。
	 *
	 * @param String function
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