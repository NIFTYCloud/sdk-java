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
package com.nifty.cloud.sdk.server.model;

/**
 * サーバーステータス情報クラス。<br />
 * このクラスはサーバーステータス情報を格納します。
 */
public class InstanceState {
	
	/** ステータスコード */
	private Integer	code;
	/** ステータス名 */
	private String	name;
	
	/**
	 * ステータスコードを取得します。
	 * 
	 * @return ステータスコード
	 */
	public Integer getCode() {
		return code;
	}
	/**
	 * ステータスコードを設定します。
	 * 
	 * @param code ステータスコード
	 */
	public void setCode(Integer code) {
		this.code = code;
	}
	/**
	 * ステータスコードを設定し、自オブジェクトを返します。
	 *
	 * @param code ステータスコード
	 * @return 自オブジェクト	 
	 */
	public InstanceState withCode(Integer code) {
		setCode(code);
		return this;
	}	
	
	/**
	 * ステータス名を取得します。
	 * 
	 * @return ステータス名
	 */
	public String getName() {
		return name;
	}
	/**
	 * ステータス名を設定します。
	 * 
	 * @param name ステータス名
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * ステータス名を設定し、自オブジェクトを返します。
	 *
	 * @param name ステータス名
	 * @return 自オブジェクト	 
	 */
	public InstanceState withName(String name) {
		setName(name);
		return this;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("[code=");
		builder.append(code);
		builder.append(", name=");
		builder.append(name);
		builder.append("]");
		return builder.toString();
	}

}
