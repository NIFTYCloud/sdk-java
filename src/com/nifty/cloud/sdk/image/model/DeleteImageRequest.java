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
package com.nifty.cloud.sdk.image.model;

import com.nifty.cloud.sdk.Request;
import com.nifty.cloud.sdk.annotation.Action;
import com.nifty.cloud.sdk.annotation.Query;

/**
 * DeleteImageリクエストクラス。<br />
 * このクラスはDeleteImageへのリクエストを構築します。
 */
@Action("DeleteImage")
public class DeleteImageRequest implements Request {
	
	/** OSイメージID */
	private String imageId;

	/**
	 * デフォルトコンストラクタ。
	 */
	public DeleteImageRequest() {
	}

	/**
	 * OSイメージIDを指定し、DeleteImageRequestを構築します。
	 * 
	 * @param imageId OSイメージID
	 */
	public DeleteImageRequest(String imageId) {
		this.imageId = imageId;
	}

	
	/**
	 * OSイメージIDを取得します。
	 * 
	 * @return OSイメージID
	 */
	@Query(name="ImageId", require=true)	
	public String getImageId() {
		return imageId;
	}
	/**
	 * OSイメージIDを設定します。
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
	public DeleteImageRequest withImageId(String imageId) {
		setImageId(imageId);
		return this;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("[imageId=");
		builder.append(imageId);
		builder.append("]");
		return builder.toString();
	}
	
	
}
