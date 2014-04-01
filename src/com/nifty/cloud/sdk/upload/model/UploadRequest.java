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
 *  API Version: 1.17
 *  Date: 2014-02-20 17:00:00
 * 
 */
package com.nifty.cloud.sdk.upload.model;

import static com.nifty.cloud.sdk.Const.*;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import com.nifty.cloud.sdk.Request;
import com.nifty.cloud.sdk.upload.UploadCallback;

/**
 * アップロードリクエストクラス。<br />
 * アップロードサーブレットに送信するリクエストの抽象クラスです。
 *
 */
public abstract class UploadRequest implements Request {
	/** アップロードファイル */
	private File file;

	/** アップロード開始位置 */
	private long offset;

	/** 次回アップロード位置 */
	private long position;

	/** ブロックサイズ */
	private int partSize = DEFAULT_UPLOAD_BLOCKSIZE * 1024 * 1024;

	/**
	 * 処理状況コールバック
	 */
	private List<UploadCallback> callbacks;

	/**
	 * デフォルトコンストラクタ。
	 */
	public UploadRequest() {
	}

	/**
	 * アップロードファイルを指定し、UploadRequestを構築します。
	 * @param file アップロードファイル
	 */
	public UploadRequest(File file) {
		this.file = file;
	}

	/**
	 * アップロードファイルを取得します。
	 * @return アップロードサイズ
	 */
	public File getFile() {
		return file;
	}

	/**
	 * アップロードファイルを設定します。
	 * @param file アップロードファイル
	 */
	public void setFile(File file) {
		this.file = file;
	}

	/**
	 * アップロードファイルを設定し、自オブジェクトを返します。
	 * @param file アップロードファイル
	 * @return 自オブジェクト
	 */
	public UploadRequest withFile(File file) {
		setFile(file);
		return this;
	}

	/**
	 * アップロード開始位置を取得します。
	 * @return アップロード開始位置
	 */
	public long getOffset() {
		return offset;
	}

	/**
	 * アップロード開始位置を設定します。
	 * @param offset アップロード開始位置
	 */
	public void setOffset(long offset) {
		this.offset = offset;
	}

	/**
	 * アップロード開始位置を設定し、自オブジェクトを返します。
	 * @param offset アップロード開始位置
	 * @return 自オブジェクト
	 */
	public UploadRequest withOffset(long offset) {
		setOffset(offset);
		return this;
	}

	/**
	 * ブロックサイズを取得します。
	 * @return ブロックサイズ
	 */
	public int getPartSize() {
		return partSize;
	}

	/**
	 * ブロックサイズを設定します。
	 * @param partSize ブロックサイズ
	 */
	public void setPartSize(int partSize) {
		this.partSize = partSize;
	}

	/**
	 * ブロックサイズを設定し、自オブジェクトを返します。
	 * @param partSize ブロックサイズ
	 * @return 自オブジェクト
	 */
	public UploadRequest withPartSize(int partSize) {
		setPartSize(partSize);
		return this;
	}

	/**
	 * 次回アップロード位置を取得します。
	 * @return 次回アップロード位置
	 */
	public long getPosition() {
		return position;
	}
	/**
	 * 次回アップロード位置を設定します。
	 * @param position 次回アップロード位置
	 */
	public void setPosition(long position) {
		this.position = position;
	}
	/**
	 * 次回アップロード位置を設定し、自オブジェクトを返します。
	 * @param position 次回アップロード位置
	 * @return 自オブジェクト
	 */
	public UploadRequest withPosition(long position) {
		setPosition(position);
		return this;
	}

	/**
	 * 処理状況コールバックを取得します。
	 * @return 処理状況コールバック
	 */
	public List<UploadCallback> getCallbacks() {
		return callbacks;
	}

	/**
	 * 処理状況コールバックを設定します。
	 * @param callbacks 処理状況コールバック
	 */
	public void setCallbacks(List<UploadCallback> callbacks) {
		this.callbacks = callbacks;
	}

	/**
	 * 処理状況コールバックを設定し、自オブジェクトを返します。
	 * @param callbacks 処理状況コールバック
	 * @return 自オブジェクト
	 */
	public UploadRequest withCallbacks(Collection<UploadCallback> callbacks) {
		if (this.callbacks == null) this.callbacks = new ArrayList<UploadCallback>();
		if (callbacks != null) {
			this.callbacks.addAll(callbacks);
		}
		return this;
	}

	/**
	 * 処理状況コールバックを設定し、自オブジェクトを返します。
	 * @param callbacks 処理状況コールバック
	 * @return 自オブジェクト
	 */
	public UploadRequest withCallbacks(UploadCallback... callbacks) {
		if (this.callbacks == null) this.callbacks = new ArrayList<UploadCallback>();
		for (UploadCallback callback : callbacks) {
			this.callbacks.add(callback);
		}
		return this;
	}

	/**
	 * 処理状況コールバックを追加します。
	 * @param callback 処理状況コールバック
	 */
	public void addCallback(UploadCallback callback) {
		if (this.callbacks == null) this.callbacks = new ArrayList<UploadCallback>();
		this.callbacks.add(callback);
	}

	/**
	 * 処理状況コールバックを削除します。
	 * @param callback 処理状況コールバック
	 * @return true=変更された false=変更されなかった
	 */
	public boolean removeCallback(UploadCallback callback) {
		if (this.callbacks == null || this.callbacks.isEmpty()) return false;
		return this.callbacks.remove(callback);
	}

	/**
	 * コールバックに処理状況を通知します。
	 * @param partSize 送信したブロックサイズ
	 * @param sent 送信した全体量
	 */
	public void notifyProgress(long partSize, long sent) {
		if (callbacks == null || callbacks.isEmpty()) return;
		for (UploadCallback callback : callbacks) {
			callback.notifyProgress(partSize, sent);
		}
	}

	/**
	 * リクエストヘッダーを指定します。
	 * @param headerMap マップ
	 * @param partSize 送信するブロックサイズ
	 */
	public abstract void getHeaders(Map<String, String> headerMap, int partSize);
}
