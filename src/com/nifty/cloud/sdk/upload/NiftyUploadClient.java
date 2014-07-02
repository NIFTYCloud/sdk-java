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
package com.nifty.cloud.sdk.upload;

import com.nifty.cloud.sdk.BaseClient;
import com.nifty.cloud.sdk.ClientConfiguration;
import com.nifty.cloud.sdk.auth.Credentials;
import com.nifty.cloud.sdk.upload.model.CancelUploadRequest;
import com.nifty.cloud.sdk.upload.model.CancelUploadResult;
import com.nifty.cloud.sdk.upload.model.DescribeUploadsRequest;
import com.nifty.cloud.sdk.upload.model.DescribeUploadsResult;
import com.nifty.cloud.sdk.upload.model.LargeSizeUploadRequest;
import com.nifty.cloud.sdk.upload.model.LargeSizeUploadResult;
import com.nifty.cloud.sdk.upload.model.Operation;

/**
 * NIFTY Cloud API クライアント　具象クラス。
 * アップロードカテゴリ クライアント。<br />
 * アップロードカテゴリの同期クライアントの具象クラスです。<br />
 * 戻り値の"利用不可"パラメータは返却値がnullまたは空となります。
 *
 */
public class NiftyUploadClient extends BaseClient implements NiftyUpload {
	/**
	 * 認証情報を指定し、アップロードカテゴリクライアントを構築します。
	 *
	 * @param credential 認証情報
	 */
	public NiftyUploadClient(Credentials credential) {
		super(credential, new ClientConfiguration());
	}

	/**
	 * 認証情報、クライアント設定を指定し、アップロードカテゴリクライアントを構築します。
	 *
	 * @param credential 認証情報
	 * @param configuration クライアント設定
	 */
	public NiftyUploadClient(Credentials credential,
			ClientConfiguration configuration) {
		super(credential, configuration);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see com.nifty.cloud.sdk.upload.NiftyUpload#largeSizeUpload(com.nifty.cloud.sdk.upload.model.LargeSizeUploadRequest)
	 */
	@Override
	public LargeSizeUploadResult largeSizeUpload(LargeSizeUploadRequest request) {
		if (request.getPartSize() == 0) {
			request.setPartSize(client.getConfig().getUploadBlockSize() * 1024 * 1024);
		}
		request.setOperation(Operation.appletinit);
		LargeSizeUploadResult result = (LargeSizeUploadResult)client.processLargeSizeUpload(request, LargeSizeUploadResult.class);
		request.setOperation(Operation.query);
		result = (LargeSizeUploadResult)client.processLargeSizeUpload(request, LargeSizeUploadResult.class);

		long position = (result.getPosition() != null) ? result.getPosition().longValue() : 0L;
		if (position > 0) {
			request.notifyProgress(position, 0);
		}
		request.setOffset(position);
		request.setPosition(position);

		request.setOperation(Operation.upload);
		return (LargeSizeUploadResult)client.executeLargeSizeUpload(request, LargeSizeUploadResult.class);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see com.nifty.cloud.sdk.upload.NiftyUpload#describeUploads(com.nifty.cloud.sdk.upload.model.DescribeUploadsRequest)
	 */
	@Override
	public DescribeUploadsResult describeUploads(DescribeUploadsRequest request) {
		return (DescribeUploadsResult)client.execute(request, DescribeUploadsResult.class);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see com.nifty.cloud.sdk.upload.NiftyUpload#cancelUpload(com.nifty.cloud.sdk.upload.model.CancelUploadRequest)
	 */
	@Override
	public CancelUploadResult cancelUpload(CancelUploadRequest request) {
		return (CancelUploadResult)client.execute(request, CancelUploadResult.class);
	}

	/**
	 * アップロードエンドポイントの設定を行います。
	 *
	 * @param uploadEndpoint アップロードエンドポイント
	 */
	public void setUploadEndpoint(String uploadEndpoint) {
		client.setUploadEndpoint(uploadEndpoint);
	}

}
