/******************************************************************************* 
 *  Copyright 2014 NIFTY Corporation All Rights Reserved.
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
 *  API Version: 1.18
 *  Date: 2014-05-23 17:00:00
 * 
 */
package com.nifty.cloud.sdk.auth;

/**
 * 認証情報インタフェース。<br />
 * NIFTY Cloud APIの認証情報を保持するインタフェース。 
 *
 */
public interface Credentials {

    /**
     * AccessKeyIdを取得します。
     * 
     * @return AccessKeyId
     */
    public String getAccessKeyId();

    /**
     * SecretKeyを取得します。
     * 
     * @return SecretKey
     */
    public String getSecretKey();

	
}
