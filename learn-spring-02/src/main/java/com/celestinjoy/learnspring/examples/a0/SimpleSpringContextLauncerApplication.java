package com.celestinjoy.learnspring.examples.a0;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;


@Configuration
@ComponentScan
public class SimpleSpringContextLauncerApplication {

    public static void main(String[] args) {
        try (var context = new AnnotationConfigApplicationContext(SimpleSpringContextLauncerApplication.class)) {
            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
        }
    }
}
