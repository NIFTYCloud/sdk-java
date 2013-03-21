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
 *  API Version: 1.11
 *  Date: 2011-08-25 09:46:38
 *
 */
package com.nifty.cloud.sdk.sslcert.model;

import java.util.Date;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * 有効期間クラス。<br />
 * このクラスは有効期間情報を格納します。
 *
 */
public class Period {

    /** 有効期間（開始日） */
    @XStreamAlias("startDate")
    private Date startDate;

    /** 有効期間（終了日） */
    @XStreamAlias("endDate")
    private Date endDate;

    /**
     * 有効期間（開始日）を取得します。
     *
     * @return 有効期間（開始日）
     */
    public Date getStartDate() {
        return startDate;
    }

    /**
     * 有効期間（開始日）を設定します。
     *
     * @param startDate 有効期間（開始日）
     */
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    /**
     * 有効期間（開始日）を設定し、自オブジェクトを設定します。
     * @param startDate 有効期間（開始日）
     * @return 自オブジェクト
     */
    public Period withStartDate(Date startDate) {
        setStartDate(startDate);
        return this;
    }

    /**
     * 有効期間（終了日）を取得します。
     *
     * @return 有効期間（終了日）
     */
    public Date getEndDate() {
        return endDate;
    }

    /**
     * 有効期間（終了日）を設定します。
     *
     * @param endDate 有効期間（終了日）
     */
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    /**
     * 有効期間（終了日）を設定し、自オブジェクトを返します。
     *
     * @param endDate 有効期間（終了日）
     * @return 自オブジェクト
     */
    public Period withEndDate(Date endDate) {
        setEndDate(endDate);
        return this;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString(){
        StringBuilder builder = new StringBuilder();
        builder.append("[startDate=");
        builder.append(startDate);
        builder.append(", endDate=");
        builder.append(endDate);
        builder.append("]");
        return builder.toString();
    }
}
