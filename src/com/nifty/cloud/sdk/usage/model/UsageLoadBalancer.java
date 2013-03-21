/******************************************************************************* 
 *  Copyright 2011 NIFTY Corporation All Rights Reserved.
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
 *  API Version: 1.11
 *  Date: 2011-11-29 14:07:10
 * 
 */
package com.nifty.cloud.sdk.usage.model;

import java.util.ArrayList;
import java.util.List;

import com.nifty.cloud.sdk.usage.model.transform.UsageDetailSetConverter;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamConverter;

/**
 * ネットワーク情報クラス。<br />
 * このクラスはネットワーク情報を格納します。
 */
public class UsageLoadBalancer {

	/** 月額利用VIP情報リスト */
	@XStreamAlias("vipSet")
	@XStreamConverter(UsageDetailSetConverter.class)
	private List<UsageDetail> vips;

	/** 従量利用VIP情報リスト */
	@XStreamAlias("vipMeasuredRateSet")
	@XStreamConverter(UsageDetailSetConverter.class)
	private List<UsageDetail> vipMeasuredRates;

	/** ロードバランサーオプション情報リスト */
	@XStreamAlias("optionSet")
	@XStreamConverter(UsageDetailSetConverter.class)
	private List<UsageDetail> options;

	/**
	 * 月額利用VIP情報リストを取得します。
	 * 
	 * @return 月額利用VIP情報リスト
	 */
	public List<UsageDetail> getVips() {
		return vips;
	}

	/**
	 * 月額利用VIP情報リストを設定します。
	 * 
	 * @param vips 月額利用VIP情報リスト
	 */
	public void setVips(List<UsageDetail> vips) {
		this.vips = vips;
	}

	/**
	 * 月額利用VIP情報の配列を設定し、自オブジェクトを返します。
	 * 
	 * @param vips 月額利用VIP情報の配列
	 * @return 自オブジェクト
	 */
	public UsageLoadBalancer withVips(UsageDetail... vips) {
		if (this.vips == null) this.vips = new ArrayList<UsageDetail>();
		for (UsageDetail vip : vips) {
			getVips().add(vip);
		}
		return this;
	}

	/**
	 * 月額利用VIP情報リストを設定し、自オブジェクトを返します。
	 * 
	 * @param vips 月額利用VIP情報リスト
	 * @return 自オブジェクト
	 */
	public UsageLoadBalancer withVips(List<UsageDetail> vips) {
		if (this.vips == null) this.vips = new ArrayList<UsageDetail>();
		if (vips != null) {
			getVips().addAll(vips);
		}
		return this;
	}

	/**
	 * 従量利用VIP情報リストを取得します。
	 * 
	 * @return 従量利用VIP情報リスト
	 */
	public List<UsageDetail> getVipMeasuredRates() {
		return vipMeasuredRates;
	}

	/**
	 * 従量利用VIP情報リストを設定します。
	 * 
	 * @param vipMeasuredRates 従量利用VIP情報リスト
	 */
	public void setVipMeasuredRates(List<UsageDetail> vipMeasuredRates) {
		this.vipMeasuredRates = vipMeasuredRates;
	}

	/**
	 * 従量利用VIP情報の配列を設定し、自オブジェクトを返します。
	 * 
	 * @param vipMeasuredRates 従量利用VIP情報の配列
	 * @return 自オブジェクト
	 */
	public UsageLoadBalancer withVipMeasuredRates(UsageDetail... vipMeasuredRates) {
		if (this.vipMeasuredRates == null) this.vipMeasuredRates = new ArrayList<UsageDetail>();
		for (UsageDetail vipMeasuredRate : vipMeasuredRates) {
			getVipMeasuredRates().add(vipMeasuredRate);
		}
		return this;
	}

	/**
	 * 従量利用VIP情報リストを設定し、自オブジェクトを返します。
	 * 
	 * @param vipMeasuredRates 従量利用VIP情報リスト
	 * @return 自オブジェクト
	 */
	public UsageLoadBalancer withVipMeasuredRates(List<UsageDetail> vipMeasuredRates) {
		if (this.vipMeasuredRates == null) this.vipMeasuredRates = new ArrayList<UsageDetail>();
		if (vipMeasuredRates != null) {
			getVipMeasuredRates().addAll(vipMeasuredRates);
		}
		return this;
	}

	/**
	 * ロードバランサーオプション情報リストを取得します。
	 * 
	 * @return ロードバランサーオプション情報リスト
	 */
	public List<UsageDetail> getOptions() {
		return options;
	}

	/**
	 * ロードバランサーオプション情報リストを設定します。
	 * 
	 * @param options ロードバランサーオプション情報リスト
	 */
	public void setOptions(List<UsageDetail> options) {
		this.options = options;
	}

	/**
	 * ロードバランサーオプション情報の配列を設定し、自オブジェクトを返します。
	 * @param options ロードバランサーオプション情報の配列
	 * @return 自オブジェクト
	 */
	public UsageLoadBalancer withOptions(UsageDetail... options) {
		if (this.options == null) this.options = new ArrayList<UsageDetail>();
		for (UsageDetail option : options) {
			getOptions().add(option);
		}
		return this;
	}

	/**
	 * ロードバランサーオプション情報リストを設定し、自オブジェクトを返します。
	 * @param options ロードバランサーオプション情報リスト
	 * @return 自オブジェクト
	 */
	public UsageLoadBalancer withOptions(List<UsageDetail> options) {
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
		builder.append("[vips=");
		builder.append(vips);
		builder.append(", vipMeasuredRates=");
		builder.append(vipMeasuredRates);
		builder.append(", options=");
		builder.append(options);
		builder.append("]");
		return builder.toString();
	}
}
