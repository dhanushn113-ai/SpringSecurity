package com.example.UserAuthencationByEncryptedPassword.repository;

import com.example.UserAuthencationByEncryptedPassword.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface MyUserRepo extends JpaRepository<Users, Integer> {

    Users getByUsername(String username);
}
