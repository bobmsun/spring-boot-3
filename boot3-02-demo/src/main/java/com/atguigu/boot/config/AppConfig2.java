package com.atguigu.boot.config;

import com.alibaba.druid.FastsqlException;
import com.atguigu.boot.bean.Cat;
import com.atguigu.boot.bean.Dog;
import com.atguigu.boot.bean.User;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingClass;
import org.springframework.context.annotation.Bean;

// @ConditionalOnMissingClass(value="com.alibaba.druid.FastsqlException")    这个注解还可以放在类上面：当条件满足，以下所有东西都生效；如果条件不满足，整个配置类都不会生效
// 放在类级别，如果注解判断生效，则整个配置类才生效；整个配置类生效，下边的判断才会继续走
@SpringBootConfiguration
public class AppConfig2 {

    @ConditionalOnClass(name="com.alibaba.druid.FastsqlException")   // 放在方法级别，只是单独对这个方法进行注解判断；如果注解生效，则方法开始作用
    //@ConditionalOnBean(FastsqlException.class)
    @Bean
    public Cat cat01() {
        return new Cat();
    }

    @ConditionalOnMissingClass(value="com.alibaba.druid.FastsqlException")
    @Bean
    public Dog dog01() {
        return new Dog();
    }

    @ConditionalOnBean(name="dog01")
    @Bean
    public User zhangsan() {
        return new User();
    }

    @ConditionalOnMissingBean(name="dog01")
    @Bean
    public User lisi() {
        return new User();
    }

//    @ConditionalOnBean(vale=Dog.class)
//    @Bean
//    public User zhangsan() {
//        return new User();
//    }
//
//    @ConditionalOnMissingBean(name=Dog.class)
//    @Bean
//    public User lisi() {
//        return new User();
//    }
}
