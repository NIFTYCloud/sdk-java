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
 *  Date: 2011-11-29 14:07:10
 * 
 */
package com.nifty.cloud.sdk.server.model.transform;

import com.nifty.cloud.sdk.server.model.DiskImageDescription;
import com.thoughtworks.xstream.converters.Converter;
import com.thoughtworks.xstream.converters.MarshallingContext;
import com.thoughtworks.xstream.converters.UnmarshallingContext;
import com.thoughtworks.xstream.io.HierarchicalStreamReader;
import com.thoughtworks.xstream.io.HierarchicalStreamWriter;

/**
 * DiskImageDescription変換クラス。<br />
 * このクラスはレスポンスXMLのimage要素からDiskImageDescriptionクラスを生成します。
 *  
 */
public class DiskImageDescriptionConverter implements Converter {

	private static final String ELEMENT_FORMAT = "format";
	private static final String ELEMENT_SIZE = "size";
	private static final String ELEMENT_IMPORT_MANIFEST_URL = "importManifestUrl";
	private static final String ELEMENT_CHECKSUM = "checksum";

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
		return clazz == DiskImageDescription.class;
	}

	/**
	 * imageをDiskImageDescriptionクラスに変換します。
	 * 
	 * @param reader XML読込リーダ
	 * @param context 
	 * @return DiskImageDescriptionオブジェクト
	 * 
	 * @see com.thoughtworks.xstream.converters.Converter#unmarshal(HierarchicalStreamReader, UnmarshallingContext)
	 */
	@Override
	public Object unmarshal(HierarchicalStreamReader reader, UnmarshallingContext context) {
		DiskImageDescription diskImageDescription = new DiskImageDescription();

		String name = null;
		while (reader.hasMoreChildren()) {
			reader.moveDown();
			name = reader.getNodeName();
			if (ELEMENT_FORMAT.equals(name)) {
				diskImageDescription.setFormat(reader.getValue());
			} else if (ELEMENT_SIZE.equals(name)) {
				diskImageDescription.setSize(new Long(reader.getValue()));
			} else if (ELEMENT_IMPORT_MANIFEST_URL.equals(name)) {
				diskImageDescription.setImportManifestUrl(reader.getValue());
			} else if (ELEMENT_CHECKSUM.equals(name)) {
				diskImageDescription.setChecksum(new Integer(reader.getValue()));
			}
			reader.moveUp();
		}

		return diskImageDescription;
	}

	/**
	 * 未実装メソッド 
	 */
	@Override
	public void marshal(Object source, HierarchicalStreamWriter writer, MarshallingContext context) {
		
	}
}
