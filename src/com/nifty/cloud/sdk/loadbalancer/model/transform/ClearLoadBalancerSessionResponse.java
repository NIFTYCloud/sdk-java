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
 *  API Version: 1.15
 *  Date: 2013-06-28 17:00:00
 * 
 */
package com.nifty.cloud.sdk.loadbalancer.model.transform;

import com.nifty.cloud.sdk.Response;
import com.nifty.cloud.sdk.ResponseMetadata;
import com.nifty.cloud.sdk.Result;
import com.nifty.cloud.sdk.loadbalancer.model.ClearLoadBalancerSessionResult;
import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * ClearLoadBalancerSessionResponseクラス。<br />
 * このクラスはClearLoadBalancerSessionのレスポンスを格納します。
 */
@XStreamAlias("ClearLoadBalancerSessionResponse")
public class ClearLoadBalancerSessionResponse implements Response {
	
	/** ClearLoadBalancerSession処理結果 */
	@XStreamAlias("ClearLoadBalancerSessionResult")
	private ClearLoadBalancerSessionResult clearLoadBalancerSessionResult;
	
	/** リクエスト情報 */
	@XStreamAlias("ResponseMetadata")
	ResponseMetadata responseMetadata;

	/**
	 * ClearLoadBalancerSession処理結果を取得します。
	 *
	 * @return ClearLoadBalancerSession処理結果
	 */

	public ClearLoadBalancerSessionResult getClearLoadBalancerSessionResult() {
		return clearLoadBalancerSessionResult;
	}
	
	/**
	 * ClearLoadBalancerSession処理結果を設定します。
	 *
	 * @param clearLoadBalancerSessionResult 処理結果
	 */
	public void setClearLoadBalancerSessionResult(ClearLoadBalancerSessionResult clearLoadBalancerSessionResult) {
		this.clearLoadBalancerSessionResult = clearLoadBalancerSessionResult;
	}

	/**
	 * ClearLoadBalancerSessionResponseのResultクラスを取得します。
	 * 
	 * @see com.nifty.cloud.sdk.Response#getResult()
	 */
	@Override
	public Result getResult() {
		return clearLoadBalancerSessionResult;
	}

}
