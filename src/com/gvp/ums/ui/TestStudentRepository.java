package com.gvp.ums.ui;

import com.gvp.ums.model.Student;
import com.gvp.ums.repository.StudentRepository;
import java.util.List;

public class TestStudentRepository{
    public static void main(String[] args) {

        StudentRepository repository = new StudentRepository();
        Student student1 = new Student(
            "Sumyon", "sumyon@example.com", "9876543210",
            "GVP001", "CSE001", "14-11-2007", "Male",
            "CSE", 2, 3, "CSE-3", 2025
        );
        Student student2 = new Student(
            "Rahul", "rahul@example.com", "9876543211",
            "GVP002", "CSE002", "10-05-2007", "Male",
            "CSE", 2, 3, "CSE-3", 2025
        );

        repository.addStudent(student1);
        repository.addStudent(student2);

        Student foundStudent = repository.findStudentById("GVP001");
        if(foundStudent != null){
            System.out.println("Student found :");
            System.out.println(foundStudent);
        }
        else{
            System.out.println("Student not found.");
        }

        Student missingStudent = repository.findStudentById("GVP215");
        if(missingStudent!=null){
            System.out.println(missingStudent);
        }
        else{
            System.out.println("Student not found.");
        }

        List<Student> students = repository.getAllStudents();

        for(Student s:students){
            System.out.println(s);
        }
    }
}
