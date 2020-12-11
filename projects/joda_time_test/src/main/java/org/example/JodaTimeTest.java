package org.example;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class JodaTimeTest {

    public static void main(String[] args) {
        // 创建Joda-DateTime对象
        DateTime dateTime = new DateTime();
        // 输出当前时间
        System.out.println("CurrentTimeMillis:" + System.currentTimeMillis());
        System.out.println("LongDateTime:" + new DateTime().getMillis());
        // Joda-DateTime转Java-Date
        Date date = dateTime.toDate();
        // Joda-DateTime转Java-Calendar
        Calendar calendar = dateTime.toCalendar(Locale.CHINESE);
        // 打印Joda-Time对象的时间属性信息
        System.out.println("Year:" + dateTime.getYear());
        System.out.println("Month:" + dateTime.getMonthOfYear());
        System.out.println("Day:" + dateTime.getDayOfMonth());
        System.out.println("MinuteOfDay:" + dateTime.getMinuteOfDay());
        System.out.println("Hour:" + dateTime.getHourOfDay());
        System.out.println("Minute:" + dateTime.getMinuteOfHour());
        System.out.println("Second:" + dateTime.getSecondOfMinute());
        // 定义日期格式1
        DateTimeFormatter format = DateTimeFormat.forPattern("yyyy年MM月dd日 HH:mm:ss");
        System.out.println(format.print(dateTime.getMillis()));
        // 定义日期格式2
        DateTimeFormatter format1 = DateTimeFormat.forPattern("yyyy.MM.dd HH:mm:ss");
        System.out.println(format1.print(dateTime.getMillis()));
        // 定义日期格式3
        DateTimeFormatter format2 = DateTimeFormat.forPattern("yyyy-MM-dd hh:mm:ss");
        System.out.println(format2.print(dateTime.getMillis()));
    }

}
