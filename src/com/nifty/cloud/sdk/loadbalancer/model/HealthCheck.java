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
package com.nifty.cloud.sdk.loadbalancer.model;

import com.nifty.cloud.sdk.annotation.Query;
import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * ヘルスチェックの設定情報クラス。<br />
 * このクラスはヘルスチェックの設定情報を格納します。
 */
public class HealthCheck {

	/** PINGプロトコル:ポート番号 */
	@XStreamAlias("Target")
	private String	target;
	
	/** ヘルスチェック間隔 */
	@XStreamAlias("Interval")
	private Integer	interval;
	
	/** タイムアウト秒数  */
	@XStreamAlias("Timeout")
	private Integer	timeout;
	
	/** ヘルスチェック回数の閾値 */
	@XStreamAlias("UnhealthyThreshold")
	private Integer	unhealthyThreshold;
	
	/** 復旧判断回数 */
	@XStreamAlias("HealthyThreshold")
	private Integer	healthyThreshold;
	
	
	/**
	 * PINGプロトコル:ポート番号を取得します。
	 * 
	 * @return PINGプロトコル:ポート番号
	 */
	@Query(name="Target", require=true)	
	public String getTarget() {
		return target;
	}
	/**
	 * PINGプロトコル:ポート番号を設定します。
	 * 
	 * @param target PINGプロトコル:ポート番号
	 */
	public void setTarget(String target) {
		this.target = target;
	}
	/**
	 * PINGプロトコル:ポート番号を設定し、自オブジェクトを返します。
	 *
	 * @param target PINGプロトコル:ポート番号
	 * @return 自オブジェクト
	 */
	public HealthCheck withTarget(String target) {
		setTarget(target);
		return this;
	}
	
	/**
	 * ヘルスチェック間隔を取得します。
	 * 
	 * @return ヘルスチェック間隔
	 */
	@Query(name="Interval", require=true)	
	public Integer getInterval() {
		return interval;
	}
	/**
	 * ヘルスチェック間隔を設定します。
	 * 
	 * @param interval ヘルスチェック間隔
	 */
	public void setInterval(Integer interval) {
		this.interval = interval;
	}
	/**
	 * ヘルスチェック間隔を設定し、自オブジェクトを返します。
	 *
	 * @param interval ヘルスチェック間隔
	 * @return 自オブジェクト
	 */
	public HealthCheck withInterval(Integer interval) {
		setInterval(interval);
		return this;
	}
	
	/**
	 * タイムアウト秒数を取得します。
	 * 
	 * @return タイムアウト秒数
	 */
	@Query(name="Timeout")
	public Integer getTimeout() {
		return timeout;
	}
	/**
	 * タイムアウト秒数を設定します。
	 * 
	 * @param timeout タイムアウト秒数
	 */
	public void setTimeout(Integer timeout) {
		this.timeout = timeout;
	}
	/**
	 * タイムアウト秒数を設定し、自オブジェクトを返します。
	 *
	 * @param timeout タイムアウト秒数
	 * @return 自オブジェクト
	 */
	public HealthCheck withTimeout(Integer timeout) {
		setTimeout(timeout);
		return this;
	}
	
	/**
	 * ヘルスチェック回数の閾値を取得します。
	 * 
	 * @return ヘルスチェック回数の閾値
	 */
	@Query(name="UnhealthyThreshold", require=true)	
	public Integer getUnhealthyThreshold() {
		return unhealthyThreshold;
	}
	/**
	 * ヘルスチェック回数の閾値を設定します。
	 * 
	 * @param unhealthyThreshold ヘルスチェック回数の閾値
	 */
	public void setUnhealthyThreshold(Integer unhealthyThreshold) {
		this.unhealthyThreshold = unhealthyThreshold;
	}
	/**
	 * ヘルスチェック回数の閾値を設定し、自オブジェクトを返します。
	 *
	 * @param unhealthyThreshold ヘルスチェック回数の閾値
	 * @return 自オブジェクト
	 */
	public HealthCheck withUnhealthyThreshold(Integer unhealthyThreshold) {
		setUnhealthyThreshold(unhealthyThreshold);
		return this;
	}
	
	/**
	 * 復旧判断回数を取得します。
	 * 
	 * @return 復旧判断回数
	 */
	@Query(name="HealthyThreshold")
	public Integer getHealthyThreshold() {
		return healthyThreshold;
	}
	/**
	 * 復旧判断回数を設定します。
	 * 
	 * @param healthyThreshold 復旧判断回数
	 */
	public void setHealthyThreshold(Integer healthyThreshold) {
		this.healthyThreshold = healthyThreshold;
	}
	/**
	 * 復旧判断回数を設定し、自オブジェクトを返します。
	 *
	 * @param healthyThreshold 復旧判断回数
	 * @return 自オブジェクト
	 */
	public HealthCheck withHealthyThreshold(Integer healthyThreshold) {
		setHealthyThreshold(healthyThreshold);
		return this;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("[target=");
		builder.append(target);
		builder.append(", interval=");
		builder.append(interval);
		builder.append(", timeout=");
		builder.append(timeout);
		builder.append(", unhealthyThreshold=");
		builder.append(unhealthyThreshold);
		builder.append(", healthyThreshold=");
		builder.append(healthyThreshold);
		builder.append("]");
		return builder.toString();
	}

}
