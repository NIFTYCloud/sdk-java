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
 *  API Version: 1.15
 *  Date: 2013-06-28 17:00:00
 * 
 */
package com.nifty.cloud.sdk.sample;


import java.util.ArrayList;
import java.util.List;

import org.apache.commons.codec.binary.Base64;

import com.nifty.cloud.sdk.ClientConfiguration;
import com.nifty.cloud.sdk.NiftyClientException;
import com.nifty.cloud.sdk.Protocol;
import com.nifty.cloud.sdk.auth.BasicCredentials;
import com.nifty.cloud.sdk.auth.Credentials;
import com.nifty.cloud.sdk.auth.SignatureUtils.SignatureMethod;
import com.nifty.cloud.sdk.auth.SignatureUtils.SignatureVersion;
import com.nifty.cloud.sdk.server.NiftyServerClient;
import com.nifty.cloud.sdk.server.model.BlockDeviceMapping;
import com.nifty.cloud.sdk.server.model.EbsBlockDevice;
import com.nifty.cloud.sdk.server.model.EbsInstanceBlockDevice;
import com.nifty.cloud.sdk.server.model.Instance;
import com.nifty.cloud.sdk.server.model.InstanceAutoScaleMapping;
import com.nifty.cloud.sdk.server.model.InstanceBlockDeviceMapping;
import com.nifty.cloud.sdk.server.model.InstanceLoadBalancerMapping;
import com.nifty.cloud.sdk.server.model.InstanceState;
import com.nifty.cloud.sdk.server.model.Monitoring;
import com.nifty.cloud.sdk.server.model.Placement;
import com.nifty.cloud.sdk.server.model.ProductCode;
import com.nifty.cloud.sdk.server.model.Reservation;
import com.nifty.cloud.sdk.server.model.RunInstancesRequest;
import com.nifty.cloud.sdk.server.model.RunInstancesResult;
import com.nifty.cloud.sdk.server.model.StateReason;

import static java.lang.System.out;
import static java.lang.System.err;

/**
 * RunInstancesサンプル
 *
 */
public class RunInstancesSample {

    /**
     * RunInstancesを実行するサンプルです。
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
         * リクエストパラメーターを設定し、RunInstancesを実行します。
         ***********************************************************************/
        RunInstancesRequest request = new RunInstancesRequest();
        // request.setImageId("ImageId");
        // request.setMinCount(0);
        // request.setMaxCount(0);
        // request.setKeyName("keyName");
        // List<String> groupNames = new ArrayList<String>();
        // groupNames.add("groupName");
        // request.setGroupNames(groupNames);
        // request.setAdditionalInfo("additionalInfo");
        // request.setUserData(new String(Base64.encodeBase64Chunked("userData".getBytes())));
        // request.setUserDataEncoding("base64");
        // request.setAddressingType("addressingType");
        // request.setInstanceType("instanceType");
        // Placement placement = new Placement();
        // placement.setAvailabilityZone("availabilityZone");
        // request.setPlacement(placement);
        // request.setKernelId("kernelId");
        // request.setRamdiskId("ramdiskId");
        // List<BlockDeviceMapping> blockDeviceMappings = new ArrayList<BlockDeviceMapping>();
        // BlockDeviceMapping blockDeviceMapping = new BlockDeviceMapping();
        // blockDeviceMapping.setDeviceName("deviceName");
        // blockDeviceMapping.setVirtualName("virtualName");
        // EbsBlockDevice ebs = new EbsBlockDevice();
        // ebs.setSnapshotId("snapshotId");
        // ebs.setVolumeSize(0);
        // ebs.setDeleteOnTermination(false);
        // blockDeviceMapping.setEbs(ebs);
        // blockDeviceMapping.setNoDevice("noDevice");
        // blockDeviceMappings.add(blockDeviceMapping);
        // request.setBlockDeviceMappings(blockDeviceMappings);
        // request.setMonitoring(false);
        // request.setSubnetId("subnetId");
        // request.setDisableApiTermination(false);
        // request.setInstanceInitiatedShutdownBehavior("instanceInitiatedShutdownBehavior");
        // request.setAccountingType("accountingType");
        // request.setInstanceId("instanceId");
        // request.setAdmin("admin");
        // request.setPassword("password");
        // request.setIpType("static");

