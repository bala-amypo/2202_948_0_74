package com.example.demo.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;

@Entity
public class studentEntity{

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message="Name is not valid")
    private String name;

    @Email(message="Email Format is not Valid")
    private String email;

    public void setId(Long id){
        this.id=id;
    }
    public Long getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public void setName(string name){
        this.name=name;
    }
    public string getEmail(){
        return email;
    }
    public void setEmail(string email){
        return email;
    }
    public studentEntity(){

    }

    public studentEntity(Long id,String name,String email){
        this.id=id;
        this.name=name;
        this.email=email;
    }

}