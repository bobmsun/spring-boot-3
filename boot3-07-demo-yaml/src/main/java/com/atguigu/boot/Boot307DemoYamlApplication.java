package com.atguigu.boot;

import com.atguigu.boot.bean.Person;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Boot307DemoYamlApplication {

    public static void main(String[] args) {
        var ioc = SpringApplication.run(Boot307DemoYamlApplication.class, args);

        Person person = ioc.getBean(Person.class);
        System.out.println("person: " + person);
    }

}
