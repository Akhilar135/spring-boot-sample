package com.springboot.exp.springbootdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringWelcome {
    @GetMapping("/welcome")
    public String welcomeMessage() {
        return "Welcome to spring-boot";
    }


}
