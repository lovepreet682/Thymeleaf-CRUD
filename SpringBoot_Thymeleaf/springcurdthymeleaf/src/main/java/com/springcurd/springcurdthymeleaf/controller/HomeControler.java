package com.springcurd.springcurdthymeleaf.controller;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.springcurd.springcurdthymeleaf.service.StudentService;
import com.springcurd.springcurdthymeleaf.studentEntity.Student;

@Controller
public class HomeControler {
    
    @Autowired
    private StudentService service;

    @GetMapping("/")
    public String getHome(Student student, Model model) {
        List<Student>list=service.getStudentList();
        model.addAttribute("list", list);
        return "index";
    }


    // GO to the Add page
    @GetMapping("/add")
    public String addStudent(){
        return "add";
    }

    //save the Student information
    @PostMapping("/saveStudent")
    public String saveStudent(@ModelAttribute Student student){
       service.createStudent(student);
       return "redirect:/"; 
    }

    //Delete the Student information
    @GetMapping("/delete/{id}")
    public String deleteStudent(Model model, @PathVariable("id") int id){
        service.deleteStudent(id);
        return "redirect:/";
    }

    //GO to update page 
    @GetMapping("/update/{id}")
    public String editStudent(Model model, @PathVariable("id") int id){
        Optional<Student> optional=service.updateStudent(id);
        Student stu=optional.get();
        model.addAttribute("updateData", stu);
        return "edit";
    }

    @PostMapping("/updateStudent")
    public String updateStudent(@ModelAttribute Student student){
        service.createStudent(student);
        return "redirect:/";
    }
    
}
