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

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.nifty.cloud.sdk.Result;
import com.nifty.cloud.sdk.sslcert.model.transform.DescribeSslCertificatesConverter;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamConverter;

/**
 * DescribeSslCertificates結果処理クラス。<br />
 * このクラスはDescribeSslCertificatesのレスポンスを格納します。
 *
 */
@XStreamAlias("DescribeSslCertificatesResponse")
public class DescribeSslCertificatesResult extends Result{

    /** リクエスト識別子 */
    @XStreamAlias("requestId")
    private String requestId;

    /** 取得したSSL証明書の情報リスト */
    @XStreamAlias("certsSet")
    @XStreamConverter(DescribeSslCertificatesConverter.class)
    private List<SslCertification> sslCertifications;

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
    public DescribeSslCertificatesResult withRequestId(String requestId) {
        setRequestId(requestId);
        return this;
    }

    /**
     * 取得したSSL証明書の情報リストを取得します。
     *
     * @return 取得したSSL証明書の情報リスト
     */
    public List<SslCertification> getSslCertifications() {
        return sslCertifications;
    }

    /**
     * 取得したSSL証明書の情報リストを設定します。
     *
     * @param sslCertifications 取得したSSL証明書の情報リスト
     */
    public void setSslCertifications(List<SslCertification> sslCertifications) {
        this.sslCertifications = sslCertifications;
    }

    /**
     * 取得したSSL証明書の情報の配列を設定し、自オブジェクトを返します。
     *
     * @param sslCertifications 取得したSSL証明書の情報の配列
     * @return 自オブジェクト
     */
    public DescribeSslCertificatesResult withSslCertifications(SslCertification... sslCertifications) {
        if (this.sslCertifications == null) this.sslCertifications = new ArrayList<SslCertification>();
        for (SslCertification sslCertification : sslCertifications) {
            getSslCertifications().add(sslCertification);
        }
        return this;
    }

    /**
     * 取得したSSL証明書の情報リストを設定し、自オブジェクトを返します。
     *
     * @param sslCertifications 取得したSSL証明書の情報リスト
     * @return 自オブジェクト
     */
    public DescribeSslCertificatesResult withSslCertifications(Collection<SslCertification> sslCertifications) {
        if (this.sslCertifications == null) this.sslCertifications = new ArrayList<SslCertification>();
        if (sslCertifications != null) {
            getSslCertifications().addAll(sslCertifications);
        }
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
        builder.append(", sslCertifications=");
        builder.append(sslCertifications);
        builder.append("]");
        return builder.toString();
    }
}
