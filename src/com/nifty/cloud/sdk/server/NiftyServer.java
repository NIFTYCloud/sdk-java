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
package com.nifty.cloud.sdk.server;

import com.nifty.cloud.sdk.server.model.CancelCopyInstancesRequest;
import com.nifty.cloud.sdk.server.model.CancelCopyInstancesResult;
import com.nifty.cloud.sdk.server.model.CopyInstancesRequest;
import com.nifty.cloud.sdk.server.model.CopyInstancesResult;
import com.nifty.cloud.sdk.server.model.CreateImageRequest;
import com.nifty.cloud.sdk.server.model.CreateImageResult;
import com.nifty.cloud.sdk.server.model.DescribeInstanceAttributeRequest;
import com.nifty.cloud.sdk.server.model.DescribeInstanceAttributeResult;
import com.nifty.cloud.sdk.server.model.DescribeInstancesRequest;
import com.nifty.cloud.sdk.server.model.DescribeInstancesResult;
import com.nifty.cloud.sdk.server.model.ImportInstanceRequest;
import com.nifty.cloud.sdk.server.model.ImportInstanceResult;
import com.nifty.cloud.sdk.server.model.ModifyInstanceAttributeRequest;
import com.nifty.cloud.sdk.server.model.ModifyInstanceAttributeResult;
import com.nifty.cloud.sdk.server.model.RebootInstancesResult;
import com.nifty.cloud.sdk.server.model.RebootInstancesRequest;
import com.nifty.cloud.sdk.server.model.RunInstancesRequest;
import com.nifty.cloud.sdk.server.model.RunInstancesResult;
import com.nifty.cloud.sdk.server.model.StartInstancesRequest;
import com.nifty.cloud.sdk.server.model.StartInstancesResult;
import com.nifty.cloud.sdk.server.model.StopInstancesRequest;
import com.nifty.cloud.sdk.server.model.StopInstancesResult;
import com.nifty.cloud.sdk.server.model.TerminateInstancesRequest;
import com.nifty.cloud.sdk.server.model.TerminateInstancesResult;


/**
 * NIFTY Cloud API クライアント　インタフェース。
 * サーバーカテゴリ クライアント。<br />
 * サーバーカテゴリの同期クライアントのインタフェースです。<br />
 * 戻り値の"利用不可"パラメータは返却値がnullまたは空となります。
 *
 */
public interface NiftyServer {

	/**
	 * エンドポイントの設定を行います。
	 *
	 * @param endpoint エンドポイント
	 */
	public void setEndpoint(String endpoint);

	/**
	 * 指定したコピー待ちサーバーの作成をキャンセルします。
	 *
	 * @param request CancelCopyInstancesリクエスト
	 * @return CancelCopyInstances処理結果
	 */
	public CancelCopyInstancesResult cancelCopyInstances(CancelCopyInstancesRequest request);

	/**
	 * 指定したサーバーをコピーします。
	 *
	 * @param request CopyInstancesリクエスト
	 * @return CopyInstances処理結果
	 */
	public CopyInstancesResult copyInstances(CopyInstancesRequest request);

	/**
	 * 指定したサーバーをイメージ化します。
	 *
	 * @param request CreateImageリクエスト<br />
	 * &nbsp;	CreateImageRequest#descriptionは利用不可<br />
	 * &nbsp;	CreateImageRequest#noRebootは利用不可
	 * @return CreateImage処理結果
	 */
	public CreateImageResult createImage(CreateImageRequest request);

	/**
	 * 指定したサーバーの詳細情報を取得します。<br />
	 * 1回のリクエストで、1つのサーバーの詳細情報を取得します。
	 *
	 * @param request DescribeInstanceAttributeリクエスト
	 * @return DescribeInstanceAttribute処理結果<br />
	 * &nbsp;	InstanceAttribute#kernelは利用不可<br />
	 * &nbsp;	InstanceAttribute#ramdiskは利用不可<br />
	 * &nbsp;	InstanceAttribute#userDataは利用不可<br />
	 * &nbsp;	InstanceAttribute#instanceInitiatedShutdownBehaviorは利用不可<br />
	 * &nbsp;	InstanceAttribute#rootDeviceNameは利用不可
	 */
	public DescribeInstanceAttributeResult describeInstanceAttribute(DescribeInstanceAttributeRequest request);

	/**
	 * 指定したサーバーの情報を取得します。<br />
	 * 1回のリクエストで、複数のサーバー情報を取得します。
	 *
	 * @param request DescribeInstancesリクエスト
	 * @return DescribeInstances処理結果<br />
	 * &nbsp;	Reservation#reservationIdは利用不可<br />
	 * &nbsp;	Reservation#ownerIdは利用不可<br />
	 * &nbsp;	Instance#amiLaunchIndexは利用不可<br />
	 * &nbsp;	Instance#productCodesは利用不可<br />
	 * &nbsp;	Instance#kernelIdは利用不可<br />
	 * &nbsp;	Instance#ramdiskIdは利用不可<br />
	 * &nbsp;	Instance#subnetIdは利用不可<br />
	 * &nbsp;	Instance#vpcIdは利用不可<br />
	 * &nbsp;	Instance#stateReasonは利用不可<br />
	 * &nbsp;	Instance#rootDeviceNameは利用不可<br />
	 * &nbsp;	Instance#instanceLifecycleは利用不可<br />
	 * &nbsp;	Instance#spotInstanceRequestIdは利用不可
	 */
	public DescribeInstancesResult describeInstances(DescribeInstancesRequest request);


