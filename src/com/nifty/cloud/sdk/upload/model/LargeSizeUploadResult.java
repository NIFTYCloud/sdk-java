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
package com.nifty.cloud.sdk.upload.model;

import org.apache.commons.httpclient.Header;
import org.apache.commons.httpclient.HttpMethod;

/**
 * LargeSizeUpload結果処理クラス。<br />
 * このクラスはLargeSizeUploadのレスポンスを格納します。
 *
 */
public class LargeSizeUploadResult extends UploadResult {
	/** ブロックサイズ */
	private Long partSize;

	/** タイムアウト */
	private Integer timeout;

	/** ソケットバッファサイズ */
	private Integer bufsize;

	@Override
	public void applyResponse(HttpMethod method) {
		setResponseXml("");

		Header header = method.getResponseHeader("x-nifty-upload-applet-blocksize");
		setPartSize((header != null) ? new Long(header.getValue()) : null);
		header = method.getResponseHeader("x-nifty-upload-applet-timeout");
		setTimeout((header != null) ? new Integer(header.getValue()) : null);
		header = method.getResponseHeader("x-nifty-upload-applet-socketbufsize");
		setBufsize((header != null) ? new Integer(header.getValue()) : null);
		header = method.getResponseHeader("x-nifty-upload-next-position");
		setPosition((header != null) ? new Long(header.getValue()) : null);

		header = method.getResponseHeader("x-nifty-upload-result-msg");
		if (header == null) {
			setErrorMessage("Failed to uploading, please try again shortly.");
		} else {
			String message = header.getValue();
			if ("ok.".equals(message)) {
				setErrorMessage(null);
			} else {
				header = method.getResponseHeader("x-nifty-upload-result-code");
				if (header != null) {
					message += " (result code=" + header.getValue() + ')';
				}
				setErrorMessage(message);
			}
		}
	}

	/**
	 * ブロックサイズを取得します。
	 * @return ブロックサイズ
	 */
	public Long getPartSize() {
		return partSize;
	}
	/**
	 * ブロックサイズを設定します。
	 * @param partSize ブロックサイズ
	 */
	public void setPartSize(Long partSize) {
		this.partSize = partSize;
	}
	/**
	 * ブロックサイズを設定し、自オブジェクトを返却します。
	 * @param partSize ブロックサイズ
	 * @return 自オブジェクト
	 */
	public LargeSizeUploadResult withPartSize(Long partSize) {
		setPartSize(partSize);
		return this;
	}

	/**
	 * タイムアウト（秒）を取得します。
	 * @return タイムアウト（秒）
	 */
	public Integer getTimeout() {
		return timeout;
	}
	/**
	 * タイムアウト（秒）を設定します。
	 * @param timeout タイムアウト（秒）
	 */
	public void setTimeout(Integer timeout) {
		this.timeout = timeout;
	}
	/**
	 * タイムアウト（秒）を設定し、自オブジェクトを返却します。
	 * @param timeout タイムアウト（秒）
	 * @return 自オブジェクト
	 */
	public LargeSizeUploadResult withTimeout(Integer timeout) {
		setTimeout(timeout);
		return this;
	}

	/**
	 * ソケットバッファサイズを取得します。
	 * @return ソケットバッファサイズ
	 */
	public Integer getBufsize() {
		return bufsize;
	}
	/**
	 * ソケットバッファサイズを設定します。
	 * @param bufsize ソケットバッファサイズ
	 */
	public void setBufsize(Integer bufsize) {
		this.bufsize = bufsize;
	}
	/**
	 * ソケットバッファサイズを設定し、自オブジェクトを返却します。
	 * @param bufsize ソケットバッファサイズ
	 * @return 自オブジェクト
	 */
	public LargeSizeUploadResult withBufsize(Integer bufsize) {
		setBufsize(bufsize);
		return this;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("[partSize=");
		builder.append(partSize);
		builder.append(", timeout=");
		builder.append(timeout);
		builder.append(", bufsize=");
		builder.append(bufsize);
		builder.append("]");
		return builder.toString();
	}

}
