package com.atguigu.boot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class HelloController {

    @Autowired
    StringRedisTemplate redisTemplate;
    // 如果程序中自己定义了 叫 stringRedisTemplate 的 bean，spring boot 就不会在创建了，因为 RedisAutoConfiguration file 中，有 @ConditionalOnMissingBean 注解
    // "我放了，spring boot 就不放了"

    @GetMapping("/incr")
    public String incr() {
        Long haha = redisTemplate.opsForValue().increment("haha");    // 对 haha 这个key的值 +1，返回增加后的值
        return "增加后的值：" + haha;
    }

    @GetMapping("/hello")
    public String hello() {
        return "ell;";
    }
}
