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
package com.nifty.cloud.sdk.server.model.transform;

import java.util.ArrayList;
import java.util.List;

import com.nifty.cloud.sdk.server.model.Instance;
import com.nifty.cloud.sdk.server.model.InstanceAutoScaleMapping;
import com.nifty.cloud.sdk.server.model.InstanceBlockDeviceMapping;
import com.nifty.cloud.sdk.server.model.InstanceLoadBalancerMapping;
import com.nifty.cloud.sdk.server.model.InstanceState;
import com.nifty.cloud.sdk.server.model.Monitoring;
import com.nifty.cloud.sdk.server.model.NiftySnapshotting;
import com.nifty.cloud.sdk.server.model.Placement;
import com.nifty.cloud.sdk.server.model.ProductCode;
import com.nifty.cloud.sdk.server.model.StateReason;
import com.nifty.cloud.sdk.tools.DateUtils;
import com.thoughtworks.xstream.converters.Converter;
import com.thoughtworks.xstream.converters.MarshallingContext;
import com.thoughtworks.xstream.converters.UnmarshallingContext;
import com.thoughtworks.xstream.io.HierarchicalStreamReader;
import com.thoughtworks.xstream.io.HierarchicalStreamWriter;

/**
 * RunningInstancesSetType変換クラス。<br />
 * このクラスはレスポンスXMLのinstancesSet要素からInstanceクラスのリストを生成します。
 *
 */
public class RunningInstancesSetConverter implements Converter {

