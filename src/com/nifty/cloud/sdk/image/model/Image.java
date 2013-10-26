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
 *  API Version: 1.15
 *  Date: 2013-06-28 17:00:00
 * 
 */
package com.nifty.cloud.sdk.image.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * OSイメージ情報クラス。<br />
 * このクラスはOSイメージ情報を格納します。
 */
public class Image {
	
	/** OSイメージID */
	private String imageId;
	
	private String imageLocation;
	
	/** ステータス */
	private String state;
	
	private String ownerId;
	
	/** OSイメージ公開フラグ */
	private Boolean	publicValue;
	
	private List<ProductCode> productCodes;
	
	/** アーキテクチャ */
	private String architecture;
	
	/** OSイメージタイプ */
	private String imageType;
	
	private String kernelId;
	
	private String ramdiskId;
	
	/** プラットフォーム */
	private String platform;
	
	private StateReason	stateReason;
	
	/** OSイメージを所有する企業名 */
	private String imageOwnerAlias;
	
	/** OSイメージ名 */
	private String name;
	
	/** メモ情報 */
	private String description;
	
	/** OSイメージの説明情報 */
	private String detailDescription;
	
	/** OSイメージの再配布可否情報 */
	private Boolean redistributable;
	
	/** リージョン・ゾーン情報 */
	private GlobalPlacement placement;
	
	/** rootデバイスタイプ */
	private String rootDeviceType;
	
	private String rootDeviceName;
	
	private List<BlockDeviceMapping> blockDeviceMappings;
	
	/**
	 * OSイメージIDを取得します。
	 * 
	 * @return OSイメージID
	 */
	public String getImageId() {
		return imageId;
	}
	/**
	 * OSイメージIDを設定します。
	 * 
	 * @param imageId OSイメージID
	 */
	public void setImageId(String imageId) {
		this.imageId = imageId;
	}
	/**
	 * OSイメージIDを設定し、自オブジェクトを返します。
	 * 
	 * @param imageId OSイメージID
	 * @return 自オブジェクト
	 */
	public Image withImageId(String imageId) {
		setImageId(imageId);
		return this;
	}
	
	/**
	 * imageLocationを取得します。
	 * 
	 * 
	 * @return imageLocation
	 */
	public String getImageLocation() {
		return imageLocation;
	}
	/**
	 * imageLocationを設定します。
	 * 
	 * @param imageLocation
	 */
	public void setImageLocation(String imageLocation) {
		this.imageLocation = imageLocation;
	}
	/**
	 * imageLocationを設定し、自オブジェクトを返します。
	 * 
	 * @param imageLocation
	 * @return 自オブジェクト
	 */
	public Image withImageLocation(String imageLocation) {
		setImageLocation(imageLocation);
		return this;
	}
	
	/**
	 * ステータスを取得します。
	 * 
	 * @return ステータス
	 */
	public String getState() {
		return state;
	}
	/**
	 * ステータスを設定します。
	 * 
	 * @param state ステータス
	 */
	public void setState(String state) {
		this.state = state;
	}
	/**
	 * ステータスを設定し、自オブジェクトを返します。
	 * 
	 * @param state ステータス
	 * @return 自オブジェクト
	 */
	public Image withState(String state) {
		setState(state);
		return this;
	}
	
	/**
	 * ownerIdを取得します。
	 * 
	 * @return ownerId
	 */
	public String getOwnerId() {
		return ownerId;
	}
	/**
	 * ownerIdを設定します。
	 * 
	 * @param ownerId
	 */
	public void setOwnerId(String ownerId) {
		this.ownerId = ownerId;
	}
	/**
	 * ownerIdを設定し、自オブジェクトを返します。
	 * 
	 * @param ownerId
	 * @return 自オブジェクト
	 */
	public Image withOwnerId(String ownerId) {
		setOwnerId(ownerId);
		return this;
	}
	
	/**
	 * OSイメージ公開フラグを取得します。
	 * 
	 * @return OSイメージ公開フラグ
	 */
	public Boolean getPublicValue() {
		return publicValue;
	}
	/**
	 * OSイメージ公開フラグを設定します。
	 * 
	 * @param publicValue OSイメージ公開フラグ
	 */
	public void setPublicValue(Boolean publicValue) {
		this.publicValue = publicValue;
	}
	/**
	 * OSイメージ公開フラグを設定し、自オブジェクトを返します。
	 * 
	 * @param publicValue OSイメージ公開フラグ
	 * @return 自オブジェクト
	 */
	public Image withPublicValue(Boolean publicValue) {
		setPublicValue(publicValue);
		return this;
	}
	
