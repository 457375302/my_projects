package com.jjc.util.sysutil;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Hashtable;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 格式验证工具
 * @Title:
 * @Description:
 * @Company:
 * @Author:yctong
 * @Created Date:2020年4月23日
 */
public class DataValidator {
	/** 整数 */
	private static final String V_INTEGER = "^-?[1-9]\\d*$";

	/** 正整数 */
	private static final String V_Z_INDEX = "^[1-9]\\d*$";

	/** 负整数 */
	private static final String V_NEGATIVE_INTEGER = "^-[1-9]\\d*$";

	/** 数字 */
	private static final String V_NUMBER = "^([+-]?)\\d*\\.?\\d+$";

	/** 正数 */
	private static final String V_POSITIVE_NUMBER = "^[1-9]\\d*|0$";

	/** 负数 */
	private static final String V_NEGATINE_NUMBER = "^-[1-9]\\d*|0$";

	/** 浮点数 */
	private static final String V_FLOAT = "^([+-]?)\\d*\\.\\d+$";

	/** 正浮点数 */
	private static final String V_POSTTIVE_FLOAT = "^[1-9]\\d*.\\d*|0.\\d*[1-9]\\d*$";

	/** 负浮点数 */
	private static final String V_NEGATIVE_FLOAT = "^-([1-9]\\d*.\\d*|0.\\d*[1-9]\\d*)$";

	/** 非负浮点数（正浮点数 + 0） */
	private static final String V_UNPOSITIVE_FLOAT = "^[1-9]\\d*.\\d*|0.\\d*[1-9]\\d*|0?.0+|0$";

	/** 非正浮点数（负浮点数 + 0） */
	private static final String V_UN_NEGATIVE_FLOAT = "^(-([1-9]\\d*.\\d*|0.\\d*[1-9]\\d*))|0?.0+|0$";

	/** 邮件 */
	private static final String V_EMAIL = "^\\w+((-\\w+)|(\\.\\w+))*\\@[A-Za-z0-9]+((\\.|-)[A-Za-z0-9]+)*\\.[A-Za-z0-9]+$";

	/** 颜色 */
	private static final String V_COLOR = "^[a-fA-F0-9]{6}$";

	/** url */
	private static final String V_URL = "^http[s]?:\\/\\/([\\w-]+\\.)+[\\w-]+([\\w-./?%&=]*)?$";

	/** 仅中文 */
	private static final String V_CHINESE = "^[\\u4E00-\\u9FA5\\uF900-\\uFA2D]+$";

	/** 仅ACSII字符 */
	private static final String V_ASCII = "^[\\x00-\\xFF]+$";

	/** 邮编 */
	private static final String V_ZIPCODE = "^\\d{6}$";

	/** 手机 */
	private static final String V_MOBILE = "^(1)[0-9]{10}$";

	/** ip地址 */
	private static final String V_IP4 = "^(25[0-5]|2[0-4]\\d|[0-1]\\d{2}|[1-9]?\\d)\\.(25[0-5]|2[0-4]\\d|[0-1]\\d{2}|[1-9]?\\d)\\.(25[0-5]|2[0-4]\\d|[0-1]\\d{2}|[1-9]?\\d)\\.(25[0-5]|2[0-4]\\d|[0-1]\\d{2}|[1-9]?\\d)$";

	/** 非空 */
	private static final String V_NOTEMPTY = "^\\S+$";

	/** 图片 */
	private static final String V_PICTURE = "(.*)\\.(jpg|bmp|gif|ico|pcx|jpeg|tif|png|raw|tga)$";

	/** 压缩文件 */
	private static final String V_RAR = "(.*)\\.(rar|zip|7zip|tgz)$";

	/** 日期 */
	private static final String V_DATE = "^((((1[6-9]|[2-9]\\d)\\d{2})-(0?[13578]|1[02])-(0?[1-9]|[12]\\d|3[01]))|(((1[6-9]|[2-9]\\d)\\d{2})-(0?[13456789]|1[012])-(0?[1-9]|[12]\\d|30))|(((1[6-9]|[2-9]\\d)\\d{2})-0?2-(0?[1-9]|1\\d|2[0-8]))|(((1[6-9]|[2-9]\\d)(0[48]|[2468][048]|[13579][26])|((16|[2468][048]|[3579][26])00))-0?2-29-)) (20|21|22|23|[0-1]?\\d):[0-5]?\\d:[0-5]?\\d$";

