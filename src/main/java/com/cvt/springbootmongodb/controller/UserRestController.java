package com.cvt.springbootmongodb.controller;

import com.cvt.springbootmongodb.model.User;
import com.cvt.springbootmongodb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserRestController {

    @Autowired
    UserService userService;

    @GetMapping("/users")
    public List<User> getAllUser(){
        return userService.getAll();
    }

    @GetMapping("/users/{id}")
    public User getUserById(@PathVariable int id){
        return userService.getById(id);
    }

    @PostMapping("/users")
    public User saveUser(@RequestBody User user){
        return  userService.save(user);
    }

    @PutMapping("/users/{id}")
    public User updateUserById(@PathVariable int id,@RequestBody User user){
        return  userService.update(id,user);
    }

    @DeleteMapping("/users/{id}")
    public String deleteUserById(@PathVariable int id){
        userService.delete(id);
        return "User is Deleted Successfully ..";
    }
}
