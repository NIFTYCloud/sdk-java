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
package com.nifty.cloud.sdk.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import com.nifty.cloud.sdk.Response;


/**
 * XML->Java変換クラス指定アノテーション<br />
 * XMLからResponseクラスを継承したクラスに変換する場合指定します。
 * 
 */
@Retention(RetentionPolicy.RUNTIME)
@Target( {ElementType.TYPE })
public @interface Xml2Response {
	
	/**
	 * 変換されるクラスを取得します。
	 * 
	 * @return Responseを実装した変換クラス
	 */
	public abstract Class<? extends Response> response();
}
