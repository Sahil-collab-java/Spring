package com.spring;

import com.spring.DTO.User;
import com.spring.Service.UserDAO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context =  new AnnotationConfigApplicationContext(UserDAO.class);

        UserDAO userDAO = context.getBean(UserDAO.class);



        userDAO.getData();

        ConfigurableApplicationContext applicationContext = (ConfigurableApplicationContext) context;

        applicationContext.close();
    }
}