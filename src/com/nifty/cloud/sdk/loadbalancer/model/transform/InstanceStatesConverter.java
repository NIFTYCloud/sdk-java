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
 *  API Version: 1.15
 *  Date: 2013-06-28 17:00:00
 * 
 */
package com.nifty.cloud.sdk.loadbalancer.model.transform;

import java.util.ArrayList;
import java.util.List;


import com.nifty.cloud.sdk.loadbalancer.model.InstanceState;
import com.thoughtworks.xstream.converters.Converter;
import com.thoughtworks.xstream.converters.MarshallingContext;
import com.thoughtworks.xstream.converters.UnmarshallingContext;
import com.thoughtworks.xstream.io.HierarchicalStreamReader;
import com.thoughtworks.xstream.io.HierarchicalStreamWriter;

/**
 * InstanceStates変換クラス。<br />
 * このクラスはレスポンスXMLのInstanceStates要素からInstanceStateクラスのリストを生成します。
 */
public class InstanceStatesConverter implements Converter {

	private static final String ELEMENT_INSTANCE_ID = "InstanceId";
	private static final String ELEMENT_STATE = "State";
	private static final String ELEMENT_REASON_CODE = "ReasonCode";
	private static final String ELEMENT_DESCRIPTION = "Description";

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
	 * InstanceStatesをList<InstanceState>クラスに変換します。
	 * 
	 * @param reader XML読込リーダ
	 * @param context 
	 * @return List<InstanceState>オブジェクト
	 * 
	 * @see com.thoughtworks.xstream.converters.Converter#unmarshal(HierarchicalStreamReader, UnmarshallingContext)
	 */    
	@Override
    public Object unmarshal(HierarchicalStreamReader reader, UnmarshallingContext context) {
		List<InstanceState> instanceStates = new ArrayList<InstanceState>();
        
    	String name = null;
       	while(reader.hasMoreChildren()) {
       		reader.moveDown();
       		InstanceState instanceState = new InstanceState();
           	
       		while(reader.hasMoreChildren()) {
       			reader.moveDown();
       			
       			name = reader.getNodeName();
           		if (name.equals(ELEMENT_INSTANCE_ID)) {
           			instanceState.setInstanceId(reader.getValue()); 
           		}
           		else if (name.equals(ELEMENT_STATE)) {
           			instanceState.setState(reader.getValue());
           		}
           		else if (name.equals(ELEMENT_REASON_CODE)) {
           			instanceState.setReasonCode(reader.getValue());
           		}
           		else if (name.equals(ELEMENT_DESCRIPTION)) {
           			instanceState.setDescription(reader.getValue());
           		}

       			reader.moveUp();
       		}
       		instanceStates.add(instanceState);
   			reader.moveUp();
       		
       	}
       	
       	return instanceStates;
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
