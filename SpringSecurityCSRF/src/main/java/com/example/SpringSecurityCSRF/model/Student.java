package com.example.SpringSecurityCSRF.model;


import lombok.Data;

@Data
public class Student {
    private int rno;
    private String name;
    private String technology;

    public Student(int rno, String name, String technology) {
        this.rno = rno;
        this.name = name;
        this.technology = technology;
    }
}
