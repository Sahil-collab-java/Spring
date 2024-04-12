package com.RestExceptionHandling.Controller;

import com.RestExceptionHandling.Exception.UserException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExceptionController {

    @GetMapping("/hi")
    public String loadPage(){
        int i=10/0;
        return "Welcome Man.......";
    }

    @GetMapping("/getUser/{userId}")
    public String getUser(@PathVariable ("userId") Integer userId) throws Exception{

        if(userId==100){
            return "Sahil";
        } else if (userId==200) {
            return "Sam";
        }else {
             throw new UserException("User not Found.........");
        }
    }
}
