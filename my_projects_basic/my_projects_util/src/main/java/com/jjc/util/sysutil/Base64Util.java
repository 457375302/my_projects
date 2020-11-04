package com.jjc.util.sysutil;

import java.io.UnsupportedEncodingException;

public class Base64Util {

	/**
	 * 编码字符串
	 * @param source
	 * @return
	 */
	public static String encode(String source) {
		try {
			byte[] sourceBs = source.getBytes("UTF-8");
			byte[] targetBs = Base64.encodeBase64(sourceBs);
			return new String(targetBs, "UTF-8");
		} catch (UnsupportedEncodingException e) {
			throw new RuntimeException(e);
		}
	}

	/**
	 * 解码字符串
	 * @param target
	 * @return
	 */
	public static String decode(String target) {
		try {
			byte[] targetBs = target.getBytes("UTF-8");
			byte[] sourceBs = Base64.decodeBase64(targetBs);
			return new String(sourceBs, "UTF-8");
		} catch (UnsupportedEncodingException e) {
			throw new RuntimeException(e);
		}
	}

	private Base64Util() {
	}

}
