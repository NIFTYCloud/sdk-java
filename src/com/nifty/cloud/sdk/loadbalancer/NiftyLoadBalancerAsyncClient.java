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
package com.nifty.cloud.sdk.loadbalancer;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import com.nifty.cloud.sdk.ClientConfiguration;
import com.nifty.cloud.sdk.auth.Credentials;
import com.nifty.cloud.sdk.loadbalancer.model.ClearLoadBalancerSessionRequest;
import com.nifty.cloud.sdk.loadbalancer.model.ClearLoadBalancerSessionResult;
import com.nifty.cloud.sdk.loadbalancer.model.ConfigureHealthCheckRequest;
import com.nifty.cloud.sdk.loadbalancer.model.ConfigureHealthCheckResult;
import com.nifty.cloud.sdk.loadbalancer.model.CreateLoadBalancerRequest;
import com.nifty.cloud.sdk.loadbalancer.model.CreateLoadBalancerResult;
import com.nifty.cloud.sdk.loadbalancer.model.DeleteLoadBalancerRequest;
import com.nifty.cloud.sdk.loadbalancer.model.DeleteLoadBalancerResult;
import com.nifty.cloud.sdk.loadbalancer.model.DeregisterInstancesFromLoadBalancerRequest;
import com.nifty.cloud.sdk.loadbalancer.model.DeregisterInstancesFromLoadBalancerResult;
import com.nifty.cloud.sdk.loadbalancer.model.DescribeInstanceHealthRequest;
import com.nifty.cloud.sdk.loadbalancer.model.DescribeInstanceHealthResult;
import com.nifty.cloud.sdk.loadbalancer.model.DescribeLoadBalancersRequest;
import com.nifty.cloud.sdk.loadbalancer.model.DescribeLoadBalancersResult;
import com.nifty.cloud.sdk.loadbalancer.model.RegisterInstancesWithLoadBalancerRequest;
import com.nifty.cloud.sdk.loadbalancer.model.RegisterInstancesWithLoadBalancerResult;
import com.nifty.cloud.sdk.loadbalancer.model.RegisterPortWithLoadBalancerRequest;
import com.nifty.cloud.sdk.loadbalancer.model.RegisterPortWithLoadBalancerResult;
import com.nifty.cloud.sdk.loadbalancer.model.SetFilterForLoadBalancerRequest;
import com.nifty.cloud.sdk.loadbalancer.model.SetFilterForLoadBalancerResult;
import com.nifty.cloud.sdk.loadbalancer.model.SetLoadBalancerListenerSSLCertificateRequest;
import com.nifty.cloud.sdk.loadbalancer.model.SetLoadBalancerListenerSSLCertificateResult;
import com.nifty.cloud.sdk.loadbalancer.model.UnsetLoadBalancerListenerSSLCertificateRequest;
import com.nifty.cloud.sdk.loadbalancer.model.UnsetLoadBalancerListenerSSLCertificateResult;
import com.nifty.cloud.sdk.loadbalancer.model.UpdateLoadBalancerOptionRequest;
import com.nifty.cloud.sdk.loadbalancer.model.UpdateLoadBalancerOptionResult;
import com.nifty.cloud.sdk.loadbalancer.model.UpdateLoadBalancerRequest;
import com.nifty.cloud.sdk.loadbalancer.model.UpdateLoadBalancerResult;

/**
 * NIFTY Cloud API 非同期クライアント 具象クラス。
 * ネットワークカテゴリクライアント。<br />
 * ネットワークカテゴリの非同期クライアントの具象クラスです。<br />
 * 戻り値の"利用不可"パラメータは返却値がnullまたは空となります。
 */
public class NiftyLoadBalancerAsyncClient extends NiftyLoadBalancerClient implements NiftyLoadBalancerAsync {

	
	/** 非同期タスク実行クラス. */
	protected ExecutorService executorService = null;
	
	/** 
	 * 認証情報を指定し、ネットワークカテゴリクライアントを構築します。
	 * 
	 * @param credential 認証情報
	 */
	public NiftyLoadBalancerAsyncClient(Credentials credential) {
		this(credential, Executors.newCachedThreadPool());
	}

	/** 
	 * 認証情報、クライアント設定を指定し、ネットワークカテゴリクライアントを構築します。
	 * 
	 * @param credential 認証情報
	 * @param configuration クライアント設定
	 */
	public NiftyLoadBalancerAsyncClient(Credentials credential, ClientConfiguration configuration) {
		this(credential, configuration, Executors.newCachedThreadPool());
	}

	/** 
	 * 認証情報,非同期タスク実行クラスを指定し、ネットワークカテゴリクライアントを構築します。
	 * 
	 * @param credential 認証情報	
	 * @param executorService 非同期タスク実行クラス
	 */
	public NiftyLoadBalancerAsyncClient(Credentials credential, ExecutorService executorService) {
		super(credential);
		this.executorService = executorService;
		
	}
	
