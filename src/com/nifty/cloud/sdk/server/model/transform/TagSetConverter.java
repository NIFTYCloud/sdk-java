/******************************************************************************* 
 *  Copyright 2013 NIFTY Corporation All Rights Reserved.
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
 *  API Version: 1.15
 *  Date: 2013-06-28 17:00:00
 * 
 */
package com.nifty.cloud.sdk.server.model.transform;

import java.util.ArrayList;
import java.util.List;

import com.nifty.cloud.sdk.server.model.Tag;
import com.thoughtworks.xstream.converters.Converter;
import com.thoughtworks.xstream.converters.MarshallingContext;
import com.thoughtworks.xstream.converters.UnmarshallingContext;
import com.thoughtworks.xstream.io.HierarchicalStreamReader;
import com.thoughtworks.xstream.io.HierarchicalStreamWriter;

/**
 * TagSet変換クラス。<br />
 * このクラスはレスポンスXMLのtagSet要素からTagクラスのリストを生成します。
 *  
 */
public class TagSetConverter implements Converter {

	private static final String ELEMENT_KEY = "key";
	private static final String ELEMENT_VALUE = "value";

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
		for (Class<?> i : clazz.getInterfaces()) {
			if (i == List.class) return true;
		}
		return false;
	}

	/**
	 * tagSetをTagクラスのリストに変換します。
	 * 
	 * @param reader XML読込リーダ
	 * @param context 
	 * @return ImportInstanceオブジェクト
	 * 
	 * @see com.thoughtworks.xstream.converters.Converter#unmarshal(HierarchicalStreamReader, UnmarshallingContext)
	 */
	@Override
	public Object unmarshal(HierarchicalStreamReader reader, UnmarshallingContext context) {
		List<Tag> list = new ArrayList<Tag>();

		String name = null;
		while (reader.hasMoreChildren()) {
			reader.moveDown();
			Tag tag = new Tag();
			while (reader.hasMoreChildren()) {
				reader.moveDown();
				name = reader.getNodeName();
				if (ELEMENT_KEY.equals(name)) {
					tag.setKey(reader.getValue());
				} else if (ELEMENT_VALUE.equals(name)) {
					tag.setValue(reader.getValue());
				}
				reader.moveUp();
			}
			list.add(tag);
			reader.moveUp();
		}
		return list;
	}

	/**
	 * 未実装メソッド 
	 */
	@Override
	public void marshal(Object source, HierarchicalStreamWriter writer, MarshallingContext context) {
		
	}
}
