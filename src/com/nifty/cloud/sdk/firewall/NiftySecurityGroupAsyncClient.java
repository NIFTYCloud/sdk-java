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
 *  API Version: 1.14
 *  Date: 2013-03-28 17:00:00
 *
 */
package com.nifty.cloud.sdk.firewall;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import com.nifty.cloud.sdk.ClientConfiguration;
import com.nifty.cloud.sdk.auth.Credentials;
import com.nifty.cloud.sdk.firewall.model.AuthorizeSecurityGroupIngressRequest;
import com.nifty.cloud.sdk.firewall.model.AuthorizeSecurityGroupIngressResult;
import com.nifty.cloud.sdk.firewall.model.CreateSecurityGroupRequest;
import com.nifty.cloud.sdk.firewall.model.CreateSecurityGroupResult;
import com.nifty.cloud.sdk.firewall.model.DeleteSecurityGroupRequest;
import com.nifty.cloud.sdk.firewall.model.DeleteSecurityGroupResult;
import com.nifty.cloud.sdk.firewall.model.DeregisterInstancesFromSecurityGroupRequest;
import com.nifty.cloud.sdk.firewall.model.DeregisterInstancesFromSecurityGroupResult;
import com.nifty.cloud.sdk.firewall.model.DescribeSecurityActivitiesRequest;
import com.nifty.cloud.sdk.firewall.model.DescribeSecurityActivitiesResult;
import com.nifty.cloud.sdk.firewall.model.DescribeSecurityGroupOptionRequest;
import com.nifty.cloud.sdk.firewall.model.DescribeSecurityGroupOptionResult;
import com.nifty.cloud.sdk.firewall.model.DescribeSecurityGroupsRequest;
import com.nifty.cloud.sdk.firewall.model.DescribeSecurityGroupsResult;
import com.nifty.cloud.sdk.firewall.model.RegisterInstancesWithSecurityGroupRequest;
import com.nifty.cloud.sdk.firewall.model.RegisterInstancesWithSecurityGroupResult;
import com.nifty.cloud.sdk.firewall.model.RevokeSecurityGroupIngressRequest;
import com.nifty.cloud.sdk.firewall.model.RevokeSecurityGroupIngressResult;
import com.nifty.cloud.sdk.firewall.model.UpdateSecurityGroupOptionRequest;
import com.nifty.cloud.sdk.firewall.model.UpdateSecurityGroupOptionResult;
import com.nifty.cloud.sdk.firewall.model.UpdateSecurityGroupRequest;
import com.nifty.cloud.sdk.firewall.model.UpdateSecurityGroupResult;

/**
 * NIFTY Cloud API 非同期クライアント 具象クラス。
 * ファイアウォールカテゴリクライアント。<br />
 * ファイアウォールカテゴリの非同期クライアントの具象クラスです。<br />
 * 戻り値の"利用不可"パラメータは返却値がnullまたは空となります。
 *
 */
