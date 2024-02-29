package com.spring.Service;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


@Component
public class UserDAO  {

    @PostConstruct
    public void init() {
        System.out.println("getting db connection...");
    }
    public void getData() {
        System.out.println("getting data from db....");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("closing db connection...");
    }

}