	/**
	 * productCodesを取得します。
	 * 
	 * @return productCodes
	 */
	public List<ProductCode> getProductCodes() {
		return productCodes;
	}
	/**
	 * productCodesを設定します。
	 * 
	 * @param productCodes
	 */
	public void setProductCodes(List<ProductCode> productCodes) {
		this.productCodes = productCodes;
	}
	/**
	 * productCodesの配列を設定し、自オブジェクトを返します。
	 * 
	 * @param productCodes
	 * @return 自オブジェクト
	 */
	public Image withProductCodes(ProductCode ... productCodes) {
		if(this.productCodes == null) this.productCodes = new ArrayList<ProductCode>();
		for(ProductCode productCode: productCodes) {
			getProductCodes().add(productCode);
		}
		return this;
	}
	/**
	 * productCodesを設定し、自オブジェクトを返します。
	 * 
	 * @param productCodes
	 * @return 自オブジェクト
	 */
	public Image withProductCodes(Collection<ProductCode> productCodes) {
		if(this.productCodes == null) this.productCodes = new ArrayList<ProductCode>();
		if (productCodes != null) {
			getProductCodes().addAll(productCodes);
		}
		return this;
	}
	
	/**
	 * アーキテクチャを取得します。
	 * 
	 * @return アーキテクチャ
	 */
	public String getArchitecture() {
		return architecture;
	}
	/**
	 * アーキテクチャを設定します。
	 * 
	 * @param architecture アーキテクチャ
	 */
	public void setArchitecture(String architecture) {
		this.architecture = architecture;
	}
	/**
	 * アーキテクチャを設定し、自オブジェクトを返します。
	 * 
	 * @param architecture アーキテクチャ
	 * @return 自オブジェクト
	 */
	public Image withArchitecture(String architecture) {
		setArchitecture(architecture);
		return this;
	}
	
	/**
	 * OSイメージタイプを取得します。
	 * 
	 * @return OSイメージタイプ
	 */
	public String getImageType() {
		return imageType;
	}
	/**
	 * OSイメージタイプを設定します。
	 * 
	 * @param imageType OSイメージタイプ
	 */
	public void setImageType(String imageType) {
		this.imageType = imageType;
	}
	/**
	 * OSイメージタイプを設定し、自オブジェクトを返します。
	 * 
	 * @param imageType OSイメージタイプ
	 * @return 自オブジェクト
	 */
	public Image withImageType(String imageType) {
		setImageType(imageType);
		return this;
	}
	
	/**
	 * kernelIdを取得します。
	 * 
	 * @return kernelId
	 */
	public String getKernelId() {
		return kernelId;
	}
	/**
	 * kernelIdを設定します。
	 * 
	 * @param kernelId
	 */
	public void setKernelId(String kernelId) {
		this.kernelId = kernelId;
	}
	/**
	 * kernelIdを設定し、自オブジェクトを返します。
	 * 
	 * @param kernelId
	 * @return 自オブジェクト
	 */
	public Image withKernelId(String kernelId) {
		setKernelId(kernelId);
		return this;
	}
	
	/**
	 * ramdiskIdを取得します。
	 * 
	 * @return ramdiskId
	 */
	public String getRamdiskId() {
		return ramdiskId;
	}
	/**
	 * ramdiskIdを設定します。
	 * 
	 * @param ramdiskId
	 */
	public void setRamdiskId(String ramdiskId) {
		this.ramdiskId = ramdiskId;
	}
	/**
	 * ramdiskIdを設定し、自オブジェクトを返します。
	 * 
	 * @param ramdiskId
	 * @return 自オブジェクト
	 */
	public Image withRamdiskId(String ramdiskId) {
		setRamdiskId(ramdiskId);
		return this;
	}
	
	/**
	 * プラットフォームを取得します。
	 * 
	 * @return プラットフォーム
	 */
	public String getPlatform() {
		return platform;
	}
	/**
	 * プラットフォームを設定します。
	 * 
	 * @param platform プラットフォーム
	 */
	public void setPlatform(String platform) {
		this.platform = platform;
	}
	/**
	 * プラットフォームを設定し、自オブジェクトを返します。
	 * 
	 * @param platform プラットフォーム
	 * @return 自オブジェクト
	 */
	public Image withPlatform(String platform) {
		setPlatform(platform);
		return this;
	}
	
