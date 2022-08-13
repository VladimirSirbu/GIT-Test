package com.example.gittest.controller;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    public List<String> getAllProducts() {
        return List.of("A", "B", "C", "D");
    }
}
