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
package com.nifty.cloud.sdk.loadbalancer.model;

import com.nifty.cloud.sdk.Result;
import com.nifty.cloud.sdk.annotation.Xml2Response;
import com.nifty.cloud.sdk.loadbalancer.model.transform.ConfigureHealthCheckResponse;
import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * ConfigureHealthCheck結果処理クラス。<br />
 * このクラスはConfigureHealthCheckのレスポンスを格納します。
 */
@Xml2Response(response=ConfigureHealthCheckResponse.class)
public class ConfigureHealthCheckResult extends Result {
	/** ヘルスチェック情報 */
	@XStreamAlias("HealthCheck")
	private HealthCheck healthCheck;

	/**
	 * ヘルスチェック情報を取得します。
	 * 
	 * @return ヘルスチェック情報
	 */
	public HealthCheck getHealthCheck() {
		return healthCheck;
	}
	/**
	 * ヘルスチェック情報を設定します。
	 * 
	 * @param healthCheck ヘルスチェック情報
	 */
	public void setHealthCheck(HealthCheck healthCheck) {
		this.healthCheck = healthCheck;
	}
	/**
	 * ヘルスチェック情報を設定し、自オブジェクトを返します。
	 *
	 * @param healthCheck ヘルスチェック情報
	 * @return 自オブジェクト
	 */
	public ConfigureHealthCheckResult withHealthCheck(HealthCheck healthCheck) {
		setHealthCheck(healthCheck);
		return this;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("[HealthCheck=");
		builder.append(healthCheck);
		builder.append("]");
		return builder.toString();
	}

}
