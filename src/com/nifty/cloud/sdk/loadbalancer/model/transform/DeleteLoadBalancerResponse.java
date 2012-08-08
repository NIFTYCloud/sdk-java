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
package com.nifty.cloud.sdk.loadbalancer.model.transform;

import com.nifty.cloud.sdk.Response;
import com.nifty.cloud.sdk.ResponseMetadata;
import com.nifty.cloud.sdk.Result;
import com.nifty.cloud.sdk.loadbalancer.model.DeleteLoadBalancerResult;
import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * DeleteLoadBalancerResponseクラス。<br />
 * このクラスはDeleteLoadBalancerのレスポンスを格納します。
 */
@XStreamAlias("DeleteLoadBalancerResponse")
public class DeleteLoadBalancerResponse implements Response {
	
	/** DeleteLoadBalancer処理結果 */
	@XStreamAlias("DeleteLoadBalancerResult")
	private DeleteLoadBalancerResult deleteLoadBalancerResult;
	
	/** リクエスト情報 */
	@XStreamAlias("ResponseMetadata")
	ResponseMetadata responseMetadata;

	/**
	 * DeleteLoadBalancer処理結果を取得します。
	 *
	 * @return DeleteLoadBalancer処理結果
	 */

	public DeleteLoadBalancerResult getDeleteLoadBalancerResult() {
		return deleteLoadBalancerResult;
	}
	
	/**
	 * DeleteLoadBalancer処理結果を設定します。
	 *
	 * @param deleteLoadBalancerResult 処理結果
	 */
	public void setDeleteLoadBalancerResult(DeleteLoadBalancerResult deleteLoadBalancerResult) {
		this.deleteLoadBalancerResult = deleteLoadBalancerResult;
	}

	/**
	 * DeleteLoadBalancerResponseのResultクラスを取得します。
	 * 
	 * @see com.nifty.cloud.sdk.Response#getResult()
	 */
	@Override
	public Result getResult() {
		return deleteLoadBalancerResult;
	}

}
