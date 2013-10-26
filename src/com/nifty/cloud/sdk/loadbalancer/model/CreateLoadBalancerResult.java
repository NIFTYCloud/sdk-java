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
package com.nifty.cloud.sdk.loadbalancer.model;

import com.nifty.cloud.sdk.Result;
import com.nifty.cloud.sdk.annotation.Xml2Response;
import com.nifty.cloud.sdk.loadbalancer.model.transform.CreateLoadBalancerResponse;
import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * CreateLoadBalancer結果処理クラス。<br />
 * このクラスはCreateLoadBalancerのレスポンスを格納します。
 */
@Xml2Response(response=CreateLoadBalancerResponse.class)
public class CreateLoadBalancerResult extends Result {
	
	/** グローバルIPアドレス */
	@XStreamAlias("DNSName")
	private String	dNSName;

	/**
	 * グローバルIPアドレスを取得します。
	 * 
	 * @return グローバルIPアドレス
	 */
	public String getDNSName() {
		return dNSName;
	}
	/**
	 * グローバルIPアドレスを設定します。
	 * 
	 * @param dNSName グローバルIPアドレス
	 */
	public void setDNSName(String dNSName) {
		this.dNSName = dNSName;
	}
	/**
	 * グローバルIPアドレスを設定し、自オブジェクトを返します。
	 *
	 * @param dNSName グローバルIPアドレス
	 * @return 自オブジェクト
	 */
	public CreateLoadBalancerResult withDNSName(String dNSName) {
		setDNSName(dNSName);
		return this;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("[dNSName=");
		builder.append(dNSName);
		builder.append("]");
		return builder.toString();
	}

}
