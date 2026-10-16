package com.example.springcore;

public class StudentService {

    private final Student student;

    public StudentService(Student student) {
        this.student = student;
    }

    public void displayStudentProfile() {
        student.displayStudentDetails();
    }
}
