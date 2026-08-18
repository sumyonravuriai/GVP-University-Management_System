package com.gvp.ums.model;
public class Course{
    private String courseId;
    private String courseName;
    private String department;
    private double credits;
    private int semester;
    public Course(String courseId, String courseName,String department, double credits, int semester) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.department = department;
        this.credits = credits;
        this.semester = semester;
    }
    public String getCourseId() {
        return courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getDepartment() {
        return department;
    }

    public double getCredits() {
        return credits;
    }

    public int getSemester() {
        return semester;
    }
    @Override
    public String toString(){
        return "Course{" +
            "courseId='" + courseId + '\'' +
            ", courseName='" + courseName + '\'' +
            ", department='" + department + '\'' +
            ", credits=" + credits +
            ", semester=" + semester +
            '}';
    }
    public void updateCourseDetails(String courseName, String deparment, double credits,int semester){
        this.courseName = courseName;
        this.department = deparment;
        this.credits = credits;
        this.semester = semester;
    }
}