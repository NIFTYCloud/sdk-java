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

import java.util.ArrayList;
import java.util.List;

import com.nifty.cloud.sdk.ClientConfiguration;
import com.nifty.cloud.sdk.NiftyClientException;
import com.nifty.cloud.sdk.Protocol;
import com.nifty.cloud.sdk.auth.BasicCredentials;
import com.nifty.cloud.sdk.auth.Credentials;
import com.nifty.cloud.sdk.auth.SignatureUtils.SignatureMethod;
import com.nifty.cloud.sdk.auth.SignatureUtils.SignatureVersion;
import com.nifty.cloud.sdk.loadbalancer.NiftyLoadBalancerClient;
import com.nifty.cloud.sdk.loadbalancer.model.AppCookieStickinessPolicy;
import com.nifty.cloud.sdk.loadbalancer.model.DescribeLoadBalancersRequest;
import com.nifty.cloud.sdk.loadbalancer.model.DescribeLoadBalancersResult;
import com.nifty.cloud.sdk.loadbalancer.model.Filter;
import com.nifty.cloud.sdk.loadbalancer.model.HealthCheck;
import com.nifty.cloud.sdk.loadbalancer.model.Instance;
import com.nifty.cloud.sdk.loadbalancer.model.LBCookiesStickinessPolicy;
import com.nifty.cloud.sdk.loadbalancer.model.Listener;
import com.nifty.cloud.sdk.loadbalancer.model.ListenerDescription;
import com.nifty.cloud.sdk.loadbalancer.model.LoadBalancer;
import com.nifty.cloud.sdk.loadbalancer.model.LoadBalancerDescription;
import com.nifty.cloud.sdk.loadbalancer.model.LoadBalancerOption;
import com.nifty.cloud.sdk.loadbalancer.model.MobileFilterOption;
import com.nifty.cloud.sdk.loadbalancer.model.Policies;
import com.nifty.cloud.sdk.loadbalancer.model.SessionStickinessPolicyOption;
import com.nifty.cloud.sdk.loadbalancer.model.SorryPageOption;

import static java.lang.System.out;
import static java.lang.System.err;

/**
 * DescribeLoadBalancersサンプル
 *
 */
public class DescribeLoadBalancersSample {

    /**
     * DescribeLoadBalancersを実行するサンプルです。
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
         * 認証情報とクライアント設定情報からロードバランサカテゴリ クライアントを生成します。
         * 非同期実行を行う場合はNiftyLoadBalancerAsyncClientクラスを指定します。
         ***********************************************************************/
        NiftyLoadBalancerClient client = new NiftyLoadBalancerClient(credential, config);

        /************************************************************************
         * 接続先URLを変更する場合は接続先を指定します。
         ***********************************************************************/
        // client.setEndpoint("endpoint_url");

