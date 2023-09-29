package com.atguigu.boot.config;

import com.alibaba.druid.FastsqlException;
import com.atguigu.boot.bean.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Scope;

@Import(FastsqlException.class)       // 区别在于，之前用 @Bean 注入组件，组件默认名称是 方法名，现在这个 用 @Import 给容器中放入指定类型的组件，组件的名字默认是全类名   "com.alibaba.druid.FastsqlException"
                                      // @Import 是用来导入第三方组件
// @SpringBootConfiguration     //  与 @Configuration 是一样的
@Configuration       // 告诉 spring boot 这是一个配置类    配置类本身也是容器中的组件
public class AppConfig {     // 这里的类名无所谓

    /*
       1. 组件默认是单实例的
    * */

    // 接下来，用这个配置类把我们的组件注册到容器中
    @Bean          // 以前是用 bean 标签来放组件，现在是用 bean 注解，替代以前的 bean 标签       组件在容器中的名字是方法名
    public User user01() {
        User user = new User();
        user.setId(1L);
        user.setName("张三");
        return user;
    }

    // 组件在容器中的名字默认是方法名，可以直接修改注解的值来改组件的名字
    @Bean("userHaha")
    @Scope("prototype")     // 之前有 Scope 标签，现在有 Scope 注解
    public User user02() {
        var user = new User();
        user.setId(1L);
        user.setName("张三");
        return user;
    }

    // 第三方包的组件注册到容器中
//    @Bean
//    public FastsqlException fastsqlException() {
//        return new FastsqlException();
//    }
}
