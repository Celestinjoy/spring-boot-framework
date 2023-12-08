package com.celestinjoy.learnspring.examples.LazyInitialization;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import java.util.Arrays;
@Component
class ClassA {

}
@Component
@Lazy                 // initialization of classB will not happen at launch of spring context. will only happen if we use classB.
class ClassB {
    private ClassA classA;
    public ClassB(ClassA classA ) {
        System.out.println("some initialization logic");
        this.classA = classA;
    }
}

@Configuration
@ComponentScan
public class LazyInitializationLauncerApplication {

    public static void main(String[] args) {
        try (var context = new AnnotationConfigApplicationContext(LazyInitializationLauncerApplication.class)) {
            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
        }
    }
}
