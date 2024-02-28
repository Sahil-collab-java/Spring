package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

        CarService carService = context.getBean(CarService.class);
        carService.driveCar();

//        System.out.println(carService.hashCode());
//
//        CarService carService2 = context.getBean(CarService.class);
//        // carService.driveCar();
//
//        System.out.println(carService2.hashCode());




    }
}