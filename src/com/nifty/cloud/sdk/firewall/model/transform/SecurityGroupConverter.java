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
 *  API Version: 1.17
 *  Date: 2014-02-20 17:00:00
 *
 */
package com.nifty.cloud.sdk.firewall.model.transform;

import java.util.ArrayList;
import java.util.List;

import com.nifty.cloud.sdk.firewall.model.IpPermission;
import com.nifty.cloud.sdk.firewall.model.SecurityGroup;
import com.thoughtworks.xstream.converters.Converter;
import com.thoughtworks.xstream.converters.MarshallingContext;
import com.thoughtworks.xstream.converters.UnmarshallingContext;
import com.thoughtworks.xstream.io.HierarchicalStreamReader;
import com.thoughtworks.xstream.io.HierarchicalStreamWriter;

/**
 * SecurityGroupSetType変換クラス。<br />
 * このクラスはレスポンスXMLのsecurityGroupInfo要素からSecurityGroupクラスのリストを生成します。
 */
public class SecurityGroupConverter implements Converter {

	private static final String ELEMENT_OWNER_ID = "ownerId";
	private static final String ELEMENT_GROUP_NAME = "groupName";
	private static final String ELEMENT_GROUP_DESCRIPTION = "groupDescription";
	private static final String ELEMENT_GROUP_STATUS = "groupStatus";
	private static final String ELEMENT_IP_PERMISSION = "ipPermissions";
	private static final String ELEMENT_INSTANCES_SET = "instancesSet";
	private static final String ELEMENT_GROUP_RULE_LIMIT = "groupRuleLimit";
	private static final String ELEMENT_GROUP_LOG_LIMIT = "groupLogLimit";
	private static final String ELEMENT_GROUP_LOG_FILTER_NET_BIOS = "groupLogFilterNetBios";
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
		for (Class i : interfaces) {
			if (i == List.class) {
				return true;
			}
		}
		return false;
	}

	/**
	 * {@literal
	 * securityGroupInfoをList<SecurityGroup>クラスに変換します。}
	 *
	 * @param reader
	 *            XML読込リーダ
	 * @param context
	 * @return {@literal List<SecurityGroup>オブジェクト}
	 *
	 * @see com.thoughtworks.xstream.converters.Converter#unmarshal(HierarchicalStreamReader,
	 *      UnmarshallingContext)
	 */
	@SuppressWarnings("unchecked")
	@Override
	public Object unmarshal(HierarchicalStreamReader reader,
			UnmarshallingContext context) {
		List<SecurityGroup> securityGroupss = new ArrayList<SecurityGroup>();
		Converter permissionConverter = new IpPermissionConverter();
		Converter instanceConverter = new InstancesConverter();

		String name = null;
		while (reader.hasMoreChildren()) {
			reader.moveDown();
			SecurityGroup securityGroups = new SecurityGroup();

			while (reader.hasMoreChildren()) {
				reader.moveDown();

				name = reader.getNodeName();
				if (name.equals(ELEMENT_OWNER_ID)) {
					securityGroups.setOwnerId(reader.getValue());
				} else if (name.equals(ELEMENT_GROUP_NAME)) {
					securityGroups.setGroupName(reader.getValue());
				} else if (name.equals(ELEMENT_GROUP_DESCRIPTION)) {
					securityGroups.setGroupDescription(reader.getValue());
				} else if (name.equals(ELEMENT_GROUP_STATUS)) {
					securityGroups.setGroupStatus(reader.getValue());
				} else if (name.equals(ELEMENT_IP_PERMISSION)) {
					securityGroups
							.setIpPermissions((List<IpPermission>) permissionConverter
									.unmarshal(reader, context));
				} else if (name.equals(ELEMENT_INSTANCES_SET)) {
					securityGroups
							.setInstanceIds((List<String>) instanceConverter
									.unmarshal(reader, context));
				} else if (name.equals(ELEMENT_GROUP_RULE_LIMIT)) {
					securityGroups.setGroupRuleLimit(Integer.valueOf(reader.getValue()));
				} else if (name.equals(ELEMENT_GROUP_LOG_LIMIT)) {
					securityGroups.setGroupLogLimit(Integer.valueOf(reader.getValue()));
				} else if (name.equals(ELEMENT_GROUP_LOG_FILTER_NET_BIOS)) {
					securityGroups.setGroupLogFilterNetBios(Boolean.valueOf(reader.getValue()));
				} else if (name.equals(ELEMENT_AVAILABILITY_ZONE)) {
					securityGroups.setAvailabilityZone(reader.getValue());
				}

				reader.moveUp();
			}
			reader.moveUp();
			securityGroupss.add(securityGroups);
		}
		return securityGroupss;
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