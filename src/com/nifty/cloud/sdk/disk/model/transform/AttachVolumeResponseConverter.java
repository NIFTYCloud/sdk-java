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
package com.nifty.cloud.sdk.disk.model.transform;


import com.nifty.cloud.sdk.disk.model.AttachVolumeResult;
import com.nifty.cloud.sdk.disk.model.VolumeAttachment;
import com.nifty.cloud.sdk.tools.DateUtils;
import com.thoughtworks.xstream.converters.Converter;
import com.thoughtworks.xstream.converters.MarshallingContext;
import com.thoughtworks.xstream.converters.UnmarshallingContext;
import com.thoughtworks.xstream.io.HierarchicalStreamReader;
import com.thoughtworks.xstream.io.HierarchicalStreamWriter;

/**
 * AttachVolumeResponseType変換クラス。<br />
 * このクラスはレスポンスXMLのAttachVolumeResponseType要素からAttachVolumeResultクラスを生成します。
 */
public class AttachVolumeResponseConverter implements Converter {

	private static final String ELEMENT_REQUEST_ID = "requestId";
	private static final String ELEMENT_VOLUME_ID = "volumeId";
	private static final String ELEMENT_INSTANCE_ID = "instanceId";
	private static final String ELEMENT_DEVICE = "device";
	private static final String ELEMENT_STATUS = "status";
	private static final String ELEMENT_ATTACH_TIME = "attachTime";
	
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
		return clazz == AttachVolumeResult.class;
	}


	/**
	 * AttachVolumeResponseType要素をAttachVolumeResultクラスに変換します。
	 * 
	 * @param reader XML読込リーダ
	 * @param context 
	 * @return AttachVolumeResultオブジェクト
	 * 
	 * @see com.thoughtworks.xstream.converters.Converter#unmarshal(HierarchicalStreamReader, UnmarshallingContext)
	 */
	@Override
	public Object unmarshal(HierarchicalStreamReader reader, UnmarshallingContext context) {
		AttachVolumeResult attachVolumeResult = new AttachVolumeResult();
		VolumeAttachment attachment = new VolumeAttachment();
		attachVolumeResult.setAttachment(attachment);
        	
		String name = null;
		while(reader.hasMoreChildren()) {
			reader.moveDown();

			name = reader.getNodeName();
			if (name.equals(ELEMENT_REQUEST_ID)) {
				attachVolumeResult.setRequestId(reader.getValue());
			}
			else if (name.equals(ELEMENT_VOLUME_ID)) {
				attachment.setVolumeId(reader.getValue());
			}
			else if (name.equals(ELEMENT_INSTANCE_ID)) {
				attachment.setInstanceId(reader.getValue());
			}
			else if (name.equals(ELEMENT_DEVICE)) {
				attachment.setDevice(reader.getValue());
			}
			else if (name.equals(ELEMENT_STATUS)) {
				attachment.setState(reader.getValue());
			}
			else if (name.equals(ELEMENT_ATTACH_TIME)) {
				attachment.setAttachTime(DateUtils.toDate(reader.getValue()));
			}
			
			reader.moveUp();
		}
		return attachVolumeResult;
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
