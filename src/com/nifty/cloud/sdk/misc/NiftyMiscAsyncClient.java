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
package com.nifty.cloud.sdk.misc;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import com.nifty.cloud.sdk.ClientConfiguration;
import com.nifty.cloud.sdk.auth.Credentials;
import com.nifty.cloud.sdk.misc.model.AssociateUsersRequest;
import com.nifty.cloud.sdk.misc.model.AssociateUsersResult;
import com.nifty.cloud.sdk.misc.model.DescribeAssociatedUsersRequest;
import com.nifty.cloud.sdk.misc.model.DescribeAssociatedUsersResult;
import com.nifty.cloud.sdk.misc.model.DescribeAvailabilityZonesRequest;
import com.nifty.cloud.sdk.misc.model.DescribeAvailabilityZonesResult;
import com.nifty.cloud.sdk.misc.model.DescribeRegionsRequest;
import com.nifty.cloud.sdk.misc.model.DescribeRegionsResult;
import com.nifty.cloud.sdk.misc.model.DissociateUsersRequest;
import com.nifty.cloud.sdk.misc.model.DissociateUsersResult;
import com.nifty.cloud.sdk.misc.model.NiftyDescribePerformanceChartRequest;
import com.nifty.cloud.sdk.misc.model.NiftyDescribePerformanceChartResult;

/**
 * NIFTY Cloud API 非同期クライアント 具象クラス。
 * その他カテゴリクライアント。<br />
 * その他カテゴリの非同期クライアントの具象クラスです。
 */
public class NiftyMiscAsyncClient extends NiftyMiscClient implements NiftyMiscAsync {


	/** 非同期タスク実行クラス. */
	protected ExecutorService executorService = null;

	/**
	 * 認証情報を指定し、その他カテゴリクライアントを構築します。
	 *
	 * @param credential 認証情報
	 */
	public NiftyMiscAsyncClient(Credentials credential) {
		this(credential, Executors.newCachedThreadPool());
	}

	/**
	 * 認証情報、クライアント設定を指定し、その他カテゴリクライアントを構築します。
	 *
	 * @param credential 認証情報
	 * @param configuration クライアント設定
	 */
	public NiftyMiscAsyncClient(Credentials credential, ClientConfiguration configuration) {
		this(credential, configuration, Executors.newCachedThreadPool());
	}

	/**
	 * 認証情報,非同期タスク実行クラスを指定し、その他カテゴリクライアントを構築します。
	 *
	 * @param credential 認証情報
	 * @param executorService 非同期タスク実行クラス
	 */
	public NiftyMiscAsyncClient(Credentials credential, ExecutorService executorService) {
		super(credential);
		this.executorService = executorService;

	}

	/**
	 * 認証情報、クライアント設定,非同期タスク実行クラスを指定し、その他カテゴリクライアントを構築します。
	 *
	 * @param credential 認証情報
	 * @param configuration クライアント設定
	 * @param executorService 非同期タスク実行クラス
	 */
	public NiftyMiscAsyncClient(Credentials credential, ClientConfiguration configuration, ExecutorService executorService) {
		super(credential, configuration);
		this.executorService = executorService;
	}

	/**
	 * @see com.nifty.cloud.sdk.misc.NiftyMiscAsync#describeAvailabilityZonesAsync(DescribeAvailabilityZonesRequest)
	 */
	@Override
	public Future<DescribeAvailabilityZonesResult> describeAvailabilityZonesAsync(final DescribeAvailabilityZonesRequest request) {
		return executorService.submit(
				new Callable<DescribeAvailabilityZonesResult>() {
					@Override
					public DescribeAvailabilityZonesResult call() {
						return describeAvailabilityZones(request);
					}
				}
		);
	}

	/**
	 * @see com.nifty.cloud.sdk.misc.NiftyMiscAsync#describeRegionsAsync(DescribeRegionsRequest)
	 */
	@Override
	public Future<DescribeRegionsResult> describeRegionsAsync(final DescribeRegionsRequest request) {
		return executorService.submit(
				new Callable<DescribeRegionsResult>() {
					@Override
					public DescribeRegionsResult call() {
						return describeRegions(request);
					}
				}
		);
	}

	/**
	 * @see com.nifty.cloud.sdk.misc.NiftyMiscAsync#associateUsersAsync(AssociateUsersRequest)
	 */
	@Override
	public Future<AssociateUsersResult> associateUsersAsync(final AssociateUsersRequest request) {
		return executorService.submit(
				new Callable<AssociateUsersResult>() {
					@Override
					public AssociateUsersResult call() {
						return associateUsers(request);
					}
				}
		);
	}

	/**
	 * @see com.nifty.cloud.sdk.misc.NiftyMiscAsync#dissociateUsersAsync(DissociateUsersRequest)
	 */
	@Override
	public Future<DissociateUsersResult> dissociateUsersAsync(final DissociateUsersRequest request) {
		return executorService.submit(
				new Callable<DissociateUsersResult>() {
					@Override
					public DissociateUsersResult call() {
						return dissociateUsers(request);
					}
				}
		);
	}

	/**
	 * @see com.nifty.cloud.sdk.misc.NiftyMiscAsync#describeAssociatedUsersAsync(DescribeAssociatedUsersRequest)
	 */
	@Override
	public Future<DescribeAssociatedUsersResult> describeAssociatedUsersAsync(final DescribeAssociatedUsersRequest request) {
		return executorService.submit(
				new Callable<DescribeAssociatedUsersResult>() {
					@Override
					public DescribeAssociatedUsersResult call() {
						return describeAssociatedUsers(request);
					}
				}
		);
	}

	/**
	 * @see com.nifty.cloud.sdk.misc.NiftyMiscAsync#niftyDescribePerformanceChartAsync(NiftyDescribePerformanceChartRequest)
	 */
	@Override
	public Future<NiftyDescribePerformanceChartResult> niftyDescribePerformanceChartAsync(final NiftyDescribePerformanceChartRequest request) {
		return executorService.submit(
				new Callable<NiftyDescribePerformanceChartResult>() {
					@Override
					public NiftyDescribePerformanceChartResult call() {
						return niftyDescribePerformanceChart(request);
					}
				}
		);
	}
}