	/** 
	 * 認証情報、クライアント設定,非同期タスク実行クラスを指定し、ネットワークカテゴリクライアントを構築します。
	 * 
	 * @param credential 認証情報	
	 * @param configuration クライアント設定
	 * @param executorService 非同期タスク実行クラス
	 */
	public NiftyLoadBalancerAsyncClient(Credentials credential, ClientConfiguration configuration, ExecutorService executorService) {
		super(credential, configuration);
		this.executorService = executorService;
	}
	
	
	/*
	 * (non-Javadoc)
	 * @see com.nifty.cloud.sdk.loadbalancer.NiftyLoadBalancerAsync#configureHealthCheckAsync(com.nifty.cloud.sdk.loadbalancer.model.ConfigureHealthCheckRequest)
	 */
	@Override
	public Future<ConfigureHealthCheckResult> configureHealthCheckAsync(final ConfigureHealthCheckRequest request) {
		return executorService.submit( 
				new Callable<ConfigureHealthCheckResult>() {
					@Override
					public ConfigureHealthCheckResult call() {
						return configureHealthCheck(request);
					}
				}
		);
	}

	/*
	 * (non-Javadoc)
	 * @see com.nifty.cloud.sdk.loadbalancer.NiftyLoadBalancerAsync#createLoadBalancerAsync(com.nifty.cloud.sdk.loadbalancer.model.CreateLoadBalancerRequest)
	 */
	@Override
	public Future<CreateLoadBalancerResult> createLoadBalancerAsync(final CreateLoadBalancerRequest request) {
		return executorService.submit( 
				new Callable<CreateLoadBalancerResult>() {
					@Override
					public CreateLoadBalancerResult call() {
						return createLoadBalancer(request);
					}
				}
		);
	}

	/*
	 * (non-Javadoc)
	 * @see com.nifty.cloud.sdk.loadbalancer.NiftyLoadBalancerAsync#deleteLoadBalancerAsync(com.nifty.cloud.sdk.loadbalancer.model.DeleteLoadBalancerRequest)
	 */
	@Override
	public Future<DeleteLoadBalancerResult> deleteLoadBalancerAsync(final DeleteLoadBalancerRequest request) {
		return executorService.submit( 
				new Callable<DeleteLoadBalancerResult>() {
					@Override
					public DeleteLoadBalancerResult call() {
						return deleteLoadBalancer(request);
					}
				}
		);
	}

	/*
	 * (non-Javadoc)
	 * @see com.nifty.cloud.sdk.loadbalancer.NiftyLoadBalancerAsync#deregisterInstancesFromLoadBalancerAsync(com.nifty.cloud.sdk.loadbalancer.model.DeregisterInstanceWithLoadBalancerRequest)
	 */
	@Override
	public Future<DeregisterInstancesFromLoadBalancerResult> deregisterInstancesFromLoadBalancerAsync(final DeregisterInstancesFromLoadBalancerRequest request) {
		return executorService.submit( 
				new Callable<DeregisterInstancesFromLoadBalancerResult>() {
					@Override
					public DeregisterInstancesFromLoadBalancerResult call() {
						return deregisterInstancesFromLoadBalancer(request);
					}
				}
		);
	}

	/*
	 * (non-Javadoc)
	 * @see com.nifty.cloud.sdk.loadbalancer.NiftyLoadBalancerAsync#describeInstanceHealthAsync(com.nifty.cloud.sdk.loadbalancer.model.DescribeInstanceHealthRequest)
	 */
	@Override
	public Future<DescribeInstanceHealthResult> describeInstanceHealthAsync(final DescribeInstanceHealthRequest request) {
		return executorService.submit( 
				new Callable<DescribeInstanceHealthResult>() {
					@Override
					public DescribeInstanceHealthResult call() {
						return describeInstanceHealth(request);
					}
				}
		);
	}

	/*
	 * (non-Javadoc)
	 * @see com.nifty.cloud.sdk.loadbalancer.NiftyLoadBalancerAsync#describeLoadBalancersAsync(com.nifty.cloud.sdk.loadbalancer.model.DescribeLoadBalancersRequest)
	 */
	@Override
	public Future<DescribeLoadBalancersResult> describeLoadBalancersAsync(final DescribeLoadBalancersRequest request) {
		return executorService.submit( 
				new Callable<DescribeLoadBalancersResult>() {
					@Override
					public DescribeLoadBalancersResult call() {
						return describeLoadBalancers(request);
					}
				}
		);
	}

	/*
	 * (non-Javadoc)
	 * @see com.nifty.cloud.sdk.loadbalancer.NiftyLoadBalancerAsync#registerInstancesWithLoadBalancerAsync(com.nifty.cloud.sdk.loadbalancer.model.RegisterInstancesWithLoadBalancerRequest)
	 */
	@Override
	public Future<RegisterInstancesWithLoadBalancerResult> registerInstancesWithLoadBalancerAsync(final RegisterInstancesWithLoadBalancerRequest request) {
		return executorService.submit( 
				new Callable<RegisterInstancesWithLoadBalancerResult>() {
					@Override
					public RegisterInstancesWithLoadBalancerResult call() {
						return registerInstancesWithLoadBalancer(request);
					}
				}
		);
	}
	
