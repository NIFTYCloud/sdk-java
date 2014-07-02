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

import java.util.List;

import com.nifty.cloud.sdk.ClientConfiguration;
import com.nifty.cloud.sdk.NiftyClientException;
import com.nifty.cloud.sdk.Protocol;
import com.nifty.cloud.sdk.auth.BasicCredentials;
import com.nifty.cloud.sdk.auth.Credentials;
import com.nifty.cloud.sdk.auth.SignatureUtils.SignatureMethod;
import com.nifty.cloud.sdk.auth.SignatureUtils.SignatureVersion;
import com.nifty.cloud.sdk.server.NiftyServerClient;
import com.nifty.cloud.sdk.server.model.DescribeInstanceAttributeRequest;
import com.nifty.cloud.sdk.server.model.DescribeInstanceAttributeResult;
import com.nifty.cloud.sdk.server.model.EbsInstanceBlockDevice;
import com.nifty.cloud.sdk.server.model.InstanceAttribute;
import com.nifty.cloud.sdk.server.model.InstanceAutoScaleMapping;
import com.nifty.cloud.sdk.server.model.InstanceBlockDeviceMapping;
import com.nifty.cloud.sdk.server.model.InstanceLoadBalancerMapping;

import static java.lang.System.out;
import static java.lang.System.err;

/**
 * DescribeInstanceAttributeサンプル
 *
 */
public class DescribeInstanceAttributeSample {

    /**
     * DescribeInstanceAttributeを実行するサンプルです。
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
         * 認証情報とクライアント設定情報からサーバーカテゴリ クライアントを生成します。
         * 非同期実行を行う場合はNiftyServerAsyncClientクラスを指定します。
         ***********************************************************************/
        NiftyServerClient client = new NiftyServerClient(credential, config);

        /************************************************************************
         * 接続先URLを変更する場合は接続先を指定します。
         ***********************************************************************/
        // client.setEndpoint("endpoint_url");

