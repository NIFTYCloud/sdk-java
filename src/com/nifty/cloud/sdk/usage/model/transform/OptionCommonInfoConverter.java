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
package com.nifty.cloud.sdk.usage.model.transform;

import java.util.ArrayList;
import java.util.List;

import com.nifty.cloud.sdk.usage.model.UsageDetail;
import com.nifty.cloud.sdk.usage.model.UsageOptionCommon;
import com.thoughtworks.xstream.converters.Converter;
import com.thoughtworks.xstream.converters.MarshallingContext;
import com.thoughtworks.xstream.converters.UnmarshallingContext;
import com.thoughtworks.xstream.io.HierarchicalStreamReader;
import com.thoughtworks.xstream.io.HierarchicalStreamWriter;

/**
 * UsageOptionCommon変換クラス。<br />
 * このクラスはレスポンスXMLのoptionCommonInfo要素からList<UsageOptionCommon>クラスのリストを生成します。
 */
public class OptionCommonInfoConverter implements Converter {

	private static final String ELEMENT_OPTION_NAME = "optionName";
	private static final String ELEMENT_OPTIONS     = "optionSet";

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
		for (Class i : interfaces) {
			if (i == List.class) {
				return true;
			}
		}
		return false;
	}

	/**
	 * optionCommonInfoをUsageOptionCommonクラスに変換します。
	 *
	 * @param reader
	 *            XML読込リーダ
	 * @param context
	 * @return List<UsageOptionCommon>オブジェクト
	 *
	 * @see com.thoughtworks.xstream.converters.Converter#unmarshal(HierarchicalStreamReader,
	 *      UnmarshallingContext)
	 */
	@SuppressWarnings("unchecked")
	@Override
	public Object unmarshal(HierarchicalStreamReader reader,
			UnmarshallingContext context) {

		List<UsageOptionCommon> usageOptionCommons = new ArrayList<UsageOptionCommon>();
		Converter optionsConverter = new UsageDetailSetConverter();


		String name = null;
		while (reader.hasMoreChildren()) {
			reader.moveDown();
			UsageOptionCommon usageOptionCommon = new UsageOptionCommon();

			while (reader.hasMoreChildren()) {
				reader.moveDown();

				name = reader.getNodeName();
				if (name.equals(ELEMENT_OPTION_NAME)) {
					usageOptionCommon.setOptionName(reader.getValue());
				}
				else if (name.equals(ELEMENT_OPTIONS)) {
					
					usageOptionCommon.setOptionSet((List<UsageDetail>) optionsConverter
							.unmarshal(reader, context));
				}

				reader.moveUp();
			}
			reader.moveUp();
			usageOptionCommons.add(usageOptionCommon);
		}

		return usageOptionCommons;
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