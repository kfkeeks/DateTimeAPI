package com.example.DateTimeAPI;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
public class Date {

    @GetMapping("/api")

    public LocalDate GetDate(){
        LocalDate date = LocalDate.now();
            return date;
    }
}