	/**
	 * stateReasonを取得します。
	 * 
	 * @return stateReason
	 */
	public StateReason getStateReason() {
		return stateReason;
	}
	/**
	 * stateReasonを設定します。
	 * 
	 * @param stateReason
	 */
	public void setStateReason(StateReason stateReason) {
		this.stateReason = stateReason;
	}
	/**
	 * stateReasonを設定し、自オブジェクトを返します。
	 * 
	 * @param stateReason
	 * @return 自オブジェクト
	 */
	public Image withStateReason(StateReason stateReason) {
		setStateReason(stateReason);
		return this;
	}
	
	/**
	 * OSイメージを所有する企業名を取得します。
	 * 
	 * @return imageOwnerAlias OSイメージを所有する企業名
	 */
	public String getImageOwnerAlias() {
		return imageOwnerAlias;
	}
	/**
	 * iOSイメージを所有する企業名を設定します。
	 * 
	 * @param imageOwnerAlias OSイメージを所有する企業名
	 */
	public void setImageOwnerAlias(String imageOwnerAlias) {
		this.imageOwnerAlias = imageOwnerAlias;
	}
	/**
	 * OSイメージを所有する企業名を設定し、自オブジェクトを返します。
	 * 
	 * @param imageOwnerAlias OSイメージを所有する企業名
	 * @return 自オブジェクト
	 */
	public Image withImageOwnerAlias(String imageOwnerAlias) {
		setImageOwnerAlias(imageOwnerAlias);
		return this;
	}
	
	/**
	 * OSイメージ名を取得します。
	 * 
	 * @return OSイメージ名
	 */
	public String getName() {
		return name;
	}
	/**
	 * OSイメージ名を設定します。
	 * 
	 * @param name OSイメージ名
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * OSイメージ名を設定し、自オブジェクトを返します。
	 * 
	 * @param name OSイメージ名
	 * @return 自オブジェクト
	 */
	public Image withName(String name) {
		setName(name);
		return this;
	}
	
	/**
	 * メモ情報を取得します。
	 * 
	 * @return メモ情報
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * メモ情報を設定します。
	 * 
	 * @param description メモ情報
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * メモ情報を設定し、自オブジェクトを返します。
	 * 
	 * @param description メモ情報
	 * @return 自オブジェクト
	 */
	public Image withDescription(String description) {
		setDescription(description);
		return this;
	}
	/**
	 * OSイメージの説明情報を取得します。
	 * @return detailDescription OSイメージの説明情報
	 */
	public String getDetailDescription() {
		return detailDescription;
	}
	/**
	 * OSイメージの説明情報を設定します。
	 * @param detailDescription OSイメージの説明情報
	 */
	public void setDetailDescription(String detailDescription) {
		this.detailDescription = detailDescription;
	}
	/**
	 * OSイメージの説明情報を設定し、自オブジェクトを返します。
	 * 
	 * @param detailDescription OSイメージの説明情報
	 * @return 自オブジェクト
	 */
	public Image withDetailDescription(String detailDescription) {
		setDetailDescription(detailDescription);
		return this;
	}
	/**
	 * OSイメージの再配布可否情報を取得します。
	 * @return redistributable OSイメージの再配布可否情報
	 */
	public Boolean getRedistributable() {
		return redistributable;
	}
	/**
	 * OSイメージの再配布可否情報を設定します。
	 * @param redistributable OSイメージの再配布可否情報
	 */
	public void setRedistributable(Boolean redistributable) {
		this.redistributable = redistributable;
	}
	/**
	 * OSイメージの再配布可否情報を設定し、自オブジェクトを返します。
	 * 
	 * @param redistributable OSイメージの再配布可否情報
	 * @return 自オブジェクト
	 */
	public Image withRedistributable(Boolean redistributable) {
		setRedistributable(redistributable);
		return this;
	}
	/**
	 * リージョン・ゾーン情報を取得します。
	 * @return リージョン・ゾーン情報
	 */
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
	public Image withPlacement(GlobalPlacement placement) {
		setPlacement(placement);
		return this;
	}
	/**
	 * rootデバイスタイプを取得します。
	 * 
	 * @return rootデバイスタイプ
	 */
	public String getRootDeviceType() {
		return rootDeviceType;
	}
	/**
	 * rootデバイスタイプを設定します。
	 * 
	 * @param rootDeviceType rootデバイスタイプ
	 */
	public void setRootDeviceType(String rootDeviceType) {
		this.rootDeviceType = rootDeviceType;
	}
	/**
	 * rootデバイスタイプを設定し、自オブジェクトを返します。
	 * 
	 * @param rootDeviceType rootデバイスタイプ
	 * @return 自オブジェクト
	 */
	public Image withRootDeviceType(String rootDeviceType) {
		setRootDeviceType(rootDeviceType);
		return this;
	}
	
