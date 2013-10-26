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
package com.nifty.cloud.sdk.misc.model.transform;

import com.nifty.cloud.sdk.Response;
import com.nifty.cloud.sdk.ResponseMetadata;
import com.nifty.cloud.sdk.Result;
import com.nifty.cloud.sdk.misc.model.DescribeAssociatedUsersResult;
import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * DescribeAssociatedUsersResponseクラス。<br />
 * このクラスはDescribeAssociatedUsersのレスポンスを格納します。
 */
@XStreamAlias("DescribeAssociatedUsersResponse")
public class DescribeAssociatedUsersResponse implements Response {
	
	/** describeAssociatedUsersResult 結果セット */
	@XStreamAlias("DescribeAssociatedUsersResult")
	private DescribeAssociatedUsersResult describeAssociatedUsersResult;
	
	/** リクエスト情報 */	
	@XStreamAlias("ResponseMetadata")
	ResponseMetadata responseMetadata;


	/**
	 * DescribeAssociatedUsers 結果セットを取得します。
	 *
	 * @return DescribeAssociatedUsers 結果セット
	 */
	public DescribeAssociatedUsersResult getDescribeAssociatedUsersResult() {
		return describeAssociatedUsersResult;
	}
	/**
	 * DescribeAssociatedUsers 結果セットを設定します。
	 *
	 * @param describeAssociatedUsersResult 結果セット
	 */
	public void setDescribeAssociatedUsersResult(DescribeAssociatedUsersResult describeAssociatedUsersResult) {
		this.describeAssociatedUsersResult = describeAssociatedUsersResult;
	}

	/**
	 * DescribeAssociatedUsersResponseのResultクラスを取得します。
	 * 
	 * @see com.nifty.cloud.sdk.Response#getResult()
	 */
	@Override
	public Result getResult() {
		return describeAssociatedUsersResult;
	}
}
