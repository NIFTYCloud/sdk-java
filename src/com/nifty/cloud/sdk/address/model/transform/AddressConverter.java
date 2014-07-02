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
package com.nifty.cloud.sdk.address.model.transform;


import java.util.ArrayList;
import java.util.List;

import com.nifty.cloud.sdk.address.model.Address;
import com.thoughtworks.xstream.converters.Converter;
import com.thoughtworks.xstream.converters.MarshallingContext;
import com.thoughtworks.xstream.converters.UnmarshallingContext;
import com.thoughtworks.xstream.io.HierarchicalStreamReader;
import com.thoughtworks.xstream.io.HierarchicalStreamWriter;

/**
 * AddressesType変換クラス。<br />
 * このクラスはレスポンスXMLのaddressesSet要素からAddressクラスのリストを生成します。
 */
public class AddressConverter implements Converter {

	private static final String ELEMENT_PUBLIC_IP = "publicIp";
	private static final String ELEMENT_PRIVATE_IP_ADDRESS = "privateIpAddress";
	private static final String ELEMENT_ALLOCATION_ID = "allocationId";
	private static final String ELEMENT_DOMAIN = "domain";
	private static final String ELEMENT_INSTANCE_ID = "instanceId";
	private static final String ELEMENT_ASSOCIATION_ID = "associationId";
	private static final String ELEMENT_NETWORK_INTERFACE_ID = "networkInterfaceId";
	private static final String ELEMENT_NETWORK_INTERFACE_OWNER_ID = "networkInterfaceOwnerId";
	private static final String ELEMENT_DESCRIPTION = "description";
	private static final String ELEMENT_AVAILABILITY_ZONE = "availabilityZone";

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
	 * addressesSet要素をList<Address>クラスに変換します。}
	 *
	 * @param reader XML読込リーダ
	 * @param context
	 * @return {@literal List<Address>オブジェクト}
	 *
	 * @see com.thoughtworks.xstream.converters.Converter#unmarshal(HierarchicalStreamReader, UnmarshallingContext)
	 */
	@Override
	public Object unmarshal(HierarchicalStreamReader reader, UnmarshallingContext context) {
		List<Address> addresses = new ArrayList<Address>();
		String name = null;
		while(reader.hasMoreChildren()) {
			reader.moveDown();
			Address address = new Address();
			while (reader.hasMoreChildren()) {
				reader.moveDown();

				name = reader.getNodeName();
				if (name.equals(ELEMENT_PUBLIC_IP)) {
					address.setPublicIp(reader.getValue());
				}
				else if (name.equals(ELEMENT_PRIVATE_IP_ADDRESS)) {
					address.setPrivateIpAddress(reader.getValue());
				}
				else if (name.equals(ELEMENT_ALLOCATION_ID)) {
					address.setAllocationId(reader.getValue());
				}
				else if (name.equals(ELEMENT_DOMAIN)) {
					address.setDomain(reader.getValue());
				}
				else if (name.equals(ELEMENT_INSTANCE_ID)) {
					address.setInstanceId(reader.getValue());
				}
				else if (name.equals(ELEMENT_ASSOCIATION_ID)) {
					address.setAssociationId(reader.getValue());
				}
				else if (name.equals(ELEMENT_NETWORK_INTERFACE_ID)) {
					address.setNetworkInterfaceId(reader.getValue());
				}
				else if (name.equals(ELEMENT_NETWORK_INTERFACE_OWNER_ID)) {
					address.setNetworkInterfaceOwnerId(reader.getValue());
				}
				else if (name.equals(ELEMENT_DESCRIPTION)) {
					address.setDescription(reader.getValue());
				}
				else if (name.equals(ELEMENT_AVAILABILITY_ZONE)) {
					address.setAvailabilityZone(reader.getValue());
				}

				reader.moveUp();
			}
			addresses.add(address);
			reader.moveUp();
		}

		return addresses;
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

