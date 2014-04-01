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
package com.nifty.cloud.sdk.server.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.nifty.cloud.sdk.Result;
import com.nifty.cloud.sdk.server.model.transform.ReservationSetConverter;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamConverter;

/**
 * DescribeInstances結果処理クラス。<br />
 * このクラスはDescribeInstancesのレスポンスを格納します。
 *
 */
@XStreamAlias("DescribeInstancesResponse")
public class DescribeInstancesResult extends Result {
	
	/** リクエスト識別子 */	
	@XStreamAlias("requestId")
	private String requestId;
	
	/** サーバー情報リスト */
	@XStreamAlias("reservationSet")
	@XStreamConverter(ReservationSetConverter.class)	
	private List<Reservation> reservations;
	
	
	/**
	 * リクエスト識別子を取得します。
	 * 
	 * @return リクエスト識別子
	 */
	public String getRequestId() {
		return requestId;
	}
	/**
	 * リクエスト識別子を設定します。
	 * 
	 * @param requestId リクエスト識別子
	 */
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}
	/**
	 * リクエスト識別子を設定し、自オブジェクトを返します。
	 *
	 * @param requestId リクエスト識別子
	 * @return 自オブジェクト	 
	 */
	public DescribeInstancesResult withRequestId(String requestId) {
		setRequestId(requestId);
		return this;
	}	
	
	/**
	 * サーバー情報リストを取得します。
	 * 
	 * @return サーバー情報リスト
	 */
	public List<Reservation> getReservations() {
		return reservations;
	}
	/**
	 * サーバー情報リストを設定します。
	 * 
	 * @param reservations サーバー情報リスト
	 */
	public void setReservations(List<Reservation> reservations) {
		this.reservations = reservations;
	}
	/**
	 * サーバー情報の配列を設定し、自オブジェクトを返します。
	 *
	 * @param reservations サーバー情報の配列
	 * @return 自オブジェクト	 
	 */
	public DescribeInstancesResult withReservations(Reservation ... reservations) {
		if(this.reservations == null) this.reservations = new ArrayList<Reservation>();
		for(Reservation reservation: reservations) {
			getReservations().add(reservation);
		}
		return this;
	}
	/**
	 * サーバー情報リストを設定し、自オブジェクトを返します。
	 *
	 * @param reservations サーバー情報リスト
	 * @return 自オブジェクト	 
	 */
	public DescribeInstancesResult withReservations(Collection<Reservation> reservations) {
		if(this.reservations == null) this.reservations = new ArrayList<Reservation>();
		if (reservations!=null) {
			getReservations().addAll(reservations);
		}
		return this;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("[requestId=");
		builder.append(requestId);
		builder.append(", reservations=");
		builder.append(reservations);
		builder.append("]");
		return builder.toString();
	}

}
