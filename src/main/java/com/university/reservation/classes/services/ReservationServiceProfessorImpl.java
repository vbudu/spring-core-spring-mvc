package com.university.reservation.classes.services;

import com.university.reservation.classes.dtos.ClassRoom;


public class ReservationServiceProfessorImpl implements ReservationService {

    @Override
    public void startReservation(ClassRoom classRoom) {
        System.out.println("PROFESSOR - starting reservation of: "+classRoom.getClassRoomNumber());
    }
}
