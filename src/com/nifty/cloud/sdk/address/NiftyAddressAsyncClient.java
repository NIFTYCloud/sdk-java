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
package com.nifty.cloud.sdk.address;


import java.util.concurrent.Callable;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import com.nifty.cloud.sdk.ClientConfiguration;
import com.nifty.cloud.sdk.auth.Credentials;
import com.nifty.cloud.sdk.address.model.AllocateAddressRequest;
import com.nifty.cloud.sdk.address.model.AllocateAddressResult;
import com.nifty.cloud.sdk.address.model.AssociateAddressRequest;
import com.nifty.cloud.sdk.address.model.AssociateAddressResult;
import com.nifty.cloud.sdk.address.model.NiftyModifyAddressAttributeRequest;
import com.nifty.cloud.sdk.address.model.NiftyModifyAddressAttributeResult;
import com.nifty.cloud.sdk.address.model.DescribeAddressesRequest;
import com.nifty.cloud.sdk.address.model.DescribeAddressesResult;
import com.nifty.cloud.sdk.address.model.DisassociateAddressRequest;
import com.nifty.cloud.sdk.address.model.DisassociateAddressResult;
import com.nifty.cloud.sdk.address.model.ReleaseAddressRequest;
import com.nifty.cloud.sdk.address.model.ReleaseAddressResult;

/**
 * NIFTY Cloud API 非同期クライアント 具象クラス。
 * アドレスカテゴリクライアント。<br />
 * アドレスカテゴリの非同期クライアントの具象クラスです。<br />
 * 戻り値の"利用不可"パラメータは返却値がnullまたは空となります。
 */
public class NiftyAddressAsyncClient extends NiftyAddressClient implements NiftyAddressAsync {


	/** 非同期タスク実行クラス. */
	protected ExecutorService executorService = null;

	/**
	 * 認証情報を指定し、アドレスカテゴリクライアントを構築します。
	 *
	 * @param credential 認証情報
	 */
	public NiftyAddressAsyncClient(Credentials credential) {
		this(credential, Executors.newCachedThreadPool());
	}

	/**
	 * 認証情報、クライアント設定を指定し、アドレスカテゴリクライアントを構築します。
	 *
	 * @param credential 認証情報
	 * @param configuration クライアント設定
	 */
	public NiftyAddressAsyncClient(Credentials credential, ClientConfiguration configuration) {
		this(credential, configuration, Executors.newCachedThreadPool());
	}

	/**
	 * 認証情報,非同期タスク実行クラスを指定し、アドレスカテゴリクライアントを構築します。
	 *
	 * @param credential 認証情報
	 * @param executorService 非同期タスク実行クラス
	 */
	public NiftyAddressAsyncClient(Credentials credential, ExecutorService executorService) {
		super(credential);
		this.executorService = executorService;

	}

	/**
	 * 認証情報、クライアント設定,非同期タスク実行クラスを指定し、アドレスカテゴリクライアントを構築します。
	 *
	 * @param credential 認証情報
	 * @param configuration クライアント設定
	 * @param executorService 非同期タスク実行クラス
	 */
	public NiftyAddressAsyncClient(Credentials credential, ClientConfiguration configuration, ExecutorService executorService) {
		super(credential, configuration);
		this.executorService = executorService;
	}

	/*
	 * (non-Javadoc)
	 * @see com.nifty.cloud.sdk.address.NiftyAddressAsync#allocateAddressAsync(com.nifty.cloud.sdk.address.model.AllocateAddressRequest)
	 */
	@Override
	public Future<AllocateAddressResult> allocateAddressAsync(final AllocateAddressRequest request) {
		return executorService.submit(
				new Callable<AllocateAddressResult>() {
					@Override
					public AllocateAddressResult call() {
						return allocateAddress(request);
					}
				}
		);
	}

	/*
	 * (non-Javadoc)
	 * @see com.nifty.cloud.sdk.address.NiftyAddressAsync#associateAddressAsync(com.nifty.cloud.sdk.address.model.AssociateAddressRequest)
	 */
	@Override
	public Future<AssociateAddressResult> associateAddressAsync(final AssociateAddressRequest request) {
		return executorService.submit(
				new Callable<AssociateAddressResult>() {
					@Override
					public AssociateAddressResult call() {
						return associateAddress(request);
					}
				}
		);
	}

	/*
	 * (non-Javadoc)
	 * @see com.nifty.cloud.sdk.address.NiftyAddressAsync#niftyModifyAddressAttributeAsync(com.nifty.cloud.sdk.address.model.NiftyModifyAddressAttributeRequest)
	 */
	@Override
	public Future<NiftyModifyAddressAttributeResult> niftyModifyAddressAttributeAsync(final NiftyModifyAddressAttributeRequest request) {
		return executorService.submit(
				new Callable<NiftyModifyAddressAttributeResult>() {
					@Override
					public NiftyModifyAddressAttributeResult call() {
						return niftyModifyAddressAttribute(request);
					}
				}
		);
	}

	/*
	 * (non-Javadoc)
	 * @see com.nifty.cloud.sdk.address.NiftyAddressAsync#describeAddressesAsync(com.nifty.cloud.sdk.address.model.DescribeAddressesRequest)
	 */
	@Override
	public Future<DescribeAddressesResult> describeAddressesAsync(final DescribeAddressesRequest request) {
		return executorService.submit(
				new Callable<DescribeAddressesResult>() {
					@Override
					public DescribeAddressesResult call() {
						return describeAddresses(request);
					}
				}
		);
	}

	/*
	 * (non-Javadoc)
	 * @see com.nifty.cloud.sdk.address.NiftyAddressAsync#disassociateAddressAsync(com.nifty.cloud.sdk.address.model.DisassociateAddressRequest)
	 */
	@Override
	public Future<DisassociateAddressResult> disassociateAddressAsync(final DisassociateAddressRequest request) {
		return executorService.submit(
				new Callable<DisassociateAddressResult>() {
					@Override
					public DisassociateAddressResult call() {
						return disassociateAddress(request);
					}
				}
		);
	}

	/*
	 * (non-Javadoc)
	 * @see com.nifty.cloud.sdk.address.NiftyAddressAsync#releaseAddressAsync(com.nifty.cloud.sdk.address.model.ReleaseAddressRequest)
	 */
	@Override
	public Future<ReleaseAddressResult> releaseAddressAsync(final ReleaseAddressRequest request) {
		return executorService.submit(
			new Callable<ReleaseAddressResult>() {
				@Override
				public ReleaseAddressResult call() {
					return releaseAddress(request);
				}
			}
		);
	}
}
