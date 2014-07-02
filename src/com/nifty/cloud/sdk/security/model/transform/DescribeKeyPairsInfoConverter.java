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
package com.nifty.cloud.sdk.security.model.transform;


import java.util.ArrayList;
import java.util.List;

import com.nifty.cloud.sdk.security.model.KeyPairInfo;
import com.thoughtworks.xstream.converters.Converter;
import com.thoughtworks.xstream.converters.MarshallingContext;
import com.thoughtworks.xstream.converters.UnmarshallingContext;
import com.thoughtworks.xstream.io.HierarchicalStreamReader;
import com.thoughtworks.xstream.io.HierarchicalStreamWriter;

/**
 * DescribeKeyPairsResponseInfoType変換クラス。<br />
 * このクラスはレスポンスXMLのkeySet要素からRunInstancesResultクラスを生成します。
　*
 */
public class DescribeKeyPairsInfoConverter implements Converter {

	private static final String ELEMENT_KEY_NAME = "keyName";
	private static final String ELEMENT_KEY_FINGERPRINT = "keyFingerprint";

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
	 * keySetをList<KeyPairInfo>クラスに変換します。}
	 *
	 * @param reader XML読込リーダ
	 * @param context
	 * @return {@literal List<KeyPairInfo>オブジェクト}
	 *
	 * @see com.thoughtworks.xstream.converters.Converter#unmarshal(HierarchicalStreamReader, UnmarshallingContext)
	 */
	@Override
	public Object unmarshal(HierarchicalStreamReader reader, UnmarshallingContext context) {
		List<KeyPairInfo> keyPairs = new ArrayList<KeyPairInfo>();

		String name = null;
		while(reader.hasMoreChildren()) {
			reader.moveDown();
			KeyPairInfo keyPairInfo = new KeyPairInfo();

			while(reader.hasMoreChildren()) {
				reader.moveDown();

				name = reader.getNodeName();
				if (name.equals(ELEMENT_KEY_NAME)) {
					keyPairInfo.setKeyName(reader.getValue());
				}
				else if (name.equals(ELEMENT_KEY_FINGERPRINT)) {
					keyPairInfo.setKeyFingerprint(reader.getValue());
				}

				reader.moveUp();
			}

			reader.moveUp();
			keyPairs.add(keyPairInfo);
		}

		return keyPairs;
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
