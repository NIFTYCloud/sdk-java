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
 *  Date: 2011-11-10 09:56:54
 * 
 */
package com.nifty.cloud.sdk.disk;

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
 * NIFTY Cloud API クライアント　インタフェース。
 * ディスクカテゴリ クライアント。<br />
 * ディスクカテゴリの同期クライアントのインタフェースです。<br />
 * 戻り値の"利用不可"パラメータは返却値がnullまたは空となります。
 */
public interface NiftyDisk {
	
	/**
	 * エンドポイントの設定を行います。
	 * 
	 * @param endpoint エンドポイント
	 */
	public void setEndpoint(String endpoint);

	/**
	 * 指定したディスクをサーバーへ接続します。
	 * 
	 * @param request AttachVolumeリクエスト<br />
	 * &nbsp;	AttachVolumeRequest#deviceは利用不可
	 * @return AttachVolume処理結果
	 */
	public AttachVolumeResult attachVolume(AttachVolumeRequest request);
	

	/**
	 * ディスクを新規作成を行います。
	 * 
	 * @param request CreateVolumeリクエスト<br />
	 * &nbsp;	CreateVolumeRequest#snapshotIdは利用不可<br />
	 * &nbsp;	CreateVolumeRequest#availabilityZoneは利用不可
	 * @return CreateVolume処理結果<br />
	 * &nbsp;	Volume#snapshotIdは利用不可
	 */
	public CreateVolumeResult createVolume(CreateVolumeRequest request);


	/**
	 * 指定したディスクの削除を行います。
	 * 
	 * @param request DeleteVolumeリクエスト
	 * @return DeleteVolume処理結果
	 */
	public DeleteVolumeResult deleteVolume(DeleteVolumeRequest request);

	/**
	 * 指定したディスクの情報を取得します。
	 * 
	 * @param request DescribeVolumeリクエスト
	 * @return DescribeVolume処理結果<br />
	 * &nbsp;	Volume#snapshotIdは利用不可
	 */
	public DescribeVolumesResult describeVolumes(DescribeVolumesRequest request);


	/**
	 * 指定したディスクとサーバーの接続を解除します。
	 * 
	 * @param request DetachVolumeリクエスト<br />
	 * &nbsp;	DetachVolumeRequest#deviceは利用不可<br />
	 * &nbsp;	DetachVolumeRequest#forceは利用不可
	 * @return DetachVolume処理結果
	 */
	public DetachVolumeResult detachVolume(DetachVolumeRequest request);

	/**
	 * 指定したディスクの詳細情報を更新します。
	 * @param request ModifyVolumeAttributeリクエスト
	 * @return ModifyVolumeAttribute処理結果
	 */
	public ModifyVolumeAttributeResult modifyVolumeAttribute(ModifyVolumeAttributeRequest request);
}
