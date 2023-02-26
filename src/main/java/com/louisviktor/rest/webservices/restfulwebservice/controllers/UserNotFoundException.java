package com.louisviktor.rest.webservices.restfulwebservice.controllers;

import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = org.springframework.http.HttpStatus.NOT_FOUND)
public class UserNotFoundException extends Throwable {
    public UserNotFoundException(String s) {
        super(s);
    }
}