	/**
	 * rootDeviceNameを取得します。
	 * 
	 * @return rootDeviceName
	 */
	public String getRootDeviceName() {
		return rootDeviceName;
	}
	/**
	 * rootDeviceNameを設定します。
	 * 
	 * @param rootDeviceName
	 */
	public void setRootDeviceName(String rootDeviceName) {
		this.rootDeviceName = rootDeviceName;
	}
	/**
	 * rootDeviceNameを設定し、自オブジェクトを返します。
	 * 
	 * @param rootDeviceName
	 * @return 自オブジェクト
	 */
	public Image withRootDeviceName(String rootDeviceName) {
		setRootDeviceName(rootDeviceName);
		return this;
	}

	/**
	 * blockDeviceMappingsを取得します。
	 * 
	 * @return blockDeviceMappings
	 */
	public List<BlockDeviceMapping> getBlockDeviceMappings() {
		return blockDeviceMappings;
	}
	/**
	 * blockDeviceMappingsを設定します。
	 * 
	 * @param blockDeviceMappings
	 */
	public void setBlockDeviceMappings(List<BlockDeviceMapping> blockDeviceMappings) {
		this.blockDeviceMappings = blockDeviceMappings;
	}
	/**
	 * blockDeviceMappingsの配列を設定し、自オブジェクトを返します。
	 * 
	 * @param blockDeviceMappings
	 * @return 自オブジェクト
	 */
	public Image withBlockDeviceMappings(BlockDeviceMapping ... blockDeviceMappings) {
		if(this.blockDeviceMappings == null) this.blockDeviceMappings = new ArrayList<BlockDeviceMapping>();
		for(BlockDeviceMapping blockDeviceMapping: blockDeviceMappings) {
			getBlockDeviceMappings().add(blockDeviceMapping);
		}
		return this;
	}
	/**
	 * blockDeviceMappingsリストを設定し、自オブジェクトを返します。
	 * 
	 * @param blockDeviceMappings
	 * @return 自オブジェクト
	 */
	public Image withBlockDeviceMappings(Collection<BlockDeviceMapping> blockDeviceMappings) {
		if(this.blockDeviceMappings == null) this.blockDeviceMappings = new ArrayList<BlockDeviceMapping>();
		if (blockDeviceMappings != null) {
			getBlockDeviceMappings().addAll(blockDeviceMappings);
		}
		return this;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("[imageId=");
		builder.append(imageId);
		builder.append(", imageLocation=");
		builder.append(imageLocation);
		builder.append(", state=");
		builder.append(state);
		builder.append(", ownerId=");
		builder.append(ownerId);
		builder.append(", publicValue=");
		builder.append(publicValue);
		builder.append(", productCodes=");
		builder.append(productCodes);
		builder.append(", architecture=");
		builder.append(architecture);
		builder.append(", imageType=");
		builder.append(imageType);
		builder.append(", kernelId=");
		builder.append(kernelId);
		builder.append(", ramdiskId=");
		builder.append(ramdiskId);
		builder.append(", platform=");
		builder.append(platform);
		builder.append(", stateReason=");
		builder.append(stateReason);
		builder.append(", imageOwnerAlias=");
		builder.append(imageOwnerAlias);
		builder.append(", name=");
		builder.append(name);
		builder.append(", description=");
		builder.append(description);
		builder.append(", detailDescription=");
		builder.append(detailDescription);
		builder.append(", redistributable=");
		builder.append(redistributable);
		builder.append(", placement=");
		builder.append(placement);
		builder.append(", rootDeviceType=");
		builder.append(rootDeviceType);
		builder.append(", rootDeviceName=");
		builder.append(rootDeviceName);
		builder.append(", blockDeviceMappings=");
		builder.append(blockDeviceMappings);
		builder.append("]");
		return builder.toString();
	}
	

}
