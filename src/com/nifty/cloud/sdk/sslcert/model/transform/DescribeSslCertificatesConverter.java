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
 *  Date: 2011-11-10 09:56:54
 *
 */
package com.nifty.cloud.sdk.sslcert.model.transform;

import java.util.ArrayList;
import java.util.List;

import com.nifty.cloud.sdk.sslcert.model.CertInfo;
import com.nifty.cloud.sdk.sslcert.model.Period;
import com.nifty.cloud.sdk.sslcert.model.SslCertification;

import com.thoughtworks.xstream.converters.Converter;
import com.thoughtworks.xstream.converters.MarshallingContext;
import com.thoughtworks.xstream.converters.UnmarshallingContext;
import com.thoughtworks.xstream.io.HierarchicalStreamReader;
import com.thoughtworks.xstream.io.HierarchicalStreamWriter;

/**
 * certsSetType変換クラス。<br />
 * このクラスはレスポンスXMLのcertsSet要素からList<SslCertification>を生成します。
 *
 */
public class DescribeSslCertificatesConverter implements Converter{

    private static final String ELEMENT_FQDN_ID = "fqdnId";
    private static final String ELEMENT_FQDN = "fqdn";
    private static final String ELEMENT_CERT_AUTHORITY = "certAuthority";
    private static final String ELEMENT_COUNT = "count";
    private static final String ELEMENT_CERT_STATE = "certState";
    private static final String ELEMENT_PERIOD = "period";
    private static final String ELEMENT_KEY_LENGTH = "keyLength";
    private static final String ELEMENT_UPLOAD_STATE = "uploadState";
    private static final String ELEMENT_DESCRIPTION = "description";
    private static final String ELEMENT_CERT_INFO = "certInfo";

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
        Class[] interfaces = clazz.getInterfaces();
        for(Class i: interfaces) {
            if (i==List.class) {
                return true;
            }
        }
        return false;
    }

    /**
     * certsSetをList<SslCertification>に変換します。
     *
     * @param reader XML読込リーダ
     * @param context
     * @return List<SslCertification>オブジェクト
     *
     * @see com.thoughtworks.xstream.converters.Converter#unmarshal(HierarchicalStreamReader, UnmarshallingContext)
     */
    @Override
    public Object unmarshal(HierarchicalStreamReader reader,
            UnmarshallingContext context) {
        List<SslCertification> sslCertifications = new ArrayList<SslCertification>();
        Converter periodConverter = new PeriodConverter();
        Converter certInfoConverter = new CertInfoConverter();

        String name = null;
        while (reader.hasMoreChildren()) {
            reader.moveDown();
            SslCertification sslCertification = new SslCertification();
            while (reader.hasMoreChildren()) {
                reader.moveDown();
                name = reader.getNodeName();
                if (name.equals(ELEMENT_FQDN_ID)) {
                    sslCertification.setFqdnId(reader.getValue());
                } else if (name.equals(ELEMENT_FQDN)) {
                    sslCertification.setFqdn(reader.getValue());
                } else if (name.equals(ELEMENT_CERT_AUTHORITY)) {
                    sslCertification.setCertAuthority(reader.getValue());
                } else if (name.equals(ELEMENT_COUNT)) {
                    sslCertification.setCount(Integer.valueOf(reader.getValue()));
                } else if (name.equals(ELEMENT_CERT_STATE)) {
                    sslCertification.setCertState(reader.getValue());
                } else if (name.equals(ELEMENT_PERIOD)) {
                    sslCertification.setPeriod((Period) periodConverter.unmarshal(reader, context));
                } else if (name.equals(ELEMENT_KEY_LENGTH)) {
                    sslCertification.setKeyLength(Integer.valueOf(reader.getValue()));
                } else if (name.equals(ELEMENT_UPLOAD_STATE)) {
                    sslCertification.setUploadState(Boolean.valueOf((reader.getValue())));
                } else if (name.equals(ELEMENT_DESCRIPTION)) {
                    sslCertification.setDescription(reader.getValue());
                } else if (name.equals(ELEMENT_CERT_INFO)) {
                    sslCertification.setCertInfo((CertInfo) certInfoConverter.unmarshal(reader, context));
                }
                reader.moveUp();
            }
            sslCertifications.add(sslCertification);
            reader.moveUp();
        }
        return sslCertifications;
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
