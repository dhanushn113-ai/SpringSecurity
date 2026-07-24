package com.example.UserAuthencationByEncryptedPassword.service;


import com.example.UserAuthencationByEncryptedPassword.model.UserPrinciple;
import com.example.UserAuthencationByEncryptedPassword.model.Users;
import com.example.UserAuthencationByEncryptedPassword.repository.MyUserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyUSerService implements UserDetailsService {

    @Autowired
    MyUserRepo repo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        Users user = repo.getByUsername(username);

        if(user == null) {
            throw  new UsernameNotFoundException("user not Found");
        }
        return new UserPrinciple(user);
    }
}
