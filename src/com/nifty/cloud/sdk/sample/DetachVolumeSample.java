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
package com.nifty.cloud.sdk.sample;


import com.nifty.cloud.sdk.ClientConfiguration;
import com.nifty.cloud.sdk.NiftyClientException;
import com.nifty.cloud.sdk.Protocol;
import com.nifty.cloud.sdk.auth.BasicCredentials;
import com.nifty.cloud.sdk.auth.Credentials;
import com.nifty.cloud.sdk.auth.SignatureUtils.SignatureMethod;
import com.nifty.cloud.sdk.auth.SignatureUtils.SignatureVersion;
import com.nifty.cloud.sdk.disk.NiftyDiskClient;
import com.nifty.cloud.sdk.disk.model.DetachVolumeRequest;
import com.nifty.cloud.sdk.disk.model.DetachVolumeResult;
import com.nifty.cloud.sdk.disk.model.VolumeAttachment;

import static java.lang.System.out;
import static java.lang.System.err;

/**
 * DetachVolumeサンプル
 *
 */
public class DetachVolumeSample {

    /**
     * DetachVolumeを実行するサンプルです。
     * 必要なパラメーターを設定してから利用してください。
     *
     * @param args  利用しない
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
         * 認証情報とクライアント設定情報からディスクカテゴリ クライアントを生成します。
         * 非同期実行を行う場合はNiftyDiskAsyncClientクラスを指定します。
         ***********************************************************************/
        NiftyDiskClient client = new NiftyDiskClient(credential, config);

        /************************************************************************
         * 接続先URLを変更する場合は接続先を指定します。
         ***********************************************************************/
        // client.setEndpoint("endpoint_url");

        /************************************************************************
         * リクエストパラメーターを設定し、DetachVolumeを実行します。
         ***********************************************************************/
        DetachVolumeRequest request = new DetachVolumeRequest();
        // request.setVolumeId("VolumeId");
        // request.setInstanceId("InstanceId");
        // request.setDevice("device");
        // request.setForce(false);

        invokeDetachVolume(client, request);

    }

    /**
     * DetachVolume 実行サンプル
     * 設定されたリクエストから DetachVolume　を実行し、実行結果を表示します。
     *
     * @param client  クライアント
     * @param request リクエスト
     */
    public static void invokeDetachVolume(NiftyDiskClient client,
            DetachVolumeRequest request) {
        try {
            DetachVolumeResult result = client.detachVolume(request);

            out.println("DetachVolume Action Response");
            out.println("=============================================================================");
            if(result.getAttachment() !=null){
                VolumeAttachment volumeAttachment = result.getAttachment();
                out.println("VolumeAttachment");
                if (volumeAttachment.getVolumeId() != null) {
                    out.println("  VolumeId            : " + volumeAttachment.getVolumeId());
                }
                if (volumeAttachment.getInstanceId() != null) {
                    out.println("  InstanceId          : " + volumeAttachment.getInstanceId());
                }
                if (volumeAttachment.getDevice() != null) {
                    out.println("  Device              : " + volumeAttachment.getDevice());
                }
                if (volumeAttachment.getState() != null) {
                    out.println("  State               : " + volumeAttachment.getState());
                }
                if (volumeAttachment.getAttachTime() != null) {
                    out.println("  AttachTime          : " + volumeAttachment.getAttachTime());
                }
                if (volumeAttachment.getDeleteOnTermination() != null) {
                    out.println("  DeleteOnTermination : " + volumeAttachment.getDeleteOnTermination());
                }
            }
            out.println("=============================================================================");
        } catch (NiftyClientException ex) {
            err.println("Message: " + ex.getMessage());
        }
    }
}
