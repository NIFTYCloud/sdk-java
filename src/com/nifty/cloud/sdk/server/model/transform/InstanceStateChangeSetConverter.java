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
 *  Date: 2011-08-25 09:46:38
 * 
 */
package com.nifty.cloud.sdk.server.model.transform;


import java.util.ArrayList;
import java.util.List;

import com.nifty.cloud.sdk.server.model.InstanceState;
import com.nifty.cloud.sdk.server.model.InstanceStateChange;
import com.thoughtworks.xstream.converters.Converter;
import com.thoughtworks.xstream.converters.MarshallingContext;
import com.thoughtworks.xstream.converters.UnmarshallingContext;
import com.thoughtworks.xstream.io.HierarchicalStreamReader;
import com.thoughtworks.xstream.io.HierarchicalStreamWriter;

/**
 * InstanceStateChangeSetType変換クラス。<br />
 * このクラスはレスポンスXMLのinstancesSet要素からInstanceStateChangeクラスのリストを生成します。
 *  
 */
public class InstanceStateChangeSetConverter implements Converter {

	private static final String ELEMENT_INSTANCE_ID = "instanceId";
	private static final String ELEMENT_CURRENT_STATE = "currentState";
	private static final String ELEMENT_PREVIOUS_STATE = "previousState";
	
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
	 * instancesSetをList<InstanceStateChange>クラスに変換します。
	 * 
	 * @param reader XML読込リーダ
	 * @param context 
	 * @return List<InstanceStateChange>オブジェクト
	 * 
	 * @see com.thoughtworks.xstream.converters.Converter#unmarshal(HierarchicalStreamReader, UnmarshallingContext)
	 */
	@Override
	public Object unmarshal(HierarchicalStreamReader reader, UnmarshallingContext context) {
		List<InstanceStateChange> instanceStateChanges = new ArrayList<InstanceStateChange>();
		InstanceStateChange instanceStateChange;

		Converter instanceStateConverter = new InstanceStateConverter();
		String name = null;
		while(reader.hasMoreChildren()) {
			reader.moveDown();
			instanceStateChange = new InstanceStateChange();
			
			while(reader.hasMoreChildren()) {
				reader.moveDown();
				name = reader.getNodeName();
				if (name.equals(ELEMENT_INSTANCE_ID)) {
					instanceStateChange.setInstanceId(reader.getValue());
				}
				else if (name.equals(ELEMENT_CURRENT_STATE)) {
					instanceStateChange.setCurrentState((InstanceState) instanceStateConverter.unmarshal(reader, context));
				}
				else if (name.equals(ELEMENT_PREVIOUS_STATE)) {
					instanceStateChange.setPreviousState((InstanceState) instanceStateConverter.unmarshal(reader, context));
				}
				reader.moveUp();
			}
			reader.moveUp();
			instanceStateChanges.add(instanceStateChange);
		}
		
		return instanceStateChanges;
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
