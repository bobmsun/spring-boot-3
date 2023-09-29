package com.atguigu.boot;

//import com.alibaba.druid.FastsqlException;
import com.atguigu.boot.bean.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication      // 这是一个 SpringBoot 应用

// 法一：
// @SpringBootApplication(scanBasePackages = "com.atguigu")

// 法二：
//@SpringBootConfiguration
//@EnableAutoConfiguration
//@ComponentScan("com.atguigu")
public class Boot302DemoApplication {

//    public static void main(String[] args) {
//        SpringApplication.run(Boot302DemoApplication.class, args);
//    }


    // Spring boot 有一个默认规则：只扫描主程序所在的包 及其下面 的子包，跟主程序不在同一包下的功能组件都没有用，就算标注了 @RestController 注解也没有用，因为扫不进来
    public static void main(String[] args) {

        // java10：局部变量类型的自动推断 （只要右边能够明确知道返回类型是什么，左边就不用那么精确了，直接一个 var 关键字）（var 只能用于局部变量，不能用于 方法外[做 field]）
        var ioc = SpringApplication.run(Boot302DemoApplication.class, args);    // 这个方法会给我们返回 ioc 容器

        // getBeanDefinitionNames - 获取所有组件的名字
        String[] names = ioc.getBeanDefinitionNames();
        for (String name: names) {
            System.out.println(name);
        }
        // dispatcherServlet, beanNameViewResolver, characterEncodingFilter, multipartResolver...
        // SpringBoot 把以前配置的核心组件现在都给我们自动配置好了；只要容器中有了这个组件，我们就认为容器中有这个功能了
/*
        String[] forType = ioc.getBeanNamesForType(User.class);
        for (String s : forType) {
            System.out.println(s);
        }

        Object userHaha1 = ioc.getBean("userHaha");
        Object userHaha2 = ioc.getBean("userHaha");
        System.out.println(userHaha2 == userHaha1);

        forType = ioc.getBeanNamesForType(Cat.class);
        for (String s : forType) {
            System.out.println(s);
        }

//        forType = ioc.getBeanNamesForType(FastsqlException.class);
//        for (String s : forType) {
//            System.out.println(s);
//        }

        forType = ioc.getBeanNamesForType(Cat.class);
        for (String s : forType) {
            System.out.println("cat: " + s);
        }

        forType = ioc.getBeanNamesForType(Dog.class);
        for (String s : forType) {
            System.out.println("dog: " + s);
        }

        forType = ioc.getBeanNamesForType(User.class);
        for (String s : forType) {
            System.out.println(s);
        }

        Pig pig = ioc.getBean(Pig.class);
        System.out.println("pig: " + pig);

        Sheep sheep = ioc.getBean(Sheep.class);
        System.out.println("sheep: " + sheep);
        */

    }



}