	/**
	 * 指定したサーバーの詳細情報を更新します。
	 *
	 * @param request ModifyInstanceAttributeリクエスト
	 * @return ModifyInstanceAttribute処理結果
	 */
	public ModifyInstanceAttributeResult modifyInstanceAttribute(ModifyInstanceAttributeRequest request);


	/**
	 * 指定したサーバーを再起動します。
	 *
	 * @param request RebootInstancesリクエスト
	 * @return RebootInstances処理結果
	 */
	public RebootInstancesResult rebootInstances(RebootInstancesRequest request);

	/**
	 * サーバーを新規作成します。
	 *
	 * @param request RunInstancesリクエスト<br />
	 * &nbsp;	RunInstancesRequest#minCountは利用不可<br />
	 * &nbsp;	RunInstancesRequest#maxCountは利用不可<br />
	 * &nbsp;	RunInstancesRequest#additionalInfoは利用不可<br />
	 * &nbsp;	RunInstancesRequest#addressingTypeは利用不可<br />
	 * &nbsp;	RunInstancesRequest#placementは利用不可<br />
	 * &nbsp;	RunInstancesRequest#kernelIdは利用不可<br />
	 * &nbsp;	RunInstancesRequest#ramdiskIdは利用不可<br />
	 * &nbsp;	RunInstancesRequest#blockDeviceMappingsは利用不可<br />
	 * &nbsp;	RunInstancesRequest#monitoringは利用不可<br />
	 * &nbsp;	RunInstancesRequest#subnetIdは利用不可<br />
	 * &nbsp;	RunInstancesRequest#instanceInitiatedShutdownBehaviorは利用不可
	 * @return RunInstances処理結果<br />
	 * &nbsp;	Reservation#reservationIdは利用不可<br />
	 * &nbsp;	Reservation#ownerIdは利用不可<br />
	 * &nbsp;	Instance#amiLaunchIndexは利用不可<br />
	 * &nbsp;	Instance#productCodesは利用不可<br />
	 * &nbsp;	Instance#kernelIdは利用不可<br />
	 * &nbsp;	Instance#ramdiskIdは利用不可<br />
	 * &nbsp;	Instance#subnetIdは利用不可<br />
	 * &nbsp;	Instance#vpcIdは利用不可<br />
	 * &nbsp;	Instance#stateReasonは利用不可<br />
	 * &nbsp;	Instance#rootDeviceNameは利用不可<br />
	 * &nbsp;	Instance#blockDeviceMappingsは利用不可<br />
	 * &nbsp;	Instance#instanceLifecycleは利用不可<br />
	 * &nbsp;	Instance#spotInstanceRequestIdは利用不可
	 */
	public RunInstancesResult runInstances(RunInstancesRequest request);


	/**
	 * 指定したサーバーを起動します。
	 *
	 * @param request StartInstancesリクエスト
	 * @return StartInstances処理結果
	 */
	public StartInstancesResult startInstances(StartInstancesRequest request);

	/**
	 * 指定したサーバーを停止します。
	 *
	 * @param request StopInstancesリクエスト
	 * @return StopInstances処理結果
	 */
	public StopInstancesResult stopInstances(StopInstancesRequest request);

	/**
	 * 指定したサーバーを削除します。
	 *
	 * @param request TerminateInstancesリクエスト
	 * @return TerminateInstances処理結果
	 */
	public TerminateInstancesResult terminateInstances(TerminateInstancesRequest request);

	/**
	 * サーバーをインポートします。
	 * @param request ImportInstanceリクエスト<br/>
	 * &nbsp;	ImportInstanceRequest#userDataは利用不可<br />
	 * &nbsp;	ImportInstanceRequest#placementは利用不可<br />
	 * &nbsp;	ImportInstanceRequest#monitoringは利用不可<br />
	 * &nbsp;	ImportInstanceRequest#subnetIdは利用不可<br />
	 * &nbsp;	ImportInstanceRequest#instanceInitiatedShutdownBehaviorは利用不可<br />
	 * &nbsp;	ImportInstanceRequest#privateIpAddressは利用不可<br />
	 * &nbsp;	ImportInstanceRequest#diskImageSetは利用不可<br />
	 * &nbsp;	ImportInstanceRequest#keepPartialImportsは利用不可<br />
	 * &nbsp;	ImportInstanceRequest#platformは利用不可
	 * @return 非同期処理結果<br />
	 * &nbsp;	ConversionTask#tagSetは利用不可<br />
	 * &nbsp;	ImportInstance#platformは利用不可<br />
	 * &nbsp;	ImportInstance#descriptionは利用不可<br />
	 * &nbsp;	ImportInstanceVolumeDetail#bytesConvertedは利用不可<br />
	 * &nbsp;	ImportInstanceVolumeDetail#descriptionは利用不可<br />
	 * &nbsp;	ImportInstanceVolumeDetail#volumeは利用不可<br />
	 * &nbsp;	ImportInstanceVolumeDetail#stateMessageは利用不可<br />
	 * &nbsp;	DiskImageDescription#importManifestUrlは利用不可<br />
	 * &nbsp;	DiskImageDescription#checksumは利用不可
	 */
	public ImportInstanceResult importInstance(ImportInstanceRequest request);
}
