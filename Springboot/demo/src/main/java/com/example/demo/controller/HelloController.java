package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Value("${welcome.message}")
    private String msg;

    @GetMapping(value = "/")
    public String helloWorld(){
        return msg;
    }
}