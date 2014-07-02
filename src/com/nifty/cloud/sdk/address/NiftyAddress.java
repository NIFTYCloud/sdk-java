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
package com.nifty.cloud.sdk.address;

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
 * NIFTY Cloud API クライアント　インタフェース。
 * アドレスカテゴリ クライアント。<br />
 * アドレスカテゴリの同期クライアントのインタフェースです。<br />
 * 戻り値の"利用不可"パラメータは返却値がnullまたは空となります。
 */
public interface NiftyAddress {

	/**
	 * エンドポイントの設定を行います。
	 *
	 * @param endpoint エンドポイント
	 */
	public void setEndpoint(String endpoint);

	/**
	 * 付替IPアドレスを割り当てます。
	 *
	 * @param request AllocateAddressリクエスト<br />
	 * &nbsp;	AllocateAddressRequest#domainは利用不可
	 * @return AllocateAddress処理結果<br />
	 * &nbsp;	AllocateAddressResult#domainは利用不可<br />
	 * &nbsp;	AllocateAddressResult#allocationIdは利用不可
	 */
	public AllocateAddressResult allocateAddress(AllocateAddressRequest request);

	/**
	 * 指定したサーバーへ付替IPアドレス追加します。
	 *
	 * @param request AssociateAddressリクエスト<br />
	 * &nbsp;	AssociateAddressRequest#allocationIdは利用不可<br />
	 * &nbsp;	AssociateAddressRequest#networkInterfaceIdは利用不可<br />
	 * &nbsp;	AssociateAddressRequest#allowReassociationは利用不可
	 * @return AssociateAddress処理結果<br />
	 * &nbsp;	AssociateAddressResult#associationIdは利用不可
	 */
	public AssociateAddressResult associateAddress(AssociateAddressRequest request);

	/**
	 * 付替IPアドレスの基本情報を更新します。
	 *
	 * @param request NiftyModifyAddressAttributeリクエスト
	 * @return NiftyModifyAddressAttribute処理結果
	 */
	public NiftyModifyAddressAttributeResult niftyModifyAddressAttribute(NiftyModifyAddressAttributeRequest request);

	/**
	 * 付替IPアドレス情報を取得します。
	 *
	 * @param request DescribeAddressesリクエスト<br />
	 * &nbsp;	DescribeAddressesRequest#allocationIdsは利用不可<br />
	 * &nbsp;	DescribeAddressesRequest#filtersは利用不可
	 * @return DescribeAddresses処理結果<br />
	 * &nbsp;	Address#allocationIdは利用不可<br />
	 * &nbsp;	Address#domainは利用不可<br />
	 * &nbsp;	Address#associationIdは利用不可<br />
	 * &nbsp;	Address#networkInterfaceIdは利用不可<br />
	 * &nbsp;	Address#networkInterfaceOwnerIdは利用不可
	 */
	public DescribeAddressesResult describeAddresses(DescribeAddressesRequest request);

	/**
	 * サーバーから付替IPアドレスを解除します。
	 *
	 * @param request DisassociateAddressリクエスト<br />
	 * &nbsp;	DisassociateAddressRequest#associationIdは利用不可
	 * @return DisassociateAddress処理結果
	 */
	public DisassociateAddressResult disassociateAddress(DisassociateAddressRequest request);

	/**
	 * 付替IPアドレスを解放します。
	 *
	 * @param request ReleaseAddressリクエスト<br />
	 * &nbsp;	ReleaseAddressRequest#allocationIdは利用不可
	 * @return ReleaseAddress処理結果
	 */
	public ReleaseAddressResult releaseAddress(ReleaseAddressRequest request);
	}
