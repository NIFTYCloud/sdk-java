package com.nifty.cloud.sdk.misc.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.nifty.cloud.sdk.Request;
import com.nifty.cloud.sdk.annotation.Action;
import com.nifty.cloud.sdk.annotation.Query;

/**
 * DissociaterUserクラス。<br />
 * このクラスDissociateUser情報を格納します。
 *
 */
@Action("DissociateUsers")
public class DissociateUsersRequest  implements Request{

	private String FunctionName;
	private List<UserInfo> userinfo;

	
	/**
	 * デフォルトコンストラクタ。
	 */
	public DissociateUsersRequest() {
	}
	
	/**
	 * functionNameを指定し、DissociateUsersRequestを構築します。
	 * 
	 * @param String functionName 機能名
	 */
	public DissociateUsersRequest(String functionName) {
		this.FunctionName = functionName;
	}
	/**
	 * 機能名を取得します。
	 *
	 * @return String FunctionName
	 */
	@Query(name = "FunctionName")
	public String getFunctionName() {
		return FunctionName;
	}

	/**
	 * 機能名を設定します。
	 *
	 * @param String function
	 */
	public void setFunctionName(String function) {
		this.FunctionName = function;
	}

	/**
	 * functionを設定し、自オブジェクトを返します。
	 *
	 * @param String function
	 * @return 自オブジェクト
	 */
	public DissociateUsersRequest withFunctionName(String function) {
		setFunctionName(function);
		return this;
	}
	
	/**
	 * UserInfo情報リストを取得します。
	 * @return　List<UserInfo>
	 */
	@Query(name="Users.member", require=true)	
	public List<UserInfo> getUserInfo() {
		return userinfo;
	}
	/**
	 * List<UserInfo> 情報リストを設定します。
	 * 
	 * @param List<UserInfo>
	 */
	public void setUserInfo(List<UserInfo> uinfo) {
		this.userinfo = uinfo;
	}
	/**
	 * UserInfo 配列を設定し、自オブジェクトを返します。
	 *
	 * @param List<UserInfo>
	 * @return 自オブジェクト
	 */
	public DissociateUsersRequest withUserInfo(UserInfo ... uinfo) {
		if(this.userinfo == null) this.userinfo = new ArrayList<UserInfo>();
		for(UserInfo userinfo: uinfo) {
			getUserInfo().add(userinfo);
		}
		return this;
	}
	/**
	 * UserInfoを設定し、自オブジェクトを返します。
	 *
	 * @param  Collection<UserInfo>
	 * @return 自オブジェクト
	 */
	public DissociateUsersRequest withUserInfo(Collection<UserInfo> uinfo) {
		if(this.userinfo == null) this.userinfo = new ArrayList<UserInfo>();
		if (uinfo!=null) {
			getUserInfo().addAll(uinfo);
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
		builder.append("[functionName=");
		builder.append(FunctionName);
		builder.append(", userid=");
		builder.append(userinfo);
		builder.append("]");
		return builder.toString();
	}
}