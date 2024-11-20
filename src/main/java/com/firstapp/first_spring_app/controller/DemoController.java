package com.firstapp.first_spring_app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo/apis")
public class DemoController {

    @GetMapping("/getDemo")
    public String demoApi(){
        return "This is our First demo API";
    }
}
