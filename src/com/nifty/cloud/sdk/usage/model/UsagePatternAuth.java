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
 *  API Version: 1.16
 *  Date: 2013-10-18 17:00:00
 * 
 */
package com.nifty.cloud.sdk.usage.model;

import java.util.ArrayList;
import java.util.List;

import com.nifty.cloud.sdk.usage.model.transform.UsageDetailSetConverter;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamConverter;

/**
 * パターン認証利用情報クラス。<br />
 * このクラスはパターン認証利用情報を格納します。
 */
public class UsagePatternAuth {

	/** パターン認証利用情報リスト */
	@XStreamAlias("patternAuthSet")
	@XStreamConverter(UsageDetailSetConverter.class)
	private List<UsageDetail> patternAuths;

	/**
	 * パターン認証利用情報リストを取得します。
	 * 
	 * @return パターン認証利用情報リスト
	 */
	public List<UsageDetail> getPatternAuths() {
		return patternAuths;
	}

	/**
	 * パターン認証利用情報リストを設定します。
	 * 
	 * @param patternAuths パターン認証利用情報リスト
	 */
	public void setPatternAuths(List<UsageDetail> patternAuths) {
		this.patternAuths = patternAuths;
	}

	/**
	 * パターン認証利用情報の配列を設定し、自オブジェクトを返します。
	 * 
	 * @param patternAuths パターン認証利用情報の配列
	 * @return 自オブジェクト
	 */
	public UsagePatternAuth withPatternAuths(UsageDetail... patternAuths) {
		if (this.patternAuths == null) this.patternAuths = new ArrayList<UsageDetail>();
		for (UsageDetail patternAuth : patternAuths) {
			getPatternAuths().add(patternAuth);
		}
		return this;
	}

	/**
	 * パターン認証利用情報リストを設定し、自オブジェクトを返します。
	 * 
	 * @param patternAuths パターン認証利用情報リスト
	 * @return 自オブジェクト
	 */
	public UsagePatternAuth withPatternAuths(List<UsageDetail> patternAuths) {
		if (this.patternAuths == null) this.patternAuths = new ArrayList<UsageDetail>();
		if (patternAuths != null) {
			getPatternAuths().addAll(patternAuths);
		}
		return this;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("[patternAuths=");
		builder.append(patternAuths);
		builder.append("]");
		return builder.toString();
	}
}