	/** QQ号码 */
	private static final String V_QQ_NUMBER = "^[1-9]*[1-9][0-9]*$";

	/** 电话号码的函数(包括验证国内区号,国际区号,分机号) */
	private static final String V_TEL = "^(([0\\+]\\d{2,3}-)?(0\\d{2,3})-)?(\\d{7,8})(-(\\d{3,}))?$";

	/** 用来用户注册。匹配由数字、26个英文字母或者下划线组成的字符串 */
	private static final String V_USERNAME = "^\\w+$";

	/** 字母 */
	private static final String V_LETTER = "^[A-Za-z]+$";

	/** 大写字母 */
	private static final String V_LETTER_U = "^[A-Z]+$";

	/** 小写字母 */
	private static final String V_LETTER_I = "^[a-z]+$";

	/** 身份证 */
	private static final String V_IDCARD = "^(\\d{15}$|^\\d{18}$|^\\d{17}(\\d|X|x))$";

	/** 验证密码(数字和英文同时存在) */
	private static final String V_PASSWORD_REG = "[A-Za-z]+[0-9]";

	/** 验证密码长度(6-18位) */
	private static final String V_PASSWORD_LENGTH = "^\\d{6,18}$";

	/** 验证两位数 */
	private static final String V_TWO＿POINT = "^[0-9]+(.[0-9]{2})?$";

	/** 验证一个月的31天 */
	private static final String V_31DAYS = "^((0?[1-9])|((1|2)[0-9])|30|31)$";

	private DataValidator() {
	}

	/**
	 * 验证是不是整数
	 * @param value 要验证的字符串 要验证的字符串
	 * @return 如果是符合格式的字符串,返回 <b>true </b>,否则为 <b>false </b>
	 */
	public static boolean Integer(String value) {
		return match(V_INTEGER, value);
	}

	/**
	 * 验证是不是正整数
	 * @param value 要验证的字符串
	 * @return 如果是符合格式的字符串,返回 <b>true </b>,否则为 <b>false </b>
	 */
	public static boolean Z_index(String value) {
		return match(V_Z_INDEX, value);
	}

	/**
	 * 验证是不是负整数
	 * @param value 要验证的字符串
	 * @return 如果是符合格式的字符串,返回 <b>true </b>,否则为 <b>false </b>
	 */
	public static boolean Negative_integer(String value) {
		return match(V_NEGATIVE_INTEGER, value);
	}

	/**
	 * 验证是不是数字
	 * @param value 要验证的字符串
	 * @return 如果是符合格式的字符串,返回 <b>true </b>,否则为 <b>false </b>
	 */
	public static boolean Number(String value) {
		return match(V_NUMBER, value);
	}

	/**
	 * 验证是不是正数
	 * @param value 要验证的字符串
	 * @return 如果是符合格式的字符串,返回 <b>true </b>,否则为 <b>false </b>
	 */
	public static boolean PositiveNumber(String value) {
		return match(V_POSITIVE_NUMBER, value);
	}

	/**
	 * 验证是不是负数
	 * @param value 要验证的字符串
	 * @return 如果是符合格式的字符串,返回 <b>true </b>,否则为 <b>false </b>
	 */
	public static boolean NegatineNumber(String value) {
		return match(V_NEGATINE_NUMBER, value);
	}

	/**
	 * 验证一个月的31天
	 * @param value 要验证的字符串
	 * @return 如果是符合格式的字符串,返回 <b>true </b>,否则为 <b>false </b>
	 */
	public static boolean Is31Days(String value) {
		return match(V_31DAYS, value);
	}

	/**
	 * 验证是不是ASCII
	 * @param value 要验证的字符串
	 * @return 如果是符合格式的字符串,返回 <b>true </b>,否则为 <b>false </b>
	 */
	public static boolean ASCII(String value) {
		return match(V_ASCII, value);
	}

