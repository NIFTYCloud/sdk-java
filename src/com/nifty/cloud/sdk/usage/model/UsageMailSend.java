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
package com.nifty.cloud.sdk.usage.model;

import java.util.ArrayList;
import java.util.List;

import com.nifty.cloud.sdk.usage.model.transform.UsageDetailSetConverter;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamConverter;

/**
 * メール配信利用情報クラス。<br />
 * このクラスはメール配信利用情報を格納します。
 */
public class UsageMailSend {

	/** メール配信初期費用情報 */
	@XStreamAlias("mailSendInitial")
	private UsageDetail mailSendInitial;

	/** メール配信初期費用(キャンペーン)情報 */
	@XStreamAlias("mailSendInitialCampaign")
	private UsageDetail mailSendInitialCampaign;

	/** メール配信月額利用情報 */
	@XStreamAlias("mailSendMonthlyRate")
	private List<UsageDetail> mailSendMonthlyRate;

	/** メール配信従量通数情報 */
	@XStreamAlias("mailSendMeasuredRate")
	private UsageDetail mailSendMeasuredRate;

	/** 超過通数利用情報 */
	@XStreamAlias("mailSendMonthlyRateExceeded")
	private UsageDetail mailSendMonthlyRateExceeded;

	/** メール配信オプション利用情報リスト */
	@XStreamAlias("optionSet")
	@XStreamConverter(UsageDetailSetConverter.class)
	private List<UsageDetail> options;

	/**
	 * メール配信初期費用情報を取得します。
	 * @return メール配信初期費用情報
	 */
	public UsageDetail getMailSendInitial() {
		return mailSendInitial;
	}
	/**
	 * メール配信初期費用情報を設定します。
	 * @param mailSendInitial メール配信初期費用情報
	 */
	public void setMailSendInitial(UsageDetail mailSendInitial) {
		this.mailSendInitial = mailSendInitial;
	}
	/**
	 * メール配信初期費用情報を設定し、自オブジェクトを返します。
	 * @param mailSendInitial メール配信初期費用情報
	 * @return 自オブジェクト
	 */
	public UsageMailSend withMailSendInitial(UsageDetail mailSendInitial) {
		setMailSendInitial(mailSendInitial);
		return this;
	}

	/**
	 * メール配信初期費用情報(キャンペーン)を取得します。
	 * @return メール配信初期費用(キャンペーン)情報
	 */
	public UsageDetail getMailSendInitialCampaign() {
		return mailSendInitialCampaign;
	}
	/**
	 * メール配信初期費用情報(キャンペーン)を設定します。
	 * @param mailSendInitialCampaign メール配信初期費用(キャンペーン)情報
	 */
	public void setMailSendInitialCampaign(UsageDetail mailSendInitialCampaign) {
		this.mailSendInitialCampaign = mailSendInitialCampaign;
	}
	/**
	 * メール配信初期費用情報(キャンペーン)を設定し、自オブジェクトを返します。
	 * @param mailSendInitialCampaign メール配信初期費用情報
	 * @return 自オブジェクト
	 */
	public UsageMailSend withMailSendInitialCampaign(UsageDetail mailSendInitialCampaign) {
		setMailSendInitialCampaign(mailSendInitialCampaign);
		return this;
	}

	/**
	 * メール配信月額利用情報を取得します。
	 * @return メール配信月額利用情報
	 */
	public List<UsageDetail> getMailSendMonthlyRate() {
		return mailSendMonthlyRate;
	}
	/**
	 * メール配信月額利用情報を設定します。
	 * @param mailSendMonthlyRate メール配信月額利用情報
	 */
	public void setMailSendMonthlyRate(List<UsageDetail> mailSendMonthlyRate) {
		this.mailSendMonthlyRate = mailSendMonthlyRate;
	}

	/**
	 * メール配信月額利用情報の配列を設定し、自オブジェクトを返します。
	 * @param mailSendMonthlyRate メール配信オプション利用情報の配列
	 * @return 自オブジェクト
	 */
	public UsageMailSend withMailSendMonthlyRate(UsageDetail... mailSendMonthlyRate) {
		for (UsageDetail ｍonthlyRate : mailSendMonthlyRate) {
			getMailSendMonthlyRate().add(ｍonthlyRate);
		}
		return this;
	}

