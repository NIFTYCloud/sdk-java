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
package com.nifty.cloud.sdk.sslcert.model;


/**
 * 取得したSSL証明書の情報クラス。<br />
 * このクラスは取得したSSL証明書の情報を格納します。
 *
 */
public class SslCertification {

    /** 証明書の発行識別子 */
    private String fqdnId;

    /** FQDN */
    private String fqdn;

    /** 認証局 */
    private String certAuthority;

    /** 数量 */
    private Integer count;

    /** 発行ステータス */
    private String certState;

    /** 有効期間 */
    private Period period;

    /** 鍵長　（bit単位） */
    private Integer keyLength;

    /** アップロード情報 */
    private Boolean uploadState;

    /** SSL証明書メモ情報 */
    private String description;

    /** SSL証明書の発行申請情報 */
    private CertInfo certInfo;

    /**
     * 証明書の発行識別子を取得します。
     *
     * @return fqdnId 証明書の発行識別子
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
    public SslCertification withFqdnId(String fqdnId) {
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
     * @param fqdn
     * @return 自オブジェクト
     */
    public SslCertification withFqdn(String fqdn) {
        setFqdn(fqdn);
        return this;
    }

    /**
     * 認証局を取得します。
     * 
     * @return 認証局
     */
    public String getCertAuthority() {
        return certAuthority;
    }

    /**
     * 認証局を設定します。
     * 
     * @param certAuthority 認証局
     */
    public void setCertAuthority(String certAuthority) {
        this.certAuthority = certAuthority;
    }

    /**
     * 認証局を設定し、自オブジェクトを返却します。
     * 
     * @param certAuthority 認証局
     * @return 自オブジェクト
     */
    public SslCertification withCertAuthority(String certAuthority) {
        setCertAuthority(certAuthority);
        return this;
    }

    /**
     * 数量を取得します。
     *
     * @return 数量
     */
    public Integer getCount() {
        return count;
    }

    /**
     * 数量を設定します。
     *
     * @param count 数量
     */
    public void setCount(Integer count) {
        this.count = count;
    }

    /**
     * 数量を設定し、自オブジェクトを返します。
     *
     * @param count 数量
     * @return 自オブジェクト
     */
    public SslCertification withCount(Integer count) {
        setCount(count);
        return this;
    }

    /**
     * 発行ステータスを取得します。
     *
     * @return 発行ステータス
     */
    public String getCertState() {
        return certState;
    }

    /**
     * 発行ステータスを設定します。
     *
     * @param certState
     */
    public void setCertState(String certState) {
        this.certState = certState;
    }

    /**
     * 発行ステータスを設定し、自オブジェクトを返します。
     *
     * @param certState 発行ステータス
     * @return 自オブジェクト
     */
    public SslCertification withCertState(String certState) {
        setCertState(certState);
        return this;
    }

    /**
     * 有効期間を取得します。
     *
     * @return 有効期間
     */
    public Period getPeriod() {
        return period;
    }

    /**
     * 有効期間を設定します。
     *
     * @param period 有効期間
     */
    public void setPeriod(Period period) {
        this.period = period;
    }

    /**
     * 有効期間を設定し、自オブジェクトを返します。
     *
     * @param period 有効期間
     * @return 自オブジェクト
     */
    public SslCertification withPeriod(Period period) {
        setPeriod(period);
        return this;
    }

    /**
     * 鍵長　（bit単位）を取得します。
     *
     * @return 鍵長　（bit単位）
     */
    public Integer getKeyLength() {
        return keyLength;
    }

    /**
     * 鍵長　（bit単位）を設定します。
     *
     * @param keyLength 鍵長　（bit単位）
     */
    public void setKeyLength(Integer keyLength) {
        this.keyLength = keyLength;
    }

    /**
     * 鍵長　（bit単位）を設定し、自オブジェクトを返します。
     *
     * @param keyLength 鍵長　（bit単位）
     * @return 自オブジェクト
     */
    public SslCertification withKeyLength(Integer keyLength) {
        setKeyLength(keyLength);
        return this;
    }

    /**
     * アップロード情報を取得します。
     *
     * @return アップロード情報
     */
    public Boolean getUploadState() {
        return uploadState;
    }

    /**
     * アップロード情報を設定します。
     *
     * @param uploadState アップロード情報
     */
    public void setUploadState(Boolean uploadState) {
        this.uploadState = uploadState;
    }

    /**
     * アップロード情報を設定し、自オブジェクトを返します。
     *
     * @param uploadState アップロード情報
     * @return 自オブジェクト
     */
    public SslCertification withUploadState(Boolean uploadState) {
        setUploadState(uploadState);
        return this;
    }

    /**
     * SSL証明書メモ情報を取得します。
     *
     * @return SSL証明書メモ情報
     */
    public String getDescription() {
        return description;
    }

    /**
     * SSL証明書メモ情報を設定します。
     *
     * @param description SSL証明書メモ情報
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * SSL証明書メモ情報を設定し、自オブジェクトを返します。
     *
     * @param description SSL証明書メモ情報
     * @return 自オブジェクト
     */
    public SslCertification withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * SSL証明書の発行申請情報を取得します。
     *
     * @return SSL証明書の発行申請情報
     */
    public CertInfo getCertInfo() {
        return certInfo;
    }

    /**
     * SSL証明書の発行申請情報を設定します。
     *
     * @param certInfo SSL証明書の発行申請情報
     */
    public void setCertInfo(CertInfo certInfo) {
        this.certInfo = certInfo;
    }

    /**
     * SSL証明書の発行申請情報を設定し、自オブジェクトを返します。
     *
     * @param certInfo SSL証明書の発行申請情報
     * @return 自オブジェクト
     */
    public SslCertification withCertInfo(CertInfo certInfo) {
        setCertInfo(certInfo);
        return this;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("[fqdnId=");
        builder.append(fqdnId);
        builder.append(", fqdn=");
        builder.append(fqdn);
        builder.append(", certAuthority=");
        builder.append(certAuthority);
        builder.append(", count=");
        builder.append(count);
        builder.append(", certState=");
        builder.append(certState);
        builder.append(",period=");
        builder.append(period);
        builder.append(", keyLength=");
        builder.append(keyLength);
        builder.append(", uploadState=");
        builder.append(uploadState);
        builder.append(", description=");
        builder.append(description);
        builder.append(", certInfo=");
        builder.append(certInfo);
        return builder.toString();
    }
}
