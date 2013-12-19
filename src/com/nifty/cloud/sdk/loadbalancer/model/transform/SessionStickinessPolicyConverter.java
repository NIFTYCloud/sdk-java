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
package com.nifty.cloud.sdk.loadbalancer.model.transform;

import java.util.List;

import com.nifty.cloud.sdk.loadbalancer.model.SessionStickinessPolicyOption;
import com.thoughtworks.xstream.converters.Converter;
import com.thoughtworks.xstream.converters.MarshallingContext;
import com.thoughtworks.xstream.converters.UnmarshallingContext;
import com.thoughtworks.xstream.io.HierarchicalStreamReader;
import com.thoughtworks.xstream.io.HierarchicalStreamWriter;

/**
 * SessionStickinessPolicy変換クラス。<br />
 * このクラスはレスポンスXMLのSessionStickinessPolicy要素からSessionStickinessPolicyOptionクラスを生成します。
 */
public class SessionStickinessPolicyConverter implements Converter {

	private static final String ELEMENT_ENABLED = "Enabled";
	private static final String ELEMENT_EXPIRATION_PERIOD = "ExpirationPeriod";

	/**
	 * 変換可能なクラスか判定します。
	 * 
	 * @param clazz クラス
	 * @return 変換可能な場合true, 変換不可能な場合false
	 *  
	 * @see com.thoughtworks.xstream.converters.Converter#canConvert(Class)
	 */		
    @SuppressWarnings("rawtypes")
	@Override
    public boolean canConvert(Class clazz) {
       	Class[] interfaces = clazz.getInterfaces();
       	for(Class i: interfaces) {
       		if (i==List.class) {
       			return true;
       		}
       	}
       	return false;
    }
	/**
	 * SessionStickinessPolicyをSessionStickinessPolicyOptionクラスに変換します。
	 * 
	 * @param reader XML読込リーダ
	 * @param context 
	 * @return LoadBalancerOptionオブジェクト
	 * 
	 * @see com.thoughtworks.xstream.converters.Converter#unmarshal(HierarchicalStreamReader, UnmarshallingContext)
	 */   
	@Override
    public Object unmarshal(HierarchicalStreamReader reader, UnmarshallingContext context) {
		SessionStickinessPolicyOption sessionSticknessPolicy = new SessionStickinessPolicyOption();

    	String name = null;
       	while(reader.hasMoreChildren()) {
       		reader.moveDown();
       			
       		name = reader.getNodeName();
       		if (name.equals(ELEMENT_ENABLED)) {
       			sessionSticknessPolicy.setEnabled(Boolean.valueOf(reader.getValue()));
       		}
       		else if(name.equals(ELEMENT_EXPIRATION_PERIOD)) {
       			sessionSticknessPolicy.setExpirationPeriod(new Integer(reader.getValue()));
       		}
           	reader.moveUp();
       	}
       	
       	return sessionSticknessPolicy;
    }

	/**
	 * 未実装メソッド 
	 */
	@Override
	public void marshal(Object paramObject,
						HierarchicalStreamWriter paramHierarchicalStreamWriter,
						MarshallingContext paramMarshallingContext) {
	}
}