        /************************************************************************
         * リクエストパラメーターを設定し、DescribeLoadBalancersを実行します。
         ***********************************************************************/
        DescribeLoadBalancersRequest request = new DescribeLoadBalancersRequest();
        // List<LoadBalancer> loadBalancers = new ArrayList<LoadBalancer>();
        // LoadBalancer loadBalancer = new LoadBalancer();
        // loadBalancer.setLoadBalancerName("loadBalancerName");
        // loadBalancer.setLoadBalancerPort(0);
        // loadBalancer.setInstancePort(0);
        // loadBalancers.add(loadBalancer);
        // request.setLoadBalancers(loadBalancers);
        invokeDescribeLoadBalancers(client, request);

    }

    /**
     * DescribeLoadBalancers 実行サンプル
     * 設定されたリクエストから DescribeLoadBalancers　を実行し、実行結果を表示します。
     *
     * @param client   クライアント
     * @param request  リクエスト
     */
    public static void invokeDescribeLoadBalancers(NiftyLoadBalancerClient client,
            DescribeLoadBalancersRequest request) {
        try {
            DescribeLoadBalancersResult result = client.describeLoadBalancers(request);

            out.println("DescribeLoadBalancers Action Response");
            out.println("=============================================================================");

            if (result.getLoadBalancerDescriptions() != null) {
                List<LoadBalancerDescription> loadBalancerDescriptions = result.getLoadBalancerDescriptions();
                for (LoadBalancerDescription loadBalancerDescription : loadBalancerDescriptions) {
                    out.println("LoadBalancerDescription");
                    if (loadBalancerDescription.getLoadBalancerName() != null) {
                        out.println("  LoadBalancerName           : " + loadBalancerDescription.getLoadBalancerName());
                    }
                    if (loadBalancerDescription.getDNSName() != null) {
                        out.println("  DNSName                    : " + loadBalancerDescription.getDNSName());
                    }
                    if (loadBalancerDescription.getNetworkVolume() != null) {
                        out.println("  NetworkVolume              : " + loadBalancerDescription.getNetworkVolume());
                    }
                    if (loadBalancerDescription.getListenerDescriptions() != null) {
                        List<ListenerDescription> listenerDescriptions = loadBalancerDescription.getListenerDescriptions();
                        for (ListenerDescription listenerDescription : listenerDescriptions) {
                            out.println("  ListenerDescriptions");
                            if (listenerDescription.getListener() != null) {
                                Listener listener = listenerDescription.getListener();
                                if (listener.getProtocol() != null) {
                                    out.println("    Protocol                 : " + listener.getProtocol());
                                }
                                if (listener.getLoadBalancerPort() != null) {
                                    out.println("    LoadBalancerPort         : " + listener.getLoadBalancerPort());
                                }
                                if (listener.getInstancePort() != null) {
                                    out.println("    InstancePort             : " + listener.getInstancePort());
                                }
                                if (listener.getBalancingType() != null) {
                                    out.println("    BalancingType            : " + listener.getBalancingType());
                                }
                                if (listener.getSslCertificateId() != null) {
                                	out.println("    SSLCertificateId         : " + listener.getSslCertificateId());
                                }
                            }

                            if (listenerDescription.getPolicyNames() != null) {
                                List<String> policyNames = listenerDescription.getPolicyNames();
                                for (String policyName : policyNames) {
                                    out.println("    PolicyName             : " + policyName);
                                }
                            }
                        }
                    }
                    if (loadBalancerDescription.getPolicies() != null) {
                        Policies policies = loadBalancerDescription.getPolicies();
                        out.println("  Policies");
                        if (policies.getAppCookieStickinessPolicies() != null) {
                            List<AppCookieStickinessPolicy> appCookieStickinessPolicies = policies.getAppCookieStickinessPolicies();
                            for (AppCookieStickinessPolicy appCookieStickinessPolicy : appCookieStickinessPolicies) {
                                out.println("    AppCookieStickinessPolicies");
                                if (appCookieStickinessPolicy.getPolicyName() != null) {
                                    out.println("      PolicyName             : " + appCookieStickinessPolicy.getPolicyName());
                                }
                                if (appCookieStickinessPolicy.getCookieName() != null) {
                                    out.println("      CookieName             : " + appCookieStickinessPolicy.getCookieName());
                                }
                            }
                        }

                        if (policies.getLBCookiesStickinessPolicies() != null) {
                            List<LBCookiesStickinessPolicy> lbCookiesStickinessPolicies = policies.getLBCookiesStickinessPolicies();
                            for(LBCookiesStickinessPolicy lbCookiesStickinessPolicy:lbCookiesStickinessPolicies){
                                out.println("    LBCookiesStickinessPolicies");
                                if(lbCookiesStickinessPolicy.getPolicyName()!=null){
                                    out.println("      PolicyName             : " + lbCookiesStickinessPolicy.getPolicyName());
                                }
                                if(lbCookiesStickinessPolicy.getCookieExpirationPeriod()!=null){
                                    out.println("      CookieExpirationPeriod : " + lbCookiesStickinessPolicy.getCookieExpirationPeriod());
                                }
                            }
                        }
                    }

                    if (loadBalancerDescription.getAvailabilityZones() != null) {
                        List<String> availabilityZones = loadBalancerDescription.getAvailabilityZones();
                        for (String availabilityZone : availabilityZones) {
                            if (availabilityZone != null) {
                                out.println("  AvailabilityZone           : " + availabilityZone);
                            }
                        }
                    }

                    if (loadBalancerDescription.getInstances() != null) {
                        List<Instance> instances = loadBalancerDescription.getInstances();
                        for (Instance instance : instances) {
                            out.println("  Instances");
                            if (instance.getInstanceId() != null) {
                                out.println("    InstanceId               : " + instance.getInstanceId());
                            }
                        }
                    }
                    if (loadBalancerDescription.getHealthCheck() != null) {
                        HealthCheck healthCheck = loadBalancerDescription.getHealthCheck();
                        if(healthCheck !=null){
                            out.println("  HelthCheck");
                            if (healthCheck.getTarget() != null) {
                                out.println("    Target                   : " + healthCheck.getTarget());
                            }
                            if (healthCheck.getInterval() != null) {
                                out.println("    Interval                 : " + healthCheck.getInterval());
                            }
                            if (healthCheck.getTimeout() != null) {
                                out.println("    Timeout                  : " + healthCheck.getTimeout());
                            }
                            if (healthCheck.getUnhealthyThreshold() != null) {
                                out.println("    UnhealthyThreshold       : " + healthCheck.getUnhealthyThreshold());
                            }
                            if (healthCheck.getHealthyThreshold() != null) {
                                out.println("    HealthyThreshold         : " + healthCheck.getHealthyThreshold());
                            }
                        }
                    }
                    if (loadBalancerDescription.getFilter() != null) {
                        Filter filter = loadBalancerDescription.getFilter();
                        if(filter !=null){
                            out.println("  Filter");
                            if (filter.getFilterType() != null) {
                                out.println("    FilterType               : " + filter.getFilterType());
                            }
                            if (filter.getIpAddresses() != null) {
                                out.println("    IpAddresses              : " + filter.getIpAddresses());
                            }
                        }
                    }
                    if (loadBalancerDescription.getCreatedTime() != null) {
                        out.println("  CreatedTime                : " + loadBalancerDescription.getCreatedTime());
                    }
                    if (loadBalancerDescription.getAccountingType() != null) {
                    	out.println("  AccountingType             : " + loadBalancerDescription.getAccountingType());
                    }
                    if (loadBalancerDescription.getNextMonthAccountingType() != null) {
                    	out.println("  NextMonthAccountingType    : " + loadBalancerDescription.getNextMonthAccountingType());
                    }
                    if (loadBalancerDescription.getOption() != null) {
                    	LoadBalancerOption option = loadBalancerDescription.getOption();
                    	out.println("  Option");
                    	if(option.getSessionStickinessPolicy() != null) {
                    		SessionStickinessPolicyOption sessionSticknessPolicy = option.getSessionStickinessPolicy();
                    		out.println("    SessionStickinessPolicy");
                    		if(sessionSticknessPolicy.getEnabled() != null) {
                    			out.println("      Enabled          :" + sessionSticknessPolicy.getEnabled());
                    		}
                    		if(sessionSticknessPolicy.getExpirationPeriod() != null) {
                    			out.println("      ExpirationPeriod :" + sessionSticknessPolicy.getExpirationPeriod());
                    		}
                    	}
                    	if(option.getSorryPage() != null) {
                    		SorryPageOption sorryPage = option.getSorryPage();
                    		out.println("    SorryPage");
                    		if(sorryPage.getEnabled() != null){
                    			out.println("      Enabled    :" + sorryPage.getEnabled());
                    		}
                    		if(sorryPage.getStatusCode() != null) {
                    			out.println("      StatusCode :" + sorryPage.getStatusCode());
                    		}
                    	}
                    	if(option.getMobileFilter() != null){
                    		MobileFilterOption mobileFilter = option.getMobileFilter();
                    		out.println("    MobileFilter");
                    		if(mobileFilter.getEnabled() != null) {
                    			out.println("      Enabled :" + mobileFilter.getEnabled());
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
