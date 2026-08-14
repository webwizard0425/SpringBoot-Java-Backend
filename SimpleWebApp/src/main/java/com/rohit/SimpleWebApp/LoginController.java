package com.rohit.SimpleWebApp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
        // studing new annotations
    // done with basic annotations
    @RequestMapping("/login")
    public String login(){
        return "You are logged in!!";
    }

}
