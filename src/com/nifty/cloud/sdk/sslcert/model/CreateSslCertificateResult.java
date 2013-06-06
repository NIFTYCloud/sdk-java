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
package com.nifty.cloud.sdk.sslcert.model;

import com.nifty.cloud.sdk.Result;
import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * CreateSslCertificate処理結果クラス。<br />
 * このクラスはCreateSslCertificateのレスポンスを格納します。
 * 
 */
@XStreamAlias("CreateSslCertificateResponse")
public class CreateSslCertificateResult extends Result {

    /** リクエスト識別子 */
    @XStreamAlias("requestId")
    private String requestId;

    /** 証明書の発行識別子 */
    @XStreamAlias("fqdnId")
    private String fqdnId;

    /** FQDN */
    @XStreamAlias("fqdn")
    private String fqdn;

    /** 認証局 */
    @XStreamAlias("certAuthority")
    private String certAuthority;

    /** 有効月数 */
    @XStreamAlias("validityTerm")
    private Integer validityTerm;

    /** 発行ステータス */
    @XStreamAlias("certState")
    private String certState;

    /** 承認者メールアドレス */
    @XStreamAlias("approverEmailAddress")
    private String approverEmailAddress;

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
    public CreateSslCertificateResult withRequestId(String requestId) {
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
    public CreateSslCertificateResult withFqdnId(String fqdnId) {
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
    public CreateSslCertificateResult withFqdn(String fqdn) {
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
     * 認証局を設定し、自オブジェクトを返します。
     * 
     * @param certAuthority 認証局
     * @return 自オブジェクト
     */
    public CreateSslCertificateResult withCertAuthority(String certAuthority) {
        setCertAuthority(certAuthority);
            return this;
    }

    /**
     * 有効月数を取得します。
     *
     * @return 有効月数
     */
    public Integer getValidityTerm() {
        return validityTerm;
    }

    /**
     * 有効月数を設定します。
     *
     * @param validityTerm 有効月数
     */
    public void setValidityTerm(Integer validityTerm) {
        this.validityTerm = validityTerm;
    }

    /**
     * 有効月数を設定し、自オブジェクトを返します。
     *
     * @param validityTerm 有効月数
     * @return 自オブジェクト
     */
    public CreateSslCertificateResult withValidityTerm(Integer validityTerm) {
        setValidityTerm(validityTerm);
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
     * @param certState 発行ステータス
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
    public CreateSslCertificateResult withCertState(String certState) {
        setCertState(certState);
        return this;
    }

    /**
     * 承認者メールアドレスを取得します。
     * 
     * @return 承認者メールアドレス
     */
    public String getApproverEmailAddress() {
        return approverEmailAddress;
    }

    /**
     * 承認者メールアドレスを設定します。
     * 
     * @param approverEmailAddress 承認者メールアドレス
     */
    public void setApproverEmailAddress(String approverEmailAddress) {
        this.approverEmailAddress = approverEmailAddress;
    }

    /**
     * 承認者メールアドレスを設定し、自オブジェクトを返します。
     * 
     * @param approverEmailAddress 承認者メールアドレス
     * @return 自オブジェクト
     */
    public CreateSslCertificateResult withApproverEmailAddress(
        String approverEmailAddress) {
        setApproverEmailAddress(approverEmailAddress);
        return this;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("requestId=");
        builder.append(requestId);
        builder.append(", fqdnId=");
        builder.append(fqdnId);
        builder.append(", fqdn=");
        builder.append(fqdn);
        builder.append(", certAuthority=");
        builder.append(certAuthority);
        builder.append(", validityTerm=");
        builder.append(validityTerm);
        builder.append(", certState=");
        builder.append(certState);
        builder.append(", approverEmailAddress=");
        builder.append(approverEmailAddress);
        return builder.toString();
    }
}
