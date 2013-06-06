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
 *  API Version: 1.14
 *  Date: 2013-03-28 17:00:00
 * 
 */
package com.nifty.cloud.sdk.security;

import com.nifty.cloud.sdk.security.model.CreateKeyPairRequest;
import com.nifty.cloud.sdk.security.model.CreateKeyPairResult;
import com.nifty.cloud.sdk.security.model.DeleteKeyPairRequest;
import com.nifty.cloud.sdk.security.model.DeleteKeyPairResult;
import com.nifty.cloud.sdk.security.model.DescribeKeyPairsRequest;
import com.nifty.cloud.sdk.security.model.DescribeKeyPairsResult;


/**
 * NIFTY Cloud API クライアント　インタフェース。
 * セキュリティ カテゴリ クライアント。<br />
 * セキュリティ カテゴリの同期クライアントのインタフェースです。
 *
 */
public interface NiftySecurity {
	
	/**
	 * エンドポイントの設定を行います。
	 * 
	 * @param endpoint エンドポイント
	 */	
	public void setEndpoint(String endpoint);


	/**
	 * SSHキーを新規作成します。
	 * 
	 * @param request DeleteImageリクエスト
	 * @return DeleteImage処理結果
	 */
	public CreateKeyPairResult createKeyPair(CreateKeyPairRequest request);
	

	/**
	 * SSHキーの情報を削除します。
	 * 
	 * @param request DeleteKeyPairリクエスト
	 * @return DeleteKeyPair処理結果
	 */
	public DeleteKeyPairResult deleteKeyPair(DeleteKeyPairRequest request);
	

	/**
	 * 指定したSSHキーの情報を取得します。
	 * 
	 * @param request DescribeKeyPairsリクエスト
	 * @return DescribeKeyPairs処理結果
	 */
	public DescribeKeyPairsResult describeKeyPairs(DescribeKeyPairsRequest request);

}
