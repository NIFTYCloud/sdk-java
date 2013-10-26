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
package com.nifty.cloud.sdk;

import static com.nifty.cloud.sdk.Const.*;

import java.util.ResourceBundle;

import com.nifty.cloud.sdk.auth.SignatureUtils.SignatureMethod;
import com.nifty.cloud.sdk.auth.SignatureUtils.SignatureVersion;

/**
 *　NIFTY Cloud API クライアント 設定情報。<br />
 *　このクラスはNIFTY Cloud API クライアントの 設定情報を格納します。
 */
public class ClientConfiguration {

	/**　ユーザーエージェント	*/
    private String userAgent = DEFAULT_USER_AGENT;
    
    /** プロトコル	*/
    private Protocol protocol = Protocol.find(DEFAULT_PROTOCOL);
    
    /** プロキシーホスト名	*/
    private String proxyHost = null;
    
    /** プロキシー  ポート番号	*/
    private int proxyPort = 0;
    
    /** プロキシー 　認証ユーザー名	*/
    private String proxyUsername = null;
    
    /** プロキシー 　パスワード	*/
    private String proxyPassword = null;

    /** 最大リトライ回数	*/
    private int maxErrorRetry = MAX_ERROR_RETRY;

    /** 最大接続数	*/
    private int maxConnections = MAX_CONNECTIONS;
    
    /** TCPソケットタイムアウト秒数	*/
    private int socketTimeout = SOCKET_TIMEOUT;
    
    /** 接続タイムアウト秒数 */
    private int connectionTimeout = CONNECTION_TIMEOUT;
    
    /** 送信バッファサイズ	*/
    private int socketSendBufferSizeHint = 0;
    
    /** 受信バッファサイズ */
    private int socketReceiveBufferSizeHint = 0;

    /** SignatureVersion	*/
    private SignatureVersion signatureVersion = SignatureVersion.find(DEFAULT_SIGNATURE_VERSION);
    
    /** SignatureMethod	*/
    private SignatureMethod signatureMethod = SignatureMethod.find(DEFAULT_SIGNATUTE_METHOD);
    
    /** エンドポイント **/
    private String configEndpoint = null;
    
    /** エンドポイント **/
    private String configUploadEndpoint = null;
    
    /** 利用規約URL */
    private String sslCertEulaUrl = SSL_CERT_EULA_URL;
    
    /** HTTPメソッド */
    private String requestMethod = HTTP_METHOD_GET;
   
    /** アップロードのブロックサイズデフォルト */
    private int uploadBlockSize = DEFAULT_UPLOAD_BLOCKSIZE;

    /** 有償版へ変更する際の注意事項URL */
    private String firewallNotesUrlForPaid = FW_NOTES_URL_FOR_PAID;

    /** 無償版へ変更する際の注意事項URL */
    private String firewallNotesUrlForFree = FW_NOTES_URL_FOR_FREE;
    
    /*
     * ここにRedhat同意文のURLを定義
     * private String redHatForAgree = REDHAT_AGREE;
     */
     private String redhatForAgree = REDHAT_AGREE;
    
    
	/**
	 * デフォルトのプロパティファイルから設定を取得し、クライアント設定情報を構築します。
	 * 
	 */
	public ClientConfiguration() {
		this(PROPERTIES_FILE);
	}
	
