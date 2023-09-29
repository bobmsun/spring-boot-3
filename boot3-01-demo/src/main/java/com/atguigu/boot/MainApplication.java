package com.atguigu.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Description 启动SpringBoot项目的主入口程序（class随便叫啥名都行）
 */

@SpringBootApplication//(scanBasePackages = "com.atguigu")    // 这个注解告诉程序：这是一个 SpringBoot 应用
//@SpringBootConfiguration
//@EnableAutoConfiguration
//@ComponentScan("com.atguigu")
public class MainApplication {

    public static void main(String[] args) {
        // 这 run 方法返回一个 ConfigurableApplicationContext，就是我们 的 IOC 容器
        SpringApplication.run(MainApplication.class, args);

    }
}
