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
package com.nifty.cloud.sdk.sslcert.model;

import com.nifty.cloud.sdk.Result;
import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * RegisterCorporateInfoForCertificate処理結果クラス。<br />
 * このクラスはRegisterCorporateInfoForCertificateのレスポンスを格納します。
 */
@XStreamAlias("RegisterCorporateInfoForCertificateResponse")
public class RegisterCorporateInfoForCertificateResult extends Result {

	/** リクエスト識別子 */
	@XStreamAlias("requestId")
	private String requestId;

	/** 帝国データバンクコード */
	@XStreamAlias("tdbCode")
	private String tdbCode;

	/** 法人名 */
	@XStreamAlias("corpName")
	private String corpName;

	/** 法人格 */
	@XStreamAlias("corpGrade")
	private String corpGrade;

	/** 法人代表者（最高責任者）姓 */
	@XStreamAlias("presidentName1")
	private String presidentName1;

	/** 法人代表者名 */
	@XStreamAlias("presidentName2")
	private String presidentName2;

	/** 郵便番号（上3桁） */
	@XStreamAlias("zip1")
	private String zip1;

	/** 郵便番号（下4桁） */
	@XStreamAlias("zip2")
	private String zip2;

	/** 都道府県名 */
	@XStreamAlias("pref")
	private String pref;

	/** 市町村名 */
	@XStreamAlias("city")
	private String city;

	/** 申請責任者（漢字）姓 */
	@XStreamAlias("name1")
	private String name1;

	/** 申請責任者（漢字）名 */
	@XStreamAlias("name2")
	private String name2;

	/** 申請責任者（かな）姓 */
	@XStreamAlias("kanaName1")
	private String kanaName1;

	/** 申請責任者（かな）名 */
	@XStreamAlias("kanaName2")
	private String kanaName2;

	/** 申請責任者（アルファベット）姓 */
	@XStreamAlias("alphabetName1")
	private String alphabetName1;

	/** 申請責任者（アルファベット）名 */
	@XStreamAlias("alphabetName2")
	private String alphabetName2;

	/** 役職名 */
	@XStreamAlias("postName")
	private String postName;

	/** 部署名 */
	@XStreamAlias("divisionName")
	private String divisionName;

	/** 電話番号 */
	@XStreamAlias("phoneNumber")
	private String phoneNumber;

	/** 責任者メールアドレス */
	@XStreamAlias("emailAddress")
	private String emailAddress;

	/**
	 * リクエスト識別子を取得します。
	 * 
	 * @return リクエスト識別子
	 */
	public String getRequestId() {
		return requestId;
	}

	/**
	 * リクエスト識別子を設定します。
	 * 
	 * @param requestId リクエスト識別子
	 */
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	/**
	 * リクエスト識別子を設定し、自オブジェクトを返します。
	 * 
	 * @param requestId リクエスト識別子
	 * @return 自オブジェクト
	 */
	public RegisterCorporateInfoForCertificateResult withRequestId(
			String requestId) {
		setRequestId(requestId);
		return this;
	}

	/**
	 * 帝国データバンクコードを取得します。
	 * 
	 * @return 帝国データバンクコード
	 */
	public String getTdbCode() {
		return tdbCode;
	}

	/**
	 * 帝国データバンクコードを設定します。
	 * 
	 * @param tdbCode 帝国データバンクコード
	 */
	public void setTdbCode(String tdbCode) {
		this.tdbCode = tdbCode;
	}

	/**
	 * 帝国データバンクコードを設定し、自オブジェクトを返します。
	 * 
	 * @param tdbCode 帝国データバンクコード
	 * @return 自オブジェクト
	 */
	public RegisterCorporateInfoForCertificateResult withTdbCode(String tdbCode) {
		setTdbCode(tdbCode);
		return this;
	}

	/**
	 * 法人名を取得します。
	 * 
	 * @return 法人名
	 */
	public String getCorpName() {
		return corpName;
	}

	/**
	 * 法人名を設定します。
	 * 
	 * @param corpName 法人名
	 */
	public void setCorpName(String corpName) {
		this.corpName = corpName;
	}

	/**
	 * 法人名を設定し、自オブジェクトを返します。
	 * 
	 * @param corpName 法人名
	 * @return 自オブジェクト
	 */
	public RegisterCorporateInfoForCertificateResult withCorpName(
			String corpName) {
		setCorpName(corpName);
		return this;
	}

