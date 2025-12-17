

package com.example.demo.repository;
import org.springframework.data.jpa.repository.jpaRepository;
import org.springframework.stereotype.repository;
import com.example.demo.entity.student;
@Repositorypublic interface Studentrepository extends jpaRepository<Student,Long>{
}

