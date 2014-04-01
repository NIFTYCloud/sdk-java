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
package com.nifty.cloud.sdk.loadbalancer.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * ロードバランサーのポート設定情報クラス。<br />
 * このクラスはロードバランサーの設定情報を格納します。
 */
public class ListenerDescription {
	
	/** ロードバランサーのポート設定情報 */
	private Listener listener;
	
	private List<String> policyNames;
	
	/**
	 * ロードバランサーのポート設定情報を取得します。
	 * 
	 * @return ロードバランサーのポート設定情報
	 */
	public Listener getListener() {
		return listener;
	}
	/**
	 * ロードバランサーのポート設定情報を設定します。
	 * 
	 * @param listener ロードバランサーのポート設定情報
	 */
	public void setListener(Listener listener) {
		this.listener = listener;
	}
	/**
	 * ロードバランサーのポート設定情報を設定し、自オブジェクトを返します。
	 *
	 * @param listener ロードバランサーのポート設定情報
	 * @return 自オブジェクト	 
	 */
	public ListenerDescription withListener(Listener listener) {
		setListener(listener);
		return this;
	}
	
	/**
	 * policyNamesを取得します。
	 * 
	 * @return policyNames
	 */
	public List<String> getPolicyNames() {
		return policyNames;
	}
	/**
	 * policyNamesを設定します。
	 * 
	 * @param policyNames
	 */
	public void setPolicyNames(List<String> policyNames) {
		this.policyNames = policyNames;
	}
	/**
	 * policyNamesの配列を設定し、自オブジェクトを返します。
	 *
	 * @param policyNames
	 * @return 自オブジェクト
	 */
	public ListenerDescription withPolicyNames(String ... policyNames) {
		if(this.policyNames == null) this.policyNames = new ArrayList<String>();
		for (String policyName: policyNames) {
			getPolicyNames().add(policyName);
		}
		return this;
	}
	/**
	 * policyNamesを設定し、自オブジェクトを返します。
	 *
	 * @param policyNames
	 * @return 自オブジェクト
	 */
	public ListenerDescription withPolicyNames(Collection<String> policyNames) {
		if(this.policyNames == null) this.policyNames = new ArrayList<String>();
		if (policyNames!=null) {
			getPolicyNames().addAll(policyNames);
		}
		return this;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("[listener=");
		builder.append(listener);
		builder.append(", policyNames=");
		builder.append(policyNames);
		builder.append("]");
		return builder.toString();
	}
	
}
