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
package com.nifty.cloud.sdk.upload.model;

/**
 * インポートサーバーの情報格納クラス。<br />
 * このクラスはインポートサーバーの情報を格納します。
 */
public class ImportInstance {
	/** ゾーン名 */
	private String availabilityZone;

	/** ディスクイメージ情報 */
	private Image image;

	/** サーバー名 */
	private String instanceId;

	/**
	 * ゾーン名を取得します。
	 * @return ゾーン名
	 */
	public String getAvailabilityZone() {
		return availabilityZone;
	}

	/**	
	 * ゾーン名を設定します。
	 * @param availabilityZone ゾーン名
	 */
	public void setAvailabilityZone(String availabilityZone) {
		this.availabilityZone = availabilityZone;
	}
	/**
	 * ゾーン名を設定し、自オブジェクトを返します。
	 * @param availabilityZone ゾーン名
	 * @return 自オブジェクト
	 */
	public ImportInstance withAvailabilityZone(String availabilityZone) {
		setAvailabilityZone(availabilityZone);
		return this;
	}

	/**
	 * ディスクイメージ情報を取得します。
	 * @return ディスクイメージ情報
	 */
	public Image getImage() {
		return image;
	}
	/**
	 * ディスクイメージ情報を設定します。
	 * @param image ディスクイメージ情報
	 */
	public void setImage(Image image) {
		this.image = image;
	}
	/**
	 * ディスクイメージ情報を設定し、自オブジェクトを返します。
	 * @param image ディスクイメージ情報
	 * @return 自オブジェクト
	 */
	public ImportInstance withImage(Image image) {
		setImage(image);
		return this;
	}

	/**
	 * サーバー名を取得します。
	 * @return サーバー名
	 */
	public String getInstanceId() {
		return instanceId;
	}
	/**
	 * サーバー名を設定します。
	 * @param instanceId サーバー名
	 */
	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
	}
	/**
	 * サーバー名を設定し、自オブジェクトを返します。
	 * @param instanceId サーバー名
	 * @return 自オブジェクト
	 */
	public ImportInstance withInstanceId(String instanceId) {
		setInstanceId(instanceId);
		return this;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("[availabilityZone=");
		builder.append(availabilityZone);
		builder.append(", image=");
		builder.append(image);
		builder.append(", instanceId=");
		builder.append(instanceId);
		builder.append("]");
		return builder.toString();
	}
}
