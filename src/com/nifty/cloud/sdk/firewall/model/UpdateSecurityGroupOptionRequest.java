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

import com.nifty.cloud.sdk.Request;
import com.nifty.cloud.sdk.annotation.Action;
import com.nifty.cloud.sdk.annotation.Query;

/**
 * UpdateSecurityGroupOptionリクエストクラス。<br />
 * このクラスはUpdateSecurityGroupOptionへのリクエストを構築します。
 */
@Action("UpdateSecurityGroupOption")
public class UpdateSecurityGroupOptionRequest implements Request {

	/** 有償サービス申し込み情報 */
	private SecurityGroupCourseUpdate courseUpdate;

	/** ファイアウォールグループ数上限の変更 */
	private Integer securityGroupLimitUpdate;

	/**
	 * 有償サービス申し込み情報を取得します。
	 * 
	 * @return 有償サービス申し込み情報
	 */
	@Query(name = "")
	public SecurityGroupCourseUpdate getCourseUpdate() {
		return courseUpdate;
	}

	/**
	 * 有償サービス申し込み情報を設定します。
	 * 
	 * @param courseUpdate 有償サービス申し込み情報
	 */
	public void setCourseUpdate(SecurityGroupCourseUpdate courseUpdate) {
		this.courseUpdate = courseUpdate;
	}

	/**
	 * 有償サービス申し込み情報を設定し、自オブジェクトを返します。
	 * 
	 * @param courseUpdate 有償サービス申し込み情報
	 * @return 自オブジェクト
	 */
	public UpdateSecurityGroupOptionRequest withCourseUpdate(SecurityGroupCourseUpdate courseUpdate) {
		setCourseUpdate(courseUpdate);
		return this;
	}

	/**
	 * ファイアウォールグループ数上限の変更を取得します。
	 * 
	 * @return ファイアウォールグループ数上限の変更
	 */
	@Query(name = "SecurityGroupLimitUpdate")
	public Integer getSecurityGroupLimitUpdate() {
		return securityGroupLimitUpdate;
	}

	/**
	 * ファイアウォールグループ数上限の変更を設定します。
	 * 
	 * @param securityGroupLimitUpdate ファイアウォールグループ数上限の変更
	 */
	public void setSecurityGroupLimitUpdate(Integer securityGroupLimitUpdate) {
		this.securityGroupLimitUpdate = securityGroupLimitUpdate;
	}

	/**
	 * ファイアウォールグループ数上限の変更を設定し、自オブジェクトを返します。
	 * 
	 * @param securityGroupLimitUpdate ファイアウォールグループ数上限の変更
	 * @return 自オブジェクト
	 */
	public UpdateSecurityGroupOptionRequest withSecurityGroupLimitUpdate(Integer securityGroupLimitUpdate) {
		setSecurityGroupLimitUpdate(securityGroupLimitUpdate);
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
		builder.append("[courseUpdate=");
		builder.append(courseUpdate);
		builder.append(", securityGroupLimitUpdate=");
		builder.append(securityGroupLimitUpdate);
		builder.append("]");
		return builder.toString();
	}
}
