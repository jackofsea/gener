package com.huanhai.redis;

import com.huanhai.redis.option.RedisTemplateString;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class RedisApplicationTests {
    @Autowired
   private RedisTemplateString redisTemplate;

    @Test
    void contextLoads() {
        System.out.println(redisTemplate.get("lisi:12"));
        redisTemplate.set("lisi:12","19");
        redisTemplate.leftPush("user:11","历史");
    }

}
