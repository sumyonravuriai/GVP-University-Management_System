package com.gvp.ums.model;

public abstract class User{

    private String name;
    private String email;
    private String phoneNumber;

    protected User(String name,String email,String phoneNumber){
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public String getName(){    // getters-methods
        return name;
    }
    public String getEmail(){
        return email;
    }
    public String getPhoneNumber(){
        return phoneNumber;
    }
}