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
package com.nifty.cloud.sdk.server.model.transform;


import com.nifty.cloud.sdk.server.model.InstanceAutoScaleMapping;
import com.nifty.cloud.sdk.tools.DateUtils;
import com.thoughtworks.xstream.converters.Converter;
import com.thoughtworks.xstream.converters.MarshallingContext;
import com.thoughtworks.xstream.converters.UnmarshallingContext;
import com.thoughtworks.xstream.io.HierarchicalStreamReader;
import com.thoughtworks.xstream.io.HierarchicalStreamWriter;

/**
 * InstanceAutoScaleMappingResponseType変換クラス。<br />
 * このクラスはレスポンスXMLのautoscaling要素からInstanceAutoScaleMappingクラスを生成します。
 *  
 */
public class InstanceAutoScaleMappingConverter implements Converter {

	private static final String ELEMENT_AUTO_SCALING_GROUP_NAME = "autoScalingGroupName";
	private static final String ELEMENT_EXPIRE_TIME = "expireTime";
	
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
		return clazz == InstanceAutoScaleMapping.class;
	}

	/**
	 * autoscalingをInstanceAutoScaleMappingクラスに変換します。
	 * 
	 * @param reader XML読込リーダ
	 * @param context 
	 * @return InstanceAutoScaleMappingオブジェクト
	 * 
	 * @see com.thoughtworks.xstream.converters.Converter#unmarshal(HierarchicalStreamReader, UnmarshallingContext)
	 */
	@Override
	public Object unmarshal(HierarchicalStreamReader reader, UnmarshallingContext context) {
		InstanceAutoScaleMapping autoscaling = new InstanceAutoScaleMapping();
        	
		String name = null;

		while(reader.hasMoreChildren()) {
			reader.moveDown();

			name = reader.getNodeName();
			if (name.equals(ELEMENT_AUTO_SCALING_GROUP_NAME)) {
				autoscaling.setAutoScalingGroupName(reader.getValue());
			}
			else if (name.equals(ELEMENT_EXPIRE_TIME)) {
				autoscaling.setExpireTime(DateUtils.toDate(reader.getValue()));
			}
			
			reader.moveUp();
		}
		return autoscaling;
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
