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

import com.nifty.cloud.sdk.server.model.CopyInstanceSet;
import com.thoughtworks.xstream.converters.Converter;
import com.thoughtworks.xstream.converters.MarshallingContext;
import com.thoughtworks.xstream.converters.UnmarshallingContext;
import com.thoughtworks.xstream.io.HierarchicalStreamReader;
import com.thoughtworks.xstream.io.HierarchicalStreamWriter;

/**
 * copyInstanceSets変換クラス。<br />
 * このクラスはレスポンスXMLのcopyInstanceSets要素からCopyInstanceSetクラスのリストを生成します。
 *
 */
public class CopyInstanceSetConverter implements Converter {

	private static final String ELEMENT_INSTANCE_ID    = "instanceId";
	private static final String ELEMENT_INSTANCE_STATE = "instanceState";


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
	 * copyInstanceSetsをList<CopyInstanceSet>クラスに変換します。}
	 *
	 * @param reader XML読込リーダ
	 * @param context
	 * @return {@literal List<CopyInstanceSet>オブジェクト}
	 *
	 * @see com.thoughtworks.xstream.converters.Converter#unmarshal(HierarchicalStreamReader, UnmarshallingContext)
	 */
	@Override
	public Object unmarshal(HierarchicalStreamReader reader, UnmarshallingContext context) {
		List<CopyInstanceSet> copyInstances = new ArrayList<CopyInstanceSet>();

		while(reader.hasMoreChildren()) {
			reader.moveDown();
			CopyInstanceSet copyInstance = new CopyInstanceSet();
			while(reader.hasMoreChildren()) {
				reader.moveDown();
				String name = reader.getNodeName();
				if (name.equals(ELEMENT_INSTANCE_ID)) {
					copyInstance.setInstanceId(reader.getValue());
				}
				else if (name.equals(ELEMENT_INSTANCE_STATE)) {
					copyInstance.setInstanceState(reader.getValue());
				}
				reader.moveUp();
			}
			reader.moveUp();
			copyInstances.add(copyInstance);
		}

		return copyInstances;
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
