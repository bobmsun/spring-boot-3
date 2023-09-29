package com.atguigu.boot.config;

import com.atguigu.boot.bean.Cat;
import com.atguigu.boot.bean.Dog;
import com.atguigu.boot.bean.User;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// @ConditionalOnClass(name="com.alibaba.druid.FastsqlException")      这个注解还可以放到类上边，如果系统中存在这个类，则以下所有东西都开始生效；当系统中没有这个类，整个配置类都不会生效
                                                                    // 放在类级别，如果注解生效了，则整个配置类才生效；只有整个配置类生效了，下面的判断才会继续走
@Configuration
public class AppConfig2 {

    @ConditionalOnClass(name="com.alibaba.druid.FastsqlException")    // 放在方法级别，只是单独对这个方法进行判断；
    @Bean
    public Cat cat01() {
        return new Cat();
    }


    @ConditionalOnMissingClass(value="com.alibaba.druid.FastsqlException")
    @Bean
    public Dog dog01() {
        return new Dog();
    }


    @ConditionalOnBean(value = Dog.class)
    @Bean
    public User zhangsan() {
        return new User();
    }


    @ConditionalOnMissingBean(value = Dog.class)
    @Bean
    public User lisi() {
        return new User();
    }
}
