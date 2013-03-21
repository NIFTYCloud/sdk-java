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
 *  Date: 2011-11-29 14:07:10
 * 
 */
package com.nifty.cloud.sdk.loadbalancer;


import com.nifty.cloud.sdk.BaseClient;
import com.nifty.cloud.sdk.ClientConfiguration;
import com.nifty.cloud.sdk.auth.Credentials;
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
 * NIFTY Cloud API クライアント　具象クラス。
 * ネットワークカテゴリ クライアント。<br />
 * ネットワークカテゴリの同期クライアントの具象クラスです。<br />
 * 戻り値の"利用不可"パラメータは返却値がnullまたは空となります。
 */
public class NiftyLoadBalancerClient extends BaseClient implements NiftyLoadBalancer {
	
	/** 
	 * 認証情報を指定し、ネットワークカテゴリクライアントを構築します。
	 * 
	 * @param credential 認証情報
	 */
	public NiftyLoadBalancerClient(Credentials credential) {
		super(credential, new ClientConfiguration());
	}

	/** 
	 * 認証情報、クライアント設定を指定し、ネットワークカテゴリクライアントを構築します。
	 * 
	 * @param credential 認証情報
	 * @param configuration クライアント設定
	 */
	public NiftyLoadBalancerClient(Credentials credential, ClientConfiguration configuration) {
		super(credential, configuration);
	}

	/**
	 * @see com.nifty.cloud.sdk.loadbalancer.NiftyLoadBalancer#createLoadBalancer(CreateLoadBalancerRequest)
	 */
	@Override
	public CreateLoadBalancerResult createLoadBalancer(CreateLoadBalancerRequest request) {
		return (CreateLoadBalancerResult) client.execute(request, CreateLoadBalancerResult.class);
	}

	/*
	 * (non-Javadoc)
	 * @see com.nifty.cloud.sdk.loadbalancer.NiftyLoadBalancer#configureHealthCheck(com.nifty.cloud.sdk.loadbalancer.model.ConfigureHealthCheckRequest)
	 */
	@Override
	public ConfigureHealthCheckResult configureHealthCheck(ConfigureHealthCheckRequest request) {
		return (ConfigureHealthCheckResult)client.execute(request, ConfigureHealthCheckResult.class);
	}
	
	/*
	 * (non-Javadoc)
	 * @see com.nifty.cloud.sdk.loadbalancer.NiftyLoadBalancer#deleteLoadBalancer(com.nifty.cloud.sdk.loadbalancer.model.DeleteLoadBalancerRequest)
	 */
	@Override
	public DeleteLoadBalancerResult deleteLoadBalancer(DeleteLoadBalancerRequest request) {
		return (DeleteLoadBalancerResult)client.execute(request, DeleteLoadBalancerResult.class);
	}

	/*
	 * (non-Javadoc)
	 * @see com.nifty.cloud.sdk.loadbalancer.NiftyLoadBalancer#deregisterInstancesFromLoadBalancer(com.nifty.cloud.sdk.loadbalancer.model.DeregisterInstanceWithLoadBalancerRequest)
	 */
	@Override
	public DeregisterInstancesFromLoadBalancerResult deregisterInstancesFromLoadBalancer(DeregisterInstancesFromLoadBalancerRequest request) {
		return (DeregisterInstancesFromLoadBalancerResult)client.execute(request, DeregisterInstancesFromLoadBalancerResult.class);
	}

	/*
	 * (non-Javadoc)
	 * @see com.nifty.cloud.sdk.loadbalancer.NiftyLoadBalancer#describeInstanceHealth(com.nifty.cloud.sdk.loadbalancer.model.DescribeInstanceHealthRequest)
	 */
	@Override
	public DescribeInstanceHealthResult describeInstanceHealth(DescribeInstanceHealthRequest request) {
		return (DescribeInstanceHealthResult)client.execute(request, DescribeInstanceHealthResult.class);
	}

	/*
	 * (non-Javadoc)
	 * @see com.nifty.cloud.sdk.loadbalancer.NiftyLoadBalancer#describeLoadBalancers(com.nifty.cloud.sdk.loadbalancer.model.DescribeLoadBalancersRequest)
	 */
	@Override
	public DescribeLoadBalancersResult describeLoadBalancers(DescribeLoadBalancersRequest request) {
		return (DescribeLoadBalancersResult)client.execute(request, DescribeLoadBalancersResult.class);
	}

