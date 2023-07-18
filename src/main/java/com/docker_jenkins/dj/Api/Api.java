package com.docker_jenkins.dj.Api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Api {

    @GetMapping("/v1")
    public String app(){
        return "...?";
    }

}
