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

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * クラウドストレージ利用情報クラス。<br />
 * このクラスはクラウドストレージ利用情報を格納します。
 */
public class UsageStorage {

	/** クラウドストレージ月額利用情報 */
	@XStreamAlias("storageMonthlyRate")
	private UsageDetail storageMonthlyRate;

	/** クラウドストレージ従量利用情報 */
	@XStreamAlias("storageMeasuredRate")
	private UsageDetailDouble storageMeasuredRate;

	/**
	 * クラウドストレージ月額利用情報を取得します。
	 * 
	 * @return クラウドストレージ月額利用情報
	 */
	public UsageDetail getStorageMonthlyRate() {
		return storageMonthlyRate;
	}

	/**
	 * クラウドストレージ月額利用情報を設定します。
	 * 
	 * @param storageMonthlyRate クラウドストレージ月額利用情報
	 */
	public void setStorageMonthlyRate(UsageDetail storageMonthlyRate) {
		this.storageMonthlyRate = storageMonthlyRate;
	}

	/**
	 * クラウドストレージ月額利用情報を設定し、自オブジェクトを返します。
	 * 
	 * @param storageMonthlyRate クラウドストレージ月額利用情報
	 * @return 自オブジェクト
	 */
	public UsageStorage withStorageMonthlyRate(UsageDetail storageMonthlyRate) {
		setStorageMonthlyRate(storageMonthlyRate);
		return this;
	}

	/**
	 * クラウドストレージ従量利用情報を取得します。
	 * 
	 * @return クラウドストレージ従量利用情報
	 */
	public UsageDetailDouble getStorageMeasuredRate() {
		return storageMeasuredRate;
	}

	/**
	 * クラウドストレージ従量利用情報を設定します。
	 * 
	 * @param storageMeasuredRate クラウドストレージ従量利用情報
	 */
	public void setStorageMeasuredRate(UsageDetailDouble storageMeasuredRate) {
		this.storageMeasuredRate = storageMeasuredRate;
	}

	/**
	 * クラウドストレージ従量利用情報を設定し、自オブジェクトを返します。
	 * 
	 * @param storageMeasuredRate クラウドストレージ従量利用情報
	 * @return 自オブジェクト
	 */
	public UsageStorage withStorageMeasuredRate(UsageDetailDouble storageMeasuredRate) {
		setStorageMeasuredRate(storageMeasuredRate);
		return this;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("[storageMonthlyRate=");
		builder.append(storageMonthlyRate);
		builder.append(", storageMeasuredRate=");
		builder.append(storageMeasuredRate);
		builder.append("]");
		return builder.toString();
	}
}
