package com.gvp.ums.ui;

import com.gvp.ums.model.Course;
import com.gvp.ums.model.Enrollment;
import com.gvp.ums.model.EnrollmentStatus;
import com.gvp.ums.model.Student;

public class TestEnrollment{
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

        Enrollment enrollment = new Enrollment(
                "ENR001",
                student,
                course,
                "18-08-2026",
                EnrollmentStatus.ACTIVE
        );

        System.out.println(enrollment);
        enrollment.updateStatus(EnrollmentStatus.COMPLETED);
        System.out.println(enrollment);

    }
}
