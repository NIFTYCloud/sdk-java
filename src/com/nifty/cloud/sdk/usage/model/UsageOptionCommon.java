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
package com.nifty.cloud.sdk.usage.model;

import java.util.ArrayList;
import java.util.List;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * 追加オプション（共通）利用情報クラス。<br />
 * このクラスは追加オプション（共通）利用情報を格納します。
 */
public class UsageOptionCommon {
	
	
	/** 追加オプション大分類名 */
	@XStreamAlias("optionName")
	private String optionName;


	/** 追加オプション小分類利用情報リスト */
	@XStreamAlias("optionSet")
	private List<UsageDetail> optionSet;
	
	/**
	 * 追加オプション大分類名を取得します。
	 * @return 追加オプション大分類名
	 */
	public String getOptionName() {
		return optionName;
	}


	/**
	 * 追加オプション利用情報リストを取得します。
	 * @return 追加オプション利用情報リスト
	 */
	public List<UsageDetail> getOptionSet() {
		return optionSet;
	}

	/**
	 * 追加オプション大分類名を設定します
	 * @param String optionName 追加オプション大分類名
	 */
	public void setOptionName(String optionName) {
		this.optionName = optionName;
	}

	
	/**
	 * 追加オプション利用情報リストを設定します。
	 * @param List<UsageDetail>optionSet 追加オプション利用情報リスト
	 */
	public void setOptionSet(List<UsageDetail> optionSet) {
		this.optionSet = optionSet;
	}
	/**
	 * 追加オプション利用情報の配列を設定し、自オブジェクトを返します。
	 * @param String optionName,optionSet 追加オプション小分類利用情報の配列
	 * @return 自オブジェクト
	 */
	public UsageOptionCommon withOptionSet(String optionName,UsageDetail... optionSet) {
		this.optionName = optionName;
		
		if(this.optionSet == null) {
			this.optionSet = new ArrayList<UsageDetail>();
		}
		for(UsageDetail optiondetail : optionSet){
			getOptionSet().add(optiondetail);
		}
		return this;
	}
	/**
	 * 追加オプション利用情報リストを設定し、自オブジェクトを返します。
	 * @param String optionName,optionSet 追加オプション小分類利用情報リスト
	 * @return 自オブジェクト
	 */
	public UsageOptionCommon withOptionSet(String optionName,List<UsageDetail> optionSet) {
		this.optionName = optionName;
		if(this.optionSet == null) {
			this.optionSet = new ArrayList<UsageDetail>();
		}
		if(optionSet != null){
			getOptionSet().addAll(optionSet);
		}
		return this;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("[optionName=");
		builder.append(optionName);
		builder.append("[optionSet=");
		builder.append(optionSet);
		builder.append("]");
		return builder.toString();
	}

}