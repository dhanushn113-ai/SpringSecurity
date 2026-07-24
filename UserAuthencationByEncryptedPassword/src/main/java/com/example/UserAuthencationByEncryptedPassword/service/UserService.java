package com.example.UserAuthencationByEncryptedPassword.service;

import com.example.UserAuthencationByEncryptedPassword.model.Users;
import com.example.UserAuthencationByEncryptedPassword.repository.MyUserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

   BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder(12);

    @Autowired
    MyUserRepo repo;

    public void addUsers(Users user) {

        user.setPassword(passwordEncoder.encode(user.getPassword()));

        repo.save(user);

    }
}

