package com.cmdbms.util;

import org.springframework.stereotype.Component;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * Description: 对时间进行格式化工具 （持续更新）
 * Author: Edarward
 */
@Component
public class DateFormatUtil {

    /**
     * Description: CST 时间 自定义格式化
     * Author: Edarward
     */
    public static String DateFormat(String date,String format) throws ParseException {
        SimpleDateFormat newDate = new SimpleDateFormat("EEE MMM dd HH:mm:ss zzz yyyy", Locale.US);
        Date d = newDate.parse(date);
        String timeFormat = new SimpleDateFormat(format).format(d);
        return timeFormat;
    }

    /**
     * Description: CST 时间 格式化：yyyy-MM-dd HH:mm:ss
     * Author: Edarward
     */
    public static String DateFormat(String date) throws ParseException {
        SimpleDateFormat newDate = new SimpleDateFormat("EEE MMM dd HH:mm:ss zzz yyyy", Locale.US);
        Date d = newDate.parse(date);
        String timeFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(d);
        return timeFormat;
    }

    /*将时间戳转换为date*/
    public static String stampToDate(Timestamp s) {
        SimpleDateFormat newDate = new SimpleDateFormat("yyyy MM dd HH:mm:ss");
        String d = newDate.format(s);
        System.out.println("Format To String(Date):" + d);
        return d;
    }
    public static Date StringFormat(String date) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date newDate = sdf.parse(date);
        return newDate;
    }

    public static Date StringFormat(String date,String format) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        Date newDate = sdf.parse(date);
        return newDate;
    }
}