	/**
	 * 指定されたプロパティファイルから設定を取得し、クライアント設定情報を構築します。
	 * 
	 * @param propertiesFile プロパティファイル名
	 */
	public ClientConfiguration(String propertiesFile) {	
		
		ResourceBundle bundle = ResourceBundle.getBundle(propertiesFile);

		String value = getResourceValue(bundle, "nifty_cloud.sdk.user_agent");
		if (value != null && !value.isEmpty()) userAgent = value;

		value = getResourceValue(bundle, "nifty_cloud.sdk.protocol");
		if (value != null && !value.isEmpty()) protocol = Protocol.find(value);

		value = getResourceValue(bundle, "nifty_cloud.sdk.proxy_host");
		if (value != null && !value.isEmpty()) proxyHost = value;

		value = getResourceValue(bundle, "nifty_cloud.sdk.proxy_port");
		if (value != null && !value.isEmpty()) proxyPort = Integer.parseInt(value);

		value = getResourceValue(bundle, "nifty_cloud.sdk.proxy_username");
		if (value != null && !value.isEmpty()) proxyUsername = value;

		value = getResourceValue(bundle, "nifty_cloud.sdk.proxy_password");
		if (value != null && !value.isEmpty()) proxyPassword = value;

		value = getResourceValue(bundle, "nifty_cloud.sdk.max_error_retry");
		if (value != null && !value.isEmpty()) maxErrorRetry = Integer.parseInt(value);

		value = getResourceValue(bundle, "nifty_cloud.sdk.max_connections");
		if (value != null && !value.isEmpty()) maxConnections = Integer.parseInt(value);

		value = getResourceValue(bundle, "nifty_cloud.sdk.so_timeout");
		if (value != null && !value.isEmpty()) socketTimeout = Integer.parseInt(value);

		value = getResourceValue(bundle, "nifty_cloud.sdk.connection_timeout");
		if (value != null && !value.isEmpty()) connectionTimeout = Integer.parseInt(value);	

		value = getResourceValue(bundle, "nifty_cloud.sdk.socket_send_buffer_size_hint");
		if (value != null && !value.isEmpty()) socketSendBufferSizeHint = Integer.parseInt(value);

		value = getResourceValue(bundle, "nifty_cloud.sdk.socket_receive_buffer_size_hint");
		if (value != null && !value.isEmpty()) socketReceiveBufferSizeHint = Integer.parseInt(value);

		value = getResourceValue(bundle, "nifty_cloud.sdk.signature_version");
		if (value != null && !value.isEmpty()) signatureVersion = SignatureVersion.find(value);

		value = getResourceValue(bundle, "nifty_cloud.sdk.signature_method");
		if (value != null  && !value.isEmpty()) signatureMethod = SignatureMethod.find(value);

		value = getResourceValue(bundle, "nifty_cloud.sdk.url");
		if (value != null  && !value.isEmpty()) configEndpoint = value;

		value = getResourceValue(bundle, "nifty_cloud.sdk.upload_url");
		if (value != null  && !value.isEmpty()) configUploadEndpoint = value;

		value = getResourceValue(bundle, "nifty_cloud.sdk.sslcert_eula_url");
		if (value != null  && !value.isEmpty()) sslCertEulaUrl = value;

		value = getResourceValue(bundle, "nifty_cloud.sdk.request_method");
		if (value != null && !value.isEmpty()) {
			if (value.equalsIgnoreCase(Const.HTTP_METHOD_GET) || value.equalsIgnoreCase(Const.HTTP_METHOD_POST)) {
				requestMethod = value;;
			} else {
				throw new NiftyClientException("Unsupported request method.");
			}
		}

		value = getResourceValue(bundle, "nifty_cloud.sdk.upload_block_size");
		if (value != null && !value.isEmpty()) uploadBlockSize = Integer.parseInt(value);

		value = getResourceValue(bundle, "nifty_cloud.sdk.firewall_notes_url_for_paid");
		if (value != null && !value.isEmpty()) firewallNotesUrlForPaid = value;

		value = getResourceValue(bundle, "nifty_cloud.sdk.firewall_notes_url_for_free");
		if (value != null && !value.isEmpty()) firewallNotesUrlForFree = value;

		if (System.getProperty("http.proxyHost") != null) proxyHost = System.getProperty("http.proxyHost");
		if (System.getProperty("http.proxyPort") != null) proxyPort = Integer.parseInt(System.getProperty("http.proxyPort"));
	}

	/**
	 * 指定されたリソースバンドルとキーから、文字列を取得します。
	 * 
	 * @return 指定されたキーの文字列 
	 */
	private String getResourceValue(ResourceBundle bundle, String key) {
		if(key == null) return null;
		return bundle.containsKey(key) ? bundle.getString(key) : null;
	}
	
	/**
	 * ユーザーエージェントを取得します。
	 * 
	 * @return ユーザーエージェント
	 */
	public String getUserAgent() {
		return userAgent;
	}
	/**
	 * ユーザーエージェントを設定します。
	 * 
	 * @param userAgent ユーザーエージェント
	 */
	public void setUserAgent(String userAgent) {
		this.userAgent = userAgent;
	}
	/**
	 * ユーザーエージェントを設定し、自オブジェクトを返します。
	 * 
	 * @param userAgent  ユーザーエージェント
	 * @return　自オブジェクト
	 */
	public ClientConfiguration withUserAgent(String userAgent) {
		this.userAgent = userAgent;
		return this;
	}

