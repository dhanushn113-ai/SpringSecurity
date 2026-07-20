package com.example.MultipleUsersInSpringSecurity.model;


import lombok.Data;

@Data
public class Student {
    private int age;
    private String name;
    private String technology;

    public Student(int age, String name, String technology) {
        this.age = age;
        this.name = name;
        this.technology = technology;
    }
}
