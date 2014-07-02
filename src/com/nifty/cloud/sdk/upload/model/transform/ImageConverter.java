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

import com.nifty.cloud.sdk.upload.model.Image;
import com.thoughtworks.xstream.converters.Converter;
import com.thoughtworks.xstream.converters.MarshallingContext;
import com.thoughtworks.xstream.converters.UnmarshallingContext;
import com.thoughtworks.xstream.io.HierarchicalStreamReader;
import com.thoughtworks.xstream.io.HierarchicalStreamWriter;

/**
 * image変換クラス。<br />
 * このクラスはレスポンスXMLのimage要素からImageクラスを生成します。
 *  
 */
public class ImageConverter implements Converter {

	private static final String ELEMENT_FORMAT = "format";
	private static final String ELEMENT_SIZE = "size";

	@SuppressWarnings("rawtypes")
	@Override
	public boolean canConvert(Class type) {
		return type == Image.class;
	}

	/**
	 * imageをImageクラスに変換します。
	 *
	 * @param reader XML読込リーダ
	 * @param context
	 * @return Imageオブジェクト
	 *
	 * @see com.thoughtworks.xstream.converters.Converter#unmarshal(HierarchicalStreamReader, UnmarshallingContext)
	 */
	@Override
	public Object unmarshal(HierarchicalStreamReader reader, UnmarshallingContext context) {
		Image image = new Image();

		String name = null;
		while (reader.hasMoreChildren()) {
			reader.moveDown();
			name = reader.getNodeName();
			if (ELEMENT_FORMAT.equals(name)) {
				image.setFormat(reader.getValue());
			} else if (ELEMENT_SIZE.equals(name)) {
				image.setSize(new Long(reader.getValue()));
			}
			reader.moveUp();
		}

		return image;
	}

	/**
	 * 未実装メソッド
	 */
	@Override
	public void marshal(Object source, HierarchicalStreamWriter writer, MarshallingContext context) {
		
	}

}
