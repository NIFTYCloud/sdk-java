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
package com.nifty.cloud.sdk.tools;

import com.nifty.cloud.sdk.ErrorResult;
import com.nifty.cloud.sdk.NiftyClientException;
import com.nifty.cloud.sdk.Result;
import com.nifty.cloud.sdk.Response;
import com.nifty.cloud.sdk.annotation.Xml2Response;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

/**
 * XMLユーティリティクラス。<br />
 * XMLをJavaクラスへ変換するクラスです。
 */
public final class XmlUtils {

	/**
	 * XMLからJava Beanへ変換を行います。
	 *  
	 * @param xml 変換を行うXML
	 * @param clazz 変換後のClass
	 * @return 変換されたJavaオブジェクト
	 */
	public static Result xml2Bean(String xml, Class<? extends Result> clazz) {

		try {		

			Class<?> targetClass = clazz;
			Xml2Response proxyClass = clazz.getAnnotation(Xml2Response.class);
			if (proxyClass != null) {
				targetClass = proxyClass.response();
			}

			XStream xstream = new XStream(new DomDriver());
			xstream.processAnnotations(new Class[] {targetClass, ErrorResult.class});
			Object result = xstream.fromXML(xml);
			return (Result) ((proxyClass != null && result instanceof Response) ? ((Response)result).getResult() : result);
			
		} catch (Exception e) {
			throw new NiftyClientException(e);
		}
	}
	
}
