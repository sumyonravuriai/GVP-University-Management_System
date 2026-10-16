package com.gvp.ums.service;
import com.gvp.ums.model.Student;
import com.gvp.ums.repository.StudentRepository;

public class StudentService{
    private StudentRepository studentRepository = new StudentRepository();
    public void displayStudentDetails(Student student){
        System.out.println(student);
    }
    public void registerStudent(Student student){
        studentRepository.addStudent(student);
        System.out.println("Student registered successfully");
    }
    public void displayAllStudents(){
        for(Student s : studentRepository.getAllStudents()){
            System.out.println(s);
        }
    }
}