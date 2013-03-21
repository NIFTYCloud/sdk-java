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
package com.nifty.cloud.sdk.misc.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.nifty.cloud.sdk.Result;
import com.nifty.cloud.sdk.misc.model.transform.AvailabilityZoneSetConverter;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamConverter;

/**
 * DescribeAvailabilityZones処理結果クラス。<br />
 * このクラスはDescribeAvailabilityZonesのレスポンスを格納します。
 */
@XStreamAlias("DescribeAvailabilityZonesResponse")
public class DescribeAvailabilityZonesResult extends Result {
	
	/** リクエスト識別子 */
	@XStreamAlias("requestId")
	private String requestId;
	
	/** ゾーン情報リスト */
	@XStreamAlias("availabilityZoneInfo")
	@XStreamConverter(AvailabilityZoneSetConverter.class)
	private List<AvailabilityZone> availabilityZones;
	
	
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
	public DescribeAvailabilityZonesResult withRequestId(String requestId) {
		setRequestId(requestId);
		return this;
	}
	
	/**
	 * ゾーン情報リストを取得します。
	 * 
	 * @return ゾーン情報リスト
	 */
	public List<AvailabilityZone> getAvailabilityZones() {
		return availabilityZones;
	}
	/**
	 * ゾーン情報リストを設定します。
	 * 
	 * @param availabilityZones ゾーン情報リスト
	 */
	public void setAvailabilityZones(List<AvailabilityZone> availabilityZones) {
		this.availabilityZones = availabilityZones;
	}
	/**
	 * ゾーン情報の配列を設定し、自オブジェクトを返します。
	 *
	 * @param availabilityZones ゾーン情報の配列
	 * @return 自オブジェクト
	 */
	public DescribeAvailabilityZonesResult withAvailabilityZones(AvailabilityZone ... availabilityZones) {
		if(this.availabilityZones == null) this.availabilityZones = new ArrayList<AvailabilityZone>();
		for(AvailabilityZone availabilityZone: availabilityZones) {
			getAvailabilityZones().add(availabilityZone);
		}
		return this;
	}
	/**
	 * ゾーン情報リストを設定し、自オブジェクトを返します。
	 *
	 * @param availabilityZones ゾーン情報リスト
	 * @return 自オブジェクト
	 */
	public DescribeAvailabilityZonesResult withAvailabilityZones(Collection<AvailabilityZone> availabilityZones) {
		if(this.availabilityZones == null) this.availabilityZones = new ArrayList<AvailabilityZone>();
		if (availabilityZones != null) {
			getAvailabilityZones().addAll(availabilityZones);
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
		builder.append(", availabilityZones=");
		builder.append(availabilityZones);
		builder.append("]");
		return builder.toString();
	}

}
