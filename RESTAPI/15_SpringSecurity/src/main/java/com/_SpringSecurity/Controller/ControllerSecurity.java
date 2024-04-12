package com._SpringSecurity.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerSecurity {

    @GetMapping("/hello")
    public String hello(){
        return "HELLO WORLD !!!!!!";
    }

    @GetMapping("/loginCheck")
    public String loginCheck(){
        return "Login Check  !!!!!!";
    }

    @GetMapping("/about")
    public String about(){
        return "ABOUT US !!!!!!";
    }
}
