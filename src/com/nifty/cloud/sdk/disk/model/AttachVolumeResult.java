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
 *  Date: 2011-08-25 09:46:38
 * 
 */
package com.nifty.cloud.sdk.disk.model;

import com.nifty.cloud.sdk.Result;
import com.nifty.cloud.sdk.disk.model.transform.AttachVolumeResponseConverter;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamConverter;

/**
 * AttachVolume処理結果クラス。<br />
 * このクラスはAttachVolumeのレスポンスを格納します。
 */
@XStreamAlias("AttachVolumeResponse")
@XStreamConverter(AttachVolumeResponseConverter.class)
public class AttachVolumeResult extends Result {

	/** リクエスト識別子 */
	private String	requestId;
	
	/** ディスク接続情報 */
	private VolumeAttachment attachment;
	
	
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
	public AttachVolumeResult withRequestId(String requestId) {
		setRequestId(requestId);
		return this;
	}

	/**
	 * ディスク接続情報を取得します。
	 * 
	 * @return ディスク接続情報
	 */
	public VolumeAttachment getAttachment() {
		return attachment;
	}
	/**
	 * ディスク接続情報を設定します。
	 * 
	 * @param attachment ディスク接続情報
	 */
	public void setAttachment(VolumeAttachment attachment) {
		this.attachment = attachment;
	}
	/**
	 * ディスク接続情報を設定し、自オブジェクトを返します。
	 * 
	 * @param attachment ディスク接続情報
	 * @return 自オブジェクト
	 */
	public AttachVolumeResult withAttachment(VolumeAttachment attachment) {
		setAttachment(attachment);
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
		builder.append(", attachment=");
		builder.append(attachment);
		builder.append("]");
		return builder.toString();
	}

}
