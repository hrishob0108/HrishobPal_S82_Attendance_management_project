package com.school;

public class Teacher extends Person {
    private String subjectTaught;

    
    public Teacher(String name, String subjectTaught) {
        super(name);
        this.subjectTaught = subjectTaught;
    }

    public void displayDetails() {
        super.displayDetails();
        System.out.println("Role: Teacher, Subject: " + subjectTaught);
    }
}
