package com.example.UserAuthencationByEncryptedPassword.controller;



import com.example.UserAuthencationByEncryptedPassword.model.Users;
import com.example.UserAuthencationByEncryptedPassword.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/add")
    public void addUsers(@RequestBody Users user){
        userService.addUsers(user);


    }

}

