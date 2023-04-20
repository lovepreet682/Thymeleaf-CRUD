package com.springcurd.springcurdthymeleaf.repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springcurd.springcurdthymeleaf.studentEntity.Student;


@Repository
public interface StudentRepositary  extends JpaRepository<Student, Integer>{

    
}