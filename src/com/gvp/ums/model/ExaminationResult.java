package com.gvp.ums.model;

public class ExaminationResult{
    private String resultId;
    private Student student;
    private Course course;
    private ExamType examType;
    private int marks;
    private String grade;
    private ResultStatus status;
    // constructor
    public ExaminationResult(String resultId,Student student,Course course,
    ExamType examType, int marks,   String grade, ResultStatus status) {

        this.resultId = resultId;
        this.student = student;
        this.course = course;
        this.examType = examType;
        this.marks = marks;
        this.grade = grade;
        this.status = status;
    }
    // getters
    public String getResultId() {
        return resultId;
    }

    public Student getStudent() {
        return student;
    }

    public Course getCourse() {
        return course;
    }

    public ExamType getExamType() {
        return examType;
    }

    public int getMarks() {
        return marks;
    }

    public String getGrade() {
        return grade;
    }

    public ResultStatus getStatus() {
        return status;
    }
    @Override
    public String toString() {          // to string()
        return "ExaminationResult{" +
                "resultId='" + resultId + '\'' +
                ", student=" + student +
                ", course=" + course +
                ", examType='" + examType + '\'' +
                ", marks=" + marks +
                ", grade='" + grade + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
    // setters
    public void updateResult(int marks, String grade, ResultStatus status) {
        this.marks = marks;
        this.grade = grade;
        this.status = status;
    }
}