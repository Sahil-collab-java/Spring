package com.spring;

import com.spring.Config.DatabaseConfig;
import com.spring.Pojo.User;
import com.spring.Service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(DatabaseConfig.class);

        UserService userService = context.getBean(UserService.class);

        User user = new User();


        user.setEmail("sahil@gmail.com");
        user.setUsername("sahil");

        userService.saveUser(user);

        System.out.println("User saved successfully!");

    }
}
