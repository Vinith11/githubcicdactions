package com.vini.githubcicdactions;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GithubcicdactionsApplication {

    @GetMapping("/welcome")
    public String hello() {
        return "Hello Github Actions";
    }

    public static void main(String[] args) {
        SpringApplication.run(GithubcicdactionsApplication.class, args);
    }

}
