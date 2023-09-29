package com.atguigu.boot.config;

import com.atguigu.boot.bean.Pig;
import com.atguigu.boot.bean.Sheep;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

@EnableConfigurationProperties(Sheep.class)            // EnableConfigurationProperties 通常用于导入第三方组件用于属性绑定
                                                       // 因为 Spring boot 默认只扫面主程序所在的包，第三方包就算 把 ConfigurationProperties 和 Component 都标上了，依然没有用，因为组件都扫描不进来
/*
    1. 开启 Sheep 组件的属性绑定
    2. 默认会把这个组件自己放到容器中
* */
@SpringBootConfiguration
public class AppConfig {

    @Bean
    @ConfigurationProperties(prefix = "pig")         // 容器中的这个 pig 组件，最终跟配置文件中以 pig 开头的这些项 来进行属性一一对应
    public Pig pig() {
        return new Pig();
    }


}

// 一定要注意：组件一定要在容器中，才会有 spring boot 给我们提供的各种各样的功能

// 用 @Bean 修饰的方法，可以有参数，如果这些参数在容器中有，它就会直接从容器中拿，例如：
// public TomcatWebServerFactoryCustomizer tomcatWebServerFactoryCustomizer(Environment environment, ServerProperties serverProperties) {
//      return new TomcatWebServerFactoryCustomizer(environment, serverProperties);
// }
