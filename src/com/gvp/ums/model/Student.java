package com.gvp.ums.model; 

public class Student extends User{

    private String studentId;
    private String rollNumber;
    private String department;
    private int year;
    private int semester;
    private String section;
    private String dateOfBirth;
    private String gender;
    private int admissionYear;

    public Student(String name,String email,String phoneNumber,String studentId,String rollNumber,String dateOfBirth,
    String gender,String department,int year,int semester,String section,int admissionYear){    // constructor
        super(name,email,phoneNumber);      // calls parents constructor i.e User
        this.studentId = studentId;
        this.rollNumber = rollNumber;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.department = department;
        this.year = year;
        this.semester = semester;
        this.section = section;
        this.admissionYear = admissionYear;
    }

    // getters-mehod
    public String getStudentId(){
        return studentId;
    }
    public String getRollNumber(){
        return rollNumber;
    }
    public String getDateOfBirth(){
        return dateOfBirth;
    }
    public String getGender(){
        return gender;
    }
    public String getDepartment(){
        return department;
    }
    public int getYear(){
        return year;
    }
    public int getSemester(){
        return semester;
    }
    public String getSection(){
        return section;
    }
    public int getAdmissionYear(){
        return admissionYear;
    }
    @Override
    public String toString(){
        return "Student{" +
                "studentId='" + studentId + '\'' +
                ", rollNumber='" + rollNumber + '\'' +
                ", name='" + getName() + '\'' +
                ", email='" + getEmail() + '\'' +
                ", department='" + department + '\'' +
                ", year=" + year +
                ", semester=" + semester +
                ", section='" + section + '\'' +
                ", admissionYear=" + admissionYear +
                '}';
    }
    // setter-methods
    public void updateAcademicDetails(String department,int year,int semester,String section){
        this.department = department;
        this.year = year;
        this.semester = semester;
        this.section = section;
    }

}