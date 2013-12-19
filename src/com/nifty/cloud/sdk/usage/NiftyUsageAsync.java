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
package com.nifty.cloud.sdk.usage;

import java.util.concurrent.Future;

import com.nifty.cloud.sdk.usage.model.DescribeUsageRequest;
import com.nifty.cloud.sdk.usage.model.DescribeUsageResult;
import com.nifty.cloud.sdk.usage.model.DescribeUserActivitiesRequest;
import com.nifty.cloud.sdk.usage.model.DescribeUserActivitiesResult;

/**
 * NIFTY Cloud API 非同期クライアント　インタフェース。
 * 利用状況カテゴリ クライアント。<br />
 * 利用状況カテゴリの非同期クライアントのインタフェースです。<br />
 * 戻り値の"利用不可"パラメータは返却値がnullまたは空となります。
 */
public interface NiftyUsageAsync extends NiftyUsage {

	/**
	 * 非同期でログ情報を取得します。
	 * 
	 * @param request DescribeUserActivitiesリクエスト
	 * @return DescribeUserActivities実行結果
	 */
	public Future<DescribeUserActivitiesResult> describeUserActivitiesAsync(DescribeUserActivitiesRequest request);

	/**
	 * 非同期で利用料金明細情報を取得します。
	 * 
	 * @param request DescribeUsageリクエスト
	 * @return DescribeUsage実行結果
	 */
	public Future<DescribeUsageResult> describeUsageAsync(DescribeUsageRequest request);

}
