package com.gvp.ums.ui;

import com.gvp.ums.model.Student;
import com.gvp.ums.service.StudentService;

public class TestStudentService{
    public static void main(String[] args) {
        Student student = new Student(
            "Sumyon",
            "sumyon@example.com",
            "9876543210",
            "GVP001",
            "CSE001",
            "14-11-2007",
            "Male",
            "CSE",
            2,
            3,
            "CSE-3",
            2025
        );

        Student student2 = new Student(
            "Rahul", "rahul@example.com", "9876543211",
            "GVP002", "CSE002", "10-05-2007", "Male",
            "CSE", 2, 3, "CSE-3", 2025
        );

        StudentService studentService = new StudentService();
        studentService.registerStudent(student);
        studentService.registerStudent(student);
        studentService.registerStudent(student2);
        System.out.println("All registered students : ");
        studentService.displayAllStudents();
    }
}