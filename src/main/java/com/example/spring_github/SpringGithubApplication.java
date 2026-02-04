package com.example.spring_github;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SpringGithubApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringGithubApplication.class, args);
    }

    @GetMapping("/")
    public String hello() {
        return "Hello, World!";
    }
}

