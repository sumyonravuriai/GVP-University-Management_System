package com.gvp.ums.ui;
import com.gvp.ums.model.Faculty;
public class TestFaculty{
    public static void main(String[] args) {
        Faculty faculty = new Faculty("Dr. Rao",
                "rao@gvp.edu",
                "9876543210",
                "FAC001",
                "Assistant Professor",
                "CSE",
                "Data Structures",
                2022);
        System.out.println(faculty);
        faculty.updateProfessionalDetails("Associate Professor","CSE","Machine Learning"); // fn-calling
        System.out.println(faculty);
    }
}