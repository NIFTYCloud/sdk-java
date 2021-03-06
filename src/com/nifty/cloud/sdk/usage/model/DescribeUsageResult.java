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
package com.nifty.cloud.sdk.usage.model;

import java.util.List;

import com.nifty.cloud.sdk.Result;
import com.nifty.cloud.sdk.usage.model.transform.MailSendInfoConverter;
import com.nifty.cloud.sdk.usage.model.transform.OptionCommonInfoConverter;
import com.nifty.cloud.sdk.usage.model.transform.OptionInfoConverter;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamConverter;

/**
 * DescribeUsage処理結果クラス。<br />
 * このクラスはDescribeUsageのレスポンスを格納します。
 */
@XStreamAlias("DescribeUsageResponse")

public class DescribeUsageResult extends Result {

	/** リクエスト識別子 */
	@XStreamAlias("requestId")
	private String requestId;

	/** 情報取得年月 */
	@XStreamAlias("yearMonth")
	private String yearMonth;

	/** サーバー情報 */
	@XStreamAlias("instanceInfo")
	private UsageInstance instance;

	/** サーバーコピー利用情報 */
	@XStreamAlias("copyInfo")
	private UsageCopy copy;

	/** イメージ利用情報 */
	@XStreamAlias("imageInfo")
	private UsageImage image;

	/** ディスク利用情報 */
	@XStreamAlias("volumeInfo")
	private UsageVolume volume;

	/** ネットワーク利用情報 */
	@XStreamAlias("networkInfo")
	private UsageNetwork network;

	/** ファイアウォール利用情報 */
	@XStreamAlias("securityGroupInfo")
	private UsageSecurityGroup securityGroup;

	/** ロードバランサー利用情報 */
	@XStreamAlias("loadBalancerInfo")
	private UsageLoadBalancer loadBalancer;

	/** 付替IP利用情報 */
	@XStreamAlias("elasticIpInfo")
	private UsageElasticIp elasticIp;

	/** オートスケール利用情報 */
	@XStreamAlias("autoScaleInfo")
	private UsageAutoScale autoScale;

	/** SSL証明書利用情報 */
	@XStreamAlias("sslCertInfo")
	private UsageSslCert sslCert;

	/** プライベートLAN情報 */
	@XStreamAlias("privateLanInfo")
	private UsagePrivateLan privateLan;

	/** 利用料金明細情報 */
	@XStreamAlias("chargeDetailInfo")
	private UsageChargeDetail chargeDetail;

	/** プレミアムサポート情報 */
	@XStreamAlias("premiumSupportInfo")
	private UsagePremiumSupport premiumSupport;

	/** マルチアカウント利用情報 */
	@XStreamAlias("multiAccountInfo")
	private UsageMultiAccount multiAccount;

	/** パターン認証利用情報 */
	@XStreamAlias("patternAuthInfo")
	private UsagePatternAuth patternAuth;

	/** クラウドストレージ利用情報 */
	@XStreamAlias("storageInfo")
	private UsageStorage storage;

	/** メール配信利用情報 */
	@XStreamAlias("mailSendInfo")
	@XStreamConverter(MailSendInfoConverter.class)
	private UsageMailSend mailSend;

	/** OSオプション利用情報 */
	@XStreamAlias("osOptionChargeInfo")
	private UsageOsOptionCharge osOptionCharge;

	/** その他の利用情報 */
	@XStreamAlias("extraChargeInfo")
	private UsageExtraCharge extraCharge;
	
	/** ライセンス情報 */
	@XStreamAlias("licenseInfo")
	private UsageLicense license;
	
	/** 追加オプション利用情報（共通） */
	@XStreamAlias("optionCommonInfo")
	@XStreamConverter(OptionCommonInfoConverter.class)
	private List<UsageOptionCommon> optionCommon;
	
	/** 追加オプション利用情報 */
	@XStreamAlias("optionInfo")
	@XStreamConverter(OptionInfoConverter.class)
	private List<UsageOption> option;


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
	public DescribeUsageResult withRequestId(String requestId) {
		setRequestId(requestId);
		return this;
	}

	/**
	 * 情報取得年月を取得します。
	 *
	 * @return 情報取得年月
	 */
	public String getYearMonth() {
		return yearMonth;
	}

	/**
	 * 情報取得年月を設定します。
	 *
	 * @param yearMonth 情報取得年月
	 */
	public void setYearMonth(String yearMonth) {
		this.yearMonth = yearMonth;
	}

