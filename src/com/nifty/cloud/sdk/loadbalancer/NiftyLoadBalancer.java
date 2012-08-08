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
 *  API Version: 1.9
 *  Date: 2011-11-29 14:07:10
 * 
 */
package com.nifty.cloud.sdk.loadbalancer;

import com.nifty.cloud.sdk.loadbalancer.model.ClearLoadBalancerSessionRequest;
import com.nifty.cloud.sdk.loadbalancer.model.ClearLoadBalancerSessionResult;
import com.nifty.cloud.sdk.loadbalancer.model.ConfigureHealthCheckRequest;
import com.nifty.cloud.sdk.loadbalancer.model.ConfigureHealthCheckResult;
import com.nifty.cloud.sdk.loadbalancer.model.CreateLoadBalancerRequest;
import com.nifty.cloud.sdk.loadbalancer.model.CreateLoadBalancerResult;
import com.nifty.cloud.sdk.loadbalancer.model.DeleteLoadBalancerRequest;
import com.nifty.cloud.sdk.loadbalancer.model.DeleteLoadBalancerResult;
import com.nifty.cloud.sdk.loadbalancer.model.DeregisterInstancesFromLoadBalancerRequest;
import com.nifty.cloud.sdk.loadbalancer.model.DeregisterInstancesFromLoadBalancerResult;
import com.nifty.cloud.sdk.loadbalancer.model.DescribeInstanceHealthRequest;
import com.nifty.cloud.sdk.loadbalancer.model.DescribeInstanceHealthResult;
import com.nifty.cloud.sdk.loadbalancer.model.DescribeLoadBalancersRequest;
import com.nifty.cloud.sdk.loadbalancer.model.DescribeLoadBalancersResult;
import com.nifty.cloud.sdk.loadbalancer.model.RegisterInstancesWithLoadBalancerRequest;
import com.nifty.cloud.sdk.loadbalancer.model.RegisterInstancesWithLoadBalancerResult;
import com.nifty.cloud.sdk.loadbalancer.model.RegisterPortWithLoadBalancerRequest;
import com.nifty.cloud.sdk.loadbalancer.model.RegisterPortWithLoadBalancerResult;
import com.nifty.cloud.sdk.loadbalancer.model.SetFilterForLoadBalancerRequest;
import com.nifty.cloud.sdk.loadbalancer.model.SetFilterForLoadBalancerResult;
import com.nifty.cloud.sdk.loadbalancer.model.SetLoadBalancerListenerSSLCertificateRequest;
import com.nifty.cloud.sdk.loadbalancer.model.SetLoadBalancerListenerSSLCertificateResult;
import com.nifty.cloud.sdk.loadbalancer.model.UnsetLoadBalancerListenerSSLCertificateRequest;
import com.nifty.cloud.sdk.loadbalancer.model.UnsetLoadBalancerListenerSSLCertificateResult;
import com.nifty.cloud.sdk.loadbalancer.model.UpdateLoadBalancerOptionRequest;
import com.nifty.cloud.sdk.loadbalancer.model.UpdateLoadBalancerOptionResult;
import com.nifty.cloud.sdk.loadbalancer.model.UpdateLoadBalancerRequest;
import com.nifty.cloud.sdk.loadbalancer.model.UpdateLoadBalancerResult;

/**
 * NIFTY Cloud API クライアント　インタフェース。
 * ネットワークカテゴリ クライアント。<br />
 * ネットワークカテゴリの同期クライアントのインタフェースです。<br />
 * 戻り値の"利用不可"パラメータは返却値がnullまたは空となります。
 */
public interface NiftyLoadBalancer {

	/**
	 * エンドポイントの設定を行います。
	 *
	 * @param endpoint エンドポイント
	 */
	public void setEndpoint(String endpoint);

	/**
	 * 指定したロードバランサーのヘルスチェックの設定を変更します。
	 *
	 * @param request ConfigureHealthCheckリクエスト<br />
	 * &nbsp;	HealthCheck#timeoutは利用不可<br/ >
	 * @return ConfigureHealthCheck処理結果
	 */
	public ConfigureHealthCheckResult configureHealthCheck(ConfigureHealthCheckRequest request);

	/**
	 * ロードバランサーの定義を作成します。
	 *
	 * @param request CreateLoadBalancerリクエスト<br />
	 * &nbsp;	CreateLoadBalancerRequest#availabilityZonesは利用不可
	 * @return CreateLoadBalancer処理結果
	 */
	public CreateLoadBalancerResult createLoadBalancer(CreateLoadBalancerRequest request);

