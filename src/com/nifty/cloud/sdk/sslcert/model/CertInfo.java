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

import com.nifty.cloud.sdk.annotation.Query;

/**
 * SSL証明書の発行申請情報クラス。<br />
 * このクラスはSSL証明書の発行申請情報を格納します。
 */
public class CertInfo {

    /** 申請組織（企業）名　（organizationName） */
    private String organizationName;

    /** 申請部署名　（organizationUnit） */
    private String organizationUnitName;

    /** 事業所住所の国名　（countryName） */
    private String  countryName;

    /** 事業所住所の都道府県名　（state） */
    private String  stateName;

    /** 事業所住所の市区町村名　（locality） */
    private String  locationName;

    /** 連絡先emailアドレス */
    private String  emailAddress;

    /**
     * 申請組織（企業）名　（organizationName）を取得します。
     *
     * @return 申請組織（企業）名　（organizationName）
     */
    @Query(name="OrganizationName")
    public String getOrganizationName() {
        return organizationName;
    }

    /**
     * 申請組織（企業）名　（organizationName）を設定します。
     *
     * @param organizationName 申請組織（企業）名　（organizationName）
     */
    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    /**
     * 申請組織（企業）名　（organizationName）を設定し、自オブジェクトを返します。
     *
     * @param organizationName 申請組織（企業）名　（organizationName）
     * @return 自オブジェクト
     */
    public CertInfo withOrganizationName(String organizationName) {
        setOrganizationName(organizationName);
        return this;
    }

    /**
     * 申請部署名　（organizationUnit）を取得します。
     *
     * @return 申請部署名　（organizationUnit）
     */
    @Query(name="OrganizationUnitName")
    public String getOrganizationUnitName() {
        return organizationUnitName;
    }

    /**
     * 申請部署名　（organizationUnit）を設定します。
     *
     * @param organizationUnitName 申請部署名　（organizationUnit）
     */
    public void setOrganizationUnitName(String organizationUnitName) {
        this.organizationUnitName = organizationUnitName;
    }

    /**
     * 申請部署名　（organizationUnit）を設定し、自オブジェクトを返します。
     *
     * @param organizationUnitName 申請部署名　（organizationUnit）
     * @return 自オブジェクト
     */
    public CertInfo withOrganizationUnitName(String organizationUnitName){
        setOrganizationUnitName(organizationUnitName);
        return this;
    }

    /**
     * 事業所住所の国名　（countryName）を取得します。
     *
     * @return 事業所住所の国名　（countryName）
     */
    @Query(name="CountryName")
    public String getCountryName() {
        return countryName;
    }

    /**
     * 事業所住所の国名　（countryName）を設定します。
     *
     * @param countryName 事業所住所の国名　（countryName）
     */
    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    /**
     * 事業所住所の国名　（countryName）を設定し、自オブジェクトを返します。
     *
     * @param countryName 事業所住所の国名　（countryName）
     * @return 自オブジェクト
     */
    public CertInfo withCountryName(String countryName) {
        setCountryName(countryName);
        return this;
    }

    /**
     * 事業所住所の都道府県名　（state）を取得します。
     *
     * @return 事業所住所の都道府県名　（state）
     */
    @Query(name="StateName")
    public String getStateName() {
        return stateName;
    }

    /**
     * 事業所住所の都道府県名　（state）を設定します。
     *
     * @param stateName 事業所住所の都道府県名　（state）
     */
    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    /**
     * 事業所住所の都道府県名　（state）を設定し、自オブジェクトを返します。
     *
     * @param stateName 事業所住所の都道府県名　（state）
     * @return 自オブジェクト
     */
    public CertInfo withStateName(String stateName) {
        setStateName(stateName);
        return this;
    }

    /**
     * 事業所住所の市区町村名　（locality）を取得します。
     *
     * @return 事業所住所の市区町村名　（locality）
     */
    @Query(name="LocationName")
    public String getLocationName() {
        return locationName;
    }

    /**
     * 事業所住所の市区町村名　（locality）を設定します。
     *
     * @param locationName 事業所住所の市区町村名　（locality）
     */
    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    /**
     * 事業所住所の市区町村名　（locality）を設定し、自オブジェクトを返します。
     *
     * @param locationName 事業所住所の市区町村名　（locality）
     * @return 自オブジェクト
     */
    public CertInfo withLocationName(String locationName){
        setLocationName(locationName);
        return this;
    }

    /**
     * 連絡先emailアドレスを取得します。
     *
     * @return 連絡先emailアドレス
     */
    @Query(name="EmailAddress")
    public String getEmailAddress() {
        return emailAddress;
    }

    /**
     * 連絡先emailアドレスを設定します。
     *
     * @param emailAddress 連絡先emailアドレス
     */
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    /**
     * 連絡先emailアドレスを設定し、自オブジェクトを返します。
     *
     * @param emailAddress 連絡先emailアドレス
     * @return 自オブジェクト
     */
    public CertInfo withEmailAddress(String emailAddress) {
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
        builder.append("[organizationName=");
        builder.append(organizationName);
        builder.append(", organizationUnitName = ");
        builder.append(organizationUnitName);
        builder.append(", countryName = ");
        builder.append(countryName);
        builder.append(", stateName = ");
        builder.append(stateName);
        builder.append(", locationName = ");
        builder.append(locationName);
        builder.append(", emailAddress = ");
        builder.append(emailAddress);
        builder.append("]");
        return builder.toString();
    }
}
