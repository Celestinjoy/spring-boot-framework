package com.celestinjoy.learnspring.examples.a1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;
@Component
class YourBusinessClass{
   // @Autowired                        // dependency injection through field
    Dependency1 dependency1;

   // @Autowired                       // dependency injection through field
    Dependency2 dependency2;


    public YourBusinessClass(Dependency1 dependency1, Dependency2 dependency2) {  // RECOMMENDED...dependency injection through constructor
        this.dependency1 = dependency1;
        this.dependency2 = dependency2;
    }

//    @Autowired
//    public void setDependency1(Dependency1 dependency1) {   // dependency injection through setter
//        this.dependency1 = dependency1;
//    }

//    @Autowired
//    public void setDependency2(Dependency2 dependency2) {
//        this.dependency2 = dependency2;
//    }

    public String toString() {
        return "using " + dependency1 + " and " + dependency2;
    }
}


@Component
class Dependency1{

}
@Component
class Dependency2{

}

@Configuration
@ComponentScan
public class DepInjectionLauncerApplication {

    public static void main(String[] args) {
        try (var context = new AnnotationConfigApplicationContext(DepInjectionLauncerApplication.class)) {
            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
            System.out.println(context.getBean(YourBusinessClass.class));
        }
    }
}
