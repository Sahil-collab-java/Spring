package com.Greet_Api.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetController {

    @Autowired
    private Environment environment;

    @GetMapping("/greet")
    public String greet(){
       String port = environment.getProperty("server.port");
        return "Good Morning.............}"+port;
    }
}
