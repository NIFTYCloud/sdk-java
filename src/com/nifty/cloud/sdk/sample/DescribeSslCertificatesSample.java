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
 *  Date: 2011-11-10 09:56:54
 *
 */
package com.nifty.cloud.sdk.sample;

import static java.lang.System.err;
import static java.lang.System.out;

import java.util.ArrayList;
import java.util.List;

import com.nifty.cloud.sdk.ClientConfiguration;
import com.nifty.cloud.sdk.NiftyClientException;
import com.nifty.cloud.sdk.auth.BasicCredentials;
import com.nifty.cloud.sdk.auth.Credentials;
import com.nifty.cloud.sdk.sslcert.NiftySslCertClient;
import com.nifty.cloud.sdk.sslcert.model.CertInfo;
import com.nifty.cloud.sdk.sslcert.model.DescribeSslCertificatesRequest;
import com.nifty.cloud.sdk.sslcert.model.DescribeSslCertificatesResult;
import com.nifty.cloud.sdk.sslcert.model.FqdnSet;
import com.nifty.cloud.sdk.sslcert.model.Period;
import com.nifty.cloud.sdk.sslcert.model.SslCertification;

/**
 * DescribeSslCertificatesサンプル
 *
 */
public class DescribeSslCertificatesSample {

    /**
     * DescribeSslCertificatesを実行するサンプルです。
     * 必要なパラメーターを設定してから利用してください。
     *
     * @param args 利用しない
     */
    public static void main(String[] args) {

        /************************************************************************
         * AccessKeyとSecretAccessKeyを設定します。
         * キーはNIFTY Cloudのコントロールパネルから取得します。
         ***********************************************************************/
        String accessKey = "<Input Your AccessKey>";
        String secretKey = "<Input Your SecretAccessKey>";

        /************************************************************************
         * 指定されたAccessKeyとSecretAccessKeyから認証情報インスタンスを生成します。
         ***********************************************************************/
        Credentials credential = new BasicCredentials(accessKey, secretKey);

        /************************************************************************
         * クライアント設定情報インスタンスを生成します。
         * 設定情報を変更する場合は値を設定します。
         * 以下の項目について設定可能です。
         *   - ユーザーエージェント
         *   - プロトコル
         *   - プロキシサーバーアドレス
         *   - プロキシサーバーポート番号
         *   - プロキシユーザー名
         *   - プロキシパスワード
         *   - 最大リトライ回数
         *   - 最大接続数
         *   - TCPソケットタイムアウト秒数
         *   - 接続タイムアウト秒数
         *   - 送信バッファサイズ / 受信バッファサイズ
         *   - SignatureVersion
         *   - SignatureMethod
         *     HTTPメソッド
         ***********************************************************************/
        ClientConfiguration config = new ClientConfiguration();
        // config.setUserAgent("NIFTY Cloud API Java SDK");
        // config.setProtocol(Protocol.HTTPS);
        // config.setProxyHost("proxy_host");
        // config.setProxyPort(0);
        // config.setProxyUsername("proxy_username");
        // config.setProxyPassword("proxy_password");
        // config.setMaxErrorRetry(3);
        // config.setMaxConnections(50);
        // config.setSocketTimeout(30);
        // config.setConnectionTimeout(30);
        // config.setSocketSendBufferSizeHint(0, 0);
        // config.setSignatureVersion(SignatureVersion.Version_2);
        // config.setSignatureMethod(SignatureMethod.HmacSHA256);
        // config.setRequestMethod("GET");

        /************************************************************************
         * 認証情報とクライアント設定情報からSSLカテゴリ クライアントを生成します。
         * 非同期実行を行う場合はNiftySslCertAsyncClientクラスを指定します。
         ***********************************************************************/
        NiftySslCertClient client = new NiftySslCertClient(credential, config);

        /************************************************************************
         * 接続先URLを変更する場合は接続先を指定します。
         ***********************************************************************/
        // client.setEndpoint("endpoint_url");

        /************************************************************************
         * リクエストパラメーターを設定し、DescribeSslCertificatesを実行します。
         ***********************************************************************/
        DescribeSslCertificatesRequest request = new DescribeSslCertificatesRequest();
        // List<FqdnSet> fqdnSets = new ArrayList<FqdnSet>();
        // FqdnSet fqdnSet = new FqdnSet();
        // fqdnSet.setFqdnId("fqdnId");
        // fqdnSet.setFqdn("fqdn");
        // fqdnSets.add(fqdnSet);
        // request.setFqdnSet(fqdnSets);

        invokeDescribeSslCertificates(client, request);
    }

