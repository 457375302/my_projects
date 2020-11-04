package com.jjc.util.sysutil;

import java.util.Random;

public class NumCode {

	/**
	 * 获取区间随机数
	 * @param min
	 * @param max
	 * @return
	 */
	public static int getRandom(int min, int max) {
		int r = new Random().nextInt(max - min);
		return r + min;
	}

	/**
	 * 获取4位最大最小区间数
	 * @return
	 */
	public static int get4MinOrMax() {
		int ran = (int) (Math.random() * 9000) + 1000;
		return ran;
	}

	/**
	 * 获取6位最大最小区间数
	 * @return
	 */
	public static int get6MinOrMax() {
		int ran = (int) (Math.random() * 900000) + 100000;
		return ran;
	}

	/**
	 * 获取四位随机编号
	 * @return
	 */
	public static int get4NumCode() {
		int avg = 0;
		int min = get4MinOrMax();
		int max = get4MinOrMax();

		if (min > max) {
			avg = max;
			max = min;
			min = avg;
		}

		return getRandom(min, max);
	}

	/**
	 * 获取六位随机编号
	 * @return
	 */
	public static int get6NumCode() {
		int avg = 0;
		int min = get6MinOrMax();
		int max = get6MinOrMax();

		if (min > max) {
			avg = max;
			max = min;
			min = avg;
		}

		return getRandom(min, max);
	}

}
