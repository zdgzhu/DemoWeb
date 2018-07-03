package com.example.demoww.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//http://localhost:8080/
@RestController
//@Controller
public class HelloController {

    @RequestMapping("/hello")
    public String hello() {
        return "hello,this is a springboot demo";
    }


//    @RequestMapping("/index")
//    public String index() {
//
//        return "index";
//    }








}
