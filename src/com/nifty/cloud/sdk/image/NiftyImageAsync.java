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
 *  Date: 2011-08-25 09:46:38
 * 
 */
package com.nifty.cloud.sdk.image;

import java.util.concurrent.Future;

import com.nifty.cloud.sdk.image.model.DeleteImageRequest;
import com.nifty.cloud.sdk.image.model.DeleteImageResult;
import com.nifty.cloud.sdk.image.model.DescribeImagesRequest;
import com.nifty.cloud.sdk.image.model.DescribeImagesResult;
import com.nifty.cloud.sdk.image.model.ModifyImageAttributeRequest;
import com.nifty.cloud.sdk.image.model.ModifyImageAttributeResult;

/**
 * NIFTY Cloud API 非同期クライアント　インタフェース。
 * OSイメージカテゴリクライアント。<br />
 * OSイメージカテゴリの非同期クライアントのインタフェースです。<br />
 * 戻り値の"利用不可"パラメータは返却値がnullまたは空となります。
 */
public interface NiftyImageAsync extends NiftyImage {

	/**
	 * 非同期で指定したOSイメージを削除します。
	 * 
	 * @param request DeleteImageリクエスト
	 * @return 非同期処理結果
	 */
	public Future<DeleteImageResult> deleteImageAsync(DeleteImageRequest request);
	
	/**
	 * 非同期でOSイメージの情報を取得します。
	 * 
	 * @param request DescribeImagesリクエスト<br />
	 * &nbsp;	DescribeImagesRequest#executableUsersは利用不可
	 * @return 非同期処理結果<br />
	 * &nbsp;	Image#imageLocationは利用不可<br />
	 * &nbsp;	Image#ownerIdは利用不可<br />
	 * &nbsp;	Image#productCodesは利用不可<br />
	 * &nbsp;	Image#kernelIdは利用不可<br />
	 * &nbsp;	Image#ramdiskIdは利用不可<br />
	 * &nbsp;	Image#stateReasonは利用不可<br />
	 * &nbsp;	Image#rootDeviceNameは利用不可<br />
	 * &nbsp;	Image#blockDeviceMappingsは利用不可
	 */
	public Future<DescribeImagesResult> describeImagesAsync(DescribeImagesRequest request);
	
	/**
	 * 非同期で指定したOSイメージの詳細情報を更新します。
	 * @param request ModifyImageAttributeリクエスト<br />
	 * &nbsp;	ModifyImageAttributeRequest#userIdsは利用不可<br />
	 * &nbsp;	ModifyImageAttributeRequest#userGroupsは利用不可<br />
	 * &nbsp;	ModifyImageAttributeRequest#operationTypeは利用不可<br />
	 * &nbsp;	ModifyImageAttributeRequest#productCodesは利用不可
	 * @return 非同期処理結果
	 */
	public Future<ModifyImageAttributeResult> modifyImageAttributeAsync(ModifyImageAttributeRequest request);

}
