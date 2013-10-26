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
 * サーバー情報クラス。<br />
 * このクラスはサーバー情報を格納します。
 */
public class UsageInstance {

	/** サーバー月額利用情報リスト */
	@XStreamAlias("instanceMonthlyRateSet")
	@XStreamConverter(UsageDetailSetConverter.class)
	private List<UsageDetail> instanceMonthlyRates;

	/** サーバー従量起動情報リスト */
	@XStreamAlias("runningInstanceMeasuredRateSet")
	@XStreamConverter(UsageDetailSetConverter.class)
	private List<UsageDetail> runningInstanceMeasuredRates;

	/** サーバー従量停止情報リスト */
	@XStreamAlias("stoppedInstanceMeasuredRateSet")
	@XStreamConverter(UsageDetailSetConverter.class)
	private List<UsageDetail> stoppedInstanceMeasuredRates;

	/** 動的IP月額利用情報 */
	@XStreamAlias("dynamicIpMonthlyRate")
	private UsageDetail dynamicIpMonthlyRate;

	/** 動的IP従量利用情報 */
	@XStreamAlias("dynamicIpMeasuredRate")
	private UsageDetail dynamicIpMeasuredRate;

	/** OS月額利用情報リスト */
	@XStreamAlias("osMonthlyRate")
	@XStreamConverter(UsageDetailSetConverter.class)
	private List<UsageDetail> osMonthlyRates;

	/** OS従量利用情報リスト */
	@XStreamAlias("osMeasuredRate")
	@XStreamConverter(UsageDetailSetConverter.class)
	private List<UsageDetail> osMeasuredRates;

	/** マルチIP月額利用情報 */
	@XStreamAlias("multiIpMonthlyRate")
	private UsageDetail multiIpMonthlyRate;
	/**
	 * サーバー月額利用情報リストを取得します。
	 * 
	 * @return サーバー月額利用情報リスト
	 */
	public List<UsageDetail> getInstanceMonthlyRates() {
		return instanceMonthlyRates;
	}

	/**
	 * サーバー月額利用情報リストを設定します。
	 * 
	 * @param instanceMonthlyRates サーバー月額利用情報リスト
	 */
	public void setInstanceMonthlyRates(List<UsageDetail> instanceMonthlyRates) {
		this.instanceMonthlyRates = instanceMonthlyRates;
	}

	/**
	 * サーバー月額利用情報の配列を設定し、自オブジェクトを返します。
	 * 
	 * @param instanceMonthlyRates サーバー月額利用情報の配列
	 * @return 自オブジェクト
	 */
	public UsageInstance withInstanceMonthlyRates(UsageDetail... instanceMonthlyRates) {
		if (this.instanceMonthlyRates == null) {
			this.instanceMonthlyRates = new ArrayList<UsageDetail>();
		}
		for (UsageDetail instanceMonthlyRate : instanceMonthlyRates) {
			getInstanceMonthlyRates().add(instanceMonthlyRate);
		}
		return this;
	}

	/**
	 * サーバー月額利用情報リストを設定し、自オブジェクトを返します。
	 * 
	 * @param instanceMonthlyRates サーバー月額利用情報リスト
	 * @return 自オブジェクト
	 */
	public UsageInstance withInstanceMonthlyRates(List<UsageDetail> instanceMonthlyRates) {
		if (this.instanceMonthlyRates == null) {
			this.instanceMonthlyRates = new ArrayList<UsageDetail>();
		}
		if (instanceMonthlyRates != null) {
			getInstanceMonthlyRates().addAll(instanceMonthlyRates);
		}
		return this;
	}

	/**
	 * サーバー従量起動情報リストを取得します。
	 * 
	 * @return サーバー従量起動情報リスト
	 */
	public List<UsageDetail> getRunningInstanceMeasuredRates() {
		return runningInstanceMeasuredRates;
	}

	/**
	 * サーバー従量起動情報リストを設定します。
	 * 
	 * @param runningInstanceMeasuredRates サーバー従量起動情報リスト
	 */
	public void setRunningInstanceMeasuredRates(List<UsageDetail> runningInstanceMeasuredRates) {
		this.runningInstanceMeasuredRates = runningInstanceMeasuredRates;
	}

	/**
	 * サーバー従量起動情報の配列を設定し、自オブジェクトを返します。
	 * 
	 * @param runningInstanceMeasuredRates サーバー従量起動情報の配列
	 * @return 自オブジェクト
	 */
	public UsageInstance withRunningInstanceMeasuredRates(UsageDetail... runningInstanceMeasuredRates) {
		if (this.runningInstanceMeasuredRates == null) {
			this.runningInstanceMeasuredRates = new ArrayList<UsageDetail>();
		}
		for (UsageDetail runningInstanceMeasuredRate : runningInstanceMeasuredRates) {
			getRunningInstanceMeasuredRates().add(runningInstanceMeasuredRate);
		}
		return this;
	}

