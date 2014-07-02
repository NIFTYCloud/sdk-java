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
package com.nifty.cloud.sdk.upload.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.nifty.cloud.sdk.Request;
import com.nifty.cloud.sdk.annotation.Action;
import com.nifty.cloud.sdk.annotation.Query;

/**
 * DescribeUploadsリクエストクラス。<br />
 * このクラスはDescribeUploadsへのリクエストを構築します。
 */
@Action("DescribeUploads")
public class DescribeUploadsRequest implements Request {
	/** アップロードIDリスト */
	private List<String> conversionTaskIds;

	/**
	 * アップロードIDリストを取得します。
	 * @return アップロードIDリスト
	 */
	@Query(name="ConversionTaskId")
	public List<String> getConversionTaskIds() {
		return conversionTaskIds;
	}
	/**
	 * アップロードIDリストを設定します。
	 * @param conversionTaskIds アップロードIDリスト
	 */
	public void setConversionTaskIds(List<String> conversionTaskIds) {
		this.conversionTaskIds = conversionTaskIds;
	}
	/**
	 * アップロードIDリストを設定し、自オブジェクトを返します。
	 * @param conversionTaskIds アップロードIDリスト
	 * @return 自オブジェクト
	 */
	public DescribeUploadsRequest withConversionTaskIds(Collection<String> conversionTaskIds) {
		if (this.conversionTaskIds == null) this.conversionTaskIds = new ArrayList<String>();
		if (conversionTaskIds != null) {
			this.conversionTaskIds.addAll(conversionTaskIds);
		}
		return this;
	}
	/**
	 * アップロードIDリストを設定し、自オブジェクトを返します。
	 * @param conversionTaskIds アップロードIDリスト
	 * @return 自オブジェクト
	 */
	public DescribeUploadsRequest withConversionTaskIds(String... conversionTaskIds) {
		if (this.conversionTaskIds == null) this.conversionTaskIds = new ArrayList<String>();
		for (String conversionTaskId : conversionTaskIds) {
			this.conversionTaskIds.add(conversionTaskId);
		}
		return this;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("[conversionTaskIds=");
		builder.append(conversionTaskIds);
		builder.append("]");
		return builder.toString();
	}
}
