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
package com.nifty.cloud.sdk.server.model;

/**
 * StateReasonクラス。<br />
 * このクラスはStateReasonを格納します。
 */
public class StateReason {
	
	private String	code;
	
	private String	message;
	
	/**
	 * codeを取得します。
	 * 
	 * @return code
	 */
	public String getCode() {
		return code;
	}
	/**
	 * codeを設定します。
	 * 
	 * @param code
	 */
	public void setCode(String code) {
		this.code = code;
	}
	/**
	 * codeを設定し、自オブジェクトを返します。
	 *
	 * @param code
	 * @return 自オブジェクト	 
	 */
	public StateReason withCode(String code) {
		setCode(code);
		return this;
	}
	
	/**
	 * messageを取得します。
	 * 
	 * @return message
	 */
	public String getMessage() {
		return message;
	}
	/**
	 * messageを設定します。
	 * 
	 * @param message
	 */
	public void setMessage(String message) {
		this.message = message;
	}
	/**
	 * messageを設定し、自オブジェクトを返します。
	 *
	 * @param message
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
