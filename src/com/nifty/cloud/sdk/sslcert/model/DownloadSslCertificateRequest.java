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
 *  Date: 2011-08-25 09:46:38
 *
 */
package com.nifty.cloud.sdk.sslcert.model;

import com.nifty.cloud.sdk.Request;
import com.nifty.cloud.sdk.annotation.Action;
import com.nifty.cloud.sdk.annotation.Query;

/**
 * DownloadSslCertificateリクエストクラス。<br />
 * このクラスはDownloadSslCertificateへのリクエストを構築します。
 */
@Action("DownloadSslCertificate")
public class DownloadSslCertificateRequest implements Request {

	/** 証明書の発行識別子 */
	private String fqdnId;

	/** ダウンロード対象のファイル */
	private String fileType;

    /**
     * デフォルトコンストラクタ。
     */
	public DownloadSslCertificateRequest(){
	}
	/**
	 * 証明書の発行識別子、ダウンロード対象種類を指定し、DownloadSslCertificateRequestを構築します。
	 * @param fqdnId 証明書の発行識別子
	 * @param fileType ダウンロード対象のファイル
	 */
	public DownloadSslCertificateRequest(String fqdnId, String fileType){
		this.fqdnId = fqdnId;
		this.fileType = fileType;
	}
	/**
	 * 証明書の発行識別子を取得します。
	 * 
	 * @return 証明書の発行識別子
	 */
	@Query(name = "FqdnId", require = true)
	public String getFqdnId() {
		return fqdnId;
	}

	/**
	 * 証明書の発行識別子を設定します。
	 * 
	 * @param fqdnId 証明書の発行識別子
	 */
	public void setFqdnId(String fqdnId) {
		this.fqdnId = fqdnId;
	}

	/**
	 * 証明書の発行識別子を設定し、自オブジェクトを返します。
	 * 
	 * @param fqdnId 証明書の発行識別子
	 * @return 自オブジェクト
	 */
	public DownloadSslCertificateRequest withFqdnId(String fqdnId) {
		setFqdnId(fqdnId);
		return this;
	}

	/**
	 * ダウンロード対象のファイルを取得します。
	 * 
	 * @return ダウンロード対象のファイル
	 */
	@Query(name = "FileType", require = true)
	public String getFileType() {
		return fileType;
	}

	/**
	 * ダウンロード対象のファイルを設定します。
	 * 
	 * @param fileType ダウンロード対象のファイル
	 */
	public void setFileType(String fileType) {
		this.fileType = fileType;
	}

	/**
	 * ダウンロード対象のファイルを設定し、自オブジェクトを返します。
	 * 
	 * @param fileType ダウンロード対象のファイル
	 * @return 自オブジェクト
	 */
	public DownloadSslCertificateRequest withFileType(String fileType) {
		setFileType(fileType);
		return this;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("[fqdnId=");
		builder.append(fqdnId);
		builder.append(",fileType=");
		builder.append(fileType);
		builder.append("]");
		return builder.toString();
	}
}
