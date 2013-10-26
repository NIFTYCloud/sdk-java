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
 *  API Version: 1.15
 *  Date: 2013-06-28 17:00:00
 *
 */
package com.nifty.cloud.sdk.sslcert.model;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * UpLoadSslCertificate処理結果クラス<br />
 * このクラスはUpLoadSslCertificateのレスポンスを格納します。
 *
 */
@XStreamAlias("UploadSslCertificateResponse")
public class UploadSslCertificateResult extends com.nifty.cloud.sdk.Result {

    /** リクエスト識別子 */
    @XStreamAlias("requestId")
    private String requestId;

    /** 証明書の発行識別子 */
    @XStreamAlias("fqdnId")
    private String fqdnId;

    /** FQDN */
    @XStreamAlias("fqdn")
    private String fqdn;

    /** キーフィンガープリント */
    @XStreamAlias("keyFingerprint")
    private String keyFingerprint;

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
    public UploadSslCertificateResult withRequestId(String requestId) {
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
    public UploadSslCertificateResult withFqdnId(String fqdnId) {
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
     * @param fqdn
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
    public UploadSslCertificateResult withFqdn(String fqdn) {
        setFqdn(fqdn);
        return this;
    }

    /**
     * キーフィンガープリントを取得します。
     *
     * @return キーフィンガープリント
     */
    public String getKeyFingerprint() {
        return keyFingerprint;
    }

    /**
     * キーフィンガープリントを設定します。
     *
     * @param keyFingerprint キーフィンガープリント
     */
    public void setKeyFingerprint(String keyFingerprint) {
        this.keyFingerprint = keyFingerprint;
    }

    /**
     * キーフィンガープリントを設定し、自オブジェクトを返します。
     *
     * @param keyFingerprint キーフィンガープリント
     * @return 自オブジェクト
     */
    public UploadSslCertificateResult withKeyFingerprint(String keyFingerprint) {
        setKeyFingerprint(keyFingerprint);
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
        builder.append(", keyFingerprint=");
        builder.append(keyFingerprint);
        builder.append("]");
        return builder.toString();
    }
}
