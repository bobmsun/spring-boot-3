package com.atguigu.boot.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.Map;

@Component
@ConfigurationProperties(prefix = "person")      // 将这个 java bean 和配置文件的 person 前缀进行了绑定
                                                // Dog, Cat, Child 就不用绑配置文件了，因为它们是 person 里边嵌套的
@Data      // 来自 lombok，自动生成 JavaBean属性的 getter / setter  和 toString method
@NoArgsConstructor      // 自动生成一个无参构造器
@AllArgsConstructor     // 自动生成一个全参构造器
public class Person {

    private String name;
    private Integer age;
    private Date birthday;
    private Boolean like;
    private Child child;       // 嵌套对象
    private List<Dog> dogs;    // 数组（里面都是对象）
    private Map<String, Cat> cats;       // 表示 Map

}
