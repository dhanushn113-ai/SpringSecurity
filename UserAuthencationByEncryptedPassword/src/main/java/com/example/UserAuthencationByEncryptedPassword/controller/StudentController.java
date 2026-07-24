package com.example.UserAuthencationByEncryptedPassword.controller;


import com.example.UserAuthencationByEncryptedPassword.model.Student;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.web.server.csrf.CsrfToken;
import org.springframework.stereotype.Repository;
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

   @GetMapping("stu")
    public List<Student> getAllStudents(){
       return students;
   }
   @GetMapping("std/about")
    public String aboutStudent(HttpSession httpSession){
       return "Student are Studying" +httpSession.getId();
   }
   @GetMapping("csrfToken")
    public CsrfToken getCsrfToken(HttpServletRequest httpServletRequest){
       return (CsrfToken) httpServletRequest.getAttribute("_csrf");
   }
}
