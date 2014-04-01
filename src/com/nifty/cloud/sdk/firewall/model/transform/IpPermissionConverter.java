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
import com.nifty.cloud.sdk.firewall.model.IpRange;
import com.nifty.cloud.sdk.firewall.model.UserIdGroupPair;
import com.thoughtworks.xstream.converters.Converter;
import com.thoughtworks.xstream.converters.MarshallingContext;
import com.thoughtworks.xstream.converters.UnmarshallingContext;
import com.thoughtworks.xstream.io.HierarchicalStreamReader;
import com.thoughtworks.xstream.io.HierarchicalStreamWriter;

/**
 * IpPermissionSetType変換クラス。<br />
 * このクラスはレスポンスXMLのipPermissions要素からIpPermissionクラスのリストを生成します。
 */
public class IpPermissionConverter implements Converter {

	private static final String ELEMENT_IP_PROTOCOL = "ipProtocol";
	private static final String ELEMENT_FROM_PORT = "fromPort";
	private static final String ELEMENT_TO_PORT = "toPort";
	private static final String ELEMENT_IN_OUT = "inOut";
	private static final String ELEMENT_GROUPS = "groups";
	private static final String ELEMENT_IP_RANGE = "ipRanges";

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
	 * ipPermissionsをList<IpPermission>クラスに変換します。}
	 *
	 * @param reader XML読込リーダ
	 * @param context
	 * @return {@literal List<IpPermission>オブジェクト}
	 *
	 * @see com.thoughtworks.xstream.converters.Converter#unmarshal(HierarchicalStreamReader,
	 *      UnmarshallingContext)
	 */
	@SuppressWarnings("unchecked")
	@Override
	public Object unmarshal(HierarchicalStreamReader reader,
			UnmarshallingContext context) {
		List<IpPermission> permissions = new ArrayList<IpPermission>();
		Converter groupConverter = new GroupsConverter();
		Converter ipRangeConverter = new IpRangeConverter();

		String name = null;
		while (reader.hasMoreChildren()) {
			reader.moveDown();
			IpPermission permission = new IpPermission();

			while (reader.hasMoreChildren()) {
				reader.moveDown();

				name = reader.getNodeName();
				if (name.equals(ELEMENT_IP_PROTOCOL)) {
					permission.setIpProtocol(reader.getValue());
				} else if (name.equals(ELEMENT_FROM_PORT)) {
					permission.setFromPort(new Integer(reader.getValue()));
				} else if (name.equals(ELEMENT_TO_PORT)) {
					permission.setToPort(new Integer(reader.getValue()));
				} else if (name.equals(ELEMENT_IN_OUT)) {
					permission.setInOut(reader.getValue());
				} else if (name.equals(ELEMENT_GROUPS)) {
					permission.setGroups((List<UserIdGroupPair>) groupConverter
							.unmarshal(reader, context));
				} else if (name.equals(ELEMENT_IP_RANGE)) {
					permission.setIpRanges((List<IpRange>) ipRangeConverter
							.unmarshal(reader, context));
				}

				reader.moveUp();
			}
			reader.moveUp();
			permissions.add(permission);
		}
		return permissions;
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