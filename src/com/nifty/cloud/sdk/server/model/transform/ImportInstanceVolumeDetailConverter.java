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

import java.util.ArrayList;
import java.util.List;

import com.nifty.cloud.sdk.server.model.DiskImageDescription;
import com.nifty.cloud.sdk.server.model.DiskImageVolumeDescription;
import com.nifty.cloud.sdk.server.model.ImportInstanceVolumeDetail;
import com.thoughtworks.xstream.converters.Converter;
import com.thoughtworks.xstream.converters.MarshallingContext;
import com.thoughtworks.xstream.converters.UnmarshallingContext;
import com.thoughtworks.xstream.io.HierarchicalStreamReader;
import com.thoughtworks.xstream.io.HierarchicalStreamWriter;

/**
 * ImportInstanceVolumeDetail変換クラス。<br />
 * このクラスはレスポンスXMLのvolumes要素からImportInstanceVolumeDetailクラスのリストを生成します。
 *
 */
public class ImportInstanceVolumeDetailConverter implements Converter {

	private static final String ELEMENT_BYTES_CONVERTED = "bytesConverted";
	private static final String ELEMENT_AVAILABILITY_ZONE = "availabilityZone";
	private static final String ELEMENT_IMAGE = "image";
	private static final String ELEMENT_DESCRIPTION = "description";
	private static final String ELEMENT_VOLUME = "volume";
	private static final String ELEMENT_STATUS = "status";
	private static final String ELEMENT_STATUS_MESSAGE = "statusMessage";

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
		for (Class<?> i : clazz.getInterfaces()) {
			if (i == List.class) return true;
		}
		return false;
	}

	/**
	 * {@literal
	 * volumeをList<ImportInstanceVolumeDetail>クラスに変換します。}
	 *
	 * @param reader XML読込リーダ
	 * @param context
	 * @return {@literal List<ImportInstanceVolumeDetail>オブジェクト}
	 *
	 * @see com.thoughtworks.xstream.converters.Converter#unmarshal(HierarchicalStreamReader, UnmarshallingContext)
	 */
	@Override
	public Object unmarshal(HierarchicalStreamReader reader, UnmarshallingContext context) {
		List<ImportInstanceVolumeDetail> list = new ArrayList<ImportInstanceVolumeDetail>();
		DiskImageDescriptionConverter imageConverter = new DiskImageDescriptionConverter();
		DiskImageVolumeDescriptionConverter imageVolumeConverter = new DiskImageVolumeDescriptionConverter();

		String name = null;
		while (reader.hasMoreChildren()) {
			reader.moveDown();
			ImportInstanceVolumeDetail importInstanceVolume = new ImportInstanceVolumeDetail();
			while (reader.hasMoreChildren()) {
				reader.moveDown();
				name = reader.getNodeName();
				if (ELEMENT_BYTES_CONVERTED.equals(name)) {
					importInstanceVolume.setBytesConverted(new Long(reader.getValue()));
				} else if (ELEMENT_AVAILABILITY_ZONE.equals(name)) {
					importInstanceVolume.setAvailabilityZone(reader.getValue());
				} else if (ELEMENT_IMAGE.equals(name)) {
					importInstanceVolume.setImage((DiskImageDescription)imageConverter.unmarshal(reader, context));
				} else if (ELEMENT_DESCRIPTION.equals(name)) {
					importInstanceVolume.setDescription(reader.getValue());
				} else if (ELEMENT_VOLUME.equals(name)) {
					importInstanceVolume.setVolume((DiskImageVolumeDescription)imageVolumeConverter.unmarshal(reader, context));
				} else if (ELEMENT_STATUS.equals(name)) {
					importInstanceVolume.setStatus(reader.getValue());
				} else if (ELEMENT_STATUS_MESSAGE.equals(name)) {
					importInstanceVolume.setStatusMessage(reader.getValue());
				}

				reader.moveUp();
			}
			list.add(importInstanceVolume);
			reader.moveUp();
		}


		return list;
	}

	/**
	 * 未実装メソッド
	 */
	@Override
	public void marshal(Object source, HierarchicalStreamWriter writer, MarshallingContext context) {

	}
}
