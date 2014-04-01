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
 *  API Version: 1.17
 *  Date: 2014-02-20 17:00:00
 *
 */
package com.nifty.cloud.sdk.sslcert.model;

import com.nifty.cloud.sdk.Request;
import com.nifty.cloud.sdk.annotation.Action;
import com.nifty.cloud.sdk.annotation.Query;

/**
 * RegisterCorporateInfoForCertificateリクエストクラス。<br />
 * このクラスはRegisterCorporateInfoForCertificateへのリクエストを構築します。
 */
@Action("RegisterCorporateInfoForCertificate")
public class RegisterCorporateInfoForCertificateRequest implements Request {

	/** 利用規約に同意 */
	private Boolean agreement;

	/** 帝国データバンクコード */
	private String tdbCode;

	/** 法人名 */
	private String corpName;

	/** 法人格 */
	private String corpGrade;

	/** 法人代表者（最高責任者）姓 */
	private String presidentName1;

	/** 法人代表者（最高責任者）名 */
	private String presidentName2;

	/** 郵便番号（上3桁） */
	private String zip1;

	/** 郵便番号（下4桁） */
	private String zip2;

	/** 都道府県名 */
	private String pref;

	/** 市町村名 */
	private String city;

	/** 申請責任者（漢字）姓 */
	private String name1;

	/** 申請責任者（漢字）名 */
	private String name2;

	/** 申請責任者（かな）姓 */
	private String kanaName1;

	/** 申請責任者（かな）名 */
	private String kanaName2;

	/** 申請責任者（アルファベット）姓 */
	private String alphabetName1;

	/** 申請責任者（アルファベット）名 */
	private String alphabetName2;

	/** 役職名 */
	private String postName;

	/** 部署名 */
	private String divisionName;

	/** 電話番号 */
	private String phoneNumber;

	/** 責任者メールアドレス */
	private String emailAddress;

	/**
	 * デフォルトコンストラクタ。
	 */
	public RegisterCorporateInfoForCertificateRequest(){
	}
	/**
	 * 申請法人情報を指定し、RegisterCorporateInfoForCertificateRequestを構築します。
	 * @param agreement 利用規約に同意
	 * @param tdbCode 帝国データバンクコード
	 * @param corpName 法人名
	 * @param corpGrade 法人格
	 * @param presidentName1 法人代表者（最高責任者）姓
	 * @param presidentName2 法人代表者（最高責任者）名
	 * @param zip1 郵便番号（上3桁） 
	 * @param zip2 郵便番号（下4桁）
	 * @param pref 都道府県名
	 * @param city 市町村名
	 * @param name1 申請責任者（漢字）姓 
	 * @param name2 申請責任者（漢字）名
	 * @param kanaName1 申請責任者（かな）姓
	 * @param kanaName2 申請責任者（かな）名
	 * @param alphabetName1 申請責任者（アルファベット）姓
	 * @param alphabetName2 申請責任者（アルファベット）名 
	 * @param postName 役職名
	 * @param divisionName 部署名
	 * @param phoneNumber 電話番号
	 * @param emailAddress 責任者メールアドレス
	 */
	public RegisterCorporateInfoForCertificateRequest(
			Boolean agreement,
			String tdbCode,
			String corpName,
			String corpGrade,
			String presidentName1,
			String presidentName2,
			String zip1,
			String zip2,
			String pref,
			String city,
			String name1,
			String name2,
			String kanaName1,
			String kanaName2,
			String alphabetName1,
			String alphabetName2,
			String postName,
			String divisionName,
			String phoneNumber,
			String emailAddress){
		this.agreement = agreement;
		this.tdbCode = tdbCode;
		this.corpName = corpName;
		this.corpGrade = corpGrade;
		this.presidentName1 = presidentName1;
		this.presidentName2 = presidentName2;
		this.zip1 = zip1;
		this.zip2 = zip2;
		this.pref = pref;
		this.city = city;
		this.name1 = name1;
		this.name2 = name2;
		this.kanaName1 = kanaName1;
		this.kanaName2 = kanaName2;
		this.alphabetName1 = alphabetName1;
		this.alphabetName2 = alphabetName2;
		this.postName = postName;
		this.divisionName = divisionName;
		this.phoneNumber = phoneNumber;
		this.emailAddress = emailAddress;
	}
	/**
	 * 利用規約に同意を取得します。
	 * 
	 * @return 利用規約に同意
	 */
	@Query(name = "Agreement", require = true)
	public Boolean getAgreement() {
		return agreement;
	}

