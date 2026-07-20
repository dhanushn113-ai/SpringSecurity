package com.example.SpringSecurityCSRF.controller;

import com.example.SpringSecurityCSRF.model.Student;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class Studentcontroller {

    List<Student> students = new ArrayList<>(
            Arrays.asList(
                    new Student(1, "arjun", "java"),
                    new Student(2,"vijay","python")

            )
    );


    @GetMapping("/student")
    public List<Student> getAllStudents(){
        return students;
    }

    @PostMapping("/student")
    public void addStudents(@RequestBody Student student){
         students.add(student);
    }

    @GetMapping("csrf_token")
    public CsrfToken getCsrfToken(HttpServletRequest request){
        return (CsrfToken) request.getAttribute("_csrf");
    }




}