	/**
	 * プロトコルを取得します。
	 * 
	 * @return プロトコル
	 */
	public Protocol getProtocol() {
		return protocol;
	}
	/**
	 * プロトコルを設定します。
	 * 
	 * @param protocol プロトコル
	 */
	public void setProtocol(Protocol protocol) {
		this.protocol = protocol;
	}
	/**
	 * プロトコルを設定し、自オブジェクトを返します。
	 * 
	 * @param protocol プロトコル
	 * @return 自オブジェクト
	 */
	public ClientConfiguration withProtocol(Protocol protocol) {
		this.protocol = protocol;
		return this;
	}

	/**
	 * プロキシホストを取得します。
	 * 
	 * @return プロキシホスト
	 */
	public String getProxyHost() {
		return proxyHost;
	}
	/**
	 * プロキシホストを設定します。
	 * 
	 * @param proxyHost プロキシホスト
	 */
	public void setProxyHost(String proxyHost) {
		this.proxyHost = proxyHost;
	}
	/**
	 * プロキシホストを設定し、自オブジェクトを返します。
	 * 
	 * @param proxyHost プロキシホスト
	 * @return 自オブジェクト
	 */
	public ClientConfiguration withProxyHost(String proxyHost) {
		this.proxyHost = proxyHost;
		return this;
	}

	/**
	 * プロキシホストのポート番号を取得します。
	 * 
	 * @return プロキシホストのポート番号
	 */
	public int getProxyPort() {
		return proxyPort;
	}
	/**
	 * プロキシホストのポート番号を設定します。
	 * 
	 * @param proxyPort プロキシホストのポート番号
	 */
	public void setProxyPort(int proxyPort) {
		this.proxyPort = proxyPort;
	}
	/**
	 * プロキシホストのポート番号を設定し、自オブジェクトを返します。
	 * 
	 * @param proxyPort プロキシホストのポート番号
	 * @return 自オブジェクト
	 */
	public ClientConfiguration withProxyPort(int proxyPort) {
		this.proxyPort = proxyPort;
		return this;
	}

	/**
	 * プロキシホストの認証ユーザー名を取得します。
	 * 
	 * @return プロキシホストの認証ユーザー名
	 */
	public String getProxyUsername() {
		return proxyUsername;
	}
	/**
	 * プロキシホストの認証ユーザー名を設定します。
	 * 
	 * @param proxyUsername プロキシホストの認証ユーザー名
	 */
	public void setProxyUsername(String proxyUsername) {
		this.proxyUsername = proxyUsername;
	}
	/**
	 * プロキシホストの認証ユーザー名を設定し、自オブジェクトを返します。
	 * 
	 * @param proxyUsername プロキシホストの認証ユーザー名
	 * @return 自オブジェクト
	 */
	public ClientConfiguration withProxyUsername(String proxyUsername) {
		this.proxyUsername = proxyUsername;
		return this;
	}

	/**
	 * プロキシホストのパスワードを取得します。
	 * 
	 * @return プロキシホストのパスワード
	 */
	public String getProxyPassword() {
		return proxyPassword;
	}
	/**
	 * プロキシホストのパスワードを設定します。
	 * 
	 * @param proxyPassword  プロキシホストのパスワード
	 */
	public void setProxyPassword(String proxyPassword) {
		this.proxyPassword = proxyPassword;
	}
	/**
	 * プロキシホストのパスワードを設定し、自オブジェクトを返します。
	 * 
	 * @param proxyPassword プロキシホストのパスワード
	 * @return 自オブジェクト
	 */
	public ClientConfiguration withProxyPassword(String proxyPassword) {
		this.proxyPassword = proxyPassword;
		return this;
	}

