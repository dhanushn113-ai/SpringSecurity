package com.example.SpringSecurity;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Student {

    @GetMapping("std")
    public String student(){
        return "hello student";
    }
    @GetMapping("std/about")
    public String course(HttpServletRequest request){
        return "student is studying" + request.getSession().getId();
    }
}
