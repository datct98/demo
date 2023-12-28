package com.example.demo.service;

import com.example.demo.entities.Student;
import com.example.demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    public Student findById(int id){
        Student student = studentRepository.findById(id);
        if(student == null) return new Student();
        return student;
    }

    public void createStudent(String name){
        studentRepository.createStudent(name);
    }
}
