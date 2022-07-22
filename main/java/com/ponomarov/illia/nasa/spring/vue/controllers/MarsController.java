package com.ponomarov.illia.nasa.spring.vue.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//https://api.nasa.gov/mars-photos/api/v1/rovers/curiosity/photos?sol=2000&page=2&api_key=DEMO_KEY

@RestController
@RequestMapping("/mars")
public class MarsController {


    @GetMapping
    public String getInfoAboutMars(){

        return "HELLO ELON MASK";
    }


}
