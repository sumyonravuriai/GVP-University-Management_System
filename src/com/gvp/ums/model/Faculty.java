package com.gvp.ums.model;
public class Faculty extends User{

    private String facultyId;
    private String designation;
    private String department;
    private String specialization;
    private int joiningYear;
    // constructor
    public Faculty(String name, String email, String phoneNumber,
               String facultyId, String designation,
               String department, String specialization,
               int joiningYear){

        super(name,email,phoneNumber);

        this.facultyId = facultyId;
        this.designation = designation;
        this.department = department;
        this.specialization = specialization;
        this.joiningYear = joiningYear;
        }

        // getters-methods

    public String getFacultyId(){
        return facultyId;
    }
    public String getDesignation(){
        return designation;
    }
    public String getDepartment(){
        return department;
    }
    public String getSpecialization(){
        return specialization;
    }
    public int getJoiningYear(){
        return joiningYear;
    }

    @Override
    public String toString(){
        return "Faculty{" +
            "facultyId='" + facultyId + '\'' +
            ", designation='" + designation + '\'' +
            ", department='" + department + '\'' +
            ", specialization='" + specialization + '\'' +
            ", joiningYear=" + joiningYear +
            ", name='" + getName() + '\'' +
            ", email='" + getEmail() + '\'' +
            '}';
    }
    public void updateProfessionalDetails(String designation,String department,String specialization){
        this.designation = designation;
        this.department = department;
        this.specialization = specialization;
    }

}