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
 *  Date: 2012-02-20 10:57:31
 * 
 */
package com.nifty.cloud.sdk.sample;

import java.util.ArrayList;
import java.util.List;

import com.nifty.cloud.sdk.ClientConfiguration;
import com.nifty.cloud.sdk.NiftyClientException;
import com.nifty.cloud.sdk.Protocol;
import com.nifty.cloud.sdk.auth.BasicCredentials;
import com.nifty.cloud.sdk.auth.Credentials;
import com.nifty.cloud.sdk.auth.SignatureUtils.SignatureMethod;
import com.nifty.cloud.sdk.auth.SignatureUtils.SignatureVersion;
import com.nifty.cloud.sdk.image.NiftyImageClient;
import com.nifty.cloud.sdk.image.model.BlockDeviceMapping;
import com.nifty.cloud.sdk.image.model.DescribeImagesInfo;
import com.nifty.cloud.sdk.image.model.DescribeImagesRequest;
import com.nifty.cloud.sdk.image.model.DescribeImagesResult;
import com.nifty.cloud.sdk.image.model.EbsBlockDevice;
import com.nifty.cloud.sdk.image.model.GlobalPlacement;
import com.nifty.cloud.sdk.image.model.Image;
import com.nifty.cloud.sdk.image.model.ProductCode;
import com.nifty.cloud.sdk.image.model.StateReason;

import static java.lang.System.out;
import static java.lang.System.err;

/**
 * DescribeImagesサンプル
 *
 */
public class DescribeImagesSample {

    /**
     * DescribeImagesを実行するサンプルです。
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
         * 認証情報とクライアント設定情報からイメージカテゴリ クライアントを生成します。
         * 非同期実行を行う場合はNiftyImageClientAsyncClientクラスを指定します。
         ***********************************************************************/
        NiftyImageClient client = new NiftyImageClient(credential, config);

        /************************************************************************
         * 接続先URLを変更する場合は接続先を指定します。
         ***********************************************************************/
        // client.setEndpoint("endpoint_url");

        /************************************************************************
         * リクエストパラメーターを設定し、DescribeImagesを実行します。
         ***********************************************************************/
        DescribeImagesRequest request = new DescribeImagesRequest();
        // List<String> executableUsers = new ArrayList<String>();
        // executableUsers.add("executableUser");
        // request.setExecutableUsers(executableUsers);
        // List<DescribeImagesInfo> images = new ArrayList<DescribeImagesInfo>();
        // DescribeImagesInfo image = new DescribeImagesInfo();
        // image.setImageId("imageId");
        // image.setImageName("imageName");
        // images.add(image);
        // request.setImages(images);
        // List<String> owners = new ArrayList<String>();
        // owners.add("owner");
        // request.setOwners(owners);

