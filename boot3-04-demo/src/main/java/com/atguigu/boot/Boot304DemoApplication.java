package com.atguigu.boot;

import com.atguigu.boot.bean.Cat;
import com.atguigu.boot.bean.Dog;
import com.atguigu.boot.bean.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Boot304DemoApplication {

    public static void main(String[] args) {

        var ioc = SpringApplication.run(Boot304DemoApplication.class, args);

        for (String s : ioc.getBeanNamesForType(Cat.class)) {
            System.out.println("cat: " + s);
        }

        for (String s : ioc.getBeanNamesForType(Dog.class)) {
            System.out.println("dog: " + s);
        }

        for (String s : ioc.getBeanNamesForType(User.class)) {
            System.out.println("user: " + s);
        }
    }

}