	/**
	 * 最大リトライ回数を取得します。
	 * 
	 * @return 最大リトライ回数
	 */
	public int getMaxErrorRetry() {
		return maxErrorRetry;
	}
	/**
	 * 最大リトライ回数を設定します。
	 * 
	 * @param maxErrorRetry  最大リトライ回数
	 */
	public void setMaxErrorRetry(int maxErrorRetry) {
		this.maxErrorRetry = maxErrorRetry;
	}
	/**
	 * 最大リトライ回数を設定し、自オブジェクトを返します。
	 * 
	 * @param maxErrorRetry  最大リトライ回数
	 * @return 自オブジェクト
	 */
	public ClientConfiguration withMaxErrorRetry(int maxErrorRetry) {
		this.maxErrorRetry = maxErrorRetry;
		return this;
	}

	/**
	 * 最大接続数を取得します。
	 * 
	 * @return 最大接続数
	 */
	public int getMaxConnections() {
		return maxConnections;
	}
	/**
	 * 最大接続数を設定します。
	 * 
	 * @param maxConnections  最大接続数
	 */
	public void setMaxConnections(int maxConnections) {
		this.maxConnections = maxConnections;
	}
	/**
	 * 最大接続数を設定し、自オブジェクトを返します。
	 * 
	 * @param maxConnections  最大接続数
	 * @return 自オブジェクト
	 */
	public ClientConfiguration withMaxConnections(int maxConnections) {
		this.maxConnections = maxConnections;
		return this;
	}

	/**
	 * TCPソケットのタイムアウト秒を取得します。
	 * 
	 * @return TCPソケットのタイムアウト秒
	 */
	public int getSocketTimeout() {
		return socketTimeout;
	}
	/**
	 * TCPソケットのタイムアウト秒を設定します。
	 * 
	 * @param socketTimeout  TCPソケットのタイムアウト秒
	 */
	public void setSocketTimeout(int socketTimeout) {
		this.socketTimeout = socketTimeout;
	}
	/**
	 * TCPソケットのタイムアウト秒を設定し、自オブジェクトを返します。
	 * 
	 * @param socketTimeout  TCPソケットのタイムアウト秒
	 * @return 自オブジェクト
	 */
	public ClientConfiguration withSocketTimeout(int socketTimeout) {
		this.socketTimeout = socketTimeout;
		return this;
	}

	/**
	 * 接続タイムアウト秒を取得します。
	 * 
	 * @return 接続タイムアウト秒
	 */
	public int getConnectionTimeout() {
		return connectionTimeout;
	}
	/**
	 * 接続タイムアウト秒を設定します。
	 * 
	 * @param connectionTimeout 接続タイムアウト秒
	 */
	public void setConnectionTimeout(int connectionTimeout) {
		this.connectionTimeout = connectionTimeout;
	}
	/**
	 * 接続タイムアウト秒を設定し、自オブジェクトを返します。
	 * 
	 * @param connectionTimeout 接続タイムアウト秒
	 * @return 自オブジェクト
	 */
	public ClientConfiguration withConnectionTimeout(int connectionTimeout) {
		this.connectionTimeout = connectionTimeout;
		return this;
	}

	/**
	 * ソケットバッファサイズを取得します。
	 * 
	 * @return 送信バッファサイズ, 受信バッファサイズ
	 */
	public int[] getSocketBufferSizeHints() {
		return new int[] {socketSendBufferSizeHint, socketReceiveBufferSizeHint};
	}
	/**
	 * ソケットバッファサイズを設定します。
	 * 
	 * @param socketSendBufferSizeHint  送信バッファサイズ
	 * @param socketReceiveBufferSizeHint  受信バッファサイズ
	 */
	public void setSocketSendBufferSizeHint(int socketSendBufferSizeHint,
											int socketReceiveBufferSizeHint) {
		this.socketSendBufferSizeHint = socketSendBufferSizeHint;
		this.socketReceiveBufferSizeHint = socketReceiveBufferSizeHint;
	}
	/**
	 * ソケットバッファサイズを設定し、自オブジェクトを返します。
	 * 
	 * @param socketSendBufferSizeHint  送信バッファサイズ
	 * @param socketReceiveBufferSizeHint  受信バッファサイズ
	 * @return 自オブジェクト
	 */
	public ClientConfiguration withSocketSendBufferSizeHint(int socketSendBufferSizeHint,
															int socketReceiveBufferSizeHint) {
		this.socketSendBufferSizeHint = socketSendBufferSizeHint;
		this.socketReceiveBufferSizeHint = socketReceiveBufferSizeHint;
		return this;
	}

