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
package com.nifty.cloud.sdk.security;

import java.util.concurrent.Future;

import com.nifty.cloud.sdk.security.model.CreateKeyPairRequest;
import com.nifty.cloud.sdk.security.model.CreateKeyPairResult;
import com.nifty.cloud.sdk.security.model.DeleteKeyPairRequest;
import com.nifty.cloud.sdk.security.model.DeleteKeyPairResult;
import com.nifty.cloud.sdk.security.model.DescribeKeyPairsRequest;
import com.nifty.cloud.sdk.security.model.DescribeKeyPairsResult;


/**
 * NIFTY Cloud API 非同期クライアント　インタフェース。
 * セキュリティカテゴリクライアント。<br />
 * セキュリティ カテゴリの非同期クライアントのインタフェースです。
 *
 */
public interface NiftySecurityAsync extends NiftySecurity {

	/**
	 * 非同期でSSHキーを新規作成します。
	 * 
	 * @param request DeleteImageリクエスト
	 * @return 非同期処理結果
	 */
	public Future<CreateKeyPairResult> createKeyPairAsync(CreateKeyPairRequest request);
	

	/**
	 * 非同期でSSHキーの情報を削除します。
	 * 
	 * @param request DeleteKeyPairリクエスト
	 * @return 非同期処理結果
	 */
	public Future<DeleteKeyPairResult> deleteKeyPairAsync(DeleteKeyPairRequest request);
	

	/**
	 * 非同期で指定したSSHキーの情報を取得します。
	 * 
	 * @param request DescribeKeyPairsリクエスト
	 * @return 非同期処理結果
	 */
	public Future<DescribeKeyPairsResult> describeKeyPairsAsync(DescribeKeyPairsRequest request);

}