        /************************************************************************
         * リクエストパラメーターを設定し、DescribeInstanceAttributeを実行します。
         ***********************************************************************/
        DescribeInstanceAttributeRequest request = new DescribeInstanceAttributeRequest();
        //request.setInstanceId("instanceId");
        //request.setAttribute("attribute");
        invokeDescribeInstanceAttribute(client, request);
    }

    /**
     * DescribeInstanceAttribute 実行サンプル
     * 設定されたリクエストから DescribeInstanceAttribute　を実行し、実行結果を表示します。
     *
     * @param client クライアント
     * @param request リクエスト
     */
    public static void invokeDescribeInstanceAttribute(
            NiftyServerClient client, DescribeInstanceAttributeRequest request) {
        try {
            DescribeInstanceAttributeResult result = client
                    .describeInstanceAttribute(request);

            out.println("DescribeInstanceAttribute Action Response");
            out.println("=============================================================================");
            if (result.getInstanceAttribute() != null) {
                InstanceAttribute instanceAttribute = result
                        .getInstanceAttribute();
                out.println("InstanceAttribute");

                if (instanceAttribute.getInstanceId() != null) {
                    out.println("  InstanceId                         : " + instanceAttribute.getInstanceId());
                }
                if (instanceAttribute.getInstanceType() != null) {
                    out.println("  InstanceType                       : " + instanceAttribute.getInstanceType());
                }
                if (instanceAttribute.getKernelId() != null) {
                    out.println("  KernelId                           : " + instanceAttribute.getKernelId());
                }
                if (instanceAttribute.getRamdiskId() != null) {
                    out.println("  RamdiskId                          : " + instanceAttribute.getRamdiskId());
                }
                if (instanceAttribute.getUserData() != null) {
                    out.println("  UserData                           : " + instanceAttribute.getUserData());
                }
                if (instanceAttribute.getDisableApiTermination() != null) {
                    out.println("  DisableApiTermination              : " + instanceAttribute.getDisableApiTermination());
                }
                if (instanceAttribute.getInstanceInitiatedShutdownBehavior() != null) {
                    out.println("  InstanceInitiatedShutdownBehavior  : " + instanceAttribute.getInstanceInitiatedShutdownBehavior());
                }
                if (instanceAttribute.getRootDeviceName() != null) {
                    out.println("  RootDeviceName                     : " + instanceAttribute.getRootDeviceName());
                }
                if (instanceAttribute.getBlockDeviceMappings() != null) {
                    List<InstanceBlockDeviceMapping> blockDeviceMappings = instanceAttribute.getBlockDeviceMappings();
                    for (InstanceBlockDeviceMapping instanceBlockDeviceMapping : blockDeviceMappings) {
                        out.println("  BlockDeviceMapping");
                        if (instanceBlockDeviceMapping.getDeviceName() != null) {
                            out.println("    DeviceName       : " + instanceBlockDeviceMapping.getDeviceName());
                        }
                        if (instanceBlockDeviceMapping.getEbs() != null) {
                            EbsInstanceBlockDevice ebs = instanceBlockDeviceMapping.getEbs();
                            out.println("    Ebs" + instanceBlockDeviceMapping.getDeviceName());
                            if (ebs.getVolumeId() != null) {
                                out.println("      VolumeId           : " + ebs.getVolumeId());
                            }
                            if (ebs.getStatus() != null) {
                                out.println("      Status             : " + ebs.getStatus());
                            }
                            if (ebs.getAttachTime() != null) {
                                out.println("      AttachTime         : " + ebs.getAttachTime());
                            }
                            if (ebs.getDeleteOnTermination() != null) {
                                out.println("      DeleteOnTermination: " + ebs.getDeleteOnTermination());
                            }
                        }
                    }
                }
                if (instanceAttribute.getAccountingType() != null) {
                    out.println("  AccountingType                     : " + instanceAttribute.getAccountingType());
                }
                if (instanceAttribute.getNextMonthAccountingType() != null) {
                	out.println("  NextMonthAccountingType            : " + instanceAttribute.getNextMonthAccountingType());
                }
                if (instanceAttribute.getLoadBalancing() != null) {
                    List<InstanceLoadBalancerMapping> instanceLoadBalancerMappings = instanceAttribute.getLoadBalancing();
                    for (InstanceLoadBalancerMapping instanceLoadBalancerMapping : instanceLoadBalancerMappings) {
                        out.println("  InstanceLoadBalancerMapping");
                        if (instanceLoadBalancerMapping.getLoadBalancerName() != null) {
                            out.println("    LoadBalancerName  : "
                                    + instanceLoadBalancerMapping.getLoadBalancerName());
                        }
                        if (instanceLoadBalancerMapping.getLoadBalancerPort() != null) {
                            out.println("    LoadBalancerPort  : "
                                    + instanceLoadBalancerMapping.getLoadBalancerPort());
                        }
                        if (instanceLoadBalancerMapping.getInstancePort() != null) {
                            out.println("    InstancePort      : "
                                    + instanceLoadBalancerMapping.getInstancePort());
                        }
                    }
                }
                if (instanceAttribute.getCopyInfo() != null) {
                    out.println("  CopyInfo                           : " + instanceAttribute.getCopyInfo());
                }
                if (instanceAttribute.getAutoscaling() != null) {
                    InstanceAutoScaleMapping instanceAutoScaleMapping = instanceAttribute.getAutoscaling();
                    out.println("  Autoscaling");
                    if (instanceAutoScaleMapping.getAutoScalingGroupName() != null) {
                        out.println("    AutoScalingGroupName               : " + instanceAutoScaleMapping.getAutoScalingGroupName());
                    }
                    if (instanceAutoScaleMapping.getExpireTime() != null) {
                        out.println("    ExpireTime                         : " + instanceAutoScaleMapping.getExpireTime());
                    }
                }
                if (instanceAttribute.getIpType() != null) {
                    out.println("  IpType                             : " + instanceAttribute.getIpType());
                }
                if (instanceAttribute.getNiftyPrivateIpType() != null) {
                    out.println("  NiftyPrivateIpType                 : " + instanceAttribute.getNiftyPrivateIpType());
                }
                if (instanceAttribute.getGroupId() != null) {
                    out.println("  GroupId                            : " + instanceAttribute.getGroupId());
                }
                if (instanceAttribute.getDescription() != null) {
                    out.println("  Description                        : " + instanceAttribute.getDescription());
                }
            }
            out.println("=============================================================================");
        } catch (NiftyClientException ex) {
            err.println("Message: " + ex.getMessage());
        }
    }
}
