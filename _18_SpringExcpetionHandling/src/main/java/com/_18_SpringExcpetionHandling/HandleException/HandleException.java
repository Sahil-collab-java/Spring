package com._18_SpringExcpetionHandling.HandleException;

import com._18_SpringExcpetionHandling.Controller.MsgController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class HandleException {
    private Logger logger = LoggerFactory.getLogger(MsgController.class);

    @ExceptionHandler(value = Exception.class)
    public String handleException (Exception e){
        String exception =  e.getMessage();
        logger.error(exception);
        return "errorPage";
    }
}
