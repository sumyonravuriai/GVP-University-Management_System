package com.gvp.ums.model;

public class Attendance{
    private String attendanceId;
    private Student student;
    private Course course;
    private String date;
    private String status;
    // constructor
    public Attendance(String attendanceId,Student student,Course course,String date,String status){
        this.attendanceId = attendanceId;
        this.student = student;
        this.course = course;
        this.date = date;
        this.status = status;
    }
    // getters
    public String getAttendanceId() {
        return attendanceId;
    }

    public Student getStudent() {
        return student;
    }

    public Course getCourse() {
        return course;
    }

    public String getDate() {
        return date;
    }

    public String getStatus() {
        return status;
    }
    @Override
    public String toString() {
        return "Attendance{" +
            "attendanceId='" + attendanceId + '\'' +
            ", student=" + student +
            ", course=" + course +
            ", date='" + date + '\'' +
            ", status='" + status + '\'' +
            '}';
    }
    public void updateStatus(String status){
        this.status = status;
    }
}