	/**
	 * 利用規約に同意を設定します。
	 * 
	 * @param agreement 利用規約に同意
	 */
	public void setAgreement(Boolean agreement) {
		this.agreement = agreement;
	}

	/**
	 * 利用規約に同意を設定し、自オブジェクトを返します。
	 * 
	 * @param agreement 利用規約に同意
	 * @return 自オブジェクト
	 */
	public RegisterCorporateInfoForCertificateRequest withAgreement(
			Boolean agreement) {
		setAgreement(agreement);
		return this;
	}

	/**
	 * 帝国データバンクコードを取得します。
	 * 
	 * @return 帝国データバンクコード
	 */
	@Query(name = "TdbCode")
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
	public RegisterCorporateInfoForCertificateRequest withTdbCode(String tdbCode) {
		setTdbCode(tdbCode);
		return this;
	}

	/**
	 * 法人名を取得します。
	 * 
	 * @return 法人名
	 */
	@Query(name = "CorpName", require = true)
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
	public RegisterCorporateInfoForCertificateRequest withCorpName(
			String corpName) {
		setCorpName(corpName);
		return this;
	}

	/**
	 * 法人格を取得します。
	 * 
	 * @return 法人格
	 */
	@Query(name = "CorpGrade", require = true)
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
	public RegisterCorporateInfoForCertificateRequest withCorpGrade(
			String corpGrade) {
		setCorpGrade(corpGrade);
		return this;
	}

	/**
	 * 法人代表者（最高責任者）姓を取得します。
	 * 
	 * @return 法人代表者（最高責任者）姓
	 */
	@Query(name = "PresidentName1", require = true)
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
	public RegisterCorporateInfoForCertificateRequest withPresidentName1(
			String presidentName1) {
		setPresidentName1(presidentName1);
		return this;
	}

	/**
	 * 法人代表者（最高責任者）名を取得します。
	 * 
	 * @return 法人代表者（最高責任者）名
	 */
	@Query(name = "PresidentName2", require = true)
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
	 * @param PresidentName2 法人代表者（最高責任者）名
	 * @return 自オブジェクト
	 */
	public RegisterCorporateInfoForCertificateRequest withPresidentName2(
			String PresidentName2) {
		setPresidentName2(PresidentName2);
		return this;
	}

	/**
	 * 郵便番号（上3桁）を取得します。
	 * 
	 * @return 郵便番号（上3桁）
	 */
	@Query(name = "Zip1", require = true)
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
	public RegisterCorporateInfoForCertificateRequest withZip1(String zip1) {
		setZip1(zip1);
		return this;
	}

	/**
	 * 郵便番号（下4桁）を取得します。
	 * 
	 * @return 郵便番号（下4桁）
	 */
	@Query(name = "Zip2", require = true)
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
	public RegisterCorporateInfoForCertificateRequest withZip2(String zip2) {
		setZip2(zip2);
		return this;
	}

	/**
	 * 都道府県名を取得します。
	 * 
	 * @return 都道府県名
	 */
	@Query(name = "Pref", require = true)
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
	public RegisterCorporateInfoForCertificateRequest withPref(String pref) {
		setPref(pref);
		return this;
	}

