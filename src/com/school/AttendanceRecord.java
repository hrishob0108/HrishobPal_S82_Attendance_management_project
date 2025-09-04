package com.school;

public class AttendanceRecord {
    private int studentId;
    private String date;

    public AttendanceRecord(int studentId, String date) {
        this.studentId = studentId;
        this.date = date;
    }

    public void displayRecord() {
        System.out.println("Attendance Record -> Student ID: " + studentId + ", Date: " + date);
    }
}
