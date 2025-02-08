package com.example.SpringJDBC.service;

import com.example.SpringJDBC.model.Student;
import com.example.SpringJDBC.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {


    private StudentRepository studentRepository;

    public StudentService() {
        System.out.println("Student Service");
    }

    @Autowired //constructor based injection
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

//    getter and setters
    public StudentRepository getStudentRepository() {
        return studentRepository;
    }

    public void setStudentRepository(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

//    methods
    public void addStudent(Student student) {
        studentRepository.save(student);
    }

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

}
