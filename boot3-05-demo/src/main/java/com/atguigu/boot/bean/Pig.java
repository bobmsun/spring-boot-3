package com.atguigu.boot.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

// @ConfigurationProperties(prefix = "pig")
// @Component     // 随便用一个注解把 这个类的 instance 放到容器里边
               // 这里可以使用任意方式把它放到容器中，不管是 Component 注解，还可以是通过 AppConfig
public class Pig {

    private Long id;
    private String name;
    private Integer age;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Pig{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
