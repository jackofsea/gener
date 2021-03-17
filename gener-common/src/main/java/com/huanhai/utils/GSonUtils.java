package com.huanhai.utils;

import com.google.gson.Gson;

/**
 *  Gson工具类
 *  序列化为json
 *
 * @author 覃波
 * @version 1.0
 * @date 2021-03-17 12:53
 **/
public class GSonUtils {

    public static Gson gson=new Gson();

    /**
     *  对象序列化
     * @param o
     * @return
     */
    public static String  serialise(Object o){

        return gson.toJson(o);
    }

    /**
     *  对象反序列化
     * @param obj
     * @return
     */
    public static <T> T deSerialise(String obj,Class<T> cla){

        return gson.fromJson(obj,cla);
    }



}
