package com.atguigu.logging.controller;


import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j             // 这是 lombok 里边的一个注解；这个注解在底层会给我们自动注入一个属性叫 log；这是我们导入 lombok 的另外一个好处
@RestController
public class HelloController {

    // Logger logger = LoggerFactory.getLogger(getClass());

    @GetMapping("/h")        // 处理一个 get 请求 /h          // 如果这里是 @GetMapping("/h/**")  就意味着  /h/abc/aa...  都能匹配到这里
    public String hello() {
        // Logger logger = LoggerFactory.getLogger(getClass());    // getClass() 拿到当前类；从日志工厂中拿到记录当前类的 日志记录器（Logger）；然后记录日志
                                                             // 类中很多方法都要用到日志记录器，一个类可以用一个日志记录器，所有可以把这个放到上面👆
        // logger.info("哈哈哈，方法进来了！");
        log.info("哈哈哈，方法进来了！");
        return "hello";
    }

    // 讲解日志级别
    @GetMapping("/h2")    // 这里的 a 和 b：在发请求的时候传了一些参数        http://localhost:8080/h2?a=1&b=2
    public String hello2(String a, String b) {

        log.trace("trace 日志.......");
        log.debug("debug 日志.......");
        // SpringBoot 底层默认的日志级别 info, 只会打印 info 及以后的 日志
        log.info("info 日志........ 参数a:{} b:{}", a, b);   // 一般这样做拼接（而不是用+做 string concatenation）
        log.warn("warn 日志........");
        log.error("error 日志........");

        return "hello2";
    }
    // SpringBoot 中可以精确地调整某一个类的日志级别 或是 某一个包下所有类的日志级别
}
