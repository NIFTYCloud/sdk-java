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

import com.nifty.cloud.sdk.annotation.Query;

/**
 * メモ情報クラス。<br />
 * このクラスはメモ情報を格納します。
 */
public class Description {

    /** メモ情報の更新値 */
    private String value;

    /**
     * メモ情報の更新値を取得します。
     *
     * @return メモ情報の更新値
     */
    @Query(name="Value")
    public String getValue() {
        return value;
    }

    /**
     * メモ情報の更新値を設定します。
     *
     * @param value メモ情報の更新値
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * 値を設定し、自オブジェクトを返します。
     *
     * @param value 値
     * @return 自オブジェクト
     */
    public Description withValue(String value) {
        setValue(value);
        return this;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("[value=");
        builder.append(value);
        builder.append("]");
        return builder.toString();
    }
}
