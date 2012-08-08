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
 *  API Version: 1.9
 *  Date: 2011-11-29 14:07:10
 * 
 */
package com.nifty.cloud.sdk.usage;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import com.nifty.cloud.sdk.ClientConfiguration;
import com.nifty.cloud.sdk.auth.Credentials;
import com.nifty.cloud.sdk.usage.model.DescribeUsageRequest;
import com.nifty.cloud.sdk.usage.model.DescribeUsageResult;
import com.nifty.cloud.sdk.usage.model.DescribeUserActivitiesRequest;
import com.nifty.cloud.sdk.usage.model.DescribeUserActivitiesResult;

/**
 * NIFTY Cloud API 非同期クライアント　具象クラス。
 * 利用状況カテゴリ クライアント。<br />
 * 利用状況カテゴリの非同期クライアントの具象クラスです。<br />
 * 戻り値の"利用不可"パラメータは返却値がnullまたは空となります。
 */
public class NiftyUsageAsyncClient extends NiftyUsageClient implements NiftyUsageAsync {

	/** 非同期タスク実行クラス. */
	protected ExecutorService executorService = null;

	/** 
	 * 認証情報を指定し、利用状況カテゴリクライアントを構築します。
	 * 
	 * @param credential 認証情報
	 */
	public NiftyUsageAsyncClient(Credentials credential) {
		this(credential, Executors.newCachedThreadPool());
	}

	/** 
	 * 認証情報、クライアント設定を指定し、利用状況カテゴリクライアントを構築します。
	 * 
	 * @param credential 認証情報
	 * @param configuration クライアント設定
	 */
	public NiftyUsageAsyncClient(Credentials credential, ClientConfiguration configuration) {
		this(credential, configuration, Executors.newCachedThreadPool());
	}

	/** 
	 * 認証情報,非同期タスク実行クラスを指定し、利用状況カテゴリクライアントを構築します。
	 * 
	 * @param credential 認証情報	
	 * @param executorService 非同期タスク実行クラス
	 */
	public NiftyUsageAsyncClient(Credentials credential, ExecutorService executorService) {
		super(credential);
		this.executorService = executorService;
		
	}

	/** 
	 * 認証情報、クライアント設定,非同期タスク実行クラスを指定し、利用状況カテゴリクライアントを構築します。
	 * 
	 * @param credential 認証情報	
	 * @param configuration クライアント設定
	 * @param executorService 非同期タスク実行クラス
	 */
	public NiftyUsageAsyncClient(Credentials credential, ClientConfiguration configuration, ExecutorService executorService) {
		super(credential, configuration);
		this.executorService = executorService;
	}

	/*
	 * (non-Javadoc)
	 * @see com.nifty.cloud.sdk.usage.NiftyUsageAsync#describeUserActivitiesAsync
	 * (com.nifty.cloud.sdk.usage.model.DescribeUserActivitiesRequest)
	 */
	@Override
	public Future<DescribeUserActivitiesResult> describeUserActivitiesAsync(final DescribeUserActivitiesRequest request) {
		return executorService.submit(
				new Callable<DescribeUserActivitiesResult>() {
					@Override
					public DescribeUserActivitiesResult call() {
						return describeUserActivities(request);
					}
				}
		);
	}

	/*
	 * (non-Javadoc)
	 * @see com.nifty.cloud.sdk.usage.NiftyUsageAsync#describeUsageAsync
	 * (com.nifty.cloud.sdk.usage.model.DescribeUsageRequest)
	 */
	@Override
	public Future<DescribeUsageResult> describeUsageAsync(final DescribeUsageRequest request) {
		return executorService.submit(
				new Callable<DescribeUsageResult>() {
					@Override
					public DescribeUsageResult call() {
						return describeUsage(request);
					}
				}
		);
	}
}