	/*
	 * (non-Javadoc)
	 * @see com.nifty.cloud.sdk.loadbalancer.NiftyLoadBalancer#registerInstancesWithLoadBalancer(com.nifty.cloud.sdk.loadbalancer.model.RegisterInstancesWithLoadBalancerRequest)
	 */
	@Override
	public RegisterInstancesWithLoadBalancerResult registerInstancesWithLoadBalancer(RegisterInstancesWithLoadBalancerRequest request) {
		return (RegisterInstancesWithLoadBalancerResult)client.execute(request, RegisterInstancesWithLoadBalancerResult.class);
	}
	
	/*
	 * (non-Javadoc)
	 * @see com.nifty.cloud.sdk.loadbalancer.NiftyLoadBalancer#registerPortWithLoadBalancer(com.nifty.cloud.sdk.loadbalancer.model.RegisterPortWithLoadBalancerRequest)
	 */
	@Override
	public RegisterPortWithLoadBalancerResult registerPortWithLoadBalancer(RegisterPortWithLoadBalancerRequest request) {
		return (RegisterPortWithLoadBalancerResult)client.execute(request, RegisterPortWithLoadBalancerResult.class);
	}

	/*
	 * (non-Javadoc)
	 * @see com.nifty.cloud.sdk.loadbalancer.NiftyLoadBalancer#setFilterForLoadBalancer(com.nifty.cloud.sdk.loadbalancer.model.SetFilterForLoadBalancerResult)
	 */
	@Override
	public SetFilterForLoadBalancerResult setFilterForLoadBalancer(SetFilterForLoadBalancerRequest request) {
		return (SetFilterForLoadBalancerResult)client.execute(request, SetFilterForLoadBalancerResult.class);
	}

	/*
	 * (non-Javadoc)
	 * @see com.nifty.cloud.sdk.loadbalancer.NiftyLoadBalancer#updateLoadBalancer(com.nifty.cloud.sdk.loadbalancer.model.UpdateLoadBalancerRequest)
	 */
	@Override
	public UpdateLoadBalancerResult updateLoadBalancer(UpdateLoadBalancerRequest request) {
		return (UpdateLoadBalancerResult) client.execute(request, UpdateLoadBalancerResult.class);
	}

	/*
	 * (non-Javadoc)
	 * @see com.nifty.cloud.sdk.loadbalancer.NiftyLoadBalancer#updateLoadBalancerOption(com.nifty.cloud.sdk.loadbalancer.model.UpdateLoadBalancerOptionRequest)
	 */
	@Override
	public UpdateLoadBalancerOptionResult updateLoadBalancerOption(UpdateLoadBalancerOptionRequest request) {
		return (UpdateLoadBalancerOptionResult) client.execute(request, UpdateLoadBalancerOptionResult.class);
	}

	/*
	 * (non-Javadoc)
	 * @see com.nifty.cloud.sdk.loadbalancer.NiftyLoadBalancer#setLoadBalancerListenerSSLCertificate(com.nifty.cloud.sdk.loadbalancer.model.SetLoadBalancerListenerSSLCertificateRequest)
	 */
	@Override
	public SetLoadBalancerListenerSSLCertificateResult setLoadBalancerListenerSSLCertificate(SetLoadBalancerListenerSSLCertificateRequest request) {
		return (SetLoadBalancerListenerSSLCertificateResult) client.execute(request, SetLoadBalancerListenerSSLCertificateResult.class);
	}

	/*
	 * (non-Javadoc)
	 * @see com.nifty.cloud.sdk.loadbalancer.NiftyLoadBalancer#unsetLoadBalancerListenerSSLCertificate(com.nifty.cloud.sdk.loadbalancer.model.UnsetLoadBalancerListenerSSLCertificateRequest)
	 */
	@Override
	public UnsetLoadBalancerListenerSSLCertificateResult unsetLoadBalancerListenerSSLCertificate(UnsetLoadBalancerListenerSSLCertificateRequest request) {
		return (UnsetLoadBalancerListenerSSLCertificateResult) client.execute(request, UnsetLoadBalancerListenerSSLCertificateResult.class);
	}

	/*
	 * (non-Javadoc)
	 * @see com.nifty.cloud.sdk.loadbalancer.NiftyLoadBalancer#clearLoadBalancerSession(com.nifty.cloud.sdk.loadbalancer.model.ClearLoadBalancerSessionRequest)
	 */
	@Override
	public ClearLoadBalancerSessionResult clearLoadBalancerSession(ClearLoadBalancerSessionRequest request) {
		return (ClearLoadBalancerSessionResult) client.execute(request, ClearLoadBalancerSessionResult.class);
	}

}
