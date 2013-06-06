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
 *  API Version: 1.14
 *  Date: 2013-03-28 17:00:00
 * 
 */
package com.nifty.cloud.sdk.upload.model.transform;

import com.nifty.cloud.sdk.upload.model.Image;
import com.nifty.cloud.sdk.upload.model.ImportInstance;
import com.thoughtworks.xstream.converters.Converter;
import com.thoughtworks.xstream.converters.MarshallingContext;
import com.thoughtworks.xstream.converters.UnmarshallingContext;
import com.thoughtworks.xstream.io.HierarchicalStreamReader;
import com.thoughtworks.xstream.io.HierarchicalStreamWriter;

/**
 * importInstance変換クラス。<br />
 * このクラスはレスポンスXMLのimportInstance要素からImportInstanceクラスを生成します。
 *  
 */
public class ImportInstanceConverter implements Converter {

	private static final String ELEMENT_AVAILABILITY_ZONE = "availabilityZone";
	private static final String ELEMENT_IMAGE = "image";
	private static final String ELEMENT_INSTANCE_ID = "instanceId";

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
		return clazz == ImportInstance.class;
	}

	/**
	 * importInstanceをImportInstanceクラスに変換します。
	 *
	 * @param reader XML読込リーダ
	 * @param context
	 * @return ImportInstanceオブジェクト
	 *
	 * @see com.thoughtworks.xstream.converters.Converter#unmarshal(HierarchicalStreamReader, UnmarshallingContext)
	 */
	@Override
	public Object unmarshal(HierarchicalStreamReader reader, UnmarshallingContext context) {
		ImportInstance importInstance = new ImportInstance();
		Converter converter = new ImageConverter();

		String name = null;
		while (reader.hasMoreChildren()) {
			reader.moveDown();
			name = reader.getNodeName();
			if (ELEMENT_AVAILABILITY_ZONE.equals(name)) {
				importInstance.setAvailabilityZone(reader.getValue());
			} else if (ELEMENT_IMAGE.equals(name)) {
				importInstance.setImage((Image)converter.unmarshal(reader, context));
			} else if (ELEMENT_INSTANCE_ID.equals(name)) {
				importInstance.setInstanceId(reader.getValue());
			}
			reader.moveUp();
		}

		return importInstance;
	}

	/**
	 * 未実装メソッド
	 */
	@Override
	public void marshal(Object source, HierarchicalStreamWriter writer, MarshallingContext context) {
		
	}

}
