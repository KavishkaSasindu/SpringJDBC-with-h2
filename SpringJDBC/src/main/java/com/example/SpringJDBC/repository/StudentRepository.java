package com.example.SpringJDBC.repository;

import com.example.SpringJDBC.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentRepository {

    private JdbcTemplate jdbc;

    public StudentRepository() {
        System.out.println("Student Repository");
    }

    @Autowired
    public StudentRepository(JdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }

//    getters and setters
    public JdbcTemplate getJdbc() {
        return jdbc;
    }

    public void setJdbc(JdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }

    public void save(Student student) {

         final String SQL = "insert into student (rollNo,sName,marks) values (?,?,?)";
         int rows = jdbc.update(SQL,student.getRollNo(),student.getsName(),student.getMarks());
        System.out.println(rows);
    }

    public List<Student> findAll() {
        final String SQL = "select * from student";

        RowMapper<Student> mapper = (rs, rowNum) -> {
            Student student = new Student();
            student.setRollNo(rs.getInt("rollNo"));
            student.setsName(rs.getString("sName"));
            student.setMarks(rs.getInt("marks"));
            return student;
        };
        return jdbc.query(SQL, mapper);
    }
}
