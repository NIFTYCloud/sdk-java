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
 *  Date: 2011-11-10 09:56:54
 * 
 */
package com.nifty.cloud.sdk.sample;

import java.util.ArrayList;
import java.util.List;

import com.nifty.cloud.sdk.ClientConfiguration;
import com.nifty.cloud.sdk.NiftyClientException;
import com.nifty.cloud.sdk.Protocol;
import com.nifty.cloud.sdk.auth.BasicCredentials;
import com.nifty.cloud.sdk.auth.Credentials;
import com.nifty.cloud.sdk.auth.SignatureUtils.SignatureMethod;
import com.nifty.cloud.sdk.auth.SignatureUtils.SignatureVersion;
import com.nifty.cloud.sdk.disk.NiftyDiskClient;
import com.nifty.cloud.sdk.disk.model.DescribeVolumesRequest;
import com.nifty.cloud.sdk.disk.model.DescribeVolumesResult;
import com.nifty.cloud.sdk.disk.model.Volume;
import com.nifty.cloud.sdk.disk.model.VolumeAttachment;

import static java.lang.System.out;
import static java.lang.System.err;

/**
 * DescribeVolumeサンプル
 *
 */
public class DescribeVolumesSample {

    /**
     * DescribeVolumeを実行するサンプルです。
     * 必要なパラメーターを設定してから利用してください。
     *
     * @param args 利用しない
     */
	public static void main(String[] args) {

        /************************************************************************
         * AccessKeyとSecretAccessKeyを設定します。
         * キーはNIFTY Cloudのコントロールパネルから取得します。
         ***********************************************************************/
		String accessKey = "<Input Your AccessKey>";
		String secretKey = "<Input Your SecretAccessKey>";

		/************************************************************************
		 * 指定されたAccessKeyとSecretAccessKeyから認証情報インスタンスを生成します。
         ***********************************************************************/
		Credentials credential = new BasicCredentials(accessKey, secretKey);

        /************************************************************************
		 * クライアント設定情報インスタンスを生成します。
		 * 設定情報を変更する場合は値を設定します。
		 * 以下の項目について設定可能です。
		 *   - ユーザーエージェント
		 *   - プロトコル
		 *   - プロキシサーバーアドレス
		 *   - プロキシサーバーポート番号
		 *   - プロキシユーザー名
		 *   - プロキシパスワード
		 *   - 最大リトライ回数
		 *   - 最大接続数
		 *   - TCPソケットタイムアウト秒数
		 *   - 接続タイムアウト秒数
		 *   - 送信バッファサイズ / 受信バッファサイズ
		 *   - SignatureVersion
		 *   - SignatureMethod
		 *     HTTPメソッド
         ***********************************************************************/
		ClientConfiguration config = new ClientConfiguration();
		// config.setUserAgent("NIFTY Cloud API Java SDK");
		// config.setProtocol(Protocol.HTTPS);
		// config.setProxyHost("proxy_host");
		// config.setProxyPort(0);
		// config.setProxyUsername("proxy_username");
		// config.setProxyPassword("proxy_password");
		// config.setMaxErrorRetry(3);
		// config.setMaxConnections(50);
		// config.setSocketTimeout(30);
		// config.setConnectionTimeout(30);
		// config.setSocketSendBufferSizeHint(0, 0);
		// config.setSignatureVersion(SignatureVersion.Version_2);
		// config.setSignatureMethod(SignatureMethod.HmacSHA256);
		// config.setRequestMethod("GET");

        /************************************************************************
		 * 認証情報とクライアント設定情報からディスクカテゴリ クライアントを生成します。
		 * 非同期実行を行う場合はNiftyDiskAsyncClientクラスを指定します。
         ***********************************************************************/
		NiftyDiskClient client = new NiftyDiskClient(credential,config);

        /************************************************************************
		 * 接続先URLを変更する場合は接続先を指定します。
         ***********************************************************************/
		// client.setEndpoint("endpoint_url");

		/************************************************************************
		 * リクエストパラメーターを設定し、DescribeVolumeを実行します。
         ***********************************************************************/
		DescribeVolumesRequest request = new DescribeVolumesRequest();
		// List<String> volumeIds = new ArrayList<String>();
		// volumeIds.add("volumeId");
		// request.setVolumeIds(volumeIds);
		invokeDescribeVolumes(client,request);

	}

	/**
	 * DescribeVolume 実行サンプル
	 * 設定されたリクエストから DescribeVolume　を実行し、実行結果を表示します。
	 * @param client クライアント
	 * @param request リクエスト
	 */
	public static void invokeDescribeVolumes(NiftyDiskClient client, DescribeVolumesRequest request){
        try {
        	DescribeVolumesResult result = client.describeVolumes(request);

			out.println("DescribeVolume Action Response");
			out.println("=============================================================================");

			List<Volume> volumeList = result.getVolumes();

			for(Volume vol : volumeList){
				out.println("Volume");
				if(vol.getVolumeId() != null){
					out.println("  VolumeId                : " + vol.getVolumeId());
				}
				if(vol.getSize() != null){
					out.println("  Size                    : " + vol.getSize());
				}
				if(vol.getDiskType() != null){
					out.println("  DiskType                : " + vol.getDiskType());
				}
				if(vol.getSnapshotId() != null){
					out.println("  SnapshotId              : " + vol.getSnapshotId());
				}
				if(vol.getAvailabilityZone() != null){
					out.println("  AvailabilityZone        : " + vol.getAvailabilityZone());
				}
				if(vol.getStatus() != null){
					out.println("  Status                  : " + vol.getStatus());
				}
				if(vol.getCreateTime() != null){
					out.println("  CreateTime              : " + vol.getCreateTime());
				}
				if(vol.getAccountingType() != null){
					out.println("  AccountingType          : " + vol.getAccountingType());
				}
				if(vol.getNextMonthAccountingType() != null){
					out.println("  NextMonthAccountingType : " + vol.getNextMonthAccountingType());
				}
				List<VolumeAttachment> attachList = vol.getAttachments();
				for(VolumeAttachment attachment : attachList){
					out.println("  Attachment");
					if(attachment.getVolumeId() != null){
		                out.println("    VolumeId               : " + attachment.getVolumeId());
					}
					if(attachment.getInstanceId() != null){
						out.println("    InstanceId             : " + attachment.getInstanceId());
					}
					if(attachment.getState() != null){
						out.println("    State                  : " + attachment.getState());
					}
					if(attachment.getDevice() != null){
						out.println("    Device                 : " + attachment.getDevice());
					}
					if(attachment.getAttachTime() != null){
						out.println("    AttachTime             : " + attachment.getAttachTime());
					}
					if(attachment.getDeleteOnTermination() != null){
						out.println("    getDeleteOnTermination : " + attachment.getDeleteOnTermination());
					}
				}
			}
			out.println("=============================================================================");
        }catch(NiftyClientException ex){
            err.println("Message: " + ex.getMessage());
        }
	}

}
