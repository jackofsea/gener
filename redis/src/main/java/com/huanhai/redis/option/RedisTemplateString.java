package com.huanhai.redis.option;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

/**
 * @author luofeng
 * @version 1.0
 * @date 2021-03-18 14:44
 **/
@Component
public class RedisTemplateString {

    @Autowired
    private StringRedisTemplate stringRedisTemplate;


    public String get(String key){
        return stringRedisTemplate.opsForValue().get(key);
    }

    public void set(String key,String value){
        stringRedisTemplate.opsForValue().set(key,value);
    }


    public void leftPush(String key, String value){
        stringRedisTemplate.opsForList().leftPush(key,value);
    }

}
