package com.gvp.ums.ui;
import com.gvp.ums.model.Admin;
public class TestAdmin{
    public static void main(String[] args) {
        Admin admin = new Admin("Admin User",
                "admin@gvp.edu",
                "9876543210",
                "ADM001",
                "System Administrator");
        System.out.println(admin);
        admin.updateRole("System Manager");
        System.out.println(admin);
    }
}