	/**
	 * メール配信月額利用情報の配列を設定し、自オブジェクトを返します。
	 * @param mailSendMonthlyRate メール配信オプション利用情報のリスト
	 * @return 自オブジェクト
	 */
	public UsageMailSend withMailSendMonthlyRate(List<UsageDetail> mailSendMonthlyRate) {
		setMailSendMonthlyRate(mailSendMonthlyRate);
		return this;
	}

	/**
	 * メール配信従量通数情報を取得します。
	 * @return メール配信従量通数情報
	 */
	public UsageDetail getMailSendMeasuredRate() {
		return mailSendMeasuredRate;
	}
	/**
	 * メール配信従量通数情報を設定します。
	 * @param mailSendMeasuredRate メール配信従量通数情報
	 */
	public void setMailSendMeasuredRate(UsageDetail mailSendMeasuredRate) {
		this.mailSendMeasuredRate = mailSendMeasuredRate;
	}
	/**
	 * メール配信従量通数情報を設定し、自オブジェクトを返します。
	 * @param mailSendMeasuredRate メール配信従量通数情報
	 * @return 自オブジェクト
	 */
	public UsageMailSend withMailSendMeasuredRate(UsageDetail mailSendMeasuredRate) {
		setMailSendMeasuredRate(mailSendMeasuredRate);
		return this;
	}

	/**
	 * 超過通数利用情報を取得します。
	 * @return 超過通数利用情報
	 */
	public UsageDetail getMailSendMonthlyRateExceeded() {
		return mailSendMonthlyRateExceeded;
	}
	/**
	 * 超過通数利用情報を設定します。
	 * @param mailSendMonthlyRateExceeded 超過通数利用情報
	 */
	public void setMailSendMonthlyRateExceeded(UsageDetail mailSendMonthlyRateExceeded) {
		this.mailSendMonthlyRateExceeded = mailSendMonthlyRateExceeded;
	}
	/**
	 * 超過通数利用情報を設定し、自オブジェクトを返します。
	 * @param mailSendMonthlyRateExceeded 超過通数利用情報
	 * @return 自オブジェクト
	 */
	public UsageMailSend withMailSendMonthlyRateExceeded(UsageDetail mailSendMonthlyRateExceeded) {
		setMailSendMonthlyRateExceeded(mailSendMonthlyRateExceeded);
		return this;
	}

	/**
	 * メール配信オプション利用情報リストを取得します。
	 * @return メール配信オプション利用情報リスト
	 */
	public List<UsageDetail> getOptions() {
		return options;
	}
	/**
	 * メール配信オプション利用情報リストを設定します。
	 * @param options メール配信オプション利用情報リスト
	 */
	public void setOptions(List<UsageDetail> options) {
		this.options = options;
	}
	/**
	 * メール配信オプション利用情報の配列を設定し、自オブジェクトを返します。
	 *
	 * @param options メール配信オプション利用情報の配列
	 * @return 自オブジェクト
	 */
	public UsageMailSend withOptions(UsageDetail... options) {
		if (this.options == null) {
			this.options = new ArrayList<UsageDetail>();
		}
		for (UsageDetail option : options) {
			getOptions().add(option);
		}
		return this;
	}

	/**
	 * メール配信オプション利用情報リストを設定し、自オブジェクトを返します。
	 *
	 * @param options メール配信オプション利用情報リスト
	 * @return 自オブジェクト
	 */
	public UsageMailSend withOptions(List<UsageDetail> options) {
		if (this.options == null) {
			this.options = new ArrayList<UsageDetail>();
		}
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
		builder.append("[mailSendInitial=");
		builder.append(mailSendInitial);
		builder.append(", mailSendInitialCampaign=");
		builder.append(mailSendInitialCampaign);
		builder.append(", mailSendMonthlyRate=");
		builder.append(mailSendMonthlyRate);
		builder.append(", mailSendMeasuredRate=");
		builder.append(mailSendMeasuredRate);
		builder.append(", mailSendMonthlyRateExceeded=");
		builder.append(mailSendMonthlyRateExceeded);
		builder.append(", options=");
		builder.append(options);
		builder.append("]");
		return builder.toString();
	}
}
