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
package com.nifty.cloud.sdk.loadbalancer.model.transform;

import com.nifty.cloud.sdk.Response;
import com.nifty.cloud.sdk.ResponseMetadata;
import com.nifty.cloud.sdk.Result;
import com.nifty.cloud.sdk.loadbalancer.model.DeregisterInstancesFromLoadBalancerResult;
import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * DeregisterInstancesFromLoadBalancerResponseクラス。<br />
 * このクラスはDeregisterInstancesFromLoadBalancerのレスポンスを格納します。
 */
@XStreamAlias("DeregisterInstancesFromLoadBalancerResponse")
public class DeregisterInstancesFromLoadBalancerResponse implements Response {
	
	/** DeregisterInstancesFromLoadBalancer処理結果の情報セット　*/
	@XStreamAlias("DeregisterInstancesFromLoadBalancerResult")
	private DeregisterInstancesFromLoadBalancerResult deregisterInstancesFromLoadBalancerResult;
	
	/** リクエスト情報 */
	@XStreamAlias("ResponseMetadata")
	ResponseMetadata responseMetadata;


	/**
	 * DeregisterInstancesFromLoadBalancer処理結果の情報セットを取得します。
	 *
	 * @return DeregisterInstancesFromLoadBalancer処理結果の情報セット
	 */
	public DeregisterInstancesFromLoadBalancerResult getDeregisterInstancesFromLoadBalancerResult() {
		return deregisterInstancesFromLoadBalancerResult;
	}

	/**
	 * DeregisterInstancesFromLoadBalancer処理結果の情報セットを設定します。
	 *
	 * @param deregisterInstancesFromLoadBalancerResult 処理結果の情報セット
	 */
	public void setDeregisterInstancesFromLoadBalancerResult(DeregisterInstancesFromLoadBalancerResult deregisterInstancesFromLoadBalancerResult) {
		this.deregisterInstancesFromLoadBalancerResult = deregisterInstancesFromLoadBalancerResult;
	}

	/**
	 * DeregisterInstancesFromLoadBalancerResponseのResultクラスを取得します。
	 * 
	 * @see com.nifty.cloud.sdk.Response#getResult()
	 */
	@Override
	public Result getResult() {
		return deregisterInstancesFromLoadBalancerResult;
	}

	
}
