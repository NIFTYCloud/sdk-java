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
 *  Date: 2011-08-25 09:46:38
 * 
 */
package com.nifty.cloud.sdk.tools;


import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;
import java.net.URLEncoder;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.regex.Pattern;

import static com.nifty.cloud.sdk.Const.ENCODING;
import com.nifty.cloud.sdk.NiftyClientException;
import com.nifty.cloud.sdk.Request;
import com.nifty.cloud.sdk.annotation.Query;

/**
 * クエリ生成クラス。<br />
 *　リクエストクラスからクエリ文字列の生成を行います。 
 *
 */
public class QueryStringGenarator extends TreeMap<String, String> {
	

	private static final long serialVersionUID = 1L;
	private static final String SEPARETOR = ".";
	private static final String PLUS_SIGN            = "\\+";
	private static final String ENCODE_PLUS_SIGN     = "%20";
	private static final String ASTERISK_SIGN        = "\\*";
	private static final String ENCODE_ASTERISK_SIGN = "%2A";
	private static final String TILDE_SIGN           = "~";
	private static final String ENCODE_TILDE_SIGN    = "%7E";
	private static final String SLASH_SIGN           = "\\/";
	private static final String ENCODE_SLASH_SIGN    = "%2F";
	private static final Pattern PLUS_PATTERN     = Pattern.compile(PLUS_SIGN);
	private static final Pattern ASTERISK_PATTERN = Pattern.compile(ASTERISK_SIGN);
	private static final Pattern TILDE_PATTERN    = Pattern.compile(ENCODE_TILDE_SIGN);
	private static final Pattern SLASH_PATTERN    = Pattern.compile(ENCODE_SLASH_SIGN);
	
	/**
	 * 指定されたリクエストクラスの解析し、データをMapに保持します。
	 * 
	 * @param request リクエストクラス
	 */
	public void parseRequest(Request request) {
		parse("", request);
	}

	/**
	 * 指定されたリクエストオブジェクトを解析し、データをMapに保持します。
	 * リクエストオブジェクトに設定されているQueryアノテーションを取得し
	 * アノテーションから名前、アノテーションが設定されたメソッドから値を取得します。
	 * 取得した名前、値をMapとして保持します。
	 * 
	 * @param name  パラメータ名のプレフィックス
	 * @param obj リクエストオブジェクト
	 */
	private void parse(String name, Object obj) {
		
		if (obj == null) {
			return;
		}
		
		Query query = null;
		Method[] methods = obj.getClass().getMethods();
		for (Method method: methods) {
			query = method.getAnnotation(Query.class);
			if (query == null) {
				continue;
			}
			Object value = null;
			try {
				//　execute method.
				value = method.invoke(obj, new Object[]{});
			} catch (Exception e) {
				throw new NiftyClientException(e);
			}
			if (value == null || (value instanceof List<?> && ((List<?>)value).size()==0)) {
				if (query.require()) {
					String queryName = (query.alias().equals("")) ? query.name() : query.alias();
					throw new NiftyClientException(queryName + " is required.");
				}
				continue;
			}
			
			if (useToString(value)) {
				if (query.reverseSequence()) {
					put(exclusionSequence(name) + query.name(), ejectSequence(name), value);
				}
				else {
					put(name, query.name(), value);
				}
			}else if (value instanceof List) {
				int i = 1;
				for (Object item: (List<?>)value) {
					if (useToString(item)) {
						put(name, addPostfix(query.name(),i), item);
					}
					else {
						parse(addPrefix(name,addPostfix(query.name(),i)), item);
					}
					i++;
				}
			}
			else {
				if (query.reverseSequence()) {
					parse(query.name() + name, value);
				}
				else {
					parse(addPrefix(name, query.name()), value);
				}
			}
		}
	}
	
	/**
	 * Map情報から"name=value"の組み合わせでクエリ文字列を作成します。
	 * @return クエリ文字列
	 */
	public String toQueryString() {
		return toQueryString(false);
	}
	
