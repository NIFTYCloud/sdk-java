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
 *  API Version: 1.11
 *  Date: 2011-08-25 09:46:38
 *
 */
package com.nifty.cloud.sdk;

import static com.nifty.cloud.sdk.Const.*;

/**
 * プロトコル列挙クラス。<br />
 * プロトコルに関連する情報を提供するクラスです。
 *
 */
public enum Protocol {
	/** プロトコル:HTTP */
	HTTP(PROTOCOL_HTTP),
	/** プロトコル:HTTPS */
	HTTPS(PROTOCOL_HTTPS);

	String value;

	/**
	 * プロトコル文字列を指定し、プロトコル列挙型を構築します。
	 *
	 * @param value プロトコル
	 */
	private Protocol(String value) {
		this.value = value;
	}

	/**
	 * プロトコルの検索を行います。<br />
	 * 指定されたプロトコル文字列が見つからなかった場合、HTTPSを返却します。
	 *
	 * @param value プロトコル文字列
	 * @return 検索されたプロトコル列挙型
	 */
	public static Protocol find(String value) {
		if      (HTTP.toString().equals(value) ) { return HTTP;  }
		else if (HTTPS.toString().equals(value)) { return HTTPS; }
		return HTTPS;
	}

	/*
	 * (non-Javadoc)
	 * @see java.lang.Enum#toString()
	 */
	@Override
	public String toString() {
		return value;
	}
}
