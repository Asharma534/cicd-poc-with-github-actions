package com.example.tools.githubactions.cicd.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController{


    @GetMapping("/welcome")
    public String getStartUpMessage() {
        return "Welcome to CICD pipeline with github actions !!!!";
    }
}
