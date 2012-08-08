/*******************************************************************************
 *  Copyright 2011 NIFTY Corporation All Rights Reserved.
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
 *  API Version: 1.9
 *  Date: 2011-08-25 09:46:38
 *
 */
package com.nifty.cloud.sdk.sslcert.model;


import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.nifty.cloud.sdk.Request;
import com.nifty.cloud.sdk.annotation.Action;
import com.nifty.cloud.sdk.annotation.Query;

/**
 * DescribeSslCertificatesリクエストクラス。<br />
 * このクラスはDescribeSslCertificatesへのリクエストを構築します。
 *
 */
@Action("DescribeSslCertificates")
public class DescribeSslCertificatesRequest implements Request {

    /** 取得したいSSL証明書の絞り込み条件リスト */
    private List<FqdnSet> fqdnSet;

    /**
     * 取得したいSSL証明書の絞り込み条件リストを取得します。
     *
     * @return 取得したいSSL証明書の絞り込み条件リスト
     */
    @Query(name="")
    public List<FqdnSet> getFqdnSet() {
        return fqdnSet;
    }

    /**
     * 取得したいSSL証明書の絞り込み条件リストを設定します。
     *
     * @param fqdnSet 取得したいSSL証明書の絞り込み条件リスト
     */
    public void setFqdnSet(List<FqdnSet> fqdnSet) {
        this.fqdnSet = fqdnSet;
    }

    /**
     * 取得したいSSL証明書の絞り込み条件の配列を設定し、自オブジェクトを返します。
     *
     * @param fqdnSet 取得したいSSL証明書の絞り込み条件の配列
     * @return 自オブジェクト
     */
    public DescribeSslCertificatesRequest withFqdnSet(FqdnSet... fqdnSet){
        if(this.fqdnSet == null) this.fqdnSet = new ArrayList<FqdnSet>();
        for(FqdnSet fqdnInfo:fqdnSet){
            getFqdnSet().add(fqdnInfo);
        }
        return this;
    }

    /**
     * 取得したいSSL証明書の絞り込み条件リストを設定し、自オブジェクトを返します。
     *
     * @param fqdnSet 取得したいSSL証明書の絞り込み条件リスト
     * @return 自オブジェクト
     */
    public DescribeSslCertificatesRequest withFqdnSet(Collection<FqdnSet> fqdnSet) {
        if (this.fqdnSet == null) this.fqdnSet = new ArrayList<FqdnSet>();
        if (fqdnSet != null) {
            getFqdnSet().addAll(fqdnSet);
        }
        return this;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("[fqdnSet=");
        builder.append(fqdnSet);
        builder.append("]");
        return builder.toString();
    }
}
