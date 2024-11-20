package com.firstapp.first_spring_app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sample/apis")
public class SampleController {

    @GetMapping("/getSample")
    public String sampleApi(){
        return "This is our First sampleAPI";
    }

    @GetMapping("/getSample2")
    public String sampleApi2(){
        return "This is our second sample API";
    }
}
