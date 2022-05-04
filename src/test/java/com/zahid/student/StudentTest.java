package com.zahid.student;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class StudentTest {

    StudentService studentService;
    Student student;

    @BeforeEach
    void init() {
        // student = new Student(); 

        studentService = Mockito.mock(StudentService.class);
        student = new Student(studentService); 
    }
    
    @Test
    @DisplayName("Testing average marks")
    void testAverage() {
        Mockito.when(studentService.getTotalMarks()).thenReturn(500);
        Mockito.when(studentService.getTotalStudents()).thenReturn(10);

        // assertThrows(NullPointerException.class, () -> student.getAverageMarks());
        // assertThrows(ArithmeticException.class, () -> student.getAverageMarks());
        assertEquals(50.0, student.getAverageMarks());
    }
}
