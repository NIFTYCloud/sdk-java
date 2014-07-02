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
package com.nifty.cloud.sdk.upload.model.transform;

import java.util.ArrayList;
import java.util.List;

import com.nifty.cloud.sdk.tools.DateUtils;
import com.nifty.cloud.sdk.upload.model.ImportInstance;
import com.nifty.cloud.sdk.upload.model.Upload;
import com.thoughtworks.xstream.converters.Converter;
import com.thoughtworks.xstream.converters.MarshallingContext;
import com.thoughtworks.xstream.converters.UnmarshallingContext;
import com.thoughtworks.xstream.io.HierarchicalStreamReader;
import com.thoughtworks.xstream.io.HierarchicalStreamWriter;

/**
 * uploadSet変換クラス。<br />
 * このクラスはレスポンスXMLのuploadSet要素からUploadクラスのリストを生成します。
 *
 */
public class UploadSetConverter implements Converter {

	private static final String ELEMENT_CONVERSION_TASK_ID = "conversionTaskId";
	private static final String ELEMENT_EXPIRATION_TIME = "expirationTime";
	private static final String ELEMENT_IMPORT_INSTANCE = "importInstance";

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
	 * {@literal
	 * uploadSetをList<Upload>に変換します。}
	 *
	 * @param reader XML読込リーダ
	 * @param context
	 * @return {@literal List<Upload>オブジェクト}
	 *
	 * @see com.thoughtworks.xstream.converters.Converter#unmarshal(HierarchicalStreamReader, UnmarshallingContext)
	 */
	@Override
	public Object unmarshal(HierarchicalStreamReader reader, UnmarshallingContext context) {
		List<Upload> list = new ArrayList<Upload>();
		ImportInstanceConverter converter = new ImportInstanceConverter();

		String name = null;
		while (reader.hasMoreChildren()) {
			reader.moveDown();
			Upload upload = new Upload();
			while (reader.hasMoreChildren()) {
				reader.moveDown();
				name = reader.getNodeName();
				if (ELEMENT_CONVERSION_TASK_ID.equals(name)) {
					upload.setConversionTaskId(reader.getValue());
				} else if (ELEMENT_EXPIRATION_TIME.equals(name)) {
					upload.setExpirationTime(DateUtils.toDate(reader.getValue()));
				} else if (ELEMENT_IMPORT_INSTANCE.equals(name)) {
					upload.setImportInstance((ImportInstance)converter.unmarshal(reader, context));
				}
				reader.moveUp();
			}
			list.add(upload);
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
