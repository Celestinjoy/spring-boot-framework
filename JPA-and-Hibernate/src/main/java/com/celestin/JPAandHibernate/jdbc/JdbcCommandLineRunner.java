package com.celestin.JPAandHibernate.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class JdbcCommandLineRunner implements CommandLineRunner {
    @Autowired
    private JdbcRepository repository;
    @Override
    public void run(String... args) throws Exception {

        repository.insert02(new Course(1,"learn java","edwin"));
        repository.insert02(new Course(2,"learn azure","stephen"));
        repository.insert02(new Course(3,"learn aws","antony"));

        repository.deleteByID(3);

        System.out.println(repository.findById(2));

    }
}
