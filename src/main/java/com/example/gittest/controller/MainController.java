package com.example.gittest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MainController {

    @Autowired
    public ProductService productService;

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

    @GetMapping("all-product")
    public List<String> getProducts() {
        return productService.getAllProducts();
    }

}
