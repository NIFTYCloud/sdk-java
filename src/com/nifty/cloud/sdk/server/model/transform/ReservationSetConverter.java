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
import com.nifty.cloud.sdk.server.model.Reservation;
import com.thoughtworks.xstream.converters.Converter;
import com.thoughtworks.xstream.converters.MarshallingContext;
import com.thoughtworks.xstream.converters.UnmarshallingContext;
import com.thoughtworks.xstream.io.HierarchicalStreamReader;
import com.thoughtworks.xstream.io.HierarchicalStreamWriter;

/**
 * ReservationSetType変換クラス。<br />
 * このクラスはレスポンスXMLのreservationSet要素からReservationクラスのリストを生成します。
 *
 */
public class ReservationSetConverter implements Converter {

	private static final String ELEMENT_RESERVATION_ID = "reservationId";
	private static final String ELEMENT_OWNER_ID       = "ownerId";
	private static final String ELEMENT_REQUESTER_ID   = "requesterId";
	private static final String ELEMENT_GROUP_SET      = "groupSet";
	private static final String ELEMENT_INSTANCES_SET  = "instancesSet";

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
	 * reservationSetをList<Reservation>クラスに変換します。}
	 *
	 * @param reader XML読込リーダ
	 * @param context
	 * @return {@literal List<Reservation>オブジェクト}
	 *
	 * @see com.thoughtworks.xstream.converters.Converter#unmarshal(HierarchicalStreamReader, UnmarshallingContext)
	 */
	@SuppressWarnings("unchecked")
	@Override
	public Object unmarshal(HierarchicalStreamReader reader, UnmarshallingContext context) {
		List<Reservation> reservations = new ArrayList<Reservation>();

		Converter groupSetConverter = new GroupSetConverter();
		Converter instancesSetConverter = new RunningInstancesSetConverter();
		String name = null;
		while(reader.hasMoreChildren()) {
			reader.moveDown();
			Reservation reservation = new Reservation();
			while (reader.hasMoreChildren()) {
				reader.moveDown();

				name = reader.getNodeName();
				if (name.equals(ELEMENT_RESERVATION_ID)) {
					reservation.setReservationId(reader.getValue());
				}
				else if (name.equals(ELEMENT_OWNER_ID)) {
					reservation.setOwnerId(reader.getValue());
				}
				else if (name.equals(ELEMENT_REQUESTER_ID)) {
					reservation.setRequesterId(reader.getValue());
				}
				else if (name.equals(ELEMENT_GROUP_SET)) {
					reservation.setGroupIds((List<String>) groupSetConverter.unmarshal(reader, context));
				}
				else if (name.equals(ELEMENT_INSTANCES_SET)) {
					reservation.setInstances((List<Instance>) instancesSetConverter.unmarshal(reader, context));
				}

				reader.moveUp();
			}
			reservations.add(reservation);
			reader.moveUp();
		}

		return reservations;
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