	/**
	 * 验证是不是中文
	 * @param value 要验证的字符串
	 * @return 如果是符合格式的字符串,返回 <b>true </b>,否则为 <b>false </b>
	 */
	public static boolean Chinese(String value) {
		return match(V_CHINESE, value);
	}

	/**
	 * 验证是不是颜色
	 * @param value 要验证的字符串
	 * @return 如果是符合格式的字符串,返回 <b>true </b>,否则为 <b>false </b>
	 */
	public static boolean Color(String value) {
		return match(V_COLOR, value);
	}

	/**
	 * 验证是不是日期
	 * @param value 要验证的字符串
	 * @return 如果是符合格式的字符串,返回 <b>true </b>,否则为 <b>false </b>
	 */
	public static boolean Date(String value) {
		return match(V_DATE, value);
	}

	/**
	 * 验证是不是邮箱地址
	 * @param value 要验证的字符串
	 * @return 如果是符合格式的字符串,返回 <b>true </b>,否则为 <b>false </b>
	 */
	public static boolean Email(String value) {
		return match(V_EMAIL, value);
	}

	/**
	 * 验证是不是浮点数
	 * @param value 要验证的字符串
	 * @return 如果是符合格式的字符串,返回 <b>true </b>,否则为 <b>false </b>
	 */
	public static boolean Float(String value) {
		return match(V_FLOAT, value);
	}

	/**
	 * 验证是不是正确的身份证号码
	 * @param value 要验证的字符串
	 * @return 如果是符合格式的字符串,返回 <b>true </b>,否则为 <b>false </b>
	 */
	public static boolean IDcard(String value) {
		return match(V_IDCARD, value);
	}

	/**
	 * 验证是不是正确的IP地址
	 * @param value 要验证的字符串
	 * @return 如果是符合格式的字符串,返回 <b>true </b>,否则为 <b>false </b>
	 */
	public static boolean IP4(String value) {
		return match(V_IP4, value);
	}

	/**
	 * 验证是不是字母
	 * @param value 要验证的字符串
	 * @return 如果是符合格式的字符串,返回 <b>true </b>,否则为 <b>false </b>
	 */
	public static boolean Letter(String value) {
		return match(V_LETTER, value);
	}

	/**
	 * 验证是不是小写字母
	 * @param value 要验证的字符串
	 * @return 如果是符合格式的字符串,返回 <b>true </b>,否则为 <b>false </b>
	 */
	public static boolean Letter_i(String value) {
		return match(V_LETTER_I, value);
	}

	/**
	 * 验证是不是大写字母
	 * @param value 要验证的字符串
	 * @return 如果是符合格式的字符串,返回 <b>true </b>,否则为 <b>false </b>
	 */
	public static boolean Letter_u(String value) {
		return match(V_LETTER_U, value);
	}

	/**
	 * 验证是不是手机号码
	 * @param value 要验证的字符串
	 * @return 如果是符合格式的字符串,返回 <b>true </b>,否则为 <b>false </b>
	 */
	public static boolean Mobile(String value) {
		return match(V_MOBILE, value);
	}

	/**
	 * 验证是不是负浮点数
	 * @param value 要验证的字符串
	 * @return 如果是符合格式的字符串,返回 <b>true </b>,否则为 <b>false </b>
	 */
	public static boolean Negative_float(String value) {
		return match(V_NEGATIVE_FLOAT, value);
	}

	/**
	 * 验证非空
	 * @param value 要验证的字符串
	 * @return 如果是符合格式的字符串,返回 <b>true </b>,否则为 <b>false </b>
	 */
	public static boolean Notempty(String value) {
		return match(V_NOTEMPTY, value);
	}

	/**
	 * 验证密码的长度(6~18位)
	 * @param value 要验证的字符串
	 * @return 如果是符合格式的字符串,返回 <b>true </b>,否则为 <b>false </b>
	 */
	public static boolean Number_length(String value) {
		return match(V_PASSWORD_LENGTH, value);
	}

