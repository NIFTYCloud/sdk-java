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
package com.nifty.cloud.sdk.security.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.nifty.cloud.sdk.Result;
import com.nifty.cloud.sdk.security.model.transform.DescribeKeyPairsInfoConverter;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamConverter;

/**
 * DescribeKeyPairs処理結果クラス。<br />
 * このクラスはDescribeKeyPairsのレスポンスを格納します。
 */
@XStreamAlias("DescribeKeyPairsResponse")
public class DescribeKeyPairsResult extends Result {
	
	/** リクエスト識別子 */		
	@XStreamAlias("requestId")	
	private String requestId;
	
	/** SSHキー名リスト */
	@XStreamAlias("keySet")	
	@XStreamConverter(DescribeKeyPairsInfoConverter.class)
	private List<KeyPairInfo> keyPairs;
	
	
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
	public DescribeKeyPairsResult withRequestId(String requestId) {
		setRequestId(requestId);
		return this;
	}
	
	/**
	 * SSHキー名リストを取得します。
	 * 
	 * @return SSHキー名リスト
	 */
	public List<KeyPairInfo> getKeyPairs() {
		return keyPairs;
	}
	/**
	 * SSHキー名リストを設定します。
	 * 
	 * @param keyPairs SSHキー名リスト
	 */
	public void setKeyPairs(List<KeyPairInfo> keyPairs) {
		this.keyPairs = keyPairs;
	}
	/**
	 * SSHキー名の配列を設定し、自オブジェクトを返します。
	 *
	 * @param keyPairs SSHキー名の配列
	 * @return 自オブジェクト
	 */
	public DescribeKeyPairsResult withKeyPairs(KeyPairInfo ... keyPairs) {
		if(this.keyPairs == null) this.keyPairs = new ArrayList<KeyPairInfo>();
		for(KeyPairInfo keyPair: keyPairs) {
			getKeyPairs().add(keyPair);
		}
		return this;
	}
	/**
	 * SSHキー名リストを設定し、自オブジェクトを返します。
	 *
	 * @param keyPairs SSHキー名リスト
	 * @return 自オブジェクト	 
	 */
	public DescribeKeyPairsResult withKeyPairs(Collection<KeyPairInfo> keyPairs) {
		if(this.keyPairs == null) this.keyPairs = new ArrayList<KeyPairInfo>();
		if (keyPairs != null) {
			getKeyPairs().addAll(keyPairs);
		}
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
		builder.append(", keyPairs=");
		builder.append(keyPairs);
		builder.append("]");
		return builder.toString();
	}

}
