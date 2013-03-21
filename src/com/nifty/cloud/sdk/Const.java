/******************************************************************************* 
 *  Copyright 2012 NIFTY Corporation All Rights Reserved.
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
 *  API Version: 1.12
 *  Date: 2012-12-21 17:00:00
 * 
 */
package com.nifty.cloud.sdk;


/**
 * 定数定義インタフェース。<br />
 * 定数定義を格納するインタフェースです。
 * 
 */
public interface Const {

	/** SDKプロパティファイル */
	public final static String PROPERTIES_FILE = "nifty_cloud-sdk";
	
	/** ユーザーエージェント	*/
	public static final String DEFAULT_USER_AGENT = "NIFTY Cloud API Java SDK";
	
	/** プロトコル:HTTP */
	public final static String PROTOCOL_HTTP = "http";
	/** プロトコル:HTTPS */
	public final static String PROTOCOL_HTTPS = "https";
	
	/** デフォルトプロトコル	*/
	public final static String DEFAULT_PROTOCOL = PROTOCOL_HTTPS;
	
	/** NIFTY Cloud API エンドポイント	*/
	public final static String DEFAULT_END_POINT = "https://cp.cloud.nifty.com/api/";
	
	/** NIFTY Cloud アップロード エンドポイント	*/
	public final static String DEFAULT_UPLOAD_END_POINT = "https://cp.cloud.nifty.com/VmUpload/vmupload";
	
	 /** デフォルト リトライ回数	*/
	public final static int MAX_ERROR_RETRY = 3;

	/** デフォルト 最大接続数 */
	public final static int MAX_CONNECTIONS = 50;

	/** デフォルト　SOタイムアウト秒数 */
	public final static int SOCKET_TIMEOUT = 30;

	/** デフォルト　接続タイムアウト秒数 */
	public final static int CONNECTION_TIMEOUT = 30;

	/** APIバージョン： 1.5	*/
	public final static String VERSION_1_5 = "1.5";
	/** APIバージョン： 1.6	*/
	public final static String VERSION_1_6 = "1.6";
	/** APIバージョン： 1.7	*/
	public final static String VERSION_1_7 = "1.7";
	/** APIバージョン： 1.8	*/
	public final static String VERSION_1_8 = "1.8";
	/** APIバージョン： 1.9	*/
	public final static String VERSION_1_9 = "1.9";
	/** APIバージョン： 1.10 */
	public final static String VERSION_1_10 = "1.10";
	/** APIバージョン： 1.10 */
	public final static String VERSION_1_11 = "1.11";	
	/** APIバージョン	*/
	public final static String VERSION_1_12 = "1.12";

	
	/** APIバージョン	*/
	public final static String VERSION = VERSION_1_12;
	

	
	/** SignatureVersion: バージョン0 */
	public final static String SIGNATURE_VERSION_0 = "0";
	/** SignatureVersion: バージョン1 */
	public final static String SIGNATURE_VERSION_1 = "1";
	/** SignatureVersion: バージョン2 */
	public final static String SIGNATURE_VERSION_2 = "2";
	
	/** デフォルト SignatureVersion	*/
	public final static String DEFAULT_SIGNATURE_VERSION = SIGNATURE_VERSION_2;
	
	/** SignatureMethod: HmacsSHA1 */
	public final static String SIGNATUTE_METHOD_HMAC_SHA1   = "HmacSHA1";
	/** SignatureMethod: HmacsSHA256 */
	public final static String SIGNATUTE_METHOD_HMAC_SHA256 = "HmacSHA256";
	
	/** デフォルト SignatureMethod	*/
	public final static String DEFAULT_SIGNATUTE_METHOD = SIGNATUTE_METHOD_HMAC_SHA256;
	
	/** HTTPメソッド: GET */
	public final static String HTTP_METHOD_GET = "GET";
	
	/** HTTPメソッド: POST */
	public final static String HTTP_METHOD_POST = "POST";
	
	public final static String HTTP_VERB = HTTP_METHOD_POST;
	
	/** エンコーディング	*/
	public final static String ENCODING = "UTF-8";
	
	/** SSL証明書利用規約URL	*/
	public final static String SSL_CERT_EULA_URL = "http://cp.cloud.nifty.com/ssl/trust.txt";
	
	/** アップロードブロックサイズデフォルト値(MB) */
	public final static int DEFAULT_UPLOAD_BLOCKSIZE = 8;

	/** 有償版へ変更する際のファイアウォール注意事項URL */
	public final static String FW_NOTES_URL_FOR_PAID = "http://cp.cloud.nifty.com/fw/fw.txt";

	/** 無償版へ変更する際のファイアウォール注意事項URL */
	public final static String FW_NOTES_URL_FOR_FREE = "http://cp.cloud.nifty.com/fw/fw2.txt";

	/** RHELサブスクリプション規約 URL */
	public final static String REDHAT_AGREE = "http://cp.cloud.nifty.com/rhel/eula.txt";
}
