package com.example.demo123;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@Controller
public class Demo123Application {

    @GetMapping
    public String home(){
        return "home";
    }
    @GetMapping("/test")
    public String test(){
        return "test";
    }

    public static void main(String[] args) {
        SpringApplication.run(Demo123Application.class, args);
    }

}
