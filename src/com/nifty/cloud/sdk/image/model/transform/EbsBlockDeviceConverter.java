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
package com.nifty.cloud.sdk.image.model.transform;

import com.nifty.cloud.sdk.image.model.EbsBlockDevice;

import com.thoughtworks.xstream.converters.Converter;
import com.thoughtworks.xstream.converters.MarshallingContext;
import com.thoughtworks.xstream.converters.UnmarshallingContext;
import com.thoughtworks.xstream.io.HierarchicalStreamReader;
import com.thoughtworks.xstream.io.HierarchicalStreamWriter;

/**
 * EbsBlockDeviceType変換クラス。<br />
 * このクラスはレスポンスXMLのebs要素からEbsBlockDeviceクラスを生成します。
 */
public class EbsBlockDeviceConverter implements Converter {


	private static final String ELEMENT_SNAPSHOT_ID = "snapshotId";
	private static final String ELEMENT_VOLUME_SIZE = "volumeSize";
	private static final String ELEMENT_DISK_TYPE = "diskType";
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
		return clazz == EbsBlockDevice.class;
	}

	/**
	 * ebs要素をEbsBlockDeviceクラスに変換します。
	 *
	 * @param reader XML読込リーダ
	 * @param context
	 * @return EbsBlockDeviceオブジェクト
	 *
	 * @see com.thoughtworks.xstream.converters.Converter#unmarshal(HierarchicalStreamReader, UnmarshallingContext)
	 */
	@Override
	public Object unmarshal(HierarchicalStreamReader reader, UnmarshallingContext context) {
		EbsBlockDevice ebsBlockDevice = new EbsBlockDevice();

		String name = null;
		while(reader.hasMoreChildren()) {
			reader.moveDown();

			name = reader.getNodeName();
			if (name.equals(ELEMENT_SNAPSHOT_ID)) {
				ebsBlockDevice.setSnapshotId(reader.getValue());
			}
			else if (name.equals(ELEMENT_VOLUME_SIZE)) {
				ebsBlockDevice.setVolumeSize( new Integer(reader.getValue()) );
			}
			else if (name.equals(ELEMENT_DISK_TYPE)) {
				ebsBlockDevice.setDiskType(reader.getValue());
			}
			else if (name.equals(ELEMENT_DELETE_ON_TERMINATION)) {
				ebsBlockDevice.setDeleteOnTermination(Boolean.valueOf(reader.getValue()));
			}

			reader.moveUp();

		}

		return ebsBlockDevice;
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
