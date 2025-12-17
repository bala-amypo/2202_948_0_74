package com.example.demo.entity;

import jakarta.persistance.*;

@Entity
public class studentEntity{

    @Id
    @GenerateValue(strategy=GenerationType.IDENTITY)
    private Long id;

    @
    private String name;

    @Email(message="Email Format is not V")

}