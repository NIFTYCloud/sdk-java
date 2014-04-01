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
package com.nifty.cloud.sdk.misc.model.transform;

import java.util.ArrayList;
import java.util.List;

import com.nifty.cloud.sdk.misc.model.Region;
import com.thoughtworks.xstream.converters.Converter;
import com.thoughtworks.xstream.converters.MarshallingContext;
import com.thoughtworks.xstream.converters.UnmarshallingContext;
import com.thoughtworks.xstream.io.HierarchicalStreamReader;
import com.thoughtworks.xstream.io.HierarchicalStreamWriter;

/**
 *  RegionSetType変換クラス。<br />
 *  このクラスはレスポンスXMLのregionInfo要素からRegionクラスのリストを生成します。
 */
public class RegionSetConverter implements Converter {

	private static final String ELEMENT_REGION_NAME = "regionName";
	private static final String ELEMENT_REGION_ENDPOINT = "regionEndpoint";
	private static final String ELEMENT_MESSAGE_SET = "messageSet";
	private static final String ELEMENT_IS_DEFAULT = "isDefault";

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
		for(Class i : clazz.getInterfaces()) {
			if (i == List.class) {
				return true;
			}
		}
		return false;
	}
	/**
	 * {@literal
	 * regionInfo要素をList<Region>クラスに変換します。}
	 *
	 * @param reader XML読込リーダ
	 * @param context
	 * @return {@literal List<Region>オブジェクト}
	 *
	 * @see com.thoughtworks.xstream.converters.Converter#unmarshal(HierarchicalStreamReader, UnmarshallingContext)
	 */
	@SuppressWarnings("unchecked")
	@Override
	public Object unmarshal(HierarchicalStreamReader reader, UnmarshallingContext context) {
		List<Region> regions = new ArrayList<Region>();
		Converter messageSetConverter = new RegionMessageSetConverter();

		String name = null;
		while(reader.hasMoreChildren()) {
			reader.moveDown();
			Region region = new Region();
			while(reader.hasMoreChildren()) {
				reader.moveDown();

				name = reader.getNodeName();
				if (name.equals(ELEMENT_REGION_NAME)) {
					region.setRegionName(reader.getValue());
				}
				else if (name.equals(ELEMENT_REGION_ENDPOINT)){
					region.setRegionEndpoint(reader.getValue());
				}
				else if (name.equals(ELEMENT_MESSAGE_SET)) {
					region.setMessages((List<String>) messageSetConverter.unmarshal(reader, context));
				}
				else if (name.equals(ELEMENT_IS_DEFAULT)) {
					region.setIsDefault(Boolean.valueOf(reader.getValue()));
				}
				reader.moveUp();
			}
			reader.moveUp();
			regions.add(region);
		}
		return regions;
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
