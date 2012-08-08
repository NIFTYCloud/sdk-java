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
 *  API Version: 1.9
 *  Date: 2011-11-29 14:07:10
 * 
 */
package com.nifty.cloud.sdk.loadbalancer.model.transform;

import java.util.List;

import com.nifty.cloud.sdk.loadbalancer.model.LoadBalancerOption;
import com.nifty.cloud.sdk.loadbalancer.model.MobileFilterOption;
import com.nifty.cloud.sdk.loadbalancer.model.SessionStickinessPolicyOption;
import com.nifty.cloud.sdk.loadbalancer.model.SorryPageOption;
import com.thoughtworks.xstream.converters.Converter;
import com.thoughtworks.xstream.converters.MarshallingContext;
import com.thoughtworks.xstream.converters.UnmarshallingContext;
import com.thoughtworks.xstream.io.HierarchicalStreamReader;
import com.thoughtworks.xstream.io.HierarchicalStreamWriter;

/**
 * Option変換クラス。<br />
 * このクラスはレスポンスXMLのOption要素からLoadBalancerOptionクラスを生成します。
 */
public class LoadBalancerOptionConverter implements Converter {

	private static final String ELEMENT_SESSION = "SessionStickinessPolicy";
	private static final String ELEMENT_SORRYPAGE = "SorryPage";
	private static final String ELEMENT_MOBILEFILTER = "MobileFilter";

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
	 * OptionをLoadBalancerOptionクラスに変換します。
	 * 
	 * @param reader XML読込リーダ
	 * @param context 
	 * @return LoadBalancerOptionオブジェクト
	 * 
	 * @see com.thoughtworks.xstream.converters.Converter#unmarshal(HierarchicalStreamReader, UnmarshallingContext)
	 */   
	@Override
    public Object unmarshal(HierarchicalStreamReader reader, UnmarshallingContext context) {
		LoadBalancerOption loadBalancerOption = new LoadBalancerOption();

		Converter sessionSticknessPolicyConverter = new SessionStickinessPolicyConverter();
		Converter sorryPageConverter = new SorryPageConverter();
		Converter mobileFilterConverter = new MobileFilterConverter();
		
    	String name = null;
       	while(reader.hasMoreChildren()) {
       		reader.moveDown();
       			
       		name = reader.getNodeName();
       		if (name.equals(ELEMENT_SESSION)) {			//converter
       			loadBalancerOption.setSessionStickinessPolicy((SessionStickinessPolicyOption) sessionSticknessPolicyConverter.unmarshal(reader, context));
       		}
       		else if (name.equals(ELEMENT_SORRYPAGE)) {		//converter
       			loadBalancerOption.setSorryPage((SorryPageOption) sorryPageConverter.unmarshal(reader, context));
       		}
       		else if (name.equals(ELEMENT_MOBILEFILTER)) {		//converter
       			loadBalancerOption.setMobileFilter((MobileFilterOption) mobileFilterConverter.unmarshal(reader, context));
       		}
           	reader.moveUp();
       	}
       	
       	return loadBalancerOption;
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
