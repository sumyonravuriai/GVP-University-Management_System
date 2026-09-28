package com.gvp.ums.model;

public class Enrollment{
    private String enrollmentId;
    private Student student;
    private Course course;
    private String enrollmentDate;
    private EnrollmentStatus status;
    // constructors
    public Enrollment(String enrollmentId,Student student,Course course,String enrollmentDate,EnrollmentStatus status){
        this.enrollmentId = enrollmentId;
        this.student = student;
        this.course =  course;
        this.enrollmentDate = enrollmentDate;
        this.status = status;
    }
    // getters
    public String getEnrollmentId() {
        return enrollmentId;
    }

    public Student getStudent() {
        return student;
    }

    public Course getCourse() {
        return course;
    }

    public String getEnrollmentDate() {
        return enrollmentDate;
    }

    public EnrollmentStatus getStatus() {
        return status;
    }
    // toString()
    @Override
    public String toString() {
        return "Enrollment{" +
            "enrollmentId='" + enrollmentId + '\'' +
            ", student=" + student +
            ", course=" + course +
            ", enrollmentDate='" + enrollmentDate + '\'' +
            ", status='" + status + '\'' +
            '}';
    }
    // setter
    public void updateStatus(EnrollmentStatus status){
        this.status = status;
    }

}