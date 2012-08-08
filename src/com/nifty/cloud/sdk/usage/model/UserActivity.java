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
package com.nifty.cloud.sdk.usage.model;

import java.util.Date;

/**
 * ログ情報クラス。<br />
 * このクラスはログ情報を格納します。
 */
public class UserActivity {

	/** 日付 */
	private Date dateTime;

	/** 実行元IPアドレス */
	private String ipAddress;

	/** カテゴリ名 */
	private String categoryName;

	/** 実行者 */
	private String operator;

	/** 操作内容 */
	private String operation;

	/** 実行結果 */
	private Boolean result;

	/**
	 * 日付を取得します。
	 * 
	 * @return 日付
	 */
	public Date getDateTime() {
		return dateTime;
	}

	/**
	 * 日付を設定します。
	 * 
	 * @param dateTime 日付
	 */
	public void setDateTime(Date dateTime) {
		this.dateTime = dateTime;
	}

	/**
	 * 日付を設定し、自オブジェクトを返します。
	 * 
	 * @param dateTime 日付
	 * @return 自オブジェクト
	 */
	public UserActivity withDateTime(Date dateTime) {
		setDateTime(dateTime);
		return this;
	}

	/**
	 * 実行元IPアドレスを取得します。
	 * 
	 * @return 実行元IPアドレス
	 */
	public String getIpAddress() {
		return ipAddress;
	}

	/**
	 * 実行元IPアドレスを設定します。
	 * 
	 * @param ipAddress 実行元IPアドレス
	 */
	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}

	/**
	 * 実行元IPアドレスを設定し、自オブジェクトを返します。
	 * 
	 * @param ipAddress 実行元IPアドレス
	 * @return 自オブジェクト
	 */
	public UserActivity withIpAddress(String ipAddress) {
		setIpAddress(ipAddress);
		return this;
	}

	/**
	 * カテゴリ名を取得します。
	 * 
	 * @return カテゴリ名
	 */
	public String getCategoryName() {
		return categoryName;
	}

	/**
	 * カテゴリ名を設定します。
	 * 
	 * @param categoryName カテゴリ名
	 */
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	/**
	 * カテゴリ名を設定し、自オブジェクトを返します。
	 * 
	 * @param categoryName カテゴリ名
	 * @return 自オブジェクト
	 */
	public UserActivity withCategoryName(String categoryName) {
		setCategoryName(categoryName);
		return this;
	}

	/**
	 * 実行者を取得します。
	 * 
	 * @return 実行者
	 */
	public String getOperator() {
		return operator;
	}

	/**
	 * 実行者を設定します。
	 * 
	 * @param operator 実行者
	 */
	public void setOperator(String operator) {
		this.operator = operator;
	}

	/**
	 * 実行者を設定し、自オブジェクトを返します。
	 * 
	 * @param operator 実行者
	 * @return 自オブジェクト
	 */
	public UserActivity withOperator(String operator) {
		setOperator(operator);
		return this;
	}

	/**
	 * 操作内容を取得します。
	 * 
	 * @return 操作内容
	 */
	public String getOperation() {
		return operation;
	}

	/**
	 * 操作内容を設定します。
	 * 
	 * @param operation 操作内容
	 */
	public void setOperation(String operation) {
		this.operation = operation;
	}

	/**
	 * 操作内容を設定し、自オブジェクトを返します。
	 * 
	 * @param operation 操作内容
	 * @return 自オブジェクト
	 */
	public UserActivity withOperation(String operation) {
		setOperation(operation);
		return this;
	}

	/**
	 * 実行結果を取得します。
	 * 
	 * @return 実行結果
	 */
	public Boolean getResult() {
		return result;
	}

	/**
	 * 実行結果を設定します。
	 * 
	 * @param result 実行結果
	 */
	public void setResult(Boolean result) {
		this.result = result;
	}
	
	/**
	 * 実行結果を設定し、自オブジェクトを返します。
	 * 
	 * @param result 実行結果
	 * @return 自オブジェクト
	 */
	public UserActivity withResult(Boolean result) {
		setResult(result);
		return this;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("[dateTime=");
		builder.append(dateTime);
		builder.append(", ipAddress=");
		builder.append(ipAddress);
		builder.append(", categoryName=");
		builder.append(categoryName);
		builder.append(", operator=");
		builder.append(operator);
		builder.append(", operation=");
		builder.append(operation);
		builder.append(", result=");
		builder.append(result);
		builder.append("]");
		return builder.toString();
	}
}