	/**
	 * 验证密码(数字和英文同时存在)
	 * @param value 要验证的字符串
	 * @return 如果是符合格式的字符串,返回 <b>true </b>,否则为 <b>false </b>
	 */
	public static boolean Password_reg(String value) {
		return match(V_PASSWORD_REG, value);
	}

	/**
	 * 验证图片
	 * @param value 要验证的字符串
	 * @return 如果是符合格式的字符串,返回 <b>true </b>,否则为 <b>false </b>
	 */
	public static boolean Picture(String value) {
		return match(V_PICTURE, value);
	}

	/**
	 * 验证正浮点数
	 * @param value 要验证的字符串
	 * @return 如果是符合格式的字符串,返回 <b>true </b>,否则为 <b>false </b>
	 */
	public static boolean Posttive_float(String value) {
		return match(V_POSTTIVE_FLOAT, value);
	}

	/**
	 * 验证QQ号码
	 * @param value 要验证的字符串
	 * @return 如果是符合格式的字符串,返回 <b>true </b>,否则为 <b>false </b>
	 */
	public static boolean QQnumber(String value) {
		return match(V_QQ_NUMBER, value);
	}

	/**
	 * 验证压缩文件
	 * @param value 要验证的字符串
	 * @return 如果是符合格式的字符串,返回 <b>true </b>,否则为 <b>false </b>
	 */
	public static boolean Rar(String value) {
		return match(V_RAR, value);
	}

	/**
	 * 验证电话
	 * @param value 要验证的字符串
	 * @return 如果是符合格式的字符串,返回 <b>true </b>,否则为 <b>false </b>
	 */
	public static boolean Tel(String value) {
		return match(V_TEL, value);
	}

	/**
	 * 验证两位小数
	 * @param value 要验证的字符串
	 * @return 如果是符合格式的字符串,返回 <b>true </b>,否则为 <b>false </b>
	 */
	public static boolean Two_point(String value) {
		return match(V_TWO＿POINT, value);
	}

	/**
	 * 验证非正浮点数
	 * @param value 要验证的字符串
	 * @return 如果是符合格式的字符串,返回 <b>true </b>,否则为 <b>false </b>
	 */
	public static boolean Un_negative_float(String value) {
		return match(V_UN_NEGATIVE_FLOAT, value);
	}

	/**
	 * 验证非负浮点数
	 * @param value 要验证的字符串
	 * @return 如果是符合格式的字符串,返回 <b>true </b>,否则为 <b>false </b>
	 */
	public static boolean Unpositive_float(String value) {
		return match(V_UNPOSITIVE_FLOAT, value);
	}

	/**
	 * 验证URL
	 * @param value 要验证的字符串
	 * @return 如果是符合格式的字符串,返回 <b>true </b>,否则为 <b>false </b>
	 */
	public static boolean Url(String value) {
		return match(V_URL, value);
	}

	/**
	 * 验证用户注册。匹配由数字、26个英文字母或者下划线组成的字符串
	 * @param value 要验证的字符串
	 * @return 如果是符合格式的字符串,返回 <b>true </b>,否则为 <b>false </b>
	 */
	public static boolean UserName(String value) {
		return match(V_USERNAME, value);
	}

	/**
	 * 验证邮编
	 * @param value 要验证的字符串
	 * @return 如果是符合格式的字符串,返回 <b>true </b>,否则为 <b>false </b>
	 */
	public static boolean Zipcode(String value) {
		return match(V_ZIPCODE, value);
	}

	/**
	 * @param regex 正则表达式字符串
	 * @param str 要匹配的字符串
	 * @return 如果str 符合 regex的正则表达式格式,返回true, 否则返回 false;
	 */
	private static boolean match(String regex, String str) {
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(str);
		return matcher.matches();
	}

	/**
	 * 判断用户输入的时间格式是否正确
	 */
	public static boolean checkDateTime(String inputDate) {
		String DATE_TIME_FORMAT = "yyyy-MM-dd";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(DATE_TIME_FORMAT, Locale.CHINA);
		simpleDateFormat.setLenient(false);
		boolean check = false;
		try {
			simpleDateFormat.parse(inputDate);
			check = true;
		} catch (Exception ex) {
			check = false;
			ex.printStackTrace();
		}

		return check;
	}

