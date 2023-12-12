package com.celestin.JPAandHibernate.SpringJpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class SpringJpaCommandLineRunner implements CommandLineRunner {
    @Autowired
    private SpringJpaRepository repository;
    @Override
    public void run(String... args) throws Exception {
        repository.save(new Course(1,"learn java","edwin"));
        repository.save(new Course(2,"learn azure","stephen"));
        repository.save(new Course(3,"learn aws","antony"));


        repository.deleteById(3l);

        System.out.println(repository.findById(1l));
        System.out.println(repository.findById(2l));

        System.out.println(repository.findAll());

    }
}
