package com.celestinjoy.learnspring.examples.BussinessCalculationService;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;



@Configuration
@ComponentScan
public class RealWorldAppLauncerApplication {

    public static void main(String[] args) {
        try (var context = new AnnotationConfigApplicationContext(RealWorldAppLauncerApplication.class)) {
            System.out.println(context.getBean(BussinessCalculationService.class).findMax());
        }
    }
}
