package com.example.serverdeploytest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoggingController {

    @Value("${logging-module.version}")
    private String version;

    @GetMapping("/")
    public String version() {
        return String.format("project version : %s",version);
    }

    @GetMapping("/health")
    public String checkHealth(){
        return "healthy";
    }
}
