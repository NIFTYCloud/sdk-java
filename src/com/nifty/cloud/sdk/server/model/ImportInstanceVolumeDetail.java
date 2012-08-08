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
package com.nifty.cloud.sdk.server.model;

/**
 * インポートサーバーのディスクイメージ情報クラス。<br />
 * このクラスはインポートサーバーのディスクイメージ情報を格納します。
 */
public class ImportInstanceVolumeDetail {

	private Long bytesConverted;

	/** ゾーン情報 */
	private String availabilityZone;

	/** ディスクイメージ詳細 */
	private DiskImageDescription image;

	private String description;

	private DiskImageVolumeDescription volume;

	/** ステータス */
	private String status;

	private String statusMessage;

	/**
	 * bytesConvertedを取得します。
	 * @return bytesConverted
	 */
	public Long getBytesConverted() {
		return bytesConverted;
	}
	/**
	 * bytesConvertedを設定します。
	 * @param bytesConverted
	 */
	public void setBytesConverted(Long bytesConverted) {
		this.bytesConverted = bytesConverted;
	}
	/**
	 * bytesConvertedを設定し、自オブジェクトを返します。
	 * @param bytesConverted
	 * @return 自オブジェクト
	 */
	public ImportInstanceVolumeDetail withBytesConverted(Long bytesConverted) {
		setBytesConverted(bytesConverted);
		return this;
	}

	/**
	 * ゾーン情報を取得します。
	 * @return ゾーン情報
	 */
	public String getAvailabilityZone() {
		return availabilityZone;
	}
	/**
	 * ゾーン情報を設定します。
	 * @param availabilityZone ゾーン情報
	 */
	public void setAvailabilityZone(String availabilityZone) {
		this.availabilityZone = availabilityZone;
	}
	/**
	 * ゾーン情報を設定し、自オブジェクトを返します。
	 * @param availabilityZone
	 * @return 自オブジェクト
	 */
	public ImportInstanceVolumeDetail withAvailabilityZone(String availabilityZone) {
		setAvailabilityZone(availabilityZone);
		return this;
	}

	/**
	 * ディスクイメージ詳細を取得します。
	 * @return image
	 */
	public DiskImageDescription getImage() {
		return image;
	}
	/**
	 * ディスクイメージ詳細を設定します。
	 * @param image
	 */
	public void setImage(DiskImageDescription image) {
		this.image = image;
	}
	/**
	 * ディスクイメージ詳細を設定し、自オブジェクトを返します。
	 * @param image
	 * @return 自オブジェクト
	 */
	public ImportInstanceVolumeDetail withImage(DiskImageDescription image) {
		setImage(image);
		return this;
	}

	/**
	 * descriptionを取得します。
	 * @return description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * descriptionを設定します。
	 * @param description
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * descriptionを設定し、自オブジェクトを返します。
	 * @param description
	 * @return 自オブジェクト
	 */
	public ImportInstanceVolumeDetail withDescription(String description) {
		setDescription(description);
		return this;
	}

	/**
	 * volumeを取得します。
	 * @return volume
	 */
	public DiskImageVolumeDescription getVolume() {
		return volume;
	}
	/**
	 * volumeを設定します。
	 * @param volume
	 */
	public void setVolume(DiskImageVolumeDescription volume) {
		this.volume = volume;
	}
	/**
	 * volumeを設定し、自オブジェクトを返します。
	 * @param volume
	 * @return 自オブジェクト
	 */
	public ImportInstanceVolumeDetail withVolume(DiskImageVolumeDescription volume) {
		setVolume(volume);
		return this;
	}

	/**
	 * ステータスを取得します。
	 * @return ステータス
	 */
	public String getStatus() {
		return status;
	}
	/**
	 * ステータスを設定します。
	 * @param status ステータス
	 */
	public void setStatus(String status) {
		this.status = status;
	}
	/**
	 * ステータスを設定し、自オブジェクトを返します。
	 * @param status ステータス
	 * @return 自オブジェクト
	 */
	public ImportInstanceVolumeDetail withStatus(String status) {
		setStatus(status);
		return this;
	}

	/**
	 * statusMessageを取得します。
	 * @return statusMessage
	 */
	public String getStatusMessage() {
		return statusMessage;
	}
	/**
	 * statusMessageを設定します。
	 * @param statusMessage
	 */
	public void setStatusMessage(String statusMessage) {
		this.statusMessage = statusMessage;
	}
	/**
	 * statusMessageを設定し、自オブジェクトを返します。
	 * @param statusMessage
	 * @return 自オブジェクト
	 */
	public ImportInstanceVolumeDetail withStatusMessage(String statusMessage) {
		setStatusMessage(statusMessage);
		return this;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("[bytesConverted=");
		builder.append(bytesConverted);
		builder.append(", availabilityZone=");
		builder.append(availabilityZone);
		builder.append(", image=");
		builder.append(image);
		builder.append(", description=");
		builder.append(description);
		builder.append(", volume=");
		builder.append(volume);
		builder.append(", status=");
		builder.append(status);
		builder.append(", statusMessage=");
		builder.append(statusMessage);
		builder.append("]");
		return builder.toString();
	}
}
