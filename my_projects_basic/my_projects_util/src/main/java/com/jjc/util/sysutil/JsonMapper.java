package com.jjc.util.sysutil;


import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

/**
 * json 格式转换
 * @Title:
 * @Description:
 * @Company:
 * @Author:yctong
 * @Created Date:2018年5月4日
 */
public class JsonMapper {

	private static Logger logger = LoggerFactory.getLogger(JsonMapper.class);

	private static ObjectMapper mapper = new ObjectMapper();

	public static <T> T fromJson(String jsonString, Class<T> clazz) {
		if (StringUtils.isEmpty(jsonString)) {
			return null;
		}
		try {
			return mapper.readValue(jsonString, clazz);
		} catch (IOException e) {
			logger.warn("parse json string error:" + jsonString, e);
		}
		return null;
	}

	public static <T> T fromJson(String jsonString, JavaType javaType) {
		if (StringUtils.isEmpty(jsonString)) {
			return null;
		}
		try {
			return mapper.readValue(jsonString, javaType);
		} catch (IOException e) {
			logger.warn("parse json string error:" + jsonString, e);
		}
		return null;
	}

	public static JavaType constructParametricType(Class<?> parametrized, Class<?>[] parameterClasses) {
		return mapper.getTypeFactory().constructParametricType(parametrized, parameterClasses);
	}

	public static String toJson(Object object) {
		try {
			// mapper.setSerializationInclusion(Include.NON_EMPTY);

			return mapper.writeValueAsString(object);
		} catch (IOException e) {
			logger.warn("write to json string error:" + object, e);
		}
		return null;
	}

	static {
		mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		mapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
	}
}
