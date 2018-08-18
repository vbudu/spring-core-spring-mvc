package com.university.reservation.classes.dtos;

public class Professor extends Person {
    private String professorId;

    public Professor() {
    }

    public String getProfessorId() {
        return professorId;
    }

    public void setProfessorId(String professorId) {
        this.professorId = professorId;
    }
}
