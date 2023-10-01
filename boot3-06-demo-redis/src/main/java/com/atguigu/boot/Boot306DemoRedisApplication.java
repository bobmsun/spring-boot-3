package com.atguigu.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Boot306DemoRedisApplication {

    public static void main(String[] args) {

        var ioc = SpringApplication.run(Boot306DemoRedisApplication.class, args);

        String[] list = ioc.getBeanDefinitionNames();
        for (String name : list) {
            System.out.println(name);
        }
    }

}
