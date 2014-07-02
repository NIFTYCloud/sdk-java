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
package com.nifty.cloud.sdk.sample;

import static java.lang.System.err;
import static java.lang.System.out;

import java.io.File;

import com.nifty.cloud.sdk.ClientConfiguration;
import com.nifty.cloud.sdk.NiftyClientException;
import com.nifty.cloud.sdk.auth.BasicCredentials;
import com.nifty.cloud.sdk.auth.Credentials;
import com.nifty.cloud.sdk.upload.NiftyUploadClient;
import com.nifty.cloud.sdk.upload.UploadCallback;
import com.nifty.cloud.sdk.upload.model.LargeSizeUploadRequest;
import com.nifty.cloud.sdk.upload.model.LargeSizeUploadResult;
import com.nifty.cloud.sdk.upload.model.Operation;

/**
 * LargeSizeUpload（アップロードおよびレジューム）サンプル
 *
 */
public class LargeSizeUploadSample {

    /**
     * LargeSizeUploadを実行するサンプルです。
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
         * 認証情報とクライアント設定情報からイメージカテゴリ クライアントを生成します。
         * 非同期実行を行う場合はNiftyUploadAsyncClientクラスを指定します。
         ***********************************************************************/
        NiftyUploadClient client = new NiftyUploadClient(credential, config);

        /************************************************************************
         * 接続先URLを変更する場合は接続先を指定します。
         ***********************************************************************/
        // client.setEndpoint("endpoint_url");

        /************************************************************************
         * リクエストパラメーターを設定し、LargeSizeUploadを実行します。
         ***********************************************************************/
        LargeSizeUploadRequest request = new LargeSizeUploadRequest();
        // request.setFile(new File("file_path"));
        // request.setConversionTaskId("conversionTaskId");
        // request.setPartSize(8 * 1024 * 1024);

        /************************************************************************
         * アップロードの初期化情報を取得します。
         ***********************************************************************/
        request.setOperation(Operation.appletinit);
        invokeLargeSizeUpload(client, request);

        /************************************************************************
         * アップロードの開始を通知します。
         ***********************************************************************/
        request.setOperation(Operation.query);
        invokeLargeSizeUpload(client, request);

        /************************************************************************
         * ファイルをアップロードします。
         ***********************************************************************/
        request.addCallback(new CallbackSample());
        request.setOperation(Operation.upload);
        invokeLargeSizeUpload(client, request);

    }

    /**
     * LargeSizeUpload 実行サンプル
     * 設定されたリクエストから LargeSizeUpload を実行し、実行結果を表示します。
     *
     * @param client   クライアント
     * @param request  リクエスト
     */
    public static void invokeLargeSizeUpload(NiftyUploadClient client, LargeSizeUploadRequest request) {
        try {
            LargeSizeUploadResult result = client.largeSizeUpload(request);

            out.println("LargeSizeUpload Action Response");
            out.println("=============================================================================");

            long position = 0L;
            if (result.getErrorMessage() != null) {
                out.println("ErrorMessage                        : " + result.getErrorMessage());
            }
            if (result.getPosition() != null) {
                out.println("x-nifty-upload-next-position        : " + result.getPosition());
                position = result.getPosition().longValue();
            }
            if (result.getPartSize() != null) {
                out.println("x-nifty-upload-applet-blocksize     : " + result.getPartSize());
            }
            if (result.getTimeout() != null) {
                out.println("x-nifty-upload-applet-timeout       : " + result.getTimeout());
            }
            if (result.getBufsize() != null) {
                out.println("x-nifty-upload-applet-socketbufsize : " + result.getBufsize());
            }

            switch (request.getOperation()) {
            case appletinit:
                request.setOffset(position);
                request.setPosition(position);
                break;
            case query:
                request.setOffset(position);
                request.setPosition(position);
                break;
            case upload:
                request.setPosition(position);
                break;
            }

        } catch (NiftyClientException ex) {
            err.println("Message: " + ex.getMessage());
        }
    }

    public static class CallbackSample implements UploadCallback {
        @Override
        public void notifyProgress(long partSize, long sent) {
            System.out.println("Sent " + partSize + " [total " + sent + "] byte(s).");
        }

    }
}