	private static final String ELEMENT_INSTANCE_ID = "instanceId";
	private static final String ELEMENT_IMAGE_ID = "imageId";
	private static final String ELEMENT_INSTANCE_STATE = "instanceState";
	private static final String ELEMENT_PRIVATE_DNS_NAME = "privateDnsName";
	private static final String ELEMENT_DNS_NAME = "dnsName";
	private static final String ELEMENT_REASON = "reason";
	private static final String ELEMENT_KEY_NAME= "keyName";
	private static final String ELEMENT_ADMIN = "admin";
	private static final String ELEMENT_AMI_LAUNCH_INDEX = "amiLaunchIndex";
	private static final String ELEMENT_PRODUCT_CODES = "productCodes";
	private static final String ELEMENT_INSTANCE_TYPE = "instanceType";
	private static final String ELEMENT_LAUNCH_TIME = "launchTime";
	private static final String ELEMENT_PLACEMENT = "placement";
	private static final String ELEMENT_KERNEL_ID = "kernelId";
	private static final String ELEMENT_RAMDISK_ID = "ramdiskId";
	private static final String ELEMENT_PLATFORM = "platform";
	private static final String ELEMENT_MONITORING = "monitoring";
	private static final String ELEMENT_SUBNET_ID = "subnetId";
	private static final String ELEMENT_VPC_ID = "vpcId";
	private static final String ELEMENT_PRIVATE_IP_ADDRESS = "privateIpAddress";
	private static final String ELEMENT_IP_ADDRESS = "ipAddress";
	private static final String ELEMENT_PRIVATE_IP_ADDRESS_V6 = "privateIpAddressV6";
	private static final String ELEMENT_IP_ADDRESS_V6 = "ipAddressV6";
	private static final String ELEMENT_STATE_REASON = "stateReason";
	private static final String ELEMENT_ARCHITECTURE = "architecture";
	private static final String ELEMENT_ROOT_DEVICE_TYPE = "rootDeviceType";
	private static final String ELEMENT_ROOT_DEVICE_NAME = "rootDeviceName";
	private static final String ELEMENT_BLOCK_DEVICE_MAPPING = "blockDeviceMapping";
	private static final String ELEMENT_INSTANCE_LIFCYCLE = "instanceLifecycle";
	private static final String ELEMENT_SPOT_INSTANCE_REQUEST_ID = "spotInstanceRequestId";
	private static final String ELEMENT_ACCOUNTING_TYPE = "accountingType";
	private static final String ELEMENT_NEXT_MONTH_ACCOUNTING_TYPE = "nextMonthAccountingType";
	private static final String ELEMENT_LOAD_BALANCING = "loadbalancing";
	private static final String ELEMENT_COPY_INFO = "copyInfo";
	private static final String ELEMENT_AUTOSCALING = "autoscaling";
	private static final String ELEMENT_IP_TYPE = "ipType";
	private static final String ELEMENT_NIFTY_PRIVATE_IP_TYPE = "niftyPrivateIpType";
	private static final String ELEMENT_DESCRIPTION = "description";
	private static final String ELEMENT_NIFTY_SNAPSHOTTING = "niftySnapshotting";

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
	 * {@literal
	 * instancesSetをList<Instance>クラスに変換します。}
	 *
	 * @param reader XML読込リーダ
	 * @param context
	 * @return {@literal List<Instance>オブジェクト}
	 *
	 * @see com.thoughtworks.xstream.converters.Converter#unmarshal(HierarchicalStreamReader, UnmarshallingContext)
	 */
    @SuppressWarnings("unchecked")
	@Override
    public Object unmarshal(HierarchicalStreamReader reader, UnmarshallingContext context) {
       	List<Instance> instances = new ArrayList<Instance>();

       	Converter converter;
    	String name = null;
       	while(reader.hasMoreChildren()) {
       		reader.moveDown();
           	Instance instance = new Instance();

       		while(reader.hasMoreChildren()) {
       			reader.moveDown();

       			name = reader.getNodeName();
           		if      (name.equals(ELEMENT_INSTANCE_ID))              { instance.setInstanceId(reader.getValue()); }
           		else if (name.equals(ELEMENT_IMAGE_ID))                 { instance.setImageId(reader.getValue()); }
           		else if (name.equals(ELEMENT_PRIVATE_DNS_NAME))         { instance.setPrivateDnsName(reader.getValue()); }
           		else if (name.equals(ELEMENT_DNS_NAME))                 { instance.setDnsName(reader.getValue()); }
           		else if (name.equals(ELEMENT_REASON))                   { instance.setReason(reader.getValue()); }
           		else if (name.equals(ELEMENT_KEY_NAME))                 { instance.setKeyName(reader.getValue()); }
           		else if (name.equals(ELEMENT_ADMIN))                    { instance.setAdmin(reader.getValue()); }
           		else if (name.equals(ELEMENT_AMI_LAUNCH_INDEX))         { instance.setAmiLaunchIndex(reader.getValue()); }
           		else if (name.equals(ELEMENT_INSTANCE_TYPE))            { instance.setInstanceType(reader.getValue()); }
           		else if (name.equals(ELEMENT_LAUNCH_TIME))              { instance.setLaunchTime(DateUtils.toDate(reader.getValue()));}
           		else if (name.equals(ELEMENT_KERNEL_ID))                { instance.setKernelId(reader.getValue()); }
           		else if (name.equals(ELEMENT_RAMDISK_ID))               { instance.setRamdiskId(reader.getValue()); }
           		else if (name.equals(ELEMENT_PLATFORM))                 { instance.setPlatform(reader.getValue()); }
           		else if (name.equals(ELEMENT_SUBNET_ID))                { instance.setSubnetId(reader.getValue()); }
           		else if (name.equals(ELEMENT_VPC_ID))                   { instance.setVpcId(reader.getValue()); }
           		else if (name.equals(ELEMENT_PRIVATE_IP_ADDRESS))       { instance.setPrivateIpAddress(reader.getValue()); }
           		else if (name.equals(ELEMENT_IP_ADDRESS))    		    { instance.setIpAddress(reader.getValue()); }
           		else if (name.equals(ELEMENT_PRIVATE_IP_ADDRESS_V6))    { instance.setPrivateIpAddressV6(reader.getValue()); }
           		else if (name.equals(ELEMENT_IP_ADDRESS_V6))    		{ instance.setIpAddressV6(reader.getValue()); }
           		else if (name.equals(ELEMENT_ARCHITECTURE))             { instance.setArchitecture(reader.getValue()); }
           		else if (name.equals(ELEMENT_ROOT_DEVICE_TYPE))         { instance.setRootDeviceType(reader.getValue()); }
           		else if (name.equals(ELEMENT_ROOT_DEVICE_NAME))         { instance.setRootDeviceName(reader.getValue()); }
           		else if (name.equals(ELEMENT_INSTANCE_LIFCYCLE))        { instance.setInstanceLifecycle(reader.getValue()); }
           		else if (name.equals(ELEMENT_SPOT_INSTANCE_REQUEST_ID)) { instance.setSpotInstanceRequestId(reader.getValue()); }
           		else if (name.equals(ELEMENT_ACCOUNTING_TYPE))          { instance.setAccountingType(reader.getValue()); }
           		else if (name.equals(ELEMENT_NEXT_MONTH_ACCOUNTING_TYPE)){ instance.setNextMonthAccountingType(reader.getValue()); }
           		else if (name.equals(ELEMENT_COPY_INFO))                { instance.setCopyInfo(reader.getValue()); }
           		else if (name.equals(ELEMENT_IP_TYPE))                  { instance.setIpType(reader.getValue()); }
           		else if (name.equals(ELEMENT_NIFTY_PRIVATE_IP_TYPE))    { instance.setNiftyPrivateIpType(reader.getValue()); }
           		else if (name.equals(ELEMENT_DESCRIPTION))              { instance.setDescription(reader.getValue()); }
           		else if (name.equals(ELEMENT_INSTANCE_STATE)) {
           			converter = new InstanceStateConverter();
           			instance.setState((InstanceState)converter.unmarshal(reader, context));
           		}
           		else if (name.equals(ELEMENT_PRODUCT_CODES)) {
           			converter = new ProductCodesConverter();
           			instance.setProductCodes((List<ProductCode>)converter.unmarshal(reader, context));
           		}
           		else if (name.equals(ELEMENT_PLACEMENT)) {
           			converter = new PlacementConverter();
           			instance.setPlacement((Placement)converter.unmarshal(reader, context));
           		}
           		else if (name.equals(ELEMENT_MONITORING)) {
           			converter = new InstanceMonitoringStateConverter();
           			instance.setMonitoring((Monitoring)converter.unmarshal(reader, context));
           		}
           		else if (name.equals(ELEMENT_STATE_REASON)) {
           			converter = new StateReasonConverter();
           			instance.setStateReason((StateReason)converter.unmarshal(reader, context));
           		}
           		else if (name.equals(ELEMENT_BLOCK_DEVICE_MAPPING)) {
           			converter = new InstanceBlockDeviceMappingConverter();
           			instance.setBlockDeviceMappings((List<InstanceBlockDeviceMapping>)converter.unmarshal(reader, context));
           		}
           		else if (name.equals(ELEMENT_LOAD_BALANCING)) {
           			converter = new InstanceLoadBalancerMappingConverter();
           			instance.setLoadbalancing((List<InstanceLoadBalancerMapping>)converter.unmarshal(reader, context));
           		}
           		else if (name.equals(ELEMENT_AUTOSCALING)) {
           			converter = new InstanceAutoScaleMappingConverter();
           			instance.setAutoscaling((InstanceAutoScaleMapping)converter.unmarshal(reader, context));
           		}
           		else if (name.equals(ELEMENT_NIFTY_SNAPSHOTTING)) {
           			converter = new NiftySnapshottingConverter();
           			instance.setNiftySnapshottings((List<NiftySnapshotting>)converter.unmarshal(reader, context));
           		}

       			reader.moveUp();
       		}
			instances.add(instance);
   			reader.moveUp();

       	}

       	return instances;
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
