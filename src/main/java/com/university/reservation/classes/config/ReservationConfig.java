package com.university.reservation.classes.config;

import com.university.reservation.classes.services.ReservationService;
import com.university.reservation.classes.services.ReservationServiceTypeFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class ReservationConfig {

    @Bean
    public ReservationServiceTypeFactory reservationServiceTypeFactory(){
        return new ReservationServiceTypeFactory();
    }

    @Bean
    @Profile({"default","professor"})
    public ReservationService professorReservationImpl(ReservationServiceTypeFactory reservationServiceTypeFactory){

        return reservationServiceTypeFactory.createReservationServiceType("professor");
    }

    @Bean
    @Profile("student")
    public ReservationService studentReservationImpl(ReservationServiceTypeFactory reservationServiceTypeFactory){
        return reservationServiceTypeFactory.createReservationServiceType("student");
    }

}
