package com.dockerdemo.dockerdemo.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/info")
public class MyController {

    @Value("${myapp.name}")
    String appName;

    @GetMapping
    public String getInfo(){
        return "App=" +  appName +" with recent changes and these are some more." ;
    }

    @GetMapping("/docker")
    public String getDockerInfo(){
        return "I'm hot-reload enabled with remote configuration.";
    }
}
