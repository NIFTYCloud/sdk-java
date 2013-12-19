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
package com.nifty.cloud.sdk.upload.model;

import org.apache.commons.httpclient.HttpMethod;

import com.nifty.cloud.sdk.Result;

/**
 * 処理結果　抽象クラス。<br />
 * アップロードI/Fから受信した処理結果の抽象クラスです。
 *
 */
public abstract class UploadResult extends Result {
	/** 次回アップロード位置 */
	private Long position;
	/** エラーメッセージ */
	private String errorMessage;

	/**
	 * 処理結果を適用します。
	 * @param method HttpMethod
	 */
	public abstract void applyResponse(HttpMethod method);

	/**
	 * 次回アップロード位置を取得します。
	 * @return 次回アップロード位置
	 */
	public Long getPosition() {
		return position;
	}
	/**
	 * 次回アップロード位置を設定します。
	 * @param position 次回アップロード位置
	 */
	public void setPosition(Long position) {
		this.position = position;
	}
	/**
	 * 次回アップロード位置を設定し、自オブジェクトを返します。
	 * @param position 次回アップロード位置
	 * @return 自オブジェクト
	 */
	public UploadResult withPosition(Long position) {
		setPosition(position);
		return this;
	}

	/**
	 * エラーメッセージを取得します。
	 * @return エラーメッセージ
	 */
	public String getErrorMessage() {
		return errorMessage;
	}
	/**
	 * エラーメッセージを設定します。
	 * @param errorMessage エラーメッセージ
	 */
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	/**
	 * エラーメッセージを設定し、自オブジェクトを返します。
	 * @param errorMessage エラーメッセージ
	 * @return 自オブジェクト
	 */
	public UploadResult withErrorMessage(String errorMessage) {
		setErrorMessage(errorMessage);
		return this;
	}
}
