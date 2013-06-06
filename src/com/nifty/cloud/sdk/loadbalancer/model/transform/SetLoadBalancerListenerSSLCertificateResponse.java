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
package com.nifty.cloud.sdk.loadbalancer.model.transform;

import com.nifty.cloud.sdk.Response;
import com.nifty.cloud.sdk.ResponseMetadata;
import com.nifty.cloud.sdk.Result;
import com.nifty.cloud.sdk.loadbalancer.model.SetLoadBalancerListenerSSLCertificateResult;
import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * SetLoadBalancerListenerSSLCertificateResponseクラス。<br />
 * このクラスはSetLoadBalancerListenerSSLCertificateのレスポンスを格納します。
 */
@XStreamAlias("SetLoadBalancerListenerSSLCertificateResponse")
public class SetLoadBalancerListenerSSLCertificateResponse implements Response {
	
	/** SetLoadBalancerListenerSSLCertificate処理結果 */
	@XStreamAlias("SetLoadBalancerListenerSSLCertificateResult")
	private SetLoadBalancerListenerSSLCertificateResult setLoadBalancerListenerSSLCertificateResult;
	
	/** リクエスト情報 */
	@XStreamAlias("ResponseMetadata")
	ResponseMetadata responseMetadata;

	/**
	 * SetLoadBalancerListenerSSLCertificate処理結果を取得します。
	 *
	 * @return SetLoadBalancerListenerSSLCertificate処理結果
	 */
	public SetLoadBalancerListenerSSLCertificateResult getSetLoadBalancerListenerSSLCertificateResult() {
		return setLoadBalancerListenerSSLCertificateResult;
	}
	
	/**
	 * SetLoadBalancerListenerSSLCertificate処理結果を設定します。
	 *
	 * @param setLoadBalancerListenerSSLCertificateResult 処理結果
	 */
	public void setSetLoadBalancerListenerSSLCertificateResult(SetLoadBalancerListenerSSLCertificateResult setLoadBalancerListenerSSLCertificateResult) {
		this.setLoadBalancerListenerSSLCertificateResult = setLoadBalancerListenerSSLCertificateResult;
	}

	/**
	 * SetLoadBalancerListenerSSLCertificateResponseのResultクラスを取得します。
	 * 
	 * @see com.nifty.cloud.sdk.Response#getResult()
	 */
	@Override
	public Result getResult() {
		return setLoadBalancerListenerSSLCertificateResult;
	}

}
