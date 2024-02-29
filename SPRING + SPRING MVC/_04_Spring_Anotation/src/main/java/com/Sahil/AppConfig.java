package com.Sahil;

import com.Sahil.Service.Vechicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class AppConfig {

    public AppConfig() {
        System.out.println("App Config Constructor");
    }

    @Bean
    public Vechicle getBean(){
        Vechicle vechicle = new Vechicle();
        return vechicle;
    }
}
