package com.example.demo.controller;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserRestController {

    private final UserService service;

    @Autowired
    public UserRestController(UserService service) {
        this.service = service;
    }

    @RequestMapping(value = "/users",
            method = RequestMethod.GET,
            produces = "application/json;charset=UTF-8"
    )
    public List<User> findAllUsers() {
        return service.findAllUsers();
    }

    @RequestMapping(value = "/users/age/{age}",
            method = RequestMethod.GET,
            produces = "application/json;charset=UTF-8"
    )
    public List<User> findAllByAge(@PathVariable int age) {
        return service.findAllByAge(age);
    }

}