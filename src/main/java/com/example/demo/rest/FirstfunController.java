package com.example.demo.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstfunController {

    @GetMapping("/")
    public String sayHello(){
        return "Hello There...! us is spring Boot app";
    }
}
