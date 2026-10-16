package com.example.springcore;

public class Student {

    private final String studentId;
    private final String studentName;
    private final Course course;

    public Student(String studentId, String studentName, Course course) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.course = course;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public Course getCourse() {
        return course;
    }

    public void displayStudentDetails() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Student Name: " + studentName);
        course.displayCourseDetails();
    }
}
