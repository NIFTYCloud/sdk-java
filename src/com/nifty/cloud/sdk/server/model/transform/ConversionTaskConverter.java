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
package com.nifty.cloud.sdk.server.model.transform;

import java.util.List;

import com.nifty.cloud.sdk.server.model.ConversionTask;
import com.nifty.cloud.sdk.server.model.ImportInstance;
import com.nifty.cloud.sdk.server.model.Tag;
import com.nifty.cloud.sdk.tools.DateUtils;
import com.thoughtworks.xstream.converters.Converter;
import com.thoughtworks.xstream.converters.MarshallingContext;
import com.thoughtworks.xstream.converters.UnmarshallingContext;
import com.thoughtworks.xstream.io.HierarchicalStreamReader;
import com.thoughtworks.xstream.io.HierarchicalStreamWriter;

/**
 * ConversionTask変換クラス。<br />
 * このクラスはレスポンスXMLのconversionTask要素からConversionTaskクラスを生成します。
 *  
 */
public class ConversionTaskConverter implements Converter {

	private static final String ELEMENT_CONVERSION_TASK_ID = "conversionTaskId";
	private static final String ELEMENT_EXPIRATION_TIME = "expirationTime";
	private static final String ELEMENT_IMPORT_INSTANCE = "importInstance";
	private static final String ELEMENT_STATE = "state";
	private static final String ELEMENT_STATUS_MESSAGE = "statusMessage";
	private static final String ELEMENT_TAG_SET = "tagSet";

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
		return clazz == ConversionTask.class;
	}


	/**
	 * conversionTaskをConversionTaskクラスに変換します。
	 * 
	 * @param reader XML読込リーダ
	 * @param context 
	 * @return ConversionTaskオブジェクト
	 * 
	 * @see com.thoughtworks.xstream.converters.Converter#unmarshal(HierarchicalStreamReader, UnmarshallingContext)
	 */
	@SuppressWarnings("unchecked")
	@Override
	public Object unmarshal(HierarchicalStreamReader reader, UnmarshallingContext context) {
		ConversionTask conversionTask = new ConversionTask();
		ImportInstanceConverter importInstanceConverter = new ImportInstanceConverter();
		TagSetConverter tagSetConverter = new TagSetConverter();

		String name = null;
		while (reader.hasMoreChildren()) {
			reader.moveDown();
			name = reader.getNodeName();
			if (ELEMENT_CONVERSION_TASK_ID.equals(name)) {
				conversionTask.setConversionTaskId(reader.getValue());
			} else if (ELEMENT_EXPIRATION_TIME.equals(name)) {
				conversionTask.setExpirationTime(DateUtils.toDate(reader.getValue()));
			} else if (ELEMENT_IMPORT_INSTANCE.equals(name)) {
				conversionTask.setImportInstance((ImportInstance)importInstanceConverter.unmarshal(reader, context));
			} else if (ELEMENT_STATE.equals(name)) {
				conversionTask.setState(reader.getValue());
			} else if (ELEMENT_STATUS_MESSAGE.equals(name)) {
				conversionTask.setStatusMessage(reader.getValue());
			} else if (ELEMENT_TAG_SET.equals(name)) {
				conversionTask.setTagSet((List<Tag>)tagSetConverter.unmarshal(reader, context));
			}

			reader.moveUp();
		}

		return conversionTask;
	}

	/**
	 * 未実装メソッド 
	 */
	@Override
	public void marshal(Object source, HierarchicalStreamWriter writer, MarshallingContext context) {
		
	}
}
