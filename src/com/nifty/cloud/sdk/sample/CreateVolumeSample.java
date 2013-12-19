/******************************************************************************* 
 *  Copyright 2013 NIFTY Corporation All Rights Reserved.
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
 *  API Version: 1.16
 *  Date: 2013-10-18 17:00:00
 * 
 */
package com.nifty.cloud.sdk.sample;

import java.util.List;

import com.nifty.cloud.sdk.ClientConfiguration;
import com.nifty.cloud.sdk.NiftyClientException;
import com.nifty.cloud.sdk.Protocol;
import com.nifty.cloud.sdk.auth.BasicCredentials;
import com.nifty.cloud.sdk.auth.Credentials;
import com.nifty.cloud.sdk.auth.SignatureUtils.SignatureMethod;
import com.nifty.cloud.sdk.auth.SignatureUtils.SignatureVersion;
import com.nifty.cloud.sdk.disk.NiftyDiskClient;
import com.nifty.cloud.sdk.disk.model.CreateVolumeRequest;
import com.nifty.cloud.sdk.disk.model.CreateVolumeResult;
import com.nifty.cloud.sdk.disk.model.Volume;
import com.nifty.cloud.sdk.disk.model.VolumeAttachment;

import static java.lang.System.out;
import static java.lang.System.err;

/**
 * CreateVolumeサンプル
 *
 */
public class CreateVolumeSample {

    /**
     * CreateVolumeを実行するサンプルです。
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
         * リクエストパラメーターを設定し、CreateVolumeを実行します。
         ***********************************************************************/
         CreateVolumeRequest request = new CreateVolumeRequest();
        // request.setSize("size");
        // request.setSnapshotId("snapshotId");
        // request.setAvailabilityZone("availabilityZone");
        // request.setVolumeId("volumeId");
        // request.setDiskType("diskType");
        // request.setInstanceId("instanceId");
        // request.setAccountingType("accountingType");
        invokeCreateVolume(client, request);

    }

    /**
     * CreateVolume 実行サンプル
     * 設定されたリクエストから CreateVolume を実行し、実行結果を表示します。
     *
     * @param client  クライアント
     * @param request リクエスト
     */
    public static void invokeCreateVolume(NiftyDiskClient client,
            CreateVolumeRequest request) {
        try {
            CreateVolumeResult result = client.createVolume(request);

            out.println("CreateVolume Action Response");
            out.println("=============================================================================");
            if (result.getVolume() != null) {
                out.println("Volume");
                Volume volume = result.getVolume();

                if (volume != null) {
                    if (volume.getVolumeId() != null) {
                        out.println("  VolumeId          : " + volume.getVolumeId());
                    }
                    if (volume.getSize() != null) {
                        out.println("  Size              : " + volume.getSize());
                    }
                    if (volume.getDiskType() != null) {
                        out.println("  DiskType          : " + volume.getDiskType());
                    }
                    if (volume.getSnapshotId() != null) {
                        out.println("  SnapshotId        : " + volume.getSnapshotId());
                    }
                    if (volume.getAvailabilityZone() != null) {
                        out.println("  AvailabilityZone  : " + volume.getAvailabilityZone());
                    }
                    if (volume.getStatus() != null) {
                        out.println("  Status            : " + volume.getStatus());
                    }
                    if (volume.getCreateTime() != null) {
                        out.println("  CreateTime        : " + volume.getCreateTime());
                    }
                    if (volume.getAccountingType() != null) {
                    	out.println("  AccountingType    : " + volume.getAccountingType());
                    }
                    if (volume.getAttachments() != null) {
                        out.println("  Attachment");
                        List<VolumeAttachment> attachments = volume.getAttachments();
                        for(VolumeAttachment attachment:attachments){
                            if(attachment.getInstanceId() != null){
                                out.println("    InstanceId           : " + attachment.getInstanceId());
                            }
                            if (attachment.getVolumeId() != null) {
                                out.println("    VolumeId             : " + attachment.getVolumeId());
                            }
                            if (attachment.getDevice() != null) {
                                out.println("    Device               : " + attachment.getDevice());
                            }
                            if (attachment.getState() != null) {
                                out.println("    State                : " + attachment.getState());
                            }
                            if (attachment.getDeleteOnTermination() != null) {
                                out.println("    DeleteOnTermination  : " + attachment.getDeleteOnTermination());
                            }
                            if (attachment.getAttachTime() != null) {
                                out.println("    AttachTime           : " + attachment.getAttachTime());
                            }
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
