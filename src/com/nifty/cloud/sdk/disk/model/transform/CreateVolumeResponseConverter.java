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
 *  API Version: 1.17
 *  Date: 2014-02-20 17:00:00
 * 
 */
package com.nifty.cloud.sdk.disk.model.transform;


import com.nifty.cloud.sdk.disk.model.CreateVolumeResult;
import com.nifty.cloud.sdk.disk.model.Volume;
import com.nifty.cloud.sdk.tools.DateUtils;
import com.thoughtworks.xstream.converters.Converter;
import com.thoughtworks.xstream.converters.MarshallingContext;
import com.thoughtworks.xstream.converters.UnmarshallingContext;
import com.thoughtworks.xstream.io.HierarchicalStreamReader;
import com.thoughtworks.xstream.io.HierarchicalStreamWriter;

/**
 * CreateVolumeResponseType変換クラス。<br />
 * このクラスはレスポンスXMLのCreateVolumeResponseType要素からCreateVolumeResultクラスを生成します。
 */
public class CreateVolumeResponseConverter implements Converter {

	private static final String ELEMENT_REQUEST_ID = "requestId";
	private static final String ELEMENT_VOLUME_ID = "volumeId";
	private static final String ELEMENT_SIZE = "size";
	private static final String ELEMENT_DISK_TYPE = "diskType";
	private static final String ELEMENT_SNAPSHOT_ID = "snapshotId";
	private static final String ELEMENT_AVAILABILITY_ZONE = "availabilityZone";
	private static final String ELEMENT_STATUS = "status";
	private static final String ELEMENT_CREATE_TIME = "createTime";
	private static final String ELEMENT_ACCOUNTING_TYPE = "accountingType";

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
		return clazz == CreateVolumeResult.class;
	}

	/**
	 * CreateVolumeResponseType要素をCreateVolumeResultクラスに変換します。
	 * 
	 * @param reader XML読込リーダ
	 * @param context 
	 * @return CreateVolumeResultオブジェクト
	 * 
	 * @see com.thoughtworks.xstream.converters.Converter#unmarshal(HierarchicalStreamReader, UnmarshallingContext)
	 */
	@Override
	public Object unmarshal(HierarchicalStreamReader reader, UnmarshallingContext context) {
		CreateVolumeResult createVolumeResult = new CreateVolumeResult();
		Volume volume = new Volume();
		createVolumeResult.setVolume(volume);
        	
		String name = null;
		while(reader.hasMoreChildren()) {
			reader.moveDown();

			name = reader.getNodeName();
			if (name.equals(ELEMENT_REQUEST_ID)) {
				createVolumeResult.setRequestId(reader.getValue());
			}
			else if (name.equals(ELEMENT_VOLUME_ID)) {
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
			reader.moveUp();
		}
		return createVolumeResult;
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