	/**
	 * 此方法判断输入字符是否为数字0-9 是返回true不是返回false
	 *
	 * @param c char
	 * @return boolean
	 */
	public static boolean isDigit(char c) {
		return (('0' <= c) && (c <= '9'));
	}

	public static boolean isDigit(String inputStr) {
		char tempChar;
		for (int i = 0; i < inputStr.length(); i++) {
			tempChar = inputStr.charAt(i);
			// 如果字符中有一个字符不是数字则返回false
			if (!isDigit(tempChar)) {
				return false;
			}
		}

		return true;
	}

	/**
	 * 此方法判断输入字符是否为字母a-z或A-Z 是返回true不是返回false
	 *
	 * @param c char
	 * @return boolean
	 */
	public static boolean isAlpha(char c) {
		return ((('a' <= c) && (c <= 'z')) || (('A' <= c) && (c <= 'Z')));
	}

	public static boolean isAlpha(String inputStr) {
		char tempChar;
		for (int i = 0; i < inputStr.length(); i++) {
			tempChar = inputStr.charAt(i);
			if (!isAlpha(tempChar)) { // 如果字符中有一个字符不是字母则返回false
				return false;
			}
		}

		return true;
	}

	/**
	 * 此方法用于检查密码或用户名是否合法，用户名密码只能使用英文字母、数字以及-和_，并且首字符必须为字母或数字 密码首字符必须为字母或数字
	 *
	 * @param inputStr 输入
	 * @return boolean
	 */
	public static boolean checkUserNamePassword(String inputStr) {
		for (int nIndex = 0; nIndex < inputStr.length(); nIndex++) {
			char cCheck = inputStr.charAt(nIndex);
			if (nIndex == 0 && (cCheck == '-' || cCheck == '_')) {
				return false;
			}
			if (!(isDigit(cCheck) || isAlpha(cCheck) || cCheck == '-' || cCheck == '_')) {
				return false;
			}
		}
		return true;
	}

	/**
	 * 此方法检查email有效性 返回提示信息
	 *
	 * @param email
	 * @return
	 */
	public static boolean checkEmail(String email) {
		// 电子邮件
		String check = "^([a-z0-9A-Z]+[-|\\.]?)+[a-z0-9A-Z]@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\.)+[a-zA-Z]{2,}$";
		Pattern regex = Pattern.compile(check);
		Matcher matcher = regex.matcher(email);
		boolean isMatched = matcher.matches();

		return isMatched;
	}

	/**
	 * 此方法检查输入的身份证号有效性 返回提示信息 如果返回布尔类型则通过验证
	 *
	 * @param IDNumber 身份证号
	 * @return String
	 */
	public static boolean checkIDNumber(String IDNumber) {
		boolean result = IDNumber.matches("[0-9]{15}|[0-9]{17}[0-9X]");
		if (result) {
			int year, month, date;
			if (IDNumber.length() == 15) {
				year = Integer.parseInt(IDNumber.substring(6, 8));
				month = Integer.parseInt(IDNumber.substring(8, 10));
				date = Integer.parseInt(IDNumber.substring(10, 12));
			} else {
				year = Integer.parseInt(IDNumber.substring(6, 10));
				month = Integer.parseInt(IDNumber.substring(10, 12));
				date = Integer.parseInt(IDNumber.substring(12, 14));
			}
			switch (month) {
			case 2:
				result = (date >= 1) && (year % 4 == 0 ? date <= 29 : date <= 28);
				break;
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				result = (date >= 1) && (date <= 31);
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				result = (date >= 1) && (date <= 31);
				break;
			default:
				result = false;
				break;
			}
		}
		return result;
	}