	/**
	 * 市町村名を取得します。
	 * 
	 * @return 市町村名
	 */
	@Query(name = "City", require = true)
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
	public RegisterCorporateInfoForCertificateRequest withCity(String city) {
		setCity(city);
		return this;
	}

	/**
	 * 申請責任者（漢字）姓を取得します。
	 * 
	 * @return 申請責任者（漢字）姓
	 */
	@Query(name = "Name1", require = true)
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
	public RegisterCorporateInfoForCertificateRequest withName1(String name1) {
		setName1(name1);
		return this;
	}

	/**
	 * 申請責任者（漢字）名を取得します。
	 * 
	 * @return 申請責任者（漢字）名
	 */
	@Query(name = "Name2", require = true)
	public String getName2() {
		return name2;
	}

	/**
	 * 申請責任者（漢字）名を設定します。
	 * 
	 * @param name2 申請責任者（漢字）
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
	public RegisterCorporateInfoForCertificateRequest withName2(String name2) {
		setName2(name2);
		return this;
	}

	/**
	 * 申請責任者（かな）姓を取得します。
	 * 
	 * @return kanaName1 申請責任者（かな）姓
	 */
	@Query(name = "KanaName1", require = true)
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
	public RegisterCorporateInfoForCertificateRequest withKanaName1(
			String kanaName1) {
		setKanaName1(kanaName1);
		return this;
	}

	/**
	 * 申請責任者（かな）名を取得します。
	 * 
	 * @return 申請責任者（かな）名
	 */
	@Query(name = "KanaName2", require = true)
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
	public RegisterCorporateInfoForCertificateRequest withKanaName2(
			String kanaName2) {
		setKanaName2(kanaName2);
		return this;
	}

	/**
	 * 申請責任者（アルファベット）姓を取得します。
	 * 
	 * @return 申請責任者（アルファベット）姓
	 */
	@Query(name = "AlphabetName1", require = true)
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
	public RegisterCorporateInfoForCertificateRequest withAlphabetName1(
			String alphabetName1) {
		setAlphabetName1(alphabetName1);
		return this;
	}

	/**
	 * 申請責任者（アルファベット）名を取得します。
	 * 
	 * @return 申請責任者（アルファベット）名
	 */
	@Query(name = "AlphabetName2", require = true)
	public String getAlphabetName2() {
		return alphabetName2;
	}

	/**
	 * 申請責任者（アルファベット）名を設定します。
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
	public RegisterCorporateInfoForCertificateRequest withAlphabetName2(
			String alphabetName2) {
		setAlphabetName2(alphabetName2);
		return this;
	}

	/**
	 * 役職名を取得します。
	 * 
	 * @return 役職名
	 */
	@Query(name = "PostName", require = true)
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
	 * @param postNmae 役職名
	 * @return 自オブジェクト
	 */
	public RegisterCorporateInfoForCertificateRequest withPostName(
			String postNmae) {
		setPostName(postNmae);
		return this;
	}

	/**
	 * 部署名を取得します。
	 * 
	 * @return 部署名
	 */
	@Query(name = "DivisionName", require = true)
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
	public RegisterCorporateInfoForCertificateRequest withDivisionName(
			String divisionName) {
		setDivisionName(divisionName);
		return this;
	}

	/**
	 * 電話番号を取得します。
	 * 
	 * @return 電話番号
	 */
	@Query(name = "PhoneNumber", require = true)
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
	public RegisterCorporateInfoForCertificateRequest withPhoneNumber(
			String phoneNumber) {
		setPhoneNumber(phoneNumber);
		return this;
	}

	/**
	 * 責任者メールアドレスを取得します。
	 * 
	 * @return 責任者メールアドレス
	 */
	@Query(name = "EmailAddress", require = true)
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
	public RegisterCorporateInfoForCertificateRequest withEmailAddress(
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
		builder.append("[agreement=");
		builder.append(agreement);
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
		builder.append(", kanaName2=");
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
