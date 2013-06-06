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
 *  API Version: 1.14
 *  Date: 2013-03-28 17:00:00
 * 
 */
package com.nifty.cloud.sdk.usage.model;

import java.util.ArrayList;
import java.util.List;

import com.nifty.cloud.sdk.usage.model.transform.UsageDetailSetConverter;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamConverter;

/**
 * ディスク情報クラス。<br />
 * このクラスはディスク情報を格納します。
 */
public class UsageVolume {

	/** 月額利用ディスク情報リスト */
	@XStreamAlias("volumeSet")
	@XStreamConverter(UsageDetailSetConverter.class)
	private List<UsageDetail> volumes;

	/** 従量利用ディスク情報リスト */
	@XStreamAlias("volumeMeasuredRateSet")
	@XStreamConverter(UsageDetailSetConverter.class)
	private List<UsageDetail> volumeMeasuredRates;

	/** 月額インポートサーバーのディスク超過分 */
	@XStreamAlias("importInstanceDiskMonthlyRate")
	private UsageDetail importInstanceDiskMonthlyRate;

	/** 従量インポートサーバーのディスク超過分 */
	@XStreamAlias("importInstanceDiskMeasuredRate")
	private UsageDetail importInstanceDiskMeasuredRate;

	/**
	 * 月額利用ディスク情報リストを取得します。
	 * 
	 * @return 月額利用ディスク情報リスト 
	 */
	public List<UsageDetail> getVolumes() {
		return volumes;
	}

	/**
	 * 月額利用ディスク情報リストを設定します。
	 * 
	 * @param volumes 月額利用ディスク情報リスト 
	 */
	public void setVolumes(List<UsageDetail> volumes) {
		this.volumes = volumes;
	}

	/**
	 * 月額利用ディスク情報の配列を設定し、自オブジェクトを返します。
	 * 
	 * @param volumes 月額利用ディスク情報の配列
	 * @return 自オブジェクト
	 */
	public UsageVolume withVolumes(UsageDetail... volumes) {
		if (this.volumes == null) this.volumes = new ArrayList<UsageDetail>();
		for (UsageDetail volume : volumes) {
			getVolumes().add(volume);
		}
		return this;
	}

	/**
	 * 月額利用ディスク情報リストを設定し、自オブジェクトを返します。
	 * 
	 * @param volumes 月額利用ディスク情報リスト
	 * @return 自オブジェクト
	 */
	public UsageVolume withVolumes(List<UsageDetail> volumes) {
		if (this.volumes == null) this.volumes = new ArrayList<UsageDetail>();
		if (volumes != null) {
			getVolumes().addAll(volumes);
		}
		return this;
	}

	/**
	 * 従量利用ディスク情報リストを取得します。
	 * 
	 * @return 従量利用ディスク情報リスト
	 */
	public List<UsageDetail> getVolumeMeasuredRates() {
		return volumeMeasuredRates;
	}

	/**
	 * 従量利用ディスク情報リストを設定します。
	 * 
	 * @param volumeMeasuredRates 従量利用ディスク情報リスト
	 */
	public void setVolumeMeasuredRates(List<UsageDetail> volumeMeasuredRates) {
		this.volumeMeasuredRates = volumeMeasuredRates;
	}

	/**
	 * 従量利用ディスク情報の配列を設定し、自オブジェクトを返します。
	 * 
	 * @param volumeMeasuredRates 従量利用ディスク情報の配列
	 * @return 自オブジェクト
	 */
	public UsageVolume withVolumeMeasuredRates(UsageDetail... volumeMeasuredRates) {
		if (this.volumeMeasuredRates == null) this.volumeMeasuredRates = new ArrayList<UsageDetail>();
		for (UsageDetail volumeMeasuredRate : volumeMeasuredRates) {
			getVolumeMeasuredRates().add(volumeMeasuredRate);
		}
		return this;
	}

	/**
	 * 従量利用ディスク情報リストを設定し、自オブジェクトを返します。
	 * 
	 * @param volumeMeasuredRates 従量利用ディスク情報リスト
	 * @return 自オブジェクト
	 */
	public UsageVolume withVolumeMeasuredRates(List<UsageDetail> volumeMeasuredRates) {
		if (this.volumeMeasuredRates == null) this.volumeMeasuredRates = new ArrayList<UsageDetail>();
		if (volumeMeasuredRates != null) {
			getVolumeMeasuredRates().addAll(volumeMeasuredRates);
		}
		return this;
	}

	/**
	 * 月額インポートサーバーのディスク超過分を取得します。
	 * 
	 * @return 月額インポートサーバーのディスク超過分
	 */
	public UsageDetail getImportInstanceDiskMonthlyRate() {
		return importInstanceDiskMonthlyRate;
	}

	/**
	 * 月額インポートサーバーのディスク超過分を設定します。
	 * 
	 * @param importInstanceDiskMonthlyRate 月額インポートサーバーのディスク超過分
	 */
	public void setImportInstanceDiskMonthlyRate(UsageDetail importInstanceDiskMonthlyRate) {
		this.importInstanceDiskMonthlyRate = importInstanceDiskMonthlyRate;
	}
	
	/**
	 * 月額インポートサーバーのディスク超過分を設定し、自オブジェクトを返します。
	 * 
	 * @param importInstanceDiskMonthlyRate 月額インポートサーバーのディスク超過分
	 * @return 自オブジェクト
	 */
	public UsageVolume withImportInstanceDiskMonthlyRate(UsageDetail importInstanceDiskMonthlyRate) {
		setImportInstanceDiskMonthlyRate(importInstanceDiskMonthlyRate);
		return this;
	}

	/**
	 * 従量インポートサーバーのディスク超過分を取得します。
	 * 
	 * @return 従量インポートサーバーのディスク超過分
	 */
	public UsageDetail getImportInstanceDiskMeasuredRate() {
		return importInstanceDiskMeasuredRate;
	}

	/**
	 * 従量インポートサーバーのディスク超過分を設定します。
	 * 
	 * @param importInstanceDiskMeasuredRate 従量インポートサーバーのディスク超過分
	 */
	public void setImportInstanceDiskMeasuredRate(UsageDetail importInstanceDiskMeasuredRate) {
		this.importInstanceDiskMeasuredRate = importInstanceDiskMeasuredRate;
	}
	
	/**
	 * 従量インポートサーバーのディスク超過分を設定し、自オブジェクトを返します。
	 * 
	 * @param importInstanceDiskMeasuredRate 従量インポートサーバーのディスク超過分
	 * @return 自オブジェクト
	 */
	public UsageVolume withImportInstanceDiskMeasuredRate(UsageDetail importInstanceDiskMeasuredRate) {
		setImportInstanceDiskMeasuredRate(importInstanceDiskMeasuredRate);
		return this;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("[volumes=");
		builder.append(volumes);
		builder.append(", volumeMeasuredRates=");
		builder.append(volumeMeasuredRates);
		builder.append(", importInstanceDiskMonthlyRate=");
		builder.append(importInstanceDiskMonthlyRate);
		builder.append(", importInstanceDiskMeasuredRate=");
		builder.append(importInstanceDiskMeasuredRate);
		builder.append("]");
		return builder.toString();
	}
}