	/**
	 * 情報取得年月を設定し、自オブジェクトを返します。
	 *
	 * @param yearMonth 情報取得年月
	 * @return 自オブジェクト
	 */
	public DescribeUsageResult withYearMonth(String yearMonth) {
		setYearMonth(yearMonth);
		return this;
	}

	/**
	 * サーバー情報を取得します。
	 *
	 * @return サーバー情報
	 */
	public UsageInstance getInstance() {
		return instance;
	}

	/**
	 * サーバー情報を設定します。
	 *
	 * @param instance サーバー情報
	 */
	public void setInstance(UsageInstance instance) {
		this.instance = instance;
	}

	/**
	 * サーバー情報を設定し、自オブジェクトを返します。
	 *
	 * @param instance サーバー情報
	 * @return 自オブジェクト
	 */
	public DescribeUsageResult withInstance(UsageInstance instance) {
		setInstance(instance);
		return this;
	}

	/**
	 * サーバーコピー利用情報を取得します。
	 *
	 * @return サーバーコピー利用情報
	 */
	public UsageCopy getCopy() {
		return copy;
	}

	/**
	 * サーバーコピー利用情報を設定します。
	 *
	 * @param copy サーバーコピー利用情報
	 */
	public void setCopy(UsageCopy copy) {
		this.copy = copy;
	}

	/**
	 * サーバーコピー利用情報を設定し、自オブジェクトを返します。
	 *
	 * @param copy サーバーコピー利用情報
	 * @return 自オブジェクト
	 */
	public DescribeUsageResult withCopy(UsageCopy copy) {
		setCopy(copy);
		return this;
	}

	/**
	 * イメージ利用情報を取得します。
	 *
	 * @return イメージ利用情報
	 */
	public UsageImage getImage() {
		return image;
	}

	/**
	 * イメージ利用情報を設定します。
	 *
	 * @param image イメージ利用情報
	 */
	public void setImage(UsageImage image) {
		this.image = image;
	}

	/**
	 * イメージ利用情報を設定し、自オブジェクトを返します。
	 *
	 * @param image イメージ利用情報
	 * @return 自オブジェクト
	 */
	public DescribeUsageResult withImage(UsageImage image) {
		setImage(image);
		return this;
	}

	/**
	 * ディスク利用情報を取得します。
	 *
	 * @return ディスク利用情報
	 */
	public UsageVolume getVolume() {
		return volume;
	}

	/**
	 * ディスク利用情報を設定します。
	 *
	 * @param volume ディスク利用情報
	 */
	public void setVolume(UsageVolume volume) {
		this.volume = volume;
	}

	/**
	 * ディスク利用情報を設定し、自オブジェクトを返します。
	 *
	 * @param volume ディスク利用情報
	 * @return 自オブジェクト
	 */
	public DescribeUsageResult withVolume(UsageVolume volume) {
		setVolume(volume);
		return this;
	}

	/**
	 * ネットワーク利用情報を取得します。
	 *
	 * @return ネットワーク利用情報
	 */
	public UsageNetwork getNetwork() {
		return network;
	}

	/**
	 * ネットワーク利用情報を設定します。
	 *
	 * @param network ネットワーク利用情報
	 */
	public void setNetwork(UsageNetwork network) {
		this.network = network;
	}

	/**
	 * ネットワーク利用情報を設定し、自オブジェクトを返します。
	 *
	 * @param network ネットワーク利用情報
	 * @return 自オブジェクト
	 */
	public DescribeUsageResult withNetwork(UsageNetwork network) {
		setNetwork(network);
		return this;
	}

	/**
	 * ファイアウォール利用情報を取得します。
	 *
	 * @return ファイアウォール利用情報
	 */
	public UsageSecurityGroup getSecurityGroup() {
		return securityGroup;
	}

	/**
	 * ファイアウォール利用情報を設定します。
	 *
	 * @param securityGroup ファイアウォール利用情報
	 */
	public void setSecurityGroup(UsageSecurityGroup securityGroup) {
		this.securityGroup = securityGroup;
	}

	/**
	 * ファイアウォール利用情報を設定し、自オブジェクトを返します。
	 *
	 * @param securityGroup ファイアウォール利用情報
	 * @return 自オブジェクト
	 */
	public DescribeUsageResult withSecurityGroup(UsageSecurityGroup securityGroup) {
		setSecurityGroup(securityGroup);
		return this;
	}

	/**
	 * ロードバランサー利用情報を取得します。
	 *
	 * @return ロードバランサー利用情報
	 */
	public UsageLoadBalancer getLoadBalancer() {
		return loadBalancer;
	}

