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

import java.util.concurrent.Future;

import com.nifty.cloud.sdk.upload.model.CancelUploadRequest;
import com.nifty.cloud.sdk.upload.model.CancelUploadResult;
import com.nifty.cloud.sdk.upload.model.DescribeUploadsRequest;
import com.nifty.cloud.sdk.upload.model.DescribeUploadsResult;
import com.nifty.cloud.sdk.upload.model.LargeSizeUploadRequest;
import com.nifty.cloud.sdk.upload.model.LargeSizeUploadResult;

/**
 * NIFTY Cloud API 非同期クライアント　インタフェース。
 * アップロードカテゴリクライアント。<br />
 * アップロードカテゴリの非同期クライアントのインタフェースです。<br />
 * 戻り値の"利用不可"パラメータは返却値がnullまたは空となります。
 *
 */
public interface NiftyUploadAsync extends NiftyUpload {

	/**
	 * 非同期で大容量ファイルのアップロードを行います。
	 *
	 * @param request LargeSizeUploadリクエスト
	 * @return 非同期処理結果
	 */
	Future<LargeSizeUploadResult> largeSizeUploadAsync(LargeSizeUploadRequest request);

	/**
	 * 非同期でアップロードタスクを列挙します。
	 *
	 * @param request DescribeUploadsリクエスト
	 * @return 非同期処理結果
	 */
	Future<DescribeUploadsResult> describeUploadsAsync(DescribeUploadsRequest request);

	/**
	 * 非同期でアップロードタスクをキャンセルします。
	 *
	 * @param request CancelUploadRequestリクエスト
	 * @return 非同期処理結果
	 */
	Future<CancelUploadResult> cancelUploadAsync(CancelUploadRequest request);
}
