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
package com.nifty.cloud.sdk.firewall;


import java.io.IOException;

import com.nifty.cloud.sdk.BaseClient;
import com.nifty.cloud.sdk.ClientConfiguration;
import com.nifty.cloud.sdk.auth.Credentials;
import com.nifty.cloud.sdk.firewall.model.AuthorizeSecurityGroupIngressRequest;
import com.nifty.cloud.sdk.firewall.model.AuthorizeSecurityGroupIngressResult;
import com.nifty.cloud.sdk.firewall.model.CreateSecurityGroupRequest;
import com.nifty.cloud.sdk.firewall.model.CreateSecurityGroupResult;
import com.nifty.cloud.sdk.firewall.model.DeleteSecurityGroupRequest;
import com.nifty.cloud.sdk.firewall.model.DeleteSecurityGroupResult;
import com.nifty.cloud.sdk.firewall.model.DeregisterInstancesFromSecurityGroupRequest;
import com.nifty.cloud.sdk.firewall.model.DeregisterInstancesFromSecurityGroupResult;
import com.nifty.cloud.sdk.firewall.model.DescribeSecurityActivitiesRequest;
import com.nifty.cloud.sdk.firewall.model.DescribeSecurityActivitiesResult;
import com.nifty.cloud.sdk.firewall.model.DescribeSecurityGroupOptionRequest;
import com.nifty.cloud.sdk.firewall.model.DescribeSecurityGroupOptionResult;
import com.nifty.cloud.sdk.firewall.model.DescribeSecurityGroupsRequest;
import com.nifty.cloud.sdk.firewall.model.DescribeSecurityGroupsResult;
import com.nifty.cloud.sdk.firewall.model.RegisterInstancesWithSecurityGroupRequest;
import com.nifty.cloud.sdk.firewall.model.RegisterInstancesWithSecurityGroupResult;
import com.nifty.cloud.sdk.firewall.model.RevokeSecurityGroupIngressRequest;
import com.nifty.cloud.sdk.firewall.model.RevokeSecurityGroupIngressResult;
import com.nifty.cloud.sdk.firewall.model.UpdateSecurityGroupOptionRequest;
import com.nifty.cloud.sdk.firewall.model.UpdateSecurityGroupOptionResult;
import com.nifty.cloud.sdk.firewall.model.UpdateSecurityGroupRequest;
import com.nifty.cloud.sdk.firewall.model.UpdateSecurityGroupResult;

/**
 * NIFTY Cloud API クライアント　具象クラス。
 * ファイアウォールカテゴリ クライアント。<br />
 * ファイアウォールカテゴリの同期クライアントの具象クラスです。<br />
 * 戻り値の"利用不可"パラメータは返却値がnullまたは空となります。
 *
 */
public class NiftySecurityGroupClient extends BaseClient implements NiftySecurityGroup {

	/**
	 * 認証情報を指定し、ファイアウォールカテゴリクライアントを構築します。
	 *
	 * @param credential 認証情報
	 */
	public NiftySecurityGroupClient(Credentials credential) {
		super(credential, new ClientConfiguration());
	}

	/**
	 * 認証情報、クライアント設定を指定し、ファイアウォールカテゴリクライアントを構築します。
	 *
	 * @param credential 認証情報
	 * @param configuration クライアント設定
	 */
	public NiftySecurityGroupClient(Credentials credential, ClientConfiguration configuration) {
		super(credential, configuration);
	}

	/*
	 * (non-Javadoc)
	 * @see com.nifty.cloud.sdk.firewall.NiftySecurityGroup#createSecurityGroup(com.nifty.cloud.sdk.firewall.model.CreateSecurityGroupRequest)
	 */
	@Override
	public CreateSecurityGroupResult createSecurityGroup(CreateSecurityGroupRequest request) {
		return (CreateSecurityGroupResult) client.execute(request, CreateSecurityGroupResult.class);
	}

	/*
	 * (non-Javadoc)
	 * @see com.nifty.cloud.sdk.firewall.NiftySecurityGroup#deleteSecurityGroup(com.nifty.cloud.sdk.firewall.model.DeleteSecurityGroupRequest)
	 */
	@Override
	public DeleteSecurityGroupResult deleteSecurityGroup(DeleteSecurityGroupRequest request) {
		return (DeleteSecurityGroupResult) client.execute(request, DeleteSecurityGroupResult.class);
	}

	/*
	 * (non-Javadoc)
	 * @see com.nifty.cloud.sdk.firewall.NiftySecurityGroup#updateSecurityGroup(com.nifty.cloud.sdk.firewall.model.UpdateSecurityGroupRequest)
	 */
	@Override
	public UpdateSecurityGroupResult updateSecurityGroup(UpdateSecurityGroupRequest request) {
		return (UpdateSecurityGroupResult) client.execute(request, UpdateSecurityGroupResult.class);
	}

