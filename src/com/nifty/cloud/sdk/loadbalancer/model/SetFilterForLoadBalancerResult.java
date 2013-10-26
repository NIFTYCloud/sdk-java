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
import com.nifty.cloud.sdk.loadbalancer.model.transform.FilterConverter;
import com.nifty.cloud.sdk.loadbalancer.model.transform.SetFilterForLoadBalancerResponse;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamConverter;

/**
 * SetFilterForLoadBalancerリクエストクラス。<br />
 * このクラスはSetFilterForLoadBalancerのレスポンスを格納します。
 */
@Xml2Response(response=SetFilterForLoadBalancerResponse.class)
public class SetFilterForLoadBalancerResult extends Result {

	/** フィルター情報 */
	@XStreamAlias("Filter")
	@XStreamConverter(FilterConverter.class)		
	private Filter filter;
	
	/**
	 * フィルター情報を取得します。
	 * 
	 * @return フィルター情報
	 */
	public Filter getFilter() {
		return filter;
	}
	/**
	 * フィルター情報を設定します。
	 * 
	 * @param filter フィルター情報
	 */
	public void setFilter(Filter filter) {
		this.filter = filter;
	}
	/**
	 * フィルター情報を設定し、自オブジェクトを返します。
	 *
	 * @param filter フィルター情報
	 * @return 自オブジェクト
	 */
	public SetFilterForLoadBalancerResult withFilter(Filter filter) { 
		setFilter(filter);
		return this;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("[filter=");
		builder.append(filter);
		builder.append("]");
		return builder.toString();
	}

	
}
