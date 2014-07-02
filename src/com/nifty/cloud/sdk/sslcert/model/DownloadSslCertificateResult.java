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
package com.nifty.cloud.sdk.sslcert.model;

import com.nifty.cloud.sdk.Result;
import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * DownloadSslCertificate結果処理クラス。<br />
 * このクラスはDownloadSslCertificateのレスポンスを格納します。
 *
 */
@XStreamAlias("DownloadSslCertificateResponse")
public class DownloadSslCertificateResult extends Result{

    /** リクエスト識別子 */
    @XStreamAlias("requestId")
    private String requestId;

    /** 証明書の発行識別子 */
    @XStreamAlias("fqdnId")
    private String fqdnId;

    /** FQDN */
    @XStreamAlias("fqdn")
    private String fqdn;

    /** ファイルデータ */
    @XStreamAlias("fileData")
    private String fileData;

    /**
     * リクエスト識別子を取得します。
     *
     * @return リクエスト識別子
     */
    public String getRequestId() {
        return requestId;
    }

    /**
     * リクエスト識別子を設定します。
     *
     * @param requestId リクエスト識別子
     */
    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    /**
     * リクエスト識別子を設定し、自オブジェクトを返します。
     *
     * @param requestId リクエスト識別子
     * @return 自オブジェクト
     */
    public DownloadSslCertificateResult withRequestId(String requestId) {
        setRequestId(requestId);
        return this;
    }

    /**
     * 証明書の発行識別子を取得します。
     *
     * @return 証明書の発行識別子
     */
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
    public DownloadSslCertificateResult withFqdnId(String fqdnId) {
        setFqdnId(fqdnId);
        return this;
    }

    /**
     * FQDNを取得します。
     *
     * @return FQDN
     */
    public String getFqdn() {
        return fqdn;
    }

    /**
     * FQDNを設定します。
     *
     * @param fqdn FQDN
     */
    public void setFqdn(String fqdn) {
        this.fqdn = fqdn;
    }

    /**
     * FQDNを設定し、自オブジェクトを返します。
     *
     * @param fqdn FQDN
     * @return 自オブジェクト
     */
    public DownloadSslCertificateResult withFqdn(String fqdn) {
        setFqdn(fqdn);
        return this;
    }

    /**
     * ファイルデータを取得します。
     *
     * @return ファイルデータ
     */
    public String getFileData() {
        return fileData;
    }

    /**
     * ファイルデータを設定します。
     *
     * @param fileData ファイルデータ
     */
    public void setFileData(String fileData) {
        this.fileData = fileData;
    }

    /**
     * ファイルデータを設定し、自オブジェクトを返します。
     *
     * @param fileData ファイルデータ
     * @return 自オブジェクト
     */
    public DownloadSslCertificateResult withFileData(String fileData) {
        setFileData(fileData);
        return this;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("[requestId=");
        builder.append(requestId);
        builder.append(", fqdnId=");
        builder.append(fqdnId);
        builder.append(", fqdn=");
        builder.append(fqdn);
        builder.append(", fileData=");
        builder.append(fileData);
        builder.append("]");
        return builder.toString();
    }
}
