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
package com.nifty.cloud.sdk.disk.model.transform;


import java.util.ArrayList;
import java.util.List;

import com.nifty.cloud.sdk.disk.model.Volume;
import com.nifty.cloud.sdk.disk.model.VolumeAttachment;
import com.nifty.cloud.sdk.tools.DateUtils;
import com.thoughtworks.xstream.converters.Converter;
import com.thoughtworks.xstream.converters.MarshallingContext;
import com.thoughtworks.xstream.converters.UnmarshallingContext;
import com.thoughtworks.xstream.io.HierarchicalStreamReader;
import com.thoughtworks.xstream.io.HierarchicalStreamWriter;

/**
 * DescribeVolumesSetResponseType変換クラス。<br />
 * このクラスはレスポンスXMLのvolumeSet要素からVolumeクラスのリストを生成します。
 */
public class DescribeVolumesSetConverter implements Converter {

	private static final String ELEMENT_VOLUME_ID = "volumeId";
	private static final String ELEMENT_SIZE = "size";
	private static final String ELEMENT_DISK_TYPE = "diskType";
	private static final String ELEMENT_SNAPSHOT_ID = "snapshotId";
	private static final String ELEMENT_AVAILABILITY_ZONE = "availabilityZone";
	private static final String ELEMENT_STATUS = "status";
	private static final String ELEMENT_CREATE_TIME = "createTime";
	private static final String ELEMENT_ACCOUNTING_TYPE = "accountingType";
	private static final String ELEMENT_NEXT_MONTH_ACCOUNTING_TYPE = "nextMonthAccountingType";
	private static final String ELEMENT_ATTACHMENT_SET = "attachmentSet";
	

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
	 * volumeSet要素をList<Volume>クラスに変換します。
	 *
	 * @param reader XML読込リーダ
	 * @param context 
	 * @return List<Volume>オブジェクト
	 *
	 * @see com.thoughtworks.xstream.converters.Converter#unmarshal(HierarchicalStreamReader, UnmarshallingContext)
	 */
	@SuppressWarnings("unchecked")
	@Override
	public Object unmarshal(HierarchicalStreamReader reader, UnmarshallingContext context) {
		List<Volume> volumes = new ArrayList<Volume>();
		Converter attachmentSetConverter = new AttachmentSetConverter();
		
		String name = null;
		while(reader.hasMoreChildren()) {
			reader.moveDown();
			Volume volume = new Volume();
			
			while(reader.hasMoreChildren()) {
				reader.moveDown();
				
				name = reader.getNodeName();
				if (name.equals(ELEMENT_VOLUME_ID)) {
					volume.setVolumeId(reader.getValue());
				}
				else if (name.equals(ELEMENT_SIZE)) {
					volume.setSize(reader.getValue());
				}
				else if (name.equals(ELEMENT_DISK_TYPE)) {
					volume.setDiskType(reader.getValue());
				}
				else if (name.equals(ELEMENT_SNAPSHOT_ID)) {
					volume.setSnapshotId(reader.getValue());
				}
				else if (name.equals(ELEMENT_AVAILABILITY_ZONE)) {
					volume.setAvailabilityZone(reader.getValue());
				}
				else if (name.equals(ELEMENT_STATUS)) {
					volume.setStatus(reader.getValue());
				}
				else if (name.equals(ELEMENT_CREATE_TIME)) {
					volume.setCreateTime(DateUtils.toDate(reader.getValue()));
				}
				else if (name.equals(ELEMENT_ACCOUNTING_TYPE)) {
					volume.setAccountingType(reader.getValue());
				}
				else if (name.equals(ELEMENT_NEXT_MONTH_ACCOUNTING_TYPE)) {
					volume.setNextMonthAccountingType(reader.getValue());
				}
				else if (name.equals(ELEMENT_ATTACHMENT_SET)) {
					volume.setAttachments((List<VolumeAttachment>) attachmentSetConverter.unmarshal(reader, context));
				}
				
				reader.moveUp();
			}
			
			reader.moveUp();
			volumes.add(volume);
		}
		
		return volumes;
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
