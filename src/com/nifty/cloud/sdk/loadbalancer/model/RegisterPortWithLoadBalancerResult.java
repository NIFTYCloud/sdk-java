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
package com.nifty.cloud.sdk.loadbalancer.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.nifty.cloud.sdk.Result;
import com.nifty.cloud.sdk.annotation.Xml2Response;
import com.nifty.cloud.sdk.loadbalancer.model.transform.ListenersConverter;
import com.nifty.cloud.sdk.loadbalancer.model.transform.RegisterPortWithLoadBalancerResponse;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamConverter;

/**
 * RegisterPortWithLoadBalancer結果処理クラス。<br />
 * このクラスはRegisterPortWithLoadBalancerのレスポンスを格納します。
 */
@Xml2Response(response=RegisterPortWithLoadBalancerResponse.class)
public class RegisterPortWithLoadBalancerResult extends Result {
	
	/** ポート情報リスト */
	@XStreamAlias("Listeners")
	@XStreamConverter(ListenersConverter.class)	
	private List<Listener> Listeners;
	
	
	/**
	 * ポート情報リストを取得します。
	 * 
	 * @return ポート情報リスト
	 */
	public List<Listener> getListeners() {
		return Listeners;
	}
	/**
	 * ポート情報リストを設定します。
	 * 
	 * @param listeners ポート情報リスト
	 */
	public void setListeners(List<Listener> listeners) {
		Listeners = listeners;
	}
	/**
	 * ポート情報の配列を設定し、自オブジェクトを返します。
	 *
	 * @param listeners ポート情報の配列
	 * @return 自オブジェクト
	 */
	public RegisterPortWithLoadBalancerResult withListeners(Listener ... listeners) {
		if(this.Listeners == null) this.Listeners = new ArrayList<Listener>();
		for (Listener listener: listeners) {
			getListeners().add(listener);
		}
		return this;
	}
	/**
	 * ポート情報リストを設定し、自オブジェクトを返します。
	 *
	 * @param listeners ポート情報リスト
	 * @return 自オブジェクト
	 */
	public RegisterPortWithLoadBalancerResult withListeners(Collection<Listener> listeners) {
		if(this.Listeners == null) this.Listeners = new ArrayList<Listener>();
		if (listeners != null) {
			getListeners().addAll(listeners);
		}
		return this;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("[Listeners=");
		builder.append(Listeners);
		builder.append("]");
		return builder.toString();
	}

}
