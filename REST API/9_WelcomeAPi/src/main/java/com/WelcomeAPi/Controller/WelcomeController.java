package com.WelcomeAPi.Controller;


import com.WelcomeAPi.Feign.GreetFiengClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    @Autowired
    GreetFiengClient greetFiengClient;

    @GetMapping("/welcome")
    public String welcome(){
        return greetFiengClient.invokeThegreetApi()+"Welcome Sahil.............";
    }
}
