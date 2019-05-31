package com.lin.pet.util;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author linjunqin
 *
 */
public class FormatUtil {
    private static final String defaultDatePattern = "yyyy-MM-dd HH:mm:ss";
    private static final String standardDatePattern = "yyyy-MM-dd";

    private static DecimalFormat percent = new DecimalFormat("##0.00%");
    private static DecimalFormat df = new DecimalFormat("#0.00");

    public static String doubleFormat(Double number) {
        String str = df.format(number);
        return "0.00".equals(str) ? "0" : str;
    }

    public static String floatFormat(Float number) {
        String str = df.format(number);
        return "0.00".equals(str) ? "0" : str;
    }

    public static String percentFormat(Double number){
        return percent.format(number);
    }

    public static String percentFormat(Float number){
        return percent.format(number);
    }

    public static String percentFormat(Integer number){
        return percent.format(number);
    }

    public static String timeFormat(Date ts) {
        if (ts == null) {
            return "0000-00-00 00:00:00";
        }
        SimpleDateFormat timeSdf = new SimpleDateFormat(defaultDatePattern);
        return timeSdf.format(ts);
    }

    public static String dayFormat(Date ts) {
        if (ts == null) {
            return "0000-00-00";
        }
        SimpleDateFormat daySdf = new SimpleDateFormat(standardDatePattern);
        return daySdf.format(ts);
    }

    public static String dayFormat(Object o) {
        if (o == null) {
            return "0000-00-00";
        }

        SimpleDateFormat daySdf = new SimpleDateFormat(standardDatePattern);
        return daySdf.format(o);
    }

    public static Date strParseDate(String dateStr) {
        SimpleDateFormat daySdf = new SimpleDateFormat(standardDatePattern);
        try {
            if (dateStr == null || dateStr.isEmpty()) {

                return daySdf.parse("0000-00-00");
            }
            return daySdf.parse(dateStr);
        } catch (java.text.ParseException parseException) {
            parseException.printStackTrace();
        }
        return new Date();
    }

    public static Date strParseTime(String timeStr) {
        SimpleDateFormat timeSdf = new SimpleDateFormat(defaultDatePattern);
        try {
            if (timeStr == null || timeStr.isEmpty()) {
                return timeSdf.parse("0000-00-00 00:00:00");
            }
            return timeSdf.parse(timeStr);
        } catch (java.text.ParseException parseException) {
            parseException.printStackTrace();
        }
        return new Date();
    }

    public static Float round(Float f) {
        BigDecimal b = new BigDecimal(f);
        return b.setScale(2, BigDecimal.ROUND_HALF_UP).floatValue();
    }

    public static String beginDate(Date date) {
        return dayFormat(date) + " 00:00:00";
    }

    public static String endDate(Date date) {
        return dayFormat(date) + " 23:59:59";
    }
}
