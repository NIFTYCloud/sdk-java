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
package com.nifty.cloud.sdk.usage.model.transform;

import java.util.ArrayList;
import java.util.List;

import com.nifty.cloud.sdk.tools.DateUtils;
import com.nifty.cloud.sdk.usage.model.UserActivity;
import com.thoughtworks.xstream.converters.Converter;
import com.thoughtworks.xstream.converters.MarshallingContext;
import com.thoughtworks.xstream.converters.UnmarshallingContext;
import com.thoughtworks.xstream.io.HierarchicalStreamReader;
import com.thoughtworks.xstream.io.HierarchicalStreamWriter;

/**
 * DescribeUserActivitiesSetType変換クラス。<br />
 * このクラスはレスポンスXMLのuserActivitiesSet要素からUserActivityクラスのリストを生成します。
 */
public class UserActivitySetConverter implements Converter {

	private static final String ELEMENT_DATE_TIME = "dateTime";
	private static final String ELEMENT_IP_ADDRESS = "ipAddress";
	private static final String ELEMENT_CATEGORY_NAME = "categoryName";
	private static final String ELEMENT_OPERATOR = "operator";
	private static final String ELEMENT_OPERATION = "operation";
	private static final String ELEMENT_RESULT = "result";

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
	 * userActivitiesSet要素をList<UserActivity>クラスに変換します。
	 * 
	 * @param reader XML読込リーダ
	 * @param context
	 * @return List<UserActivity>オブジェクト
	 * 
	 * @see com.thoughtworks.xstream.converters.Converter#unmarshal(HierarchicalStreamReader, UnmarshallingContext)
	 */
	@Override
	public Object unmarshal(HierarchicalStreamReader reader,
			UnmarshallingContext context) {
		List<UserActivity> describeUserActivities = new ArrayList<UserActivity>();
		
		String name = null;
		while (reader.hasMoreChildren()) {
			reader.moveDown();
			UserActivity userActivity = new UserActivity();
			
			while (reader.hasMoreChildren()) {
				reader.moveDown();
				
				name = reader.getNodeName();
				if (name.equals(ELEMENT_DATE_TIME)) {
					userActivity.setDateTime(DateUtils.toDate(reader.getValue()));
				}
				else if (name.equals(ELEMENT_IP_ADDRESS)) {
					userActivity.setIpAddress(reader.getValue());
				}
				else if (name.equals(ELEMENT_CATEGORY_NAME)) {
					userActivity.setCategoryName(reader.getValue());
				}
				else if (name.equals(ELEMENT_OPERATOR)) {
					userActivity.setOperator(reader.getValue());
				}
				else if (name.equals(ELEMENT_OPERATION)) {
					userActivity.setOperation(reader.getValue());
				}
				else if (name.equals(ELEMENT_RESULT)) {
					userActivity.setResult(Boolean.valueOf(reader.getValue()));
				}
				
				reader.moveUp();
			}
			
			reader.moveUp();
			describeUserActivities.add(userActivity);
		}
		
		return describeUserActivities;
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
