package com.firstapp.first_spring_app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/simple/apis")
public class SimpleController {

    @GetMapping("/getSimple")
    public String simpleApi(){
        return "This is our First simple API";
    }
}
