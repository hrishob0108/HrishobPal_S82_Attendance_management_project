package com.school;

public class Main {
    public static void main(String[] args) {
        // Create objects
        Student student = new Student("Alice", "10th Grade");
        Teacher teacher = new Teacher("Mr. Smith", "Mathematics");
        Staff staff = new Staff("John", "Librarian");

        // Display details
        student.displayDetails();
        teacher.displayDetails();
        staff.displayDetails();

        // Example AttendanceRecord usage
        AttendanceRecord record = new AttendanceRecord(student.getId(), "2025-09-04");
        record.displayRecord();
    }
}
