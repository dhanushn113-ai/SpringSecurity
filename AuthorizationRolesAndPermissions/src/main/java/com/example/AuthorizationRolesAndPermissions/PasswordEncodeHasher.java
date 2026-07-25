package com.example.AuthorizationRolesAndPermissions;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class  PasswordEncodeHasher {
    public static void main(String[] args) {
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder(12);
        String pt = "admin1234";
        String hashPassword = passwordEncoder.encode(pt);
        System.out.println(hashPassword+":");
    }
}
