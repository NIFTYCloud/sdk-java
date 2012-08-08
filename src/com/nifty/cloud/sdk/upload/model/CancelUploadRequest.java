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
package com.nifty.cloud.sdk.upload.model;

import com.nifty.cloud.sdk.Request;
import com.nifty.cloud.sdk.annotation.Action;
import com.nifty.cloud.sdk.annotation.Query;

/**
 * CancelUploadリクエストクラス。<br />
 * このクラスはCancelUploadへのリクエストを構築します。
 */
@Action("CancelUpload")
public class CancelUploadRequest implements Request {
	/** アップロードID */
	private String conversionTaskId;

	/**
	 * デフォルトコンストラクタ。
	 */
	public CancelUploadRequest() {
	}

	/**
	 * アップロードIDを指定し、CancelUploadRequestを構築します。
	 * @param conversionTaskId アップロードID
	 */
	public CancelUploadRequest(String conversionTaskId) {
		this.conversionTaskId = conversionTaskId;
	}

	/**
	 * アップロードIDを取得します。
	 * @return アップロードID
	 */
	@Query(name = "ConversionTaskId", require=true)
	public String getConversionTaskId() {
		return conversionTaskId;
	}
	/**
	 * アップロードIDを設定します。
	 * @param conversionTaskId アップロードID
	 */
	public void setConversionTaskId(String conversionTaskId) {
		this.conversionTaskId = conversionTaskId;
	}
	/**
	 * アップロードIDを設定し、自オブジェクトを返します。
	 * @param conversionTaskId アップロードID
	 * @return 自オブジェクト
	 */
	public CancelUploadRequest withConversionTaskId(String conversionTaskId) {
		setConversionTaskId(conversionTaskId);
		return this;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("[conversionTaskId=");
		builder.append(conversionTaskId);
		builder.append("]");
		return builder.toString();
	}
}
