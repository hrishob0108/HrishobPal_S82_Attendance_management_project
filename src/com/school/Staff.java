package com.school;

public class Staff extends Person {
    private String role;

    public Staff(String name, String role) {
        super(name);
        this.role = role;
    }

    
   
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Role: Staff, Position: " + role);
    }
}
