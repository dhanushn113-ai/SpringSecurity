package com.example.AuthorizationRolesAndPermissions.service;

import com.example.AuthorizationRolesAndPermissions.model.UserPrinciple;
import com.example.AuthorizationRolesAndPermissions.model.Users;
import com.example.AuthorizationRolesAndPermissions.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyUSerService implements UserDetailsService {

    @Autowired
    UserRepo repo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        Users user = repo.getByUsername(username);

        if(user == null) {
            throw  new UsernameNotFoundException("user not Found");
        }
        return new UserPrinciple(user);
    }
}

