package com.gvp.ums.service;
import com.gvp.ums.model.Student;
import com.gvp.ums.repository.StudentRepository;

public class StudentService{
    private StudentRepository studentRepository = new StudentRepository();
    public void displayStudentDetails(Student student){
        System.out.println(student);
    }
    public void registerStudent(Student student){
        Student existingStudent = studentRepository.findStudentById(student.getStudentId());
        if(existingStudent != null){
            System.out.println("Registration failed: Student ID already exists.");
            return;
        }
        studentRepository.addStudent(student);
        System.out.println("Student registered successfully.");
    }
    public void displayAllStudents(){
        for(Student s : studentRepository.getAllStudents()){
            System.out.println(s);
        }
    }
}