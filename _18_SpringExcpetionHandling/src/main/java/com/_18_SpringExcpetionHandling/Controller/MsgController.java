package com._18_SpringExcpetionHandling.Controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MsgController {



    @GetMapping("/msg")
    public String msg(Model model){
        model.addAttribute("msg","Hello World.....");
        return "index";
    }

    @GetMapping("/exception")
    public String exception(Model model){
        int i = 100/0;
        model.addAttribute("msg","Exception");
        return "index";
    }



}
