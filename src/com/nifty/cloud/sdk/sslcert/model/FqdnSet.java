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

import com.nifty.cloud.sdk.annotation.Query;

/**
 * 取得したいSSL証明書の絞り込み条件クラス。<br />
 * このクラスは取得したいSSL証明書の絞り込み条件情報を格納します。
 * 
 */
public class FqdnSet {

    /** 証明書の発行識別子 */
    private String fqdnId;

    /** FQDN */
    private String fqdn;

    /**
     * 証明書の発行識別子を取得します。
     *
     * @return 証明書の発行識別子
     */
    @Query(name = "FqdnId", reverseSequence = true)
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
    public FqdnSet withFqdnId(String fqdnId) {
        setFqdnId(fqdnId);
        return this;
    }

    /**
     * FQDNを取得します。
     *
     * @return FQDN
     */
    @Query(name = "Fqdn", reverseSequence = true)
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
    public FqdnSet withFqdn(String fqdn) {
        setFqdn(fqdn);
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
        builder.append(",fqdn=");
        builder.append(fqdn);
        builder.append("]");
        return builder.toString();
    }
}
