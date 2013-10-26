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
package com.nifty.cloud.sdk.server;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import com.nifty.cloud.sdk.ClientConfiguration;
import com.nifty.cloud.sdk.auth.Credentials;
import com.nifty.cloud.sdk.server.model.CancelCopyInstancesRequest;
import com.nifty.cloud.sdk.server.model.CancelCopyInstancesResult;
import com.nifty.cloud.sdk.server.model.CopyInstancesRequest;
import com.nifty.cloud.sdk.server.model.CopyInstancesResult;
import com.nifty.cloud.sdk.server.model.CreateImageRequest;
import com.nifty.cloud.sdk.server.model.CreateImageResult;
import com.nifty.cloud.sdk.server.model.DescribeInstanceAttributeRequest;
import com.nifty.cloud.sdk.server.model.DescribeInstanceAttributeResult;
import com.nifty.cloud.sdk.server.model.DescribeInstancesRequest;
import com.nifty.cloud.sdk.server.model.DescribeInstancesResult;
import com.nifty.cloud.sdk.server.model.ImportInstanceRequest;
import com.nifty.cloud.sdk.server.model.ImportInstanceResult;
import com.nifty.cloud.sdk.server.model.ModifyInstanceAttributeRequest;
import com.nifty.cloud.sdk.server.model.ModifyInstanceAttributeResult;
import com.nifty.cloud.sdk.server.model.RebootInstancesResult;
import com.nifty.cloud.sdk.server.model.RebootInstancesRequest;
import com.nifty.cloud.sdk.server.model.RunInstancesRequest;
import com.nifty.cloud.sdk.server.model.RunInstancesResult;
import com.nifty.cloud.sdk.server.model.StartInstancesRequest;
import com.nifty.cloud.sdk.server.model.StartInstancesResult;
import com.nifty.cloud.sdk.server.model.StopInstancesRequest;
import com.nifty.cloud.sdk.server.model.StopInstancesResult;
import com.nifty.cloud.sdk.server.model.TerminateInstancesRequest;
import com.nifty.cloud.sdk.server.model.TerminateInstancesResult;

/**
 * NIFTY Cloud API 非同期クライアント 具象クラス。
 * サーバーカテゴリクライアント。<br />
 * サーバーカテゴリの非同期クライアントの具象クラスです。<br />
 * 戻り値の"利用不可"パラメータは返却値がnullまたは空となります。
 * 
 */
public class NiftyServerAsyncClient extends NiftyServerClient implements NiftyServerAsync {

	
	/** 非同期タスク実行クラス. */
	protected ExecutorService executorService = null;
	
	/**
	 * 認証情報を指定し、サーバーカテゴリクライアントを構築します。
	 * 
	 * @param credential 認証情報
	 */
	public NiftyServerAsyncClient(Credentials credential) {
		this(credential, Executors.newCachedThreadPool());
	}

	/**
	 * 認証情報、クライアント設定を指定し、サーバーカテゴリクライアントを構築します。
	 * 
	 * @param credential 認証情報
	 * @param configuration クライアント設定
	 */
	public NiftyServerAsyncClient(Credentials credential, ClientConfiguration configuration) {
		this(credential, configuration, Executors.newCachedThreadPool());
	}

	/**
	 * 認証情報,非同期タスク実行クラスを指定し、サーバーカテゴリクライアントを構築します。
	 * 
	 * @param credential 認証情報	
	 * @param executorService 非同期タスク実行クラス
	 */
	public NiftyServerAsyncClient(Credentials credential, ExecutorService executorService) {
		super(credential);
		this.executorService = executorService;
		
	}
	
	/**
	 * 認証情報、クライアント設定,非同期タスク実行クラスを指定し、サーバーカテゴリクライアントを構築します。
	 * 
	 * @param credential 認証情報	
	 * @param configuration クライアント設定
	 * @param executorService 非同期タスク実行クラス
	 */
	public NiftyServerAsyncClient(Credentials credential, ClientConfiguration configuration, ExecutorService executorService) {
		super(credential, configuration);
		this.executorService = executorService;
	}
	
	/**
	 * @see com.nifty.cloud.sdk.server.NiftyServerAsync#cancelCopyInstancesAsync(CancelCopyInstancesRequest)
	 */
	@Override
	public Future<CancelCopyInstancesResult> cancelCopyInstancesAsync(final CancelCopyInstancesRequest request) {
		return executorService.submit( 
				new Callable<CancelCopyInstancesResult>() {
					@Override
					public CancelCopyInstancesResult call() {
						return cancelCopyInstances(request);
					}
				}
		);
	}
	
