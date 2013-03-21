/******************************************************************************* 
 *  Copyright 2012 NIFTY Corporation All Rights Reserved.
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
 *  API Version: 1.12
 *  Date: 2012-12-21 17:00:00
 * 
 */
package com.nifty.cloud.sdk.usage.model.transform;

import java.util.ArrayList;
import java.util.List;

import com.nifty.cloud.sdk.usage.model.UsageDetail;
import com.nifty.cloud.sdk.usage.model.UsageMailSend;
import com.thoughtworks.xstream.converters.Converter;
import com.thoughtworks.xstream.converters.MarshallingContext;
import com.thoughtworks.xstream.converters.UnmarshallingContext;
import com.thoughtworks.xstream.io.HierarchicalStreamReader;
import com.thoughtworks.xstream.io.HierarchicalStreamWriter;

/**
 * MailSendInfo変換クラス。<br />
 * このクラスはレスポンスXMLのMailSendInfo要素からUsageMailSendクラスを生成します。
 */
public class MailSendInfoConverter implements Converter {

	private static final String ELEMENT_TYPE = "type";
	private static final String ELEMENT_UNIT = "unit";
	private static final String ELEMENT_VALUE = "value";
	private static final String ELEMENT_MAILSEND_INITIAL = "mailSendInitial";
	private static final String ELEMENT_MAILSEND_INITIAL_CAMPAIGN = "mailSendInitialCampaign";
	private static final String ELEMENT_MAILSEND_MONTHLY_RATE = "mailSendMonthlyRate";
	private static final String ELEMENT_MAILSEND_MEASURED_RATE = "mailSendMeasuredRate";
	private static final String ELEMENT_MAILSEND_MOTHLY_EXCEEDED = "mailSendMonthlyRateExceeded";
	private static final String ELEMENT_MAILSEND_OPTIONSET = "optionSet";

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
		return clazz == UsageMailSend.class;
	}

	/**
	 * MailSendInfo要素をUsageMailSendクラスに変換します。
	 *
	 * @param reader XML読込リーダ
	 * @param context
	 * @return UsageMailSendオブジェクト
	 *
	 * @see com.thoughtworks.xstream.converters.Converter#unmarshal(HierarchicalStreamReader, UnmarshallingContext)
	 */
	@SuppressWarnings("unchecked")
	@Override
	public Object unmarshal(HierarchicalStreamReader reader,
			UnmarshallingContext context) {
		UsageMailSend mailSend = new UsageMailSend();
		List<UsageDetail> monthlyRate = new ArrayList<UsageDetail>();
		Converter converter = new UsageDetailConverter();
		Converter listConverter = new UsageDetailSetConverter();

		String name = null;
		while (reader.hasMoreChildren()) {
			reader.moveDown();

			name = reader.getNodeName();
			if (name.equals(ELEMENT_MAILSEND_INITIAL)) {
				mailSend.setMailSendInitial((UsageDetail) converter.unmarshal(
						reader, context));
			} else if (name.equals(ELEMENT_MAILSEND_INITIAL_CAMPAIGN)) {
				mailSend.setMailSendInitialCampaign((UsageDetail) converter
						.unmarshal(reader, context));
			} else if (name.equals(ELEMENT_MAILSEND_MONTHLY_RATE)) {
				UsageDetail usageDetail = new UsageDetail();

				while (reader.hasMoreChildren()) {
					reader.moveDown();
					name = reader.getNodeName();
					if (name.equals(ELEMENT_TYPE)) {
						usageDetail.setType(reader.getValue());
					} else if (name.equals(ELEMENT_UNIT)) {
						usageDetail.setUnit(reader.getValue());
					} else if (name.equals(ELEMENT_VALUE)) {
						usageDetail
								.setValue(Integer.valueOf(reader.getValue()));
					}
					reader.moveUp();
				}
				monthlyRate.add(usageDetail);
			} else if (name.equals(ELEMENT_MAILSEND_MEASURED_RATE)) {
				mailSend.setMailSendMeasuredRate((UsageDetail) converter
						.unmarshal(reader, context));
			} else if (name.equals(ELEMENT_MAILSEND_MOTHLY_EXCEEDED)) {
				mailSend.setMailSendMonthlyRateExceeded((UsageDetail) converter
						.unmarshal(reader, context));
			} else if (name.equals(ELEMENT_MAILSEND_OPTIONSET)) {
				mailSend.setOptions((List<UsageDetail>) listConverter
						.unmarshal(reader, context));
			}

			reader.moveUp();
		}

		mailSend.setMailSendMonthlyRate(monthlyRate);
		return mailSend;
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
