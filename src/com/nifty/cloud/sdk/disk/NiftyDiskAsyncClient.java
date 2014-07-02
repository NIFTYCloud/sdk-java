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
package com.nifty.cloud.sdk.disk;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import com.nifty.cloud.sdk.ClientConfiguration;
import com.nifty.cloud.sdk.auth.Credentials;
import com.nifty.cloud.sdk.disk.model.AttachVolumeRequest;
import com.nifty.cloud.sdk.disk.model.AttachVolumeResult;
import com.nifty.cloud.sdk.disk.model.CreateVolumeRequest;
import com.nifty.cloud.sdk.disk.model.CreateVolumeResult;
import com.nifty.cloud.sdk.disk.model.DeleteVolumeRequest;
import com.nifty.cloud.sdk.disk.model.DeleteVolumeResult;
import com.nifty.cloud.sdk.disk.model.DescribeVolumesRequest;
import com.nifty.cloud.sdk.disk.model.DescribeVolumesResult;
import com.nifty.cloud.sdk.disk.model.DetachVolumeRequest;
import com.nifty.cloud.sdk.disk.model.DetachVolumeResult;
import com.nifty.cloud.sdk.disk.model.ModifyVolumeAttributeRequest;
import com.nifty.cloud.sdk.disk.model.ModifyVolumeAttributeResult;

/**
 * NIFTY Cloud API 非同期クライアント 具象クラス。
 * ディスクカテゴリクライアント。<br />
 * ディスクカテゴリの非同期クライアントの具象クラスです。<br />
 * 戻り値の"利用不可"パラメータは返却値がnullまたは空となります。
 */
public class NiftyDiskAsyncClient extends NiftyDiskClient implements NiftyDiscAsync {

	
	/** 非同期タスク実行クラス. */
	protected ExecutorService executorService = null;
	
	
	/** 
	 * 認証情報を指定し、ディスクカテゴリクライアントを構築します。
	 * 
	 * @param credential 認証情報
	 */
	public NiftyDiskAsyncClient(Credentials credential) {
		this(credential, Executors.newCachedThreadPool());
	}

	/** 
	 * 認証情報、クライアント設定を指定し、ディスクカテゴリクライアントを構築します。
	 * 
	 * @param credential 認証情報
	 * @param configuration クライアント設定
	 */
	public NiftyDiskAsyncClient(Credentials credential, ClientConfiguration configuration) {
		this(credential, configuration, Executors.newCachedThreadPool());
	}

	/** 
	 * 認証情報,非同期タスク実行クラスを指定し、ディスクカテゴリクライアントを構築します。
	 * 
	 * @param credential 認証情報	
	 * @param executorService 非同期タスク実行クラス
	 */
	public NiftyDiskAsyncClient(Credentials credential, ExecutorService executorService) {
		super(credential);
		this.executorService = executorService;
		
	}
	
	/** 
	 * 認証情報、クライアント設定,非同期タスク実行クラスを指定し、ディスクカテゴリクライアントを構築します。
	 * 
	 * @param credential 認証情報	
	 * @param configuration クライアント設定
	 * @param executorService 非同期タスク実行クラス
	 */
	public NiftyDiskAsyncClient(Credentials credential, ClientConfiguration configuration, ExecutorService executorService) {
		super(credential, configuration);
		this.executorService = executorService;
	}

	/*
	 * (non-Javadoc)
	 * @see com.nifty.cloud.sdk.disk.NiftyDiscAsync#attachVolumeAsync(com.nifty.cloud.sdk.disk.model.AttachVolumeRequest)
	 */
	@Override
	public Future<AttachVolumeResult> attachVolumeAsync(final AttachVolumeRequest request) {
		return executorService.submit( 
				new Callable<AttachVolumeResult>() {
					@Override
					public AttachVolumeResult call() {
						return attachVolume(request);
					}
				}
		);
	}

	/*
	 * (non-Javadoc)
	 * @see com.nifty.cloud.sdk.disk.NiftyDiscAsync#createVolumeAsync(com.nifty.cloud.sdk.disk.model.CreateVolumeRequest)
	 */
	@Override
	public Future<CreateVolumeResult> createVolumeAsync(final CreateVolumeRequest request) {
		return executorService.submit( 
				new Callable<CreateVolumeResult>() {
					@Override
					public CreateVolumeResult call() {
						return createVolume(request);
					}
				}
		);		
	}

	/*
	 * (non-Javadoc)
	 * @see com.nifty.cloud.sdk.disk.NiftyDiscAsync#deleteVolumeAsync(com.nifty.cloud.sdk.disk.model.DeleteVolumeRequest)
	 */
	@Override
	public Future<DeleteVolumeResult> deleteVolumeAsync(final DeleteVolumeRequest request) {
		return executorService.submit( 
				new Callable<DeleteVolumeResult>() {
					@Override
					public DeleteVolumeResult call() {
						return deleteVolume(request);
					}
				}
		);
	}

	/*
	 * (non-Javadoc)
	 * @see com.nifty.cloud.sdk.disk.NiftyDiscAsync#describeVolumesAsync(com.nifty.cloud.sdk.disk.model.DescribeVolumeRequest)
	 */
	@Override
	public Future<DescribeVolumesResult> describeVolumesAsync(final DescribeVolumesRequest request) {
		return executorService.submit( 
				new Callable<DescribeVolumesResult>() {
					@Override
					public DescribeVolumesResult call() {
						return describeVolumes(request);
					}
				}
		);
	}

	/*
	 * (non-Javadoc)
	 * @see com.nifty.cloud.sdk.disk.NiftyDiscAsync#detachVolumeAsync(com.nifty.cloud.sdk.disk.model.DetachVolumeRequest)
	 */
	@Override
	public Future<DetachVolumeResult> detachVolumeAsync(final DetachVolumeRequest request) {
		return executorService.submit( 
				new Callable<DetachVolumeResult>() {
					@Override
					public DetachVolumeResult call() {
						return detachVolume(request);
					}
				}
		);
	}	

	/*
	 * (non-Javadoc)
	 * @see com.nifty.cloud.sdk.disk.NiftyDiscAsync#modifyVolumeAttributeAsync(com.nifty.cloud.sdk.disk.model.ModifyVolumeAttributeRequest)
	 */
	@Override
	public Future<ModifyVolumeAttributeResult> modifyVolumeAttributeAsync(final ModifyVolumeAttributeRequest request) {
		return executorService.submit(
				new Callable<ModifyVolumeAttributeResult>() {
					@Override
					public ModifyVolumeAttributeResult call() {
						return modifyVolumeAttribute(request);
					}
				}
		);
	}	
}
