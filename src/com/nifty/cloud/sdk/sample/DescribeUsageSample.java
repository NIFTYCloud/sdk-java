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
 *  Date: 2012-02-24 09:53:00
 *
 */
package com.nifty.cloud.sdk.sample;

import static java.lang.System.out;
import static java.lang.System.err;

import java.util.List;

import com.nifty.cloud.sdk.ClientConfiguration;
import com.nifty.cloud.sdk.NiftyClientException;
import com.nifty.cloud.sdk.auth.BasicCredentials;
import com.nifty.cloud.sdk.auth.Credentials;
import com.nifty.cloud.sdk.usage.model.DescribeUsageRequest;
import com.nifty.cloud.sdk.usage.model.DescribeUsageResult;
import com.nifty.cloud.sdk.usage.model.UsageAutoScale;
import com.nifty.cloud.sdk.usage.model.UsageChargeDetail;
import com.nifty.cloud.sdk.usage.model.UsageCopy;
import com.nifty.cloud.sdk.usage.model.UsageDetail;
import com.nifty.cloud.sdk.usage.model.UsageDetailDouble;
import com.nifty.cloud.sdk.usage.model.UsageExtraCharge;
import com.nifty.cloud.sdk.usage.model.UsageImage;
import com.nifty.cloud.sdk.usage.model.UsageInstance;
import com.nifty.cloud.sdk.usage.model.UsageLoadBalancer;
import com.nifty.cloud.sdk.usage.model.UsageMailSend;
import com.nifty.cloud.sdk.usage.model.UsageMultiAccount;
import com.nifty.cloud.sdk.usage.model.UsageNetwork;
import com.nifty.cloud.sdk.usage.model.UsageOsOptionCharge;
import com.nifty.cloud.sdk.usage.model.UsagePatternAuth;
import com.nifty.cloud.sdk.usage.model.UsagePremiumSupport;
import com.nifty.cloud.sdk.usage.model.UsagePrivateLan;
import com.nifty.cloud.sdk.usage.model.UsageSecurityGroup;
import com.nifty.cloud.sdk.usage.model.UsageSslCert;
import com.nifty.cloud.sdk.usage.model.UsageStorage;
import com.nifty.cloud.sdk.usage.model.UsageVolume;
import com.nifty.cloud.sdk.usage.NiftyUsageClient;

/**
 * DescribeUsageサンプル
 *
 */
public class DescribeUsageSample {

    /**
     * DescribeUsageを実行するサンプルです。
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
         *   - HTTPメソッド
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
         * 認証情報とクライアント設定情報から利用状況カテゴリ クライアントを生成します。
         * 非同期実行を行う場合はNiftyUsageAsyncClientクラスを指定します。
         ***********************************************************************/
        NiftyUsageClient client = new NiftyUsageClient(credential, config);

        /************************************************************************
         * 接続先URLを変更する場合は接続先を指定します。
         ***********************************************************************/
        // client.setEndpoint("endpoint_url");

        /************************************************************************
         * リクエストパラメーターを設定し、DescribeUsageを実行します。
         ***********************************************************************/
        DescribeUsageRequest request = new DescribeUsageRequest();

         // request.setYearMonth("yearMonth");

