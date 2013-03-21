/******************************************************************************* 
 *  Copyright 2012 NIFTY Corporation All Rights Reserved.
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
 *  API Version: 1.12
 *  Date: 2012-12-21 17:00:00
 * 
 */
package com.nifty.cloud.sdk.loadbalancer.model.transform;

import com.nifty.cloud.sdk.Response;
import com.nifty.cloud.sdk.ResponseMetadata;
import com.nifty.cloud.sdk.Result;
import com.nifty.cloud.sdk.loadbalancer.model.SetFilterForLoadBalancerResult;
import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * SetFilterForLoadBalancerResponseクラス。<br />
 * このクラスはSetFilterForLoadBalancerのレスポンスを格納します。
 */
@XStreamAlias("SetFilterForLoadBalancerResponse")
public class SetFilterForLoadBalancerResponse implements Response {
	
	/** SetFilterForLoadBalancer処理結果の情報セット */
	@XStreamAlias("SetFilterForLoadBalancerResult")
	private SetFilterForLoadBalancerResult setFilterForLoadBalancerResult;

	/** リクエスト情報 */
	@XStreamAlias("ResponseMetadata")
	ResponseMetadata responseMetadata;


	/**
	 * SetFilterForLoadBalancer処理結果の情報セットを取得します。
	 *
	 * @return SetFilterForLoadBalancer処理結果の情報セット
	 */
	public ResponseMetadata getResponseMetadata() {
		return responseMetadata;
	}
	/**
	 * SetFilterForLoadBalancer処理結果の情報セットを設定します。
	 *
	 * @param responseMetadata 処理結果の情報セット
	 */
	public void setResponseMetadata(ResponseMetadata responseMetadata) {
		this.responseMetadata = responseMetadata;
	}

	/**
	 * SetFilterForLoadBalancerResponseのResultクラスを取得します。
	 * 
	 * @see com.nifty.cloud.sdk.Response#getResult()
	 */
	@Override
	public Result getResult() {
		return setFilterForLoadBalancerResult;
	}

}
