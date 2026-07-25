package com.example.AuthorizationRolesAndPermissions.controller;


import com.example.AuthorizationRolesAndPermissions.model.Student;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.security.web.server.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class StudentController {

    List<Student> students = new ArrayList<>(
            Arrays.asList(
                    new Student(1,"Anbu","java"),
                    new Student(2,"Vijay","python")
            )
    );


    @GetMapping("std")
    public List<Student> getAllStudents(){
        return students;
    }
    @GetMapping("about")
    public String aboutPage(HttpSession httpSession){
        return "about page" + httpSession.getId();
    }

    @GetMapping("csrfToken")
    public CsrfToken getCsrfToken(HttpServletRequest http){
        return (CsrfToken) http.getAttribute("_csrf");
    }
    @GetMapping("std/study")
    public String getStudy(){
        return "Student is Studying";
    }
    @GetMapping("/public/demo")
    public String demo(){
        return "public page demo";
    }
}
