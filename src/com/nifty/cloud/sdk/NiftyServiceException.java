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
package com.nifty.cloud.sdk;

/**
 * NIFTY Cloud API例外クラス。<br />
 * NIFTY Cloud APIでエラーが発生した際に使用する例外クラスです。

 */
public class NiftyServiceException extends NiftyClientException {

	private static final long serialVersionUID = 1L;

	/**
	 * NIFTY Cloud API例外クラスを構築します。
	 */
	public NiftyServiceException() {
		super();
	}

	/**
	 *　メッセージを指定し、 NIFTY Cloud API内部例外クラスを構築します。
	 *
	 * @param message メッセージ
	 */
	public NiftyServiceException(String message) {
		super(message);
	}

	/**
	 *　原因を指定し、 NIFTY Cloud API内部例外クラスを構築します。
	 *
	 * @param cause 原因
	 */
	public NiftyServiceException(Throwable cause) {
		super(cause);
	}

	/**
	 *　メッセージ及び原因を指定し、 NIFTY Cloud API内部例外クラスを構築します。
	 *
	 * @param message メッセージ
	 * @param cause 原因
	 */
	public NiftyServiceException(String message, Throwable cause) {
		super(message, cause);
	}

}