        invokeDescribeImages(client, request);

    }

    /**
     * DescribeImages 実行サンプル
     * 設定されたリクエストから DescribeImages　を実行し、実行結果を表示します。
     *
     * @param client   クライアント
     * @param request  リクエスト
     */
    public static void invokeDescribeImages(NiftyImageClient client,
            DescribeImagesRequest request) {
        try {
            DescribeImagesResult result = client.describeImages(request);

            out.println("DescribeImages Action Response");
            out.println("=============================================================================");

            if (result.getImages() != null) {
                List<Image> images = result.getImages();
                for (Image image : images) {
                    out.println("Image");
                    if (image.getImageId() != null) {
                        out.println("  ImageId           : " + image.getImageId());
                    }
                    if (image.getImageLocation() != null) {
                        out.println("  ImageLocation     : " + image.getImageLocation());
                    }
                    if (image.getState() != null) {
                        out.println("  State             : " + image.getState());
                    }
                    if (image.getOwnerId() != null) {
                        out.println("  OwnerId           : " + image.getOwnerId());
                    }
                    if (image.getPublicValue() != null) {
                        out.println("  PublicValue       : " + image.getPublicValue());
                    }
                    if (image.getProductCodes() != null) {
                        List<ProductCode> productCodes = image.getProductCodes();
                        for (ProductCode productCode : productCodes) {
                            out.println("  ProductCode");
                            if (productCode.getProductCodeId() != null) {
                                out.println("    ProductCodeId   : " + productCode.getProductCodeId());
                            }
                        }
                    }
                    if (image.getArchitecture() != null) {
                        out.println("  Architecture      : " + image.getArchitecture());
                    }
                    if (image.getImageType() != null) {
                        out.println("  ImageType         : " + image.getImageType());
                    }
                    if (image.getKernelId() != null) {
                        out.println("  KernelId          : " + image.getKernelId());
                    }
                    if (image.getRamdiskId() != null) {
                        out.println("  RamdiskId         : " + image.getRamdiskId());
                    }
                    if (image.getPlatform() != null) {
                        out.println("  Platform          : " + image.getPlatform());
                    }
                    if (image.getStateReason() != null) {
                        StateReason stateReason = image.getStateReason();
                        out.println("  StateReason");
                        if(stateReason.getCode()!=null){
                            out.println("    Code            : " + stateReason.getCode());
                        }
                        if (stateReason.getMessage() != null) {
                            out.println("    Message         : " + stateReason.getMessage());
                        }
                    }
                    if (image.getImageOwnerAlias() != null) {
                        out.println("  ImageOwnerAlias   : " + image.getImageOwnerAlias());
                    }
                    if (image.getName() != null) {
                        out.println("  Name              : " + image.getName());
                    }
                    if (image.getDescription() != null) {
                        out.println("  Description       : " + image.getDescription());
                    }
                    if (image.getDetailDescription() != null) {
                    	out.println("  DetailDescription : " + image.getDetailDescription());
                    }
                    if (image.getRedistributable() != null) {
                    	out.println("  Redistributable   : " + image.getRedistributable());
                    }
                    if (image.getPlacement() != null) {
                    	GlobalPlacement placement = image.getPlacement();
                    	out.println("  Placement");
                    	if (placement.getRegionName() != null) {
                    		out.println("    RegionName      : " + placement.getRegionName());
                    	}
                    	if (placement.getAvailabilityZone() != null) {
                    		out.println("    AvailabilityZone: " + placement.getAvailabilityZone());
                    	}
                    }
                    if (image.getRootDeviceType() != null) {
                        out.println("  RootDeviceType    : " + image.getRootDeviceType());
                    }
                    if (image.getRootDeviceName() != null) {
                        out.println("  RootDeviceName    : " + image.getRootDeviceName());
                    }
                    if (image.getBlockDeviceMappings() != null) {
                        List<BlockDeviceMapping> blockDeviceMappings = image.getBlockDeviceMappings();
                        for (BlockDeviceMapping blockDeviceMapping : blockDeviceMappings) {
                            out.println("  BlockDeviceMapping");
                            if (blockDeviceMapping.getDeviceName() != null) {
                                out.println("  DeviceName            : " + blockDeviceMapping.getDeviceName());
                            }
                            if (blockDeviceMapping.getVirtualName() != null) {
                                out.println("  VirtualName           : " + blockDeviceMapping.getVirtualName());
                            }
                            if (blockDeviceMapping.getEbs() != null) {
                                EbsBlockDevice ebs = blockDeviceMapping.getEbs();
                                out.println("  Ebs");
                                if (ebs.getSnapshotId() != null) {
                                    out.println("    SnapshotId          : " + ebs.getSnapshotId());
                                }
                                if(ebs.getVolumeSize()!=null){
                                    out.println("    VolumeSize          : " + ebs.getVolumeSize());
                                }
                                if (ebs.getDeleteOnTermination() != null) {
                                    out.println("    DeleteOnTermination : " + ebs.getDeleteOnTermination());
                                }
                            }
                            if (blockDeviceMapping.getNoDevice() != null) {
                                out.println("  NoDevice              : " + blockDeviceMapping.getNoDevice());
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
