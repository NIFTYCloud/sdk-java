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
package com.nifty.cloud.sdk.sslcert.model;

import com.nifty.cloud.sdk.Request;
import com.nifty.cloud.sdk.annotation.Action;
import com.nifty.cloud.sdk.annotation.Query;

/**
 * CreateSslCertificateリクエストクラス。<br />
 * このクラスはCreateSslCertificateへのリクエストを構築します。
 */
@Action("CreateSslCertificate")
public class CreateSslCertificateRequest implements Request{

    /** 証明書の発行識別子 */
    private String fqdnId;

    /** FQDN */
    private String fqdn;

    /** 認証局 */
    private String certAuthority;

    /** 数量 */
    private Integer count;

    /** 有効月数 */
    private Integer validityTerm;

    /** 鍵長 */
    private Integer keyLength;

    /** 承認者メールアドレス */
    private String approverEmailAddress;

    /** SSL証明書の発行申請情報 */
    private CertInfo certInfo;

    /**
     * 証明書の識別子を取得します。
     * 
     * @return 証明書の識別子
     */
    @Query(name = "FqdnId")
    public String getFqdnId() {
	return fqdnId;
    }

    /**
     * 証明書の識別子を設定します。
     * 
     * @param fqdnId 証明書の識別子
     */
    public void setFqdnId(String fqdnId) {
	this.fqdnId = fqdnId;
    }

    /**
     * 証明書の識別子を設定し、自オブジェクトを返します。
     * 
     * @param fqdnId 証明書の識別子
     * @return 自オブジェクト
     */
    public CreateSslCertificateRequest withFqdnId(String fqdnId) {
	setFqdnId(fqdnId);
	return this;
    }
    
    /**
     * FQDNを取得します。
     *
     * @return FQDN
     */
    @Query(name = "Fqdn")
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
    public CreateSslCertificateRequest withFqdn(String fqdn) {
        setFqdn(fqdn);
        return this;
    }

    /**
     * 認証局を取得します。
     * 
     * @return 認証局
     */
    @Query(name = "CertAuthority")
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
    public CreateSslCertificateRequest withCertAuthority(String certAuthority) {
        setCertAuthority(certAuthority);
        return this;
    }

    /**
     * 数量を取得します。
     *
     * @return 数量
     */
    @Query(name = "Count")
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
    public CreateSslCertificateRequest withCount(Integer count) {
        setCount(count);
        return this;
    }

    /**
     * 有効月数を取得します。
     *
     * @return 有効月数
     */
    @Query(name = "ValidityTerm")
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
    public CreateSslCertificateRequest withValidityTerm(Integer validityTerm) {
        setValidityTerm(validityTerm);
        return this;
    }

    /**
     * 鍵長を取得します。
     *
     * @return 鍵長
     */
    @Query(name = "KeyLength")
    public Integer getKeyLength() {
        return keyLength;
    }

    /**
     * 鍵長を設定します。
     *
     * @param keyLength 鍵長
     */
    public void setKeyLength(Integer keyLength) {
        this.keyLength = keyLength;
    }

    /**
     * 鍵長を設定し、自オブジェクトを返します。
     *
     * @param keyLength 鍵長
     * @return 自オブジェクト
     */
    public CreateSslCertificateRequest withKeyLength(Integer keyLength) {
        setKeyLength(keyLength);
        return this;
    }

    /**
     * 承認者メールアドレスを取得します。
     * 
     * @return 承認者メールアドレス
     */
    @Query(name = "ApproverEmailAddress")
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
    public CreateSslCertificateRequest withApproverEmailAddress(
            String approverEmailAddress) {
        setApproverEmailAddress(approverEmailAddress);
        return this;
    }

    /**
     * SSL証明書の発行申請情報を取得します。
     *
     * @return SSL証明書の発行申請情報
     */
    @Query(name = "CertInfo")
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
    public CreateSslCertificateRequest withCertInfo(CertInfo certInfo) {
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
        builder.append(", validityTerm=");
        builder.append(validityTerm);
        builder.append(", keyLength=");
        builder.append(keyLength);
        builder.append(", approverEmailAddress=");
        builder.append(approverEmailAddress);
        builder.append(", certInfo=");
        builder.append(certInfo);
        builder.append("]");
        return builder.toString();
    }
}
