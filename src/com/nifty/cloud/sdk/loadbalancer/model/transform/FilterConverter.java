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
package com.nifty.cloud.sdk.loadbalancer.model.transform;

import java.util.List;

import com.nifty.cloud.sdk.loadbalancer.model.Filter;
import com.thoughtworks.xstream.converters.Converter;
import com.thoughtworks.xstream.converters.MarshallingContext;
import com.thoughtworks.xstream.converters.UnmarshallingContext;
import com.thoughtworks.xstream.io.HierarchicalStreamReader;
import com.thoughtworks.xstream.io.HierarchicalStreamWriter;

/**
 * Filter変換クラス。<br />
 * このクラスはレスポンスXMLのFilter要素からFilterクラスを生成します。
 */
public class FilterConverter implements Converter {
	
	private static final String ELEMENT_FILTER_TYPE = "FilterType";
	private static final String ELEMENT_IP_ADDRESSES = "IPAddresses";

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
    	return clazz == Filter.class;
    }

	/**
	 * FilterをFilterクラスに変換します。
	 * 
	 * @param reader XML読込リーダ
	 * @param context 
	 * @return Filterオブジェクト
	 * 
	 * @see com.thoughtworks.xstream.converters.Converter#unmarshal(HierarchicalStreamReader, UnmarshallingContext)
	 */    
	@SuppressWarnings("unchecked")
	@Override
    public Object unmarshal(HierarchicalStreamReader reader, UnmarshallingContext context) {
		Filter filter = new Filter();
		
		Converter iPAddressesConverter = new FilterIPAddressesConverter();
	   	String name = null;
       	while(reader.hasMoreChildren()) {
       		reader.moveDown();

       		name = reader.getNodeName();
       		if (name.equals(ELEMENT_FILTER_TYPE)) {
       			filter.setFilterType(reader.getValue());
       		}
       		else if (name.equals(ELEMENT_IP_ADDRESSES)) {
       			filter.setIpAddresses((List<String>) iPAddressesConverter.unmarshal(reader, context));
       		}

           	reader.moveUp();
       	}
       	return filter;
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
