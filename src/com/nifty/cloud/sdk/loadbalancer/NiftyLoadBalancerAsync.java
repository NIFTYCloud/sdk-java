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
package com.nifty.cloud.sdk.loadbalancer;

import java.util.concurrent.Future;

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
 * NIFTY Cloud API 非同期クライアント　インタフェース。
 * ネットワークカテゴリクライアント。<br />
 * ネットワークカテゴリの非同期クライアントのインタフェースです。<br />
 * 戻り値の"利用不可"パラメータは返却値がnullまたは空となります。
 */
public interface NiftyLoadBalancerAsync extends NiftyLoadBalancer {

	/**
	 * 非同期で指定したロードバランサーのヘルスチェックの設定を変更します。
	 *
	 * @param request ConfigureHealthCheckリクエスト<br />
	 * &nbsp;	HealthCheck#timeoutは利用不可<br/ >
	 * @return 非同期処理結果
	 */
	public Future<ConfigureHealthCheckResult> configureHealthCheckAsync(ConfigureHealthCheckRequest request);

	/**
	 * 非同期でロードバランサーの定義を作成します。
	 *
	 * @param request CreateLoadBalancerリクエスト<br />
	 * @return 非同期処理結果
	 */
	public Future<CreateLoadBalancerResult> createLoadBalancerAsync(CreateLoadBalancerRequest request);

	/**
	 * 非同期で指定したロードバランサーの定義を削除します。
	 *
	 * @param request DeleteLoadBalancerリクエスト
	 * @return 非同期処理結果
	 */
	public Future<DeleteLoadBalancerResult> deleteLoadBalancerAsync(DeleteLoadBalancerRequest request);

	/**
	 * 非同期で指定したロードバランサーから指定したサーバーを解除します。
	 *
	 * @param request DeregisterInstancesFromLoadBalancerリクエスト
	 * @return 非同期処理結果
	 */
	public Future<DeregisterInstancesFromLoadBalancerResult> deregisterInstancesFromLoadBalancerAsync(DeregisterInstancesFromLoadBalancerRequest request);

	/**
	 * 非同期で指定したロードバランサーに設定されているサーバーのヘルスチェック結果を取得します。
	 *
	 * @param request DescribeInstanceHealthリクエスト
	 * @return 非同期処理結果<br />
	 * &nbsp;	InstanceState#reasonCodeは利用不可<br />
	 * &nbsp;	InstanceState#descriptionは利用不可
	 */
	public Future<DescribeInstanceHealthResult> describeInstanceHealthAsync(DescribeInstanceHealthRequest request);

	/**
	 * 非同期で指定したロードバランサーの情報を取得します。
	 *
	 * @param request DescribeLoadBalancersリクエスト
	 * @return 非同期処理結果<br />
	 * &nbsp;	ListenerDescription#policyNamesは利用不可<br />
	 * &nbsp;	LoadBalancerDescription#policiesは利用不可
	 */
	public Future<DescribeLoadBalancersResult> describeLoadBalancersAsync(DescribeLoadBalancersRequest request);

	/**
	 * 非同期で指定したロードバランサーにサーバーを追加します。
	 *
	 * @param request RegisterInstancesWithLoadBalancerリクエスト
	 * @return 非同期処理結果
	 */
	public Future<RegisterInstancesWithLoadBalancerResult> registerInstancesWithLoadBalancerAsync(RegisterInstancesWithLoadBalancerRequest request);

	/**
	 * 非同期で指定したロードバランサーへポートを追加します。
	 *
	 * @param request RegisterPortWithLoadBalancerリクエスト
	 * @return 非同期処理結果
	 */
	public Future<RegisterPortWithLoadBalancerResult> registerPortWithLoadBalancerAsync(RegisterPortWithLoadBalancerRequest request);


	/**
	 * 非同期で指定したロードバランサーのフィルター設定を変更します。
	 *
	 * @param request SetFilterForLoadBalancerリクエスト
	 * @return 非同期処理結果
	 */
	public Future<SetFilterForLoadBalancerResult> setFilterForLoadBalancerAsync(SetFilterForLoadBalancerRequest request);

	/**
	 * 非同期でロードバランサーの定義の更新します。
	 *
	 * @param request UpdateLoadBalancerリクエスト
	 * @return 非同期処理結果
	 */
	public Future<UpdateLoadBalancerResult> updateLoadBalancerAsync(UpdateLoadBalancerRequest request);

	/**
	 * 非同期でロードバランサーのオプションを設定します。
	 *
	 * @param request UpdateLoadBalancerOptionリクエスト
	 * @return 非同期処理結果
	 */
	public Future<UpdateLoadBalancerOptionResult> updateLoadBalancerOptionAsync(UpdateLoadBalancerOptionRequest request);

	/**
	 * 非同期でロードバランサーへSSL証明書を取り付けます。
	 *
	 * @param request SetLoadBalancerListenerSSLCertificateリクエスト
	 * @return 非同期処理結果
	 */
	public Future<SetLoadBalancerListenerSSLCertificateResult> setLoadBalancerListenerSSLCertificateAsync(SetLoadBalancerListenerSSLCertificateRequest request);

	/**
	 * 非同期でロードバランサーに設定されているSSL証明書を外します。
	 *
	 * @param request UnsetLoadBalancerListenerSSLCertificateリクエスト
	 * @return 非同期処理結果
	 */
	public Future<UnsetLoadBalancerListenerSSLCertificateResult> unsetLoadBalancerListenerSSLCertificateAsync(UnsetLoadBalancerListenerSSLCertificateRequest request);

	/**
	 * 非同期でロードバランサーがセッション固定オプションを申し込んでいる場合、手動でセッションをクリアします。
	 *
	 * @param request ClearLoadBalancerSessionリクエスト
	 * @return 非同期処理結果
	 */
	public Future<ClearLoadBalancerSessionResult> clearLoadBalancerSessionAsync(ClearLoadBalancerSessionRequest request);
}
