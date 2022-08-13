package com.example.gittest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello World!";
    }

    @PostMapping("/save-student")
    public String saveStudent() {
        return "Person was saved!";
    }

    @GetMapping("all-students")
    public String getStudents() {
        return "List of all students";
    }

}