        invokeDescribeUsage(client, request);
    }

    /**
     * DescribeUsage 実行サンプル
     * 設定されたリクエストから DescribeUsage を実行し、実行結果を表示します。
     *
     * @param client クライアント
     * @param request リクエスト
     */
    public static void invokeDescribeUsage(NiftyUsageClient client,
            DescribeUsageRequest request) {
        try {
            DescribeUsageResult result = client.describeUsage(request);

            out.println("DescribeUsage Action Response");
            out.println("=============================================================================");

            if (result.getYearMonth() != null) {
                out.println("YearMonth : " + result.getYearMonth());
            }
            if (result.getInstance() != null) {
                out.println("Instance");
                UsageInstance instance = result.getInstance();
                if (instance.getInstanceMonthlyRates() != null) {
                    out.println("  InstanceMonthlyRates");
                    List<UsageDetail> instanceMonthlyRates = instance.getInstanceMonthlyRates();
                    for (UsageDetail instanceMonthlyRate : instanceMonthlyRates) {
                        if (instanceMonthlyRate.getType() != null) {
                            out.println("    Type  : " + instanceMonthlyRate.getType());
                        }
                        if (instanceMonthlyRate.getUnit() != null) {
                            out.println("    Unit  : " + instanceMonthlyRate.getUnit());
                        }
                        if (instanceMonthlyRate.getValue() != null) {
                            out.println("    Value : " + instanceMonthlyRate.getValue());
                        }
                    }
                }
                if (instance.getRunningInstanceMeasuredRates() != null) {
                    out.println("  RunningInstanceMeasuredRates");
                    List<UsageDetail> runningInstanceMeasuredRates = instance.getRunningInstanceMeasuredRates();
                    for (UsageDetail runningInstanceMeasuredRate : runningInstanceMeasuredRates) {
                        if (runningInstanceMeasuredRate.getType() != null) {
                            out.println("    Type  : " + runningInstanceMeasuredRate.getType());
                        }
                        if (runningInstanceMeasuredRate.getUnit() != null) {
                            out.println("    Unit  : " + runningInstanceMeasuredRate.getUnit());
                        }
                        if (runningInstanceMeasuredRate.getValue() != null) {
                            out.println("    Value : " + runningInstanceMeasuredRate.getValue());
                        }
                    }
                }
                if (instance.getStoppedInstanceMeasuredRates() != null) {
                    out.println("  StoppedInstanceMeasuredRates");
                    List<UsageDetail> stoppedInstanceMeasuredRates = instance.getStoppedInstanceMeasuredRates();
                    for (UsageDetail stoppedInstanceMeasuredRate : stoppedInstanceMeasuredRates) {
                        if (stoppedInstanceMeasuredRate.getType() != null) {
                            out.println("    Type  : " + stoppedInstanceMeasuredRate.getType());
                        }
                        if (stoppedInstanceMeasuredRate.getUnit() != null) {
                            out.println("    Unit  : " + stoppedInstanceMeasuredRate.getUnit());
                        }
                        if (stoppedInstanceMeasuredRate.getValue() != null) {
                            out.println("    Value : " + stoppedInstanceMeasuredRate.getValue());
                        }
                    }
                }
                if (instance.getDynamicIpMonthlyRate() != null) {
                    out.println("  DynamicIpMonthlyRate");
                    UsageDetail dynamicIpMonthlyRate = instance.getDynamicIpMonthlyRate();
                    if (dynamicIpMonthlyRate.getType() != null) {
                        out.println("    Type  : " + dynamicIpMonthlyRate.getType());
                    }
                    if (dynamicIpMonthlyRate.getUnit() != null) {
                        out.println("    Unit  : " + dynamicIpMonthlyRate.getUnit());
                    }
                    if (dynamicIpMonthlyRate.getValue() != null) {
                        out.println("    Value : " + dynamicIpMonthlyRate.getValue());
                    }
                }
                if (instance.getDynamicIpMeasuredRate() != null) {
                    out.println("  DynamicIpMeasuredRate");
                    UsageDetail dynamicIpMeasuredRate = instance.getDynamicIpMeasuredRate();
                    if (dynamicIpMeasuredRate.getType() != null) {
                        out.println("    Type  : " + dynamicIpMeasuredRate.getType());
                    }
                    if (dynamicIpMeasuredRate.getType() != null) {
                        out.println("    Unit  : " + dynamicIpMeasuredRate.getUnit());
                    }
                    if (dynamicIpMeasuredRate.getType() != null) {
                        out.println("    Value  : " + dynamicIpMeasuredRate.getValue());
                    }
                }
                if (instance.getOsMonthlyRates() != null) {
                    out.println("  OsMonthlyRates");
                    List<UsageDetail> osMonthlyRates = instance.getOsMonthlyRates();
                    for (UsageDetail osMonthlyRate : osMonthlyRates) {
                        if (osMonthlyRate.getType() != null) {
                            out.println("    Type  : " + osMonthlyRate.getType());
                        }
                        if (osMonthlyRate.getUnit() != null) {
                            out.println("    Unit  : " + osMonthlyRate.getUnit());
                        }
                        if (osMonthlyRate.getValue() != null) {
                            out.println("    Value : " + osMonthlyRate.getValue());
                        }
                    }
                }
                if (instance.getOsMeasuredRates() != null) {
                    out.println("  osMeasuredRates");
                    List<UsageDetail> osMeasuredRates = instance.getOsMeasuredRates();
                    for(UsageDetail osMeasuredRate : osMeasuredRates) {
                        if (osMeasuredRate.getType() != null) {
                            out.println("    Type  : " + osMeasuredRate.getType());
                        }
                        if (osMeasuredRate.getUnit() != null) {
                            out.println("    Unit  : " + osMeasuredRate.getUnit());
                        }
                        if (osMeasuredRate.getValue() != null) {
                            out.println("    Value : " + osMeasuredRate.getValue());
                        }
                    }
                }
                if (instance.getMultiIpMonthlyRate() != null) {
                	out.println("  MultiIpMonthlyRate");
                	UsageDetail multiIpMonthlyRate = instance.getMultiIpMonthlyRate();
                    if (multiIpMonthlyRate.getType() != null) {
                        out.println("    Type  : " + multiIpMonthlyRate.getType());
                    }
                    if (multiIpMonthlyRate.getType() != null) {
                        out.println("    Unit  : " + multiIpMonthlyRate.getUnit());
                    }
                    if (multiIpMonthlyRate.getType() != null) {
                        out.println("    Value  : " + multiIpMonthlyRate.getValue());
                    }
                }
            }
            if (result.getCopy() != null) {
                out.println("Copy");
                UsageCopy copy = result.getCopy();
                if (copy.getInstanceCopy() != null) {
                    out.println("  InstanceCopy");
                    UsageDetail instanceCopy = copy.getInstanceCopy();
                    if (instanceCopy.getType() != null) {
                        out.println("    Type  : " + instanceCopy.getType());
                    }
                    if (instanceCopy.getUnit() != null) {
                        out.println("    Unit  : " + instanceCopy.getUnit());
                    }
                    if (instanceCopy.getValue() != null) {
                        out.println("    Value  : " + instanceCopy.getValue());
                    }
                }
            }
            if (result.getImage() != null) {
                out.println("Image");
                UsageImage image = result.getImage();
                if (image.getCreateImage() != null) {
                    out.println("  CreateImage");
                    UsageDetail createImage = image.getCreateImage();
                    if (createImage.getType() != null) {
                        out.println("    Type  : " + createImage.getType());
                    }
                    if (createImage.getUnit() != null) {
                        out.println("    Unit  : " + createImage.getUnit());
                    }
                    if (createImage.getValue() != null) {
                        out.println("    Value : " + createImage.getValue());
                    }
                }
                if (image.getKeepImages() != null) {
                    out.println("  KeepImages");
                    List<UsageDetail> keepImages = image.getKeepImages();
                    for (UsageDetail keepImage : keepImages) {
                        if (keepImage.getType() != null) {
                            out.println("    Type  : " + keepImage.getType());
                        }
                        if (keepImage.getUnit() != null) {
                            out.println("    Unit  : " + keepImage.getUnit());
                        }
                        if (keepImage.getValue() != null) {
                            out.println("     Value : " + keepImage.getValue());
                        }
                    }
                }
            }
            if (result.getVolume() != null) {
                out.println("Volume");
                UsageVolume volume = result.getVolume();
                if (volume.getVolumes() != null) {
                    out.println("  Volumes");
                    List<UsageDetail> volumes = volume.getVolumes();
                    for (UsageDetail volume2 : volumes) {
                        if (volume2.getType() != null) {
                            out.println("    Type  : " + volume2.getType());
                        }
                        if (volume2.getUnit() != null) {
                            out.println("    Unit  : " + volume2.getUnit());
                        }
                        if (volume2.getValue() != null) {
                            out.println("    Value : " + volume2.getValue());
                        }
                    }
                }
                if (volume.getVolumeMeasuredRates() != null) {
                    out.println("  VolumeMeasuredRates");
                    List<UsageDetail> volumeMeasuredRates = volume.getVolumeMeasuredRates();
                    for (UsageDetail volumeMeasuredRate : volumeMeasuredRates) {
                        if (volumeMeasuredRate.getType() != null) {
                            out.println("    Type  : " + volumeMeasuredRate.getType());
                        }
                        if (volumeMeasuredRate.getUnit() != null) {
                            out.println("    Unit  : " + volumeMeasuredRate.getUnit());
                        }
                        if (volumeMeasuredRate.getValue() != null) {
                            out.println("    Value : " + volumeMeasuredRate.getValue());
                        }
                    }
                }
                if (volume.getImportInstanceDiskMonthlyRate() != null) {
                    out.println("  ImportInstanceDiskMonthlyRate");
                    UsageDetail importInstanceDiskMonthlyRate = volume.getImportInstanceDiskMonthlyRate();
                    if (importInstanceDiskMonthlyRate.getType() != null) {
                        out.println("    Type  : " + importInstanceDiskMonthlyRate.getType());
                    }
                    if (importInstanceDiskMonthlyRate.getUnit() != null) {
                        out.println("    Unit  : " + importInstanceDiskMonthlyRate.getUnit());
                    }
                    if (importInstanceDiskMonthlyRate.getValue() != null) {
                        out.println("    Value : " + importInstanceDiskMonthlyRate.getValue());
                    }
                }
                if (volume.getImportInstanceDiskMeasuredRate() != null) {
                	out.println("ImportInstanceDiskMeasuredRate");
                	UsageDetail importInstanceDiskMeasuredRate = volume.getImportInstanceDiskMeasuredRate();
                	if (importInstanceDiskMeasuredRate.getType() != null) {
                		out.println("    Type  : " + importInstanceDiskMeasuredRate.getType());
                	}
                	if (importInstanceDiskMeasuredRate.getUnit() != null) {
                		out.println("    Unit  : " + importInstanceDiskMeasuredRate.getUnit());
                	}
                	if (importInstanceDiskMeasuredRate.getValue() != null) {
                		out.println("    Value : " + importInstanceDiskMeasuredRate.getValue());
                	}
                }
            }
            if (result.getNetwork() != null) {
                out.println("Network");
                UsageNetwork network = result.getNetwork();
                if (network.getNetworkFlows() != null) {
                    out.println("  NetworkFlows");
                    List<UsageDetail> networkFlows = network.getNetworkFlows();
                    for(UsageDetail networkFlow : networkFlows) {
                        if (networkFlow.getType() != null) {
                            out.println("    Type  : " + networkFlow.getType());
                        }
                        if (networkFlow.getUnit() != null) {
                            out.println("    Unit  : " + networkFlow.getUnit());
                        }
                        if (networkFlow.getValue() != null) {
                            out.println("    Value : " + networkFlow.getValue());
                        }
                    }
                }
            }
            if (result.getSecurityGroup() != null) {
                out.println("SecurityGroup");
                UsageSecurityGroup securityGroup = result.getSecurityGroup();
                if (securityGroup.getSecurityGroupApplyTime() != null) {
                    out.println("  SecurityGroupApplyTime");
                    UsageDetail securityGroupApplyTime = securityGroup.getSecurityGroupApplyTime();
                    if (securityGroupApplyTime.getType() != null) {
                        out.println("    Type  : " + securityGroupApplyTime.getType());
                    }
                    if (securityGroupApplyTime.getUnit() != null) {
                        out.println("    Unit  : " + securityGroupApplyTime.getUnit());
                    }
                    if (securityGroupApplyTime.getValue() != null) {
                        out.println("    Value : " + securityGroupApplyTime.getValue());
                    }
                }
                if (securityGroup.getOptions() != null) {
                    out.println("  Option");
                    List<UsageDetail> options = securityGroup.getOptions();
                    for (UsageDetail option : options) {
                        if (option.getType() != null) {
                            out.println("    Type  : " + option.getType());
                        }
                        if (option.getUnit() != null) {
                            out.println("    Unit  : " + option.getUnit());
                        }
                        if (option.getValue() != null) {
                            out.println("    Value : " + option.getValue());
                        }
                    }
                }
            }
            if (result.getLoadBalancer() != null) {
                out.println("LoadBalancer");
                UsageLoadBalancer loadBalancer = result.getLoadBalancer();
                if (loadBalancer.getVips() != null) {
                    out.println("  VIPs");
                    List<UsageDetail> vips = loadBalancer.getVips();
                    for (UsageDetail vip : vips) {
                        if (vip.getType() != null) {
                            out.println("    Type  : " + vip.getType());
                        }
                        if (vip.getUnit() != null) {
                            out.println("    Unit  : " + vip.getUnit());
                        }
                        if (vip.getValue() != null) {
                            out.println("    Value : " + vip.getValue());
                        }
                    }
                }
                if (loadBalancer.getVipMeasuredRates() != null) {
                    out.println("  VipMeasuredRates");
                    List<UsageDetail> vipMeasuredRates = loadBalancer.getVipMeasuredRates();
                    for(UsageDetail vipMeasuredRate : vipMeasuredRates) {
                        if (vipMeasuredRate.getType() != null) {
                            out.println("    Type  : " + vipMeasuredRate.getType());
                        }
                        if (vipMeasuredRate.getUnit() != null) {
                            out.println("    Unit  : " + vipMeasuredRate.getUnit());
                        }
                        if (vipMeasuredRate.getValue() != null) {
                            out.println("    Value : " + vipMeasuredRate.getValue());
                        }
                    }
                }
                if (loadBalancer.getOptions() != null) {
                    out.println("  Options");
                    List<UsageDetail> options = loadBalancer.getOptions();
                    for(UsageDetail option : options) {
                        if (option.getType() != null) {
                            out.println("    Type  : " + option.getType());
                        }
                        if (option.getUnit() != null) {
                            out.println("    Unit  : " + option.getUnit());
                        }
                        if (option.getValue() != null) {
                            out.println("    Value : " + option.getValue());
                        }
                    }
                }
            }
            if (result.getAutoScale() != null) {
                out.println("AutoScale");
                UsageAutoScale autoScale = result.getAutoScale();
                if (autoScale.getAutoScaleCount() != null) {
                    out.println("  AutoScaleCount");
                    UsageDetail autoScaleCount = autoScale.getAutoScaleCount();
                    if (autoScaleCount.getType() != null) {
                        out.println("    Type  : " + autoScaleCount.getType());
                    }
                    if (autoScaleCount.getUnit() != null) {
                        out.println("    Unit  : " + autoScaleCount.getUnit());
                    }
                    if (autoScaleCount.getValue() != null) {
                        out.println("    Value : " + autoScaleCount.getValue());
                    }
                }
                if (autoScale.getRunningScaleOutInstances() != null) {
                    out.println("  RunningScaleOutInstances");
                    List<UsageDetail> runningScaleOutInstances = autoScale.getRunningScaleOutInstances();
                    for(UsageDetail runningScaleOUtInstance : runningScaleOutInstances) {
                        if (runningScaleOUtInstance.getType() != null) {
                            out.println("    Type  : " + runningScaleOUtInstance.getType());
                        }
                        if (runningScaleOUtInstance.getUnit() != null) {
                            out.println("    Unit  : " + runningScaleOUtInstance.getUnit());
                        }
                        if (runningScaleOUtInstance.getValue() != null) {
                            out.println("    Value : " + runningScaleOUtInstance.getValue());
                        }
                    }
                }
                if (autoScale.getStoppedScaleOutInstances() != null) {
                    out.println("  StoppedScaleOutInstances");
                    List<UsageDetail> stoppedScaleOutInstances = autoScale.getStoppedScaleOutInstances();
                    for (UsageDetail stoppedScaleOutInstance : stoppedScaleOutInstances) {
                        if (stoppedScaleOutInstance.getType() != null) {
                            out.println("    Type  " + stoppedScaleOutInstance.getType());
                        }
                        if (stoppedScaleOutInstance.getUnit() != null) {
                            out.println("    Unit  " + stoppedScaleOutInstance.getUnit());
                        }
                        if (stoppedScaleOutInstance.getValue() != null) {
                            out.println("    Value " + stoppedScaleOutInstance.getValue());
                        }
                    }
                }
                if (autoScale.getRunningScaleOutOses() != null) {
                    out.println("  RunningScaleOutOses");
                    List<UsageDetail> runningScaleOutOses = autoScale.getRunningScaleOutOses();
                    for(UsageDetail runningScaleOutOs : runningScaleOutOses) {
                        if (runningScaleOutOs.getType() != null) {
                            out.println("    Type  : " + runningScaleOutOs.getType());
                        }
                        if (runningScaleOutOs.getUnit() != null) {
                            out.println("    Unit  : " + runningScaleOutOs.getUnit());
                        }
                        if (runningScaleOutOs.getValue() != null) {
                            out.println("    Value : " + runningScaleOutOs.getValue());
                        }
                    }
                }
                if (autoScale.getStoppedScaleOutOses() != null) {
                    out.println("  StoppedScaleOutOses");
                    List<UsageDetail> stoppedScaleOutOses = autoScale.getStoppedScaleOutOses();
                    for (UsageDetail stoppedScaleOutOs : stoppedScaleOutOses) {
                        if (stoppedScaleOutOs.getType() != null) {
                            out.println("    Type  : " + stoppedScaleOutOs.getType());
                        }
                        if (stoppedScaleOutOs.getUnit() != null) {
                            out.println("    Unit  : " + stoppedScaleOutOs.getUnit());
                        }
                        if (stoppedScaleOutOs.getValue() != null) {
                            out.println("    Value : " + stoppedScaleOutOs.getValue());
                        }
                    }
                }
            }
            if (result.getSslCert() != null) {
                out.println("SSLCert");
                UsageSslCert sslCert = result.getSslCert();
                if (sslCert.getCreateSslCerts() != null) {
                    out.println("  CreateSSLCerts");
                    List<UsageDetail> createSslCerts = sslCert.getCreateSslCerts();
                    for(UsageDetail createSslCert : createSslCerts) {
                        if (createSslCert.getType() != null) {
                            out.println("    Type  : " + createSslCert.getType());
                        }
                        if (createSslCert.getUnit() != null) {
                            out.println("    Unit  : " + createSslCert.getUnit());
                        }
                        if (createSslCert.getValue() != null) {
                            out.println("    Value : " + createSslCert.getValue());
                        }
                    }
                }
            }
            if (result.getPrivateLan() != null) {
                out.println("PrivateLAN");
                UsagePrivateLan privateLan = result.getPrivateLan();
                if (privateLan.getPrivateLan() != null) {
                    out.println("  PrivateLAN ");
                    UsageDetail privateLan2 = privateLan.getPrivateLan();
                    if (privateLan2.getType() != null) {
                        out.println("    Type  : " + privateLan2.getType());
                    }
                    if (privateLan2.getUnit() != null) {
                        out.println("    Unit  : " + privateLan2.getUnit());
                    }
                    if (privateLan2.getValue() != null) {
                        out.println("    Value : " + privateLan2.getValue());
                    }
                }
            }
            if (result.getChargeDetail() != null) {
                out.println("ChargeDetail");
                UsageChargeDetail chargeDetail = result.getChargeDetail();
                if (chargeDetail.getChargeDetail() != null) {
                    out.println("  ChargeDetail");
                    UsageDetail chargeDetail2 = chargeDetail.getChargeDetail();
                    if (chargeDetail2.getType() != null) {
                        out.println("    Type  : " + chargeDetail2.getType());
                    }
                    if (chargeDetail2.getUnit() != null) {
                        out.println("    Unit  : " + chargeDetail2.getUnit());
                    }
                    if (chargeDetail2.getValue() != null) {
                        out.println("    Value : " + chargeDetail2.getValue());
                    }
                }
            }
            if (result.getPremiumSupport() != null) {
                out.println("PremiumSupport");
                UsagePremiumSupport premiumSupport = result.getPremiumSupport();
                if (premiumSupport.getPremiumSupports() != null) {
                    out.println("  PremiumSupports");
                    List<UsageDetail> premiumSupports = premiumSupport.getPremiumSupports();
                    for(UsageDetail support : premiumSupports) {
                        if (support.getType() != null) {
                            out.println("    Type  : " + support.getType());
                        }
                        if (support.getUnit() != null) {
                            out.println("    Unit  : " + support.getUnit());
                        }
                        if (support.getValue() != null) {
                            out.println("    Value : " + support.getValue());
                        }
                    }
                }
            }
            if (result.getMultiAccount() != null) {
                out.println("MultiAccount");
                UsageMultiAccount multiAccount = result.getMultiAccount();
                if (multiAccount.getMultiAccount() != null) {
                    out.println("  MultiAccount");
                    UsageDetail multiAccount2 = multiAccount.getMultiAccount();
                    if (multiAccount2.getType() != null) {
                        out.println("    Type  : " + multiAccount2.getType());
                    }
                    if (multiAccount2.getUnit() != null) {
                        out.println("    Unit  : " + multiAccount2.getUnit());
                    }
                    if (multiAccount2.getValue() != null) {
                        out.println("    Value : " + multiAccount2.getValue());
                    }
                }
            }
            if (result.getPatternAuth() != null) {
                out.println("PatternAuth");
                UsagePatternAuth patternAuth = result.getPatternAuth();
                if (patternAuth.getPatternAuths() != null) {
                    out.println("  PatternAuths");
                    List<UsageDetail> patternAuths = patternAuth.getPatternAuths();
                    for(UsageDetail patternAuth2 : patternAuths) {
                        if (patternAuth2.getType() != null) {
                            out.println("    Type  : " + patternAuth2.getType());
                        }
                        if (patternAuth2.getUnit() != null) {
                            out.println("    Unit  : " + patternAuth2.getUnit());
                        }
                        if (patternAuth2.getValue() != null) {
                            out.println("    Value : " + patternAuth2.getValue());
                        }
                    }
                }
            }
            if (result.getStorage() != null) {
                out.println("Storage");
                UsageStorage storage = result.getStorage();
                if (storage.getStorageMonthlyRate() != null) {
                    out.println("  StorageMonthlyRate");
                    UsageDetail storageMonthlyRate = storage.getStorageMonthlyRate();
                    if (storageMonthlyRate.getType() != null) {
                        out.println("    Type  : " + storageMonthlyRate.getType());
                    }
                    if (storageMonthlyRate.getUnit() != null) {
                        out.println("    Unit  : " + storageMonthlyRate.getUnit());
                    }
                    if (storageMonthlyRate.getValue() != null) {
                        out.println("    Value : " + storageMonthlyRate.getValue());
                    }
                }
                if (storage.getStorageMeasuredRate() != null) {
                    out.println("  StorageMeasuredRate");
                    UsageDetailDouble storageMeasuredRate = storage.getStorageMeasuredRate();
                    if (storageMeasuredRate.getType() != null) {
                        out.println("    Type  : " + storageMeasuredRate.getType());
                    }
                    if (storageMeasuredRate.getUnit() != null) {
                        out.println("    Unit  : " + storageMeasuredRate.getUnit());
                    }
                    if (storageMeasuredRate.getValue() != null) {
                        out.println("    Value : " + storageMeasuredRate.getValue());
                    }
                }
            }
            if (result.getMailSend() != null) {
                out.println("MailSend");
                UsageMailSend mailSend = result.getMailSend();
                if (mailSend.getMailSendInitial() != null) {
                    out.println("  MailSendInitial");
                    UsageDetail mailSendInitial = mailSend.getMailSendInitial();
                    if (mailSendInitial.getType() != null) {
                        out.println("    Type  : " + mailSendInitial.getType());
                    }
                    if (mailSendInitial.getUnit() != null) {
                        out.println("    Unit  : " + mailSendInitial.getUnit());
                    }
                    if (mailSendInitial.getValue() != null) {
                        out.println("    Value : " + mailSendInitial.getValue());
                    }
                }
                if (mailSend.getMailSendMonthlyRate() != null) {
                    out.println("  MailSendMonthlyRate");
                    List<UsageDetail> mailSendMonthlyRates = mailSend.getMailSendMonthlyRate();
                    for (UsageDetail mailSendMonthlyRate: mailSendMonthlyRates) {
                        if (mailSendMonthlyRate.getType() != null) {
                            out.println("    Type  : " + mailSendMonthlyRate.getType());
                        }
                        if (mailSendMonthlyRate.getUnit() != null) {
                            out.println("    Unit  : " + mailSendMonthlyRate.getUnit());
                        }
                        if (mailSendMonthlyRate.getValue() != null) {
                            out.println("    Value : " + mailSendMonthlyRate.getValue());
                        }
                    }
                }
                if (mailSend.getMailSendMeasuredRate() != null) {
                    out.println("  MailSendMeasuredRate");
                    UsageDetail mailSendMesuredRate = mailSend.getMailSendMeasuredRate();
                    if (mailSendMesuredRate.getType() != null) {
                        out.println("    Type  : " + mailSendMesuredRate.getType());
                    }
                    if (mailSendMesuredRate.getUnit() != null) {
                        out.println("    Unit  : " + mailSendMesuredRate.getUnit());
                    }
                    if (mailSendMesuredRate.getValue() != null) {
                        out.println("    Value : " + mailSendMesuredRate.getValue());
                    }
                }
                if (mailSend.getMailSendMonthlyRateExceeded() != null) {
                    out.println("  MailSendMonthlyExceedRate");
                    UsageDetail mailSendMonthlyExceedRate = mailSend.getMailSendMonthlyRateExceeded();
                    if (mailSendMonthlyExceedRate.getType() != null) {
                        out.println("    Type  : " + mailSendMonthlyExceedRate.getType());
                    }
                    if (mailSendMonthlyExceedRate.getUnit() != null) {
                        out.println("    Unit  : " + mailSendMonthlyExceedRate.getUnit());
                    }
                    if (mailSendMonthlyExceedRate.getValue() != null) {
                        out.println("    Value : " + mailSendMonthlyExceedRate.getValue());
                    }
                }
                if (mailSend.getOptions() != null) {
                    out.println("  OptionMonthly");
                    List<UsageDetail> options = mailSend.getOptions();
                    for(UsageDetail option : options) {
                        if (option.getType() != null) {
                            out.println("    Type  : " + option.getType());
                        }
                        if (option.getUnit() != null) {
                            out.println("    Unit  : " + option.getUnit());
                        }
                        if (option.getValue() != null) {
                            out.println("    Value : " + option.getValue());
                        }
                    }
                }
            }
            if (result.getOsOptionCharge() != null) {
                out.println("OsOptionCharge");
                UsageOsOptionCharge osOption = result.getOsOptionCharge();
                if (osOption.getOsOptionChargeMonthlyRates() != null) {
                    out.println("  OsOptionMonthlyRates");
                    List<UsageDetail> options = osOption.getOsOptionChargeMonthlyRates();
                    for(UsageDetail option : options) {
                        if (option.getType() != null) {
                            out.println("    Type  : " + option.getType());
                        }
                        if (option.getUnit() != null) {
                            out.println("    Unit  : " + option.getUnit());
                        }
                        if (option.getValue() != null) {
                            out.println("    Value : " + option.getValue());
                        }
                    }
                }
            }
            if (result.getExtraCharge() != null) {
                out.println("ExtraCharge");
                UsageExtraCharge extraCharge = result.getExtraCharge();
                if (extraCharge.getExtraChargeMonthlyRates() != null) {
                    out.println("  ExtraChargeMonthlyRate");
                    List<UsageDetail> extraChargeMonthlyRates = extraCharge.getExtraChargeMonthlyRates();
                    for(UsageDetail extraChargeMonthlyRate : extraChargeMonthlyRates) {
                        if (extraChargeMonthlyRate.getType() != null) {
                            out.println("    Type  : " + extraChargeMonthlyRate.getType());
                        }
                        if (extraChargeMonthlyRate.getUnit() != null) {
                            out.println("    Unit  : " + extraChargeMonthlyRate.getUnit());
                        }
                        if (extraChargeMonthlyRate.getValue() != null) {
                            out.println("    Value : " + extraChargeMonthlyRate.getValue());
                        }
                    }
            	}
            }

            out.println("=============================================================================");
        } catch(NiftyClientException ex) {
            err.println("Message: " + ex.getMessage());
        }
    }
}
