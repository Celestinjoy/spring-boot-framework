package com.celestin.restfulwebservices.database;


import com.celestin.restfulwebservices.post.Post;
import com.celestin.restfulwebservices.user.User;
import com.celestin.restfulwebservices.user.UserDaoService;
import com.celestin.restfulwebservices.user.UserNotFoundException;
import jakarta.validation.Valid;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

@RestController
public class UserJpaController {

    private UserDaoService service;
    private UserRepository repository;


    public UserJpaController(UserDaoService service, UserRepository repository) {
        this.service = service;
        this.repository=repository;
    }

    @GetMapping("/jpa/users")
    public List<User> getAllUser() {
        return repository.findAll();
    }

    @GetMapping("/jpa/users/{id}")
    public EntityModel<User> retrieveUser(@PathVariable Integer id) {
        Optional<User> user = repository.findById(id);
        if (user.isEmpty())
            throw new UserNotFoundException("id:" +id);

        EntityModel<User> entityModel = EntityModel.of(user.get());
        WebMvcLinkBuilder link = linkTo(methodOn(this.getClass()).getAllUser());
        entityModel.add(link.withRel("all-users"));
        return entityModel;
    }

    @DeleteMapping("/jpa/users/{id}")
    public void deleteUser(@PathVariable Integer id) {
        repository.deleteById(id);
    }

    @PostMapping("/jpa/users")
    public ResponseEntity<User> setUser(@Valid @RequestBody User user) {
        User savedUser = repository.save(user);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(savedUser.getId())
                .toUri();

        return ResponseEntity.created(location).build();
    }

    @GetMapping("/jpa/users/{id}/posts")
    public List<Post> getPosts(@PathVariable int id) {
        Optional<User> user = repository.findById(id);
        if (user.isEmpty())
            throw new UserNotFoundException("id:" +id);
        return user.get().getPosts();
    }
}
