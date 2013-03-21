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
 *  Date: 2011-11-10 09:56:54
 * 
 */
package com.nifty.cloud.sdk.loadbalancer.model.transform;

import java.util.ArrayList;
import java.util.List;


import com.nifty.cloud.sdk.loadbalancer.model.Filter;
import com.nifty.cloud.sdk.loadbalancer.model.HealthCheck;
import com.nifty.cloud.sdk.loadbalancer.model.Instance;
import com.nifty.cloud.sdk.loadbalancer.model.ListenerDescription;
import com.nifty.cloud.sdk.loadbalancer.model.LoadBalancerDescription;
import com.nifty.cloud.sdk.loadbalancer.model.LoadBalancerOption;
import com.nifty.cloud.sdk.loadbalancer.model.Policies;
import com.nifty.cloud.sdk.tools.DateUtils;
import com.thoughtworks.xstream.converters.Converter;
import com.thoughtworks.xstream.converters.MarshallingContext;
import com.thoughtworks.xstream.converters.UnmarshallingContext;
import com.thoughtworks.xstream.io.HierarchicalStreamReader;
import com.thoughtworks.xstream.io.HierarchicalStreamWriter;

/**
 * LoadBalancerDescriptions変換クラス。<br />
 * このクラスはレスポンスXMLのLoadBalancerDescriptions要素からLoadBalancerDescriptionクラスのリストを生成します。
 */
public class LoadBalancerDescriptionsConverter implements Converter {

	private static final String ELEMENT_LOAD_BALANCER_NAME = "LoadBalancerName";
	private static final String ELEMENT_DNS_NAME = "DNSName";
	private static final String ELEMENT_NETWORK_VOLUME = "NetworkVolume";
	private static final String ELEMENT_LISTNER_DESCRIPTIONS = "ListenerDescriptions";
	private static final String ELEMENT_POLICIES = "Policies";
	private static final String ELEMENT_AVAILABILITY_ZONES = "AvailabilityZones";
	private static final String ELEMENT_INSTANCES = "Instances";
	private static final String ELEMENT_HEALTH_CHECK = "HealthCheck";
	private static final String ELEMENT_FILETR = "Filter";
	private static final String ELEMENT_CREATED_TIME = "CreatedTime";
	private static final String ELEMENT_ACCOUNTING_TYPE = "AccountingType";
	private static final String ELEMENT_NEXT_MONTH_ACCOUNTING_TYPE = "NextMonthAccountingType";
	private static final String ELEMENT_OPTION = "Option";
	
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
	 * LoadBalancerDescriptionsをList<LoadBalancerDescription>クラスに変換します。
	 * 
	 * @param reader XML読込リーダ
	 * @param context 
	 * @return List<LoadBalancerDescription>オブジェクト
	 * 
	 * @see com.thoughtworks.xstream.converters.Converter#unmarshal(HierarchicalStreamReader, UnmarshallingContext)
	 */       
	@SuppressWarnings("unchecked")
	@Override
    public Object unmarshal(HierarchicalStreamReader reader, UnmarshallingContext context) {
		List<LoadBalancerDescription> loadBalancerDescriptions = new ArrayList<LoadBalancerDescription>();

		Converter listenerDescriptionsConverter = new ListenerDescriptionsConverter();
		Converter policiesConverter = new PoliciesConverter();
		Converter availabilityZonesConverter = new AvailabilityZonesConverter();
		Converter instancesConverter = new InstancesConverter();
		Converter healthCheckConverter = new HealthCheckConverter();
		Converter filterConverter = new FilterConverter();
		Converter optionConverter = new LoadBalancerOptionConverter();

    	String name = null;
       	while(reader.hasMoreChildren()) {
       		reader.moveDown();
       		LoadBalancerDescription loadBalancerDescription = new LoadBalancerDescription();
           	
       		while(reader.hasMoreChildren()) {
       			reader.moveDown();

       			name = reader.getNodeName();
           		if (name.equals(ELEMENT_LOAD_BALANCER_NAME)) {
           			loadBalancerDescription.setLoadBalancerName(reader.getValue());
           		}
           		else if (name.equals(ELEMENT_DNS_NAME)) {
           			loadBalancerDescription.setDNSName(reader.getValue());
           		}
           		else if (name.equals(ELEMENT_NETWORK_VOLUME)) {
           			loadBalancerDescription.setNetworkVolume(new Integer(reader.getValue()));
           		}
           		else if (name.equals(ELEMENT_LISTNER_DESCRIPTIONS)) {	//converter
           			loadBalancerDescription.setListenerDescriptions((List<ListenerDescription>) listenerDescriptionsConverter.unmarshal(reader, context));
           		}
           		else if (name.equals(ELEMENT_POLICIES)) {				// converter
           			loadBalancerDescription.setPolicies((Policies) policiesConverter.unmarshal(reader, context));
           		}
           		else if (name.equals(ELEMENT_AVAILABILITY_ZONES)) {		// converter
           			loadBalancerDescription.setAvailabilityZones((List<String>) availabilityZonesConverter.unmarshal(reader, context));
           		}
           		else if (name.equals(ELEMENT_INSTANCES)) {				//converter
           			loadBalancerDescription.setInstances((List<Instance>) instancesConverter.unmarshal(reader, context));
           		}
           		else if (name.equals(ELEMENT_HEALTH_CHECK)) {			//converter
           			loadBalancerDescription.setHealthCheck((HealthCheck) healthCheckConverter.unmarshal(reader, context));
           		}
           		else if (name.equals(ELEMENT_FILETR)) {					//converter
           			loadBalancerDescription.setFilter((Filter) filterConverter.unmarshal(reader, context));
           		}
           		else if (name.equals(ELEMENT_CREATED_TIME)) {
           			loadBalancerDescription.setCreatedTime(DateUtils.toDate(reader.getValue()));
           		}
           		else if (name.equals(ELEMENT_ACCOUNTING_TYPE)) {
           			loadBalancerDescription.setAccountingType(reader.getValue());
           		}
           		else if (name.equals(ELEMENT_NEXT_MONTH_ACCOUNTING_TYPE)) {
           			loadBalancerDescription.setNextMonthAccountingType(reader.getValue());
           		}
           		else if (name.equals(ELEMENT_OPTION)) {				//converter
           			loadBalancerDescription.setOption((LoadBalancerOption) optionConverter.unmarshal(reader, context));
           		}

       			reader.moveUp();
       		}
       		loadBalancerDescriptions.add(loadBalancerDescription);
   			reader.moveUp();
       		
       	}
       	
       	return loadBalancerDescriptions;
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
