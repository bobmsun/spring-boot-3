package com.atguigu.boot;

import com.atguigu.boot.bean.Pig;
import com.atguigu.boot.bean.Sheep;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Boot305DemoApplication {

    public static void main(String[] args) {

        var ioc = SpringApplication.run(Boot305DemoApplication.class, args);

        Pig bean = ioc.getBean(Pig.class);
        System.out.println(bean);

        Sheep sheep = ioc.getBean(Sheep.class);
        System.out.println(sheep);
    }

}
