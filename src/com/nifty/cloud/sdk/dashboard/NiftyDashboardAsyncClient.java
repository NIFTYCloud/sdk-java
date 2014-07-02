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
 *  API Version: 1.18
 *  Date: 2014-05-23 17:00:00
 * 
 */
package com.nifty.cloud.sdk.dashboard;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import com.nifty.cloud.sdk.ClientConfiguration;
import com.nifty.cloud.sdk.auth.Credentials;
import com.nifty.cloud.sdk.dashboard.model.DescribeResourcesRequest;
import com.nifty.cloud.sdk.dashboard.model.DescribeResourcesResult;
import com.nifty.cloud.sdk.dashboard.model.DescribeServiceStatusRequest;
import com.nifty.cloud.sdk.dashboard.model.DescribeServiceStatusResult;

/**
 * NIFTY Cloud API 非同期クライアント　具象クラス。
 * ダッシュボードカテゴリ クライアント。<br />
 * ダッシュボードカテゴリの非同期クライアントの具象クラスです。<br />
 * 戻り値の"利用不可"パラメータは返却値がnullまたは空となります。
 */
public class NiftyDashboardAsyncClient extends NiftyDashboardClient implements NiftyDashboardAsync {

	/** 非同期タスク実行クラス. */
	protected ExecutorService executorService = null;

	/** 
	 * 認証情報を指定し、ダッシュボードカテゴリクライアントを構築します。
	 * 
	 * @param credential 認証情報
	 */
	public NiftyDashboardAsyncClient(Credentials credential) {
		this(credential, Executors.newCachedThreadPool());
	}

	/** 
	 * 認証情報、クライアント設定を指定し、ダッシュボードカテゴリクライアントを構築します。
	 * 
	 * @param credential 認証情報
	 * @param configuration クライアント設定
	 */
	public NiftyDashboardAsyncClient(Credentials credential, ClientConfiguration configuration) {
		this(credential, configuration, Executors.newCachedThreadPool());
	}

	/** 
	 * 認証情報,非同期タスク実行クラスを指定し、ダッシュボードカテゴリクライアントを構築します。
	 * 
	 * @param credential 認証情報	
	 * @param executorService 非同期タスク実行クラス
	 */
	public NiftyDashboardAsyncClient(Credentials credential, ExecutorService executorService) {
		super(credential);
		this.executorService = executorService;
		
	}

	/** 
	 * 認証情報、クライアント設定,非同期タスク実行クラスを指定し、ダッシュボードカテゴリクライアントを構築します。
	 * 
	 * @param credential 認証情報	
	 * @param configuration クライアント設定
	 * @param executorService 非同期タスク実行クラス
	 */
	public NiftyDashboardAsyncClient(Credentials credential, ClientConfiguration configuration, ExecutorService executorService) {
		super(credential, configuration);
		this.executorService = executorService;
	}

	/*
	 * (non-Javadoc)
	 * @see com.nifty.cloud.sdk.dashboard.NiftyDashBoardAsync#describeResourcesAsync
	 * (com.nifty.cloud.sdk.dashboard.model.DescribeResourcesRequest)
	 */
	@Override
	public Future<DescribeResourcesResult> describeResourcesAsync(final DescribeResourcesRequest request) {
		return executorService.submit(
				new Callable<DescribeResourcesResult>() {
					@Override
					public DescribeResourcesResult call() {
						return describeResources(request);
					}
				}
		);
	}

	/*
	 * (non-Javadoc)
	 * @see com.nifty.cloud.sdk.dashboard.NiftyDashBoardAsync#describeServiceStatusAsync
	 * (com.nifty.cloud.sdk.dashboard.model.DescribeServiceStatusRequest)
	 */
	@Override
	public Future<DescribeServiceStatusResult> describeServiceStatusAsync(final DescribeServiceStatusRequest request) {
		return executorService.submit(
				new Callable<DescribeServiceStatusResult>() {
					@Override
					public DescribeServiceStatusResult call() {
						return describeServiceStatus(request);
					}
				}
		);
	}
}
