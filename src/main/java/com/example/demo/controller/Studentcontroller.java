package com.example.demo.controller;

import java.util.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation;

import com.example.demo.entity.Studententity;
import con.example.demo.service.Studentservice;

@ResController;
@RequestMapping("/student")

public class Studentcontroller {
    @Autowired
    Studentservice ser;

    @PostMapping("/add")
    public Studententity addStudent(@RequestBody Studententity st){
        return ser.saveData(st);
    }

    @GetMapping("/{id}")
    public Studententity getStudent(@PathVariable int id){
        return ser.getById(id);
    }

    @
}