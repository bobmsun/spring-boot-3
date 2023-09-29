package com.atguigu.boot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

// @ResponseBody   // 表示这个 controller 的所有方法都是返回 JSON 或 纯文本的，而不是跳页面的
// @Controller
@RestController     // RestController 就是 Controller 和 ResponseBody 的合成注解
public class HelloController {

    //@Autowired
    //StringRedisTemplate redisTemplate;

    // @ResponseBody     // 因为我们要给浏览器返回的是一个纯文本，所以标记为 ResponseBody; ResponseBody 就表示 我们返回的是 JSON 或 纯文本，而不是跳页面的
    @GetMapping("/hello")   // 处理浏览器的 hello 请求
    public String hello() {
        return "Hello, Spring Boot 3!";
    }

//    @GetMapping("/incr")
//    public String incr() {
//        System.out.println(redisTemplate);
//        Long haha = 99L; //redisTemplate.opsForValue().increment("haha");
//        return "增加后的值：" + haha;
//    }
}
