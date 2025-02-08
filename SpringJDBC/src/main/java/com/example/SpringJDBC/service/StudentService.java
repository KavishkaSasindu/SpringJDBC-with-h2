package com.example.SpringJDBC.service;

import com.example.SpringJDBC.model.Student;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    public StudentService() {
        System.out.println("Student Service");
    }

    public void addStudent(Student student) {
        System.out.println("Student added");
    }
}
