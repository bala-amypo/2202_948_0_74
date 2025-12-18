package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;
import jakarta.validation.Valid;

import java.util.*;

import com.example.demo.entity.*;
import com.example.demo.service.*;

@RestController
public class StudentController{
    
    @Autowired
    private StudentService service;

    @GetMapping("/getAllstudent")
    public List<studentEntity>getAll(){
        return service.getAll();

    }
    @PostMapping("/add")
    public StudentEntity addStudent(@Valid @RequestBody studentEntity student){
        return service.addstudent(student);
    }

}