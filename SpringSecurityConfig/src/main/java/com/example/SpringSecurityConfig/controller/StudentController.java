package com.example.SpringSecurityConfig.controller;

import com.example.SpringSecurityConfig.model.Student;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@RestController
public class StudentController {


    List<Student> students = new ArrayList<>(
            Arrays.asList(
                    new Student(1,"arjun","java"),
                    new Student(2,"vijay","python")
            )
    );

    @GetMapping("std")
    public List<Student> getAllStudents() {
        return students;
    }

    @GetMapping("std/about")
    public String getStudents(HttpSession httpSession){
        return "about page" + httpSession.getId();
    }
    @GetMapping("csrf_token")
    public CsrfToken getCsrfToken(HttpServletRequest request){
        return (CsrfToken) request.getAttribute("_csrf");
    }

}
