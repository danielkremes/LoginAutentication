package com.drk.spring_security.spring_security.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class UserController {

    @GetMapping("/")
    public String home() {
        return "Welcome Login Authentication";
    }

    @GetMapping("/user")
     public String getUser() {
        return "authorized user";
    }

    @GetMapping("/manager")
    public String managers() {
        return "Manager";
    }
}
