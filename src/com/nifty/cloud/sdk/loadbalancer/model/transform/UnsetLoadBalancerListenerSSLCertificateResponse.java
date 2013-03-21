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
import com.nifty.cloud.sdk.loadbalancer.model.UnsetLoadBalancerListenerSSLCertificateResult;
import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * UnsetLoadBalancerListenerSSLCertificateResponseクラス。<br />
 * このクラスはUnsetLoadBalancerListenerSSLCertificateのレスポンスを格納します。
 */
@XStreamAlias("UnsetLoadBalancerListenerSSLCertificateResponse")
public class UnsetLoadBalancerListenerSSLCertificateResponse implements Response {
	
	/** UnsetLoadBalancerListenerSSLCertificate処理結果 */
	@XStreamAlias("UnsetLoadBalancerListenerSSLCertificateResult")
	private UnsetLoadBalancerListenerSSLCertificateResult unsetLoadBalancerListenerSSLCertificateResult;
	
	/** リクエスト情報 */
	@XStreamAlias("ResponseMetadata")
	ResponseMetadata responseMetadata;

	/**
	 * UnsetLoadBalancerListenerSSLCertificate処理結果を取得します。
	 *
	 * @return UnsetLoadBalancerListenerSSLCertificate処理結果
	 */
	public UnsetLoadBalancerListenerSSLCertificateResult getUnsetLoadBalancerListenerSSLCertificateResult() {
		return unsetLoadBalancerListenerSSLCertificateResult;
	}
	
	/**
	 * UnsetLoadBalancerListenerSSLCertificate処理結果を設定します。
	 *
	 * @param unsetLoadBalancerListenerSSLCertificateResult 処理結果
	 */
	public void setUnsetLoadBalancerListenerSSLCertificateResult(UnsetLoadBalancerListenerSSLCertificateResult unsetLoadBalancerListenerSSLCertificateResult) {
		this.unsetLoadBalancerListenerSSLCertificateResult = unsetLoadBalancerListenerSSLCertificateResult;
	}

	/**
	 * UnsetLoadBalancerListenerSSLCertificateResponseのResultクラスを取得します。
	 * 
	 * @see com.nifty.cloud.sdk.Response#getResult()
	 */
	@Override
	public Result getResult() {
		return unsetLoadBalancerListenerSSLCertificateResult;
	}

}
