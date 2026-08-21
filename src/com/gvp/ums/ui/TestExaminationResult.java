package com.gvp.ums.ui;

import com.gvp.ums.model.Course;
import com.gvp.ums.model.ExaminationResult;
import com.gvp.ums.model.Student;

public class TestExaminationResult {

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
                1,
                3,
                "CSE-3",
                2025
        );

        Course course = new Course(
                "CS101",
                "Data Structures",
                "CSE",
                4.0,
                3
        );

        ExaminationResult result = new ExaminationResult(
                "RES001",
                student,
                course,
                "Mid Examination",
                82,
                "A",
                "PASS"
        );

        System.out.println(result);
        result.updateResult(91,"A+","Pass");
        System.out.println(result);
    }
    
    
}