        invokeRunInstances(client, request);
    }

    /**
     * RunInstances 実行サンプル
     * 設定されたリクエストから RunInstances　を実行し、実行結果を表示します。
     *
     * @param client  クライアント
     * @param request リクエスト
     */
    public static void invokeRunInstances(NiftyServerClient client,
            RunInstancesRequest request) {
        try {
            RunInstancesResult result = client.runInstances(request);

            out.println("RunInstances Action Response");
            out.println("=============================================================================");

            if (result.getReservation() != null) {
                Reservation reservation = result.getReservation();
                out.println("Reservation");
                if (reservation.getRequesterId() != null) {
                    out.println("  RequesterId    : " + reservation.getRequesterId());
                }
                if (reservation.getOwnerId() != null) {
                    out.println("  OwnerId        : " + reservation.getOwnerId());
                }
                if (reservation.getReservationId() != null) {
                    out.println("  ReservationId  : " + reservation.getReservationId());
                }
                if(reservation.getGroupIds()!=null){
                    List<String> groupNames = reservation.getGroupIds();
                    for(String groupName:groupNames){
                        if(groupName !=null){
                            out.println("  GroupName      : " + groupName);
                        }
                    }
                }
                if(reservation.getInstances()!=null){
                    List<Instance> instances = reservation.getInstances();
                    for(Instance instance:instances){
                        if (instance.getInstanceId() != null) {
                            out.println("  InstanceId     : " + instance.getInstanceId());
                        }
                        if (instance.getImageId() != null) {
                            out.println("  ImageId        : " + instance.getImageId());
                        }
                        if (instance.getState() != null) {
                            InstanceState state = instance.getState();
                            out.println("  State");
                            if(state.getCode()!=null){
                                out.println("    Code         : " + state.getCode());
                            }
                            if(state.getName()!=null){
                                out.println("    Name         : " + state.getName());
                            }
                        }
                        if (instance.getPrivateDnsName() != null) {
                            out.println("  PrivateDnsName    : " + instance.getPrivateDnsName());
                        }
                        if (instance.getDnsName() != null) {
                            out.println("  DnsName           : " + instance.getDnsName());
                        }
                        if (instance.getReason() != null) {
                            out.println("  Reason            : " + instance.getReason());
                        }
                        if (instance.getKeyName() != null) {
                            out.println("  KeyName           : " + instance.getKeyName());
                        }
                        if (instance.getAdmin() != null) {
                            out.println("  Admin             : " + instance.getAdmin());
                        }
                        if (instance.getAmiLaunchIndex() != null) {
                            out.println("  AmiLaunchIndex    : " + instance.getAmiLaunchIndex());
                        }
                        if (instance.getProductCodes() != null) {
                            if (instance.getProductCodes() != null) {
                                List<ProductCode> productCodes = instance.getProductCodes();
                                out.println("  ProductCodes");
                                for (ProductCode productCode : productCodes) {
                                    if (productCode.getProductCodeId() != null) {
                                        out.println("    ProductCodeId        : " + productCode.getProductCodeId());
                                    }
                                }
                            }
                        }
                        if (instance.getInstanceType() != null) {
                            out.println("  InstanceType      : " + instance.getInstanceType());
                        }
                        if (instance.getLaunchTime() != null) {
                            out.println("  LaunchTime        : " + instance.getLaunchTime());
                        }
                        if (instance.getPlacement() != null) {
                            Placement placement = instance.getPlacement();
                            out.println("  Placement");
                            if (placement.getAvailabilityZone() != null) {
                                out.println("    AvailabilityZone  : " + placement.getAvailabilityZone());
                            }
                        }
                        if (instance.getKernelId() != null) {
                            out.println("  KernelId          : " + instance.getKernelId());
                        }
                        if (instance.getRamdiskId() != null) {
                            out.println("  RamdiskId         : " + instance.getRamdiskId());
                        }
                        if (instance.getPlatform() != null) {
                            out.println("  Platform          : " + instance.getPlatform());
                        }
                        if(instance.getMonitoring()!= null){
                            Monitoring monitoring = instance.getMonitoring();
                            out.println("  Monitoring");
                            if(monitoring.getState() != null){
                                out.println("    State             : " + monitoring.getState());
                            }
                        }
                        if (instance.getSubnetId() != null) {
                            out.println("  SubnetId          : " + instance.getSubnetId());
                        }
                        if (instance.getVpcId() != null) {
                            out.println("  VpcId             : " + instance.getVpcId());
                        }
                        if (instance.getPrivateIpAddress() != null) {
                            out.println("  PrivateIpAddress  : " + instance.getPrivateIpAddress());
                        }
                        if (instance.getIpAddress() != null) {
                            out.println("  IpAddress         : " + instance.getIpAddress());
                        }
                        if (instance.getPrivateIpAddressV6() != null) {
                            out.println("  PrivateIpAddressV6: " + instance.getPrivateIpAddressV6());
                        }
                        if (instance.getIpAddressV6() != null) {
                            out.println("  IpAddressV6       : " + instance.getIpAddressV6());
                        }
                        if (instance.getStateReason() != null) {
                            out.println("  StateReason");
                            StateReason stateReason = instance.getStateReason();
                            if(stateReason.getCode()!=null){
                                out.println("    Code              : " + stateReason.getCode());
                            }
                            if(stateReason.getMessage()!=null){
                                out.println("    Message           : " + stateReason.getMessage());
                            }
                        }
                        if (instance.getArchitecture() != null) {
                            out.println("  Architecture      : " + instance.getArchitecture());
                        }
                        if (instance.getRootDeviceType() != null) {
                            out.println("  RootDeviceType    : " + instance.getRootDeviceType());
                        }
                        if (instance.getRootDeviceName() != null) {
                            out.println("  RootDeviceName    : " + instance.getRootDeviceName());
                        }
                        if(instance.getBlockDeviceMappings()!=null){
                            List<InstanceBlockDeviceMapping> instanceBlockDeviceMappings = instance.getBlockDeviceMappings();
                            for (InstanceBlockDeviceMapping instanceBlockDeviceMapping : instanceBlockDeviceMappings) {
                                if (instanceBlockDeviceMapping.getDeviceName() != null) {
                                    out.println("  DeviceName            : " + instanceBlockDeviceMapping.getDeviceName());
                                }
                                if(instanceBlockDeviceMapping.getEbs()!=null){
                                    EbsInstanceBlockDevice ebs = instanceBlockDeviceMapping.getEbs();
                                    out.println("  Ebs");
                                    if (ebs.getVolumeId() != null) {
                                        out.println("    VolumeId              : " + ebs.getVolumeId());
                                    }
                                    if (ebs.getStatus() != null) {
                                        out.println("    Status                : " + ebs.getStatus());
                                    }
                                    if (ebs.getAttachTime() != null) {
                                        out.println("    AttachTime            : " + ebs.getAttachTime());
                                    }
                                    if (ebs.getDeleteOnTermination() != null) {
                                        out.println("    DeleteOnTermination   : " + ebs.getDeleteOnTermination());
                                    }
                                }
                            }
                        }
                        if (instance.getInstanceLifecycle() != null) {
                            out.println("  InstanceLifecycle        : " + instance.getInstanceLifecycle());
                        }
                        if (instance.getSpotInstanceRequestId() != null) {
                            out.println("  SpotInstanceRequestId    : " + instance.getSpotInstanceRequestId());
                        }
                        if (instance.getAccountingType() != null) {
                            out.println("  AccountingType           : " + instance.getAccountingType());
                        }
                        if(instance.getLoadbalancing()!=null){
                            List<InstanceLoadBalancerMapping> loadBalancerMappings = instance.getLoadbalancing();
                            out.println("  LoadBalancerMapping");
                            for (InstanceLoadBalancerMapping loadBalancerMapping : loadBalancerMappings) {
                                if (loadBalancerMapping.getLoadBalancerName() != null) {
                                    out.println("    LoadBalancerName           : " + loadBalancerMapping.getLoadBalancerName());
                                }
                                if (loadBalancerMapping.getLoadBalancerPort() != null) {
                                    out.println("    LoadBalancerPort           : " + loadBalancerMapping.getLoadBalancerPort());
                                }
                                if (loadBalancerMapping.getInstancePort() != null) {
                                    out.println("    InstancePort               : " + loadBalancerMapping.getInstancePort());
                                }
                            }
                        }
                        if(instance.getCopyInfo()!=null){
                            out.println("  CopyInfo                 : " + instance.getCopyInfo());
                        }
                        if(instance.getAutoscaling()!=null){
                            InstanceAutoScaleMapping autoScaleMapping = instance.getAutoscaling();
                            out.println("  AutoScaleMapping");
                            if (autoScaleMapping.getAutoScalingGroupName() != null) {
                                out.println("    AutoScalingGroupName       : " + autoScaleMapping.getAutoScalingGroupName());
                            }
                            if (autoScaleMapping.getExpireTime() != null) {
                                out.println("    ExpireTime                 : " + autoScaleMapping.getExpireTime());
                            }
                        }
                        if (instance.getIpType() != null) {
                            out.println("  IpType                   : " + instance.getIpType());
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
