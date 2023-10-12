package com.example.demo.rest;

import com.example.demo.bean.Coach;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoIocController {

    private Coach myCoach;

    public DemoIocController(Coach myCoach) {
        this.myCoach = myCoach;
    }

    @GetMapping("/dailyactivity")
    public String getDailyActivity(){
        return myCoach.getDailyActivity();
    }
}
