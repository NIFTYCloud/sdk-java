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
package com.nifty.cloud.sdk.sslcert;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import com.nifty.cloud.sdk.ClientConfiguration;
import com.nifty.cloud.sdk.auth.Credentials;
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
 * NIFTY Cloud API 非同期クライアント 具象クラス。
 * SSL証明書カテゴリクライアント。<br />
 * SSL証明書カテゴリの非同期クライアントの具象クラスです。<br />
 * 戻り値の"利用不可"パラメータは返却値がnullまたは空となります。
 *
 */
public class NiftySslCertAsyncClient extends NiftySslCertClient implements NiftySslCertAsync {

    /** 非同期タスク実行クラス. */
    protected ExecutorService executorService = null;

    /**
     * 認証情報を指定し、SSL証明書カテゴリクライアントを構築します。
     *
     * @param credential 認証情報
     */
    public NiftySslCertAsyncClient(Credentials credential) {
        this(credential, Executors.newCachedThreadPool());
    }

    /**
     * 認証情報、クライアント設定を指定し、SSL証明書カテゴリクライアントを構築します。
     *
     * @param credential 認証情報
     * @param configuration クライアント設定
     */
    public NiftySslCertAsyncClient(Credentials credential, ClientConfiguration configuration) {
        this(credential, configuration, Executors.newCachedThreadPool());
    }

    /**
     * 認証情報,非同期タスク実行クラスを指定し、SSL証明書カテゴリクライアントを構築します。
     *
     * @param credential 認証情報
     * @param executorService 非同期タスク実行クラス
     */
    public NiftySslCertAsyncClient(Credentials credential, ExecutorService executorService) {
        super(credential);
        this.executorService = executorService;
    }

    /**
     * 認証情報、クライアント設定,非同期タスク実行クラスを指定し、SSL証明書カテゴリクライアントを構築します。
     *
     * @param credential 認証情報
     * @param configuration クライアント設定
     * @param executorService 非同期タスク実行クラス
     */
    public NiftySslCertAsyncClient(Credentials credential, ClientConfiguration configuration, ExecutorService executorService) {
        super(credential, configuration);
        this.executorService = executorService;
    }


    /* (non-Javadoc)
     * @see com.nifty.cloud.sdk.sslcert.NiftySslCertAsync#registerCorporateInfoForCertificateAsync(com.nifty.cloud.sdk.sslcert.model.RegisterCorporateInfoForCertificateRequest)
     */
    @Override
    public Future<RegisterCorporateInfoForCertificateResult> registerCorporateInfoForCertificateAsync(
            final RegisterCorporateInfoForCertificateRequest request) {
        return executorService.submit(
                new Callable<RegisterCorporateInfoForCertificateResult>() {
                    @Override
                    public RegisterCorporateInfoForCertificateResult call() {
                        return registerCorporateInfoForCertificate(request);
                    }
                }
        );
    }

    /* (non-Javadoc)
     * @see com.nifty.cloud.sdk.sslcert.NiftySslCertAsync#createSslCertificateAsync(com.nifty.cloud.sdk.sslcert.model.CreateSslCertificateRequest)
     */
    @Override
    public Future<CreateSslCertificateResult> createSslCertificateAsync(
            final CreateSslCertificateRequest request) {
        return executorService.submit(
                new Callable<CreateSslCertificateResult>() {
                    @Override
                    public CreateSslCertificateResult call() {
                        return createSslCertificate(request);
                    }
                }
        );
    }

    /* (non-Javadoc)
     * @see com.nifty.cloud.sdk.sslcert.NiftySslCertAsync#describeSslCertificatesAsync(com.nifty.cloud.sdk.sslcert.model.DescribeSslCertificatesRequest)
     */
    @Override
    public Future<DescribeSslCertificatesResult> describeSslCertificatesAsync(
            final DescribeSslCertificatesRequest request) {
        return executorService.submit(
                new Callable<DescribeSslCertificatesResult>() {
                    @Override
                    public DescribeSslCertificatesResult call() {
                        return describeSslCertificates(request);
                    }
                });
    }

    /* (non-Javadoc)
     * @see com.nifty.cloud.sdk.sslcert.NiftySslCertAsync#describeSslCertificateAttributeAsync(com.nifty.cloud.sdk.sslcert.model.DescribeSslCertificateAttributeRequest)
     */
    @Override
    public Future<DescribeSslCertificateAttributeResult> describeSslCertificateAttributeAsync(
            final DescribeSslCertificateAttributeRequest request) {
        return executorService.submit(
                new Callable<DescribeSslCertificateAttributeResult>() {
                    @Override
                    public DescribeSslCertificateAttributeResult call() {
                        return describeSslCertificateAttribute(request);
                    }
                });
    }

    /* (non-Javadoc)
     * @see com.nifty.cloud.sdk.sslcert.NiftySslCertAsync#modifySslCertificateAttributeAsync(com.nifty.cloud.sdk.sslcert.model.ModifySslCertificateAttributeRequest)
     */
    @Override
    public Future<ModifySslCertificateAttributeResult> modifySslCertificateAttributeAsync(
            final ModifySslCertificateAttributeRequest request) {
        return executorService.submit(
                new Callable<ModifySslCertificateAttributeResult>() {
                    @Override
                    public ModifySslCertificateAttributeResult call() {
                        return modifySslCertificateAttribute(request);
                    }
                });
    }

    /* (non-Javadoc)
     * @see com.nifty.cloud.sdk.sslcert.NiftySslCertAsync#deleteSslCertificateAsync(com.nifty.cloud.sdk.sslcert.model.DeleteSslCertificateRequest)
     */
    @Override
    public Future<DeleteSslCertificateResult> deleteSslCertificateAsync(
            final DeleteSslCertificateRequest request) {
        return executorService.submit(new Callable<DeleteSslCertificateResult>() {
            @Override
            public DeleteSslCertificateResult call(){
                return deleteSslCertificate(request);
            }
        });
    }

    /* (non-Javadoc)
     * @see com.nifty.cloud.sdk.sslcert.NiftySslCertAsync#uploadSslCertificateAsync(com.nifty.cloud.sdk.sslcert.model.UploadSslCertificateRequest)
     */
    @Override
    public Future<UploadSslCertificateResult> uploadSslCertificateAsync(
            final UploadSslCertificateRequest request) {
        return executorService.submit(new Callable<UploadSslCertificateResult>() {
            @Override
            public UploadSslCertificateResult call() {
                return uploadSslCertificate(request);
            }
        });
    }

    /* (non-Javadoc)
     * @see com.nifty.cloud.sdk.sslcert.NiftySslCertAsync#downloadSslCertificateAsync(com.nifty.cloud.sdk.sslcert.model.DownloadSslCertificateRequest)
     */
    @Override
    public Future<DownloadSslCertificateResult> downloadSslCertificateAsync(
            final DownloadSslCertificateRequest request) {
        return executorService.submit(new Callable<DownloadSslCertificateResult>() {
            @Override
            public DownloadSslCertificateResult call() {
                return downloadSslCertificate(request);
            }
        });
    }

}
