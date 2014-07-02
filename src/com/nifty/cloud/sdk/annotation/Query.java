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
package com.nifty.cloud.sdk.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * クエリ指定アノテーション。<br />
 * このクラスは、リクエストクラスからのクエリ作成時に使用します。
 * 
 */
@Retention(RetentionPolicy.RUNTIME)
@Target( { ElementType.METHOD })
public @interface Query {
	
	/**
	 * クエリで使用する名前を指定します。
	 * 指定は引数の無いgetterメソッドに対し行います。	
	 *  
	 * @return クエリ名
	 */
	String name();
	
	/**
	 * 必須項目チェックでエラーとなった際、クエリ名以外の文字列を表示したい場合に指定します。
	 *  
	 * @return クエリ別名
	 */
	String alias() default "";	
	
	/**
	 * 必須項目の場合、trueを設定します。
	 * Default値はfalse。
	 * 
	 * @return　必須項目の場合true、非必須項目はfalse
	 */
	boolean require() default false;
	
	/**
	 * シーケンス番号を項目名の後ろにつける場合にtrueを設定します。
	 * Default値はfalse.(前にシーケンス番号が付与される。)<br />
	 * ex) <br />
	 * \@Query(name="name") ->  parent.1.name <br />
	 * \@Query(name="name", reverseSequence) -> parent.name.1 <br /> 
	 * 
	 * @return シーケンス番号を後ろにつける場合true、それ以外はfalse
	 */
	boolean reverseSequence() default false;
}
