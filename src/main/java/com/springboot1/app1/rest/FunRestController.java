package com.springboot1.app1.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // To Set up a rest controller
class FunRestController {
    @Value("${my.name}")
    private String myName;

    // expose "/" EP that returns "Hello World"
    @GetMapping("/") // To Handle HTTP get Requestcs
    public String sayHello() {
        return "Hello World";
    }

    @GetMapping("/workout")
    public String getDailyWorkout() {
        return "Go To Gym";
    }
    @GetMapping("/my-name")
    public String getMyName() {
        return myName;
    }

    @PostMapping("/add-book")
    public String postBook() {
        return "Added";
    }
}
