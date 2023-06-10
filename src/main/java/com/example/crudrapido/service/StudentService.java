package com.example.crudrapido.service;

import com.example.crudrapido.entity.StudentModel;
import com.example.crudrapido.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    StudentRepository repository;
    public List<StudentModel> getStudents() {
        return repository.findAll();
    }
    public Optional<StudentModel> getStudent(Long id) {
        return repository.findById(id);
    }
    public void saveOrUpdate(StudentModel student) {
         repository.save(student);
    }
    public void delete(Long id) {
        repository.deleteById(id);
    }


}
