package com.springcurd.springcurdthymeleaf.service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springcurd.springcurdthymeleaf.repositary.StudentRepositary;
import com.springcurd.springcurdthymeleaf.studentEntity.Student;

@Service
public class StudentService {

    @Autowired
    private StudentRepositary repository;

    //get all students
    public List<Student> getStudentList() {
        List<Student> students=(List<Student>) repository.findAll(); 
         return students;
    }

    //Create a new student
    public void createStudent(Student student) {
         repository.save(student);
    }

    //delete student
    public void deleteStudent(int id) {
        repository.deleteById(id);
    }

    //update student
    public Optional<Student> updateStudent(int id) {
        Optional<Student> soptional=repository.findById(id);
        if(soptional.equals(soptional)){
            repository.findById(id);
        }
        return soptional;
    }






}
