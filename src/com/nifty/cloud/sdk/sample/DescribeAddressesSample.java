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
import com.nifty.cloud.sdk.address.NiftyAddressClient;
import com.nifty.cloud.sdk.address.model.DescribeAddressesRequest;
import com.nifty.cloud.sdk.address.model.DescribeAddressesResult;
import com.nifty.cloud.sdk.address.model.Filter;
import com.nifty.cloud.sdk.address.model.Address;

import static java.lang.System.out;
import static java.lang.System.err;

/**
 * DescribeAddressesサンプル
 *
 */
public class DescribeAddressesSample {

    /**
     * DescribeAddressesを実行するサンプルです。
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
         * 認証情報とクライアント設定情報からアドレスカテゴリ クライアントを生成します。
         * 非同期実行を行う場合はNiftyAddressClientクラスを指定します。
         ***********************************************************************/
        NiftyAddressClient client = new NiftyAddressClient(credential, config);

        /************************************************************************
         * 接続先URLを変更する場合は接続先を指定します。
         ***********************************************************************/
        // client.setEndpoint("endpoint_url");

        /************************************************************************
         * リクエストパラメーターを設定し、DescribeAddressesを実行します。
         ***********************************************************************/
         DescribeAddressesRequest request = new DescribeAddressesRequest();
         // List<String> publicIps = new ArrayList<String>();
         // publicIps.add("publicIp");
         // request.setPublicIps(publicIps);
         // List<String> privateIps = new ArrayList<String>();
         // privateIps.add("privateIp");
         // request.setPrivateIpAddresses(privateIps);
         // List<String> allocationIds = new ArrayList<String>();
         // allocationIds.add("allocationId");
         // request.setAllocationIds(allocationIds);
         // List<Filter> filters = new ArrayList<Filter>();
         // Filter filter = new Filter();
         // filter.setName("name");
         // List<String> values = new ArrayList<String>();
         // values.add("value");
         // filter.setValues(values);
         // filters.add(filter);
         // request.setFilters(filters);
        invokeDescribeAddresses(client, request);
    }

    /**
     * DescribeAddresses 実行サンプル
     * 設定されたリクエストから DescribeAddresses を実行し、実行結果を表示します。
     *
     * @param client   クライアント
     * @param request  リクエスト
     */
    public static void invokeDescribeAddresses(NiftyAddressClient client,
            DescribeAddressesRequest request) {
        try {
            DescribeAddressesResult result = client.describeAddresses(request);

            out.println("DescribeAddresses Action Response");
            out.println("=============================================================================");

            if (result.getAddresses() != null) {
                List<Address> addresses = result.getAddresses();
                for (Address address: addresses){
                    out.println("Addresses");
                    if (address.getPublicIp() != null) {
                        out.println("  PublicIp                 : " + address.getPublicIp());
                    }
                    if (address.getPrivateIpAddress() != null) {
                        out.println("  PrivateIpAddress         : " + address.getPrivateIpAddress());
                    }
                    if (address.getAllocationId() != null) {
                        out.println("  AllocationId             : " + address.getAllocationId());
                    }
                    if (address.getDomain() != null) {
                        out.println("  Domain                   : " + address.getDomain());
                    }
                    if (address.getInstanceId() != null) {
                        out.println("  InstanceId               : " + address.getInstanceId());
                    }
                    if (address.getAssociationId() != null) {
                        out.println("  AssociationId            : " + address.getAssociationId());
                    }
                    if (address.getNetworkInterfaceId() != null) {
                        out.println("  NetworkInterfaceId       : " + address.getNetworkInterfaceId());
                    }
                    if (address.getNetworkInterfaceOwnerId() != null) {
                        out.println("  NetworkInterfaceOwnerId  : " + address.getNetworkInterfaceOwnerId());
                    }
                    if (address.getDescription() != null) {
                        out.println("  Description              : " + address.getDescription());
                    }
                    if (address.getAvailabilityZone() != null) {
                        out.println("  AvailabilityZone         : " + address.getAvailabilityZone());
                    }
                }
            }

            out.println("=============================================================================");
        } catch (NiftyClientException ex) {
            err.println("Message: " + ex.getMessage());
        }
    }
}
