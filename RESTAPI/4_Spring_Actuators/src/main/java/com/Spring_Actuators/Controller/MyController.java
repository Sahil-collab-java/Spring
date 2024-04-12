package com.Spring_Actuators.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @GetMapping("/hello")
    public String loadPage(){
        return "Hello World...........";
    }
}