	/*
	 * (non-Javadoc)
	 * @see com.nifty.cloud.sdk.loadbalancer.NiftyLoadBalancerAsync#registerPortWithLoadBalancerAsync(com.nifty.cloud.sdk.loadbalancer.model.RegisterPortWithLoadBalancerRequest)
	 */
	@Override
	public Future<RegisterPortWithLoadBalancerResult> registerPortWithLoadBalancerAsync(final RegisterPortWithLoadBalancerRequest request) {
		return executorService.submit( 
				new Callable<RegisterPortWithLoadBalancerResult>() {
					@Override
					public RegisterPortWithLoadBalancerResult call() {
						return registerPortWithLoadBalancer(request);
					}
				}
		);
	}

	/*
	 * (non-Javadoc)
	 * @see com.nifty.cloud.sdk.loadbalancer.NiftyLoadBalancerAsync#setFilterForLoadBalancerAsync(com.nifty.cloud.sdk.loadbalancer.model.SetFilterForLoadBalancerRequest)
	 */
	@Override
	public Future<SetFilterForLoadBalancerResult> setFilterForLoadBalancerAsync(final SetFilterForLoadBalancerRequest request) {
		return executorService.submit( 
				new Callable<SetFilterForLoadBalancerResult>() {
					@Override
					public SetFilterForLoadBalancerResult call() {
						return setFilterForLoadBalancer(request);
					}
				}
		);
	} 
	
	/*
	 * (non-Javadoc)
	 * @see com.nifty.cloud.sdk.loadbalancer.NiftyLoadBalancerAsync#updateLoadBalancerAsync(com.nifty.cloud.sdk.loadbalancer.model.UpdateLoadBalancerRequest)
	 */
	@Override
	public Future<UpdateLoadBalancerResult> updateLoadBalancerAsync(final UpdateLoadBalancerRequest request) {
		return executorService.submit( 
				new Callable<UpdateLoadBalancerResult>() {
					@Override
					public UpdateLoadBalancerResult call() {
						return updateLoadBalancer(request);
					}
				}
		);
	}

	/*
	 * (non-Javadoc)
	 * @see com.nifty.cloud.sdk.loadbalancer.NiftyLoadBalancerAsync#updateLoadBalancerOptionAsync(com.nifty.cloud.sdk.loadbalancer.model.UpdateLoadBalancerOptionRequest)
	 */
	@Override
	public Future<UpdateLoadBalancerOptionResult> updateLoadBalancerOptionAsync(final UpdateLoadBalancerOptionRequest request) {
		return executorService.submit( 
				new Callable<UpdateLoadBalancerOptionResult>() {
					@Override
					public UpdateLoadBalancerOptionResult call() {
						return updateLoadBalancerOption(request);
					}
				}
		);
	}

	/*
	 * (non-Javadoc)
	 * @see com.nifty.cloud.sdk.loadbalancer.NiftyLoadBalancerAsync#setLoadBalancerListenerSSLCertificateAsync(com.nifty.cloud.sdk.loadbalancer.model.SetLoadBalancerListenerSSLCertificateRequest)
	 */
	@Override
	public Future<SetLoadBalancerListenerSSLCertificateResult> setLoadBalancerListenerSSLCertificateAsync(final SetLoadBalancerListenerSSLCertificateRequest request) {
		return executorService.submit( 
				new Callable<SetLoadBalancerListenerSSLCertificateResult>() {
					@Override
					public SetLoadBalancerListenerSSLCertificateResult call() {
						return setLoadBalancerListenerSSLCertificate(request);
					}
				}
		);
	}

	/*
	 * (non-Javadoc)
	 * @see com.nifty.cloud.sdk.loadbalancer.NiftyLoadBalancerAsync#unsetLoadBalancerListenerSSLCertificateAsync(com.nifty.cloud.sdk.loadbalancer.model.UnsetLoadBalancerListenerSSLCertificateRequest)
	 */
	@Override
	public Future<UnsetLoadBalancerListenerSSLCertificateResult> unsetLoadBalancerListenerSSLCertificateAsync(final UnsetLoadBalancerListenerSSLCertificateRequest request) {
		return executorService.submit( 
				new Callable<UnsetLoadBalancerListenerSSLCertificateResult>() {
					@Override
					public UnsetLoadBalancerListenerSSLCertificateResult call() {
						return unsetLoadBalancerListenerSSLCertificate(request);
					}
				}
		);
	}

	/*
	 * (non-Javadoc)
	 * @see com.nifty.cloud.sdk.loadbalancer.NiftyLoadBalancerAsync#clearLoadBalancerSessionAsync(com.nifty.cloud.sdk.loadbalancer.model.ClearLoadBalancerSessionRequest)
	 */
	@Override
	public Future<ClearLoadBalancerSessionResult> clearLoadBalancerSessionAsync(final ClearLoadBalancerSessionRequest request) {
		return executorService.submit( 
				new Callable<ClearLoadBalancerSessionResult>() {
					@Override
					public ClearLoadBalancerSessionResult call() {
						return clearLoadBalancerSession(request);
					}
				}
		);
	}

}
