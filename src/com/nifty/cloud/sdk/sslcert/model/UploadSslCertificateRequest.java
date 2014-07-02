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

import com.nifty.cloud.sdk.Request;
import com.nifty.cloud.sdk.annotation.Action;
import com.nifty.cloud.sdk.annotation.Query;

/**
 * UploadSslCertificateリクエストクラス。<br />
 * このクラスはUploadSslCertificateへのリクエストを構築します。
 */
@Action("UploadSslCertificate")
public class UploadSslCertificateRequest implements Request{

    /** 証明書ファイル */
    private String certificate;

    /** 秘密鍵ファイル */
    private String key;

    /** CA（認証局）ファイル */
    private String ca;

    /**
     * デフォルトコンストラクタ。
     */
    public UploadSslCertificateRequest(){
    }
    /**
     * 証明書ファイル、秘密鍵ファイルを指定し、UploadSslCertificateRequestを構築します。
     * @param certificate 証明書ファイル
     * @param key 秘密鍵ファイル
     */
    public UploadSslCertificateRequest(String certificate, String key){
    	this.certificate = certificate;
    	this.key = key;
    }
    /**
     * 証明書ファイルを取得します。
     *
     * @return 証明書ファイル
     */
    @Query(name = "Certificate", require = true)
    public String getCertificate() {
        return certificate;
    }

    /**
     * 証明書ファイルを設定します。
     *
     * @param certificate 証明書ファイル
     */
    public void setCertificate(String certificate) {
        this.certificate = certificate;
    }


    /**
     * 証明書ファイルを設定し、自オブジェクトを返します。
     *
     * @param certificate 証明書ファイル
     * @return 自オブジェクト
     */
    public UploadSslCertificateRequest withCertificate(String certificate) {
        setCertificate(certificate);
        return this;
    }

    /**
     * 秘密鍵ファイルを取得します。
     *
     * @return 秘密鍵ファイル
     */
    @Query(name = "Key", require = true)
    public String getKey() {
        return key;
    }

    /**
     * 秘密鍵ファイルを設定します。
     *
     * @param key 秘密鍵ファイル
     */
    public void setKey(String key) {
        this.key = key;
    }

    /**
     * 秘密鍵ファイルを設定し、自オブジェクトを返します。
     *
     * @param key 秘密鍵ファイル
     * @return 自オブジェクト
     */
    public UploadSslCertificateRequest withKey(String key) {
        setKey(key);
        return this;
    }

    /**
     * CA（認証局）ファイルを取得します。
     *
     * @return CA（認証局）ファイル
     */
    @Query(name = "Ca")
    public String getCa() {
        return ca;
    }

    /**
     * CA（認証局）ファイルを設定します。
     *
     * @param ca CA（認証局）ファイル
     */
    public void setCa(String ca) {
        this.ca = ca;
    }

    /**
     * CA（認証局）ファイルを設定し、自オブジェクトを返します。
     *
     * @param ca CA（認証局）ファイル
     * @return 自オブジェクト
     */
    public UploadSslCertificateRequest withCa(String ca) {
        setCa(ca);
        return this;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("[certificate=");
        builder.append(certificate);
        builder.append(", key=");
        builder.append(key);
        builder.append(", ca=");
        builder.append(ca);
        builder.append("]");
        return builder.toString();
    }
}
