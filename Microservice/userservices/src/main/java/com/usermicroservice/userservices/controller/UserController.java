package com.usermicroservice.userservices.controller;



import com.usermicroservice.userservices.model.UserModel;
import com.usermicroservice.userservices.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserServices services;

    //create user
    @PostMapping()
    public UserModel addUser(@RequestBody UserModel userModel)
    {
        return  services.createUser(userModel);
    }

    //get all users
    @GetMapping
    public List<UserModel> getAllUsers()
    {
        return services.getAllUsers();
    }

    //get user by id
    @GetMapping(value = "/{userId}")
    public UserModel getUserById(@PathVariable("userId") @RequestBody String userId)
    {
       return services.getUsersById(userId);
    }
}
