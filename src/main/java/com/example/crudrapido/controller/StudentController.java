package com.example.crudrapido.controller;

import com.example.crudrapido.entity.StudentModel;
import com.example.crudrapido.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("student/")
public class StudentController {

    @Autowired
    private StudentService service;

    @GetMapping
    public List<StudentModel> getAll(){
        return service.getStudents();
    }

    @GetMapping("/{id}")
    public Optional<StudentModel> getById(@PathVariable("id") Long studentId){
        return service.getStudent(studentId);
    }

    @PostMapping
    public void saveUpdate(@RequestBody StudentModel studentModel){
        service.saveOrUpdate(studentModel);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Long studentId){
        service.delete(studentId);
    }

}
