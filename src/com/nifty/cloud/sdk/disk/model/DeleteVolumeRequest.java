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
package com.nifty.cloud.sdk.disk.model;

import com.nifty.cloud.sdk.Request;
import com.nifty.cloud.sdk.annotation.Action;
import com.nifty.cloud.sdk.annotation.Query;

/**
 * DeleteVolumeリクエストクラス。<br />
 * このクラスはDeleteVolumeへのリクエストを構築します。
 */
@Action("DeleteVolume")
public class DeleteVolumeRequest implements Request {

	/** ディスク名 */
	private String volumeId;

	/**
	 * デフォルトコンストラクタ。
	 */
	public DeleteVolumeRequest() {
	}
	
	/**
	 * ディスク名を指定し、DeleteVolumeRequestを構築します。
	 * 
	 * @param volumeId ディスク名
	 */
	public DeleteVolumeRequest(String volumeId) {
		this.volumeId = volumeId;
	}
	
	
	/**
	 * ディスク名を取得します。
	 * 
	 * @return ディスク名
	 */
	@Query(name="VolumeId", require=true)			
	public String getVolumeId() {
		return volumeId;
	}
	/**
	 * ディスク名を設定します。
	 * 
	 * @param volumeId ディスク名
	 */
	public void setVolumeId(String volumeId) {
		this.volumeId = volumeId;
	}
	/**
	 * ディスク名を設定し、自オブジェクトを返します。
	 * 
	 * @param volumeId ディスク名
	 * @return 自オブジェクト
	 */
	public DeleteVolumeRequest withVolumeId(String volumeId) {
		setVolumeId(volumeId);
		return this;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("[volumeId=");
		builder.append(volumeId);
		builder.append("]");
		return builder.toString();
	}
	
}
