package com.example.AuthorizationRolesAndPermissions.controller;


import com.example.AuthorizationRolesAndPermissions.model.Users;
import com.example.AuthorizationRolesAndPermissions.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("admin/add-user")
    public void addUsers(@RequestBody Users user){
        userService.addUsers(user);
    }
}
