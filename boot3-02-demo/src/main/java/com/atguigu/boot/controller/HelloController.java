package com.atguigu.boot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/haha")      // 接受发来的 haha 请求
    public String hello() {
        return "Hello";        // 返回 Hello
    }
}
