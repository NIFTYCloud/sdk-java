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
 * DescribeSslCertificateAttributeリクエストクラス。<br />
 * このクラスはDescribeSslCertificateAttributeへのリクエストを構築します。
 */
@Action("DescribeSslCertificateAttribute")
public class DescribeSslCertificateAttributeRequest implements Request {

    /** 証明書の発行識別子 */
    private String fqdnId;

    /** 属性 */
    private String attribute;

    /**
     * デフォルトコンストラクタ。
     */
    public DescribeSslCertificateAttributeRequest(){
    }
    /**
     * 証明書の発行識別子を指定し、DescribeSslCertificateAttributeRequestを構築します。
     * @param fqdnId 証明書の発行識別子
     */
    public DescribeSslCertificateAttributeRequest(String fqdnId){
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
     *
     * @param fqdnId 証明書の発行識別子
     * @return 自オブジェクト
     */
    public DescribeSslCertificateAttributeRequest withFqdnId(String fqdnId) {
        setFqdnId(fqdnId);
        return this;
    }

    /**
     * 属性を取得します。
     *
     * @return 属性
     */
    @Query(name = "Attribute")
    public String getAttribute() {
        return attribute;
    }

    /**
     * 属性を設定します。
     *
     * @param attribute 属性
     */
    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    /**
     * 属性を設定し、自オブジェクトを返します。
     *
     * @param attribute 属性
     * @return 自オブジェクト
     */
    public DescribeSslCertificateAttributeRequest withAttribute(String attribute) {
        setAttribute(attribute);
        return this;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString(){
        StringBuilder builder = new StringBuilder();
        builder.append("[fqdnId=");
        builder.append(fqdnId);
        builder.append(", attribute=");
        builder.append(attribute);
        builder.append("]");
        return builder.toString();
    }
}
