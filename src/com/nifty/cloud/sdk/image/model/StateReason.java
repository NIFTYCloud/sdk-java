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

/**
 * ステータス情報クラス。<br />
 * このクラスはステータス情報を格納します。
 */
public class StateReason {
	
	/** ステータスコード */
	private String	code;
	
	/** メッセージ */
	private String	message;
	
	/**
	 * ステータスコードを取得します。
	 * 
	 * @return ステータスコード
	 */
	public String getCode() {
		return code;
	}
	/**
	 * ステータスコードを設定します。
	 * 
	 * @param code ステータスコード
	 */
	public void setCode(String code) {
		this.code = code;
	}
	/**
	 * ステータスコードを設定し、自オブジェクトを返します。
	 * 
	 * @param code ステータスコード
	 * @return 自オブジェクト
	 */
	public StateReason withCode(String code) {
		setCode(code);
		return this;
	}
	
	/**
	 * メッセージを取得します。
	 * 
	 * @return メッセージ
	 */
	public String getMessage() {
		return message;
	}
	/**
	 * メッセージを設定します。
	 * 
	 * @param message メッセージ
	 */
	public void setMessage(String message) {
		this.message = message;
	}
	/**
	 * メッセージを設定し、自オブジェクトを返します。
	 * 
	 * @param message メッセージ
	 * @return 自オブジェクト
	 */
	public StateReason withMessage(String message) {
		setMessage(message);
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
		builder.append(", message=");
		builder.append(message);
		builder.append("]");
		return builder.toString();
	}
	
}
