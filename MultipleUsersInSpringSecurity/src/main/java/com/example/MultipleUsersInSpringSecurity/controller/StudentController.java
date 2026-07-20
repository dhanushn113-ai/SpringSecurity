package com.example.MultipleUsersInSpringSecurity.controller;


import com.example.MultipleUsersInSpringSecurity.model.Student;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class StudentController {

    List<Student> students = new ArrayList<>(
            Arrays.asList(
                    new Student(1,"anbu","java"),
                    new Student(2,"vijay","python")
            )

    );

    @GetMapping("std")
    public List<Student> getAllStudents(){
        return students;
    }

    @GetMapping("/")
    public String studentPage(@RequestBody Student student){
        return "student Page";
    }

    @GetMapping("std/about")
    public String getStudents(HttpSession session){
        return "about page" + session.getId();
    }
    @GetMapping("csrfToken")
    public CsrfToken getCsrfToken(HttpServletRequest request){
        return (CsrfToken) request.getAttribute("_csrf");
    }


}