	/**
	 * ロードバランサー利用情報を設定します。
	 *
	 * @param loadBalancer ロードバランサー利用情報
	 */
	public void setLoadBalancer(UsageLoadBalancer loadBalancer) {
		this.loadBalancer = loadBalancer;
	}

	/**
	 * ロードバランサー利用情報を設定し、自オブジェクトを返します。
	 * @param loadBalancer ロードバランサー利用情報
	 * @return 自オブジェクト
	 */
	public DescribeUsageResult withLoadBalancer(UsageLoadBalancer loadBalancer) {
		setLoadBalancer(loadBalancer);
		return this;
	}

	/**
	 * 付替IP利用情報を取得します。
	 *
	 * @return 付替IP利用情報
	 */
	public UsageElasticIp getElasticIp() {
		return elasticIp;
	}
	/**
	 * 付替IP利用情報を設定します。
	 *
	 * @param elasticIp 付替IP利用情報
	 */
	public void setElasticIp(UsageElasticIp elasticIp) {
		this.elasticIp = elasticIp;
	}
	/**
	 * 付替IP利用情報を取得し、自オブジェクトを返します。
	 *
	 * @param elasticIp 付替IP利用情報
	 * @return 自オブジェクト
	 */
	public DescribeUsageResult withElasticIp(UsageElasticIp elasticIp) {
		setElasticIp(elasticIp);
		return this;
	}

	/**
	 * オートスケール利用情報を取得します。
	 *
	 * @return オートスケール利用情報
	 */
	public UsageAutoScale getAutoScale() {
		return autoScale;
	}

	/**
	 * オートスケール利用情報を設定します。
	 *
	 * @param autoScale オートスケール利用情報
	 */
	public void setAutoScale(UsageAutoScale autoScale) {
		this.autoScale = autoScale;
	}

	/**
	 * オートスケール利用情報を設定し、自オブジェクトを返します。
	 *
	 * @param autoScale オートスケール利用情報
	 * @return 自オブジェクト
	 */
	public DescribeUsageResult withAutoScale(UsageAutoScale autoScale) {
		setAutoScale(autoScale);
		return this;
	}
	/**
	 * SSL証明書利用情報を取得します。
	 *
	 * @return SSL証明書利用情報
	 */
	public UsageSslCert getSslCert() {
		return sslCert;
	}

	/**
	 * SSL証明書利用情報を設定します。
	 *
	 * @param sslCert SSL証明書利用情報
	 */
	public void setSslCert(UsageSslCert sslCert) {
		this.sslCert = sslCert;
	}

	/**
	 * SSL証明書利用情報を設定し、自オブジェクトを返します。
	 *
	 * @param sslCert SSL証明書利用情報
	 * @return 自オブジェクト
	 */
	public DescribeUsageResult withSslCert(UsageSslCert sslCert) {
		setSslCert(sslCert);
		return this;
	}
	/**
	 * プライベートLAN情報を取得します。
	 *
	 * @return プライベートLAN情報
	 */
	public UsagePrivateLan getPrivateLan() {
		return privateLan;
	}

	/**
	 * プライベートLAN情報を設定します。
	 *
	 * @param privateLan プライベートLAN情報
	 */
	public void setPrivateLan(UsagePrivateLan privateLan) {
		this.privateLan = privateLan;
	}

	/**
	 * プライベートLAN情報を設定し、自オブジェクトを返します。
	 *
	 * @param privateLan プライベートLAN情報
	 * @return 自オブジェクト
	 */
	public DescribeUsageResult withPrivateLan(UsagePrivateLan privateLan) {
		setPrivateLan(privateLan);
		return this;
	}

	/**
	 * 利用料金明細情報を取得します。
	 *
	 * @return 利用料金明細情報
	 */
	public UsageChargeDetail getChargeDetail() {
		return chargeDetail;
	}

	/**
	 * 利用料金明細情報設定します。
	 *
	 * @param chargeDetail 利用料金明細情報
	 */
	public void setChargeDetail(UsageChargeDetail chargeDetail) {
		this.chargeDetail = chargeDetail;
	}

	/**
	 * 利用料金明細情報を設定し、自オブジェクトを返します。
	 *
	 * @param chargeDetail 利用料金明細情報
	 * @return 自オブジェクト
	 */
	public DescribeUsageResult withChargeDetail(UsageChargeDetail chargeDetail) {
		setChargeDetail(chargeDetail);
		return this;
	}

	/**
	 * プレミアムサポート情報を取得します。
	 *
	 * @return プレミアムサポート情報
	 */
	public UsagePremiumSupport getPremiumSupport() {
		return premiumSupport;
	}

