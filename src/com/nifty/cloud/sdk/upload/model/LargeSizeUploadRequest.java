/*******************************************************************************
 *  Copyright 2012 NIFTY Corporation All Rights Reserved.
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
 *  API Version: 1.12
 *  Date: 2012-12-21 17:00:00
 *
 */
package com.nifty.cloud.sdk.upload.model;

import java.io.File;
import java.util.Map;

import com.nifty.cloud.sdk.NiftyClientException;

/**
 * LargeSizeUploadリクエストクラス。<br />
 * このクラスはLargeSizeUploadへのリクエストを構築します。
 */
public class LargeSizeUploadRequest extends UploadRequest {
	/** アップロードID */
	private String conversionTaskId;

	/** 操作種別 */
	private Operation operation = Operation.appletinit;

	/**
	 * デフォルトコンストラクタ。
	 */
	public LargeSizeUploadRequest() {
	}

	/**
	 * アップロードファイルを指定し、UploadRequestを構築します。
	 * @param file アップロードファイル
	 */
	public LargeSizeUploadRequest(File file) {
		super(file);
	}

	@Override
	public void getHeaders(Map<String, String> headerMap, int partSize) {
		headerMap.clear();
		switch (operation) {
		case appletinit:
			;
			break;
		case query:
			headerMap.put("x-nifty-upload-filename", getFile().getName());
			break;
		case upload:
			headerMap.put("x-nifty-upload-next-position", Long.toString(getPosition()));
			headerMap.put("x-nifty-upload-block-size", Long.toString(partSize));
			headerMap.put("x-nifty-upload-file-size", Long.toString(getFile().length()));
			headerMap.put("x-nifty-upload-filename", getFile().getName());
			break;
		}
		headerMap.put("x-nifty-upload-operation", operation.toString());
		headerMap.put("x-nifty-upload-id", conversionTaskId);
	}

	/**
	 * 操作種別を取得します。
	 * @return 操作種別
	 */
	public Operation getOperation() {
		return operation;
	}
	/**
	 * 操作種別を設定します。
	 * @param operation 操作種別
	 */
	public void setOperation(Operation operation) {
		if (operation == null) {
			throw new NiftyClientException("Operation cannot be null.");
		}
		this.operation = operation;
	}
	/**
	 * 操作種別を設定し、自オブジェクトを返します。
	 * @param operation 操作種別
	 * @return 自オブジェクト
	 */
	public LargeSizeUploadRequest withOperation(Operation operation) {
		setOperation(operation);
		return this;
	}

	/**
	 * アップロードIDを取得します。
	 * @return アップロードID
	 */
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
	public LargeSizeUploadRequest withConversionTaskId(String conversionTaskId) {
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
		builder.append(", operation=");
		builder.append(operation);
		builder.append("]");
		return builder.toString();
	}
}
