package com.university.reservation.classes.dtos;

public class ClassRoom {
    private int classRoomNumber;

    public ClassRoom(int room) {
        this.classRoomNumber=room;
    }

    public int getClassRoomNumber() {
        return classRoomNumber;
    }

    public void setClassRoomNumber(int classRoomNumber) {
        this.classRoomNumber = classRoomNumber;
    }
}
