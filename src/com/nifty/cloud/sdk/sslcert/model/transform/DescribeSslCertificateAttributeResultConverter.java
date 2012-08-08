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
package com.nifty.cloud.sdk.sslcert.model.transform;

import com.nifty.cloud.sdk.sslcert.model.CertInfo;
import com.nifty.cloud.sdk.sslcert.model.Period;
import com.nifty.cloud.sdk.sslcert.model.SslCertification;

import com.nifty.cloud.sdk.sslcert.model.DescribeSslCertificateAttributeResult;
import com.thoughtworks.xstream.converters.Converter;
import com.thoughtworks.xstream.converters.MarshallingContext;
import com.thoughtworks.xstream.converters.UnmarshallingContext;
import com.thoughtworks.xstream.io.HierarchicalStreamReader;
import com.thoughtworks.xstream.io.HierarchicalStreamWriter;

/**
 * DescribeSslCertificateAttributeResponseエレメント変換クラス。<br />
 * このクラスはレスポンスXMLのDescribeSslCertificateAttributeResponse要素からDescribeSslCertificateAttributeResultクラスを生成します。
 *
 */
public class DescribeSslCertificateAttributeResultConverter implements Converter{

    private static final String ELEMENT_REQUEST_ID = "requestId";
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
        return clazz == DescribeSslCertificateAttributeResult.class;
    }

    /**
     * DescribeSslCertificateAttributeResponseをDescribeSslCertificateAttributeResultクラスに変換します。
     *
     * @param reader XML読込リーダ
     * @param context
     * @return DescribeSslCertificateAttributeResultオブジェクト
     *
     * @see com.thoughtworks.xstream.converters.Converter#unmarshal(HierarchicalStreamReader, UnmarshallingContext)
     */
    @Override
    public Object unmarshal(HierarchicalStreamReader reader, UnmarshallingContext context) {
        DescribeSslCertificateAttributeResult result = new DescribeSslCertificateAttributeResult();
        SslCertification sslCertificateAttribute = new SslCertification();
        result.setSslCertificateAttribute(sslCertificateAttribute);

        Converter valueConverter = new ValueConverter();
        Converter periodConverter = new PeriodConverter();
        Converter certInfoConverter = new CertInfoConverter();
        String name = null;
        while(reader.hasMoreChildren()) {
            reader.moveDown();

            name = reader.getNodeName();
            if (name.equals(ELEMENT_REQUEST_ID)) {
                result.setRequestId(reader.getValue());
            } else if (name.equals(ELEMENT_FQDN_ID)) {
                sslCertificateAttribute.setFqdnId(reader.getValue());
            } else if (name.equals(ELEMENT_FQDN)) {
                sslCertificateAttribute.setFqdn(reader.getValue());
            } 
            else if (name.equals(ELEMENT_CERT_AUTHORITY)) {
            	sslCertificateAttribute.setCertAuthority((String) valueConverter.unmarshal(reader, context));
            }
            else if (name.equals(ELEMENT_COUNT)) {
                sslCertificateAttribute.setCount(Integer.valueOf((String)valueConverter.unmarshal(reader, context)));
            }
            else if (name.equals(ELEMENT_CERT_STATE)) {
                sslCertificateAttribute.setCertState((String) valueConverter.unmarshal(reader, context));
            }
            else if (name.equals(ELEMENT_PERIOD)) {
                sslCertificateAttribute.setPeriod((Period)periodConverter.unmarshal(reader, context));
            }
            else if (name.equals(ELEMENT_KEY_LENGTH)) {
                sslCertificateAttribute.setKeyLength(Integer.valueOf((String)valueConverter.unmarshal(reader, context)));
            }
            else if (name.equals(ELEMENT_UPLOAD_STATE)) {
                sslCertificateAttribute.setUploadState(Boolean.valueOf((String)valueConverter.unmarshal(reader, context)));
            }
            else if (name.equals(ELEMENT_DESCRIPTION)) {
                sslCertificateAttribute.setDescription((String)valueConverter.unmarshal(reader, context));
            }
            else if (name.equals(ELEMENT_CERT_INFO)) {
                sslCertificateAttribute.setCertInfo((CertInfo)certInfoConverter.unmarshal(reader, context));
            }
            reader.moveUp();
        }
        return result;
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