    /**
     * DescribeSslCertificates 実行サンプル
     * 設定されたリクエストから DescribeSslCertificatesを実行し、実行結果を表示します。
     *
     * @param client   クライアント
     * @param request  リクエスト
     */
    public static void invokeDescribeSslCertificates(
            NiftySslCertClient client,
            DescribeSslCertificatesRequest request) {

        try {
            DescribeSslCertificatesResult result = client.describeSslCertificates(request);

            out.println("DescribeSslCertificates Action Response");
            out.println("=============================================================================");

            if (result.getSslCertifications() != null) {
                List<SslCertification> certSets = result.getSslCertifications();

                for (SslCertification certSet : certSets) {
                    out.println("CertState");
                    if (certSet.getFqdnId() != null) {
                        out.println("  FqdnId        : " + certSet.getFqdnId());
                    }
                    if (certSet.getFqdn() != null) {
                        out.println("  Fqdn          : " + certSet.getFqdn());
                    }
                    if (certSet.getCertAuthority() != null) {
                        out.println("  CertAuthority : " + certSet.getCertAuthority());
                    }
                    if (certSet.getCount() != null) {
                        out.println("  Count         : " + certSet.getCount());
                    }
                    if (certSet.getCertState() != null) {
                        out.println("  CertState     : " + certSet.getCertState());
                    }
                    if (certSet.getPeriod() != null) {
                        out.println("  Period");
                        Period period = certSet.getPeriod();
                        if (period.getStartDate() != null) {
                            out.println("    StartDate  : " + period.getStartDate());
                        }
                        if (period.getEndDate() != null) {
                            out.println("    EndDate    : " + period.getEndDate());
                        }
                    }
                    if (certSet.getKeyLength() != null) {
                        out.println("  KeyLength     : " + certSet.getKeyLength());
                    }
                    if (certSet.getUploadState() != null) {
                        out.println("  UploadState   : " + certSet.getUploadState());
                    }
                    if (certSet.getDescription() != null) {
                        out.println("  Description   : " + certSet.getDescription());
                    }
                    if (certSet.getCertInfo() != null) {
                        out.println("  CertInfo");
                        CertInfo certInfo = certSet.getCertInfo();
                        if (certInfo.getOrganizationName() != null) {
                            out.println("    OrganizationName      : " + certInfo.getOrganizationName());
                        }
                        if (certInfo.getOrganizationUnitName() != null) {
                            out.println("    OrganizationUnitName  : " + certInfo.getOrganizationUnitName());
                        }
                        if (certInfo.getCountryName() != null) {
                            out.println("    CountryName           : " + certInfo.getCountryName());
                        }
                        if (certInfo.getStateName() != null) {
                            out.println("    StateName             : " + certInfo.getStateName());
                        }
                        if (certInfo.getLocationName() != null) {
                            out.println("    LocationName          : " + certInfo.getLocationName());
                        }
                        if (certInfo.getEmailAddress() != null) {
                            out.println("    EmailAddress          : " + certInfo.getEmailAddress());
                        }
                    }
                }
            }

            out.println("=============================================================================");
        } catch (NiftyClientException ex) {
            err.println("Message: " + ex.getMessage());
        }
    }

}
