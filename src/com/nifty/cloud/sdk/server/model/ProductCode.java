/******************************************************************************* 
 *  Copyright 2011 NIFTY Corporation All Rights Reserved.
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
 *  API Version: 1.9
 *  Date: 2011-08-25 09:46:38
 * 
 */
package com.nifty.cloud.sdk.server.model;

/**
 * ProductCodeクラス。<br />
 * このクラスはProductCodeを格納します。
 */
public class ProductCode {
	
	private String	productCodeId;

	/**
	 * productCodeIdを取得します。
	 * 
	 * @return productCodeId
	 */
	public String getProductCodeId() {
		return productCodeId;
	}
	/**
	 * productCodeIdを設定します。
	 * 
	 * @param productCodeId
	 */
	public void setProductCodeId(String productCodeId) {
		this.productCodeId = productCodeId;
	}
	/**
	 * productCodeIdを設定し、自オブジェクトを返します。
	 *
	 * @param productCodeId
	 * @return 自オブジェクト	 
	 */
	public ProductCode withProductCodeId(String productCodeId) {
		setProductCodeId(productCodeId);
		return this;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("[productCodeId=");
		builder.append(productCodeId);
		builder.append("]");
		return builder.toString();
	}	
	
}
