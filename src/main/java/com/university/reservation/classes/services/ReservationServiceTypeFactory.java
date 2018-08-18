package com.university.reservation.classes.services;

public class ReservationServiceTypeFactory {
    public ReservationService createReservationServiceType(String type){

        if("professor".equals(type)){
            return new ReservationServiceProfessorImpl();
        }else if("student".equals(type)){
            return new ReservationServiceStudentImpl();
        }
        return null;
    }
}
