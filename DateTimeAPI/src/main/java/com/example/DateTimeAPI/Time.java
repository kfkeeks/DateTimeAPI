package com.example.DateTimeAPI;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalTime;

@RestController
public class Time {

    @GetMapping("/api")

    public LocalTime getTime(){
        LocalTime time = LocalTime.now();

            return time;
        }

}