	/**
	 * 1、号码的结构 公民身份号码是特征组合码，由十七位数字本体码和一位校验码组成。排列顺序从左至右依次为：六位数字地址码，八位数字出生日期码， 三位数字顺序码和一位数字校验码。
	 *
	 * 2、地址码(前六位数） 表示编码对象常住户口所在县(市、旗、区)的行政区划代码，按GB/T2260的规定执行。
	 *
	 * 3、出生日期码（第七位至十四位） 表示编码对象出生的年、月、日，按GB/T7408的规定执行，年、月、日代码之间不用分隔符。
	 *
	 * 4、顺序码（第十五位至十七位） 表示在同一地址码所标识的区域范围内，对同年、同月、同日出生的人编定的顺序号，顺序码的奇数分配给男性，偶数分配给女性。
	 *
	 * 5、校验码（第十八位数） （1）十七位数字本体码加权求和公式 S = Sum(Ai * Wi), i = 0, , 16 ，先对前17位数字的权求和 Ai:表示第i位置上的身份证号码数字值 Wi:表示第i位置上的加权因子
	 * Wi: 7 9 10 5 8 4 2 1 6 3 7 9 10 5 8 4 2 （2）计算模 Y = mod(S, 11) （3）通过模得到对应的校验码 Y: 0 1 2 3 4 5 6 7 8 9 10 校验码: 1 0 X
	 * 9 8 7 6 5 4 3 2
	 *
	 */

	/**
	 * 判断手机号码是否合法
	 *
	 * @param handset 手机号
	 * @return 是否合法
	 */
	public static boolean isHandset(String handset) {
		try {
			if (!handset.substring(0, 1).equals("1")) {
				return false;
			}
			if (handset == null || handset.length() != 11) {
				return false;
			}
			// String check = "^[0123456789]+$";
			String check = "^1[3-8]\\d{9}$";
			Pattern regex = Pattern.compile(check);
			Matcher matcher = regex.matcher(handset);

			return matcher.matches();
		} catch (RuntimeException e) {
			e.printStackTrace();
			return false;
		}
	}

	/**
	 * 判断大陆地区固话及小灵通 区号：010,020,021,022,023,024,025,027,028,029
	 *
	 * @param tel 电话号码
	 * @return 是否合法
	 */
	public static boolean isTel(String tel) {
		try {
			String check = "^0(10|2[0-5789]|\\d{3})\\d{7,8}$";
			Pattern regex = Pattern.compile(check);
			Matcher matcher = regex.matcher(tel);

			return matcher.matches();
		} catch (RuntimeException e) {
			e.printStackTrace();
			return false;
		}
	}

	/**
	 * 验证是否包含中文
	 *
	 * @param str
	 * @return 是否包含中文:含有中文-true，没有中文-false
	 */
	public static boolean containChinese(String str) {
		// String check = "^[\u4e00-\u9fa5]{1,}$";

		String check = "^[\\u4e00-\\u9fa5]+?";

		Pattern regex = Pattern.compile(check);
		Matcher matcher = regex.matcher(str);

		return matcher.find();
	}

