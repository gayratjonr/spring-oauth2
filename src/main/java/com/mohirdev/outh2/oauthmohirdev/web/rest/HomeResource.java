package com.mohirdev.outh2.oauthmohirdev.web.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HomeResource {


    @GetMapping("/hello")
    public String hello() {
        return "Hello";
    }

    @GetMapping("/account")
    public String getAccount() {
        return "Account";
    }
}
