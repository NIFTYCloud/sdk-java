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
package com.nifty.cloud.sdk.tools;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import com.nifty.cloud.sdk.NiftyClientException;

/**
 * 日付型ユーティリティ。<br />
 * 日付型 と文字列の変換を行います。
 *
 */
public final class DateUtils {

	/**
	 * "yyyy-MM-ddTHH:mm:ss.SZ"フォーマットに変換した文字列を取得します。
	 * 
	 * @param date 日付
	 * @return 日付文字列
	 */
	public static String toString(Date date) {
		XMLGregorianCalendar calendar = null;
		try {
			GregorianCalendar cal = new GregorianCalendar();
			cal.setTime(date);
			calendar = DatatypeFactory.newInstance().newXMLGregorianCalendar(cal);
		} catch (DatatypeConfigurationException e) {
			throw new NiftyClientException(e);
		}
		
		return calendar.toXMLFormat();
	}

	/**
	 * "yyyy-MM-ddTHH:mm:ssZ"フォーマットに変換した文字列を取得します。
	 * 
	 * @param date 日付
	 * @return 日付文字列
	 */
	public static String toISO8601FormatedString(Date date) {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
        df.setTimeZone(TimeZone.getTimeZone("UTC"));

        return (df.format(date));
	}
	
	/**
	 * "yyyy-MM-ddTHH:mm:ssZ"フォーマットに変換した文字列を取得します。
	 * 
	 * @param date 日付
	 * @return 日付文字列
	 */
	public static String toStringWithoutMsec(Date date) {
		XMLGregorianCalendar calendar = null;
		try {
			GregorianCalendar cal = new GregorianCalendar();
			cal.setTime(date);
			calendar = DatatypeFactory.newInstance().newXMLGregorianCalendar(cal);
			calendar.setFractionalSecond(null);
		} catch (DatatypeConfigurationException e) {
			throw new NiftyClientException(e);
		}
		
		return calendar.toXMLFormat();
	}

	/**
	 * "yyyy-MM-ddTHH:mm:ssZ"もしくは"yyyy-MM-ddTHH:mm:ss.SZ"であらわされた日付をDate型に変換します。
	 * 
	 * @param timeStamp 日付文字列 
	 * @return 変換されたDate型オブジェクト
	 */
	public static Date toDate(String timeStamp) {
		XMLGregorianCalendar calendar = null;
		try {
			calendar = DatatypeFactory.newInstance().newXMLGregorianCalendar(timeStamp);
		} catch(IllegalArgumentException e) {
			throw new NiftyClientException(e);
		} catch(DatatypeConfigurationException e) {
			throw new NiftyClientException(e);
		}
		
		return calendar.toGregorianCalendar().getTime();
	}
	
}
