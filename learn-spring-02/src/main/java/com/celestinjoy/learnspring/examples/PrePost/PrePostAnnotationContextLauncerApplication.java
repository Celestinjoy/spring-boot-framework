package com.celestinjoy.learnspring.examples.PrePost;

import jakarta.annotation.PostConstruct;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;
@Component
class SomeClass {
   private SomeDependency someDependency;

    public SomeClass(SomeDependency someDependency) {
        this.someDependency = someDependency;
        System.out.println("all dependents are ready");
    }
    @PostConstruct
    public void initialize() {
        someDependency.getReady();
    }
}
@Component
class SomeDependency {

    public void getReady() {
        System.out.println("some logic");
    }
}

@Configuration
@ComponentScan
public class PrePostAnnotationContextLauncerApplication {

    public static void main(String[] args) {
        try (var context = new AnnotationConfigApplicationContext(PrePostAnnotationContextLauncerApplication.class)) {
            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
        }
    }
}
