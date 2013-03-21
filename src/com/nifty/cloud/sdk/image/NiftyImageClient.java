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
 *  Date: 2011-08-25 09:46:38
 * 
 */
package com.nifty.cloud.sdk.image;


import com.nifty.cloud.sdk.BaseClient;
import com.nifty.cloud.sdk.ClientConfiguration;
import com.nifty.cloud.sdk.auth.Credentials;
import com.nifty.cloud.sdk.image.model.DeleteImageRequest;
import com.nifty.cloud.sdk.image.model.DeleteImageResult;
import com.nifty.cloud.sdk.image.model.DescribeImagesRequest;
import com.nifty.cloud.sdk.image.model.DescribeImagesResult;
import com.nifty.cloud.sdk.image.model.ModifyImageAttributeRequest;
import com.nifty.cloud.sdk.image.model.ModifyImageAttributeResult;

/**
 * NIFTY Cloud API クライアント　具象クラス。
 * OSイメージカテゴリ クライアント。<br />
 * OSイメージカテゴリの同期クライアントの具象クラスです。<br />
 * 戻り値の"利用不可"パラメータは返却値がnullまたは空となります。
 */
public class NiftyImageClient extends BaseClient implements NiftyImage {
	
	/** 
	 * 認証情報を指定し、OSイメージカテゴリクライアントを構築します。
	 * 
	 * @param credential 認証情報
	 */
	public NiftyImageClient(Credentials credential) {
		super(credential, new ClientConfiguration());
	}

	/** 
	 * 認証情報、クライアント設定を指定し、OSイメージカテゴリクライアントを構築します。
	 * 
	 * @param credential 認証情報
	 * @param configuration クライアント設定
	 */
	public NiftyImageClient(Credentials credential, ClientConfiguration configuration) {
		super(credential, configuration);
	}

	/*
	 * (non-Javadoc)
	 * @see com.nifty.cloud.sdk.image.NiftyImage#deleteImage(com.nifty.cloud.sdk.image.model.DeleteImagesRequest)
	 */
	@Override
	public DeleteImageResult deleteImage(DeleteImageRequest request) {
		return (DeleteImageResult)client.execute(request, DeleteImageResult.class);

	}

	/*
	 * (non-Javadoc)
	 * @see com.nifty.cloud.sdk.image.NiftyImage#describeImages(com.nifty.cloud.sdk.image.model.DescribeImagesRequest)
	 */
	@Override
	public DescribeImagesResult describeImages(DescribeImagesRequest request) {
		return (DescribeImagesResult)client.execute(request, DescribeImagesResult.class);
	}

	/*
	 * (non-Javadoc)
	 * @see com.nifty.cloud.sdk.image.NiftyImage#modifyImageAttribute(com.nifty.cloud.sdk.image.model.ModifyImageAttributeRequest)
	 */
	@Override
	public ModifyImageAttributeResult modifyImageAttribute(ModifyImageAttributeRequest request) {
		return (ModifyImageAttributeResult)client.execute(request, ModifyImageAttributeResult.class);
	}


}
