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

import com.nifty.cloud.sdk.Request;
import com.nifty.cloud.sdk.annotation.Action;
import com.nifty.cloud.sdk.annotation.Query;

/**
 * DescribeRegionsリクエストクラス。<br />
 * このクラスはDescribeRegionsへのリクエストを構築します。
 */
@Action("DescribeRegions")
public class DescribeRegionsRequest implements Request{
	/** リージョン名リスト */
	private List<String> regionNames;
	
	private List<Filter> filters;

	/**
	 * リージョン名リストを取得します。
	 * @return リージョン名リスト
	 */
	@Query(name="RegionName")	
	public List<String> getRegionNames() {
		return regionNames;
	}
	/**
	 * リージョン名リストを設定します。
	 * @param regionName リージョン名リスト
	 */
	public void setRegionNames(List<String> regionName) {
		this.regionNames = regionName;
	}
	/**
	 * リージョン名の配列を設定し、自オブジェクトを返します。
	 * @param regionNames リージョン名の配列
	 * @return 自オブジェクト
	 */
	public DescribeRegionsRequest withRegionNames(String ...  regionNames) {
		if(this.regionNames == null) this.regionNames = new ArrayList<String>();
		for(String regionName: regionNames) {
			getRegionNames().add(regionName);
		}
		return this;
	}
	/**
	 * リージョン名リストを設定し、自オブジェクトを返します。
	 * @param regionNames リージョン名リスト
	 * @return 自オブジェクト
	 */
	public DescribeRegionsRequest withRegionNames(Collection<String> regionNames) {
		if(this.regionNames == null) this.regionNames = new ArrayList<String>();
		if(regionNames != null){
			getRegionNames().addAll(regionNames);
		}
		return this;
	}

	/**
	 * filtersを取得します。
	 * @return filters
	 */
	@Query(name="Filter")
	public List<Filter> getFilters() {
		return filters;
	}
	/**
	 * filtersを設定します。
	 * @param filters
	 */
	public void setFilters(List<Filter> filters) {
		this.filters = filters;
	}
	/**
	 * filtersの配列を設定し、自オブジェクトを返します。
	 * @param filters
	 * @return 自オブジェクト
	 */
	public DescribeRegionsRequest withFilters(Filter...filters) {
		if(this.filters == null) this.filters = new ArrayList<Filter>();
		for(Filter filter: filters){
			getFilters().add(filter);
		}
		return this;
	}
	/**
	 * filtersリストを設定し、自オブジェクトを返します。
	 * @param filters
	 * @return 自オブジェクト
	 */
	public DescribeRegionsRequest withFilters(Collection<Filter> filters) {
		if(this.filters == null) this.filters = new ArrayList<Filter>();
		if(filters != null) {
			getFilters().addAll(filters);
		}
		return this;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("[regionNames=");
		builder.append(regionNames);
		builder.append(" filters=");
		builder.append(filters);
		builder.append("]");
		return builder.toString();
	}
}
