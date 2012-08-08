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
package com.nifty.cloud.sdk.sslcert.model.transform;

import com.nifty.cloud.sdk.sslcert.model.CertInfo;
import com.thoughtworks.xstream.converters.Converter;
import com.thoughtworks.xstream.converters.MarshallingContext;
import com.thoughtworks.xstream.converters.UnmarshallingContext;
import com.thoughtworks.xstream.io.HierarchicalStreamReader;
import com.thoughtworks.xstream.io.HierarchicalStreamWriter;

/**
 * certInfoType変換クラス。<br />
 * このクラスはレスポンスXMLのcertInfo要素からCertInfoクラスを生成します。
 *  
 */
public class CertInfoConverter implements Converter{

    private static final String ELEMENT_ORGANIZATION_NAME = "organizationName";
    private static final String ELEMENT_ORGANIZATION_UNIT_NAME = "organizationUnitName";
    private static final String ELEMENT_COUNTRY_NAME = "countryName";
    private static final String ELEMENT_STATE_NAME = "stateName";
    private static final String ELEMENT_LOCATION_NAME = "locationName";
    private static final String ELEMENT_EMAIL_ADDRESS = "emailAddress";

    /**
     * 変換可能なクラスか判定します。
     *
     * @param clazz クラス
     * @return 変換可能な場合true, 変換不可能な場合false
     *
     * @see com.thoughtworks.xstream.converters.Converter#canConvert(Class)
     */
    @SuppressWarnings("rawtypes")
    @Override
    public boolean canConvert(Class clazz) {
        return clazz == CertInfo.class;
    }

    /**
     * certInfoをCertInfoクラスに変換します。
     *
     * @param reader XML読込リーダ
     * @param context
     * @return CertInfoオブジェクト
     *
     * @see com.thoughtworks.xstream.converters.Converter#unmarshal(HierarchicalStreamReader, UnmarshallingContext)
     */
    @Override
    public Object unmarshal(HierarchicalStreamReader reader, UnmarshallingContext context) {
        CertInfo certInfo = new CertInfo();
        String name = null;
        while(reader.hasMoreChildren()) {
            reader.moveDown();
            name = reader.getNodeName();
            if (name.equals(ELEMENT_ORGANIZATION_NAME)) {
                certInfo.setOrganizationName(reader.getValue());
            }
            else if (name.equals(ELEMENT_ORGANIZATION_UNIT_NAME)) {
                certInfo.setOrganizationUnitName(reader.getValue());
            }
            else if (name.equals(ELEMENT_COUNTRY_NAME)) {
                certInfo.setCountryName(reader.getValue());
            }
            else if (name.equals(ELEMENT_STATE_NAME)) {
                certInfo.setStateName(reader.getValue());
            }
            else if (name.equals(ELEMENT_LOCATION_NAME)) {
                certInfo.setLocationName(reader.getValue());
            }
            else if (name.equals(ELEMENT_EMAIL_ADDRESS)) {
                certInfo.setEmailAddress(reader.getValue());
            }
            reader.moveUp();
        }
        return certInfo;
    }

    /**
     * 未実装メソッド
     */
    @Override
    public void marshal(Object paramObject,
                        HierarchicalStreamWriter paramHierarchicalStreamWriter,
                        MarshallingContext paramMarshallingContext) {
    }
}
