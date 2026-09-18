package com.rohit.SimpleWebApp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
        // studing new annotations
    // done with basic annotations
    //will be completeing this by this week
    @RequestMapping("/login")
    public String login(){
        return "You are   logged in!!";
    }

}
