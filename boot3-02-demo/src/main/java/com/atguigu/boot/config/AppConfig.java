package com.atguigu.boot.config;

//import com.alibaba.druid.FastsqlException;
import com.atguigu.boot.bean.Pig;
import com.atguigu.boot.bean.Sheep;
import com.atguigu.boot.bean.User;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Scope;

//@Import(FastsqlException.class)    // 导入这个功能给容器中放指定类型的组件，组件的名字默认是全类名   （com.alibaba.druid.FastsqlException）
@SpringBootConfiguration    // 二者没什么区别，如果是一些通用的 配置类，可以标 Configuration；如果是 spring boot 的，可以用 SpringBootConfiguration
// @Configuration     // 这个注解就是在告诉 springboot，这是一个配置类，替代以前的配置类。配置类本身也是容器中的组件
@EnableConfigurationProperties(Sheep.class)
/**
 * 1. 开启Sheep组件的属性绑定
 * 2. 默认会把这个组件自己放到容器中（不用我们自己再用 Component 注解把组件加入到容器中了）
 */
public class AppConfig {    // 这里的类名无所谓

    /**
     * 组件默认是 单实例 的
     * @return
     */
    @Scope("prototype")     // 之前有个 scope 属性，现在就有 Scope 注解
    @Bean("userHaha")    // 替代以前的 Bean 标签   这就是使用 bean 注解给容器中放组件，默认的是：组件在容器中的名字是方法名，也可以修改注解的值
    public User user01() {
        var user = new User();
        user.setId(1L);
        user.setName("张三");
        return user;
    }

//    @Bean
//    public FastsqlException fastsqlException(){
//        return new FastsqlException();
//    }

    @Bean
    @ConfigurationProperties(prefix = "pig")
    public Pig pig() {
        return  new Pig();    // 这个 pig 放到容器中后，会被进行自动绑定，因为有了 ConfigurationProperties 标签
    }
}
