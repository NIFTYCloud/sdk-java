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
package com.nifty.cloud.sdk.server.model.transform;

import com.nifty.cloud.sdk.server.model.EbsInstanceBlockDevice;
import com.nifty.cloud.sdk.tools.DateUtils;

import com.thoughtworks.xstream.converters.Converter;
import com.thoughtworks.xstream.converters.MarshallingContext;
import com.thoughtworks.xstream.converters.UnmarshallingContext;
import com.thoughtworks.xstream.io.HierarchicalStreamReader;
import com.thoughtworks.xstream.io.HierarchicalStreamWriter;

/**
 * EbsInstanceBlockDeviceMappingResponseType変換クラス。<br />
 * このクラスはレスポンスXMLのebs要素からEbsInstanceBlockDeviceクラスを生成します。
 *  
 */
public class EbsInstanceBlockDeviceMappingConverter implements Converter {

	private static final String ELEMENT_VOLUME_ID = "volumeId";
	private static final String ELEMENT_STATUS = "status";
	private static final String ELEMENT_ATTACH_TIME = "attachTime";
	private static final String ELEMENT_DELETE_ON_TERMINATION = "deleteOnTermination";
	
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
		return clazz == EbsInstanceBlockDevice.class;
	}

	/**
	 * ebsをEbsInstanceBlockDeviceクラスに変換します。
	 * 
	 * @param reader XML読込リーダ
	 * @param context 
	 * @return EbsInstanceBlockDeviceオブジェクト
	 * 
	 * @see com.thoughtworks.xstream.converters.Converter#unmarshal(HierarchicalStreamReader, UnmarshallingContext)
	 */
	@Override
	public Object unmarshal(HierarchicalStreamReader reader, UnmarshallingContext context) {
		EbsInstanceBlockDevice ebsInstanceBlockDevice = new EbsInstanceBlockDevice();
        
		String name = null;
		while(reader.hasMoreChildren()) {
			reader.moveDown();

			name = reader.getNodeName();
			if (name.equals(ELEMENT_VOLUME_ID)) {
				ebsInstanceBlockDevice.setVolumeId(reader.getValue());
			}
			else if (name.equals(ELEMENT_STATUS)) {
				ebsInstanceBlockDevice.setStatus(reader.getValue());
			}
			else if (name.equals(ELEMENT_ATTACH_TIME)) {
				ebsInstanceBlockDevice.setAttachTime(DateUtils.toDate(reader.getValue()));
			}
			else if (name.equals(ELEMENT_DELETE_ON_TERMINATION)) {
				ebsInstanceBlockDevice.setDeleteOnTermination(Boolean.valueOf(reader.getValue()));
			}
			
			reader.moveUp();

		}
		
		return ebsInstanceBlockDevice;
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
