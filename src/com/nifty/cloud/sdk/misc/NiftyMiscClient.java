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
 *  API Version: 1.14
 *  Date: 2013-03-28 17:00:00
 * 
 */
package com.nifty.cloud.sdk.misc;


import com.nifty.cloud.sdk.BaseClient;
import com.nifty.cloud.sdk.ClientConfiguration;
import com.nifty.cloud.sdk.auth.Credentials;
import com.nifty.cloud.sdk.misc.model.AssociateUsersRequest;
import com.nifty.cloud.sdk.misc.model.AssociateUsersResult;
import com.nifty.cloud.sdk.misc.model.DescribeAssociatedUsersRequest;
import com.nifty.cloud.sdk.misc.model.DescribeAssociatedUsersResult;
import com.nifty.cloud.sdk.misc.model.DescribeAvailabilityZonesRequest;
import com.nifty.cloud.sdk.misc.model.DescribeAvailabilityZonesResult;
import com.nifty.cloud.sdk.misc.model.DescribeRegionsRequest;
import com.nifty.cloud.sdk.misc.model.DescribeRegionsResult;
import com.nifty.cloud.sdk.misc.model.DissociateUsersRequest;
import com.nifty.cloud.sdk.misc.model.DissociateUsersResult;

/**
 * NIFTY Cloud API クライアント　具象クラス。
 * その他カテゴリ クライアント。<br />
 * その他カテゴリの同期クライアントの具象クラスです。
 */
public class NiftyMiscClient extends BaseClient implements NiftyMisc {
	
	/** 
	 * 認証情報を指定し、その他カテゴリクライアントを構築します。
	 * 
	 * @param credential 認証情報
	 */
	public NiftyMiscClient(Credentials credential) {
		super(credential, new ClientConfiguration());
	}

	/** 
	 * 認証情報、クライアント設定を指定し、その他カテゴリクライアントを構築します。
	 * 
	 * @param credential 認証情報
	 * @param configuration クライアント設定
	 */
	public NiftyMiscClient(Credentials credential, ClientConfiguration configuration) {
		super(credential, configuration);
	}

	/**
	 * @see com.nifty.cloud.sdk.misc.NiftyMisc#describeAvailabilityZones(DescribeAvailabilityZonesRequest)
	 */
	@Override
	public DescribeAvailabilityZonesResult describeAvailabilityZones(DescribeAvailabilityZonesRequest request) {
		return (DescribeAvailabilityZonesResult)client.execute(request, DescribeAvailabilityZonesResult.class);
	}
	/**
	 * @see com.nifty.cloud.sdk.misc.NiftyMisc#describeRegions(DescribeRegionsRequest)
	 */
	@Override
	public DescribeRegionsResult describeRegions(DescribeRegionsRequest request) {
		return (DescribeRegionsResult)client.execute(request, DescribeRegionsResult.class);
	}
	/**
	 * @see com.nifty.cloud.sdk.misc.NiftyMisc#associateUsers(AssociateUsersRequest)
	 */
	@Override
	public AssociateUsersResult associateUsers(AssociateUsersRequest request) {
		return (AssociateUsersResult)client.execute(request, AssociateUsersResult.class);
	}
	/**
	 * @see com.nifty.cloud.sdk.misc.NiftyMisc#dissociateUsers(DissociateUsersRequest)
	 */
	@Override
	public DissociateUsersResult dissociateUsers(DissociateUsersRequest request) {
		return (DissociateUsersResult)client.execute(request, DissociateUsersResult.class);
	}
	/**
	 * @see com.nifty.cloud.sdk.misc.NiftyMisc#describeAssociatedUsers(DescribeAssociatedUsersRequest)
	 */
	@Override
	public DescribeAssociatedUsersResult describeAssociatedUsers(DescribeAssociatedUsersRequest request) {
		return (DescribeAssociatedUsersResult)client.execute(request, DescribeAssociatedUsersResult.class);
	}
}
