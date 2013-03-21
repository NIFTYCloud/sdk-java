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
package com.nifty.cloud.sdk.dashboard;

import com.nifty.cloud.sdk.BaseClient;
import com.nifty.cloud.sdk.ClientConfiguration;
import com.nifty.cloud.sdk.auth.Credentials;
import com.nifty.cloud.sdk.dashboard.model.DescribeResourcesRequest;
import com.nifty.cloud.sdk.dashboard.model.DescribeResourcesResult;
import com.nifty.cloud.sdk.dashboard.model.DescribeServiceStatusRequest;
import com.nifty.cloud.sdk.dashboard.model.DescribeServiceStatusResult;

/**
 * NIFTY Cloud API クライアント　具象クラス。
 * ダッシュボードカテゴリ クライアント。<br />
 * ダッシュボードカテゴリの同期クライアントの具象クラスです。<br />
 * 戻り値の"利用不可"パラメータは返却値がnullまたは空となります。
 */
public class NiftyDashboardClient extends BaseClient implements NiftyDashboard {

	/** 
	 * 認証情報を指定し、ダッシュボードカテゴリクライアントを構築します。
	 * 
	 * @param credential 認証情報
	 */
	public NiftyDashboardClient(Credentials credential) {
		super(credential, new ClientConfiguration());
	}

	/** 
	 * 認証情報、クライアント設定を指定し、ダッシュボードカテゴリクライアントを構築します。
	 * 
	 * @param credential 認証情報
	 * @param configuration クライアント設定
	 */
	public NiftyDashboardClient(Credentials credential, ClientConfiguration configuration) {
		super(credential, configuration);
	}

	/*
	 * (non-Javadoc)
	 * @see com.nifty.cloud.sdk.dashboard.NiftyDashBoard#describeResources
	 * (com.nifty.cloud.sdk.dashboard.model.DescribeResourcesRequest)
	 */
	@Override
	public DescribeResourcesResult describeResources(DescribeResourcesRequest request) {
		return (DescribeResourcesResult) client.execute(request, DescribeResourcesResult.class);
	}

	/*
	 * (non-Javadoc)
	 * @see com.nifty.cloud.sdk.dashboard.NiftyDashBoard#describeServiceStatus
	 * (com.nifty.cloud.sdk.dashboard.model.DescribeServiceStatusRequest)
	 */
	@Override
	public DescribeServiceStatusResult describeServiceStatus(DescribeServiceStatusRequest request) {
		return (DescribeServiceStatusResult) client.execute(request, DescribeServiceStatusResult.class);
	}
}
