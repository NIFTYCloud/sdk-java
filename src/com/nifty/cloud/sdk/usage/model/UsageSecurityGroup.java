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
package com.nifty.cloud.sdk.usage.model;

import java.util.ArrayList;
import java.util.List;

import com.nifty.cloud.sdk.usage.model.transform.UsageDetailSetConverter;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamConverter;

/**
 * ファイアウォール情報クラス。<br />
 * このクラスはファイアウォール情報を格納します。
 */
public class UsageSecurityGroup {

	/** ファイアウォール適用情報 */
	@XStreamAlias("securityGroupApplyTime")
	private UsageDetail securityGroupApplyTime;

	/** ファイアウォールオプション情報リスト */
	@XStreamAlias("optionSet")
	@XStreamConverter(UsageDetailSetConverter.class)
	private List<UsageDetail> options;

	/**
	 * ファイアウォール適用情報を取得します。
	 * 
	 * @return ファイアウォール適用情報
	 */
	public UsageDetail getSecurityGroupApplyTime() {
		return securityGroupApplyTime;
	}

	/**
	 * ファイアウォール適用情報を設定します。
	 * 
	 * @param securityGroupApplyTime ファイアウォール適用情報
	 */
	public void setSecurityGroupApplyTime(UsageDetail securityGroupApplyTime) {
		this.securityGroupApplyTime = securityGroupApplyTime;
	}

	/**
	 * ファイアウォール適用情報を設定し、自オブジェクトを返します。
	 * 
	 * @param securityGrouopApplyTime ファイアウォール適用情報
	 * @return 自オブジェクト
	 */
	public UsageSecurityGroup withSecurityGrouopApplyTime(UsageDetail securityGrouopApplyTime) {
		setSecurityGroupApplyTime(securityGrouopApplyTime);
		return this;
	}

	/**
	 * ファイアウォールオプション情報リストを取得します。
	 * 
	 * @return ファイアウォールオプション情報リスト
	 */
	public List<UsageDetail> getOptions() {
		return options;
	}

	/**
	 * ファイアウォールオプション情報リストを設定します。
	 * 
	 * @param options ファイアウォールオプション情報リスト
	 */
	public void setOptions(List<UsageDetail> options) {
		this.options = options;
	}

	/**
	 * ファイアウォールオプション情報の配列を設定し、自オブジェクトを返します。
	 * 
	 * @param options ファイアウォールオプション情報の配列
	 * @return 自オブジェクト
	 */
	public UsageSecurityGroup withOptions(UsageDetail... options) {
		if (this.options == null) this.options = new ArrayList<UsageDetail>();
		for (UsageDetail option : options) {
			getOptions().add(option);
		}
		return this;
	}

	/**
	 * ファイアウォールオプション情報リストを設定し、自オブジェクトを返します。
	 * 
	 * @param options ファイアウォールオプション情報リスト
	 * @return 自オブジェクト
	 */
	public UsageSecurityGroup withOptions(List<UsageDetail> options) {
		if (this.options == null) this.options = new ArrayList<UsageDetail>();
		if (options != null) {
			getOptions().addAll(options);
		}
		return this;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("[securityGroupApplyTime=");
		builder.append(securityGroupApplyTime);
		builder.append(", options=");
		builder.append(options);
		builder.append("]");
		return builder.toString();
	}
}
