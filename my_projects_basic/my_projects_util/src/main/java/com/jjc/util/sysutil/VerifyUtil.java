package com.jjc.util.sysutil;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Optional;

/**
 * 验证工具类
 * @Title:
 * @Description:
 * @Company:
 * @Author:yctong
 * @Created Date:2020年4月23日
 */
public class VerifyUtil {

	public static String toString(Object object) {
		return object == null ? "" : object.toString();
	}

	/**
	 * 获取list第一个元素，如果list为null，则返回null
	 * @param list list
	 * @param <T> list泛型
	 * @return 第一个元素
	 */
	public static <T> Optional<T> listOptional(List<T> list){
		if (list != null && list.size() > 0){
			return  Optional.of(list.get(0));
		}
		return Optional.empty();
	}

	@SuppressWarnings("rawtypes")
	public static boolean isEmpty(Collection collection) {
		return collection == null || collection.isEmpty();
	}

	@SuppressWarnings("rawtypes")
	public static boolean isEmpty(Map map) {
		return map == null || map.isEmpty();
	}

	public static boolean isEmpty(String string) {
		return toString(string).trim().isEmpty();
	}

	public static boolean isEmptyTrim(String string) {
		return toString(string).trim().isEmpty();
	}

	public static boolean isEmpty(Object object) {
		return toString(object).isEmpty();
	}

	public static boolean isEmptyTrim(Object object) {
		return toString(object).trim().isEmpty();
	}

	public static <T> boolean isEmpty(T[] array) {
		return array == null || array.length == 0;
	}
}
