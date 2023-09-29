package com.atguigu.boot;

import com.alibaba.druid.FastsqlException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Boot303DemoApplication {

    public static void main(String[] args) {

        var ioc = SpringApplication.run(Boot303DemoApplication.class, args);

        // 验证 user01 被放进去了
        for (String name : ioc.getBeanDefinitionNames()) {
            System.out.println(name);
        }

        // 验证组件是 多实例的 or 单实例的
        Object userHaha1 = ioc.getBean("userHaha");
        Object userHaha2 = ioc.getBean("userHaha");
        System.out.println(userHaha1 == userHaha2);


        String[] forType = ioc.getBeanNamesForType(FastsqlException.class);
        for (String s : forType) {
            System.out.println(s);
        }


    }

}
