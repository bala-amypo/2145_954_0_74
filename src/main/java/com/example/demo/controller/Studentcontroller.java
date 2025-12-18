package com.example.demo.controller;

import java.util.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.Studententity;
import com.example.demo.service.Studentservice;

@RestController 
@RequestMapping("/student")

public class Studentcontroller {  //class 
    @Autowired
    Studentservice ser;

    @PostMapping("/add") //
    public Studententity addStudent(@RequestBody Studententity st){
        return ser.saveData(st);
    }

    @GetMapping("/{id}")
    public Studententity getStudent(@PathVariable int id){
        return ser.getById(id);
    }

    @GetMapping("/add")
    public Collection<Studententity>getAllStudents(){
        return ser.getAll();
    }

    @PutMapping("/update/{id}")
    public Studententity updateStudent(@PathVariable int id , @RequestBody Studententity st){
        Studententity updated = ser.updateStudent(id,st);
    if(updated != null){
        return updated;
    }else{
        throw new RuntimeException("Student with ID " + id + "not found");
    }
    }

}