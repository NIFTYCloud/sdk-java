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

import com.nifty.cloud.sdk.annotation.Query;

/**
 * OSイメージ情報クラス。 <br />
 * このクラスはOSイメージ情報を格納します。
 */
public class DescribeImagesInfo {

	/** OSイメージID */
	private String imageId;
	
	/** OSイメージ名 */
	private String imageName;
	
	/**
	 * OSイメージIDを取得します。
	 * 
	 * @return OSイメージID
	 */
	@Query(name="ImageId", reverseSequence=true)		
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
	public DescribeImagesInfo withImageId(String imageId) {
		setImageId(imageId);
		return this;
	}
	
	/**
	 * OSイメージ名を取得します。
	 * 
	 * @return OSイメージ名
	 */
	@Query(name="ImageName", reverseSequence=true)	
	public String getImageName() {
		return imageName;
	}
	/**
	 * OSイメージ名を設定します。
	 * 
	 * @param imageName OSイメージ名
	 */
	public void setImageName(String imageName) {
		this.imageName = imageName;
	}
	/**
	 * OSイメージ名を設定し、自オブジェクトを返します。
	 * 
	 * @param imageName OSイメージ名
	 * @return 自オブジェクト
	 */
	public DescribeImagesInfo withImageName(String imageName) {
		setImageName(imageName);
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
		builder.append(", imageName=");
		builder.append(imageName);
		builder.append("]");
		return builder.toString();
	}

}
