package com.learn.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/welcome")
public class welcomeControllers {

    @GetMapping
    public String welcome() {
        return "welcome to java springboot";
    }
}
