package com.example.demo.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Studententity;

@Service
public class Studentservice {
    private Map<Integer ,Studententity> details = new HashMap<>();

    public Studententity saveData(Studententity st){
        details.put(st.getId(),st);
        return st;
    }

    public Studententity getById(int id){
        return details.get(id);
    }

    public Collection<Studententity>getAll(){
        return details.values();
    }

    public Studententity updateStudent(int id , Studententity st){
        if(details.containsKey(id)){
            st.setId(id);
            details.put(id,st);
            return st;
        }
        return null;
    }
}