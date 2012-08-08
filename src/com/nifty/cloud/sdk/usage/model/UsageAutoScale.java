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
 *  API Version: 1.9
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
 * オートスケール情報クラス。<br />
 * このクラスはオートスケール情報を格納します。
 */
public class UsageAutoScale {

	/** 利用オートスケール数 */
	@XStreamAlias("autoScaleCount")
	private UsageDetail autoScaleCount;

	/** スケールアウトサーバー起動情報リスト */
	@XStreamAlias("runningScaleOutInstanceSet")
	@XStreamConverter(UsageDetailSetConverter.class)
	private List<UsageDetail> runningScaleOutInstances;

	/** スケールアウトサーバー停止情報リスト */
	@XStreamAlias("stoppedScaleOutInstanceSet")
	@XStreamConverter(UsageDetailSetConverter.class)
	private List<UsageDetail> stoppedScaleOutInstances;

	/** スケールアウトサーバー起動時OS利用情報リスト */
	@XStreamAlias("runningScaleOutOsSet")
	@XStreamConverter(UsageDetailSetConverter.class)
	private List<UsageDetail> runningScaleOutOses;

	/** スケールアウトサーバー停止時OS利用情報リスト */
	@XStreamAlias("stoppedScaleOutOsSet")
	@XStreamConverter(UsageDetailSetConverter.class)
	private List<UsageDetail> stoppedScaleOutOses;

	/**
	 * 利用オートスケール数を取得します。
	 * 
	 * @return 利用オートスケール数
	 */
	public UsageDetail getAutoScaleCount() {
		return autoScaleCount;
	}

	/**
	 * 利用オートスケール数を設定します
	 * 
	 * @param autoScaleCount 利用オートスケール数
	 */
	public void setAutoScaleCount(UsageDetail autoScaleCount) {
		this.autoScaleCount = autoScaleCount;
	}

	/**
	 * 利用オートスケール数を設定し、自オブジェクトを返します。
	 * 
	 * @param autoScaleCount 利用オートスケール数
	 * @return 自オブジェクト
	 */
	public UsageAutoScale withAutoScaleCount(UsageDetail autoScaleCount) {
		setAutoScaleCount(autoScaleCount);
		return this;
	}

	/**
	 * スケールアウトサーバー起動情報リストを取得します。
	 * 
	 * @return スケールアウトサーバー起動情報リスト
	 */
	public List<UsageDetail> getRunningScaleOutInstances() {
		return runningScaleOutInstances;
	}

	/**
	 * スケールアウトサーバー起動情報リストを設定します。
	 * 
	 * @param runningScaleOutInstances スケールアウトサーバー起動情報リスト
	 */
	public void setRunningScaleOutInstances(List<UsageDetail> runningScaleOutInstances) {
		this.runningScaleOutInstances = runningScaleOutInstances;
	}

	/**
	 * スケールアウトサーバー起動情報の配列を設定し、自オブジェクトを返します。
	 * 
	 * @param runningScaleOutInstances スケールアウトサーバー起動情報の配列
	 * @return 自オブジェクト
	 */
	public UsageAutoScale withRunningScaleOutInstances(UsageDetail... runningScaleOutInstances) {
		if (this.runningScaleOutInstances == null) {
			this.runningScaleOutInstances = new ArrayList<UsageDetail>();
		}
		for (UsageDetail runningScaleOutInstance : runningScaleOutInstances) {
			getRunningScaleOutInstances().add(runningScaleOutInstance);
		}
		return this;
	}

	/**
	 * スケールアウトサーバー起動情報リストを設定し、自オブジェクトを返します。
	 * 
	 * @param runningScaleOutInstances スケールアウトサーバー起動情報リスト
	 * @return 自オブジェクト
	 */
	public UsageAutoScale withRunningScaleOutInstances(List<UsageDetail> runningScaleOutInstances) {
		if (this.runningScaleOutInstances == null) {
			this.runningScaleOutInstances = new ArrayList<UsageDetail>();
		}
		if (runningScaleOutInstances != null) {
			getRunningScaleOutInstances().addAll(runningScaleOutInstances);
		}
		return this;
	}

	/**
	 * スケールアウトサーバー停止情報リストを取得します。
	 * 
	 * @return スケールアウトサーバー停止情報リスト
	 */
	public List<UsageDetail> getStoppedScaleOutInstances() {
		return stoppedScaleOutInstances;
	}

	/**
	 * スケールアウトサーバー停止情報リストを設定します。
	 * 
	 * @param stoppedScaleOutInstances スケールアウトサーバー停止情報リスト
	 */
	public void setStoppedScaleOutInstances(List<UsageDetail> stoppedScaleOutInstances) {
		this.stoppedScaleOutInstances = stoppedScaleOutInstances;
	}

	/**
	 * スケールアウトサーバー停止情報の配列を設定し、自オブジェクトを返します。
	 * 
	 * @param stoppedScaleOutInstances スケールアウトサーバー停止情報の配列
	 * @return 自オブジェクト
	 */
	public UsageAutoScale withStoppedScaleOutInstances(UsageDetail... stoppedScaleOutInstances) {
		if (this.stoppedScaleOutInstances == null) {
			this.stoppedScaleOutInstances = new ArrayList<UsageDetail>();
		}
		for (UsageDetail stoppedScaleOutInstance : stoppedScaleOutInstances) {
			getStoppedScaleOutInstances().add(stoppedScaleOutInstance);
		}
		return this;
	}

