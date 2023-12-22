package com.celestin.restfulwebservices.user;

import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@Component
public class UserDaoService {

    private static List<User> users= new ArrayList<>();
    private int count = 5;


    static {
        users.add(new User(1,"mark", LocalDate.now().minusYears(10)));
        users.add(new User(2,"peter", LocalDate.now().minusYears(20)));
        users.add(new User(3,"thomas", LocalDate.now().minusYears(30)));
        users.add(new User(4,"roshan", LocalDate.now().minusYears(40)));
        users.add(new User(5,"akhil", LocalDate.now().minusYears(50)));
    }

    public List<User> retrieveAllUsers() {
        return users;
    }

    public User save(User user){
        user.setId(++count);
        users.add(user);
        return user;
    }

    public User findOne(int id) {
        Predicate<? super User> predicate = user -> user.getId().equals(id);
        return users.stream().filter(predicate).findFirst().orElse(null);
    }
}
