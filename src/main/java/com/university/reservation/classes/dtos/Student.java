package com.university.reservation.classes.dtos;

public class Student extends Person {
    private String studentId;

    public Student() {
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }
}