	/**
	 * SignatureVersionを取得します。
	 * 
	 * @return SignatureVersion
	 */
	public SignatureVersion getSignatureVersion() {
		return signatureVersion;
	}
	/**
	 * SignatureVersionを設定します。
	 * 
	 * @param signatureVersion SignatureVersion
	 */
	public void setSignatureVersion(SignatureVersion signatureVersion) {
		this.signatureVersion = signatureVersion;
	}
	/**
	 * SignatureVersionを設定し、自オブジェクトを返します。
	 * 
	 * @param signatureVersion  SignatureVersion
	 * @return 自オブジェクト
	 */
	public ClientConfiguration withSignatureVersion(SignatureVersion signatureVersion) {
		this.signatureVersion = signatureVersion;
		return this;
	}
	
	/**
	 * SignatureMethodを取得します。
	 * 
	 * @return SignatureMethod
	 */
	public SignatureMethod getSignatureMethod() {
		return signatureMethod;
	}
	/**
	 * SignatureMethodを設定します。
	 * 
	 * @param signatureMethod SignatureMethod 
	 */
	public void setSignatureMethod(SignatureMethod signatureMethod) {
		this.signatureMethod = signatureMethod;
	}
	/**
	 * SignatureMethodを設定し、自オブジェクトを返します。
	 * 
	 * @param signatureMethod  SignatureMethod
	 * @return 自オブジェクト
	 */
	public ClientConfiguration withSignatureMethod(SignatureMethod signatureMethod) {
		this.signatureMethod = signatureMethod;
		return this;
	}
	
	
	/**
	 * エンドポイントを取得します。
	 * 
	 * @return エンドポイント
	 */
	public String getConfigEndpoint(){
		return configEndpoint;
	}
	/**
	 * エンドポイントを設定します。
	 * 
	 * @param configEndpoint エンドポイント 
	 */
	public void setConfigEndpoint(String configEndpoint){
		this.configEndpoint = configEndpoint;
	}
	/**
	 * エンドポイントを設定し、自オブジェクトを返します。
	 * 
	 * @param configEndpoint  エンドポイント
	 * @return 自オブジェクト
	 */
	public ClientConfiguration withConfigEndpoint(String configEndpoint){
		this.configEndpoint = configEndpoint;
		return this;
	}

	/**
	 * アップロードエンドポイントを取得します。
	 * 
	 * @return アップロードエンドポイント
	 */
	public String getConfigUploadEndpoint(){
		return configUploadEndpoint;
	}
	/**
	 * アップロードエンドポイントを設定します。
	 * 
	 * @param configUploadEndpoint エンドポイント 
	 */
	public void setConfigUploadEndpoint(String configUploadEndpoint){
		this.configUploadEndpoint = configUploadEndpoint;
	}
	/**
	 * アップロードエンドポイントを設定し、自オブジェクトを返します。
	 * 
	 * @param configUploadEndpoint  アップロードエンドポイント
	 * @return 自オブジェクト
	 */
	public ClientConfiguration withConfigUploadEndpoint(String configUploadEndpoint){
		this.configUploadEndpoint = configUploadEndpoint;
		return this;
	}

	/**
	 * アップロードブロックサイズを取得します。
	 * @return アップロードブロックサイズ
	 */
	public int getUploadBlockSize() {
		return uploadBlockSize;
	}
	/**
	 * アップロードブロックサイズを設定します。
	 * @param uploadBlockSize アップロードブロックサイズ
	 */
	public void setUploadBlockSize(int uploadBlockSize) {
		this.uploadBlockSize = uploadBlockSize;
	}
	/**
	 * アップロードブロックサイズを設定し、自オブジェクトを返します。
	 * @param uploadBlockSize アップロードブロックサイズ
	 * @return 自オブジェクト
	 */
	public ClientConfiguration withUploadBlockSize(int uploadBlockSize) {
		setUploadBlockSize(uploadBlockSize);
		return this;
	}

