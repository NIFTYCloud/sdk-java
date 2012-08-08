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
 *  Date: 2011-08-25 09:46:38
 * 
 */
package com.nifty.cloud.sdk.security;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import com.nifty.cloud.sdk.ClientConfiguration;
import com.nifty.cloud.sdk.auth.Credentials;
import com.nifty.cloud.sdk.security.model.CreateKeyPairRequest;
import com.nifty.cloud.sdk.security.model.CreateKeyPairResult;
import com.nifty.cloud.sdk.security.model.DeleteKeyPairRequest;
import com.nifty.cloud.sdk.security.model.DeleteKeyPairResult;
import com.nifty.cloud.sdk.security.model.DescribeKeyPairsRequest;
import com.nifty.cloud.sdk.security.model.DescribeKeyPairsResult;

/**
 * NIFTY Cloud API 非同期クライアント 具象クラス。
 * セキュリティカテゴリクライアント。<br />
 * セキュリティ カテゴリの非同期クライアントの具象クラスです。
 * 
 */
public class NiftySecurityAsyncClient extends NiftySecurityClient implements NiftySecurityAsync {

	
	/** 非同期タスク実行クラス. */
	protected ExecutorService executorService = null;
	
	/**
	 * 認証情報を指定し、セキュリティカテゴリクライアントを構築します。
	 * 
	 * @param credential 認証情報
	 */
	public NiftySecurityAsyncClient(Credentials credential) {
		this(credential, Executors.newCachedThreadPool());
	}

	/**
	 * 認証情報、クライアント設定を指定し、セキュリティカテゴリクライアントを構築します。
	 * 
	 * @param credential 認証情報
	 * @param configuration クライアント設定
	 */
	public NiftySecurityAsyncClient(Credentials credential, ClientConfiguration configuration) {
		this(credential, configuration, Executors.newCachedThreadPool());
	}

	/**
	 * 認証情報,非同期タスク実行クラスを指定し、セキュリティカテゴリクライアントを構築します。
	 * 
	 * @param credential 認証情報	
	 * @param executorService 非同期タスク実行クラス
	 */
	public NiftySecurityAsyncClient(Credentials credential, ExecutorService executorService) {
		super(credential);
		this.executorService = executorService;
		
	}
	
	/**
	 * 認証情報、クライアント設定,非同期タスク実行クラスを指定し、セキュリティカテゴリクライアントを構築します。
	 * 
	 * @param credential 認証情報	
	 * @param configuration クライアント設定
	 * @param executorService 非同期タスク実行クラス
	 */
	public NiftySecurityAsyncClient(Credentials credential, ClientConfiguration configuration, ExecutorService executorService) {
		super(credential, configuration);
		this.executorService = executorService;
	}

	/*
	 * (non-Javadoc)
	 * @see com.nifty.cloud.sdk.security.NiftySecurityAsync#createKeyPairAsync(com.nifty.cloud.sdk.server.model.CreateImageRequest)
	 */
	@Override
	public Future<CreateKeyPairResult> createKeyPairAsync(final CreateKeyPairRequest request) {
		return executorService.submit( 
				new Callable<CreateKeyPairResult>() {
					@Override
					public CreateKeyPairResult call() {
						return createKeyPair(request);
					}
				}
		);
	}

	/*
	 * (non-Javadoc)
	 * @see com.nifty.cloud.sdk.security.NiftySecurityAsync#deleteKeyPairAsync(com.nifty.cloud.sdk.security.model.DeleteKeyPairRequest)
	 */
	@Override
	public Future<DeleteKeyPairResult> deleteKeyPairAsync(final DeleteKeyPairRequest request) {
		return executorService.submit( 
				new Callable<DeleteKeyPairResult>() {
					@Override
					public DeleteKeyPairResult call() {
						return deleteKeyPair(request);
					}
				}
		);
	}

	/*
	 * (non-Javadoc)
	 * @see com.nifty.cloud.sdk.security.NiftySecurityAsync#describeKeyPairsAsync(com.nifty.cloud.sdk.security.model.DescribeKeyPairRequest)
	 */
	@Override
	public Future<DescribeKeyPairsResult> describeKeyPairsAsync(final DescribeKeyPairsRequest request) {
		return executorService.submit( 
				new Callable<DescribeKeyPairsResult>() {
					@Override
					public DescribeKeyPairsResult call() {
						return describeKeyPairs(request);
					}
				}
		);
	}
	

}
