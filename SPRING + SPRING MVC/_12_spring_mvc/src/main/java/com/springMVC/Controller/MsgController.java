package com.springMVC.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MsgController {

    @GetMapping("/welcome")
    public ModelAndView welcome(){
        ModelAndView modelAndView =  new ModelAndView();
        modelAndView.addObject("msg","Welcome to Spring MVC");
        modelAndView.setViewName("message");
        return modelAndView;
    }

    @GetMapping("/greet")
    public ModelAndView greet(){
        ModelAndView modelAndView =  new ModelAndView();
        modelAndView.addObject("msg","Good Morning...........");
        modelAndView.setViewName("message");
        return modelAndView;
    }
}
