package com.huanhai.utils.string;

/**
 *
 * 字符串工具
 *
 * @author qinbo
 * @version 1.0
 * @date 2022-08-09 10:33
 **/
public class StringUtils {

    public static String EMPTY_STRING = "";

    /**
     *判断字符串是否null或者空字符串
     *
     *@param str
     *@return Boolean
     *@author  qin bo
     *@date  2022-08-09
     *
     */
    public static Boolean isNullOrEmpty(String str) {
        return str == null || EMPTY_STRING.equals(str);
    }

    /**
     *判断字符串是否是空字符串
     *字符串为null会返回false
     *@param str
     *@return Boolean
     *@author  qin bo
     *@date  2022-08-09
     *
     */
    public static Boolean isEmpty(String str) {
        return EMPTY_STRING.equals(str);
    }



    /**
     *首尾去空格后，判断字符串是否null或者空字符串
     *
     *@param str
     *@return Boolean
     *@author  qin bo
     *@date  2022-08-09
     *
     */
    public static Boolean isNullOrEmptyOfTrim(String str) {
        return str == null || EMPTY_STRING.equals(str.trim());
    }


    /**
     *null转空字符串
     *
     *@param str
     *@return String
     *@author  qin bo
     *@date  2022-08-16
     *
     */
    public static String null2Empty(String str) {

        return str == null ? EMPTY_STRING : str;
    }

    /**
     *字符串去掉前后空格
     *
     *@param str
     *@return String
     *@author  qin bo
     *@date  2022-09-13
     *
     */
    public static String trim(String str) {
        return str == null ? null : str.trim();
    }

    /**
     *字符串是否以某部分开头
     *
     *@param str
     *@return Boolean
     *@author  qin bo
     *@date  2022-09-13
     *
     */
    public static Boolean startWith(String str) {
        return str == null ? Boolean.FALSE : str.startsWith(str);
    }

    /**
     *字符串是否以某部分结尾
     *
     *@param str
     *@return Boolean
     *@author  qin bo
     *@date  2022-09-13
     *
     */
    public static Boolean endWith(String str) {
        return str == null ? Boolean.FALSE : str.endsWith(str);
    }

    /**
     *子串个数
     *
     *@param src
     *@return Boolean
     *@author  qin bo
     *@date  2022-09-13
     *
     */
    public static Integer subStringCount(String src,String rep) {
        int result = 0;
        if (isNullOrEmptyOfTrim(src) || isNullOrEmptyOfTrim(rep) ) {
            return result;
        }
        int index= 0;
        while ( (index= src.indexOf(rep,index)) > -1) {
            result += 1;
            index = index + rep.length();
        }
        return result;
    }








}