	/**
	 * @see com.nifty.cloud.sdk.server.NiftyServerAsync#copyInstancesAsync(CopyInstancesRequest)
	 */
	@Override
	public Future<CopyInstancesResult> copyInstancesAsync(final CopyInstancesRequest request) {
		return executorService.submit( 
				new Callable<CopyInstancesResult>() {
					@Override
					public CopyInstancesResult call() {
						return copyInstances(request);
					}
				}
		);
	}

	/**
	 * @see com.nifty.cloud.sdk.server.NiftyServerAsync#describeInstanceAttributeAsync(DescribeInstanceAttributeRequest)
	 */
	@Override
	public Future<CreateImageResult> createImageAsync(final CreateImageRequest request) {
		return executorService.submit( 
				new Callable<CreateImageResult>() {
					@Override
					public CreateImageResult call() {
						return createImage(request);
					}
				}
		);
	}
	
	/**
	 * @see com.nifty.cloud.sdk.server.NiftyServerAsync#describeInstanceAttributeAsync(DescribeInstanceAttributeRequest)
	 */
	@Override
	public Future<DescribeInstanceAttributeResult> describeInstanceAttributeAsync(final DescribeInstanceAttributeRequest request) {
		return executorService.submit( 
				new Callable<DescribeInstanceAttributeResult>() {
					@Override
					public DescribeInstanceAttributeResult call() {
						return describeInstanceAttribute(request);
					}
				}
		);
	} 


	/**
	 * @see com.nifty.cloud.sdk.server.NiftyServerAsync#describeInstanceAttributeAsync(DescribeInstanceAttributeRequest)
	 */
	@Override
	public Future<DescribeInstancesResult> describeInstancesAsync(final DescribeInstancesRequest request) {
		return executorService.submit( 
				new Callable<DescribeInstancesResult>() {
					@Override
					public DescribeInstancesResult call() {
						return describeInstances(request);
					}
				}
		);
	} 

	/**
	 * @see com.nifty.cloud.sdk.server.NiftyServerAsync#modifyInstanceAttributeAsync(ModifyInstanceAttributeRequest)
	 */
	@Override
	public Future<ModifyInstanceAttributeResult> modifyInstanceAttributeAsync(final ModifyInstanceAttributeRequest request) {
		return executorService.submit( 
			new Callable<ModifyInstanceAttributeResult>() {
				@Override
				public ModifyInstanceAttributeResult call() {
					return modifyInstanceAttribute(request);
				}
			}
		);
	} 

	/**
	 * @see com.nifty.cloud.sdk.server.NiftyServerAsync#rebootInstancesAsync(RebootInstancesRequest)
	 */
	@Override
	public Future<RebootInstancesResult> rebootInstancesAsync(final RebootInstancesRequest request) {
		return executorService.submit( 
				new Callable<RebootInstancesResult>() {
					@Override
					public RebootInstancesResult call() {
						return rebootInstances(request);
					}
				}
			);
	}

	/**
	 * @see com.nifty.cloud.sdk.server.NiftyServerAsync#runInstancesAsync(RunInstancesRequest)
	 */
	@Override
	public Future<RunInstancesResult> runInstancesAsync(final RunInstancesRequest request) {
		return executorService.submit( 
				new Callable<RunInstancesResult>() {
					@Override
					public RunInstancesResult call() {
						return runInstances(request);
					}
				}
			);
	}
	
	/**
	 * @see com.nifty.cloud.sdk.server.NiftyServerAsync#startInstancesAsync(StartInstancesRequest)
	 */
	@Override
	public Future<StartInstancesResult> startInstancesAsync(final StartInstancesRequest request) {
		return executorService.submit( 
				new Callable<StartInstancesResult>() {
					@Override
					public StartInstancesResult call() {
						return startInstances(request);
					}
				}
			);
	}

	/**
	 * @see com.nifty.cloud.sdk.server.NiftyServerAsync#startInstancesAsync(StartInstancesRequest)
	 */
	@Override
	public Future<StopInstancesResult> stopInstancesAsync(final StopInstancesRequest request) {
		return executorService.submit( 
				new Callable<StopInstancesResult>() {
					@Override
					public StopInstancesResult call() {
						return stopInstances(request);
					}
				}
			);
	}
	
	/**
	 * @see com.nifty.cloud.sdk.server.NiftyServerAsync#terminateInstancesAsync(TerminateInstancesRequest)
	 */
	@Override
	public Future<TerminateInstancesResult> terminateInstancesAsync(final TerminateInstancesRequest request) {
		return executorService.submit( 
				new Callable<TerminateInstancesResult>() {
					@Override
					public TerminateInstancesResult call() {
						return terminateInstances(request);
					}
				}
			);
	}

	@Override
	public Future<ImportInstanceResult> importInstanceAsync(final ImportInstanceRequest request) {
		return executorService.submit( 
			new Callable<ImportInstanceResult>() {
				@Override
				public ImportInstanceResult call() {
					return importInstance(request);
				}
			}
		);
	}

	
}