	/**
	 * Map情報から"name=value"の組み合わせでクエリ文字列を作成します。
	 * @param tilde チルダ文字のエンコード対象外フラグ
	 * @return クエリ文字列
	 */
	public String toQueryString(boolean tilde) {
		StringBuilder sb = new StringBuilder();

		for (Map.Entry<String, String> entry : entrySet()) {
			String name  = urlEncode(entry.getKey(),   false, tilde);
			String value = urlEncode(entry.getValue(), false, tilde);

			sb.append("&").append(name).append("=").append(value);
		}

		return (sb.length()==0) ? "" : sb.substring(1);
	}
	
	/**
	 * 指定された文字列のURLエンコードを行います。
	 * @param value エンコード対象文字列
	 * @param path 対象文字列がURLのパスか（trueの場合はスラッシュ文字をエンコードをエンコード対象外とする）
	 * @param tilde チルダ文字のエンコード対象外フラグ
	 * @return URLエンコードされた文字列
	 */
	public static String urlEncode(String value, boolean path, boolean tilde) {
        String encoded = null;
        
        try {
            encoded = URLEncoder.encode(value, ENCODING);
            encoded = PLUS_PATTERN.matcher(encoded).replaceAll(ENCODE_PLUS_SIGN);            
            encoded = ASTERISK_PATTERN.matcher(encoded).replaceAll(ENCODE_ASTERISK_SIGN);            
            if (tilde) {
                encoded = TILDE_PATTERN.matcher(encoded).replaceAll(TILDE_SIGN);            
            }
            if (path) {
                encoded = SLASH_PATTERN.matcher(encoded).replaceAll(SLASH_SIGN);            
            }
        } catch (UnsupportedEncodingException e) {
            throw new NiftyClientException(e);
        }

        return encoded;		
	}
	
	
	/**
	 * Mapにデータを保持します。
	 * マップのキーには"prefix.name"（prefixが空の場合,"name")を、値にはvalueを指定し保持します。
	 * 
	 * @param prefix プレフィックス 
	 * @param name 名前
	 * @param value 値
	 * @return 保持した値
	 */
	private String put(String prefix, String name, Object value) {
		return (prefix.isEmpty()) ? put(name, value.toString()) :
									 put(prefix + SEPARETOR + name, value.toString());
	}
	
	/**
	 * プレフィックスを付与した名前を取得します。
	 * 
	 * @param prefix プレフィックス
	 * @param name 名前
	 * @return "プレフィックス.名前"を取得します。prefixが空文字列の場合"名前"を取得します。
	 */
	private String addPrefix(String prefix, String name) {
		return (prefix.isEmpty()) ? name : prefix + SEPARETOR + name; 
	}
	
	/**
	 * シーケンス番号を付与した名前を取得します。
	 *
	 * @param name 名前 
	 * @param i シーケンス番号
	 * @return ”名前.シーケンス番号"を返します。
	 */
	private String addPostfix(String name, int i) {
		return name + SEPARETOR + i;
	}
	
	/**
	 * prefix中から"."で区切られた一番最後の文字列（シーケンス番号）を切り出す。
	 * 
	 * @param prefix プレフィックス文字列
	 * @return シーケンス番号文字列
	 */
	private String ejectSequence(String prefix) {
		int index = prefix.lastIndexOf(".");
		if (index == -1) {
			return "";
		}
		return prefix.substring(index+1);
	}
	
	/**
	 * prefix中から"."で区切られた一番最後の文字列（シーケンス番号）を除外します。
	 * 
	 * @param prefix プレフィックス文字列
	 * @return シーケンス番号が除外された文字列
	 */
	private String exclusionSequence(String prefix) {
		int index = prefix.lastIndexOf(".");
		if (index == -1) {
			return "";
		}
		String parent = prefix.substring(0, index+1);
		return (parent.equals(".")) ? "" : parent;
	}
	
	/**
	 * toStringメソッドで値を取り出すクラスかどうかを判断します。
	 *  
	 * @param obj オブジェクト
	 * @return オブジェクトがString/Integer/Long/Float/Double/Booleanの場合true,それ以外はfalse
	 */
	private boolean useToString(Object obj) {
		return (obj instanceof String  ||
				obj instanceof Integer ||
				obj instanceof Long    ||
				obj instanceof Float   ||
				obj instanceof Double  ||
				obj instanceof Boolean ) ?
				true : false;
	}
}
