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
package com.nifty.cloud.sdk.dashboard;

import com.nifty.cloud.sdk.dashboard.model.DescribeResourcesRequest;
import com.nifty.cloud.sdk.dashboard.model.DescribeResourcesResult;
import com.nifty.cloud.sdk.dashboard.model.DescribeServiceStatusRequest;
import com.nifty.cloud.sdk.dashboard.model.DescribeServiceStatusResult;

/**
 * NIFTY Cloud API クライアント　インタフェース。
 * ダッシュボードカテゴリ クライアント。<br />
 * ダッシュボードカテゴリの同期クライアントのインタフェースです。<br />
 * 戻り値の"利用不可"パラメータは返却値がnullまたは空となります。
 */
public interface NiftyDashboard {

	/**
	 * エンドポイントの設定を行います。
	 * 
	 * @param endpoint エンドポイント
	 */
	public void setEndpoint(String endpoint);

	/**
	 * リソース情報を取得します。
	 * 
	 * @param request DescribeResourceリクエスト
	 * @return DescribeResources実行結果
	 */
	public DescribeResourcesResult describeResources(DescribeResourcesRequest request);

	/**
	 * ニフティクラウドの稼働状況を取得します。
	 * 
	 * @param request DescribeServiceStatusリクエスト
	 * @return DescribeServiceStatus実行結果
	 */
	public DescribeServiceStatusResult describeServiceStatus(DescribeServiceStatusRequest request);

}
