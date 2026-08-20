package com.gvp.ums.ui;

import com.gvp.ums.model.Attendance;
import com.gvp.ums.model.Course;
import com.gvp.ums.model.Student;

public class TestAttendance {

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

        Attendance attendance = new Attendance(
                "ATT001",
                student,
                course,
                "20-08-2026",
                "PRESENT"
        );

        System.out.println(attendance);
        attendance.updateStatus("ABSENT");
        System.out.println(attendance);
    }
}