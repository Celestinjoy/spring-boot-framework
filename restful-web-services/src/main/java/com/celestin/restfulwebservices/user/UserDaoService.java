package com.celestin.restfulwebservices.user;

import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
@Component
public class UserDaoService {

    private static List<User> users= new ArrayList<>();
    private static int count=5;

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

    public void saveUser(String name){
        count++;
        users.add(new User(count,name,LocalDate.now().minusYears(60)));
    }

    public User findOne(Integer id) {
        for (User user :users){
            if (user.getId() == id){
                return user;
            }
        }
        return null;
    }
}
