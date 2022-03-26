package com.huanhai.utils.json;

import com.google.gson.Gson;
import com.huanhai.utils.response.ResultMsg;

import java.util.ArrayList;
import java.util.List;

/**
 *  Gson工具类
 *  序列化为json
 *
 * @author 覃波
 * @version 1.0
 * @date 2021-03-17 12:53
 **/
public class GsonUtil {

    public final static Gson GSON=new Gson();

    /**
     *  对象序列化
     * @param o
     * @return
     */
    public static String  serialise(Object o){
        return GSON.toJson(o);
    }

    /**
     *  对象反序列化
     * @param obj
     * @return
     */
    public static <T> T deSerialise(String obj,Class<T> c){

        return GSON.fromJson(obj,c);
    }



    public static void main(String[] args) {
        ResultMsg resultMsg= (ResultMsg) ResultMsg.FAILURE;
        List<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        System.out.println(GsonUtil.serialise(resultMsg));

    }



}
