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

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * サーバー情報クラス。<br />
 * このクラスはサーバー情報を格納します。
 */
public class Reservation {

	private String reservationId;
	
	private String ownerId;
	
	/** セッションID */
	private String requesterId;
	
	/** ファイアウォールグループ名リスト */
	private List<String> groupIds;
	
	/** サーバー情報リスト */
	private List<Instance> instances;

	
	/**
	 * reservationIdを取得します。
	 * 
	 * @return reservationId
	 */
	public String getReservationId() {
		return reservationId;
	}
	/**
	 * reservationIdを設定します。
	 * 
	 * @param reservationId
	 */
	public void setReservationId(String reservationId) {
		this.reservationId = reservationId;
	}
	/**
	 * reservationIdを設定し、自オブジェクトを返します。
	 *
	 * @param reservationId
	 * @return 自オブジェクト	 
	 */
	public Reservation withReservationId(String reservationId) {
		setReservationId(reservationId);
		return this;
	}
	
	/**
	 * ownerIdを取得します。
	 * 
	 * @return ownerId
	 */
	public String getOwnerId() {
		return ownerId;
	}
	/**
	 * ownerIdを設定します。
	 * 
	 * @param ownerId
	 */
	public void setOwnerId(String ownerId) {
		this.ownerId = ownerId;
	}
	/**
	 * ownerIdを設定し、自オブジェクトを返します。
	 *
	 * @param ownerId
	 * @return 自オブジェクト	 
	 */
	public Reservation withOwnerId(String ownerId) {
		setOwnerId(ownerId);
		return this;
	}
	
	/**
	 * セッションIDを取得します。
	 * 
	 * @return セッションID
	 */
	public String getRequesterId() {
		return requesterId;
	}
	/**
	 * セッションIDを設定します。
	 * 
	 * @param requesterId セッションID
	 */
	public void setRequesterId(String requesterId) {
		this.requesterId = requesterId;
	}
	/**
	 * セッションIDを設定し、自オブジェクトを返します。
	 *
	 * @param requesterId セッションID
	 * @return 自オブジェクト	 
	 */
	public Reservation withRequesterId(String requesterId) {
		setRequesterId(requesterId);
		return this;
	}

	/**
	 * ファイアウォールグループ名リストを取得します。
	 * 
	 * @return ファイアウォールグループ名リスト
	 */
	public List<String> getGroupIds() {
		return groupIds;
	}
	/**
	 * ファイアウォールグループ名リストを設定します。
	 * 
	 * @param groupIds ファイアウォールグループ名リスト
	 */
	public void setGroupIds(List<String> groupIds) {
		this.groupIds = groupIds;
	}
	/**
	 * ファイアウォールグループ名の配列を設定し、自オブジェクトを返します。
	 *
	 * @param groupIds ファイアウォールグループ名の配列
	 * @return 自オブジェクト	 
	 */
	public Reservation withGroupIds(String ... groupIds) {
		if(this.groupIds == null) this.groupIds = new ArrayList<String>();
		for(String groupId: groupIds) {
			getGroupIds().add(groupId);
		}
		return this;
	}
	/**
	 * ファイアウォールグループ名リストを設定し、自オブジェクトを返します。
	 *
	 * @param groupIds ファイアウォールグループ名リスト
	 * @return 自オブジェクト	 
	 */
	public Reservation withGroupIds(Collection<String> groupIds) {
		if(this.groupIds == null) this.groupIds = new ArrayList<String>();
		if (groupIds!=null) {
			getGroupIds().addAll(groupIds);
		}
		return this;
	}
	
	/**
	 * サーバー情報リストを取得します。
	 * 
	 * @return サーバー情報リスト
	 */
	public List<Instance> getInstances() {
		return instances;
	}
	/**
	 * サーバー情報リストを設定します。
	 * 
	 * @param instances サーバー情報リスト
	 */
	public void setInstances(List<Instance> instances) {
		this.instances = instances;
	}
	/**
	 * サーバー情報の配列を設定し、自オブジェクトを返します。
	 *
	 * @param instances サーバー情報の配列
	 * @return 自オブジェクト	 
	 */
	public Reservation withInstances(Instance ... instances) {
		if(this.instances == null) this.instances = new ArrayList<Instance>();
		for (Instance instance: instances) {
			getInstances().add(instance);
		}
		return this;
	}
	/**
	 * サーバー情報リストを設定し、自オブジェクトを返します。
	 *
	 * @param instances サーバー情報リスト
	 * @return 自オブジェクト	 
	 */
	public Reservation withInstances(Collection<Instance> instances) {
		if(this.instances == null) this.instances = new ArrayList<Instance>();
		if (instances!=null) {
			getInstances().addAll(instances);
		}
		return this;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("[reservationId=");
		builder.append(reservationId);
		builder.append(", ownerId=");
		builder.append(ownerId);
		builder.append(", requesterId=");
		builder.append(requesterId);
		builder.append(", groupIds=");
		builder.append(groupIds);
		builder.append(", instances=");
		builder.append(instances);
		builder.append("]");
		return builder.toString();
	}
	
}
