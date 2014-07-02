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
package com.nifty.cloud.sdk.sslcert;

import java.io.IOException;

import com.nifty.cloud.sdk.BaseClient;
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
 * NIFTY Cloud API クライアント　具象クラス。 
 * SSL証明書カテゴリ クライアント。<br />
 * SSL証明書カテゴリの同期クライアントの具象クラスです。<br />
 * 戻り値の"利用不可"パラメータは返却値がnullまたは空となります。
 * 
 */
public class NiftySslCertClient extends BaseClient implements NiftySslCert {

	/**
	 * 認証情報を指定し、SSL証明書カテゴリクライアントを構築します。
	 * 
	 * @param credential 認証情報
	 */
	public NiftySslCertClient(Credentials credential) {
		super(credential, new ClientConfiguration());
	}

	/**
	 * 認証情報、クライアント設定を指定し、SSL証明書カテゴリクライアントを構築します。
	 * 
	 * @param credential 認証情報
	 * @param configuration クライアント設定
	 */
	public NiftySslCertClient(Credentials credential,
			ClientConfiguration configuration) {
		super(credential, configuration);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.nifty.cloud.sdk.sslcert.NiftySslCert#
	 * RegisterCorporateInfoForCertificate
	 * (com.nifty.cloud.sdk.sslcert.model
	 * .RegisterCorporateInfoForCertificateRequest)
	 */
	@Override
	public RegisterCorporateInfoForCertificateResult registerCorporateInfoForCertificate(
			RegisterCorporateInfoForCertificateRequest request) {
		return (RegisterCorporateInfoForCertificateResult) client
				.execute(request, RegisterCorporateInfoForCertificateResult.class);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.nifty.cloud.sdk.sslcert.NiftySslCert#getCorporateInformationMessage
	 * (java.lang.String)
	 */
	@Override
	public String getCorporateInformationMessage() throws IOException {
		ClientConfiguration configuration = client.getConfig();
		String url = configuration.getSslCertEulaUrl();
		return client.getHttpText(url);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.nifty.cloud.sdk.sslcert.NiftySslCert#createSslCertificate(com.nifty
	 * .cloud.sdk.sslcert.model.CreateSslCertificateRequest)
	 */
	@Override
	public CreateSslCertificateResult createSslCertificate(
			CreateSslCertificateRequest request) {
		return (CreateSslCertificateResult) client.execute(request, CreateSslCertificateResult.class);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.nifty.cloud.sdk.sslcert.NiftySslCert#describeSslCertificates(com.
	 * nifty.cloud.sdk.sslcert.model.DescribeSslCertificatesRequest)
	 */
	@Override
	public DescribeSslCertificatesResult describeSslCertificates(
			DescribeSslCertificatesRequest request) {
		return (DescribeSslCertificatesResult) client.execute(request, DescribeSslCertificatesResult.class);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.nifty.cloud.sdk.sslcert.NiftySslCert#describeSslCertificateAttribute
	 * (com
	 * .nifty.cloud.sdk.sslcert.model.DescribeSslCertificateAttributeRequest)
	 */
	@Override
	public DescribeSslCertificateAttributeResult describeSslCertificateAttribute(
			DescribeSslCertificateAttributeRequest request) {
		return (DescribeSslCertificateAttributeResult) client.execute(request, DescribeSslCertificateAttributeResult.class);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.nifty.cloud.sdk.sslcert.NiftySslCert#modifySslCertificateAttribute
	 * (com.nifty.cloud.sdk.sslcert.model.ModifySslCertificateAttributeRequest)
	 */
	@Override
	public ModifySslCertificateAttributeResult modifySslCertificateAttribute(
			ModifySslCertificateAttributeRequest request) {
		return (ModifySslCertificateAttributeResult) client.execute(request, ModifySslCertificateAttributeResult.class);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.nifty.cloud.sdk.sslcert.NiftySslCert#deleteSslCertificate(com.nifty
	 * .cloud.sdk.sslcert.model.DeleteSslCertificateRequest)
	 */
	@Override
	public DeleteSslCertificateResult deleteSslCertificate(
			DeleteSslCertificateRequest request) {
		return (DeleteSslCertificateResult) client.execute(request, DeleteSslCertificateResult.class);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.nifty.cloud.sdk.sslcert.NiftySslCert#uploadSslCertificate(com.nifty
	 * .cloud.sdk.sslcert.model.UploadSslCertificateRequest)
	 */
	@Override
	public UploadSslCertificateResult uploadSslCertificate(
			UploadSslCertificateRequest request) {
		return (UploadSslCertificateResult) client.execute(request, UploadSslCertificateResult.class);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.nifty.cloud.sdk.sslcert.NiftySslCert#downloadSslCertificate(com.nifty
	 * .cloud.sdk.sslcert.model.DownloadSslCertificateRequest)
	 */
	@Override
	public DownloadSslCertificateResult downloadSslCertificate(
			DownloadSslCertificateRequest request) {
		return (DownloadSslCertificateResult) client.execute(request, DownloadSslCertificateResult.class);
	}

}
