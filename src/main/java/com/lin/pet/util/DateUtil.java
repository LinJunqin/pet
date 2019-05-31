package com.lin.pet.util;

import org.apache.commons.lang3.StringUtils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author linjunqin
 *
 */
public class DateUtil {

    private static final String defaultDatePattern = "yyyy-MM-dd HH:mm:ss";
    private static final String standardDatePattern = "yyyy-MM-dd";


    public static String getNowDate(){
        SimpleDateFormat df = new SimpleDateFormat(defaultDatePattern);
        return df.format(new Date());
    }

    public static Date stringToDate(String strDate){
        if (!StringUtils.isBlank(strDate)){
            try {
                return new SimpleDateFormat(defaultDatePattern).parse(strDate);
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    public static String dateToString(Date date){
        SimpleDateFormat sdf = new SimpleDateFormat(standardDatePattern);
        return sdf.format(date);
    }

    /**
     *
     * @param date
     * @param day
     * @return 日期所在周的第day天
     */
    public static String getDayOfWeek(Date date, int day) {
        day = day - 1;
        Calendar cal = Calendar.getInstance();

        cal.setTime(date);

        int d ;
        if(cal.get(Calendar.DAY_OF_WEEK)==1){
            d = -6;
        }else{
            d = 2-cal.get(Calendar.DAY_OF_WEEK);
        }
        cal.add(Calendar.DAY_OF_WEEK, d+day);
        SimpleDateFormat sdf = new SimpleDateFormat(standardDatePattern);
        return sdf.format(cal.getTime());
    }

    /**
     *
     * @param date
     * @return 日期所在月的第一天  格式 "yyyy-mm-dd"
     */
    public static String getFirstDayOfMonth(Date date) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.MONTH, 0);
        cal.set(Calendar.DAY_OF_MONTH, 1);
        SimpleDateFormat sdf = new SimpleDateFormat(standardDatePattern);
        return sdf.format(cal.getTime());

    }
    public static Date getFirstDayOfMonth() {
        Calendar c = Calendar.getInstance();
        c.add(Calendar.MONTH, 0);
        //设置为1号,当前日期既为本月第一天
        c.set(Calendar.DAY_OF_MONTH, 1);
        //将小时至0
        c.set(Calendar.HOUR_OF_DAY, 0);
        //将分钟至0
        c.set(Calendar.MINUTE, 0);
        //将秒至0
        c.set(Calendar.SECOND,0);
        //将毫秒至0
        c.set(Calendar.MILLISECOND, 0);
        return c.getTime();

    }
    /**
     *
     * @param date
     * @return 日期所在月的最后一天 格式 "yyyy-mm-dd"
     */
    public static String getLastDayOfMonth(Date date) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.MONTH, 1);
        cal.set(Calendar.DAY_OF_MONTH, 0);
        SimpleDateFormat sdf = new SimpleDateFormat(standardDatePattern);
        return sdf.format(cal.getTime());
    }

    /**
     *
     * @param firstDate
     * @param lastDate
     * @return 包含着两个日期在内的时间长度  单位 "天"
     */
    public static double dayDistance(Date firstDate, Date lastDate){
        return (int)((FormatUtil.strParseDate(FormatUtil.dayFormat(lastDate)).getTime()
                - FormatUtil.strParseDate(FormatUtil.dayFormat(firstDate)).getTime())/(1000L*3600*24)) + 1;
    }
    /**
     *
     * @param firstDate
     * @param lastDate
     * @return 包含着两个日期在内的时间长度  单位 "周"
     */
    public static int weekDistance(Date firstDate, Date lastDate){
        return (int)((FormatUtil.strParseDate(FormatUtil.dayFormat(lastDate)).getTime()
                - FormatUtil.strParseDate(FormatUtil.dayFormat(firstDate)).getTime())/(1000L*3600*24))/7 + 1;
    }
    /**
     *
     * @param firstDate
     * @param lastDate
     * @return 包含着两个日期在内的时间长度  单位 "月"
     */
    public static int monthDistance(Date firstDate, Date lastDate){
        Calendar first = Calendar.getInstance();
        Calendar last = Calendar.getInstance();
        first.setTime(firstDate);
        last.setTime(lastDate);
        return last.get(Calendar.MONTH) - first.get(Calendar.MONTH) + (last.get(Calendar.YEAR) - first.get(Calendar.YEAR)) * 12 + 1;
    }

    /**
     *
     * @param date
     * @param amount
     * @return 在所给日期上加amount 天上的 日期
     */
    public static Date addDay(Date date, int amount){
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.DATE, amount);
        return cal.getTime();
    }

    /**
     *
     * @param date
     * @param amount
     * @return 在所给日期上加amount 周上的 日期
     */
    public static Date addWeek(Date date, int amount){
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.WEEK_OF_YEAR, amount);
        return cal.getTime();
    }
    /**
     *
     * @param date
     * @param amount
     * @return 在所给日期上加amount 月上的 日期
     */
    public static Date addMonth(Date date, int amount){
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.MONTH, amount);
        return cal.getTime();
    }
}
