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
package com.nifty.cloud.sdk.firewall.model;

import com.nifty.cloud.sdk.annotation.Query;

/**
 * 有償サービス申し込み情報クラス。<br />
 * このクラスは有償サービス申し込み情報を格納します。
 */
public class SecurityGroupCourseUpdate {

	/** 有償・無償の指定 */
	private String course;

	/** 注意事項に同意 */
	private Boolean agreement;

	/**
	 * 有償・無償の指定を取得します。
	 * 
	 * @return 有償・無償の指定
	 */
	@Query(name = "CourseUpdate")
	public String getCourse() {
		return course;
	}

	/**
	 * 有償・無償の指定を設定します。
	 * 
	 * @param course 有償・無償の指定
	 */
	public void setCourse(String course) {
		this.course = course;
	}

	/**
	 * 有償・無償の指定
	 * 
	 * @param course 有償・無償の指定
	 * @return 自オブジェクト
	 */
	public SecurityGroupCourseUpdate withCourse(String course) {
		setCourse(course);
		return this;
	}

	/**
	 * 注意事項に同意を取得します。
	 * 
	 * @return 注意事項に同意
	 */
	@Query(name = "CourseUpdate.Agreement")
	public Boolean getAgreement() {
		return agreement;
	}

	/**
	 * 注意事項に同意を設定します。
	 * 
	 * @param agreement 注意事項に同意
	 */
	public void setAgreement(Boolean agreement) {
		this.agreement = agreement;
	}

	public SecurityGroupCourseUpdate withAgreement(Boolean agreement) {
		setAgreement(agreement);
		return this;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("[course=");
		builder.append(course);
		builder.append(", agreement=");
		builder.append(agreement);
		builder.append("]");
		return builder.toString();
	}
}
