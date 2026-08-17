package com.gvp.ums.model;
public class Admin extends User{
    private String adminId;
    private String role;
    public Admin(String name,String email,String phoneNumber,String adminId,String role){
        super(name,email,phoneNumber);
        this.adminId = adminId;
        this.role = role;
    }
    // getters 
    public String getAdminId(){
        return adminId;
    }
    public String getRole(){
        return role;
    }
    @Override
    public String toString(){
        return "Admin{" +
            "adminId='" + adminId + '\'' +
            ", role='" + role + '\'' +
            ", name='" + getName() + '\'' +
            ", email='" + getEmail() + '\'' +
            '}';
    }
    public void updateRole(String role){
        this .role = role;
    }
}