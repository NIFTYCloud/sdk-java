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
 *  Date: 2011-11-10 09:56:54
 * 
 */
package com.nifty.cloud.sdk.server.model.transform;


import java.util.List;

import com.nifty.cloud.sdk.server.model.DescribeInstanceAttributeResult;
import com.nifty.cloud.sdk.server.model.InstanceAttribute;
import com.nifty.cloud.sdk.server.model.InstanceAutoScaleMapping;
import com.nifty.cloud.sdk.server.model.InstanceBlockDeviceMapping;
import com.nifty.cloud.sdk.server.model.InstanceLoadBalancerMapping;
import com.thoughtworks.xstream.converters.Converter;
import com.thoughtworks.xstream.converters.MarshallingContext;
import com.thoughtworks.xstream.converters.UnmarshallingContext;
import com.thoughtworks.xstream.io.HierarchicalStreamReader;
import com.thoughtworks.xstream.io.HierarchicalStreamWriter;

/**
 * DescribeInstanceAttributeResponse変換クラス。<br />
 * このクラスはレスポンスXMLのDescribeInstanceAttributeResponse要素からDescribeInstanceAttributeResultクラスを生成します。
 *  
 */
public class DescribeInstanceAttributeResultConverter implements Converter {

	private static final String ELEMENT_REQUEST_ID = "requestId";
	private static final String ELEMENT_INSTANCE_ID = "instanceId";
	private static final String ELEMENT_INSTANCE_TYPE = "instanceType";
	private static final String ELEMENT_KERNEL = "kernel";
	private static final String ELEMENT_RAMDISK = "ramdisk";
	private static final String ELEMENT_USER_DATE = "userData";
	private static final String ELEMENT_DISABLE_API_TERMINATION = "disableApiTermination";
	private static final String ELEMENT_BEHAVIOR = "instanceInitiatedShutdownBehavior";
	private static final String ELEMENT_ROOT_DEVICE_NAME = "rootDeviceName";
	private static final String ELEMENT_BLOCK_DEVICE_MAPPING = "blockDeviceMapping";
	private static final String ELEMENT_ACCOUNTING_TYPE = "accountingType";
	private static final String ELEMENT_NEXT_MONTH_ACCOUNTING_TYPE = "nextMonthAccountingType";
	private static final String ELEMENT_LOAD_BALANCING = "loadbalancing";
	private static final String ELEMENT_COPY_INFO = "copyInfo";
	private static final String ELEMENT_AUTO_SCALING = "autoscaling";
	private static final String ELEMENT_IP_TYPE = "ipType";
	private static final String ELEMENT_GROUP_ID = "groupId";
	private static final String ELEMENT_DESCRIPTION = "description";
	
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
		return clazz == DescribeInstanceAttributeResult.class;
	}

	/**
	 * DescribeInstanceAttributeResponseエレメントをDescribeInstanceAttributeResultクラスに変換します。
	 * 
	 * @param reader XML読込リーダ
	 * @param context 
	 * @return DescribeInstanceAttributeResultオブジェクト
	 * 
	 * @see com.thoughtworks.xstream.converters.Converter#unmarshal(HierarchicalStreamReader, UnmarshallingContext)
	 */
	@SuppressWarnings("unchecked")
	@Override
	public Object unmarshal(HierarchicalStreamReader reader, UnmarshallingContext context) {
		DescribeInstanceAttributeResult result = new DescribeInstanceAttributeResult();
		InstanceAttribute instanceAttribute = new InstanceAttribute();
		result.setInstanceAttribute(instanceAttribute);
		
		Converter valueConverter = new ValueConverter(); 
		Converter instanceBlockDeviceMappingConverter  = new InstanceBlockDeviceMappingConverter();
		Converter instanceLoadBalancerMappingConverter = new InstanceLoadBalancerMappingConverter();
		Converter instanceAutoScaleMappingConverter    = new InstanceAutoScaleMappingConverter();		
		String name = null;
		while(reader.hasMoreChildren()) {
			reader.moveDown();

			name = reader.getNodeName();
			if (name.equals(ELEMENT_REQUEST_ID)) {
				result.setRequestId(reader.getValue());
			}
			else if (name.equals(ELEMENT_INSTANCE_ID)) {
				instanceAttribute.setInstanceId(reader.getValue());
			}
			else if (name.equals(ELEMENT_INSTANCE_TYPE)) {
				instanceAttribute.setInstanceType((String) valueConverter.unmarshal(reader, context));
			}
			else if (name.equals(ELEMENT_KERNEL)) {
				instanceAttribute.setKernelId((String) valueConverter.unmarshal(reader, context));
			}
			else if (name.equals(ELEMENT_RAMDISK)) {
				instanceAttribute.setRamdiskId((String) valueConverter.unmarshal(reader, context));
			}
			else if (name.equals(ELEMENT_USER_DATE)) {
				instanceAttribute.setUserData((String) valueConverter.unmarshal(reader, context));
			}
			else if (name.equals(ELEMENT_DISABLE_API_TERMINATION)) {
				instanceAttribute.setDisableApiTermination(Boolean.valueOf((String) valueConverter.unmarshal(reader, context)));
			}
			else if (name.equals(ELEMENT_BEHAVIOR)) {
				instanceAttribute.setInstanceInitiatedShutdownBehavior((String) valueConverter.unmarshal(reader, context));
			}
			else if (name.equals(ELEMENT_ROOT_DEVICE_NAME)) {
				instanceAttribute.setRootDeviceName((String) valueConverter.unmarshal(reader, context));
			}
			else if (name.equals(ELEMENT_BLOCK_DEVICE_MAPPING)) {
				instanceAttribute.setBlockDeviceMappings((List<InstanceBlockDeviceMapping>) instanceBlockDeviceMappingConverter.unmarshal(reader, context));
			}
			else if (name.equals(ELEMENT_ACCOUNTING_TYPE)) {
				instanceAttribute.setAccountingType((String) valueConverter.unmarshal(reader, context));
			}
			else if (name.equals(ELEMENT_NEXT_MONTH_ACCOUNTING_TYPE)) {
				instanceAttribute.setNextMonthAccountingType((String) valueConverter.unmarshal(reader, context));
			}
			else if (name.equals(ELEMENT_LOAD_BALANCING)) {
				instanceAttribute.setLoadBalancing((List<InstanceLoadBalancerMapping>) instanceLoadBalancerMappingConverter.unmarshal(reader, context));
			}
			else if (name.equals(ELEMENT_COPY_INFO)) {
				instanceAttribute.setCopyInfo((String) valueConverter.unmarshal(reader, context));
			}
			else if (name.equals(ELEMENT_AUTO_SCALING)) {
				instanceAttribute.setAutoscaling((InstanceAutoScaleMapping) instanceAutoScaleMappingConverter.unmarshal(reader, context));
			}
			else if (name.equals(ELEMENT_IP_TYPE)) {
				instanceAttribute.setIpType((String) valueConverter.unmarshal(reader, context));
			}
			else if (name.equals(ELEMENT_GROUP_ID)) {
				instanceAttribute.setGroupId((String) valueConverter.unmarshal(reader, context));
			}
			else if (name.equals(ELEMENT_DESCRIPTION)) {
				instanceAttribute.setDescription((String) valueConverter.unmarshal(reader, context));
			}
			
			reader.moveUp();
		}
		return result;
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
