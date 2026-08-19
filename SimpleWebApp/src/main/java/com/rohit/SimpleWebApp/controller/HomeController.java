package com.rohit.SimpleWebApp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("/")
    //@ResponseBody
    public String greet(){
        return "hello Rohit !!";
    }

    @RequestMapping("/about")
    public String about(){
        return "Welcome back Rohit bhai!!";
    }
}