	/**
	 * 利用規約URLを取得します。
	 * 
	 * @return 利用規約URL
	 */
	public String getSslCertEulaUrl() {
		return sslCertEulaUrl;
	}
	/**
	 * 利用規約URLを設定します。
	 * 
	 * @param sslCertEulaUrl 利用規約URL
	 */
	public void setSslCertEulaUrl(String sslCertEulaUrl) {
		this.sslCertEulaUrl = sslCertEulaUrl;
	}
	/**
	 * 利用規約URLを設定し、自オブジェクトを返します。
	 * 
	 * @param sslCertEulaUrl 利用規約URL
	 * @return 自オブジェクト
	 */
	public ClientConfiguration withSslCertEulaUrl(String sslCertEulaUrl){
		this.sslCertEulaUrl = sslCertEulaUrl;
		return this;
	}

	/**
	 * HTTPメソッドを取得します。
	 * @return requestMethod HTTPメソッド
	 */
	public String getRequestMethod() {
		return requestMethod;
	}
	/**
	 * HTTPメソッドを設定します。
	 * @param requestMethod HTTPメソッド
	 */
	public void setRequestMethod(String requestMethod) {
		this.requestMethod = requestMethod;
	}
	/**
	 * HTTPメソッドを設定し、自オブジェクトを返します。
	 * 
	 * @param requestMethod HTTPメソッド
	 * @return 自オブジェクト
	 */
	public ClientConfiguration withRequestMethod(String requestMethod){
		this.requestMethod = requestMethod;
		return this;
	}

	/**
	 * 有償版へ変更する際の注意事項URLを取得します。
	 * 
	 * @return firewallNotesUrl 注意事項URL
	 */
	public String getFirewallNotesUrlForPaid() {
		return firewallNotesUrlForPaid;
	}

	/**
	 * 有償版へ変更する際の注意事項URLを設定します。
	 * 
	 * @param firewallNotesUrlForPaid 注意事項URL
	 */
	public void setFirewallNotesUrlForPaid(String firewallNotesUrlForPaid) {
		this.firewallNotesUrlForPaid = firewallNotesUrlForPaid;
	}

	/**
	 * 有償版へ変更する際の注意事項URLを設定し、自オブジェクトを返します。
	 * 
	 * @param firewallNotesUrlForPaid 注意事項URL
	 * @return 自オブジェクト
	 */
	public ClientConfiguration withFirewallNotesUrlForPaid(String firewallNotesUrlForPaid) {
		this.firewallNotesUrlForPaid = firewallNotesUrlForPaid;
		return this;
	}

	/**
	 * 無償版へ変更する際の注意事項URLを取得します。
	 * @return 無償版へ変更する際の注意事項URL
	 */
	public String getFirewallNotesUrlForFree() {
		return firewallNotesUrlForFree;
	}

	/**
	 * 無償版へ変更する際の注意事項URLを設定します。
	 * @param firewallNotesUrlForFree 無償版へ変更する際の注意事項URL
	 */
	public void setFirewallNotesUrlForFree(String firewallNotesUrlForFree) {
		this.firewallNotesUrlForFree = firewallNotesUrlForFree;
	}

	/**
	 * 無償版へ変更する際の注意事項URLを設定し、ジオブジェクトを返します。
	 * @param firewallNotesUrlForFree 無償版へ変更する際の注意事項URL
	 * @return 自オブジェクト
	 */
	public ClientConfiguration withFirewallNotesUrlForFree(String firewallNotesUrlForFree) {
		this.firewallNotesUrlForFree = firewallNotesUrlForFree;
		return this;
	}
	
	
	/**
	 * Redhat 同意文URLを取得します。
	 * @return Redhat同意文の注意事項URL
	 */
	public String getRedhatAgreeUrl() {
		return redhatForAgree;
	}

	/**
	 * Redhat 同意文URLを設定します。
	 * @param redhatForAgree Redhat同意文URL
	 */
	public void setRedhatAgreeUrl(String redhatForAgree) {
		this.redhatForAgree = redhatForAgree;
	}

	/**
	 * Redhat同意文URLを設定し、ジオブジェクトを返します。
	 * @param redhatForAgree Redhat同意文URL
	 * @return 自オブジェクト
	 */
	public ClientConfiguration withRedhatAgreeUrl(String redhatForAgree) {
		this.redhatForAgree = redhatForAgree;
		return this;
	}
}
