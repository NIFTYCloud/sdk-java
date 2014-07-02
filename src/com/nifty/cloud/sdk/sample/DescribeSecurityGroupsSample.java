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

import com.nifty.cloud.sdk.ClientConfiguration;
import com.nifty.cloud.sdk.NiftyClientException;
import com.nifty.cloud.sdk.auth.BasicCredentials;
import com.nifty.cloud.sdk.auth.Credentials;
import com.nifty.cloud.sdk.firewall.NiftySecurityGroupClient;
import com.nifty.cloud.sdk.firewall.model.DescribeSecurityGroupsRequest;
import com.nifty.cloud.sdk.firewall.model.DescribeSecurityGroupsResult;
import com.nifty.cloud.sdk.firewall.model.Filter;
import com.nifty.cloud.sdk.firewall.model.IpPermission;
import com.nifty.cloud.sdk.firewall.model.IpRange;
import com.nifty.cloud.sdk.firewall.model.SecurityGroup;
import com.nifty.cloud.sdk.firewall.model.UserIdGroupPair;

/**
 * DescribeSecurityGroupsサンプル
 *
 */
public class DescribeSecurityGroupsSample {

    /**
     * DescribeSecurityGroupsを実行するサンプルです。
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
         * 認証情報とクライアント設定情報からファイアウォールカテゴリ クライアントを生成します。
         * 非同期実行を行う場合はNiftySecurityGroupAsyncClientクラスを指定します。
         ***********************************************************************/
        NiftySecurityGroupClient client = new NiftySecurityGroupClient(credential, config);

        /************************************************************************
         * 接続先URLを変更する場合は接続先を指定します。
         ***********************************************************************/
        // client.setEndpoint("endpoint_url");

        /************************************************************************
         * リクエストパラメーターを設定し、DescribeSecurityGroupsを実行します。
         ***********************************************************************/
        DescribeSecurityGroupsRequest request = new DescribeSecurityGroupsRequest();
        // List<String> groupNames = new ArrayList<String>();
        // groupNames.add("groupName");
        // request.setGroupNames(groupNames);
        // List<Filter> filters = new ArrayList<Filter>();
        // Filter filter = new Filter();
        // filter.setName("group-name");
        // String[] values = {"groupName"};
        // filter.withValues(values);
        // filters.add(filter);
        // request.setFilters(filters);

        invokeDescribeSecurityGroups(client, request);
    }

    /**
     * DescribeSecurityGroups 実行サンプル
     * 設定されたリクエストから DescribeSecurityGroupsを実行し、実行結果を表示します。
     *
     * @param client   クライアント
     * @param request  リクエスト
     */
    public static void invokeDescribeSecurityGroups(
            NiftySecurityGroupClient client,
            DescribeSecurityGroupsRequest request) {
        try {
            DescribeSecurityGroupsResult result = client.describeSecurityGroups(request);

            out.println("DescribeSecurityGroups Action Response");
            out.println("=============================================================================");

            if (result.getSecurityGroups() != null) {
                List<SecurityGroup> securityGroups = result.getSecurityGroups();
                for (SecurityGroup securityGroup : securityGroups) {
                    out.println("SecurityGroupInfo");
                    if (securityGroup.getOwnerId() != null) {
                        out.println("  OwnerId           : " + securityGroup.getOwnerId());
                    }
                    if (securityGroup.getGroupName() != null) {
                        out.println("  GroupName         : " + securityGroup.getGroupName());
                    }
                    if (securityGroup.getGroupDescription() != null) {
                        out.println("  GroupDescription  : " + securityGroup.getGroupDescription());
                    }
                    if (securityGroup.getGroupStatus() != null) {
                    	out.println("  GroupStatus       : " + securityGroup.getGroupStatus());
                    }
                    if (securityGroup.getIpPermissions() != null) {
                        List<IpPermission> ipPermissions = securityGroup.getIpPermissions();
                        for (IpPermission ipPermission : ipPermissions) {
                            out.println("  IpPermissions");
                            if (ipPermission.getIpProtocol() != null) {
                                out.println("    IpProtocol        : " + ipPermission.getIpProtocol());
                            }
                            if (ipPermission.getFromPort() != null) {
                                out.println("    FromPort          : " + ipPermission.getFromPort());
                            }
                            if (ipPermission.getToPort() != null) {
                                out.println("    ToPort            : " + ipPermission.getToPort());
                            }
                            if (ipPermission.getInOut() != null) {
                                out.println("    InOut             : " + ipPermission.getInOut());
                            }
                            if (ipPermission.getGroups() != null) {
                                List<UserIdGroupPair> groups = ipPermission.getGroups();
                                for (UserIdGroupPair group : groups) {
                                    out.println("    Groups");
                                    if (group.getUserId() != null) {
                                        out.println("      UserId            : " + group.getUserId());
                                    }
                                    if (group.getGroupName() != null) {
                                        out.println("      GroupName         : " + group.getGroupName());
                                    }
                                }
                            }
                            if (ipPermission.getIpRanges() != null) {
                                List<IpRange> ipRanges = ipPermission.getIpRanges();
                                for (IpRange ipRange : ipRanges) {
                                    out.println("    IpRanges");
                                    if (ipRange.getCidrIp() != null) {
                                        out.println("      CidrIp            : " + ipRange.getCidrIp());
                                    }
                                }
                            }
                        }
                    }
                    if (securityGroup.getInstanceIds() != null) {
                        List<String> instanceIds = securityGroup.getInstanceIds();
                        out.println("  instancesSet");
                        for(String instanceId : instanceIds) {
                            if (instanceId != null) {
                                out.println("    InstanceId          : " + instanceId);
                            }
                        }
                    }
                    if (securityGroup.getGroupRuleLimit() != null) {
                    	out.println("  GroupRuleLimit    : " + securityGroup.getGroupRuleLimit());
                    }
                    if (securityGroup.getGroupLogLimit() != null) {
                    	out.println("  GroupLogLimit     : " + securityGroup.getGroupLogLimit());
                    }
                    if (securityGroup.getAvailabilityZone() != null) {
                    	out.println("  AvailabilityZone  : " + securityGroup.getAvailabilityZone());
                    }
                }
            }

            out.println("=============================================================================");
        } catch (NiftyClientException ex) {
            err.println("Message: " + ex.getMessage());
        }
    }

}
