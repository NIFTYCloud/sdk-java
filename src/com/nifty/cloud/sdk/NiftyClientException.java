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
package com.nifty.cloud.sdk;

/**
 * SDK内部例外クラス。<br />
 * SDK内部でエラーが発生した際に使用する例外クラスです。
 */
public class NiftyClientException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	/**
	 *　 SDK内部例外クラスを構築します。
	 *
	 */
	public NiftyClientException() {
		super();
	}

	/**
	 *　メッセージを指定し、 SDK内部例外クラスを構築します。
	 *
	 * @param message  メッセージ
	 */
	public NiftyClientException(String message) {
		super(message);
	}

	/**
	 *　原因を指定し、 SDK内部例外クラスを構築します。
	 *
	 * @param cause 原因
	 */
	public NiftyClientException(Throwable cause) {
		super(cause);
	}

	/**
	 *　メッセージ及び原因を指定し、 SDK内部例外クラスを構築します。
	 *
	 * @param message  メッセージ
	 * @param cause 原因
	 */
	public NiftyClientException(String message, Throwable cause) {
		super(message, cause);
	}

}