	/*
	 * (non-Javadoc)
	 * @see com.nifty.cloud.sdk.firewall.NiftySecurityGroup#describeSecurityGroups(com.nifty.cloud.sdk.firewall.model.DescribeSecurityGroupsRequest)
	 */
	@Override
	public DescribeSecurityGroupsResult describeSecurityGroups(DescribeSecurityGroupsRequest request) {
		return (DescribeSecurityGroupsResult) client.execute(request, DescribeSecurityGroupsResult.class);
	}

	/*
	 * (non-Javadoc)
	 * @see com.nifty.cloud.sdk.firewall.NiftySecurityGroup#authorizeSecurityGroupIngress(com.nifty.cloud.sdk.firewall.model.AuthorizeSecurityGroupIngressRequest)
	 */
	@Override
	public AuthorizeSecurityGroupIngressResult authorizeSecurityGroupIngress(AuthorizeSecurityGroupIngressRequest request) {
		return (AuthorizeSecurityGroupIngressResult) client.execute(request, AuthorizeSecurityGroupIngressResult.class);
	}

	/*
	 * (non-Javadoc)
	 * @see com.nifty.cloud.sdk.firewall.NiftySecurityGroup#revokeSecurityGroupIngress(com.nifty.cloud.sdk.firewall.model.RevokeSecurityGroupIngressRequest)
	 */
	@Override
	public RevokeSecurityGroupIngressResult revokeSecurityGroupIngress(RevokeSecurityGroupIngressRequest request) {
		return (RevokeSecurityGroupIngressResult) client.execute(request, RevokeSecurityGroupIngressResult.class);
	}

	/*
	 * (non-Javadoc)
	 * @see com.nifty.cloud.sdk.firewall.NiftySecurityGroup#registerInstancesWithSecurityGroup(com.nifty.cloud.sdk.firewall.model.RegisterInstancesWithSecurityGroupRequest)
	 */
	@Override
	public RegisterInstancesWithSecurityGroupResult registerInstancesWithSecurityGroup(RegisterInstancesWithSecurityGroupRequest request) {
		return (RegisterInstancesWithSecurityGroupResult) client.execute(request, RegisterInstancesWithSecurityGroupResult.class);
	}

	/*
	 * (non-Javadoc)
	 * @see com.nifty.cloud.sdk.firewall.NiftySecurityGroup#deregisterInstancesFromSecurityGroup(com.nifty.cloud.sdk.firewall.model.DeregisterInstancesFromSecurityGroupRequest)
	 */
	@Override
	public DeregisterInstancesFromSecurityGroupResult deregisterInstancesFromSecurityGroup(DeregisterInstancesFromSecurityGroupRequest request) {
		return (DeregisterInstancesFromSecurityGroupResult) client.execute(request, DeregisterInstancesFromSecurityGroupResult.class);
	}

	/*
	 * (non-Javadoc)
	 * @see com.nifty.cloud.sdk.firewall.NiftySecurityGroup#describeSecurityActivities(com.nifty.cloud.sdk.firewall.model.DescribeSecurityActivitiesRequest)
	 */
	@Override
	public DescribeSecurityActivitiesResult describeSecurityActivities(DescribeSecurityActivitiesRequest request) {
		return (DescribeSecurityActivitiesResult) client.execute(request, DescribeSecurityActivitiesResult.class);
	}

	/*
	 * (non-Javadoc)
	 * @see com.nifty.cloud.sdk.firewall.NiftySecurityGroup#updateSecurityGroupOption(com.nifty.cloud.sdk.firewall.model.UpdateSecurityGroupOptionRequest)
	 */
	@Override
	public UpdateSecurityGroupOptionResult updateSecurityGroupOption(
			UpdateSecurityGroupOptionRequest request) {
		return (UpdateSecurityGroupOptionResult) client.execute(request, UpdateSecurityGroupOptionResult.class);
	}

	/*
	 * (non-Javadoc)
	 * @see com.nifty.cloud.sdk.firewall.NiftySecurityGroup#describeSecurityGroupOption(com.nifty.cloud.sdk.firewall.model.DescribeSecurityGroupOptionRequest)
	 */
	@Override
	public DescribeSecurityGroupOptionResult describeSecurityGroupOption(
			DescribeSecurityGroupOptionRequest request) {
		return (DescribeSecurityGroupOptionResult) client.execute(request, DescribeSecurityGroupOptionResult.class);
	}

	/*
	 * (non-Javadoc)
	 * @see com.nifty.cloud.sdk.firewall.NiftySecurityGroup#getSecurityGroupOptionNotesForPaid()
	 */
	@Override
	public String getSecurityGroupOptionNotesForPaid() throws IOException {
		ClientConfiguration configuration = client.getConfig();
		String url = configuration.getFirewallNotesUrlForPaid();
		return client.getHttpText(url);
	}/*
	 * (non-Javadoc)
	 * @see com.nifty.cloud.sdk.firewall.NiftySecurityGroup#getSecurityGroupOptionNotesForFree()
	 */
	@Override
	public String getSecurityGroupOptionNotesForFree() throws IOException {
		ClientConfiguration configuration = client.getConfig();
		String url = configuration.getFirewallNotesUrlForFree();
		return client.getHttpText(url);
	}
}
