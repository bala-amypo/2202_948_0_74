package com.example.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.*;

import com.example.demo.service.*;
import com.example.demo.repository.*;
import com.example.demo.entity.*;
import java.util.*;

import org.springframework.beans.factory.annotations.Autowired;

@Service
public class studentServiceImpl implements studentService{

    @Autowired
    studentRepo rep;

    public List<studentEntity>getAll(){
        return repo.findAll();
    }
    public studentEntity addstudent(studentEntity student){
        return repo.save(student);
    }
    public studentEntity getbyId(Long id){
          return repo.findById(id).orElseThrow

}
