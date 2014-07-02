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

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.codec.binary.Base64;

import com.nifty.cloud.sdk.ClientConfiguration;
import com.nifty.cloud.sdk.NiftyClientException;
import com.nifty.cloud.sdk.auth.BasicCredentials;
import com.nifty.cloud.sdk.auth.Credentials;
import com.nifty.cloud.sdk.server.NiftyServerClient;
import com.nifty.cloud.sdk.server.model.ConversionTask;
import com.nifty.cloud.sdk.server.model.DiskImage;
import com.nifty.cloud.sdk.server.model.DiskImageDescription;
import com.nifty.cloud.sdk.server.model.DiskImageDetail;
import com.nifty.cloud.sdk.server.model.DiskImageVolume;
import com.nifty.cloud.sdk.server.model.DiskImageVolumeDescription;
import com.nifty.cloud.sdk.server.model.ImportInstance;
import com.nifty.cloud.sdk.server.model.ImportInstanceRequest;
import com.nifty.cloud.sdk.server.model.ImportInstanceResult;
import com.nifty.cloud.sdk.server.model.ImportInstanceVolumeDetail;
import com.nifty.cloud.sdk.server.model.InstancePlacement;
import com.nifty.cloud.sdk.server.model.Tag;

/**
 * ImportInstanceサンプル
 *
 */
public class ImportInstanceSample {

    /**
     * ImportInstanceを実行するサンプルです。
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
         * 非同期実行を行う場合はNiftyServerAsyncClientクラスを指定します。
         ***********************************************************************/
        NiftyServerClient client = new NiftyServerClient(credential, config);

        /************************************************************************
         * 接続先URLを変更する場合は接続先を指定します。
         ***********************************************************************/
        // client.setEndpoint("endpoint_url");

        /************************************************************************
         * リクエストパラメーターを設定し、ImportInstanceを実行します。
         ***********************************************************************/
        ImportInstanceRequest request = new ImportInstanceRequest();
        // request.setDescription("description");
        // request.setArchitecture("architecture");
        // List<String> groupIds = new ArrayList<String>();
        // groupIds.add("groupId");
        // request.setGroupIds(groupIds);
        // request.setUserData(new String(Base64.encodeBase64Chunked("userData".getBytes())));
        // request.setInstanceType("instanceType");
        // InstancePlacement placement = new InstancePlacement();
        // placement.setAvailabilityZone("availabilityZone");
        // placement.setGroupName("groupName");
        // request.setPlacement(placement);
        // request.setMonitoring(Boolean.FALSE);
        // request.setSubnetId("subnetId");
        // request.setInstanceInitiatedShutdownBehavior("instanceInitiatedShutdownBehavior");
        // request.setprivateIpAddress("privateIpAddress");
        // List<DiskImage> diskImageSet = new ArrayList<DiskImage>();
        // DiskImage diskImage = new DiskImage();
        // DiskImageDetail image = new DiskImageDetail();
        // image.setFormat("format");
        // image.setBytes(Long.valueOf(0));
        // image.setImportManifestUrl("importManifestUrl");
        // diskImage.setImage(image);
        // diskImage.setDescription("description");
        // DiskImageVolume volume = new DiskImageVolume();
        // volume.setSize(Long.valueOf(0));
        // diskImage.setVolume(volume);
        // request.setDiskImageSet(diskImageSet);
        // request.setPlatform("platform");
        // request.setInstanceId("instanceId");
        // request.setOvf("ovf");
        // request.setAccountingType("accountingType");
        // request.setIpType("ipType");
        // request.setPublicIp("publicIp");
        // request.setKeepPartialImports(Boolean.FALSE);
        invokeImportInstance(client, request);

    }

    /**
     * ImportInstance 実行サンプル
     * 設定されたリクエストから ImportInstance を実行し、実行結果を表示します。
     *
     * @param client   クライアント
     * @param request  リクエスト
     */
    public static void invokeImportInstance(NiftyServerClient client, ImportInstanceRequest request) {
        try {
            ImportInstanceResult result = client.importInstance(request);

            out.println("ImportInstance Action Response");
            out.println("=============================================================================");

            ConversionTask task = result.getConversionTask();
            if (task == null) return;

            if (task.getConversionTaskId() != null) {
                out.println("  ConversionTaskId     : " + task.getConversionTaskId());
            }
            if (task.getExpirationTime() != null) {
                out.println("  ExpirationTime       : " + task.getExpirationTime());
            }
            ImportInstance importInstance = task.getImportInstance();
            if (importInstance != null) {
                out.println("  ImportInstance");
                if (importInstance.getDiskImageSet() != null) {
                	out.println("    DiskImageSet");
                    for (ImportInstanceVolumeDetail detail : importInstance.getDiskImageSet()) {
                        if (detail.getBytesConverted() != null) {
                            out.println("    BytesConverted     : " + detail.getBytesConverted());
                        }
                        if (detail.getAvailabilityZone() != null) {
                            out.println("    AvailabilityZone   : " + detail.getAvailabilityZone());
                        }
                        DiskImageDescription image = detail.getImage();
                        if (image != null) {
                            out.println("    Image");
                            if (image.getFormat() != null) {
                                out.println("      Format           : " + image.getFormat());
                            }
                            if (image.getSize() != null) {
                                out.println("      Size             : " + image.getSize());
                            }
                            if (image.getImportManifestUrl() != null) {
                                out.println("      ImportManifestUrl: " + image.getImportManifestUrl());
                            }
                            if (image.getChecksum() != null) {
                                out.println("      Checksum        : " + image.getChecksum());
                            }
                        }
                        if (detail.getDescription() != null) {
                            out.println("    Description        : " + detail.getDescription());
                        }
                        DiskImageVolumeDescription volume = detail.getVolume();
                        if (volume != null) {
                            out.println("    Volume");
                            if (volume.getSize() != null) {
                                out.println("      Size         : " + volume.getSize());
                            }
                            if (volume.getId() != null) {
                                out.println("      Id           : " + volume.getId());
                            }
                        }
                        if (detail.getStatus() != null) {
                            out.println("    State              : " + detail.getStatus());
                        }
                        if (detail.getStatusMessage() != null) {
                            out.println("    StateMessage       : " + detail.getStatusMessage());
                        }
                    }
                }
                if (importInstance.getInstanceId() != null) {
                    out.println("  InstanceId           : " + importInstance.getInstanceId());
                }
                if (importInstance.getPlatform() != null) {
                    out.println("  Platform             : " + importInstance.getPlatform());
                }
                if (importInstance.getDescription() != null) {
                    out.println("  Description          : " + importInstance.getDescription());
                }
            }
            List<Tag> tagSet = task.getTagSet();
            if (tagSet != null) {
                out.println("TagSet");
                for (Tag tag : tagSet) {
                    if (tag.getKey() != null) {
                        out.println("  Key                 : " + tag.getKey());
                    }
                    if (tag.getValue() != null) {
                        out.println("  Value               : " + tag.getValue());
                    }
                }
            }

        } catch (NiftyClientException ex) {
            err.println("Message: " + ex.getMessage());
        }
    }

}