	/**
	 * サーバー従量起動情報リストを設定し、自オブジェクトを返します。
	 * 
	 * @param runningInstanceMeasuredRates サーバー従量起動情報リスト
	 * @return 自オブジェクト
	 */
	public UsageInstance withRunningInstanceMeasuredRates(List<UsageDetail> runningInstanceMeasuredRates) {
		if (this.runningInstanceMeasuredRates == null) {
			this.runningInstanceMeasuredRates = new ArrayList<UsageDetail>();
		}
		if (runningInstanceMeasuredRates != null) {
			getRunningInstanceMeasuredRates().addAll(runningInstanceMeasuredRates);
		}
		return this;
	}

	/**
	 * サーバー従量停止情報リストを取得します。
	 * 
	 * @return サーバー従量停止情報リスト
	 */
	public List<UsageDetail> getStoppedInstanceMeasuredRates() {
		return stoppedInstanceMeasuredRates;
	}

	/**
	 * サーバー従量停止情報リストを設定します。
	 * 
	 * @param stoppedInstanceMeasuredRates サーバー従量停止情報リスト
	 */
	public void setStoppedInstanceMeasuredRates(List<UsageDetail> stoppedInstanceMeasuredRates) {
		this.stoppedInstanceMeasuredRates = stoppedInstanceMeasuredRates;
	}

	/**
	 * サーバー従量停止情報の配列を設定し、自オブジェクトを返します。
	 * 
	 * @param stoppedInstanceMeasuredRates サーバー従量停止情報の配列
	 * @return 自オブジェクト
	 */
	public UsageInstance withStoppedInstanceMeasuredRates(UsageDetail... stoppedInstanceMeasuredRates) {
		if (this.stoppedInstanceMeasuredRates == null) {
			this.stoppedInstanceMeasuredRates = new ArrayList<UsageDetail>();
		}
		for (UsageDetail stoppedInstanceMeasuredRate : stoppedInstanceMeasuredRates) {
			getStoppedInstanceMeasuredRates().add(stoppedInstanceMeasuredRate);
		}
		return this;
	}

	/**
	 * サーバー従量停止情報リストを設定し、自オブジェクトを返します。
	 * 
	 * @param stoppedInstanceMeasuredRates サーバー従量停止情報リスト
	 * @return 自オブジェクト
	 */
	public UsageInstance withStoppedInstanceMeasuredRates(List<UsageDetail> stoppedInstanceMeasuredRates) {
		if (this.stoppedInstanceMeasuredRates == null) {
			this.stoppedInstanceMeasuredRates = new ArrayList<UsageDetail>();
		}
		if (stoppedInstanceMeasuredRates != null) {
			getStoppedInstanceMeasuredRates().addAll(stoppedInstanceMeasuredRates);
		}
		return this;
	}

	/**
	 * 動的IP月額利用情報を取得します。
	 * 
	 * @return 動的IP月額利用情報
	 */
	public UsageDetail getDynamicIpMonthlyRate() {
		return dynamicIpMonthlyRate;
	}

	/**
	 * 動的IP月額利用情報を設定します。
	 * 
	 * @param dynamicIpMonthlyRate 動的IP月額利用情報
	 */
	public void setDynamicIpMonthlyRate(UsageDetail dynamicIpMonthlyRate) {
		this.dynamicIpMonthlyRate = dynamicIpMonthlyRate;
	}

	/**
	 * 動的IP月額利用情報を設定し、自オブジェクトを返します。
	 * 
	 * @param dynamicIpMonthlyRate 動的IP月額利用情報
	 * @return 自オブジェクト
	 */
	public UsageInstance withDynamicIpMonthlyRate(UsageDetail dynamicIpMonthlyRate) {
		setDynamicIpMonthlyRate(dynamicIpMonthlyRate);
		return this;
	}

	/**
	 * 動的IP従量利用情報を取得します。
	 * 
	 * @return 動的IP従量利用情報
	 */
	public UsageDetail getDynamicIpMeasuredRate() {
		return dynamicIpMeasuredRate;
	}

	/**
	 * 動的IP従量利用情報を設定します。
	 * 
	 * @param dynamicIpMeasuredRate 動的IP従量利用情報
	 */
	public void setDynamicIpMeasuredRate(UsageDetail dynamicIpMeasuredRate) {
		this.dynamicIpMeasuredRate = dynamicIpMeasuredRate;
	}

	/**
	 * 動的IP従量利用情報を設定し、自オブジェクトを返します。
	 * 
	 * @param dynamicIpMeasuredRate 動的IP従量利用情報
	 * @return 自オブジェクト
	 */
	public UsageInstance withDynamicIpMeasuredRate(UsageDetail dynamicIpMeasuredRate) {
		setDynamicIpMeasuredRate(dynamicIpMeasuredRate);
		return this;
	}

	/**
	 * OS月額利用情報リストを取得します。
	 * 
	 * @return OS月額利用情報リスト
	 */
	public List<UsageDetail> getOsMonthlyRates() {
		return osMonthlyRates;
	}

