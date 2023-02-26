package com.louisviktor.rest.webservices.restfulwebservice.controllers;

import com.louisviktor.rest.webservices.restfulwebservice.user.User;
import com.louisviktor.rest.webservices.restfulwebservice.user.UserDaoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    private UserDaoService service;


    public UserController(UserDaoService service) {
        this.service = service;
    }


    @GetMapping(path = "/users")
    public ResponseEntity<List<User>> retrieveAllUser() {
        return ResponseEntity.ok(service.findAll());
    }

    @GetMapping(path = "/users/{id}")
    public ResponseEntity<User> retrieveUser(@PathVariable int id) throws UserNotFoundException {
        User user = service.findOne(id);
        if(user == null) {
            throw new UserNotFoundException("id-" + id);
        }
        return ResponseEntity.ok(user);
    }

    @PostMapping(path = "/users")
    public ResponseEntity<User> createUser(@RequestBody User user) {
        User savedUser = service.save(user);
        return ResponseEntity.created(null).body(savedUser);
    }
}
