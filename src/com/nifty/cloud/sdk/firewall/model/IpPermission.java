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
package com.nifty.cloud.sdk.firewall.model;

import java.util.ArrayList;
import java.util.List;

import com.nifty.cloud.sdk.annotation.Query;

/**
 * 許可ルール情報クラス。<br />
 * このクラスは許可ルール情報を格納します。
 *
 */
public class IpPermission {

	/** 許可プロトコル名 */
	private String ipProtocol;

	/** 許可ポート */
	private Integer fromPort;

	private Integer toPort;

	/** Incoming/Outgoing指定 */
	private String inOut;

	/** 許可するファイアウォールグループリスト */
	private List<UserIdGroupPair> groups;

	/** 許可するIPアドレスリスト */
	private List<IpRange> ipRanges;

	/**
	 * 許可プロトコル名を取得します。
	 *
	 * @return ipProtocol
	 */
	@Query(name = "IpProtocol")
	public String getIpProtocol() {
		return ipProtocol;
	}

	/**
	 * 許可プロトコル名を設定します。
	 *
	 * @param ipProtocol 許可プロトコル名
	 */
	public void setIpProtocol(String ipProtocol) {
		this.ipProtocol = ipProtocol;
	}

	/**
	 *
	 * 許可プロトコル名を設定し、自オブジェクトを返します。
	 *
	 * @param ipProtocol 許可プロトコル名
	 * @return 自オブジェクト
	 */
	public IpPermission withIpProtocol(String ipProtocol) {
		this.ipProtocol = ipProtocol;
		return this;
	}

	/**
	 * 許可ポートを取得します。
	 *
	 * @return 許可ポート
	 */
	@Query(name = "FromPort")
	public Integer getFromPort() {
		return fromPort;
	}

	/**
	 * 許可ポートを設定します。
	 *
	 * @param fromPort 許可ポート
	 */
	public void setFromPort(Integer fromPort) {
		this.fromPort = fromPort;
	}

	/**
	 * 許可ポートを設定し、自オブジェクトを返します。
	 *
	 * @param fromPort 許可ポート
	 * @return 自オブジェクト
	 */
	public IpPermission withFromPort(Integer fromPort) {
		setFromPort(fromPort);
		return this;
	}

	/**
	 * toPortを取得します。
	 * @return toPort
	 */
	@Query(name = "ToPort")
	public Integer getToPort() {
		return toPort;
	}

	/**
	 * toPortを設定します。
	 * @param toPort
	 */
	public void setToPort(Integer toPort) {
		this.toPort = toPort;
	}

	/**
	 * toPortを設定し、自オブジェクトを返します。
	 * @param toPort
	 * @return 自オブジェクト
	 */
	public IpPermission withToPort(Integer toPort) {
		setToPort(toPort);
		return this;
	}

	/**
	 * Incoming/Outgoing指定を取得します。
	 *
	 * @return Incoming/Outgoing指定
	 */
	@Query(name = "InOut")
	public String getInOut() {
		return inOut;
	}

	/**
	 * Incoming/Outgoing指定を設定します。
	 *
	 * @param inOut Incoming/Outgoing指定
	 */
	public void setInOut(String inOut) {
		this.inOut = inOut;
	}

	/**
	 * Incoming/Outgoing指定を設定し、自オブジェクトを返します。
	 *
	 * @param inOut Incoming/Outgoing指定
	 * @return 自オブジェクト
	 */
	public IpPermission withInOut(String inOut) {
		setInOut(inOut);
		return this;
	}

	/**
	 * 許可するファイアウォールグループリストを取得します。
	 *
	 * @return 許可するファイアウォールグループリスト
	 */
	@Query(name = "Groups")
	public List<UserIdGroupPair> getGroups() {
		return groups;
	}

	/**
	 * 許可するファイアウォールグループリストを設定します。
	 *
	 * @param groups 許可するファイアウォールグループリスト
	 */
	public void setGroups(List<UserIdGroupPair> groups) {
		this.groups = groups;
	}

	/**
	 * 許可するファイアウォールグループの配列を設定し、自オブジェクトを返します。
	 *
	 * @param groups 許可するファイアウォールグループの配列
	 * @return 自オブジェクト
	 */
	public IpPermission withGroups(UserIdGroupPair... groups) {
		if (this.groups == null)
			this.groups = new ArrayList<UserIdGroupPair>();
		for (UserIdGroupPair group : groups) {
			getGroups().add(group);
		}
		return this;
	}

	/**
	 * 許可するファイアウォールグループリストを設定し、自オブジェクトを返します。
	 *
	 * @param groups 許可するファイアウォールグループリスト
	 * @return 自オブジェクト
	 */
	public IpPermission withGroups(List<UserIdGroupPair> groups) {
		if (this.groups == null)
			this.groups = new ArrayList<UserIdGroupPair>();
		if (groups != null) {
			getGroups().addAll(groups);
		}
		return this;
	}

	/**
	 * 許可IPするアドレスリストを取得します。
	 *
	 * @return 許可IPするアドレスリスト
	 */
	@Query(name = "IpRanges")
	public List<IpRange> getIpRanges() {
		return ipRanges;
	}

	/**
	 * 許可IPするアドレスリストを設定します。
	 *
	 * @param ipRanges 許可するIPアドレスリスト
	 */
	public void setIpRanges(List<IpRange> ipRanges) {
		this.ipRanges = ipRanges;
	}

	/**
	 * 許可IPするアドレスの配列を設定し、自オブジェクトを返します。
	 *
	 * @param ipRanges 許可IPするアドレスの配列
	 * @return 自オブジェクト
	 */
	public IpPermission withIpRanges(IpRange... ipRanges) {
		if (this.ipRanges == null)
			this.ipRanges = new ArrayList<IpRange>();
		for (IpRange ipRange : ipRanges) {
			getIpRanges().add(ipRange);
		}
		return this;
	}

	/**
	 * 許可IPするアドレスリストを設定し、自オブジェクトを返します。
	 *
	 * @param ipRanges 許可IPするアドレスリスト
	 * @return 自オブジェクト
	 */
	public IpPermission withIpRanges(List<IpRange> ipRanges) {
		if (this.ipRanges == null)
			this.ipRanges = new ArrayList<IpRange>();
		if (ipRanges != null) {
			getIpRanges().addAll(ipRanges);
		}
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
		builder.append("[ipProtocol=");
		builder.append(ipProtocol);
		builder.append(", fromPort=");
		builder.append(fromPort);
		builder.append(", toPort=");
		builder.append(toPort);
		builder.append(", inOut=");
		builder.append(inOut);
		builder.append(", groups=");
		builder.append(groups);
		builder.append(", ipRanges=");
		builder.append(ipRanges);
		builder.append("]");
		return builder.toString();
	}
}
