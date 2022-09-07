package com.huanhai.utils.date;

import java.text.ParseException;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/**
 *
 * 时间转换工具
 *
 * @author qinbo
 * @version 1.0
 * @date 2022-08-09 10:31
 **/
public class DateUtils {


    /**
     *localDate转Date
     *
     *@param
     *@return
     *@author  qin bo
     *@date  2022-08-15
     *
     */
    public static Date localDate2Date(LocalDate date){
        assert date != null;
        return Date.from(date.atStartOfDay().atZone(ZoneId.systemDefault()).toInstant());
    }

    /**
     *LocalDateTime转Date
     *
     *@param
     *@return
     *@author  qin bo
     *@date  2022-08-15
     *
     */
    public static Date localDateTime2Date(LocalDateTime date){
        assert date != null;
        return Date.from(date.atZone(ZoneId.systemDefault()).toInstant());
    }


    /**
     *Date转LocalDateTime
     *
     *@param
     *@return
     *@author  qin bo
     *@date  2022-08-15
     *
     */
    public static LocalDate date2LocalDate(Date date){
        assert date != null;
        return  date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
    }

    /**
     *LocalDateTime转Date
     *
     *@param
     *@return
     *@author  qin bo
     *@date  2022-08-15
     *
     */
    public static LocalDateTime date2LocalDateTime(Date date){
        assert date != null;
        return  date.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
    }



    public static String LocalDateTime2String(LocalDateTime date, Pattern pattern){
        assert date != null;
        return DateTimeFormatter.ofPattern(pattern.pattern).toFormat().format(date);
    }

    public static String LocalDateTime2String(LocalDateTime date, Pattern pattern, Locale locale){
        assert date != null;
        return DateTimeFormatter.ofPattern(pattern.pattern,locale).toFormat().format(date);
    }




    enum Pattern{
        DATE("yyyy-MM-dd"),
        DATETIME("yyyy-MM-dd HH:mm:ss");

        private String pattern;

        Pattern(String pattern) {
            this.pattern = pattern;
        }

        public String getPattern() {
            return pattern;
        }
    }

    enum TimeZone{

    }

    public static void main(String[] args) throws ParseException {
        System.out.println(localDate2Date(LocalDate.of(2021,5,2)));
        System.out.println(localDateTime2Date(LocalDateTime.of(2021,5,21,12,23,11)));
        Calendar calendar= Calendar.getInstance();
        System.out.println(LocalDateTime2String(LocalDateTime.now(), Pattern.DATE));
        System.out.println(LocalDateTime2String(LocalDateTime.now(), Pattern.DATETIME, Locale.GERMANY));
        System.out.println(Clock.systemDefaultZone().instant());
        System.out.println(LocalDateTime.now(Clock.systemDefaultZone()).toInstant(ZoneOffset.ofHours(+8)).atZone(ZoneId.systemDefault()));

        System.out.println(Clock.tickSeconds(ZoneId.systemDefault()).instant().atZone(ZoneId.systemDefault()));
        LocalDateTime now = LocalDateTime.now();
        System.out.println(Instant.ofEpochSecond(599,-1545));
        System.out.println(Instant.ofEpochSecond(599,1545));


    }

}
