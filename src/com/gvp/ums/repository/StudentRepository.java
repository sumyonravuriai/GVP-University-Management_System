package com.gvp.ums.repository;

import com.gvp.ums.model.Student;
import java.util.ArrayList;
import java.util.List;

public class StudentRepository{

    private List<Student> students = new ArrayList<>();

    public void addStudent(Student student){
        students.add(student);
    }
    
    public List<Student> getAllStudents(){
        return students;
    }
    public Student findStudentById(String studentId){
        for(Student student : students){
            if(student.getStudentId().equals(studentId)){
                return student;
            }
        }
        return null;
    }
}