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

import com.nifty.cloud.sdk.server.model.DiskImageVolumeDescription;
import com.thoughtworks.xstream.converters.Converter;
import com.thoughtworks.xstream.converters.MarshallingContext;
import com.thoughtworks.xstream.converters.UnmarshallingContext;
import com.thoughtworks.xstream.io.HierarchicalStreamReader;
import com.thoughtworks.xstream.io.HierarchicalStreamWriter;

/**
 * DiskImageVolumeDescription変換クラス。<br />
 * このクラスはレスポンスXMLのvolume要素からDiskImageVolumeDescriptionクラスを生成します。
 *  
 */
public class DiskImageVolumeDescriptionConverter implements Converter {

	private static final String ELEMENT_SIZE = "size";
	private static final String ELEMENT_ID = "id";

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
		return clazz == DiskImageVolumeDescription.class;
	}

	/**
	 * volumeをDiskImageVolumeDescriptionクラスに変換します。
	 * 
	 * @param reader XML読込リーダ
	 * @param context 
	 * @return DiskImageVolumeDescriptionオブジェクト
	 * 
	 * @see com.thoughtworks.xstream.converters.Converter#unmarshal(HierarchicalStreamReader, UnmarshallingContext)
	 */
	@Override
	public Object unmarshal(HierarchicalStreamReader reader, UnmarshallingContext context) {
		DiskImageVolumeDescription diskImageVolumeDescription = new DiskImageVolumeDescription();

		String name = null;
		while (reader.hasMoreChildren()) {
			reader.moveDown();
			name = reader.getNodeName();
			if (ELEMENT_SIZE.equals(name)) {
				diskImageVolumeDescription.setSize(new Long(reader.getValue()));
			} else if (ELEMENT_ID.equals(name)) {
				diskImageVolumeDescription.setId(reader.getValue());
			}
			reader.moveUp();
		}

		return diskImageVolumeDescription;
	}

	/**
	 * 未実装メソッド 
	 */
	@Override
	public void marshal(Object source, HierarchicalStreamWriter writer, MarshallingContext context) {
		
	}

}
