package com.celestinjoy.learnspring.HelloWorld;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class App02HelloWorldSpring {
    public static void main(String[] args) {
        try(var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class)) {

            System.out.println(context.getBean("name"));
            System.out.println(context.getBean("myage"));
            System.out.println(context.getBean("person"));
            System.out.println(context.getBean("person2"));
            System.out.println(context.getBean("person3"));
            System.out.println(context.getBean("person4"));
            System.out.println(context.getBean("address2")); // calling the bean using name
            System.out.println(context.getBean(Address.class));  // calling the bean using its type

            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
        }
    }
}
