package com.louisviktor.rest.webservices.restfulwebservice.user;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserDaoService {
    private static List<User> users = new ArrayList<>();

    static {
        users.add(new User(1, "Adam", "01/01/2000"));
        users.add(new User(2, "Eve", "01/01/2000"));
        users.add(new User(3, "Jack", "01/01/2000"));
    }

    public List<User> findAll() {
        return users;
    }
}
