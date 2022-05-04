package com.zahid.student;

public class Student {
    public StudentService studentService; // null

    // enforcing student object instantiation to avoid null pointer exception
    public Student(StudentService studentService) {
        this.studentService = studentService;
    }

    public double getAverageMarks() {
        return studentService.getTotalMarks() / studentService.getTotalStudents();
    }
}
