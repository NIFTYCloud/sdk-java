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
 *  API Version: 1.17
 *  Date: 2014-02-20 17:00:00
 * 
 */
package com.nifty.cloud.sdk.loadbalancer.model.transform;

import com.nifty.cloud.sdk.Response;
import com.nifty.cloud.sdk.ResponseMetadata;
import com.nifty.cloud.sdk.Result;
import com.nifty.cloud.sdk.loadbalancer.model.RegisterInstancesWithLoadBalancerResult;
import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * RegisterInstancesWithLoadBalancerResponseクラス。<br />
 * このクラスはRegisterInstancesWithLoadBalancerのレスポンスを格納します。
 */
@XStreamAlias("RegisterInstancesWithLoadBalancerResponse")
public class RegisterInstancesWithLoadBalancerResponse implements Response {
	
	/** RegisterInstancesWithLoadBalancer処理結果の情報セット */
	@XStreamAlias("RegisterInstancesWithLoadBalancerResult")
	private RegisterInstancesWithLoadBalancerResult registerInstancesWithLoadBalancerResult;

	/** リクエスト情報 */
	@XStreamAlias("ResponseMetadata")
	ResponseMetadata responseMetadata;


	/**
	 * RegisterInstancesWithLoadBalancer処理結果の情報セットを取得します。
	 *
	 * @return RegisterInstancesWithLoadBalancer処理結果の情報セット 
	 */
	public RegisterInstancesWithLoadBalancerResult getRegisterInstancesWithLoadBalancerResult() {
		return registerInstancesWithLoadBalancerResult;
	}
	/**
	 * RegisterInstancesWithLoadBalancer処理結果の情報セットを設定します。
	 *
	 * @param registerInstancesWithLoadBalancerResult 処理結果の情報セット 
	 */
	public void setRegisterInstancesWithLoadBalancerResult(RegisterInstancesWithLoadBalancerResult registerInstancesWithLoadBalancerResult) {
		this.registerInstancesWithLoadBalancerResult = registerInstancesWithLoadBalancerResult;
	}

	/**
	 * RegisterInstancesWithLoadBalancerResponseのResultクラスを取得します。
	 * 
	 * @see com.nifty.cloud.sdk.Response#getResult()
	 */
	@Override
	public Result getResult() {
		return registerInstancesWithLoadBalancerResult;
	}

}
