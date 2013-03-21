/******************************************************************************* 
 *  Copyright 2011 NIFTY Corporation All Rights Reserved.
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
 *  API Version: 1.11
 *  Date: 2012-02-20 10:57:31
 * 
 */
package com.nifty.cloud.sdk.misc;

import com.nifty.cloud.sdk.misc.model.DescribeAvailabilityZonesRequest;
import com.nifty.cloud.sdk.misc.model.DescribeAvailabilityZonesResult;
import com.nifty.cloud.sdk.misc.model.DescribeRegionsRequest;
import com.nifty.cloud.sdk.misc.model.DescribeRegionsResult;


/**
 * NIFTY Cloud API クライアント　インタフェース。
 * その他カテゴリ クライアント。<br />
 * その他カテゴリの同期クライアントのインタフェースです。
 */
public interface NiftyMisc {
	
	/**
	 * エンドポイントの設定を行います。
	 * 
	 * @param endpoint エンドポイント
	 */	
	public void setEndpoint(String endpoint);

	/**
	 * 利用可能なゾーン情報を取得します。
	 * 
	 * @param request DescribeAvailabilityZonesリクエスト
	 * @return DescribeAvailabilityZones処理結果
	 */
	public DescribeAvailabilityZonesResult describeAvailabilityZones(DescribeAvailabilityZonesRequest request);

	/**
	 * リージョン情報を取得します。
	 * @param request DescribeRegionsリクエスト<br />
	 * &nbsp;	DescribeRegionsRequest#filtersは利用不可
	 * @return DescribeRegions処理結果
	 */
	public DescribeRegionsResult describeRegions(DescribeRegionsRequest request);
}
