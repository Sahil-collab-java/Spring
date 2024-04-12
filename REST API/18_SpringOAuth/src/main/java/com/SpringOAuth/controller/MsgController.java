package com.SpringOAuth.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MsgController {

    @GetMapping("/")
    public String hello(){
        return "Welcome To O Auth ";
    }
}
