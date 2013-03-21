/******************************************************************************* 
 *  Copyright 2011 NIFTY Corporation All Rights Reserved.
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
 *  API Version: 1.11
 *  Date: 2012-02-20 10:57:31
 * 
 */
package com.nifty.cloud.sdk.misc.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.nifty.cloud.sdk.Request;
import com.nifty.cloud.sdk.annotation.Action;
import com.nifty.cloud.sdk.annotation.Query;

/**
 * DescribeAvailabilityZonesリクエストクラス。<br />
 * このクラスはDescribeAvailabilityZonesへのリクエストを構築します。
 */
@Action("DescribeAvailabilityZones")
public class DescribeAvailabilityZonesRequest implements Request {
	
	/** ゾーン名リスト*/
	private List<String>	zoneNames;

	/**
	 * ゾーン名リストを取得します。
	 * 
	 * @return ゾーン名リスト
	 */
	@Query(name="ZoneName")			
	public List<String> getZoneNames() {
		return zoneNames;
	}
	/**
	 * ゾーン名リストを設定します。
	 * 
	 * @param zoneNames ゾーン名リスト
	 */
	public void setZoneNames(List<String> zoneNames) {
		this.zoneNames = zoneNames;
	}
	/**
	 * ゾーン名の配列を設定し、自オブジェクトを返します。
	 *
	 * @param zoneNames ゾーン名の配列
	 * @return 自オブジェクト
	 */
	public DescribeAvailabilityZonesRequest withZoneNames(String ... zoneNames) {
		if(this.zoneNames == null) this.zoneNames = new ArrayList<String>();
		for(String zoneName: zoneNames) {
			getZoneNames().add(zoneName);
		}
		return this;
	}
	/**
	 * ゾーン名リストを設定し、自オブジェクトを返します。
	 *
	 * @param zoneNames ゾーン名リスト
	 * @return 自オブジェクト
	 */
	public DescribeAvailabilityZonesRequest withZoneNames(Collection<String> zoneNames) {
		if(this.zoneNames == null) this.zoneNames = new ArrayList<String>();
		if(zoneNames != null) {
			getZoneNames().addAll(zoneNames);
		}
		return this;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("[zoneNames=");
		builder.append(zoneNames);
		builder.append("]");
		return builder.toString();
	}

}