	/**
	 * 法人格を取得します。
	 * 
	 * @return 法人格
	 */
	public String getCorpGrade() {
		return corpGrade;
	}

	/**
	 * 法人格を設定します。
	 * 
	 * @param corpGrade 法人格
	 */
	public void setCorpGrade(String corpGrade) {
		this.corpGrade = corpGrade;
	}

	/**
	 * 法人格を設定し、自オブジェクトを返します。
	 * 
	 * @param corpGrade 法人格
	 * @return 自オブジェクト
	 */
	public RegisterCorporateInfoForCertificateResult withCorpGrade(
			String corpGrade) {
		setCorpGrade(corpGrade);
		return this;
	}

	/**
	 * 法人代表者（最高責任者）姓を取得します。
	 * 
	 * @return 法人代表者（最高責任者）姓
	 */
	public String getPresidentName1() {
		return presidentName1;
	}

	/**
	 * 法人代表者（最高責任者）姓を設定します。
	 * 
	 * @param presidentName1 法人代表者（最高責任者）姓
	 */
	public void setPresidentName1(String presidentName1) {
		this.presidentName1 = presidentName1;
	}

	/**
	 * 法人代表者（最高責任者）姓を設定し、自オブジェクトを返します。
	 * 
	 * @param presidentName1 法人代表者（最高責任者）姓
	 * @return 自オブジェクト
	 */
	public RegisterCorporateInfoForCertificateResult withPresidentName1(
			String presidentName1) {
		setPresidentName1(presidentName1);
		return this;
	}

	/**
	 * 法人代表者（最高責任者）名を取得します。
	 * 
	 * @return 法人代表者（最高責任者）名
	 */
	public String getPresidentName2() {
		return presidentName2;
	}

	/**
	 * 法人代表者（最高責任者）名を設定します。
	 * 
	 * @param presidentName2 法人代表者（最高責任者）名
	 */
	public void setPresidentName2(String presidentName2) {
		this.presidentName2 = presidentName2;
	}

	/**
	 * 法人代表者（最高責任者）名を設定し、自オブジェクトを返します。
	 * 
	 * @param presidentName2 法人代表者（最高責任者）名
	 * @return 自オブジェクト
	 */
	public RegisterCorporateInfoForCertificateResult withPresidentName2(
			String presidentName2) {
		setPresidentName2(presidentName2);
		return this;
	}

	/**
	 * 郵便番号（上3桁）を取得します。
	 * 
	 * @return 郵便番号（上3桁）
	 */
	public String getZip1() {
		return zip1;
	}

	/**
	 * 郵便番号（上3桁）を設定します。
	 * 
	 * @param zip1 郵便番号（上3桁）
	 */
	public void setZip1(String zip1) {
		this.zip1 = zip1;
	}

	/**
	 * 郵便番号（上3桁）を設定し、自オブジェクトを返します。
	 * 
	 * @param zip1 郵便番号（上3桁）
	 * @return 自オブジェクト
	 */
	public RegisterCorporateInfoForCertificateResult withZip1(String zip1) {
		setZip1(zip1);
		return this;
	}

	/**
	 * 郵便番号（下4桁）を取得します。
	 * 
	 * @return 郵便番号（下4桁）
	 */
	public String getZip2() {
		return zip2;
	}

	/**
	 * 郵便番号（下4桁）を設定します。
	 * 
	 * @param zip2 郵便番号（下4桁）
	 */
	public void setZip2(String zip2) {
		this.zip2 = zip2;
	}

	/**
	 * 郵便番号（下4桁）を設定し、自オブジェクトを返します。
	 * 
	 * @param zip2 郵便番号（下4桁）
	 * @return 自オブジェクト
	 */
	public RegisterCorporateInfoForCertificateResult withZip2(String zip2) {
		setZip2(zip2);
		return this;
	}

	/**
	 * 都道府県名を取得します。
	 * 
	 * @return 都道府県名
	 */
	public String getPref() {
		return pref;
	}

	/**
	 * 都道府県名を設定します。
	 * 
	 * @param pref 都道府県名
	 */
	public void setPref(String pref) {
		this.pref = pref;
	}

	/**
	 * 都道府県名を設定し、自オブジェクトを返します。
	 * 
	 * @param pref 都道府県名
	 * @return 自オブジェクト
	 */
	public RegisterCorporateInfoForCertificateResult withPref(String pref) {
		setPref(pref);
		return this;
	}

	/**
	 * 市町村名を取得します。
	 * 
	 * @return 市町村名
	 */
	public String getCity() {
		return city;
	}

