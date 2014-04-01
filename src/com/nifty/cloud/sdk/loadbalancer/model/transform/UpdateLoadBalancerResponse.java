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
import com.nifty.cloud.sdk.loadbalancer.model.UpdateLoadBalancerResult;
import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * UpdateLoadBalancerResponseクラス。<br />
 * このクラスはUpdateLoadBalancerのレスポンスを格納します。
 */
@XStreamAlias("UpdateLoadBalancerResponse")
public class UpdateLoadBalancerResponse implements Response {
	
	/** UpdateLoadBalancerResponse 結果セット */
	@XStreamAlias("UpdateLoadBalancerResult")
	private UpdateLoadBalancerResult updateLoadBalancerResult;

	/** リクエスト情報 */
	@XStreamAlias("ResponseMetadata")
	ResponseMetadata responseMetadata;

	/**
	 * UpdateLoadBalancerResponse 結果セットを取得します。
	 *
	 * @return UpdateLoadBalancerResponse 結果セット
	 */
	public ResponseMetadata getResponseMetadata() {
		return responseMetadata;
	}
	/**
	 * UpdateLoadBalancerResponse 結果セットを設定します。
	 *
	 * @param responseMetadata 結果セット
	 */
	public void setResponseMetadata(ResponseMetadata responseMetadata) {
		this.responseMetadata = responseMetadata;
	}

	/**
	 * UpdateLoadBalancerResponseのResultクラスを取得します。
	 * 
	 * @see com.nifty.cloud.sdk.Response#getResult()
	 */
	@Override
	public Result getResult() {
		return updateLoadBalancerResult;
	}

}
