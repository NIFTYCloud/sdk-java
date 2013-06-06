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
import com.nifty.cloud.sdk.sslcert.model.transform.DescribeSslCertificateAttributeResultConverter;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamConverter;

/**
 * DescribeSslCertificateAttribute結果処理クラス。<br />
 * このクラスはDescribeSslCertificateAttributeのレスポンスを格納します。
 *
 */
@XStreamAlias("DescribeSslCertificateAttributeResponse")
@XStreamConverter(DescribeSslCertificateAttributeResultConverter.class)
public class DescribeSslCertificateAttributeResult extends Result {

    /** リクエスト識別子 */
    @XStreamAlias("requestId")
    private String requestId;

    /** 取得したSSL証明書の情報 */
    @XStreamAlias("sslCertificateAttribute")
    private SslCertification sslCertificateAttribute;

    /**
     * リクエスト識別子を取得します。
     *
     * @return requestId リクエスト識別子
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
    public DescribeSslCertificateAttributeResult withRequestId(String requestId) {
        setRequestId(requestId);
        return this;
    }

    /**
     * 取得したSSL証明書の情報を取得します。
     *
     * @return 取得したSSL証明書の情報
     */
    public SslCertification getSslCertificateAttribute() {
        return sslCertificateAttribute;
    }

    /**
     * 取得したSSL証明書の情報を設定します。
     *
     * @param sslCertificateAttribute 取得したSSL証明書の情報
     */
    public void setSslCertificateAttribute(SslCertification sslCertificateAttribute) {
        this.sslCertificateAttribute = sslCertificateAttribute;
    }

    /**
     * 取得したSSL証明書の情報を設定し、自オブジェクトを返します。
     *
     * @param sslCertificateAttribute 取得したSSL証明書の情報
     * @return 自オブジェクト
     */
    public DescribeSslCertificateAttributeResult withSslCertificateAttribute(SslCertification sslCertificateAttribute) {
        setSslCertificateAttribute(sslCertificateAttribute);
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
        builder.append("[requestId=");
        builder.append(requestId);
        builder.append(", sslCertificateAttribute=");
        builder.append(sslCertificateAttribute);
        builder.append("]");
        return builder.toString();
    }
}
