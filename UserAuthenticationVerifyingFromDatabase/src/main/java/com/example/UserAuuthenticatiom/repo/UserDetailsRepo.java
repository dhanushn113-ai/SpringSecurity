package com.example.UserAuuthenticatiom.repo;

import com.example.UserAuuthenticatiom.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDetailsRepo extends JpaRepository<Users, Integer> {   // Use Users, not User
    Users getByUsername(String username);
}