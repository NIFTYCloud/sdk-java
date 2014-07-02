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
package com.nifty.cloud.sdk.misc.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.nifty.cloud.sdk.Result;
import com.nifty.cloud.sdk.misc.model.transform.RegionSetConverter;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamConverter;

/**
 * DescribeRegions処理結果クラス。<br />
 * このクラスはDescribeRegionsのレスポンスを格納します。
 */
@XStreamAlias("DescribeRegionsResponse")
public class DescribeRegionsResult extends Result {

	/** リクエスト識別子 */
	@XStreamAlias("requestId")
	private String requestId;

	/** リージョン情報リスト */
	@XStreamAlias("regionInfo")
	@XStreamConverter(RegionSetConverter.class)
	private List<Region> regions;

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
	public DescribeRegionsResult withRequestId(String requestId) {
		setRequestId(requestId);
		return this;
	}

	/**
	 * リージョン情報リストを取得します。
	 * @return リージョン情報リスト
	 */
	public List<Region> getRegions() {
		return regions;
	}
	/**
	 * リージョン情報リストを設定します。
	 * @param regions リージョン情報リスト
	 */
	public void setRegions(List<Region> regions) {
		this.regions = regions;
	}
	/**
	 * リージョン情報の配列を設定し、自オブジェクトを返します。
	 * @param regions リージョン情報の配列
	 * @return 自オブジェクト
	 */
	public DescribeRegionsResult withRegions(Region... regions) {
		if (this.regions == null) this.regions = new ArrayList<Region>();
		for(Region region : regions){
			getRegions().add(region);
		}
		return this;
	}
	/**
	 * リージョン情報リストを設定し、自オブジェクトを返します。
	 * @param regions リージョン情報リスト
	 * @return 自オブジェクト
	 */
	public DescribeRegionsResult withRegions(Collection<Region> regions) {
		if (this.regions == null) this.regions = new ArrayList<Region>();
		if(regions != null){
			getRegions().addAll(regions);
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
		builder.append(", regions=");
		builder.append(regions);
		builder.append("]");
		return builder.toString();
	}

}
