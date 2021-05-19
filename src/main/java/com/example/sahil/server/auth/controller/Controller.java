package com.example.sahil.server.auth.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("rest")
public class Controller {


    @GetMapping(path = "/hello")
    public String helloWorld(){
        return "Hello World";
    }
}
