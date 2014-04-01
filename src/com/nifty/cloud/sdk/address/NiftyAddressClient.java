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
 *  API Version: 1.17
 *  Date: 2014-02-20 17:00:00
 *
 */
package com.nifty.cloud.sdk.address;


import com.nifty.cloud.sdk.BaseClient;
import com.nifty.cloud.sdk.ClientConfiguration;
import com.nifty.cloud.sdk.auth.Credentials;
import com.nifty.cloud.sdk.address.model.AllocateAddressRequest;
import com.nifty.cloud.sdk.address.model.AllocateAddressResult;
import com.nifty.cloud.sdk.address.model.AssociateAddressRequest;
import com.nifty.cloud.sdk.address.model.AssociateAddressResult;
import com.nifty.cloud.sdk.address.model.NiftyModifyAddressAttributeRequest;
import com.nifty.cloud.sdk.address.model.NiftyModifyAddressAttributeResult;
import com.nifty.cloud.sdk.address.model.DescribeAddressesRequest;
import com.nifty.cloud.sdk.address.model.DescribeAddressesResult;
import com.nifty.cloud.sdk.address.model.DisassociateAddressRequest;
import com.nifty.cloud.sdk.address.model.DisassociateAddressResult;
import com.nifty.cloud.sdk.address.model.ReleaseAddressRequest;
import com.nifty.cloud.sdk.address.model.ReleaseAddressResult;

/**
 * NIFTY Cloud API クライアント　具象クラス。
 * アドレスカテゴリ クライアント。<br />
 * アドレスカテゴリの同期クライアントの具象クラスです。<br />
 * 戻り値の"利用不可"パラメータは返却値がnullまたは空となります。
 */
public class NiftyAddressClient extends BaseClient implements NiftyAddress {

	/**
	 * 認証情報を指定し、アドレスカテゴリクライアントを構築します。
	 *
	 * @param credential 認証情報
	 */
	public NiftyAddressClient(Credentials credential) {
		super(credential, new ClientConfiguration());
	}

	/**
	 * 認証情報、クライアント設定を指定し、アドレスカテゴリクライアントを構築します。
	 *
	 * @param credential 認証情報
	 * @param configuration クライアント設定
	 */
	public NiftyAddressClient(Credentials credential, ClientConfiguration configuration) {
		super(credential, configuration);
	}

	/*
	 * (non-Javadoc)
	 * @see com.nifty.cloud.sdk.address.NiftyAddress#allocateAddress(com.nifty.cloud.sdk.address.model.AllocateAddressRequest)
	 */
	@Override
	public AllocateAddressResult allocateAddress(AllocateAddressRequest request) {
		return (AllocateAddressResult) client.execute(request, AllocateAddressResult.class);
	}

	/*
	 * (non-Javadoc)
	 * @see com.nifty.cloud.sdk.address.NiftyAddress#associateAddress(com.nifty.cloud.sdk.address.model.AssociateAddressRequest)
	 */
	@Override
	public AssociateAddressResult associateAddress(AssociateAddressRequest request) {
		return (AssociateAddressResult) client.execute(request, AssociateAddressResult.class);
	}

	/*
	 * (non-Javadoc)
	 * @see com.nifty.cloud.sdk.address.NiftyAddress#niftyModifyAddressAttribute(com.nifty.cloud.sdk.address.model.NiftyModifyAddressAttributeRequest)
	 */
	@Override
	public NiftyModifyAddressAttributeResult niftyModifyAddressAttribute(NiftyModifyAddressAttributeRequest request) {
		return (NiftyModifyAddressAttributeResult) client.execute(request, NiftyModifyAddressAttributeResult.class);
	}

	/*
	 * (non-Javadoc)
	 * @see com.nifty.cloud.sdk.address.NiftyAddress#describeAddresses(com.nifty.cloud.sdk.address.model.DescribeAddressesRequest)
	 */
	@Override
	public DescribeAddressesResult describeAddresses(DescribeAddressesRequest request) {
		return (DescribeAddressesResult) client.execute(request, DescribeAddressesResult.class);
	}

	/*
	 * (non-Javadoc)
	 * @see com.nifty.cloud.sdk.address.NiftyAddress#disassociateAddress(com.nifty.cloud.sdk.address.model.DisassociateAddressRequest)
	 */
	@Override
	public DisassociateAddressResult disassociateAddress(DisassociateAddressRequest request) {
		return (DisassociateAddressResult) client.execute(request, DisassociateAddressResult.class);
	}

	/*
	 * (non-Javadoc)
	 * @see com.nifty.cloud.sdk.address.NiftyAddress#releaseAddress(com.nifty.cloud.sdk.address.model.ReleaseAddressRequest)
	 */
	@Override
	public ReleaseAddressResult releaseAddress(ReleaseAddressRequest request) {
		return (ReleaseAddressResult) client.execute(request, ReleaseAddressResult.class);
	}
}
