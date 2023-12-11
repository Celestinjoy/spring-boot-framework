package com.celestin.JPAandHibernate.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class JdbcCommandLineRunner implements CommandLineRunner {
    @Autowired
    private CourseJdbcRepository repository;
    @Override
    public void run(String... args) throws Exception {
        //repository.insert01();
        repository.insert02(new Course(1,"learn java","edwin"));
        repository.insert02(new Course(2,"learn azure","stephen"));
        repository.insert02(new Course(3,"learn aws","antony"));

        repository.delete(3);

    }
}
