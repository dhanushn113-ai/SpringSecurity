package com.example.studentAuthentication;

import com.example.studentAuthentication.Repository.UserDetailsRepository;
import com.example.studentAuthentication.model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;


@Service
public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    UserDetailsRepository repo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Users user = repo.findByUserName(username);
        if(user == null){
            throw new UsernameNotFoundException("User Not Found");
        }
        return new MyUserDetails(user);
    }
}
