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
 *  API Version: 1.9
 *  Date: 2011-11-29 14:07:10
 * 
 */
package com.nifty.cloud.sdk.server.model;

import com.nifty.cloud.sdk.annotation.Query;

/**
 * ゾーン名クラス。<br />
 * このクラスはゾーン名を格納します。
 */
public class InstancePlacement {

	/** ゾーン名 */
	private String	availabilityZone;

	private String groupName;

	/**
	 * ゾーン名を取得します。
	 * 
	 * @return ゾーン名
	 */
	@Query(name="AvailabilityZone")
	public String getAvailabilityZone() {
		return availabilityZone;
	}
	/**
	 * ゾーン名を設定します。
	 * 
	 * @param availabilityZone ゾーン名
	 */
	public void setAvailabilityZone(String availabilityZone) {
		this.availabilityZone = availabilityZone;
	}
	/**
	 * ゾーン名を設定し、自オブジェクトを返します。
	 *
	 * @param availabilityZone ゾーン名
	 * @return 自オブジェクト	 
	 */
	public InstancePlacement withAvailabilityZone(String availabilityZone) {
		setAvailabilityZone(availabilityZone);
		return this;
	}

	/**
	 * groupNameを取得します。
	 * @return groupName
	 */
	public String getGroupName() {
		return groupName;
	}
	/**
	 * groupNameを設定します。
	 * @param groupName groupName
	 */
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}
	/**
	 * groupNameを設定し、自オブジェクトを返します。
	 * @param groupName groupName
	 * @return 自オブジェクト
	 */
	public InstancePlacement withGroupName(String groupName) {
		setGroupName(groupName);
		return this;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("[availabilityZone=");
		builder.append(availabilityZone);
		builder.append(", groupName=");
		builder.append(groupName);
		builder.append("]");
		return builder.toString();
	}	
	
}
