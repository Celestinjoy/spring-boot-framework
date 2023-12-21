package com.celestin.restfulwebservices.user;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    private UserDaoService userDaoService;

    public UserController(UserDaoService userDaoService) {
        this.userDaoService = userDaoService;
    }

    @GetMapping("/users")
    public List<User> getAllUser() {
        return userDaoService.retrieveAllUsers();
    }

    @GetMapping("/users/{name}")
    public void setUser(@PathVariable String name) {
        userDaoService.saveUser(name);
    }

    @GetMapping("/users/id/{id}")
    public User findById(@PathVariable Integer id) {
        return userDaoService.findOne(id);
    }
}
