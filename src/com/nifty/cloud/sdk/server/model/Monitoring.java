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
package com.nifty.cloud.sdk.server.model;

/**
 * 監視情報クラス。<br />
 * このクラスは監視情報を格納します。
 */
public class Monitoring {
	
	/** 監視ステータス */
	private String	state;

	/**
	 * 監視ステータスを取得します。
	 * 
	 * @return 監視ステータス
	 */
	public String getState() {
		return state;
	}
	/**
	 * 監視ステータスを設定します。
	 * 
	 * @param state 監視ステータス
	 */
	public void setState(String state) {
		this.state = state;
	}
	/**
	 * 監視ステータスを設定し、自オブジェクトを返します。
	 *
	 * @param state 監視ステータス
	 * @return 自オブジェクト	 
	 */
	public Monitoring withState(String state) {
		setState(state);
		return this;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("[state=");
		builder.append(state);
		builder.append("]");
		return builder.toString();
	}
}
