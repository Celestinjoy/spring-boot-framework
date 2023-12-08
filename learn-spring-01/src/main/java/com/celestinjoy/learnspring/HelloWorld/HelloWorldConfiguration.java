package com.celestinjoy.learnspring.HelloWorld;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

record Person(String name, int age,Address address) {};
record Address(String housename, String city) {};

@Configuration
public class HelloWorldConfiguration {

    @Bean
    public String name() {
        return "amal";
    }

    @Bean(name = "myage")
    public int age() {
        return 30;
    }

    @Bean
    public Person person() {
        return new Person("alan", 25, new Address("goldvilla", "banglore"));
    }

    @Bean
    public Person person2() {  // method calling way
        return new Person(name(), age(), address());
    }

    @Bean
    public Person person3(String name, int age, Address address2) {     // parameter way
        return new Person(name, age, address2);
    }
    @Bean
    public Person person4(String name, int age, @Qualifier ("address2qaulifier")Address address2) {     // parameter way
        return new Person(name, age, address2);
    }

    @Bean
    @Primary
    public Address address() {
        return new Address("rosevilla", "chennai");
    }

    @Bean(name = "address2")
    @Qualifier ("address2qaulifier")
    public Address address2() {
        return new Address("silvervilla", "delhi");
    }
}