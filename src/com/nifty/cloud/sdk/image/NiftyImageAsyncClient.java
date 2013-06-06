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
package com.nifty.cloud.sdk.image;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import com.nifty.cloud.sdk.ClientConfiguration;
import com.nifty.cloud.sdk.auth.Credentials;
import com.nifty.cloud.sdk.image.model.DeleteImageRequest;
import com.nifty.cloud.sdk.image.model.DeleteImageResult;
import com.nifty.cloud.sdk.image.model.DescribeImagesRequest;
import com.nifty.cloud.sdk.image.model.DescribeImagesResult;
import com.nifty.cloud.sdk.image.model.ModifyImageAttributeRequest;
import com.nifty.cloud.sdk.image.model.ModifyImageAttributeResult;

/**
 * NIFTY Cloud API 非同期クライアント 具象クラス。
 * OSイメージカテゴリクライアント。<br />
 * OSイメージカテゴリの非同期クライアントの具象クラスです。<br />
 * 戻り値の"利用不可"パラメータは返却値がnullまたは空となります。
 */
public class NiftyImageAsyncClient extends NiftyImageClient implements NiftyImageAsync {

	
	/** 非同期タスク実行クラス. */
	protected ExecutorService executorService = null;
	
	/**
	 * 認証情報を指定し、OSイメージカテゴリクライアントを構築します。
	 * 
	 * @param credential 認証情報
	 */
	public NiftyImageAsyncClient(Credentials credential) {
		this(credential, Executors.newCachedThreadPool());
	}

	/**
	 * 認証情報、クライアント設定を指定し、OSイメージカテゴリクライアントを構築します。
	 * 
	 * @param credential 認証情報
	 * @param configuration クライアント設定
	 */
	public NiftyImageAsyncClient(Credentials credential, ClientConfiguration configuration) {
		this(credential, configuration, Executors.newCachedThreadPool());
	}

	/**
	 * 認証情報,非同期タスク実行クラスを指定し、OSイメージカテゴリクライアントを構築します。
	 * 
	 * @param credential 認証情報	
	 * @param executorService 非同期タスク実行クラス
	 */
	public NiftyImageAsyncClient(Credentials credential, ExecutorService executorService) {
		super(credential);
		this.executorService = executorService;
		
	}
	
	/**
	 * 認証情報、クライアント設定,非同期タスク実行クラスを指定し、OSイメージカテゴリクライアントを構築します。
	 * 
	 * @param credential 認証情報	
	 * @param configuration クライアント設定
	 * @param executorService 非同期タスク実行クラス
	 */
	public NiftyImageAsyncClient(Credentials credential, ClientConfiguration configuration, ExecutorService executorService) {
		super(credential, configuration);
		this.executorService = executorService;
	}

	/*
	 * (non-Javadoc)
	 * @see com.nifty.cloud.sdk.image.NiftyImageAsync#deleteImageAsync(com.nifty.cloud.sdk.image.model.DeleteImagesRequest)
	 */
	@Override
	public Future<DeleteImageResult> deleteImageAsync(final DeleteImageRequest request) {
		return executorService.submit( 
				new Callable<DeleteImageResult>() {
					@Override
					public DeleteImageResult call() {
						return deleteImage(request);
					}
				}
		);
	}

	/*
	 * (non-Javadoc)
	 * @see com.nifty.cloud.sdk.image.NiftyImageAsync#describeImagesAsync(com.nifty.cloud.sdk.image.model.DescribeImagesRequest)
	 */
	@Override
	public Future<DescribeImagesResult> describeImagesAsync(final DescribeImagesRequest request) {
		return executorService.submit( 
				new Callable<DescribeImagesResult>() {
					@Override
					public DescribeImagesResult call() {
						return describeImages(request);
					}
				}
		);
	}

	/*
	 * (non-Javadoc)
	 * @see com.nifty.cloud.sdk.image.NiftyImageAsync#modifyImageAttributeAsync(com.nifty.cloud.sdk.image.model.ModifyImageAttributeRequest)
	 */
	@Override
	public Future<ModifyImageAttributeResult> modifyImageAttributeAsync(final ModifyImageAttributeRequest request) {
		return executorService.submit( 
				new Callable<ModifyImageAttributeResult>() {
					@Override
					public ModifyImageAttributeResult call() {
						return modifyImageAttribute(request);
					}
				}
		);
	}
	

}
