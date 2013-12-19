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
 *  API Version: 1.16
 *  Date: 2013-10-18 17:00:00
 *
 */
package com.nifty.cloud.sdk.upload;

import com.nifty.cloud.sdk.upload.model.CancelUploadRequest;
import com.nifty.cloud.sdk.upload.model.CancelUploadResult;
import com.nifty.cloud.sdk.upload.model.DescribeUploadsRequest;
import com.nifty.cloud.sdk.upload.model.DescribeUploadsResult;
import com.nifty.cloud.sdk.upload.model.LargeSizeUploadRequest;
import com.nifty.cloud.sdk.upload.model.LargeSizeUploadResult;

/**
 * NIFTY Cloud API クライアント インタフェース。
 * アップロードカテゴリ クライアント。<br />
 * アップロードカテゴリの同期クライアントのインタフェースです。<br />
 * 戻り値の"利用不可"パラメータは返却値がnullまたは空となります。
 *
 */
public interface NiftyUpload {
	/**
	 * エンドポイントを設定します。
	 *
	 * @param endpoint エンドポイント
	 */
	void setEndpoint(String endpoint);

	/**
	 * 大容量ファイルのアップロードを行います。
	 *
	 * @param request LargeSizeUploadリクエスト
	 * @return LargeSizeUpload処理結果
	 */
	LargeSizeUploadResult largeSizeUpload(LargeSizeUploadRequest request);

	/**
	 * アップロードタスクを列挙します。
	 *
	 * @param request DescribeUploadsリクエスト
	 * @return DescribeUploads処理結果
	 */
	DescribeUploadsResult describeUploads(DescribeUploadsRequest request);

	/**
	 * アップロードタスクをキャンセルします。
	 *
	 * @param request CancelUploadRequestリクエスト
	 * @return CancelUploadResult処理結果
	 */
	CancelUploadResult cancelUpload(CancelUploadRequest request);
}
