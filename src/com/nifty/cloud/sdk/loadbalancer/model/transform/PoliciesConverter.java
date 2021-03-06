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
package com.nifty.cloud.sdk.loadbalancer.model.transform;

import java.util.List;

import com.nifty.cloud.sdk.loadbalancer.model.AppCookieStickinessPolicy;
import com.nifty.cloud.sdk.loadbalancer.model.LBCookiesStickinessPolicy;
import com.nifty.cloud.sdk.loadbalancer.model.Policies;
import com.thoughtworks.xstream.converters.Converter;
import com.thoughtworks.xstream.converters.MarshallingContext;
import com.thoughtworks.xstream.converters.UnmarshallingContext;
import com.thoughtworks.xstream.io.HierarchicalStreamReader;
import com.thoughtworks.xstream.io.HierarchicalStreamWriter;

/**
 * Policies変換クラス。<br />
 * このクラスはレスポンスXMLのPolicies要素からPoliciesクラスを生成します。
 */
public class PoliciesConverter implements Converter {
	
	private static final String ELEMENT_APP_COOKIE_STICKINESS_POLICIES = "AppCookieStickinessPolicies";
	private static final String ELEMENT_LB_COOKIE_STICKINESS_POLICIES  = "LBCookieStickinessPolicies";
	
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
    	return clazz == Policies.class;
    }

	/**
	 * PoliciesをPoliciesクラスに変換します。
	 * 
	 * @param reader XML読込リーダ
	 * @param context 
	 * @return Policiesオブジェクト
	 * 
	 * @see com.thoughtworks.xstream.converters.Converter#unmarshal(HierarchicalStreamReader, UnmarshallingContext)
	 */   
	@SuppressWarnings("unchecked")
	@Override
    public Object unmarshal(HierarchicalStreamReader reader, UnmarshallingContext context) {
		Policies policies = new Policies();
		
		Converter appCookieStickinessPoliciesConverter = new AppCookieStickinessPoliciesConverter();
		Converter lbCookieStickinessPoliciesConverter = new LBCookieStickinessPoliciesConverter();
    	String name = null;
       	while(reader.hasMoreChildren()) {
       		reader.moveDown();
       		
       		name = reader.getNodeName();
       		if (name.equals(ELEMENT_APP_COOKIE_STICKINESS_POLICIES)) {
       			policies.setAppCookieStickinessPolicies((List<AppCookieStickinessPolicy>) appCookieStickinessPoliciesConverter.unmarshal(reader, context));
       		}
       		else if (name.equals(ELEMENT_LB_COOKIE_STICKINESS_POLICIES)) {
       			policies.setLBCookiesStickinessPolicies((List<LBCookiesStickinessPolicy>) lbCookieStickinessPoliciesConverter.unmarshal(reader, context));
       		}

   			reader.moveUp();
       	}
       	
       	return policies;
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
