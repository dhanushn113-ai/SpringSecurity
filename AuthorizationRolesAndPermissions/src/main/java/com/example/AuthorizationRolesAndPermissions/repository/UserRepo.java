package com.example.AuthorizationRolesAndPermissions.repository;

import com.example.AuthorizationRolesAndPermissions.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<Users,Integer> {

    Users getByUsername(String username);
}
