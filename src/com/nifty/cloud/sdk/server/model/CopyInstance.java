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
 *  API Version: 1.11
 *  Date: 2012-02-20 10:57:31
 *
 */
package com.nifty.cloud.sdk.server.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.nifty.cloud.sdk.annotation.Query;

/**
 * コピー後サーバー情報クラス。<br />
 * このクラスはコピー後のサーバー情報を格納します。
 *
 */
public class CopyInstance {

    /** サーバー名 */
    private String	instanceName;

    /** サーバータイプ */
    private String	instanceType;

    /** 利用料金タイプ */
    private String	accountingType;

    /** IPアドレスタイプ */
    private String	ipType;
 
    /** リージョン・ゾーン情報 **/
    private GlobalPlacement placement;

    /** 適用ロードバランサーリスト */
    private List<LoadBalancer>	loadBalancers;

    /** ファイアウォールグループ名リスト */
    private List<String> groupIds;


    /**
     * サーバー名を取得します。
     *
     * @return サーバー名
     */
    @Query(name="InstanceName", require=true)
    public String getInstanceName() {
        return instanceName;
    }
    /**
     * サーバー名を設定します。
     *
     * @param instanceName サーバー名
     */
    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName;
    }
    /**
     * サーバー名を設定し、自オブジェクトを返します。
     *
     * @param instanceName サーバー名
     * @return 自オブジェクト
     */
    public CopyInstance withInstanceName(String instanceName) {
        setInstanceName(instanceName);
        return this;
    }


    /**
     * サーバータイプを取得します。
     *
     * @return サーバータイプ
     */
    @Query(name="InstanceType")
    public String getInstanceType() {
        return instanceType;
    }
    /**
     * サーバータイプを設定します。
     *
     * @param instanceType サーバータイプ
     */
    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }
    /**
     * サーバータイプを設定し、自オブジェクトを返します。
     *
     * @param instanceType サーバータイプ
     * @return 自オブジェクト
     */
    public CopyInstance withInstanceType(String instanceType) {
        setInstanceType(instanceType);
        return this;
    }


    /**
     * 利用料金タイプを取得します。
     *
     * @return 利用料金タイプ
     */
    @Query(name="AccountingType")
    public String getAccountingType() {
        return accountingType;
    }
    /**
     * 利用料金タイプを設定します。
     *
     * @param accountingType 利用料金タイプ
     */
    public void setAccountingType(String accountingType) {
        this.accountingType = accountingType;
    }
    /**
     * 利用料金タイプを設定し、自オブジェクトを返します。
     *
     * @param accountingType 利用料金タイプ
     * @return 自オブジェクト
     */
    public CopyInstance withAccountingType(String accountingType) {
        setAccountingType(accountingType);
        return this;
    }

    /**
     * IPアドレスタイプを取得します。
     *
     * @return IPアドレスタイプ
     */
    @Query(name="IpType")
    public String getIpType() {
        return ipType;
    }
    /**
     * IPアドレスタイプを設定します。
     *
     * @param ipType IPアドレスタイプ
     */
    public void setIpType(String ipType) {
        this.ipType = ipType;
    }
    /**
     * IPアドレスタイプを設定し、自オブジェクトを返します。
     *
     * @param ipType IPアドレスタイプ
     * @return 自オブジェクト
     */
    public CopyInstance withIpType(String ipType) {
        setIpType(ipType);
        return this;
    }
    /**
     * リージョン・ゾーン情報を取得します。
     * @return リージョン・ゾーン情報
     */
    @Query(name="Placement")
    public GlobalPlacement getPlacement() {
		return placement;
	}
    /**
     * リージョン・ゾーン情報を設定します。
     * @param placement リージョン・ゾーン情報
     */
	public void setPlacement(GlobalPlacement placement) {
		this.placement = placement;
	}
	/**
	 * リージョン・ゾーン情報を設定し、自オブジェクトを返します。
	 * @param placement リージョン・ゾーン情報
	 * @return 自オブジェクト
	 */
	public CopyInstance withPlacement(GlobalPlacement placement){
		setPlacement(placement);
		return this;
	}
	/**
     * 適用ロードバランサーリストを取得します。
     *
     * @return 適用ロードバランサーリスト
     */
    @Query(name="LoadBalancers")
    public List<LoadBalancer> getLoadBalancers() {
        return loadBalancers;
    }
    /**
     * 適用ロードバランサーリストを設定します。
     *
     * @param loadBalancers 適用ロードバランサーリスト
     */
    public void setLoadBalancers(List<LoadBalancer> loadBalancers) {
        this.loadBalancers = loadBalancers;
    }
    /**
     * 適用ロードバランサーの配列を設定し、自オブジェクトを返します。
     *
     * @param loadBalancers 適用ロードバランサーの配列
     * @return 自オブジェクト
     */
    public CopyInstance withLoadBalancers(LoadBalancer ... loadBalancers) {
        if(this.loadBalancers == null) this.loadBalancers = new ArrayList<LoadBalancer>();
        for(LoadBalancer loadBalancer : loadBalancers) {
            getLoadBalancers().add(loadBalancer);
        }
        return this;
    }
    /**
     * 適用ロードバランサーリストを設定し、自オブジェクトを返します。
     *
     * @param loadBalancers 適用ロードバランサーリスト
     * @return 自オブジェクト
     */
    public CopyInstance withLoadBalancers(Collection<LoadBalancer> loadBalancers) {
        if(this.loadBalancers == null) this.loadBalancers = new ArrayList<LoadBalancer>();
        if (loadBalancers!=null) {
            getLoadBalancers().addAll(loadBalancers);
        }
        return this;
    }

    /**
     * ファイアウォールグループ名リストを取得します。
     *
     * @return ファイアウォールグループ名リスト
     */
    @Query(name="SecurityGroup")
    public List<String> getGroupIds() {
        return groupIds;
    }
    /**
     * ファイアウォールグループ名リストを設定します。
     *
     * @param groupIds ファイアウォールグループ名リスト
     */
    public void setGroupIds(List<String> groupIds) {
        this.groupIds = groupIds;
    }
    /**
     * ファイアウォールグループ名リストを設定し、自オブジェクトを返します。
     *
     * @param groupIds ファイアウォールグループ名リスト
     * @return 自オブジェクト
     */
    public CopyInstance withGroupIds(String ... groupIds) {
        if(this.groupIds == null) this.groupIds = new ArrayList<String>();
        for(String groupId : groupIds) {
            getGroupIds().add(groupId);
        }
        return this;
    }
    /**
     * ファイアウォールグループ名リストを設定し、自オブジェクトを返します。
     *
     * @param groupIds ファイアウォールグループ名リスト
     * @return 自オブジェクト
     */
    public CopyInstance withGroupIds(Collection<String> groupIds) {
        if(this.groupIds == null) this.groupIds = new ArrayList<String>();
        if (groupIds!=null) {
            getGroupIds().addAll(groupIds);
        }
        return this;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("[instanceName=");
        builder.append(instanceName);
        builder.append(", instanceType=");
        builder.append(instanceType);
        builder.append(", accountingType=");
        builder.append(accountingType);
        builder.append(", ipType=");
        builder.append(ipType);
        builder.append(", placement=");
        builder.append(placement);
        builder.append(", loadBalancers=");
        builder.append(loadBalancers);
        builder.append(", securityGroup=");
        builder.append(groupIds);
        builder.append("]");
        return builder.toString();
    }

}
