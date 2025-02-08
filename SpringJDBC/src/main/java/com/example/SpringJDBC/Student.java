package com.example.SpringJDBC;

public class Student {

    private int rollNo;
    private String sName;
    private int marks;

    public Student() {
        System.out.println("Student Constructor");
    }

    public Student(int rollNo,String sName,int marks) {
        this.rollNo = rollNo;
        this.sName = sName;
        this.marks = marks;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }
}
