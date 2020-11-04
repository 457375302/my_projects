package com.jjc.util.sysutil;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.*;

/**
 * 时间格式转换
 * @Title:
 * @Description:
 * @Company:
 * @Author:yctong
 * @Created Date:2020年4月23日
 */
public class DateUtil {

	protected static final transient Log log = LogFactory.getLog(DateUtil.class);

	private static final int[] dayArray = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	public static final String FORMAT_SIMPE = "yyyy-MM-dd HH:mm:ss";
	public static final String FORMAT_DATE = "yyyy-MM-dd";
	public static final String FORMAT_TIME = "HH:mm:ss";
	public static final int HOUR = 10;
	public static final int DAY = 11;
	public static final int MINUTE = 12;
	public static final int SECOND = 13;
	public static final int MILLISECOND = 14;
	public static long millionSecondsOfDay = 86400000L;

	/** 根据时间生成编号 */
	public static final String createSon = "yyyyMMddHHmmss";

	/** 根据时间生成编号 */
	public static final String createSon2 = "yyMMddHHmmss";

	public static java.sql.Date convertUtilDateToSQLDate(Date date) {
		if (date == null)
			return null;
		Calendar cl = Calendar.getInstance();

		cl.setTime(date);
		java.sql.Date jd = new java.sql.Date(cl.getTimeInMillis());
		return jd;
	}

	public static Date convertSQLDateToUtilDate(java.sql.Date date) {
		if (date == null)
			return null;
		Calendar cl = Calendar.getInstance();

		cl.setTime(date);
		Date jd = new Date(cl.getTimeInMillis());
		return jd;
	}

	public static Date stringToDate(String date) {
		if ((date == null) || ("".equalsIgnoreCase(date))) {
			return null;
		}
		Calendar cd = Calendar.getInstance();
		StringTokenizer token = new StringTokenizer(date, "-/ :.");
		if (token.hasMoreTokens())
			cd.set(1, Integer.parseInt(token.nextToken()));
		else {
			cd.set(1, 1970);
		}
		if (token.hasMoreTokens())
			cd.set(2, Integer.parseInt(token.nextToken()) - 1);
		else {
			cd.set(2, 0);
		}
		if (token.hasMoreTokens())
			cd.set(5, Integer.parseInt(token.nextToken()));
		else {
			cd.set(5, 1);
		}
		if (token.hasMoreTokens())
			cd.set(11, Integer.parseInt(token.nextToken()));
		else {
			cd.set(11, 0);
		}
		if (token.hasMoreTokens())
			cd.set(12, Integer.parseInt(token.nextToken()));
		else {
			cd.set(12, 0);
		}
		if (token.hasMoreTokens())
			cd.set(13, Integer.parseInt(token.nextToken()));
		else {
			cd.set(13, 0);
		}
		if (token.hasMoreTokens())
			cd.set(14, Integer.parseInt(token.nextToken()));
		else {
			cd.set(14, 0);
		}

		return cd.getTime();
	}

	public static String dateToString(Date date) {
		if (date == null)
			return "";
		Calendar cl = Calendar.getInstance();
		cl.setTime(date);
		return cl.get(1) + "-" + (cl.get(2) + 1) + "-" + cl.get(5);
	}

	public static String dateTo0String(Date date) {
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		return formatter.format(date).trim();
	}

	public static Date getFirstDateOfCurrentMonth() {
		Calendar cl = Calendar.getInstance();
		cl.set(5, 1);
		return cl.getTime();
	}

	public static Date getFirstDateOfMonth(String date) {
		Calendar cl = Calendar.getInstance();
		cl.setTime(stringToDate(date));
		cl.set(5, 1);
		return cl.getTime();
	}

	public static Date getLastDateOfMonth(String date) {
		Calendar cl = Calendar.getInstance();
		cl.setTime(stringToDate(date));
		int year = cl.get(1);
		int month = cl.get(2) + 1;
		int day = 0;
		if ((month < 1) || (month > 12)) {
			return null;
		}

		if (month == 2) {
			if (isLeapYear(year))
				day = 29;
			else
				day = dayArray[(month - 1)];
		} else {
			day = dayArray[(month - 1)];
		}

		cl.set(5, day);

		return cl.getTime();
	}

	public static boolean isLeapYear(int year) {
		if (year % 400 == 0)
			return true;
		if (year % 4 == 0) {
			return year % 100 != 0;
		}

		return false;
	}

	public static Date getDateTimeBeforeNow(int type, int value) {
		return getDateTimeBefore(new Date(), type, value);
	}

	public static Date getDateTimeBefore(Date date, int type, int value) {
		long time = date.getTime() / 1000L;

		switch (type) {
		case 11:
			time -= 86400 * value;
			break;
		case 10:
			time -= 3600 * value;
			break;
		case 12:
			time -= 60 * value;
			break;
		case 13:
			time -= value;
		}

		return new Date(time * 1000L);
	}

