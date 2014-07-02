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


import java.util.ArrayList;
import java.util.List;

import com.nifty.cloud.sdk.image.model.BlockDeviceMapping;
import com.nifty.cloud.sdk.image.model.GlobalPlacement;
import com.nifty.cloud.sdk.image.model.Image;
import com.nifty.cloud.sdk.image.model.ProductCode;
import com.nifty.cloud.sdk.image.model.StateReason;
import com.thoughtworks.xstream.converters.Converter;
import com.thoughtworks.xstream.converters.MarshallingContext;
import com.thoughtworks.xstream.converters.UnmarshallingContext;
import com.thoughtworks.xstream.io.HierarchicalStreamReader;
import com.thoughtworks.xstream.io.HierarchicalStreamWriter;

/**
 * DescribeImagesResponseInfoType変換クラス。<br />
 * このクラスはレスポンスXMLのimagesSet要素からImageクラスのリストを生成します。
 */
public class DescribeImagesConverter implements Converter {

	private static final String ELEMENT_IMAGE_ID             = "imageId";
	private static final String ELEMENT_IMAGE_LOCATION       = "imageLocation";
	private static final String ELEMENT_IMAGE_STATE          = "imageState";
	private static final String ELEMENT_IMAGE_OWNER_ID       = "imageOwnerId";
	private static final String ELEMENT_ID_PUBLIC            = "isPublic";
	private static final String ELEMENT_PRODUCT_CODES        = "productCodes";
	private static final String ELEMENT_ARCHITECTURE         = "architecture";
	private static final String ELEMENT_IMAGE_TYPE           = "imageType";
	private static final String ELEMENT_KERNEL_ID            = "kernelId";
	private static final String ELEMENT_RAMDISK_ID           = "ramdiskId";
	private static final String ELEMENT_PLATFORM             = "platform";
	private static final String ELEMENT_STATE_REASON         = "stateReason";
	private static final String ELEMENT_IMAGE_OWNER_ALIAS    = "imageOwnerAlias";
	private static final String ELEMENT_NAME                 = "name";
	private static final String ELEMENT_DESCRIPTION          = "description";
	private static final String ELEMENT_DETAIL_DESCRIPTION   = "detailDescription";
	private static final String ELEMENT_REDISTRIBUTABLE      = "redistributable";
	private static final String ELEMENT_PLACEMENT            = "placement";
	private static final String ELEMENT_ROOT_DEVICE_TYPE     = "rootDeviceType";
	private static final String ELEMENT_ROOT_DEVICE_NAME     = "rootDeviceName";
	private static final String ELEMENT_BLOCK_DEVICE_MAPPING = "blockDeviceMapping";

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
	 * {@literal
	 * imagesSet要素をList<Image>クラスに変換します。}
	 *
	 * @param reader XML読込リーダ
	 * @param context
	 * @return {@literal List<Image>オブジェクト}
	 *
	 * @see com.thoughtworks.xstream.converters.Converter#unmarshal(HierarchicalStreamReader, UnmarshallingContext)
	 */
	@SuppressWarnings("unchecked")
	@Override
	public Object unmarshal(HierarchicalStreamReader reader, UnmarshallingContext context) {
		List<Image> images = new ArrayList<Image>();
		Converter productCodeConverter = new ProductCodesSetConverter();
		Converter stateReasonConverter = new StateReasonConverter();
		Converter placementConverter   = new PlacementConverter();
		Converter blockDeviceConverter = new BlockDeviceMappingConverter();
		String name = null;

		while(reader.hasMoreChildren()) {
			reader.moveDown();
			Image image = new Image();
			while (reader.hasMoreChildren()) {
				reader.moveDown();

				name = reader.getNodeName();
				if (name.equals(ELEMENT_IMAGE_ID)) {
					image.setImageId(reader.getValue());
				}
				else if (name.equals(ELEMENT_IMAGE_LOCATION)) {
					image.setImageLocation(reader.getValue());
				}
				else if (name.equals(ELEMENT_IMAGE_STATE)) {
					image.setState(reader.getValue());
				}
				else if (name.equals(ELEMENT_IMAGE_OWNER_ID)) {
					image.setOwnerId(reader.getValue());
				}
				else if (name.equals(ELEMENT_ID_PUBLIC)) {
					image.setPublicValue(Boolean.valueOf(reader.getValue()));
				}
				else if (name.equals(ELEMENT_PRODUCT_CODES)) {
					image.setProductCodes((List<ProductCode>) productCodeConverter.unmarshal(reader, context));
				}
				else if (name.equals(ELEMENT_ARCHITECTURE)) {
					image.setArchitecture(reader.getValue());
				}
				else if (name.equals(ELEMENT_IMAGE_TYPE)) {
					image.setImageType(reader.getValue());
				}
				else if (name.equals(ELEMENT_KERNEL_ID)) {
					image.setKernelId(reader.getValue());
				}
				else if (name.equals(ELEMENT_RAMDISK_ID)) {
					image.setRamdiskId(reader.getValue());
				}
				else if (name.equals(ELEMENT_PLATFORM)) {
					image.setPlatform(reader.getValue());
				}
				else if (name.equals(ELEMENT_STATE_REASON)) {
					image.setStateReason((StateReason) stateReasonConverter.unmarshal(reader, context));
				}
				else if (name.equals(ELEMENT_IMAGE_OWNER_ALIAS)) {
					image.setImageOwnerAlias(reader.getValue());
				}
				else if (name.equals(ELEMENT_NAME)) {
					image.setName(reader.getValue());
				}
				else if (name.equals(ELEMENT_DESCRIPTION)) {
					image.setDescription(reader.getValue());
				}
				else if (name.equals(ELEMENT_DETAIL_DESCRIPTION)) {
					image.setDetailDescription(reader.getValue());
				}
				else if (name.equals(ELEMENT_REDISTRIBUTABLE)) {
					image.setRedistributable(Boolean.valueOf(reader.getValue()));
				}
				else if (name.equals(ELEMENT_PLACEMENT)) {
					image.setPlacement((GlobalPlacement) placementConverter.unmarshal(reader, context));
				}
				else if (name.equals(ELEMENT_ROOT_DEVICE_TYPE)) {
					image.setRootDeviceType(reader.getValue());
				}
				else if (name.equals(ELEMENT_ROOT_DEVICE_NAME)) {
					image.setRootDeviceName(reader.getValue());
				}
				else if (name.equals(ELEMENT_BLOCK_DEVICE_MAPPING)) { //converter
					image.setBlockDeviceMappings((List<BlockDeviceMapping>) blockDeviceConverter.unmarshal(reader, context));
				}
				reader.moveUp();
			}
			images.add(image);
			reader.moveUp();
		}

		return images;
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