	/**
	 * プレミアムサポート情報を設定します。
	 *
	 * @param premiumSupport プレミアムサポート情報
	 */
	public void setPremiumSupport(UsagePremiumSupport premiumSupport) {
		this.premiumSupport = premiumSupport;
	}

	/**
	 * プレミアムサポート情報を設定し、自オブジェクトを返します。
	 *
	 * @param premiumSupport プレミアムサポート情報
	 * @return 自オブジェクト
	 */
	public DescribeUsageResult withPremiumSupport(UsagePremiumSupport premiumSupport) {
		setPremiumSupport(premiumSupport);
		return this;
	}

	/**
	 * マルチアカウント利用情報を取得します。
	 *
	 * @return マルチアカウント利用情報
	 */
	public UsageMultiAccount getMultiAccount() {
		return multiAccount;
	}

	/**
	 * マルチアカウント利用情報設定します。
	 *
	 * @param multiAccount マルチアカウント利用情報
	 */
	public void setMultiAccount(UsageMultiAccount multiAccount) {
		this.multiAccount = multiAccount;
	}

	/**
	 * マルチアカウント利用情報を設定し、自オブジェクトを返します。
	 *
	 * @param multiAccount マルチアカウント利用情報
	 * @return 自オブジェクト
	 */
	public DescribeUsageResult withMultiAccount(UsageMultiAccount multiAccount) {
		setMultiAccount(multiAccount);
		return this;
	}

	/**
	 * パターン認証利用情報を取得します。
	 *
	 * @return パターン認証利用情報
	 */
	public UsagePatternAuth getPatternAuth() {
		return patternAuth;
	}

	/**
	 * パターン認証利用情報を設定します。
	 *
	 * @param patternAuth パターン認証利用情報
	 */
	public void setPatternAuth(UsagePatternAuth patternAuth) {
		this.patternAuth = patternAuth;
	}

	/**
	 * パターン認証利用情報を設定し、自オブジェクトを返します。
	 *
	 * @param patternAuth パターン認証利用情報
	 * @return 自オブジェクト
	 */
	public DescribeUsageResult withPatternAuth(UsagePatternAuth patternAuth) {
		setPatternAuth(patternAuth);
		return this;
	}

	/**
	 * クラウドストレージ利用情報を取得します。
	 *
	 * @return クラウドストレージ利用情報
	 */
	public UsageStorage getStorage() {
		return storage;
	}

	/**
	 * クラウドストレージ利用情報を設定します。
	 *
	 * @param storage クラウドストレージ利用情報
	 */
	public void setStorage(UsageStorage storage) {
		this.storage = storage;
	}

	/**
	 * クラウドストレージ利用情報を設定し、自オブジェクトを返します。
	 *
	 * @param storage クラウドストレージ利用情報
	 * @return 自オブジェクト
	 */
	public DescribeUsageResult withStorage(UsageStorage storage) {
		setStorage(storage);
		return this;
	}

	/**
	 * メール配信利用情報を取得します。
	 * @return メール配信利用情報
	 */
	public UsageMailSend getMailSend() {
		return mailSend;
	}

	/**
	 * メール配信利用情報を設定します。
	 * @param mailSend メール配信利用情報
	 */
	public void setMailSend(UsageMailSend mailSend) {
		this.mailSend = mailSend;
	}

	/**
	 * メール配信利用情報を設定し、自オブジェクトを返します。
	 * @param mailSend メール配信利用情報
	 * @return 自オブジェクト
	 */
	public DescribeUsageResult withMailSend(UsageMailSend mailSend) {
		setMailSend(mailSend);
		return this;
	}

	/**
	 * OSオプション利用情報を取得します。
	 * @return OSオプション利用情報
	 */
	public UsageOsOptionCharge getOsOptionCharge() {
		return osOptionCharge;
	}

	/**
	 * OSオプション利用情報を設定します。
	 * @param osOptionCharge OSオプション利用情報
	 */
	public void setOsOptionCharge(UsageOsOptionCharge osOptionCharge) {
		this.osOptionCharge = osOptionCharge;
	}

	/**
	 * OSオプション利用情報を設定し、自オブジェクトを返します。
	 * @param osOptionCharge OSオプション利用情報
	 * @return 自オブジェクト
	 */
	public DescribeUsageResult withOsOptionCharge(UsageOsOptionCharge osOptionCharge) {
		setOsOptionCharge(osOptionCharge);
		return this;
	}

