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
 *  Date: 2011-11-10 09:56:54
 * 
 */
package com.nifty.cloud.sdk.disk;


import com.nifty.cloud.sdk.BaseClient;
import com.nifty.cloud.sdk.ClientConfiguration;
import com.nifty.cloud.sdk.auth.Credentials;
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
 * NIFTY Cloud API クライアント　具象クラス。
 * ディスクカテゴリ クライアント。<br />
 * ディスクカテゴリの同期クライアントの具象クラスです。<br />
 * 戻り値の"利用不可"パラメータは返却値がnullまたは空となります。
 */
public class NiftyDiskClient extends BaseClient implements NiftyDisk {
	
	/** 
	 * 認証情報を指定し、ディスクカテゴリクライアントを構築します。
	 * 
	 * @param credential 認証情報
	 */
	public NiftyDiskClient(Credentials credential) {
		super(credential, new ClientConfiguration());
	}

	/** 
	 * 認証情報、クライアント設定を指定し、ディスクカテゴリクライアントを構築します。
	 * 
	 * @param credential 認証情報
	 * @param configuration クライアント設定
	 */
	public NiftyDiskClient(Credentials credential, ClientConfiguration configuration) {
		super(credential, configuration);
	}

	/*
	 * (non-Javadoc)
	 * @see com.nifty.cloud.sdk.disk.NiftyDisk#attachVolume(com.nifty.cloud.sdk.disk.model.AttachVolumeRequest)
	 */
	@Override
	public AttachVolumeResult attachVolume(AttachVolumeRequest request) {
		return (AttachVolumeResult) client.execute(request, AttachVolumeResult.class);
	}

	/*
	 * (non-Javadoc)
	 * @see com.nifty.cloud.sdk.disk.NiftyDisk#createVolume(com.nifty.cloud.sdk.disk.model.CreateVolumeRequest)
	 */
	@Override
	public CreateVolumeResult createVolume(CreateVolumeRequest request) {
		return (CreateVolumeResult) client.execute(request, CreateVolumeResult.class);
	}

	/*
	 * (non-Javadoc)
	 * @see com.nifty.cloud.sdk.disk.NiftyDisk#deleteVolume(com.nifty.cloud.sdk.disk.model.DeleteVolumeRequest)
	 */
	@Override
	public DeleteVolumeResult deleteVolume(DeleteVolumeRequest request) {
		return (DeleteVolumeResult) client.execute(request, DeleteVolumeResult.class);
	}

	/*
	 * (non-Javadoc)
	 * @see com.nifty.cloud.sdk.disk.NiftyDisk#describeVolumes(com.nifty.cloud.sdk.disk.model.DescribeVolumeRequest)
	 */
	@Override
	public DescribeVolumesResult describeVolumes(DescribeVolumesRequest request) {
		return (DescribeVolumesResult) client.execute(request, DescribeVolumesResult.class);
	}

	/*
	 * (non-Javadoc)
	 * @see com.nifty.cloud.sdk.disk.NiftyDisk#detachVolume(com.nifty.cloud.sdk.disk.model.DetachVolumeRequest)
	 */
	@Override
	public DetachVolumeResult detachVolume(DetachVolumeRequest request) {
		return (DetachVolumeResult) client.execute(request, DetachVolumeResult.class);
	}

	/*
	 * (non-Javadoc)
	 * @see com.nifty.cloud.sdk.disk.NiftyDisk#modifyVolumeAttribute(com.nifty.cloud.sdk.disk.model.ModifyVolumeAttributeRequest)
	 */
	@Override
	public ModifyVolumeAttributeResult modifyVolumeAttribute(ModifyVolumeAttributeRequest request) {
		return (ModifyVolumeAttributeResult) client.execute(request, ModifyVolumeAttributeResult.class);
	}
}