	/**
	 * 指定したロードバランサーの定義を削除します。
	 *
	 * @param request DeleteLoadBalancerリクエスト
	 * @return DeleteLoadBalancer処理結果
	 */
	public DeleteLoadBalancerResult deleteLoadBalancer(DeleteLoadBalancerRequest request);


	/**
	 * 指定したロードバランサーから指定したサーバーを解除します。
	 *
	 * @param request DeregisterInstancesFromLoadBalancerリクエスト
	 * @return DeregisterInstancesFromLoadBalancer処理結果
	 */
	public DeregisterInstancesFromLoadBalancerResult deregisterInstancesFromLoadBalancer(DeregisterInstancesFromLoadBalancerRequest request);

	/**
	 * 指定したロードバランサーに設定されているサーバーのヘルスチェック結果を取得します。
	 *
	 * @param request DescribeInstanceHealthリクエスト
	 * @return DescribeInstanceHealth処理結果<br />
	 * &nbsp;	InstanceState#reasonCodeは利用不可<br />
	 * &nbsp;	InstanceState#descriptionは利用不可
	 */
	public DescribeInstanceHealthResult describeInstanceHealth(DescribeInstanceHealthRequest request);

	/**
	 * 指定したロードバランサーの情報を取得します。
	 *
	 * @param request DescribeLoadBalancersリクエスト
	 * @return DescribeLoadBalancers処理結果<br />
	 * &nbsp;	ListenerDescription#policyNamesは利用不可<br />
	 * &nbsp;	LoadBalancerDescription#policiesは利用不可
	 */
	public DescribeLoadBalancersResult describeLoadBalancers(DescribeLoadBalancersRequest request);


	/**
	 * 指定したロードバランサーにサーバーを追加します。
	 *
	 * @param request RegisterInstancesWithLoadBalancerリクエスト
	 * @return RegisterInstancesWithLoadBalancer処理結果
	 */
	public RegisterInstancesWithLoadBalancerResult registerInstancesWithLoadBalancer(RegisterInstancesWithLoadBalancerRequest request);

	/**
	 * 指定したロードバランサーへポートを追加します。
	 *
	 * @param request RegisterPortWithLoadBalancerリクエスト
	 * @return RegisterPortWithLoadBalancer処理結果
	 */
	public RegisterPortWithLoadBalancerResult registerPortWithLoadBalancer(RegisterPortWithLoadBalancerRequest request);


	/**
	 * 指定したロードバランサーのフィルター設定を変更します。
	 *
	 * @param request SetFilterForLoadBalancerリクエスト
	 * @return SetFilterForLoadBalancer処理結果
	 */
	public SetFilterForLoadBalancerResult setFilterForLoadBalancer(SetFilterForLoadBalancerRequest request);

	/**
	 * ロードバランサーの定義の更新します。
	 *
	 * @param request UpdateLoadBalancerリクエスト
	 * @return UpdateLoadBalancer処理結果
	 */
	public UpdateLoadBalancerResult updateLoadBalancer(UpdateLoadBalancerRequest request);

	/**
	 * ロードバランサーのオプションを設定します。
	 * @param request UpdateLoadBalancerOptionリクエスト
	 * @return UpdateLoadBalancerOption処理結果
	 */
	public UpdateLoadBalancerOptionResult updateLoadBalancerOption(UpdateLoadBalancerOptionRequest request);

	/**
	 * ロードバランサーへSSL証明書を取り付けます。
	 * @param request SetLoadBalancerListenerSSLCertificateリクエスト
	 * @return SetLoadBalancerListenerSSLCertificate処理結果
	 */
	public SetLoadBalancerListenerSSLCertificateResult setLoadBalancerListenerSSLCertificate(SetLoadBalancerListenerSSLCertificateRequest request);

	/**
	 * ロードバランサーに設定されているSSL証明書を外します。
	 * @param request UnsetLoadBalancerListenerSSLCertificateリクエスト
	 * @return UnsetLoadBalancerListenerSSLCertificate処理結果
	 */
	public UnsetLoadBalancerListenerSSLCertificateResult unsetLoadBalancerListenerSSLCertificate(UnsetLoadBalancerListenerSSLCertificateRequest request);

	/**
	 * ロードバランサーがセッション固定オプションを申し込んでいる場合、手動でセッションをクリアします。
	 * @param request ClearLoadBalancerSessionリクエスト
	 * @return ClearLoadBalancerSession処理結果
	 */
	public ClearLoadBalancerSessionResult clearLoadBalancerSession(ClearLoadBalancerSessionRequest request);
}