	/**
	 * 市町村名を設定します。
	 * 
	 * @param city 市町村名
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * 市町村名を設定し、自オブジェクトを返します。
	 * 
	 * @param city 市町村名
	 * @return 自オブジェクト
	 */
	public RegisterCorporateInfoForCertificateResult withCity(String city) {
		setCity(city);
		return this;
	}

	/**
	 * 申請責任者（漢字）姓を取得します。
	 * 
	 * @return 申請責任者（漢字）姓
	 */
	public String getName1() {
		return name1;
	}

	/**
	 * 申請責任者（漢字）姓を設定します。
	 * 
	 * @param name1 申請責任者（漢字）姓
	 */
	public void setName1(String name1) {
		this.name1 = name1;
	}

	/**
	 * 申請責任者（漢字）姓を設定し、自オブジェクトを返します。
	 * 
	 * @param name1 申請責任者（漢字）姓
	 * @return 自オブジェクト
	 */
	public RegisterCorporateInfoForCertificateResult withName1(String name1) {
		setName1(name1);
		return this;
	}

	/**
	 * 申請責任者（漢字）名を取得します。
	 * 
	 * @return 申請責任者（漢字）名
	 */
	public String getName2() {
		return name2;
	}

	/**
	 * 申請責任者（漢字）名を設定します。
	 * 
	 * @param name2 申請責任者（漢字）名
	 */
	public void setName2(String name2) {
		this.name2 = name2;
	}

	/**
	 * 申請責任者（漢字）名を設定し、自オブジェクトを返します。
	 * 
	 * @param name2 申請責任者（漢字）名
	 * @return 自オブジェクト
	 */
	public RegisterCorporateInfoForCertificateResult withName2(String name2) {
		setName2(name2);
		return this;
	}

	/**
	 * 申請責任者（かな）姓を取得します。
	 * 
	 * @return 申請責任者（かな）姓
	 */
	public String getKanaName1() {
		return kanaName1;
	}

	/**
	 * 申請責任者（かな）姓を設定します。
	 * 
	 * @param kanaName1 申請責任者（かな）姓
	 */
	public void setKanaName1(String kanaName1) {
		this.kanaName1 = kanaName1;
	}

	/**
	 * 申請責任者（かな）姓を設定し、自オブジェクトを返します。
	 * 
	 * @param kanaName1 申請責任者（かな）姓
	 * @return 自オブジェクト
	 */
	public RegisterCorporateInfoForCertificateResult withKanaName1(
			String kanaName1) {
		setKanaName1(kanaName1);
		return this;
	}

	/**
	 * 申請責任者（かな）名を取得します。
	 * 
	 * @return 申請責任者（かな）名
	 */
	public String getKanaName2() {
		return kanaName2;
	}

	/**
	 * 申請責任者（かな）名を設定します。
	 * 
	 * @param kanaName2 申請責任者（かな）名
	 */
	public void setKanaName2(String kanaName2) {
		this.kanaName2 = kanaName2;
	}

	/**
	 * 申請責任者（かな）名を設定し、自オブジェクトを返します。
	 * 
	 * @param kanaName2 申請責任者（かな）名
	 * @return 自オブジェクト
	 */
	public RegisterCorporateInfoForCertificateResult withKanaName2(
			String kanaName2) {
		setKanaName2(kanaName2);
		return this;
	}

	/**
	 * 申請責任者（アルファベット）姓を取得します。
	 * 
	 * @return 申請責任者（アルファベット）姓
	 */
	public String getAlphabetName1() {
		return alphabetName1;
	}

	/**
	 * 申請責任者（アルファベット）姓を設定します。
	 * 
	 * @param alphabetName1 申請責任者（アルファベット）姓
	 */
	public void setAlphabetName1(String alphabetName1) {
		this.alphabetName1 = alphabetName1;
	}

	/**
	 * 申請責任者（アルファベット）姓を設定し、自オブジェクトを返します。
	 * 
	 * @param alphabetName1 申請責任者（アルファベット）姓
	 * @return 自オブジェクト
	 */
	public RegisterCorporateInfoForCertificateResult withAlphabetName1(
			String alphabetName1) {
		setAlphabetName1(alphabetName1);
		return this;
	}

	/**
	 * 申請責任者（アルファベット）名を取得します。
	 * 
	 * @return 申請責任者（アルファベット）名
	 */
	public String getAlphabetName2() {
		return alphabetName2;
	}

