package com.springboot1.app1.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // To Set up a rest controller
public class FunRestController {


    // expose "/" EP that returns "Hello World"
    @GetMapping("/") // To Handle HTTP get Requestcs
    public String sayHello() {
        return "Hello World";
    }

    @GetMapping("/workout")
    public String getDailyWorkout() {
        return "Go To Gym";
    }
}