	public static Date getDateTimeAfterNow(int type, long value) {
		return getDateTimeAfter(new Date(), type, value);
	}

	public static Date getDateTimeAfter(Date date, int type, long value) {
		long nextTime = date.getTime() / 1000L;

		switch (type) {
		case 11:
			nextTime += 86400L * value;
			break;
		case 10:
			nextTime += 3600L * value;
			break;
		case 12:
			nextTime += 60L * value;
			break;
		case 13:
			nextTime += value;
		}

		return new Date(nextTime * 1000L);
	}

	public static Date getNextDate(String date) {
		Calendar cd = Calendar.getInstance();
		StringTokenizer token = new StringTokenizer(date, "-/ :.");
		if (token.hasMoreTokens())
			cd.set(1, Integer.parseInt(token.nextToken()));
		else {
			cd.set(1, 1970);
		}
		if (token.hasMoreTokens())
			cd.set(2, Integer.parseInt(token.nextToken()) - 1);
		else {
			cd.set(2, 0);
		}
		if (token.hasMoreTokens())
			cd.set(5, Integer.parseInt(token.nextToken()));
		else {
			cd.set(5, 1);
		}
		if (token.hasMoreTokens())
			cd.set(11, Integer.parseInt(token.nextToken()));
		else {
			cd.set(11, 0);
		}
		if (token.hasMoreTokens())
			cd.set(12, Integer.parseInt(token.nextToken()));
		else {
			cd.set(12, 0);
		}
		if (token.hasMoreTokens())
			cd.set(13, Integer.parseInt(token.nextToken()));
		else {
			cd.set(13, 0);
		}
		if (token.hasMoreTokens())
			cd.set(14, Integer.parseInt(token.nextToken()));
		else {
			cd.set(14, 0);
		}

		long nextTime = cd.getTimeInMillis() + 86400000L;
		return new Date(nextTime);
	}

	public static boolean isToday(Date date) {
		Calendar today = Calendar.getInstance();
		today.setTime(new Date());
		Calendar day = Calendar.getInstance();
		day.setTime(date);

		return (today.get(1) == day.get(1)) && (today.get(2) == day.get(2)) && (today.get(5) == day.get(5));
	}

	public static Date StringToDate(String sDate, int nFormat) {
		Date resDate = new Date();
		try {
			if ((sDate == null) || (sDate.equals(""))) {
				return null;
			}

			String sFormat = "";

			if (nFormat == 1)
				sFormat = "yyyy-MM-dd";
			else if (nFormat == 2)
				sFormat = "yyyy-MM-dd HH:mm:ss";
			else if (nFormat == 3)
				sFormat = "yyyy年MM月";
			else if (nFormat == 4)
				sFormat = "yyyy-MM-dd HH:mm";
			else if (nFormat == 5)
				sFormat = "HH:mm:ss";
			else {
				sFormat = "yyyy-MM-dd";
			}

			SimpleDateFormat simDateFormat = new SimpleDateFormat(sFormat);
			resDate = simDateFormat.parse(sDate);
		} catch (Exception e) {
			log.error("", e);
			return null;
		}
		return resDate;
	}

	public static String DateToString(Date dDate, int nFormat) {
		String resString = "";
		try {
			String sFormat = "";

			if (nFormat == 1)
				sFormat = "yyyy-MM-dd";
			else if (nFormat == 2)
				sFormat = "yyyy-MM-dd HH:mm:ss";
			else if (nFormat == 3)
				sFormat = "yyyy-MM-dd EEE";
			else if (nFormat == 4) {
				sFormat = "yyyy-MM-dd HH:mm";
			} else {
				sFormat = "yyyy-MM-dd";
			}

			SimpleDateFormat simDateFormat = new SimpleDateFormat(sFormat);
			resString = simDateFormat.format(dDate);
		} catch (Exception e) {
			return resString;
		}
		return resString;
	}

	public static int getDay(Date date1, Date date2) {
		Long d2 = Long.valueOf(date2.getTime());
		Long d1 = Long.valueOf(date1.getTime());
		return (int) ((d2.longValue() - d1.longValue()) / millionSecondsOfDay);
	}

	public static Date addDay(Date date, int days) {
		Calendar c = new GregorianCalendar();
		c.setTime(date);
		c.add(5, days);
		return c.getTime();
	}

	public static String format(Date date, String formater) {
		SimpleDateFormat sdf = new SimpleDateFormat(formater);
		return sdf.format(date);
	}

	public static Date parse(String date, String formater) {
		SimpleDateFormat sdf = new SimpleDateFormat(formater);
		Date result = null;
		try {
			result = sdf.parse(date.trim());
		} catch (ParseException e) {
			log.error("", e);
		}
		return result;
	}