	/**
	 * その他の利用情報を取得します。
	 * @return その他の利用情報
	 */
	public UsageExtraCharge getExtraCharge() {
		return extraCharge;
	}
	/**
	 * その他の利用情報を設定します。
	 * @param extraCharge その他の利用情報
	 */
	public void setExtraCharge(UsageExtraCharge extraCharge) {
		this.extraCharge = extraCharge;
	}
	/**
	 * その他の利用情報を設定し、自オブジェクトを返します。
	 * @param extraCharge その他の利用情報
	 * @return 自オブジェクト
	 */
	public DescribeUsageResult withExtraCharge(UsageExtraCharge extraCharge) {
		setExtraCharge(extraCharge);
		return this;
	}
	
	/**
	 * ライセンス情報を取得します。
	 *
	 * @return ライセンス情報
	 */
	public UsageLicense getLicense() {
		return license;
	}

	/** ライセンス情報を設定します。
	 *
	 * @param license ライセンス情報
	 */
	public void setLicense(UsageLicense license) {
		this.license = license;
	}

	/**
	 * ライセンス情報を設定し、取得します。
	 *
	 * @param license ライセンス情報
	 * @return 自オブジェクト
	 */
	public DescribeUsageResult withLicense(UsageLicense license) {
		setLicense(license);
		return this;
	}
	
	/**
	 * 追加オプション（共通）の利用情報を取得します。
	 * @return 追加オプション（共通）の利用情報
	 */
	public List<UsageOptionCommon> getUsageOptionCommon() {
		return optionCommon;
	}
	/**
	 * 追加オプション（共通）の利用情報を設定します。
	 * @param usageOptionCommon 追加オプション（共通）の利用情報
	 */
	public void setUsageOptionCommon(List<UsageOptionCommon> usageOptionCommon) {
		this.optionCommon = usageOptionCommon;
	}
	/**
	 * 追加オプション（共通）の利用情報を設定し、自オブジェクトを返します。
	 * @param usageOptionCommon 追加オプション（共通）の利用情報
	 * @return 自オブジェクト
	 */
	public DescribeUsageResult withUsageOptionCommon(List<UsageOptionCommon> usageOptionCommon) {
		setUsageOptionCommon(usageOptionCommon);
		return this;
	}
	
	
	/**
	 * 追加オプションの利用情報を取得します。
	 * @return 追加オプションの利用情報
	 */
	public List<UsageOption> getUsageOption() {
		return option;
	}
	/**
	 * 追加オプションの利用情報を設定します。
	 * @param usageOption 追加オプションの利用情報
	 */
	public void setUsageOption(List<UsageOption> usageOption) {
		this.option = usageOption;
	}
	/**
	 * 追加オプションの利用情報を設定し、自オブジェクトを返します。
	 * @param usageOption 追加オプションの利用情報
	 * @return 自オブジェクト
	 */
	public DescribeUsageResult withUsageOption(List<UsageOption> usageOption) {
		setUsageOption(usageOption);
		return this;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("[requestId=");
		builder.append(requestId);
		builder.append(", yearMonth=");
		builder.append(yearMonth);
		builder.append(", instance=");
		builder.append(instance);
		builder.append(", copy=");
		builder.append(copy);
		builder.append(", image=");
		builder.append(image);
		builder.append(", volume=");
		builder.append(volume);
		builder.append(", network=");
		builder.append(network);
		builder.append(", securityGroup=");
		builder.append(securityGroup);
		builder.append(", loadBalancer=");
		builder.append(loadBalancer);
		builder.append(", elasticIp=");
		builder.append(elasticIp);
		builder.append(", autoScale=");
		builder.append(autoScale);
		builder.append(", sslCert=");
		builder.append(sslCert);
		builder.append(", privateLan=");
		builder.append(privateLan);
		builder.append(", chargeDetail=");
		builder.append(chargeDetail);
		builder.append(", premiumSupport=");
		builder.append(premiumSupport);
		builder.append(", multiAccount=");
		builder.append(multiAccount);
		builder.append(", patternAuth=");
		builder.append(patternAuth);
		builder.append(", storage=");
		builder.append(storage);
		builder.append(", mailSend=");
		builder.append(mailSend);
		builder.append(", osOptionCharge=");
		builder.append(osOptionCharge);
		builder.append(", extraCharge=");
		builder.append(extraCharge);
		builder.append(", license=");
		builder.append(license);
		builder.append(", optionCommon=");
		builder.append(optionCommon);
		builder.append(", option=");
		builder.append(option);
		builder.append("]");
		return builder.toString();
	}
}
