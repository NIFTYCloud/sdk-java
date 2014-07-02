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
package com.nifty.cloud.sdk.disk;

import java.util.concurrent.Future;

import com.nifty.cloud.sdk.disk.model.AttachVolumeRequest;
import com.nifty.cloud.sdk.disk.model.AttachVolumeResult;
import com.nifty.cloud.sdk.disk.model.CreateVolumeRequest;
import com.nifty.cloud.sdk.disk.model.CreateVolumeResult;
import com.nifty.cloud.sdk.disk.model.DeleteVolumeRequest;
import com.nifty.cloud.sdk.disk.model.DeleteVolumeResult;
import com.nifty.cloud.sdk.disk.model.DescribeVolumesRequest;
import com.nifty.cloud.sdk.disk.model.DescribeVolumesResult;
import com.nifty.cloud.sdk.disk.model.DetachVolumeRequest;
import com.nifty.cloud.sdk.disk.model.DetachVolumeResult;
import com.nifty.cloud.sdk.disk.model.ModifyVolumeAttributeRequest;
import com.nifty.cloud.sdk.disk.model.ModifyVolumeAttributeResult;

/**
 * NIFTY Cloud API 非同期クライアント　インタフェース。
 * ディスクカテゴリクライアント。<br />
 * ディスクカテゴリの非同期クライアントのインタフェースです。<br />
 * 戻り値の"利用不可"パラメータは返却値がnullまたは空となります。
 */
public interface NiftyDiscAsync extends NiftyDisk {

	/**
	 * 非同期で指定したディスクをサーバーへ接続します。
	 * 
	 * @param request AttachVolumeリクエスト<br />
	 * &nbsp;	AttachVolumeRequest#deviceは利用不可
	 * @return 非同期処理結果
	 */
	public Future<AttachVolumeResult> attachVolumeAsync(AttachVolumeRequest request);
	

	/**
	 * 非同期でディスクを新規作成を行います。
	 * 
	 * @param request CreateVolumeリクエスト<br />
	 * &nbsp;	CreateVolumeRequest#snapshotIdは利用不可<br />
	 * &nbsp;	CreateVolumeRequest#availabilityZoneは利用不可
	 * @return 非同期処理結果<br />
	 * &nbsp;	Volume#snapshotIdは利用不可
	 */
	public Future<CreateVolumeResult> createVolumeAsync(CreateVolumeRequest request);


	/**
	 * 非同期で指定したディスクの削除を行います。
	 * 
	 * @param request DeleteVolumeリクエスト
	 * @return 非同期処理結果
	 */
	public Future<DeleteVolumeResult> deleteVolumeAsync(DeleteVolumeRequest request);

	/**
	 * 非同期で指定したディスクの情報を取得します。
	 * 
	 * @param request DescribeVolumeリクエスト
	 * @return 非同期処理結果<br />
	 * &nbsp;	Volume#snapshotIdは利用不可
	 */
	public Future<DescribeVolumesResult> describeVolumesAsync(DescribeVolumesRequest request);


	/**
	 * 非同期で指定したディスクとサーバーの接続を解除します。
	 * 
	 * @param request DetachVolumeリクエスト<br />
	 * &nbsp;	DetachVolumeRequest#deviceは利用不可<br />
	 * &nbsp;	DetachVolumeRequest#forceは利用不可
	 * @return 非同期処理結果
	 */
	public Future<DetachVolumeResult> detachVolumeAsync(DetachVolumeRequest request);

	/**
	 * 非同期で指定したディスクの詳細情報を更新します。
	 * @param request ModifyVolumeAttributeリクエスト
	 * @return 非同期処理結果
	 */
	public Future<ModifyVolumeAttributeResult> modifyVolumeAttributeAsync(ModifyVolumeAttributeRequest request);
	
}