	/**
	 * 验证是否包含空格
	 *
	 * @param str
	 * @return 是否包含空格
	 */
	public static boolean containBlank(String str) {
		if (str.length() > str.replace(" ", "").length()) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * 验证用户名是否只含中英文和数字
	 *
	 * @param userName 用户名
	 * @return 是否合法
	 */
	public static boolean isUserName(String userName) {
		String check = "^[\\u4E00-\\u9FA5A-Za-z0-9]+$";
		Pattern regex = Pattern.compile(check);
		Matcher matcher = regex.matcher(userName);

		return matcher.matches();
	}

	/**
	 * 身份证的有效验证
	 *
	 * @param IDStr 身份证号
	 * @return 有效：true 无效：false
	 * @throws ParseException
	 */
	public boolean IDCardValidate(String IDStr) throws ParseException {
		String errorInfo = "";// 记录错误信息
		String[] ValCodeArr = { "1", "0", "x", "9", "8", "7", "6", "5", "4", "3", "2" };
		String[] Wi = { "7", "9", "10", "5", "8", "4", "2", "1", "6", "3", "7", "9", "10", "5", "8", "4", "2" };
		// String[] Checker = {"1","9","8","7","6","5","4","3","2","1","1"};
		String Ai = "";

		// ================ 号码的长度 15位或18位 ================
		if (IDStr.length() != 15 && IDStr.length() != 18) {
			errorInfo = "号码长度应该为15位或18位。";
			System.out.println(errorInfo);
			return false;
		}
		// =======================(end)========================

		// ================ 数字 除最后以为都为数字 ================
		if (IDStr.length() == 18) {
			Ai = IDStr.substring(0, 17);
		} else if (IDStr.length() == 15) {
			Ai = IDStr.substring(0, 6) + "19" + IDStr.substring(6, 15);
		}
		if (isNumeric(Ai) == false) {
			errorInfo = "15位号码都应为数字 ; 18位号码除最后一位外，都应为数字。";
			System.out.println(errorInfo);
			return false;
		}
		// =======================(end)========================

		// ================ 出生年月是否有效 ================
		String strYear = Ai.substring(6, 10);// 年份
		String strMonth = Ai.substring(10, 12);// 月份
		String strDay = Ai.substring(12, 14);// 月份

		if (isDate(strYear + "-" + strMonth + "-" + strDay) == false) {
			errorInfo = "生日无效。";
			System.out.println(errorInfo);
			return false;
		}

		GregorianCalendar gc = new GregorianCalendar();
		SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd");
		if ((gc.get(Calendar.YEAR) - Integer.parseInt(strYear)) > 150
				|| (gc.getTime().getTime() - s.parse(strYear + "-" + strMonth + "-" + strDay).getTime()) < 0) {
			errorInfo = "生日不在有效范围。";
			System.out.println(errorInfo);
			return false;
		}
		if (Integer.parseInt(strMonth) > 12 || Integer.parseInt(strMonth) == 0) {
			errorInfo = "月份无效";
			System.out.println(errorInfo);
			return false;
		}
		if (Integer.parseInt(strDay) > 31 || Integer.parseInt(strDay) == 0) {
			errorInfo = "日期无效";
			System.out.println(errorInfo);
			return false;
		}
		// =====================(end)=====================

		// ================ 地区码时候有效 ================
		Hashtable<String, String> h = GetAreaCode();
		if (h.get(Ai.substring(0, 2)) == null) {
			errorInfo = "地区编码错误。";
			System.out.println(errorInfo);
			return false;
		}
		// ==============================================

		// ================ 判断最后一位的值 ================
		int TotalmulAiWi = 0;
		for (int i = 0; i < 17; i++) {
			TotalmulAiWi = TotalmulAiWi + Integer.parseInt(String.valueOf(Ai.charAt(i))) * Integer.parseInt(Wi[i]);
		}
		int modValue = TotalmulAiWi % 11;
		String strVerifyCode = ValCodeArr[modValue];
		Ai = Ai + strVerifyCode;

		if (IDStr.length() == 18) {
			if (Ai.equals(IDStr) == false) {
				errorInfo = "身份证无效，最后一位字母错误";
				System.out.println(errorInfo);
				return false;
			}
		} else {
			System.out.println("所在地区:" + h.get(Ai.substring(0, 2).toString()));
			System.out.println("新身份证号:" + Ai);
			return true;
		}
		// =====================(end)=====================
		System.out.println("所在地区:" + h.get(Ai.substring(0, 2).toString()));
		return true;
	}

	/**
	 * ====================================================================== 功能：设置地区编码
	 *
	 * @return Hashtable 对象
	 */
	private Hashtable<String, String> GetAreaCode() {
		Hashtable<String, String> hashtable = new Hashtable<String, String>();
		hashtable.put("11", "北京");
		hashtable.put("12", "天津");
		hashtable.put("13", "河北");
		hashtable.put("14", "山西");
		hashtable.put("15", "内蒙古");
		hashtable.put("21", "辽宁");
		hashtable.put("22", "吉林");
		hashtable.put("23", "黑龙江");
		hashtable.put("31", "上海");
		hashtable.put("32", "江苏");
		hashtable.put("33", "浙江");
		hashtable.put("34", "安徽");
		hashtable.put("35", "福建");
		hashtable.put("36", "江西");
		hashtable.put("37", "山东");
		hashtable.put("41", "河南");
		hashtable.put("42", "湖北");
		hashtable.put("43", "湖南");
		hashtable.put("44", "广东");
		hashtable.put("45", "广西");
		hashtable.put("46", "海南");
		hashtable.put("50", "重庆");
		hashtable.put("51", "四川");
		hashtable.put("52", "贵州");
		hashtable.put("53", "云南");
		hashtable.put("54", "西藏");
		hashtable.put("61", "陕西");
		hashtable.put("62", "甘肃");
		hashtable.put("63", "青海");
		hashtable.put("64", "宁夏");
		hashtable.put("65", "新疆");
		hashtable.put("71", "台湾");
		hashtable.put("81", "香港");
		hashtable.put("82", "澳门");
		hashtable.put("91", "国外");
		return hashtable;
	}

	/**
	 * ====================================================================== 功能：判断字符串是否为数字
	 *
	 * @param str
	 * @return
	 */
	private boolean isNumeric(String str) {
		Pattern pattern = Pattern.compile("[0-9]*");
		Matcher isNum = pattern.matcher(str);
		if (isNum.matches()) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * 功能：判断字符串是否为日期格式
	 *
	 * @param strDate 字符串
	 * @return
	 */
	public boolean isDate(String strDate) {
		Pattern pattern = Pattern
				.compile("^((\\d{2}(([02468][048])|([13579][26]))[\\-\\/\\s]?((((0?[13578])|(1[02]))[\\-\\/\\s]?((0?[1-9])|([1-2][0-9])|(3[01])))|(((0?[469])|(11))[\\-\\/\\s]?((0?[1-9])|([1-2][0-9])|(30)))|(0?2[\\-\\/\\s]?((0?[1-9])|([1-2][0-9])))))|(\\d{2}(([02468][1235679])|([13579][01345789]))[\\-\\/\\s]?((((0?[13578])|(1[02]))[\\-\\/\\s]?((0?[1-9])|([1-2][0-9])|(3[01])))|(((0?[469])|(11))[\\-\\/\\s]?((0?[1-9])|([1-2][0-9])|(30)))|(0?2[\\-\\/\\s]?((0?[1-9])|(1[0-9])|(2[0-8]))))))(\\s(((0?[0-9])|([1-2][0-3]))\\:([0-5]?[0-9])((\\s)|(\\:([0-5]?[0-9])))))?$");
		Matcher m = pattern.matcher(strDate);
		if (m.matches()) {
			return true;
		} else {
			return false;
		}

	}

	/**
	 * @param idCard 身份证号码
	 * @return 所在地区
	 */
	public String GetArea(String idCard) {
		Hashtable<String, String> ht = GetAreaCode();
		String area = ht.get(idCard.substring(0, 2));
		return area;
	}

	/**
	 * @param idCard 身份证号码
	 * @return 男或者女
	 */
	public String GetSex(String idCard) {
		String sex = "";
		if (idCard.length() == 15)
			sex = idCard.substring(idCard.length() - 3, idCard.length());

		if (idCard.length() == 18)
			sex = idCard.substring(idCard.length() - 4, idCard.length() - 1);

		System.out.println(sex);
		int sexNum = Integer.parseInt(sex) % 2;
		if (sexNum == 0) {
			return "女";
		}
		return "男";
	}

	/**
	 * ====================================================================== =功能:在判定已经是正确的身份证号码之后,查找出此人出生日期
	 *
	 * @param idCard 身份证号码
	 * @return 出生日期 XXXX MM-DD
	 */

	public String GetBirthday(String idCard) {
		String Ain = "";
		if (idCard.length() == 18) {
			Ain = idCard.substring(0, 17);
		} else if (idCard.length() == 15) {
			Ain = idCard.substring(0, 6) + "19" + idCard.substring(6, 15);
		}

		// ================ 出生年月是否有效 ================
		String strYear = Ain.substring(6, 10);// 年份
		String strMonth = Ain.substring(10, 12);// 月份
		String strDay = Ain.substring(12, 14);// 日期
		return strYear + "-" + strMonth + "-" + strDay;
	}
}