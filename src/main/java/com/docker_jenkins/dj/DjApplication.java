package com.docker_jenkins.dj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DjApplication {

    public static void main(String[] args) {
        SpringApplication.run(DjApplication.class, args);
    }

    @GetMapping("/v1")
    public String app(){
        return "WHAT..?";
    }
}
