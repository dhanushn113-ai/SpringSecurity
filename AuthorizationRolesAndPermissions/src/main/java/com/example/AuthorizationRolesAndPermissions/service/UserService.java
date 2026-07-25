package com.example.AuthorizationRolesAndPermissions.service;


import com.example.AuthorizationRolesAndPermissions.model.Users;
import com.example.AuthorizationRolesAndPermissions.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder(12);

    @Autowired
    UserRepo repo;

    public void addUsers(Users user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        repo.save(user);

    }
}