	/**
	 * 申請責任者（アルファベット）名を設定します。
	 * 
	 * @param alphabetName2 申請責任者（アルファベット）名
	 */
	public void setAlphabetName2(String alphabetName2) {
		this.alphabetName2 = alphabetName2;
	}

	/**
	 * 申請責任者（アルファベット）名を設定し、自オブジェクトを返します。
	 * 
	 * @param alphabetName2 申請責任者（アルファベット）名
	 * @return 自オブジェクト
	 */
	public RegisterCorporateInfoForCertificateResult withAlphabetName2(
			String alphabetName2) {
		setAlphabetName2(alphabetName2);
		return this;
	}

	/**
	 * 役職名を取得します。
	 * 
	 * @return 役職名
	 */
	public String getPostName() {
		return postName;
	}

	/**
	 * 役職名を設定します。
	 * 
	 * @param postName 役職名
	 */
	public void setPostName(String postName) {
		this.postName = postName;
	}

	/**
	 * 役職名を設定し、自オブジェクトを返します。
	 * 
	 * @param postName 役職名
	 * @return 自オブジェクト
	 */
	public RegisterCorporateInfoForCertificateResult withPostName(
			String postName) {
		setPostName(postName);
		return this;
	}

	/**
	 * 部署名を取得します。
	 * 
	 * @return 部署名
	 */
	public String getDivisionName() {
		return divisionName;
	}

	/**
	 * 部署名を設定します。
	 * 
	 * @param divisionName 部署名
	 */
	public void setDivisionName(String divisionName) {
		this.divisionName = divisionName;
	}

	/**
	 * 部署名を設定し、自オブジェクトを返します。
	 * 
	 * @param divisionName 部署名
	 * @return 自オブジェクト
	 */
	public RegisterCorporateInfoForCertificateResult withDivisionName(
			String divisionName) {
		setDivisionName(divisionName);
		return this;
	}

	/**
	 * 電話番号を取得します。
	 * 
	 * @return 電話番号
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}

	/**
	 * 電話番号を設定します。
	 * 
	 * @param phoneNumber 電話番号
	 */
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	/**
	 * 電話番号を設定し、自オブジェクトを返します。
	 * 
	 * @param phoneNumber 電話番号
	 * @return 自オブジェクト
	 */
	public RegisterCorporateInfoForCertificateResult withPhoneNumber(
			String phoneNumber) {
		setPhoneNumber(phoneNumber);
		return this;
	}

	/**
	 * 責任者メールアドレスを取得します。
	 * 
	 * @return 責任者メールアドレス
	 */
	public String getEmailAddress() {
		return emailAddress;
	}

	/**
	 * 責任者メールアドレスを設定します。
	 * 
	 * @param emailAddress 責任者メールアドレス
	 */
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	/**
	 * 責任者メールアドレスを設定し、自オブジェクトを返します。
	 * 
	 * @param emailAddress 責任者メールアドレス
	 * @return 自オブジェクト
	 */
	public RegisterCorporateInfoForCertificateResult withEmailAddress(
			String emailAddress) {
		setEmailAddress(emailAddress);
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
		builder.append("[requestId=");
		builder.append(requestId);
		builder.append(", tdbCode=");
		builder.append(tdbCode);
		builder.append(", corpName=");
		builder.append(corpName);
		builder.append(", corpGrade=");
		builder.append(corpGrade);
		builder.append(", presidentName1=");
		builder.append(presidentName1);
		builder.append(", presidentName2=");
		builder.append(presidentName2);
		builder.append(", zip1=");
		builder.append(zip1);
		builder.append(", zip2=");
		builder.append(zip2);
		builder.append(", pref=");
		builder.append(pref);
		builder.append(", city=");
		builder.append(city);
		builder.append(", name1=");
		builder.append(name1);
		builder.append(", name2=");
		builder.append(name2);
		builder.append(", kanaName1=");
		builder.append(kanaName1);
		builder.append(", kanaName2");
		builder.append(kanaName2);
		builder.append(", alphabetName1=");
		builder.append(alphabetName1);
		builder.append(", alphabetName2=");
		builder.append(alphabetName2);
		builder.append(", postName=");
		builder.append(postName);
		builder.append(", divisionName=");
		builder.append(divisionName);
		builder.append(", phoneNumber=");
		builder.append(phoneNumber);
		builder.append(", emailAddress=");
		builder.append(emailAddress);
		builder.append("]");
		return builder.toString();
	}
}