	public static int getWeekOfDate(Date date) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		return (calendar.get(7) - 1 == 0) ? 7 : calendar.get(7) - 1;
	}

	public static String dateToString(Date date, String format) {
		if (date == null)
			return null;
		SimpleDateFormat formatter = new SimpleDateFormat(format);
		return formatter.format(date).trim();
	}

	public static boolean isDateString(String str) {
		SimpleDateFormat simDateFormat = null;
		String sFormat = "yyyy-MM-dd HH:mm:ss.S";
		try {
			simDateFormat = new SimpleDateFormat(sFormat);
			simDateFormat.parse(str);
			return true;
		} catch (Exception localException2) {
			sFormat = "yyyy-MM-dd HH:mm:ss";
			try {
				simDateFormat = new SimpleDateFormat(sFormat);
				simDateFormat.parse(str);
				return true;
			} catch (Exception localException3) {
				sFormat = "yyyy-MM-dd";
				try {
					simDateFormat = new SimpleDateFormat(sFormat);
					simDateFormat.parse(str);
					return true;
				} catch (Exception localException4) {
				}
			}
		}
		return false;
	}

	public static String getCurrentlyStringTime() {
		SimpleDateFormat tempDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String datetime = tempDate.format(new Date());

		return datetime;
	}

	public static int getAge(Date birthDay) {
		Calendar cal = Calendar.getInstance();

		if (cal.before(birthDay)) {
			throw new IllegalArgumentException("The birthDay is before Now.It's unbelievable!");
		}

		int yearNow = cal.get(1);
		int monthNow = cal.get(2);
		int dayOfMonthNow = cal.get(5);
		cal.setTime(birthDay);

		int yearBirth = cal.get(1);
		int monthBirth = cal.get(2);
		int dayOfMonthBirth = cal.get(5);

		int age = yearNow - yearBirth;

		if (monthNow <= monthBirth) {
			if (monthNow == monthBirth) {
				if (dayOfMonthNow < dayOfMonthBirth) {
					--age;
				}
			} else {
				--age;
			}

		}

		return age;
	}

	public static int timeCompare(String t1, String t2) {
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Calendar c1 = Calendar.getInstance();
		Calendar c2 = Calendar.getInstance();
		try {
			c1.setTime(formatter.parse(t1));
			c2.setTime(formatter.parse(t2));
		} catch (ParseException e) {
			e.printStackTrace();
		}

		int result = c1.compareTo(c2);
		return result;
	}

	public static boolean dateCompare(Date dat1, Date dat2) {
		boolean dateComPareFlag = true;

		if (dat2.compareTo(dat1) != 1) {
			dateComPareFlag = false;
		}
		return dateComPareFlag;
	}

	public static Date getStartDayTime(Date date) {
		if (date == null) {
			return null;
		}
		Calendar start = Calendar.getInstance();
		start.setTime(date);
		start.set(11, 0);
		start.set(12, 0);
		start.set(13, 0);
		return start.getTime();
	}

	public static Date getToDayLastTime(Date date) {
		if (date == null) {
			return null;
		}
		Calendar today = Calendar.getInstance();
		today.setTime(date);
		today.set(11, 23);
		today.set(12, 59);
		today.set(13, 59);
		return today.getTime();
	}

	public static Date getYesterday(Date date) {
		Calendar yesterday = Calendar.getInstance();
		yesterday.setTime(date);
		yesterday.add(5, -1);
		return yesterday.getTime();
	}

	public static Date getNextDate(Date date) {
		Calendar today = Calendar.getInstance();
		today.setTime(date);
		today.add(5, 1);
		return today.getTime();
	}

	public static String dateToSimpleString(Date date) {
		return new SimpleDateFormat("yyyy-MM-dd").format(date);
	}

	public static String dateToFileSimpleString(Date date) {
		return new SimpleDateFormat("yyyyMMdd").format(date);
	}

	/***
	 * 计算两个时间相差的额秒数
	 * 
	 * @param startDate
	 * @return
	 */
	public static int calLastedTime(Date startDate) {
		long a = new Date().getTime();
		long b = startDate.getTime();
		int c = (int) ((a - b) / 1000);
		return Math.abs(c);
	}

	/***
	 * 比较两个时间是否相等
	 * 
	 * @param startDate
	 * @return
	 */
	public static boolean compareDate(Date dt1, Date dt2) {

		if (dt1.compareTo(dt2) == 0) {
			return true;
		}
		return false;
	}

	/**
	 * 获取系统当期年月日(精确到天)，格式：yyyyMMdd
	 * 
	 * @return
	 */
	public static String getFormatDate(Date date, String format) {
		if (date == null) {
			return null;
		}

		DateFormat df = new SimpleDateFormat(format);

		// df.setTimeZone(TimeZone.getTimeZone("Asia/shanghai"));

		// df.setTimeZone(TimeZone.getTimeZone("GMT+8"));//东八区，北京时间

		return df.format(date);
	}

	/**
	 * 获取时间戳
	 * 
	 * @return
	 */
	public static long getDateTime() {

		Date date = new Date();

		return date.getTime();
	}

	/**
	 * 字符串转换成日期
	 * 
	 * @param str
	 * @return date
	 */
	public static Date StrToDate(String str, String str2) {

		SimpleDateFormat format = new SimpleDateFormat(str2);
		Date date = null;
		try {
			date = format.parse(str);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return date;
	}

	public static int getMonthSpace(String date1, String date2) throws ParseException {

		int result = 0;

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

		Calendar c1 = Calendar.getInstance();
		Calendar c2 = Calendar.getInstance();

		c1.setTime(sdf.parse(date1));
		c2.setTime(sdf.parse(date2));

		result = c2.get(Calendar.MONDAY) - c1.get(Calendar.MONTH);

		return result == 0 ? 1 : Math.abs(result);

	}

	/**
	 * 
	 * @param date 获得日期中的天数
	 * @return
	 */
	public static int getDay_Of_Month(Date date) {
		GregorianCalendar gC = new GregorianCalendar();
		gC.setTime(date);
		return gC.get(GregorianCalendar.DAY_OF_MONTH);
	}

	/**
	 * get what hour is now
	 * 
	 * @return 好的当前的小时值
	 */
	public static int getCurrHour() {
		GregorianCalendar gC = new GregorianCalendar();
		return gC.get(GregorianCalendar.HOUR_OF_DAY);
	}

	/**
	 * 日期比较后的 几天差距
	 * 
	 * @param start yyyy-MM-dd
	 * @param end yyyy-MM-dd
	 * @return
	 */
	public static int getIntervalDays(Date start, Date end) {
		start = DateUtil.parse(DateUtil.format(start, "yyyy-MM-dd"), "yyyy-MM-dd");
		end = DateUtil.parse(DateUtil.format(end, "yyyy-MM-dd"), "yyyy-MM-dd");
		long mills_per_day = 24 * 3600 * 1000;
		long startMills = start.getTime();
		long endMills = end.getTime();
		int offset = 0;

		offset = (int) ((endMills - startMills) / mills_per_day);

		return offset;
	}

	/**
	 * 日期比较后的 几月差距 *
	 * 
	 * @param start yyyy-MM-dd
	 * @param end yyyy-MM-dd
	 * @return
	 */
	public static int getIntervalMonths(Date start, Date end) {
		GregorianCalendar startGC = new GregorianCalendar();
		GregorianCalendar endGC = new GregorianCalendar();
		startGC.setTime(start);
		endGC.setTime(end);

		int endY = endGC.get(GregorianCalendar.YEAR);
		int endM = endGC.get(GregorianCalendar.MONTH);
		int endD = endGC.get(GregorianCalendar.DAY_OF_MONTH);

		int startY = startGC.get(GregorianCalendar.YEAR);
		int startM = startGC.get(GregorianCalendar.MONTH);
		int startD = startGC.get(GregorianCalendar.DAY_OF_MONTH);

		int offset = -1;

		if (endD == startD) {
			offset = endM - startM + (endY - startY) * 12;
		}

		return offset;
	}

	/**
	 * 日期比较后的 几月差距 *
	 * 
	 * @param start yyyy-MM-dd
	 * @param end yyyy-MM-dd
	 * @return
	 */
	public static int getIntervalMonthsNew(Date start, Date end) {
		GregorianCalendar startGC = new GregorianCalendar();
		GregorianCalendar endGC = new GregorianCalendar();
		startGC.setTime(start);
		endGC.setTime(end);

		int endY = endGC.get(GregorianCalendar.YEAR);
		int endM = endGC.get(GregorianCalendar.MONTH);
		int startY = startGC.get(GregorianCalendar.YEAR);
		int startM = startGC.get(GregorianCalendar.MONTH);

		int offset = -1;
		if (endY < startY) {
			return offset;
		}

		if (endM < startM) {
			endM = 12 + endM;
			endY = endY - 1;
		}

		offset = (endM - startM) + (endY - startY) * 12;

		return offset;
	}

	public static Date getDate(String time) {

		SimpleDateFormat sdf = new SimpleDateFormat("yyyymmddHHmmss");
		Date date = null;
		try {
			date = sdf.parse(time);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return date;
	}

	public static Date getNow() {
		return new Date();
	}

	/**
	 * 
	 * 前天时间
	 * 
	 * @return
	 */
	public static Date getYesterday() {
		return addDays(-1);
	}

	/**
	 * 当前时间的 days天前 正数 或者days天后 负数
	 * 
	 * @param days int
	 * @return Date
	 */
	public static Date addDays(int days) {
		return addDays(new Date(), days);
	}

	/**
	 * 指定那一天的 days天前或者days天后
	 * 
	 * @param srcDate Date
	 * @param days int
	 * @return Date
	 */
	public static Date addDays(Date srcDate, int days) {
		GregorianCalendar gCanlendar = new GregorianCalendar();
		gCanlendar.setTime(srcDate);
		gCanlendar.add(GregorianCalendar.DAY_OF_MONTH, days);
		return gCanlendar.getTime();
	}

	/**
	 * 指定那一天的 增加多少分钟
	 * 
	 * @param srcDate Date
	 * @param days int
	 * @return Date
	 */
	public static Date addMinutes(Date srcDate, int minite) {
		GregorianCalendar gCanlendar = new GregorianCalendar();
		gCanlendar.setTime(srcDate);
		gCanlendar.add(GregorianCalendar.MINUTE, minite);
		return gCanlendar.getTime();
	}

	/**
	 * 指定那一天的 增加多少小时ԭ
	 * 
	 * @param srcDate Date
	 * @param days int
	 * @return Date
	 */
	public static Date addHours(Date srcDate, int hours) {
		GregorianCalendar gCanlendar = new GregorianCalendar();
		gCanlendar.setTime(srcDate);
		gCanlendar.add(GregorianCalendar.HOUR_OF_DAY, hours);
		return gCanlendar.getTime();
	}

	/**
	 * 指定日期的 months月前或者months月后
	 * 
	 * @param srcDate
	 * @param months
	 * @return
	 */
	public static Date addMonths(Date srcDate, int months) {
		GregorianCalendar gCanlendar = new GregorianCalendar();
		gCanlendar.setTime(srcDate);
		gCanlendar.add(GregorianCalendar.MONTH, months);
		return gCanlendar.getTime();
	}

	/**
	 * 指定日期的 months月前或者months月后
	 * 
	 * @param srcDate
	 * @param months
	 * @return
	 */
	public static Date addMonths(long srcDate, int months) {
		Date date = new Date(srcDate);
		GregorianCalendar gCanlendar = new GregorianCalendar();
		gCanlendar.setTime(date);
		gCanlendar.add(GregorianCalendar.MONTH, months);
		return gCanlendar.getTime();
	}

	/**
	 * 指定日期 的year年前或者year年后
	 * 
	 * @param srcDate Date
	 * @param year int
	 * @return Date
	 */
	public static Date addYears(Date srcDate, int year) {
		GregorianCalendar gCanlendar = new GregorianCalendar();
		gCanlendar.setTime(srcDate);
		gCanlendar.add(GregorianCalendar.YEAR, year);
		return gCanlendar.getTime();
	}

	/**
	 * 与当前日期的比较 大于当前日期为-1，小于当前日期为1，等于当前日期为0���ȷ����
	 * 
	 * @param dest Date
	 */
	public static int compareTo(Date dest) {
		return compareTo(new Date(), dest);
	}

	public static int compareTo(long time) {

		long date = new Date().getTime();
		if (time > date) {
			return -1;
		}
		if (time < date) {
			return 1;
		}
		if (time == date) {
			return 0;
		}
		return 0;
	}

	public static int compareTo(Date src, Date dest) {
		Date src1 = parse(format(src, "yyyy-MM-dd"), "yyyy-MM-dd");
		Date src2 = parse(format(dest, "yyyy-MM-dd"), "yyyy-MM-dd");
		int i = src1.compareTo(src2);
		return i;
	}

	public static String format(String date, String srcPattern, String destPattern) {
		Date d = parse(date, srcPattern);
		if (d == null) {
			return null;
		}

		return format(d, destPattern);
	}

	public static Date modifyDate(Date date, int hour, int minute, int second) {
		GregorianCalendar gC = new GregorianCalendar();
		gC.set(GregorianCalendar.HOUR_OF_DAY, hour);
		gC.set(GregorianCalendar.MINUTE, minute);
		gC.set(GregorianCalendar.SECOND, second);
		return gC.getTime();
	}

	/**
	 * 字符串输出日期格式
	 * 
	 * @param date
	 * @return
	 */
	public static Date parse(String date) {
		return parse(date, "yyyy-MM-dd HH:mm:ss");
	}

	public static long longtime(Date leaveTime, Date enterTime) {// distanceTime为间隔时间（单位为天）
		SimpleDateFormat d = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");// 格式化时间
		String lleaveTime = d.format(leaveTime);// 按以上格式 将当前时间转换成字符串
		String lenterTime = d.format(enterTime);
		long k = 0;
		try {
			k = (d.parse(lleaveTime).getTime() - d.parse(lenterTime).getTime()) / 1000;// 获得秒
		} catch (ParseException e) {
			e.printStackTrace();
		}

		long minute = k / 60;// 分钟

		return minute;
	}

	/**
	 * 还剩余时间计算方法
	 * 
	 * @param currentTime //创建时间
	 * @param distanceTime //间隔时间（单位为天）
	 * @return 获得还剩余时间
	 */
	public static String time(Date createTime, long distanceTime) {// distanceTime为间隔时间（单位为天）
		SimpleDateFormat d = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");// 格式化时间
		String nowtime = d.format(new Date());// 按以上格式 将当前时间转换成字符串
		String tempTime = d.format(createTime);
		String str = "";
		long k = 0;
		try {
			k = (d.parse(nowtime).getTime() - d.parse(tempTime).getTime()) / 1000;// 获得秒
		} catch (ParseException e) {
			e.printStackTrace();
		}
		k = distanceTime * 24 * 3600 - k;
		long day = k / 3600 / 24;// 天
		long hour = (k - day * 24 * 3600) / 3600;// 小时
		long minute = (k - day * 24 * 3600 - hour * 3600) / 60;// 分钟
		long second = k - day * 24 * 3600 - minute * 60 - hour * 3600;// 秒
		str = day + "天" + hour + "小时" + minute + "分钟" + second + "秒";
		if (k < 0) {
			str = "已过期";
		}
		return str;
	}

	public static String doSendProductTime(Date orderTime, String distance, String beginTime, String endTime) {// distanceTime为间隔时间（单位为天）

		SimpleDateFormat d = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");// 格式化时间
		SimpleDateFormat d1 = new SimpleDateFormat("yyyy-MM-dd");// 格式化时间
		String sNowTime = d.format(new Date());// 按以上格式 将当前时间转换成字符串
		String sOrderTime = d.format(orderTime);
		String date = d1.format(orderTime);
		long lnow = 0;// 现在时间数
		long lorder = 0;// 下单时间数
		long lstart = 0;// 上班时间数
		long lend = 0;// 下班时间数
		long n = 0, j = 0;
		String str = "";
		try {
			long distanceTime = Long.parseLong(distance);

			lnow = parse(sNowTime, "yyyy-MM-dd HH:mm:ss").getTime();
			lorder = parse(sOrderTime, "yyyy-MM-dd HH:mm:ss").getTime();
			lstart = parse((date + " " + beginTime), "yyyy-MM-dd HH:mm:ss").getTime();
			lend = parse((date + " " + endTime), "yyyy-MM-dd HH:mm:ss").getTime();
			if (lorder <= lnow) {
				if (lorder < lstart) {// 上班前下单
					if (lnow > lend) {// 当前时间在下班后
						if (lnow > (lstart + 86400000)) {// 经过了1周以上的时间后
							j = (lnow - lstart) / 86400000;
							if (lnow <= (lend + j * 86400000) && lnow >= (lstart + j * 86400000)) {
								n = (lend - lstart) * j + lnow - (lstart + j * 86400000);
							} else {
								n = (lend - lstart) * (j + 1);
							}
						} else {// 经过一周内
							n = lend - lstart;
						}
					} else {// 当前时间在上班时间
						n = lnow - lstart;
					}
				} else if (lnow >= lstart && lend >= lorder) {// 上班时间下单
					if (lnow > lend) {// 当前时间在下班后
						if (lnow > (lstart + 86400000)) {// 经过了1周以上的时间后
							j = (lnow - lstart) / 86400000;
							if (lnow <= (lend + j * 86400000) && lnow >= (lstart + j * 86400000)) {
								n = (lend - lstart) * (j - 1) + lnow - (lstart + j * 86400000) + lend - lorder;
							} else {
								n = (lend - lstart) * j + lend - lorder;
							}
						} else {// 经过一周内
							n = lend - lorder;
						}
					} else {// 当前时间在上班时间
						n = lnow - lorder;
					}
				} else {// 下班时间下单
					if (lnow > (lstart + 86400000)) {// 经过了1周以上的时间后
						j = (lnow - lstart) / 86400000;
						if (lnow <= (lend + j * 86400000) && lnow >= (lstart + j * 86400000)) {
							n = (lend - lstart) * (j - 1) + lnow - (lstart + j * 86400000);
						} else {
							n = (lend - lstart) * j;
						}
					} else {// 经过一周内
						n = 0;
					}
				}
			} else {
				n = distanceTime * 3600 * 1000;
			}
			if (n > distanceTime * 3600 * 1000) {
				n = distanceTime * 3600 * 1000;
			}
			str = showTime(distanceTime * 3600 * 1000 - n);

		} catch (ParseException e) {
			e.printStackTrace();
		}
		return str;
	}

	public static String doSendTime(String beginTime, String endTime) {// beginTime如果21:00:00,endTime为8:30:00
		try {
			SimpleDateFormat d = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");// 格式化时间
			SimpleDateFormat d1 = new SimpleDateFormat("yyyy-MM-dd");// 格式化时间
			String sNowTime = d.format(new Date());// 按以上格式 将当前时间转换成字符串
			String date = d1.format(new Date());
			long lnow = 0;// 现在时间数
			long lwan = 0;// 晚上时间数
			// long lzao=0;//早上时间数
			long lstart = 0;// 上班时间数
			long lend = 0;// 下班时间数
			String str = "";
			lnow = parse(sNowTime, "yyyy-MM-dd HH:mm:ss").getTime();// 现在时间
			lwan = parse((date + " 23:59:59"), "yyyy-MM-dd HH:mm:ss").getTime();
			// lzao = parse((date+" 8:30:00"),"yyyy-MM-dd HH:mm:ss").getTime();
			lstart = parse((date + " " + beginTime), "yyyy-MM-dd HH:mm:ss").getTime();
			lend = parse((date + " " + endTime), "yyyy-MM-dd HH:mm:ss").getTime();
			if (lnow < lwan) {
				if (lnow >= lstart)
					str = "已经很晚了，本系统将在明天早上上班时间与您联系！";
				if (lnow <= lend)
					str = "太早了，本系统将在上班时间与您联系！";
			}
			return str;
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		}
		return null;
	}

	public static boolean doTime(String beginTime, String endTime) {// beginTime如果21:00:00,endTime为8:30:00
		try {
			boolean b = false;
			SimpleDateFormat d = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");// 格式化时间
			SimpleDateFormat d1 = new SimpleDateFormat("yyyy-MM-dd");// 格式化时间
			String sNowTime = d.format(new Date());// 按以上格式 将当前时间转换成字符串
			String date = d1.format(new Date());
			long lnow = 0;// 现在时间数
			long lstart = 0;// 开始时间数
			long lend = 0;// 结束时间数
			lnow = parse(sNowTime, "yyyy-MM-dd HH:mm:ss").getTime();// 现在时间
			lstart = parse((date + " " + beginTime), "yyyy-MM-dd HH:mm:ss").getTime();
			lend = parse((date + " " + endTime), "yyyy-MM-dd HH:mm:ss").getTime();
			if (lnow > lstart && lnow < lend) {
				b = true;
			}
			return b;
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		}
		return false;
	}

	/**
	 * 判断时间是否超过规定时间
	 * 
	 * @param currentTime //创建时间
	 * @param distanceTime //间隔时间（单位为天）
	 * @return 没有超过规定时间为true,否则为false
	 */
	public static boolean judgeTime(Date createTime, long distanceTime) {// distanceTime为间隔时间（单位为天）
		SimpleDateFormat d = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");// 格式化时间
		String nowtime = d.format(new Date());// 按以上格式 将当前时间转换成字符串
		String tempTime = d.format(createTime);
		boolean b = false;
		long k = 0;
		try {
			k = (d.parse(nowtime).getTime() - d.parse(tempTime).getTime()) / 1000;// 获得秒
		} catch (ParseException e) {
			e.printStackTrace();
		}
		k = distanceTime * 24 * 3600 - k;
		if (k >= 0)
			b = true;
		else
			b = false;
		return b;
	}

	// 对于超过多少小时后执行什么
	public static boolean judgeTime1(Date createTime, long distanceTime) {// distanceTime为间隔时间（单位为小时）
		SimpleDateFormat d = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");// 格式化时间
		String nowtime = d.format(new Date());// 按以上格式 将当前时间转换成字符串
		String tempTime = d.format(createTime);
		boolean b = false;
		long k = 0;
		try {
			k = (d.parse(nowtime).getTime() - d.parse(tempTime).getTime()) / 1000;// 获得秒
			System.out.println(k);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		k = k / 3600 - distanceTime;
		if (k > 0) {
			b = false;
		} else {
			b = true;
		}
		return b;
	}

	public static long getSecond() {
		GregorianCalendar startGC = new GregorianCalendar();
		startGC.setTime(new Date());

		int SS = startGC.get(GregorianCalendar.SECOND);
		int MM = startGC.get(GregorianCalendar.MINUTE);
		int HH = startGC.get(GregorianCalendar.HOUR_OF_DAY);

		long start = HH * 60 * 60 * 1000 + MM * 60 * 1000 + SS * 1000;
		long end = 23 * 60 * 60 * 1000 + 59 * 60 * 1000 + 59 * 1000;

		return end - start;
	}

	public static String reTimeState(String begin, String end) throws ParseException {
		Date date1 = parse(begin, "yyyy-MM-dd HH:mm:ss");// formatter.parse(begin);
		Date date2 = parse(end, "yyyy-MM-dd HH:mm:ss");// formatter.parse(end);
		Date nows = new Date();
		long bi = nows.getTime() - date1.getTime();
		long ei = date2.getTime() - nows.getTime();
		long bl = bi / 1000; // 获得现在时间与开始时间的比较
		long el = ei / 1000;// //获得结束时间与现在时间的比较
		if (bl < 0) {
			return "0"; // 未到点
		} else if (bl >= 0 && el >= 0) {
			return "1"; // 正常
		} else if (el < 0) {
			return "2"; // 过期
		} else {
			return "3";// 异常
		}

	}

	public static String showTime(long j) throws ParseException {
		long k = 0;
		String str = "";
		k = j / 1000;
		long day = k / 3600 / 24;// 天
		long hour = (k - day * 24 * 3600) / 3600;// 小时
		long minute = (k - day * 24 * 3600 - hour * 3600) / 60;// 分钟
		long second = k - day * 24 * 3600 - minute * 60 - hour * 3600;// 秒
		if (day > 0)
			str = day + "天" + hour + "小时" + minute + "分钟" + second + "秒";
		else
			str = hour + "小时" + minute + "分钟" + second + "秒";
		if (j == 0) {
			str = "已过期";
		}
		return str;
	}

	/**
	 * 获取当日期前/后某个月的所有日期 0表示当前月 负数表示前多少月 正数表示后多少月
	 * @param month
	 * @return
	 */
	public static List<String> getDayListOfMonth(Date months, String format) {
		if (months == null) {
			months = new Date();
		}

		List<String> list = new ArrayList<String>();
		Calendar aCalendar = Calendar.getInstance(Locale.CHINA);
		aCalendar.setTime(months);
		int year = aCalendar.get(Calendar.YEAR);// 年份
		int month = aCalendar.get(Calendar.MONTH) + 1;// 月份
		int day = aCalendar.getActualMaximum(Calendar.DATE);
		for (int i = 1; i <= day; i++) {
			String aDate = String.valueOf(year) + "-" + month + "-" + i;
			Date parse = DateUtil.StringToDate(aDate, 1);
			list.add(DateUtil.format(parse, format));
		}
		return list;
	}

	/**
	 * 获取某天时间点
	 * @param date 日期
	 * @param offset 时间间隔(分钟计算)
	 * @return
	 */
	public static List<String> getTimeList(Date date, Integer offset) {
		// 开始日期
		Date start = DateUtil.StringToDate(DateUtil.format(date, DateUtil.FORMAT_SIMPE), 1);
		// 下一天的date
		Date nextDayDate = DateUtil.addDays(start, new Integer(1));

		List<String> result = new ArrayList<String>();
		while (start.compareTo(nextDayDate) < 0) {
			result.add(DateUtil.format(start, DateUtil.FORMAT_SIMPE));
			// 日期加60分钟
			Calendar c = Calendar.getInstance();
			c.setTime(start);
			c.add(Calendar.MINUTE, offset);
			start = c.getTime();
		}

		return result;
	}

	/**
	 * 获得某天最大时间 2018-08-04 23:59:59
	 * @param date
	 * @return
	 */
	public static Date getEndOfDay(Date date) {
		LocalDateTime localDateTime = LocalDateTime.ofInstant(Instant.ofEpochMilli(date.getTime()),
				ZoneId.systemDefault());
		;
		LocalDateTime endOfDay = localDateTime.with(LocalTime.MAX);
		return Date.from(endOfDay.atZone(ZoneId.systemDefault()).toInstant());
	}

	/**
	 * 获得某天最小时间 2018-08-04 00:00:00
	 * @param date
	 * @return
	 */
	public static Date getStartOfDay(Date date) {
		LocalDateTime localDateTime = LocalDateTime.ofInstant(Instant.ofEpochMilli(date.getTime()),
				ZoneId.systemDefault());
		LocalDateTime startOfDay = localDateTime.with(LocalTime.MIN);
		return Date.from(startOfDay.atZone(ZoneId.systemDefault()).toInstant());
	}

	/**
	 * 比较两时间
	 * @param DATE1
	 * @param DATE2
	 * @return
	 */
	public static int compareDate(Date dt1, Date dt2, String format) {

		DateFormat df = new SimpleDateFormat(format);
		try {
			if (dt1.getTime() > dt2.getTime()) {
				// "dt1在dt2后");
				return 1;
			} else if (dt1.getTime() < dt2.getTime()) {
				// "dt1在dt2前");
				return -1;
			} else {
				return 0;
			}
		} catch (Exception exception) {
			exception.printStackTrace();
		}
		return 0;
	}

	// 获取一个月天数
	public static int getDaysOfMonth(Date date) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		return calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
	}

}
