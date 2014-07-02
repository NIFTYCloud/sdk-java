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
package com.nifty.cloud.sdk.server;


import java.io.IOException;

import com.nifty.cloud.sdk.BaseClient;
import com.nifty.cloud.sdk.ClientConfiguration;
import com.nifty.cloud.sdk.auth.Credentials;
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
 * NIFTY Cloud API クライアント　具象クラス。
 * サーバーカテゴリ クライアント。<br />
 * サーバーカテゴリの同期クライアントの具象クラスです。<br />
 * 戻り値の"利用不可"パラメータは返却値がnullまたは空となります。
 *
 */
public class NiftyServerClient extends BaseClient implements NiftyServer {

	/**
	 * 認証情報を指定し、サーバーカテゴリクライアントを構築します。
	 *
	 * @param credential 認証情報
	 */
	public NiftyServerClient(Credentials credential) {
		super(credential, new ClientConfiguration());
	}

	/**
	 * 認証情報、クライアント設定を指定し、サーバーカテゴリクライアントを構築します。
	 *
	 * @param credential 認証情報
	 * @param configuration クライアント設定
	 */
	public NiftyServerClient(Credentials credential, ClientConfiguration configuration) {
		super(credential, configuration);
	}

	/*
	 * (non-Javadoc)
	 * @see com.nifty.cloud.sdk.server.NiftyServer#cancelCopyInstances(CancelCopyInstancesRequest)
	 */
	@Override
	public CancelCopyInstancesResult cancelCopyInstances(CancelCopyInstancesRequest request) {
		return (CancelCopyInstancesResult) client.execute(request, CancelCopyInstancesResult.class);
	}

	/*
	 * (non-Javadoc)
	 * @see com.nifty.cloud.sdk.server.NiftyServer#copyInstances(CopyInstancesRequest)
	 */
	@Override
	public CopyInstancesResult copyInstances(CopyInstancesRequest request) {
		return (CopyInstancesResult) client.execute(request, CopyInstancesResult.class);
	}

	/*
	 * (non-Javadoc)
	 * @see com.nifty.cloud.sdk.server.NiftyServer#createImage(CreateImageRequest)
	 */
	@Override
	public CreateImageResult createImage(CreateImageRequest request) {
		return (CreateImageResult) client.execute(request, CreateImageResult.class);

	}

	/*
	 * (non-Javadoc)
	 * @see com.nifty.cloud.sdk.server.NiftyServer#describeInstanceAttribute(DescribeInstanceAttributeRequest)
	 */
	@Override
	public DescribeInstanceAttributeResult describeInstanceAttribute(DescribeInstanceAttributeRequest request) {
		return (DescribeInstanceAttributeResult) client.execute(request, DescribeInstanceAttributeResult.class);
	}

	/*
	 * (non-Javadoc)
	 * @see com.nifty.cloud.sdk.server.NiftyServer#describeInstances(DescribeInstancesRequest)
	 */
	@Override
	public DescribeInstancesResult describeInstances(DescribeInstancesRequest request) {
		return (DescribeInstancesResult) client.execute(request, DescribeInstancesResult.class);
	}

	/*
	 * (non-Javadoc)
	 * @see com.nifty.cloud.sdk.server.NiftyServer#modifyInstanceAttribute(ModifyInstanceAttributeRequest)
	 */
	@Override
	public ModifyInstanceAttributeResult modifyInstanceAttribute(ModifyInstanceAttributeRequest request) {
		return (ModifyInstanceAttributeResult) client.execute(request, ModifyInstanceAttributeResult.class);
	}


	/*
	 * (non-Javadoc)
	 * @see com.nifty.cloud.sdk.server.NiftyServer#rebootInstances(RebootInstancesRequest)
	 */
	@Override
	public RebootInstancesResult rebootInstances(RebootInstancesRequest request) {
		return (RebootInstancesResult) client.execute(request, RebootInstancesResult.class);
	}

	/*
	 * (non-Javadoc)
	 * @see com.nifty.cloud.sdk.server.NiftyServer#runInstances(RunInstancesRequest)
	 */
	@Override
	public RunInstancesResult runInstances(RunInstancesRequest request) {
		return (RunInstancesResult) client.execute(request, RunInstancesResult.class);
	}

	/*
	 * (non-Javadoc)
	 * @see com.nifty.cloud.sdk.server.NiftyServer#startInstances(StartInstancesRequest)
	 */
	@Override
	public StartInstancesResult startInstances(StartInstancesRequest request) {
		return (StartInstancesResult) client.execute(request, StartInstancesResult.class);
	}

	/*
	 * (non-Javadoc)
	 * @see com.nifty.cloud.sdk.server.NiftyServer#stopInstances(StopInstancesRequest)
	 */
	@Override
	public StopInstancesResult stopInstances(StopInstancesRequest request) {
		return (StopInstancesResult) client.execute(request, StopInstancesResult.class);
	}

	/*
	 * (non-Javadoc)
	 * @see com.nifty.cloud.sdk.server.NiftyServer#terminateInstances(TerminateInstancesRequest)
	 */
	@Override
	public TerminateInstancesResult terminateInstances(TerminateInstancesRequest request) {
		return (TerminateInstancesResult) client.execute(request, TerminateInstancesResult.class);
	}

	/*
	 * (non-Javadoc)
	 * @see com.nifty.cloud.sdk.server.NiftyServer#importInstance(ImportInstanceRequest)
	 */
	@Override
	public ImportInstanceResult importInstance(ImportInstanceRequest request) {
		return (ImportInstanceResult) client.execute(request, ImportInstanceResult.class);
	}

	/*
	 * (non-Javadoc)
	 * @see com.nifty.cloud.sdk.server.NiftyServer#getRedhatAgree()
	 */
	@Override
	public String getRedhatAgree() throws IOException {
		ClientConfiguration configuration = client.getConfig();
		String url = configuration.getRedhatAgreeUrl();
		return client.getHttpText(url);
	}

	/*
	 * (non-Javadoc)
	 * @see com.nifty.cloud.sdk.server.NiftyServer#getSplaAgree()
	 */
	@Override
	public String getSplaAgree() throws IOException {
		ClientConfiguration configuration = client.getConfig();
		String url = configuration.getSplaAgreeUrl();
		return client.getHttpText(url);
	}
}
