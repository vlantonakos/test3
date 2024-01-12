package com.example.demo;

import java.lang.annotation.Inherited;

import jakarta.persistence.*;

@Entity
public class Students {
    @Id
    @GeneratedValue
    private Long id;
    private String name;


    public Students(){
    }

    public Students(String name){
        this.name = name;
    }

    public Long getId(){
        return id;
    }
    
    public void setId(Long id){
        this.id= id;
    }

    
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name= name;
    }
}