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
package com.nifty.cloud.sdk.sslcert;

import java.util.concurrent.Future;

import com.nifty.cloud.sdk.sslcert.model.CreateSslCertificateRequest;
import com.nifty.cloud.sdk.sslcert.model.CreateSslCertificateResult;
import com.nifty.cloud.sdk.sslcert.model.DeleteSslCertificateRequest;
import com.nifty.cloud.sdk.sslcert.model.DeleteSslCertificateResult;
import com.nifty.cloud.sdk.sslcert.model.DescribeSslCertificateAttributeRequest;
import com.nifty.cloud.sdk.sslcert.model.DescribeSslCertificateAttributeResult;
import com.nifty.cloud.sdk.sslcert.model.DescribeSslCertificatesRequest;
import com.nifty.cloud.sdk.sslcert.model.DescribeSslCertificatesResult;
import com.nifty.cloud.sdk.sslcert.model.DownloadSslCertificateRequest;
import com.nifty.cloud.sdk.sslcert.model.DownloadSslCertificateResult;
import com.nifty.cloud.sdk.sslcert.model.ModifySslCertificateAttributeRequest;
import com.nifty.cloud.sdk.sslcert.model.ModifySslCertificateAttributeResult;
import com.nifty.cloud.sdk.sslcert.model.RegisterCorporateInfoForCertificateRequest;
import com.nifty.cloud.sdk.sslcert.model.RegisterCorporateInfoForCertificateResult;
import com.nifty.cloud.sdk.sslcert.model.UploadSslCertificateRequest;
import com.nifty.cloud.sdk.sslcert.model.UploadSslCertificateResult;

/**
 * NIFTY Cloud API 非同期クライアント　インタフェース。
 * SSL証明書カテゴリクライアント。<br />
 * SSL証明書カテゴリの非同期クライアントのインタフェースです。<br />
 * 戻り値の"利用不可"パラメータは返却値がnullまたは空となります。
 *
 */
public interface NiftySslCertAsync extends NiftySslCert {

    /**
     * 非同期でSSL証明書の申請法人情報登録・更新を行います。
     *
     * @param request RegisterCorporateInfoForCertificateリクエスト
     * @return 非同期処理結果
     */
    public Future<RegisterCorporateInfoForCertificateResult> registerCorporateInfoForCertificateAsync(
            RegisterCorporateInfoForCertificateRequest request);

    /**
     * 非同期でSSL証明書の発行申請・更新を行います。
     *
     * @param request CreateSslCertificateリクエスト<br />
     * &nbsp;	CertInfo#countryNameは利用不可<br />
     * &nbsp;	CertInfo#emailAddressは利用不可
     * @return 非同期処理結果
     */
    public Future<CreateSslCertificateResult> createSslCertificateAsync(CreateSslCertificateRequest request);

    /**
     * 非同期でSSL証明書の情報を取得します。
     *
     * @param request DescribeSslCertificatesリクエスト
     * @return 非同期処理結果
     */
    public Future<DescribeSslCertificatesResult> describeSslCertificatesAsync(DescribeSslCertificatesRequest request);

    /**
     * 非同期で指定したSSL証明書の詳細情報を取得します。
     *
     * @param request DescribeSslCertificateAttributeリクエスト
     * @return 非同期処理結果
     */
    public Future<DescribeSslCertificateAttributeResult> describeSslCertificateAttributeAsync(DescribeSslCertificateAttributeRequest request);

    /**
     * 非同期で指定したSSL証明書情報を更新します。
     *
     * @param request ModifySslCertificateAttributeリクエスト
     * @return 非同期処理結果
     */
    public Future<ModifySslCertificateAttributeResult> modifySslCertificateAttributeAsync(ModifySslCertificateAttributeRequest request);

    /**
     * 非同期で指定されたSSL証明書の削除を行います。
     *
     * @param request DeleteSslCertificateリクエスト
     * @return 非同期処理結果
     */
    public Future<DeleteSslCertificateResult> deleteSslCertificateAsync(DeleteSslCertificateRequest request);

    /**
     * 非同期でSSL証明書のアップロードを行います。
     *
     * @param request UploadSslCertificateリクエスト
     * @return 非同期処理結果
     */
    public Future<UploadSslCertificateResult> uploadSslCertificateAsync(UploadSslCertificateRequest request);

    /**
     * 非同期で指定されたSSL証明書のダウンロードを行います。
     *
     * @param request DownloadSslCertificateリクエスト
     * @return 非同期処理結果
     */
    public Future<DownloadSslCertificateResult> downloadSslCertificateAsync(DownloadSslCertificateRequest request);

}
