package com.drk.spring_security.spring_security.controllers;

import com.drk.spring_security.spring_security.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
public class UserController {


    @GetMapping("/home")
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
