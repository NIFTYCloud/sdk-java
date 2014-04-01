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

import com.nifty.cloud.sdk.Request;
import com.nifty.cloud.sdk.annotation.Action;
import com.nifty.cloud.sdk.annotation.Query;

/**
 * ModifySslCertificateAttributeリクエストクラス。<br />
 * このクラスはModifySslCertificateAttributeへのリクエストを構築します。
 */
@Action("ModifySslCertificateAttribute")
public class ModifySslCertificateAttributeRequest implements Request {

    /** 証明書の発行識別子 */
    private String fqdnId;

    /** メモ情報 */
    private Description description;

    /**
     * デフォルトコンストラクタ。
     */
    public ModifySslCertificateAttributeRequest(){
    }
    /**
     * 証明書の発行識別子を指定し、ModifySslCertificateAttributeRequestを構築します。
     * @param fqdnId 証明書の発行識別子
     */
    public ModifySslCertificateAttributeRequest(String fqdnId){
    	this.fqdnId = fqdnId;
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
     * @param fqdnId 証明書の発行識別子
     * @return 自オブジェクト
     */
    public ModifySslCertificateAttributeRequest withFqdnId(String fqdnId) {
        setFqdnId(fqdnId);
        return this;
    }

    /**
     * メモ情報を取得します。
     *
     * @return メモ情報
     */
    @Query(name = "Description")
    public Description getDescription() {
        return description;
    }

    /**
     * メモ情報を設定します。
     *
     * @param description メモ情報
     */
    public void setDescription(Description description) {
        this.description = description;
    }

    /**
     * メモ情報を設定し、自オブジェクトを返します。
     *
     * @param description
     * @return メモ情報
     */
    public ModifySslCertificateAttributeRequest withDescription(Description description) {
        setDescription(description);
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
        builder.append(", description=");
        builder.append(description);
        builder.append("]");
        return builder.toString();
    }
}
