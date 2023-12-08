package com.celestinjoy.learnspring.examples.BeanScopes;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.Arrays;
@Component               //each time a bean is called same instance of bean is created
class NormalClass{

}
@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)  //each time a bean is called a new instance of bean is created
class ProtoTypeClass{

}

@Configuration
@ComponentScan
public class BeanScopesLauncerApplication {

    public static void main(String[] args) {
        try (var context = new AnnotationConfigApplicationContext(BeanScopesLauncerApplication.class)) {
            System.out.println(context.getBean(NormalClass.class));
            System.out.println(context.getBean(NormalClass.class));
            System.out.println(context.getBean(NormalClass.class));  //checking the bean creation using hashcode.

            System.out.println(context.getBean(ProtoTypeClass.class));
            System.out.println(context.getBean(ProtoTypeClass.class));
            System.out.println(context.getBean(ProtoTypeClass.class));
        }
    }
}
