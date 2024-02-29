package com.springThymleaf.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class MsgController {

    @GetMapping("/hello")
    public String hello(Model model){
        model.addAttribute("msg","Hello World !!!!");
        return "index";
    }

    @GetMapping("/greet")
    public String greet(Model model){
        model.addAttribute("msg","Good Morning !!!!!!!!");
        return "index";
    }
}
