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
 *  API Version: 1.15
 *  Date: 2013-06-28 17:00:00
 *
 */
package com.nifty.cloud.sdk.firewall;

import java.io.IOException;

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
 * NIFTY Cloud API クライアント　インタフェース。
 * ファイアウォールカテゴリ クライアント。<br />
 * ファイアウォールカテゴリの同期クライアントのインタフェースです。<br />
 * 戻り値の"利用不可"パラメータは返却値がnullまたは空となります。
 *
 */
public interface NiftySecurityGroup {

	/**
	 * エンドポイントの設定を行います。
	 *
	 * @param endpoint エンドポイント
	 */
	public void setEndpoint(String endpoint);

	/**
	 * ファイアウォールグループを作成します。
	 *
	 * @param request CreateSecurityGroupリクエスト
	 * @return CreateSecurityGroup処理結果
	 */
	public CreateSecurityGroupResult createSecurityGroup(CreateSecurityGroupRequest request);

	/**
	 * 指定したファイアウォールグループを削除します。
	 *
	 * @param request DeleteSecurityGroupリクエスト
	 * @return DeleteSecurityGroup処理結果
	 */
	public DeleteSecurityGroupResult deleteSecurityGroup(DeleteSecurityGroupRequest request);

	/**
	 * 指定したファイアウォールグループを指定名称で更新します。
	 *
	 * @param request UpdateSecurityGroupリクエスト
	 * @return UpdateSecurityGroup処理結果
	 */
	public UpdateSecurityGroupResult updateSecurityGroup(UpdateSecurityGroupRequest request);

	/**
	 * 指定した絞り込み条件に合致したファイアウォールグループの情報を取得します。
	 *
	 * @param request DescribeSecurityGroupsリクエスト
	 * @return DescribeSecurityGroups処理結果<br />
	 * &nbsp;	SecurityGroup#ownerIdは利用不可<br />
	 * &nbsp;	UserIdGroupPair#userIdは利用不可
	 */
	public DescribeSecurityGroupsResult describeSecurityGroups(DescribeSecurityGroupsRequest request);

	/**
	 * ファイアウォールグループから許可ルールを設定します。
	 *
	 * @param request AuthorizeSecurityGroupIngressリクエスト<br />
	 * &nbsp;	AuthorizeSecurityGroupIngressRequest#userIdは利用不可<br />
	 * &nbsp;	IpPermission#toPortは利用不可<br />
	 * &nbsp;	UserIdGroupPair#userIdは利用不可
	 * @return AuthorizeSecurityGroupIngress処理結果
	 */
	public AuthorizeSecurityGroupIngressResult authorizeSecurityGroupIngress(AuthorizeSecurityGroupIngressRequest request);

	/**
	 * ファイアウォールグループから許可ルールを削除します。
	 *
	 * @param request RevokeSecurityGroupIngressリクエスト<br />
	 * &nbsp;	RevokeSecurityGroupIngressRequest#userIdは利用不可<br />
	 * &nbsp;	IpPermission#toPortは利用不可<br />
	 * &nbsp;	UserIdGroupPair#userIdは利用不可
	 * @return RevokeSecurityGroupIngress処理結果
	 */
	public RevokeSecurityGroupIngressResult revokeSecurityGroupIngress(RevokeSecurityGroupIngressRequest request);

	/**
	 * 指定したサーバーを、指定したファイアウォールグループに追加します。
	 *
	 * @param request RegisterInstancesWithSecurityGroupリクエスト
	 * @return RegisterInstancesWithSecurityGroup処理結果
	 */
	public RegisterInstancesWithSecurityGroupResult registerInstancesWithSecurityGroup(RegisterInstancesWithSecurityGroupRequest request);

	/**
	 * 指定したサーバーを、指定したファイアウォールグループから外します。
	 *
	 * @param request DeregisterInstancesFromSecurityGroupリクエスト
	 * @return DeregisterInstancesFromSecurityGroup処理結果
	 */
	public DeregisterInstancesFromSecurityGroupResult deregisterInstancesFromSecurityGroup(DeregisterInstancesFromSecurityGroupRequest request);

	/**
	 * 指定したファイアウォールグループのsysログ情報(操作ログ)を取得します。
	 *
	 * @param request DescribeSecurityActivitiesリクエスト
	 * @return DescribeSecurityActivities処理結果
	 */
	public DescribeSecurityActivitiesResult describeSecurityActivities(DescribeSecurityActivitiesRequest request);

	/**
	 * ファイアウォールのオプション情報を更新します。
	 * 
	 * @param request UpdateSecurityGroupOptionリクエスト
	 * @return UpdateSecurityGroupOption処理結果
	 */
	public UpdateSecurityGroupOptionResult updateSecurityGroupOption(UpdateSecurityGroupOptionRequest request);

	/**
	 * ファイアウォールのオプション情報を取得します。
	 * 
	 * @param request DescribeSecurityGroupOptionリクエスト
	 * @return DescribeSecurityGroupOption処理結果
	 */
	public DescribeSecurityGroupOptionResult describeSecurityGroupOption(DescribeSecurityGroupOptionRequest request);

	/**
	 * 有償版へ変更する際の注意事項の文言を取得します。
	 * 
	 * @return 注意事項
	 * @throws IOException
	 */
	public String getSecurityGroupOptionNotesForPaid() throws IOException;

	/**
	 * 無償版へ変更する際の注意事項の文言を取得します。
	 * 
	 * @return 注意事項
	 * @throws IOException
	 */
	public String getSecurityGroupOptionNotesForFree() throws IOException;
}
