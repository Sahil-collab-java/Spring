package com.springBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
	ConfigurableApplicationContext applicationContext = SpringApplication.run(Application.class, args);

		System.out.println(applicationContext.getClass().getName());
	}

}
