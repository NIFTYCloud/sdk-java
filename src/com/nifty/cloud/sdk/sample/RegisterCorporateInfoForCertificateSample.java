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
package com.nifty.cloud.sdk.sample;

import static java.lang.System.err;
import static java.lang.System.out;

import com.nifty.cloud.sdk.ClientConfiguration;
import com.nifty.cloud.sdk.NiftyClientException;
import com.nifty.cloud.sdk.auth.BasicCredentials;
import com.nifty.cloud.sdk.auth.Credentials;
import com.nifty.cloud.sdk.sslcert.NiftySslCertClient;
import com.nifty.cloud.sdk.sslcert.model.RegisterCorporateInfoForCertificateRequest;
import com.nifty.cloud.sdk.sslcert.model.RegisterCorporateInfoForCertificateResult;

/**
 * RegisterCorporateInfoForCertificateサンプル
 *
 */
public class RegisterCorporateInfoForCertificateSample {

    /**
     * RegisterCorporateInfoForCertificateを実行するサンプルです。
     * 必要なパラメーターを設定してから利用してください。
     *
     * @param args 利用しない
     */
    public static void main(String[] args) {

        /************************************************************************
         * AccessKeyとSecretAccessKeyを設定します。 キーはNIFTY Cloudのコントロールパネルから取得します。
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
         * リクエストパラメーターを設定し、RegisterCorporateInfoForCertificateを実行します。
         ***********************************************************************/
        RegisterCorporateInfoForCertificateRequest request
                = new RegisterCorporateInfoForCertificateRequest();
        // request.setAgreement(true);
        // request.setTdbCode("tdbCode");
        // request.setCorpName("corpName");
        // request.setCorpGrade("corpGrade");
        // request.setPresidentName1("presidentName1");
        // request.setPresidentName2("presidentName2");
        // request.setZip1("123");
        // request.setZip2("4567");
        // request.setPref("pref");
        // request.setCity("city");
        // request.setName1("name1");
        // request.setName2("name2");
        // request.setKanaName1("kanaName1");
        // request.setKanaName2("kanaName");
        // request.setAlphabetName1("alphabetName1");
        // request.setAlphabetName2("alphabetName2");
        // request.setPostName("postName");
        // request.setDivisionName("divisionName");
        // request.setPhoneNumber("phoneNumber");
        // request.setEmailAddress("emailAddress");

        invokeRegisterCorporateInfoForCertificate(client, request);
    }

    /**
     * RegisterCorporateInfoForCertificate 実行サンプル
     * 設定されたリクエストから RegisterCorporateInfoForCertificateを実行し、実行結果を表示します。
     *
     * @param client   クライアント
     * @param request  リクエスト
     */
    public static void invokeRegisterCorporateInfoForCertificate(
            NiftySslCertClient client,
            RegisterCorporateInfoForCertificateRequest request) {
        try {
            RegisterCorporateInfoForCertificateResult result
                    = client.registerCorporateInfoForCertificate(request);

            out.println("RegisterCorporateInfoForCertificate Action Response");
            out.println("=============================================================================");

            if (result.getTdbCode() != null) {
                out.println("  TdbCode         : " + result.getTdbCode());
            }
            if (result.getCorpName() != null) {
                out.println("  CorpName        : " + result.getCorpName());
            }
            if (result.getCorpGrade() != null) {
                out.println("  CorpGrade       : " + result.getCorpGrade());
            }
            if (result.getPresidentName1() != null) {
                out.println("  PresidentName1  : " + result.getPresidentName1());
            }
            if (result.getPresidentName2() != null) {
                out.println("  PresidentName2  : " + result.getPresidentName2());
            }
            if (result.getZip1() != null) {
                out.println("  Zip1            : " + result.getZip1());
            }
            if (result.getZip2() != null) {
                out.println("  Zip2            : " + result.getZip2());
            }
            if (result.getPref() != null) {
                out.println("  Pref            : " + result.getPref());
            }
            if (result.getCity() != null) {
                out.println("  City            : " + result.getCity());
            }
            if (result.getName1() != null) {
                out.println("  Name1           : " + result.getName1());
            }
            if (result.getName2() != null) {
                out.println("  Name2           : " + result.getName2());
            }
            if (result.getKanaName1() != null) {
                out.println("  KanaName1       : " + result.getKanaName1());
            }
            if (result.getKanaName2() != null) {
                out.println("  KanaName2       : " + result.getKanaName2() );
            }
            if (result.getAlphabetName1() != null) {
                out.println("  AlphabetName1   : " + result.getAlphabetName1());
            }
            if (result.getAlphabetName2() != null) {
                out.println("  AlphabetName2   : " + result.getAlphabetName2());
            }
            if (result.getPostName() != null) {
                out.println("  PostName        : " + result.getPostName());
            }
            if (result.getDivisionName() != null) {
                out.println("  DivisionName    : " + result.getDivisionName());
            }
            if (result.getPhoneNumber() != null) {
                out.println("  PhoneNumber     : " + result.getPhoneNumber());
            }
            if (result.getEmailAddress() != null) {
                out.println("  EmailAddress    : " + result.getEmailAddress());
            }

            out.println("=============================================================================");
        } catch (NiftyClientException ex) {
            err.println("Message: " + ex.getMessage());
        }
    }

}
