package com.myasnikov.springbood.crud.spring_boot_crud.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import com.myasnikov.springbood.crud.spring_boot_crud.model.User;
import com.myasnikov.springbood.crud.spring_boot_crud.service.UserService;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api")
public class MyRestController {
    private final UserService userService;

    @GetMapping("/users")
    public List<User> allUsers() {
        List<User> users = userService.getAllUsers();
        return users;
    }

    @PostMapping("/new")
    public User addUser(@RequestBody User user) {
        userService.saveUser(user);
        return user;
    }
    @DeleteMapping("/user/{id}")
    public void deleteUserById(@PathVariable("id") long id){
        userService.deleteUser(id);
    }
}