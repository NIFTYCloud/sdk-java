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
 *  API Version: 1.18
 *  Date: 2014-05-23 17:00:00
 * 
 */
package com.nifty.cloud.sdk.image.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.nifty.cloud.sdk.Result;
import com.nifty.cloud.sdk.image.model.transform.DescribeImagesConverter;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamConverter;

/**
 * DescribeImages処理結果クラス。<br />
 * このクラスはDescribeImagesのレスポンスを格納します。
 */
@XStreamAlias("DescribeImagesResponse")
public class DescribeImagesResult extends Result {
	
	/** リクエスト識別子 */
	@XStreamAlias("requestId")	
	private String requestId;

	/** OSイメージ情報リスト */
	@XStreamAlias("imagesSet")
	@XStreamConverter(DescribeImagesConverter.class)
	private List<Image> images;
	
	/**
	 * リクエスト識別子を取得します。
	 * 
	 * @return リクエスト識別子
	 */
	public String getRequestId() {
		return requestId;
	}
	/**
	 * リクエスト識別子を設定します。
	 * 
	 * @param requestId リクエスト識別子
	 */
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}
	/**
	 * リクエスト識別子を設定し、自オブジェクトを返します。
	 * 
	 * @param requestId リクエスト識別子
	 * @return 自オブジェクト
	 */
	public DescribeImagesResult withRequestId(String requestId) {
		setRequestId(requestId);
		return this;
	}
	
	/**
	 * OSイメージ情報リストを取得します。
	 * 
	 * @return OSイメージ情報リスト
	 */
	public List<Image> getImages() {
		return images;
	}
	/**
	 * OSイメージ情報リストを設定します。
	 * 
	 * @param images OSイメージ情報リスト
	 */
	public void setImages(List<Image> images) {
		this.images = images;
	}
	/**
	 * OSイメージ情報の配列を設定し、自オブジェクトを返します。
	 * 
	 * @param images OSイメージ情報の配列
	 * @return 自オブジェクト
	 */
	public DescribeImagesResult withImages(Image ... images) {
		if(this.images == null) this.images = new ArrayList<Image>();
		for(Image image: images) {
			getImages().add(image);
		}
		return this;
	}
	/**
	 * OSイメージ情報リストを設定し、自オブジェクトを返します。
	 * 
	 * @param images OSイメージ情報リスト
	 * @return 自オブジェクト
	 */
	public DescribeImagesResult withImages(Collection<Image> images) {
		if(this.images == null) this.images = new ArrayList<Image>();
		if (images!=null) {
			getImages().addAll(images);
		}
		return this;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("[requestId=");
		builder.append(requestId);
		builder.append(", images=");
		builder.append(images);
		builder.append("]");
		return builder.toString();
	}

}
