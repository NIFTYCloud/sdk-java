/******************************************************************************* 
 *  Copyright 2012 NIFTY Corporation All Rights Reserved.
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
 *  API Version: 1.12
 *  Date: 2012-12-21 17:00:00
 * 
 */
package com.nifty.cloud.sdk.usage.model;

import java.util.ArrayList;
import java.util.List;

import com.nifty.cloud.sdk.usage.model.transform.UsageDetailSetConverter;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamConverter;

/**
 * イメージ情報クラス。<br />
 * このクラスはイメージ情報を格納します。
 */
public class UsageImage {

	/** サーバーイメージ化情報 */
	@XStreamAlias("createImage")
	private UsageDetail createImage;

	/** イメージ保存情報リスト */
	@XStreamAlias("keepImageSet")
	@XStreamConverter(UsageDetailSetConverter.class)
	private List<UsageDetail> keepImages;

	/**
	 * サーバーイメージ化情報を取得します。
	 * 
	 * @return サーバーイメージ化情報
	 */
	public UsageDetail getCreateImage() {
		return createImage;
	}

	/**
	 * サーバーイメージ化情報を設定します。
	 * 
	 * @param createImage サーバーイメージ化情報
	 */
	public void setCreateImage(UsageDetail createImage) {
		this.createImage = createImage;
	}

	/**
	 * サーバーイメージ化情報を設定し、自オブジェクトを返します。
	 * 
	 * @param createImage サーバーイメージ化情報
	 * @return 自オブジェクト
	 */
	public UsageImage withCreateImage(UsageDetail createImage) {
		setCreateImage(createImage);
		return this;
	}

	/**
	 * イメージ保存情報リストを取得します。
	 * 
	 * @return イメージ保存情報リスト
	 */
	public List<UsageDetail> getKeepImages() {
		return keepImages;
	}

	/**
	 * イメージ保存情報リストを設定します。
	 * 
	 * @param keepImages イメージ保存情報リスト
	 */
	public void setKeepImages(List<UsageDetail> keepImages) {
		this.keepImages = keepImages;
	}

	/**
	 * イメージ保存情報の配列を設定し、自オブジェクトを返します。
	 * 
	 * @param keepImages イメージ保存情報の配列
	 * @return 自オブジェクト
	 */
	public UsageImage withKeepImages(UsageDetail... keepImages) {
		if (this.keepImages == null) this.keepImages = new ArrayList<UsageDetail>();
		for (UsageDetail keepImage : keepImages) {
			getKeepImages().add(keepImage);
		}
		return this;
	}

	/**
	 * イメージ保存情報リストを設定し、自オブジェクトを返します。
	 * 
	 * @param keepImages イメージ保存情報リスト
	 * @return 自オブジェクト
	 */
	public UsageImage withKeepImages(List<UsageDetail> keepImages) {
		if (this.keepImages == null) this.keepImages = new ArrayList<UsageDetail>();
		if (keepImages != null) {
			getKeepImages().addAll(keepImages);
		}
		return this;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("[createImage=");
		builder.append(createImage);
		builder.append(", keepImages=");
		builder.append(keepImages);
		builder.append("]");
		return builder.toString();
	}
}
