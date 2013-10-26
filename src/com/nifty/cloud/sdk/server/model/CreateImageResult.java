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
package com.nifty.cloud.sdk.server.model;

import com.nifty.cloud.sdk.Result;
import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * CreateImage結果処理クラス。<br />
 * このクラスはCreateImageのレスポンスを格納します。
 */
@XStreamAlias("CreateImageResponse")
public class CreateImageResult extends Result {
	
	/** リクエスト識別子 */	
	@XStreamAlias("requestId")
	private String requestId;
	
	/** OSイメージID */
	@XStreamAlias("imageId")
	private String imageId;
	
	/** OSイメージステータス */
	@XStreamAlias("imageState")
	private String imageState;
	
	
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
	public CreateImageResult withRequestId(String requestId) {
		setRequestId(requestId);
		return this;
	}
	
	/**
	 * OSイメージIDを取得します。
	 * 
	 * @return OSイメージID
	 */
	public String getImageId() {
		return imageId;
	}
	/**
	 * OSイメージIDを設定します。
	 * 
	 * @param imageId OSイメージID
	 */
	public void setImageId(String imageId) {
		this.imageId = imageId;
	}
	/**
	 * OSイメージIDを設定し、自オブジェクトを返します。
	 *
	 * @param imageId OSイメージID
	 * @return 自オブジェクト	 
	 */
	public CreateImageResult withImageId(String imageId) {
		setImageId(imageId);
		return this;
	}
	
	/**
	 * OSイメージステータスを取得します。
	 * 
	 * @return OSイメージステータス
	 */
	public String getImageState() {
		return imageState;
	}
	/**
	 * OSイメージステータスを設定します。
	 * 
	 * @param imageState OSイメージステータス
	 */
	public void setImageState(String imageState) {
		this.imageState = imageState;
	}
	/**
	 * OSイメージステータスを設定し、自オブジェクトを返します。
	 *
	 * @param imageState OSイメージステータス
	 * @return 自オブジェクト	 
	 */
	public CreateImageResult withImageState(String imageState) {
		setImageState(imageState);
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
		builder.append(", imageId=");
		builder.append(imageId);
		builder.append(", imageState=");
		builder.append(imageState);
		builder.append("]");
		return builder.toString();
	}

}
