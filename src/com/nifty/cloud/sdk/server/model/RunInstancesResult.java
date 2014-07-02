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
 *  API Version: 1.18
 *  Date: 2014-05-23 17:00:00
 * 
 */
package com.nifty.cloud.sdk.server.model;

import com.nifty.cloud.sdk.Result;
import com.nifty.cloud.sdk.server.model.transform.RunInstancesResultConverter;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamConverter;

/**
 * RunInstances結果処理クラス。<br />
 * このクラスはRunInstancesのレスポンスを格納します。
 */
@XStreamAlias("RunInstancesResponse")
@XStreamConverter(RunInstancesResultConverter.class)
public class RunInstancesResult extends Result {
	
	
	/** 作成に成功したサーバーの情報   */
	private Reservation	reservation;
	
	/**
	 * 作成に成功したサーバーの情報を取得します。
	 * 
	 * @return 作成に成功したサーバーの情報
	 */
	public Reservation getReservation() {
		return reservation;
	}
	/**
	 * 作成に成功したサーバーの情報を設定します。
	 * 
	 * @param reservation 作成に成功したサーバーの情報
	 */
	public void setReservation(Reservation reservation) {
		this.reservation = reservation;
	}
	/**
	 * 作成に成功したサーバーの情報を設定し、自オブジェクトを返します。
	 *
	 * @param  reservation 作成に成功したサーバーの情報
	 * @return 自オブジェクト	 
	 */
	public RunInstancesResult withReservation(Reservation reservation) {
		setReservation(reservation);
		return this;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("[reservation=");
		builder.append(reservation);
		builder.append("]");
		return builder.toString();
	}
	
}
