package com.example.UserAuuthenticatiom.service;

import com.example.UserAuuthenticatiom.model.UserPrinciple;
import com.example.UserAuuthenticatiom.model.Users;
import com.example.UserAuuthenticatiom.repo.UserDetailsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    UserDetailsRepo repo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        System.out.println("🔍 Attempting to load user: " + username); // DEBUG LINE

        Users user = repo.getByUsername(username);

        if (user == null) {
            System.out.println("❌ User NOT found in database: " + username); // DEBUG LINE
            throw new UsernameNotFoundException("No User");
        }

        System.out.println("✅ User found! Password in DB: " + user.getPassword()); // DEBUG LINE

//        return User.builder()
//                .username(user.getUsername())
//                .password(user.getPassword())
//                .roles("USER")
//                .build();

        return new UserPrinciple(user);


    }
}
