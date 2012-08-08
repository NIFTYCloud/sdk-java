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
 *  Date: 2011-08-25 09:46:38
 * 
 */
package com.nifty.cloud.sdk.image.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.nifty.cloud.sdk.Request;
import com.nifty.cloud.sdk.annotation.Action;
import com.nifty.cloud.sdk.annotation.Query;

/**
 * DescribeImagesリクエストクラス。<br />
 * このクラスはDescribeImagesへのリクエストを構築します。
 */
@Action("DescribeImages")
public class DescribeImagesRequest implements Request {
	
	private List<String> executableUsers;
	
	/** OSイメージ情報リスト */
	private List<DescribeImagesInfo> images;
	
	/** OSイメージの種別リスト */
	private List<String> owners;
	
	
	/**
	 * executableUsersを取得します。
	 * 
	 * @return executableUsers
	 */
	@Query(name="ExecutableBy")	
	public List<String> getExecutableUsers() {
		return executableUsers;
	}
	/**
	 * executableUsersを設定します。
	 * 
	 * @param executableUsers
	 */
	public void setExecutableUsers(List<String> executableUsers) {
		this.executableUsers = executableUsers;
	}
	/**
	 * executableUsersを設定し、自オブジェクトを返します。
	 * 
	 * @param executableUsers
	 * @return 自オブジェクト
	 */
	public DescribeImagesRequest withExecutableUsers(String ... executableUsers) {
		if(this.executableUsers == null) this.executableUsers = new ArrayList<String>();
		for(String executableUser : executableUsers) {
			getExecutableUsers().add(executableUser);
		}
		return this;
	}
	/**
	 * 公開レベルを設定し、自オブジェクトを返します。
	 * 
	 * @param executableUsers
	 * @return 自オブジェクト
	 */
	public DescribeImagesRequest withExecutableUsers(Collection<String> executableUsers) {
		if(this.executableUsers == null) this.executableUsers = new ArrayList<String>();
		if (executableUsers!=null) {
			getExecutableUsers().addAll(executableUsers);
		}
		
		return this;
	}
	
	/**
	 * OSイメージ情報リストを取得します。
	 * 
	 * @return OSイメージ情報リスト
	 */
	@Query(name="")	
	public List<DescribeImagesInfo> getImages() {
		return images;
	}
	/**
	 * OSイメージ情報リストを設定します。
	 * 
	 * @param images OSイメージ情報リスト
	 */
	public void setImages(List<DescribeImagesInfo> images) {
		this.images = images;
	}
	/**
	 * OSイメージ情報の配列を設定し、自オブジェクトを返します。
	 * 
	 * @param images OSイメージ情報の配列
	 * @return 自オブジェクト
	 */
	public DescribeImagesRequest withImages(DescribeImagesInfo ... images) {
		if(this.images == null) this.images = new ArrayList<DescribeImagesInfo>();
		for(DescribeImagesInfo image: images) {
			getImages().add(image);
		}
		return this;
	}
	/**
	 * OSイメージ情報リストを設定し、自オブジェクトを返します。
	 * 
	 * @param images OSイメージ情報リスト
	 * @return 自オブジェクト
	 */
	public DescribeImagesRequest withImages(Collection<DescribeImagesInfo> images) {
		if(this.images == null) this.images = new ArrayList<DescribeImagesInfo>();
		if (images!=null) {
			getImages().addAll(images);
		}
		return this;
	}
	
	/**
	 * OSイメージの種別リストを取得します。
	 * 
	 * @return OSイメージの種別リスト
	 */
	@Query(name="Owner")	
	public List<String> getOwners() {
		return owners;
	}
	/**
	 * OSイメージの種別リストを設定します。
	 * 
	 * @param owners OSイメージの種別リスト
	 */
	public void setOwners(List<String> owners) {
		this.owners = owners;
	}
	/**
	 * OSイメージの種別の配列を設定し、自オブジェクトを返します。
	 * 
	 * @param owners OSイメージの種別の配列
	 * @return 自オブジェクト
	 */
	public DescribeImagesRequest withOwners(String ... owners) {
		if(this.owners == null) this.owners = new ArrayList<String>();
		for(String owner : owners) {
			getOwners().add(owner);
		}
		return this;
	}
	/**
	 * OSイメージの種別リストを設定し、自オブジェクトを返します。
	 * 
	 * @param owners OSイメージの種別リスト
	 * @return 自オブジェクト
	 */
	public DescribeImagesRequest withOwners(Collection<String> owners) {
		if(this.owners == null) this.owners = new ArrayList<String>();
		if (owners!=null) {
			getOwners().addAll(owners);
		}
		return this;
	}

	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("[executableUsers=");
		builder.append(executableUsers);
		builder.append(", images=");
		builder.append(images);
		builder.append(", owners=");
		builder.append(owners);
		builder.append("]");
		return builder.toString();
	}

}
