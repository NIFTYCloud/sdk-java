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
 * SSL証明書利用情報クラス。<br />
 * このクラスはSSL証明書利用情報を格納します。
 */
public class UsageSslCert {

	/** SSL証明書作成情報リスト */
	@XStreamAlias("createSslCertSet")
	@XStreamConverter(UsageDetailSetConverter.class)
	private List<UsageDetail> createSslCerts;

	/**
	 * SSL証明書作成情報リストを取得します。
	 * 
	 * @return SSL証明書作成情報リスト
	 */
	public List<UsageDetail> getCreateSslCerts() {
		return createSslCerts;
	}

	/**
	 * SSL証明書作成情報リストを設定します。
	 * 
	 * @param createSslCerts SSL証明書作成情報リスト
	 */
	public void setCreateSslCerts(List<UsageDetail> createSslCerts) {
		this.createSslCerts = createSslCerts;
	}

	/**
	 * SSL証明書作成情報の配列を設定し、自オブジェクトを返します。
	 * 
	 * @param createSslCerts SSL証明書作成情報の配列
	 * @return 自オブジェクト
	 */
	public UsageSslCert withCreateSslCerts(UsageDetail... createSslCerts) {
		if (this.createSslCerts == null) this.createSslCerts = new ArrayList<UsageDetail>();
		for (UsageDetail createSslCert : createSslCerts) {
			getCreateSslCerts().add(createSslCert);
		}
		return this;
	}

	/**
	 * SSL証明書作成情報リストを設定し、自オブジェクトを返します。
	 * 
	 * @param createSslCerts SSL証明書作成情報リスト
	 * @return 自オブジェクト
	 */
	public UsageSslCert withCreateSslCerts(List<UsageDetail> createSslCerts) {
		if (this.createSslCerts == null) this.createSslCerts = new ArrayList<UsageDetail>();
		if (createSslCerts != null) {
			getCreateSslCerts().addAll(createSslCerts);
		}
		return this;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("[createSslCerts=");
		builder.append(createSslCerts);
		builder.append("]");
		return builder.toString();
	}
}
