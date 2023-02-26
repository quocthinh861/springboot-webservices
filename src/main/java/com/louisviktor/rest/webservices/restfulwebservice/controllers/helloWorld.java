package com.louisviktor.rest.webservices.restfulwebservice.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloWorld {
    @GetMapping(path = "/hello-world")
    public String SayHello() {
        return "Hello World";
    }
}
