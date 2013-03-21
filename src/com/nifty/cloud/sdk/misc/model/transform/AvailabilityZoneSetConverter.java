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
 *  Date: 2012-02-20 10:57:31
 * 
 */
package com.nifty.cloud.sdk.misc.model.transform;


import java.util.ArrayList;
import java.util.List;

import com.nifty.cloud.sdk.misc.model.AvailabilityZone;
import com.thoughtworks.xstream.converters.Converter;
import com.thoughtworks.xstream.converters.MarshallingContext;
import com.thoughtworks.xstream.converters.UnmarshallingContext;
import com.thoughtworks.xstream.io.HierarchicalStreamReader;
import com.thoughtworks.xstream.io.HierarchicalStreamWriter;

/**
 *  AvailabilityZoneSetType変換クラス。<br />
 *  このクラスはレスポンスXMLのavailabilityZoneInfo要素からAvailabilityZoneクラスのリストを生成します。
 */
public class AvailabilityZoneSetConverter implements Converter {

	private static final String ELEMENT_ZONE_NAME = "zoneName";
	private static final String ELEMENT_ZONE_STATE = "zoneState";
	private static final String ELEMENT_REGION_NAME = "regionName";
	private static final String ELEMENT_MESSAGE_SET = "messageSet";
	private static final String ELEMENT_SECURITY_GROUP_SUPPORTED = "securityGroupSupported";
	private static final String ELEMENT_IS_DEFAULT = "isDefault";

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
		for(Class i : interfaces) {
			if (i == List.class) {
				return true;
			}
		}
		return false;
	}

	/**
	 * availabilityZoneInfo要素をList<AvailabilityZone>クラスに変換します。
	 * 
	 * @param reader XML読込リーダ
	 * @param context 
	 * @return List<AvailabilityZone>オブジェクト
	 * 
	 * @see com.thoughtworks.xstream.converters.Converter#unmarshal(HierarchicalStreamReader, UnmarshallingContext)
	 */
	@SuppressWarnings("unchecked")
	@Override
	public Object unmarshal(HierarchicalStreamReader reader, UnmarshallingContext context) {
		List<AvailabilityZone> availabilityZones = new ArrayList<AvailabilityZone>();
		Converter messageSetConverter = new AvailabilityZoneMessageSetConverter();
		
		String name = null;
		while(reader.hasMoreChildren()) {
			reader.moveDown();
			AvailabilityZone availabilityZone = new AvailabilityZone();
			
			while(reader.hasMoreChildren()) {
				reader.moveDown();
				
				name = reader.getNodeName();
				if (name.equals(ELEMENT_ZONE_NAME)) {
					availabilityZone.setZoneName(reader.getValue());
				}
				else if (name.equals(ELEMENT_ZONE_STATE)) {
					availabilityZone.setState(reader.getValue());
				}
				else if (name.equals(ELEMENT_REGION_NAME)) {
					availabilityZone.setRegionName(reader.getValue());
				}
				else if (name.equals(ELEMENT_MESSAGE_SET)) {
					availabilityZone.setMessages((List<String>) messageSetConverter.unmarshal(reader, context));
				}
				else if (name.equals(ELEMENT_SECURITY_GROUP_SUPPORTED)) {
					availabilityZone.setSecurityGroupSupported(Boolean.valueOf(reader.getValue()));
				}
				else if (name.equals(ELEMENT_IS_DEFAULT)) {
					availabilityZone.setIsDefault(Boolean.valueOf(reader.getValue()));
				}
				reader.moveUp();
			}
			
			reader.moveUp();
			availabilityZones.add(availabilityZone);
		}
		
		return availabilityZones;
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
