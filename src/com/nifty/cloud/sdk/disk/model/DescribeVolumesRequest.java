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

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.nifty.cloud.sdk.Request;
import com.nifty.cloud.sdk.annotation.Action;
import com.nifty.cloud.sdk.annotation.Query;

/**
 * DescribeVolumesリクエストクラス。<br />
 * このクラスはDescribeVolumesへのリクエストを構築します。
 */
@Action("DescribeVolumes")
public class DescribeVolumesRequest implements Request {
	
	/** ディスク名リスト */
	private List<String> volumeIds;

	/**
	 * デフォルトコンストラクタ。
	 */
	public DescribeVolumesRequest() {
	}
	
	/**
	 * ディスク名リストを指定し、DescribeVolumesRequestを構築します。
	 * 
	 * @param volumeIds ディスク名リスト
	 *
	 */
	public DescribeVolumesRequest(List<String> volumeIds) {
		this.volumeIds = volumeIds;
	}
	
	/**
	 * ディスク名リストを取得します。
	 * 
	 * @return ディスク名リスト
	 */
	@Query(name="VolumeId")			
	public List<String> getVolumeIds() {
		return volumeIds;
	}
	/**
	 * ディスク名リストを設定します。
	 * 
	 * @param volumeIds ディスク名リスト
	 */
	public void setVolumeIds(List<String> volumeIds) {
		this.volumeIds = volumeIds;
	}
	/**
	 * ディスク名の配列を設定し、自オブジェクトを返します。
	 * 
	 * @param volumeIds ディスク名の配列
	 * @return 自オブジェクト
	 */
    public DescribeVolumesRequest withVolumeIds(String... volumeIds) {
    	if(this.volumeIds == null) this.volumeIds = new ArrayList<String>();
        for (String value : volumeIds) {
            getVolumeIds().add(value);
        }
        return this;
    }
	/**
	 * ディスク名リストを設定し、自オブジェクトを返します。
	 * 
	 * @param volumeIds ディスク名リスト
	 * @return 自オブジェクト
	 */
    public DescribeVolumesRequest withVolumeIds(Collection<String> volumeIds) {
    	if(this.volumeIds == null) this.volumeIds = new ArrayList<String>();
        if (volumeIds != null) {
        	getVolumeIds().addAll(volumeIds);
        }
        return this;
    }

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("[volumeIds=");
		builder.append(volumeIds);
		builder.append("]");
		return builder.toString();
	}

}