	/**
	 * OS月額利用情報リストを設定します。
	 * 
	 * @param osMonthlyRates OS月額利用情報リスト
	 */
	public void setOsMonthlyRates(List<UsageDetail> osMonthlyRates) {
		this.osMonthlyRates = osMonthlyRates;
	}

	/**
	 * OS月額利用情報の配列を設定し、自オブジェクトを返します。
	 * 
	 * @param osMonthlyRates OS月額利用情報の配列
	 * @return 自オブジェクト
	 */
	public UsageInstance withOsMonthlyRates(UsageDetail... osMonthlyRates) {
		if (this.osMonthlyRates == null) {
			this.osMonthlyRates = new ArrayList<UsageDetail>();
		}
		for (UsageDetail osMonthlyRate : osMonthlyRates) {
			getOsMonthlyRates().add(osMonthlyRate);
		}
		return this;
	}

	/**
	 * OS月額利用情報リストを設定し、自オブジェクトを返します。
	 * 
	 * @param osMonthlyRates OS月額利用情報リスト
	 * @return 自オブジェクト
	 */
	public UsageInstance withOsMonthlyRates(List<UsageDetail> osMonthlyRates) {
		if (this.osMonthlyRates == null) {
			this.osMonthlyRates = new ArrayList<UsageDetail>();
		}
		if (osMonthlyRates != null) {
			getOsMonthlyRates().addAll(osMonthlyRates);
		}
		return this;
	}

	/**
	 * OS従量利用情報リストを取得します。
	 * 
	 * @return OS従量利用情報リスト
	 */
	public List<UsageDetail> getOsMeasuredRates() {
		return osMeasuredRates;
	}

	/**
	 * OS従量利用情報リストを設定します。
	 * 
	 * @param osMeasuredRates OS従量利用情報リスト
	 */
	public void setOsMeasuredRates(List<UsageDetail> osMeasuredRates) {
		this.osMeasuredRates = osMeasuredRates;
	}

	/**
	 * OS従量利用情報の配列を設定し、自オブジェクトを返します。
	 * 
	 * @param osMeasuredRates OS従量利用情報の配列
	 * @return 自オブジェクト
	 */
	public UsageInstance withOsMeasuredRates(UsageDetail... osMeasuredRates) {
		if (this.osMeasuredRates == null) {
			this.osMeasuredRates = new ArrayList<UsageDetail>();
		}
		for (UsageDetail osMeasuredRate : osMeasuredRates) {
			getOsMeasuredRates().add(osMeasuredRate);
		}
		return this;
	}

	/**
	 * OS従量利用情報リストを設定し、自オブジェクトを返します。
	 * 
	 * @param osMeasuredRates OS従量利用情報リスト
	 * @return 自オブジェクト
	 */
	public UsageInstance withOsMeasuredRates(List<UsageDetail> osMeasuredRates) {
		if (this.osMeasuredRates == null) {
			this.osMeasuredRates = new ArrayList<UsageDetail>();
		}
		if (osMeasuredRates != null) {
			getOsMeasuredRates().addAll(osMeasuredRates);
		}
		return this;
	}

	/**
	 * マルチIP月額利用情報を設定します。
	 * @return マルチIP月額利用情報
	 */
	public UsageDetail getMultiIpMonthlyRate() {
		return multiIpMonthlyRate;
	}

	/**
	 * マルチIP月額利用情報を設定します。
	 * @param multiIpMonthlyRate マルチIP月額利用情報
	 */
	public void setMultiIpMonthlyRate(UsageDetail multiIpMonthlyRate) {
		this.multiIpMonthlyRate = multiIpMonthlyRate;
	}

	/**
	 * マルチIP月額利用情報を設定し、自オブジェクトを返します。
	 * @param multiIpMonthlyRate マルチIP月額利用情報
	 * @return 自オブジェクト
	 */
	public UsageInstance withMultiIpMonthlyRate(UsageDetail multiIpMonthlyRate) {
		setMultiIpMonthlyRate(multiIpMonthlyRate);
		return this;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("[instanceMonthlyRates=");
		builder.append(instanceMonthlyRates);
		builder.append(", runningInstanceMeasuredRates=");
		builder.append(runningInstanceMeasuredRates);
		builder.append(", stoppedInstanceMeasuredRates=");
		builder.append(stoppedInstanceMeasuredRates);
		builder.append(", dynamicIpMonthlyRate=");
		builder.append(dynamicIpMonthlyRate);
		builder.append(", dynamicMeasuredRate=");
		builder.append(dynamicIpMeasuredRate);
		builder.append(", osMonthlyRates=");
		builder.append(osMonthlyRates);
		builder.append(", osMeasuredRates=");
		builder.append(osMeasuredRates);
		builder.append(", multiIpMonthlyRate=");
		builder.append(multiIpMonthlyRate);
		builder.append("]");
		return builder.toString();
	}
}
