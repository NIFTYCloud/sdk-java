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
 *  API Version: 1.15
 *  Date: 2013-06-28 17:00:00
 *
 */
package com.nifty.cloud.sdk.firewall.model;

import java.util.ArrayList;
import java.util.List;

import com.nifty.cloud.sdk.Request;
import com.nifty.cloud.sdk.annotation.Action;
import com.nifty.cloud.sdk.annotation.Query;

/**
 * DescribeSecurityGroupsリクエストクラス。<br />
 * このクラスはDescribeSecurityGroupsへのリクエストを構築します。
 */
@Action("DescribeSecurityGroups")
public class DescribeSecurityGroupsRequest implements Request {

	/** ファイアウォールグループ名の絞り込みリスト */
	private List<String> groupNames;

	/** 絞り込み情報リスト */
	private List<Filter> filters;

	/**
	 * ファイアウォールグループ名の絞り込みリストを取得します。
	 *
	 * @return ファイアウォールグループ名の絞り込み名リスト
	 */
	@Query(name = "GroupName")
	public List<String> getGroupNames() {
		return groupNames;
	}

	/**
	 * ファイアウォールグループ名の絞り込みリストを設定します。
	 *
	 * @param groupName ファイアウォールグループ名の絞り込みリスト
	 */
	public void setGroupNames(List<String> groupName) {
		this.groupNames = groupName;
	}

	/**
	 * ファイアウォールグループ名の絞り込みの配列を設定し、自オブジェクトを返します。
	 *
	 * @param groupNames ファイアウォールグループ名の絞り込みの配列
	 * @return 自オブジェクト
	 */
	public DescribeSecurityGroupsRequest withGroupNames(String... groupNames) {
		if (this.groupNames == null)
			this.groupNames = new ArrayList<String>();
		for (String groupName : groupNames) {
			getGroupNames().add(groupName);
		}
		return this;
	}

	/**
	 * ファイアウォールグループ名の絞り込みリストを設定し、自オブジェクトを返します。
	 *
	 * @param groupNames ファイアウォールグループ名の絞り込みリスト
	 * @return 自オブジェクト
	 */
	public DescribeSecurityGroupsRequest withGroupNames(List<String> groupNames) {
		if (this.groupNames == null)
			this.groupNames = new ArrayList<String>();
		if (groupNames != null) {
			getGroupNames().addAll(groupNames);
		}
		return this;
	}

	/**
	 * 絞り込み情報リストを取得します。
	 *
	 * @return 絞り込み情報リスト
	 */
	@Query(name = "Filter")
	public List<Filter> getFilters() {
		return filters;
	}

	/**
	 * 絞り込み情報リストを設定します。
	 *
	 * @param filters 絞り込み情報リスト
	 */
	public void setFilters(List<Filter> filters) {
		this.filters = filters;
	}

	/**
	 * 絞り込み情報の配列を設定し、自オブジェクトを返します。
	 *
	 * @param filters 絞り込み情報の配列
	 * @return 自オブジェクト
	 */
	public DescribeSecurityGroupsRequest withFilters(Filter... filters) {
		if (this.filters == null)
			this.filters = new ArrayList<Filter>();
		for (Filter filter : filters) {
			getFilters().add(filter);
		}
		return this;
	}

	/**
	 * 絞り込み情報リストを設定し、自オブジェクトを返します。
	 *
	 * @param filters 絞り込み情報リスト
	 * @return 自オブジェクト
	 */
	public DescribeSecurityGroupsRequest withFilters(List<Filter> filters) {
		if (this.filters == null)
			this.filters = new ArrayList<Filter>();
		if (filters != null) {
			getFilters().addAll(filters);
		}
		return this;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("[groupNames=");
		builder.append(groupNames);
		builder.append(", filters=");
		builder.append(filters);
		builder.append("]");
		return builder.toString();
	}
}
