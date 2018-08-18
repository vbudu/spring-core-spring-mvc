package com.university.reservation.classes.dtos;

import com.university.reservation.classes.services.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;


public class Universitymanagment {
    private ReservationService reservationService;

    @Autowired
    public Universitymanagment(ReservationService reservationService){
        this.reservationService = reservationService;
    }

    public ReservationService getReservationService() {
        return reservationService;
    }

    public void setReservationService(ReservationService reservationService) {
        this.reservationService = reservationService;
    }
}
