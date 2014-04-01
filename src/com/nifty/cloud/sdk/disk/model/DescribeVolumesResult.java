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
package com.nifty.cloud.sdk.disk.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.nifty.cloud.sdk.Result;
import com.nifty.cloud.sdk.disk.model.transform.DescribeVolumesSetConverter;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamConverter;

/**
 * DescribeVolumes処理結果クラス。<br />
 * このクラスはDescribeVolumesのレスポンスを格納します。
 */
@XStreamAlias("DescribeVolumesResponse")
public class DescribeVolumesResult extends Result {
	
	/** リクエスト識別子 */
	@XStreamAlias("requestId")	
	private String requestId;
	
	/** ディスク情報リスト */
	@XStreamAlias("volumeSet")	
	@XStreamConverter(DescribeVolumesSetConverter.class)
	private List<Volume> volumes;
	
	
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
	public DescribeVolumesResult withRequestId(String requestId) {
		setRequestId(requestId);
		return this;
	}
	
	/**
	 * ディスク情報リストを取得します。
	 *
	 * @return ディスク情報リスト
	 */
	public List<Volume> getVolumes() {
		return volumes;
	}
	/**
	 * ディスク情報リストを設定します。
	 * 
	 * @param volumes ディスク情報リスト
	 */
	public void setVolumes(List<Volume> volumes) {
		this.volumes = volumes;
	}

	/**
	 * ディスク情報の配列を設定し、自オブジェクトを返します。
	 * 
	 * @param volumes ディスク情報の配列
	 * @return 自オブジェクト
	 */
    public DescribeVolumesResult withVolumes(Volume... volumes) {
    	if(this.volumes == null) this.volumes = new ArrayList<Volume>();
        for (Volume volume : volumes) {
            getVolumes().add(volume);
        }
        return this;
    }
	/**
	 * ディスク情報リストを設定し、自オブジェクトを返します。
	 * 
	 * @param volumes ディスク情報リスト
	 * @return 自オブジェクト
	 */
    public DescribeVolumesResult withVolumes(Collection<Volume> volumes) {
    	if(this.volumes == null) this.volumes = new ArrayList<Volume>();
        if (volumes != null) {
        	getVolumes().addAll(volumes);
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
		builder.append(", volumes=");
		builder.append(volumes);
		builder.append("]");
		return builder.toString();
	}
    
}
