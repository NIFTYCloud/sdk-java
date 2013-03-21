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
package com.nifty.cloud.sdk.sslcert;

import java.io.IOException;

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
 * NIFTY Cloud API クライアント インタフェース。
 * SSL証明書カテゴリ クライアント。<br />
 * SSL証明書カテゴリの同期クライアントのインタフェースです。<br />
 * 戻り値の"利用不可"パラメータは返却値がnullまたは空となります。
 *
 */
public interface NiftySslCert {

    /**
     * エンドポイントを設定します。
     *
     * @param endpoint エンドポイント
     */
    public void setEndpoint(String endpoint);

    /**
     * SSL証明書の申請法人情報登録・更新を行います。
     *
     * @param request RegisterCorporateInfoForCertificateリクエスト
     * @return RegisterCorporateInfoForCertificate処理結果
     */
    public RegisterCorporateInfoForCertificateResult registerCorporateInfoForCertificate(RegisterCorporateInfoForCertificateRequest request);

    /**
     * SSL証明書の発行申請・更新を行います。
     *
     * @param request CreateSslCertificateリクエスト<br />
     * &nbsp;	CertInfo#countryNameは利用不可<br />
     * &nbsp;	CertInfo#emailAddressは利用不可
     * @return CreateSslCertificate処理結果
     */
    public CreateSslCertificateResult createSslCertificate(CreateSslCertificateRequest request);

    /**
     * 利用規約の文言を取得します。
     *
     * @return 利用規約
     * @throws IOException
     */
	public String getCorporateInformationMessage() throws IOException;

    /**
     * SSL証明書の情報を取得します。
     *
     * @param request DescribeSslCertificatesリクエスト
     * @return DescribeSslCertificates処理結果
     */
    public DescribeSslCertificatesResult describeSslCertificates(DescribeSslCertificatesRequest request);

    /**
     * 指定したSSL証明書の詳細情報を取得します。
     *
     * @param request DescribeSslCertificateAttributeリクエスト
     * @return DescribeSslCertificateAttribute処理結果
     */
    public DescribeSslCertificateAttributeResult describeSslCertificateAttribute(DescribeSslCertificateAttributeRequest request);

    /**
     * 指定したSSL証明書情報を更新します。
     *
     * @param request ModifySslCertificateAttributeリクエスト
     * @return ModifySslCertificateAttribute処理結果
     */
    public ModifySslCertificateAttributeResult modifySslCertificateAttribute(ModifySslCertificateAttributeRequest request);

    /**
     * 指定されたSSL証明書の削除を行います。
     *
     * @param request DeleteSslCertificateリクエスト
     * @return DeleteSslCertificate処理結果
     */
    public DeleteSslCertificateResult deleteSslCertificate(DeleteSslCertificateRequest request);

    /**
     * SSL証明書のアップロードを行います。
     *
     * @param request UploadSslCertificateリクエスト
     * @return UploadSslCertificate処理結果
     */
    public UploadSslCertificateResult uploadSslCertificate(UploadSslCertificateRequest request);

    /**
     * 指定されたSSL証明書のダウンロードを行います。
     *
     * @param request DownloadSslCertificateリクエスト
     * @return DownloadSslCertificate処理結果
     */
    public DownloadSslCertificateResult downloadSslCertificate(DownloadSslCertificateRequest request);

}
