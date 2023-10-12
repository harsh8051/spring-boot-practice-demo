package com.example.demo.bean;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach{
    @Override
    public String getDailyActivity() {
        return "Practice Fast Bowling for 20 min";
    }
}
