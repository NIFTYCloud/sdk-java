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
package com.nifty.cloud.sdk.dashboard.model.transform;

import java.util.ArrayList;
import java.util.List;

import com.nifty.cloud.sdk.dashboard.model.ResourceElasticIp;
import com.thoughtworks.xstream.converters.Converter;
import com.thoughtworks.xstream.converters.MarshallingContext;
import com.thoughtworks.xstream.converters.UnmarshallingContext;
import com.thoughtworks.xstream.io.HierarchicalStreamReader;
import com.thoughtworks.xstream.io.HierarchicalStreamWriter;

/**
 * ResourceElasticIpSetType変換クラス。<br />
 * このクラスはレスポンスXMLのelasticIpItemSet要素からResourceElasticIpクラスのリストを生成します。
 */
public class ElasticIpItemSetConverter implements Converter {

	private static final String ELEMENT_TYPE = "type";
	private static final String ELEMENT_COUNT = "count";

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
	 * elasticIpItemSet要素をList<ResourceElasticIp>クラスに変換します。}
	 *
	 * @param reader XML読込リーダ
	 * @param context
	 * @return {@literal List<ResourceElasticIp>オブジェクト}
	 *
	 * @see com.thoughtworks.xstream.converters.Converter#unmarshal(HierarchicalStreamReader, UnmarshallingContext)
	 */
	@Override
	public Object unmarshal(HierarchicalStreamReader reader,
			UnmarshallingContext context) {
		List<ResourceElasticIp> resourceElasticIps = new ArrayList<ResourceElasticIp>();

		String name = null;
		while (reader.hasMoreChildren()) {
			reader.moveDown();
			ResourceElasticIp resourceElasticIp = new ResourceElasticIp();

			while (reader.hasMoreChildren()) {
				reader.moveDown();

				name = reader.getNodeName();
				if (name.equals(ELEMENT_TYPE)) {
					resourceElasticIp.setType(reader.getValue());
				}
				else if (name.equals(ELEMENT_COUNT)) {
					resourceElasticIp.setCount(new Integer(reader.getValue()));
				}

				reader.moveUp();
			}

			reader.moveUp();
			resourceElasticIps.add(resourceElasticIp);
		}

		return resourceElasticIps;
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
