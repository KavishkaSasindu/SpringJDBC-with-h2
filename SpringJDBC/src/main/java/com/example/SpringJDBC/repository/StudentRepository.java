package com.example.SpringJDBC.repository;

import com.example.SpringJDBC.model.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentRepository {

    public StudentRepository() {
        System.out.println("Student Repository");
    }

    public void save(Student student) {
        System.out.println("Student saved " + student);
    }

    public List<Student> findAll() {
        List<Student> students = new ArrayList<Student>();
        return students;
    }
}
