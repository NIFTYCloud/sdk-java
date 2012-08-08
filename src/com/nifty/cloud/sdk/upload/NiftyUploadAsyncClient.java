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
package com.nifty.cloud.sdk.upload;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import com.nifty.cloud.sdk.ClientConfiguration;
import com.nifty.cloud.sdk.auth.Credentials;
import com.nifty.cloud.sdk.upload.model.CancelUploadRequest;
import com.nifty.cloud.sdk.upload.model.CancelUploadResult;
import com.nifty.cloud.sdk.upload.model.DescribeUploadsRequest;
import com.nifty.cloud.sdk.upload.model.DescribeUploadsResult;
import com.nifty.cloud.sdk.upload.model.LargeSizeUploadRequest;
import com.nifty.cloud.sdk.upload.model.LargeSizeUploadResult;

/**
 * NIFTY Cloud API 非同期クライアント 具象クラス。
 * アップロードカテゴリクライアント。<br />
 * アップロードカテゴリの非同期クライアントの具象クラスです。<br />
 * 戻り値の"利用不可"パラメータは返却値がnullまたは空となります。
 *
 */
public class NiftyUploadAsyncClient extends NiftyUploadClient implements NiftyUploadAsync {
	/** 非同期タスク実行クラス. */
	protected ExecutorService executorService = null;

	/**
	 * 認証情報を指定し、アップロードカテゴリクライアントを構築します。
	 *
	 * @param credential 認証情報
	 */
	public NiftyUploadAsyncClient(Credentials credential) {
		this(credential, Executors.newCachedThreadPool());
	}

	/**
	 * 認証情報、クライアント設定を指定し、アップロードカテゴリクライアントを構築します。
	 *
	 * @param credential 認証情報
	 * @param configuration クライアント設定
	 */
	public NiftyUploadAsyncClient(Credentials credential, ClientConfiguration configuration) {
		this(credential, configuration, Executors.newCachedThreadPool());
	}

	/**
	 * 認証情報,非同期タスク実行クラスを指定し、アップロードカテゴリクライアントを構築します。
	 *
	 * @param credential 認証情報
	 * @param executorService 非同期タスク実行クラス
	 */
	public NiftyUploadAsyncClient(Credentials credential, ExecutorService executorService) {
		super(credential);
		this.executorService = executorService;
	}

	/**
	 * 認証情報、クライアント設定,非同期タスク実行クラスを指定し、アップロードカテゴリクライアントを構築します。
	 *
	 * @param credential 認証情報
	 * @param configuration クライアント設定
	 * @param executorService 非同期タスク実行クラス
	 */
	public NiftyUploadAsyncClient(Credentials credential, ClientConfiguration configuration, ExecutorService executorService) {
		super(credential, configuration);
		this.executorService = executorService;
	}

	/* (non-Javadoc)
	 * @see com.nifty.cloud.sdk.upload.NiftyUploadAsync#largeSizeUploadAsync(com.nifty.cloud.sdk.upload.model.LargeSizeUploadRequest)
	 */
	@Override
	public Future<LargeSizeUploadResult> largeSizeUploadAsync(final LargeSizeUploadRequest request) {
		return executorService.submit(
			new Callable<LargeSizeUploadResult>() {
				@Override
				public LargeSizeUploadResult call() {
					return largeSizeUpload(request);
				}
			}
		);
	}

	/* (non-Javadoc)
	 * @see com.nifty.cloud.sdk.upload.NiftyUploadAsync#describeUploadsAsync(com.nifty.cloud.sdk.upload.model.DescribeUploadsRequest)
	 */
	@Override
	public Future<DescribeUploadsResult> describeUploadsAsync(final DescribeUploadsRequest request) {
		return executorService.submit(
			new Callable<DescribeUploadsResult>() {
				@Override
				public DescribeUploadsResult call() {
					return describeUploads(request);
				}
			}
		);
	}

	/* (non-Javadoc)
	 * @see com.nifty.cloud.sdk.upload.NiftyUploadAsync#cancelUploadAsync(com.nifty.cloud.sdk.upload.model.CancelUploadRequest)
	 */
	@Override
	public Future<CancelUploadResult> cancelUploadAsync(final CancelUploadRequest request) {
		return executorService.submit(
			new Callable<CancelUploadResult>() {
				@Override
				public CancelUploadResult call() {
					return cancelUpload(request);
				}
			}
		);
	}

}
