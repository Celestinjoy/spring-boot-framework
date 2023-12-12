package com.celestin.JPAandHibernate.Jpa;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class JpaCommandLineRunner implements CommandLineRunner {
    @Autowired
    private JpaRepository repository;
    @Override
    public void run(String... args) throws Exception {
        //repository.insert01();
        repository.insert(new Course(1,"learn java","edwin"));
        repository.insert(new Course(2,"learn azure","stephen"));
        repository.insert(new Course(3,"learn aws","antony"));

        repository.deleteById(3);

        System.out.println(repository.findById(2));
        System.out.println(repository.findById(1));

    }
}
