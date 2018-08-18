package com.university.reservation.classes.services;

import com.university.reservation.classes.dtos.ClassRoom;


public class ReservationServiceStudentImpl implements ReservationService {
    @Override
    public void startReservation(ClassRoom classRoom) {
        System.out.println("STUDENT - starting reservation of: "+classRoom.getClassRoomNumber());

    }
}
