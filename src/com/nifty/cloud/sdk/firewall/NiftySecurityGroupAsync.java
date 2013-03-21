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
package com.nifty.cloud.sdk.firewall;

import java.util.concurrent.Future;

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
 * NIFTY Cloud API 非同期クライアント　インタフェース。
 * ファイアウォールカテゴリクライアント。<br />
 * ファイアウォールカテゴリの非同期クライアントのインタフェースです。<br />
 * 戻り値の"利用不可"パラメータは返却値がnullまたは空となります。
 *
 */
public interface NiftySecurityGroupAsync extends NiftySecurityGroup {

	/**
	 * 非同期でファイアウォールグループを作成します。
	 *
	 * @param request CreateSecurityGroupリクエスト
	 * @return 非同期処理結果
	 */
	public Future<CreateSecurityGroupResult> createSecurityGroupAsync(CreateSecurityGroupRequest request);

	/**
	 * 非同期で指定したファイアウォールグループを削除します。
	 *
	 * @param request DeleteSecurityGroupリクエスト
	 * @return 非同期処理結果
	 */
	public Future<DeleteSecurityGroupResult> deleteSecurityGroupAsync(DeleteSecurityGroupRequest request);

	/**
	 * 非同期で指定したファイアウォールグループを指定名称で更新します。
	 *
	 * @param request UpdateSecurityGroupリクエスト
	 * @return 非同期処理結果
	 */
	public Future<UpdateSecurityGroupResult> updateSecurityGroupAsync(UpdateSecurityGroupRequest request);

	/**
	 * 非同期で指定した絞り込み条件に合致したファイアウォールグループの情報を取得します。
	 *
	 * @param request DescribeSecurityGroupsリクエスト
	 * @return 非同期処理結果<br />
	 * &nbsp; SecurityGroup#ownerIdは利用不可<br />
	 * &nbsp; UserIdGroupPair#userIdは利用不可
	 */
	public Future<DescribeSecurityGroupsResult> describeSecurityGroupsAsync(DescribeSecurityGroupsRequest request);

	/**
	 * 非同期でファイアウォールグループから許可ルールを設定します。
	 *
	 * @param request AuthorizeSecurityGroupIngressリクエスト<br />
	 * &nbsp;	AuthorizeSecurityGroupIngressRequest#userIdは利用不可<br />
	 * &nbsp;	IpPermission#toPortは利用不可<br />
	 * &nbsp;	UserIdGroupPair#userIdは利用不可
	 * @return 非同期処理結果
	 */
	public Future<AuthorizeSecurityGroupIngressResult> authorizeSecurityGroupIngressAsync(AuthorizeSecurityGroupIngressRequest request);

	/**
	 * 非同期でファイアウォールグループから許可ルールを削除します。
	 *
	 * @param request RevokeSecurityGroupIngressリクエスト<br />
	 * &nbsp;	RevokeSecurityGroupIngressRequest#userIdは利用不可<br />
	 * &nbsp;	IpPermission#toPortは利用不可<br />
	 * &nbsp;	UserIdGroupPair#userIdは利用不可
	 * @return 非同期処理結果
	 */
	public Future<RevokeSecurityGroupIngressResult> revokeSecurityGroupIngressAsync(RevokeSecurityGroupIngressRequest request);

	/**
	 * 非同期で指定したサーバーを、指定したファイアウォールグループに追加します。
	 *
	 * @param request RegisterInstancesWithSecurityGroupリクエスト
	 * @return 非同期処理結果
	 */
	public Future<RegisterInstancesWithSecurityGroupResult> registerInstancesWithSecurityGroupAsync(RegisterInstancesWithSecurityGroupRequest request);

	/**
	 * 非同期で指定したサーバーを、指定したファイアウォールグループから外します。
	 *
	 * @param request DeregisterInstancesFromSecurityGroupリクエスト
	 * @return 非同期処理結果
	 */
	public Future<DeregisterInstancesFromSecurityGroupResult> deregisterInstancesFromSecurityGroupAsync(DeregisterInstancesFromSecurityGroupRequest request);

	/**
	 * 非同期で指定したファイアウォールグループのsysログ情報(操作ログ)を取得します。
	 *
	 * @param request DescribeSecurityActivitiesリクエスト
	 * @return 非同期処理結果
	 */
	public Future<DescribeSecurityActivitiesResult> describeSecurityActivitiesAsync(DescribeSecurityActivitiesRequest request);

	/**
	 * 非同期でファイアウォールのオプション情報を更新します。
	 * 
	 * @param request UpdateSecurityGroupOptionリクエスト
	 * @return 非同期処理結果
	 */
	public Future<UpdateSecurityGroupOptionResult> updateSecurityGroupOptionAsync(UpdateSecurityGroupOptionRequest request);

	/**
	 * 非同期でファイアウォールのオプション情報を取得します。
	 * 
	 * @param request DescribeSecurityGroupOptionリクエスト
	 * @return 非同期処理結果
	 */
	public Future<DescribeSecurityGroupOptionResult> describeSecurityGroupOptionAsync(DescribeSecurityGroupOptionRequest request);
}
