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
 *  API Version: 1.9
 *  Date: 2011-08-25 09:46:38
 * 
 */
package com.nifty.cloud.sdk.security.model.transform;


import com.nifty.cloud.sdk.security.model.CreateKeyPairResult;
import com.nifty.cloud.sdk.security.model.KeyPair;
import com.thoughtworks.xstream.converters.Converter;
import com.thoughtworks.xstream.converters.MarshallingContext;
import com.thoughtworks.xstream.converters.UnmarshallingContext;
import com.thoughtworks.xstream.io.HierarchicalStreamReader;
import com.thoughtworks.xstream.io.HierarchicalStreamWriter;

/**
 * CreateKeyPairResponseType変換クラス。<br />
 * このクラスはレスポンスXMLのCreateKeyPairResponse要素からRunInstancesResultクラスを生成します。
 *  
 */
public class CreateKeyPairConverter implements Converter {

	private static final String ELEMENT_REQUEST_ID = "requestId";
	private static final String ELEMENT_KEY_NAME = "keyName";
	private static final String ELEMENT_KEY_FINGER_PRINT = "keyFingerprint";
	private static final String ELEMENT_KEY_MATERIAL = "keyMaterial";
	
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
		return clazz == CreateKeyPairResult.class;
	}

	/**
	 * CreateKeyPairResponseエレメントをCreateKeyPairResultクラスに変換します。
	 * 
	 * @param reader XML読込リーダ
	 * @param context 
	 * @return CreateKeyPairResultオブジェクト
	 * 
	 * @see com.thoughtworks.xstream.converters.Converter#unmarshal(HierarchicalStreamReader, UnmarshallingContext)
	 */
	@Override
	public Object unmarshal(HierarchicalStreamReader reader, UnmarshallingContext context) {
		CreateKeyPairResult createKeyPairResult = new CreateKeyPairResult();
		KeyPair keyPair = new KeyPair();
		createKeyPairResult.setKeyPair(keyPair);
        	
		String name = null;

		while(reader.hasMoreChildren()) {
			reader.moveDown();

			name = reader.getNodeName();
			if (name.equals(ELEMENT_REQUEST_ID)) {
				createKeyPairResult.setRequestId(reader.getValue());
			}
			else if (name.equals(ELEMENT_KEY_NAME)) {
				keyPair.setKeyName(reader.getValue());
			}
			else if (name.equals(ELEMENT_KEY_FINGER_PRINT)) {
				keyPair.setKeyFingerprint(reader.getValue());
			}
			else if (name.equals(ELEMENT_KEY_MATERIAL)) {
				keyPair.setKeyMaterial(reader.getValue());
			}
			
			reader.moveUp();
		}
		return createKeyPairResult;
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
