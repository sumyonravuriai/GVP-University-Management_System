package com.gvp.ums.ui;
import com.gvp.ums.model.Course;
public class TestCourse{
    public static void main(String[] args) {
        Course course = new Course(
                "CS101",
                "Data Structures",
                "CSE",
                4.0,
                3
        );

        System.out.println(course);

        course.updateCourseDetails(
                "Advanced Data Structures",
                "CSE",
                4.0,
                4
        );

        System.out.println(course);
    }
}
