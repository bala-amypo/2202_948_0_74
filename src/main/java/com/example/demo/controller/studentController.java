package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;
import jakarta.validation.valid;

import java.util.*;

import com.example.demo.entity.*;
import com.example.demo.service.*;

@RestController
public class studentController{
    
    @Autowired
    studentService service;

    @GetMapping("/getAllstudent")
    public List<studentEntity>getAll(){
        return service.getAll();

    }
    @postMapping("/add")
    public studentEntity addstudent(@Valid @RequestBody studentEntity student){
        return service.addstudent(student);
    }

}