	/**
	 * スケールアウトサーバー停止情報リストを設定し、自オブジェクトを返します。
	 * 
	 * @param stoppedScaleOutInstances スケールアウトサーバー停止情報リスト
	 * @return 自オブジェクト
	 */
	public UsageAutoScale withStoppedScaleOutInstances(List<UsageDetail> stoppedScaleOutInstances) {
		if (this.stoppedScaleOutInstances == null) {
			this.stoppedScaleOutInstances = new ArrayList<UsageDetail>();
		}
		if (stoppedScaleOutInstances != null) {
			getStoppedScaleOutInstances().addAll(stoppedScaleOutInstances);
		}
		return this;
	}

	/**
	 * スケールアウトサーバー起動時OS利用情報リストを取得します。
	 * 
	 * @return スケールアウトサーバー起動時OS利用情報リスト
	 */
	public List<UsageDetail> getRunningScaleOutOses() {
		return runningScaleOutOses;
	}

	/**
	 * スケールアウトサーバー起動時OS利用情報リストを設定します。
	 * 
	 * @param runningScaleOutOses スケールアウトサーバー起動時OS利用情報リスト
	 */
	public void setRunningScaleOutOses(List<UsageDetail> runningScaleOutOses) {
		this.runningScaleOutOses = runningScaleOutOses;
	}

	/**
	 * スケールアウトサーバー起動時OS利用情報の配列を設定し、自オブジェクトを返します。
	 * 
	 * @param runningScaleOutOses スケールアウトサーバー起動時OS利用情報の配列
	 * @return 自オブジェクト
	 */
	public UsageAutoScale withRunningScaleOutOses(UsageDetail... runningScaleOutOses) {
		if (this.runningScaleOutOses == null) this.runningScaleOutOses = new ArrayList<UsageDetail>();
		for (UsageDetail runningScaleOutOs : runningScaleOutOses) {
			getRunningScaleOutOses().add(runningScaleOutOs);
		}
		return this;
	}

	/**
	 * スケールアウトサーバー起動時OS利用情報リストを設定し、自オブジェクトを返します。
	 * 
	 * @param runningScaleOutOses スケールアウトサーバー起動時OS利用情報リスト
	 * @return 自オブジェクト
	 */
	public UsageAutoScale withRunningScaleOutOses(List<UsageDetail> runningScaleOutOses) {
		if (this.runningScaleOutOses == null) this.runningScaleOutOses = new ArrayList<UsageDetail>();
		if (runningScaleOutOses != null) {
			getRunningScaleOutOses().addAll(runningScaleOutOses);
		}
		return this;
	}

	/**
	 * スケールアウトサーバー停止時OS利用情報リストを取得します。
	 * 
	 * @return スケールアウトサーバー停止時OS利用情報リスト
	 */
	public List<UsageDetail> getStoppedScaleOutOses() {
		return stoppedScaleOutOses;
	}

	/**
	 * スケールアウトサーバー停止時OS利用情報リスト設定します。
	 * 
	 * @param stoppedScaleOutOses スケールアウトサーバー停止時OS利用情報リスト
	 */
	public void setStoppedScaleOutOses(List<UsageDetail> stoppedScaleOutOses) {
		this.stoppedScaleOutOses = stoppedScaleOutOses;
	}

	/**
	 * スケールアウトサーバー停止時OS利用情報の配列を設定し、自オブジェクトを返します。
	 * 
	 * @param stoppedScaleOutOses スケールアウトサーバー停止時OS利用情報の配列
	 * @return 自オブジェクト
	 */
	public UsageAutoScale withStoppedScaleOutOses(UsageDetail... stoppedScaleOutOses) {
		if (this.stoppedScaleOutOses == null) this.stoppedScaleOutOses = new ArrayList<UsageDetail>();
		for (UsageDetail stoppedScaleOutOs : stoppedScaleOutOses) {
			getStoppedScaleOutOses().add(stoppedScaleOutOs);
		}
		return this;
	}

	/**
	 * スケールアウトサーバー停止時OS利用情報リストを設定し、自オブジェクトを返します。
	 * 
	 * @param stoppedScaleOutOses スケールアウトサーバー停止時OS利用情報リスト
	 * @return 自オブジェクト
	 */
	public UsageAutoScale withStoppedScaleOutOses(List<UsageDetail> stoppedScaleOutOses) {
		if (this.stoppedScaleOutOses == null) this.stoppedScaleOutOses = new ArrayList<UsageDetail>();
		if (stoppedScaleOutOses != null) {
			getStoppedScaleOutOses().addAll(stoppedScaleOutOses);
		}
		return this;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("[autoScaleCount=");
		builder.append(autoScaleCount);
		builder.append(", runningScaleOutInstances=");
		builder.append(runningScaleOutInstances);
		builder.append(", stoppedScaleOutInstances=");
		builder.append(stoppedScaleOutInstances);
		builder.append(", runningScaleOutOses=");
		builder.append(runningScaleOutOses);
		builder.append(", stoppedScaleOutOses");
		builder.append(stoppedScaleOutOses);
		builder.append("]");
		return builder.toString();
	}
}