public class NiftySecurityGroupAsyncClient extends NiftySecurityGroupClient
		implements NiftySecurityGroupAsync {

	/** 非同期タスク実行クラス. */
	protected ExecutorService executorService = null;

	/**
	 * 認証情報を指定し、ファイアウォールカテゴリクライアントを構築します。
	 *
	 * @param credential 認証情報
	 */
	public NiftySecurityGroupAsyncClient(Credentials credential) {
		this(credential, Executors.newCachedThreadPool());
	}

	/**
	 * 認証情報、クライアント設定を指定し、ファイアウォールカテゴリクライアントを構築します。
	 * 
	 * @param credential 認証情報
	 * @param configuration クライアント設定
	 */
	public NiftySecurityGroupAsyncClient(Credentials credential,
			ClientConfiguration configuration) {
		this(credential, configuration, Executors.newCachedThreadPool());
	}

	/**
	 * 認証情報,非同期タスク実行クラスを指定し、ファイアウォールカテゴリクライアントを構築します。
	 *
	 * @param credential 認証情報
	 * @param executorService 非同期タスク実行クラス
	 */
	public NiftySecurityGroupAsyncClient(Credentials credential,
			ExecutorService executorService) {
		super(credential);
		this.executorService = executorService;

	}

	/**
	 * 認証情報、クライアント設定,非同期タスク実行クラスを指定し、ファイアウォールカテゴリクライアントを構築します。
	 *
	 * @param credential 認証情報
	 * @param configuration クライアント設定
	 * @param executorService 非同期タスク実行クラス
	 */
	public NiftySecurityGroupAsyncClient(Credentials credential,
			ClientConfiguration configuration, ExecutorService executorService) {
		super(credential, configuration);
		this.executorService = executorService;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * com.nifty.cloud.sdk.firewall.NiftySecurityGroupAsync#createSecurityGroupAsync
	 * (com.nifty.cloud.sdk.firewall.model.CreateSecurityGroupRequest)
	 */
	@Override
	public Future<CreateSecurityGroupResult> createSecurityGroupAsync(
			final CreateSecurityGroupRequest request) {
		return executorService.submit(new Callable<CreateSecurityGroupResult>() {
			@Override
			public CreateSecurityGroupResult call() {
				return createSecurityGroup(request);
			}
		});
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * com.nifty.cloud.sdk.firewall.NiftySecurityGroupAsync#deleteSecurityGroupAsync
	 * (com.nifty.cloud.sdk.firewall.model.DeleteSecurityGroupRequest)
	 */
	@Override
	public Future<DeleteSecurityGroupResult> deleteSecurityGroupAsync(
			final DeleteSecurityGroupRequest request) {
		return executorService.submit(new Callable<DeleteSecurityGroupResult>() {
			@Override
			public DeleteSecurityGroupResult call() {
				return deleteSecurityGroup(request);
			}
		});
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * com.nifty.cloud.sdk.firewall.NiftySecurityGroupAsync#updateSecurityGroupAsync
	 * (com.nifty.cloud.sdk.firewall.model.UpdateSecurityGroupRequest)
	 */
	@Override
	public Future<UpdateSecurityGroupResult> updateSecurityGroupAsync(
			final UpdateSecurityGroupRequest request) {
		return executorService.submit(new Callable<UpdateSecurityGroupResult>() {
			@Override
			public UpdateSecurityGroupResult call() {
				return updateSecurityGroup(request);
			}
		});
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * com.nifty.cloud.sdk.firewall.NiftySecurityGroupAsync#describeSecurityGroupsAsync
	 * (com.nifty.cloud.sdk.firewall.model.DescribeSecurityGroupsRequest)
	 */
	@Override
	public Future<DescribeSecurityGroupsResult> describeSecurityGroupsAsync(
			final DescribeSecurityGroupsRequest request) {
		return executorService.submit(new Callable<DescribeSecurityGroupsResult>() {
			@Override
			public DescribeSecurityGroupsResult call() {
				return describeSecurityGroups(request);
			}
		});
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see com.nifty.cloud.sdk.firewall.NiftySecurityGroupAsync#
	 * authorizeSecurityGroupIngressAsync
	 * (com.nifty.cloud.sdk.firewall.model.AuthorizeSecurityGroupIngressRequest)
	 */
	@Override
	public Future<AuthorizeSecurityGroupIngressResult> authorizeSecurityGroupIngressAsync(
			final AuthorizeSecurityGroupIngressRequest request) {
		return executorService.submit(new Callable<AuthorizeSecurityGroupIngressResult>() {
			@Override
			public AuthorizeSecurityGroupIngressResult call() {
				return authorizeSecurityGroupIngress(request);
			}
		});
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see com.nifty.cloud.sdk.firewall.NiftySecurityGroupAsync#
	 * revokeSecurityGroupIngressAsync
	 * (com.nifty.cloud.sdk.firewall.model.RevokeSecurityGroupIngressRequest)
	 */
	@Override
	public Future<RevokeSecurityGroupIngressResult> revokeSecurityGroupIngressAsync(
			final RevokeSecurityGroupIngressRequest request) {
		return executorService.submit(new Callable<RevokeSecurityGroupIngressResult>() {
			@Override
			public RevokeSecurityGroupIngressResult call() {
				return revokeSecurityGroupIngress(request);
			}
		});
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see com.nifty.cloud.sdk.firewall.NiftySecurityGroupAsync#
	 * registerInstancesWithSecurityGroupAsync
	 * (com.nifty.cloud.sdk.firewall.model.RegisterInstancesWithSecurityGroupRequest)
	 */
	@Override
	public Future<RegisterInstancesWithSecurityGroupResult> registerInstancesWithSecurityGroupAsync(
			final RegisterInstancesWithSecurityGroupRequest request) {
		return executorService.submit(new Callable<RegisterInstancesWithSecurityGroupResult>() {
			@Override
			public RegisterInstancesWithSecurityGroupResult call() {
				return registerInstancesWithSecurityGroup(request);
			}
		});
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see com.nifty.cloud.sdk.firewall.NiftySecurityGroupAsync#
	 * deregisterInstancesFromSecurityGroupAsync
	 * (com.nifty.cloud.sdk.firewall.model.DeregisterInstancesFromSecurityGroupRequest
	 * )
	 */
	@Override
	public Future<DeregisterInstancesFromSecurityGroupResult> deregisterInstancesFromSecurityGroupAsync(
			final DeregisterInstancesFromSecurityGroupRequest request) {
		return executorService.submit(new Callable<DeregisterInstancesFromSecurityGroupResult>() {
			@Override
			public DeregisterInstancesFromSecurityGroupResult call() {
				return deregisterInstancesFromSecurityGroup(request);
			}
		});
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see com.nifty.cloud.sdk.firewall.NiftySecurityGroupAsync#
	 * describeSecurityActivitiesAsync
	 * (com.nifty.cloud.sdk.firewall.model.DescribeSecurityActivitiesRequest)
	 */
	@Override
	public Future<DescribeSecurityActivitiesResult> describeSecurityActivitiesAsync(
			final DescribeSecurityActivitiesRequest request) {
		return executorService.submit(new Callable<DescribeSecurityActivitiesResult>() {
			@Override
			public DescribeSecurityActivitiesResult call() {
				return describeSecurityActivities(request);
			}
		});
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see com.nifty.cloud.sdk.firewall.NiftySecurityGroupAsync#
	 * updateSecurityGroupOptionAsync
	 * (com.nifty.cloud.sdk.firewall.model.UpdateSecurityGroupOptionRequest)
	 */
	@Override
	public Future<UpdateSecurityGroupOptionResult> updateSecurityGroupOptionAsync(
			final UpdateSecurityGroupOptionRequest request) {
		return executorService.submit(new Callable<UpdateSecurityGroupOptionResult>() {
			@Override
			public UpdateSecurityGroupOptionResult call() {
				return updateSecurityGroupOption(request);
			}
		});
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see com.nifty.cloud.sdk.firewall.NiftySecurityGroupAsync#
	 * describeSecurityGroupOptionAsync
	 * (com.nifty.cloud.sdk.firewall.model.DescribeSecurityGroupOptionRequest)
	 */
	@Override
	public Future<DescribeSecurityGroupOptionResult> describeSecurityGroupOptionAsync(
			final DescribeSecurityGroupOptionRequest request) {
		return executorService.submit(new Callable<DescribeSecurityGroupOptionResult>() {
			@Override
			public DescribeSecurityGroupOptionResult call() {
				return describeSecurityGroupOption(request);
			}
		});
	}
}