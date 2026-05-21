package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class GrokJavaApp {

    public static void main(String[] args) {
        SpringApplication.run(GrokJavaApp.class, args);
    }
}

@RestController
class HelloController {
    
    @GetMapping("/")
    public String hello() {
        return "Hello from Grok-powered Java app deployed on Render! 🚀";
    }
}