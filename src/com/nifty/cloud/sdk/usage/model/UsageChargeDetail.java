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
package com.nifty.cloud.sdk.usage.model;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * 利用料金明細情報クラス。<br />
 * このクラスは利用料金明細情報を格納します。
 */
public class UsageChargeDetail {

	/** 利用料金明細情報 */
	@XStreamAlias("chargeDetail")
	private UsageDetail chargeDetail;

	/**
	 * 利用料金明細情報を取得します。
	 * 
	 * @return 利用料金明細情報
	 */
	public UsageDetail getChargeDetail() {
		return chargeDetail;
	}

	/**
	 * 利用料金明細情報を設定します。
	 * 
	 * @param chargeDetail 利用料金明細情報
	 */
	public void setChargeDetail(UsageDetail chargeDetail) {
		this.chargeDetail = chargeDetail;
	}

	/**
	 * 利用料金明細情報を設定し、自オブジェクトを返します。
	 * 
	 * @param chargeDetail 利用料金明細情報
	 * @return 自オブジェクト
	 */
	public UsageChargeDetail withChargeDetail(UsageDetail chargeDetail) {
		setChargeDetail(chargeDetail);
		return this;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("[chargeDetail=");
		builder.append(chargeDetail);
		builder.append("]");
		return builder.toString();
	}
}
