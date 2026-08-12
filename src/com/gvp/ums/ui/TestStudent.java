package com.gvp.ums.ui;
import com.gvp.ums.model.Student;
public class TestStudent{
    public static void main(String[] args) {
        Student student = new Student("Sumyon",
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
                2025);
        System.out.println(student);
    }
}