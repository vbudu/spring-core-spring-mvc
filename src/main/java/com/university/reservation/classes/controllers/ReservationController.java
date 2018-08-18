package com.university.reservation.classes.controllers;

import com.university.reservation.classes.dtos.ClassRoom;
import com.university.reservation.classes.services.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class ReservationController {
    private ReservationService reservationService;

    @Autowired
    public ReservationController(ReservationService reservationService){
        this.reservationService = reservationService;
    }

    public void startReservation(ClassRoom classRoom){

        this.reservationService.startReservation(classRoom);
    }
}
