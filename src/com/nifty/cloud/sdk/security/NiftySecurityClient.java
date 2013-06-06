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

import com.nifty.cloud.sdk.BaseClient;
import com.nifty.cloud.sdk.ClientConfiguration;
import com.nifty.cloud.sdk.auth.Credentials;
import com.nifty.cloud.sdk.security.model.CreateKeyPairRequest;
import com.nifty.cloud.sdk.security.model.CreateKeyPairResult;
import com.nifty.cloud.sdk.security.model.DeleteKeyPairRequest;
import com.nifty.cloud.sdk.security.model.DeleteKeyPairResult;
import com.nifty.cloud.sdk.security.model.DescribeKeyPairsRequest;
import com.nifty.cloud.sdk.security.model.DescribeKeyPairsResult;

/**
 * NIFTY Cloud API クライアント　具象クラス。
 * セキュリティカテゴリ クライアント。<br />
 * セキュリティ カテゴリの同期クライアントの具象クラスです。
 *
 */
public class NiftySecurityClient extends BaseClient implements NiftySecurity {
	
	/** 
	 * 認証情報を指定し、セキュリティカテゴリクライアントを構築します。
	 * 
	 * @param credential 認証情報
	 */
	public NiftySecurityClient(Credentials credential) {
		super(credential, new ClientConfiguration());
	}

	/** 
	 * 認証情報、クライアント設定を指定し、セキュリティカテゴリクライアントを構築します。
	 * 
	 * @param credential 認証情報
	 * @param configuration クライアント設定
	 */
	public NiftySecurityClient(Credentials credential, ClientConfiguration configuration) {
		super(credential, configuration);
	}

	/*
	 * (non-Javadoc)
	 * @see com.nifty.cloud.sdk.security.NiftySecurity#createKeyPair(com.nifty.cloud.sdk.server.model.CreateImageRequest)
	 */
	@Override
	public CreateKeyPairResult createKeyPair(CreateKeyPairRequest request) {
		return (CreateKeyPairResult) client.execute(request, CreateKeyPairResult.class);
	}

	/*
	 * (non-Javadoc)
	 * @see com.nifty.cloud.sdk.security.NiftySecurity#deleteKeyPair(com.nifty.cloud.sdk.security.model.DeleteKeyPairRequest)
	 */
	@Override
	public DeleteKeyPairResult deleteKeyPair(DeleteKeyPairRequest request) {
		return (DeleteKeyPairResult) client.execute(request, DeleteKeyPairResult.class);
	}

	/*
	 * (non-Javadoc)
	 * @see com.nifty.cloud.sdk.security.NiftySecurity#describeKeyPairs(com.nifty.cloud.sdk.security.model.DescribeKeyPairRequest)
	 */
	@Override
	public DescribeKeyPairsResult describeKeyPairs(DescribeKeyPairsRequest request) {
		return (DescribeKeyPairsResult) client.execute(request, DescribeKeyPairsResult.class);
	}


}
