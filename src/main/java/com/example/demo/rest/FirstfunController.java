package com.example.demo.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstfunController {


    @Value("${coach.name}") private String coachName;
    @Value("${team.name}") private String teamName;
    @GetMapping(value = "/")
    public String sayHello(){
        return "Hello There...! coach "+coachName+" from "+teamName;
    }
}
