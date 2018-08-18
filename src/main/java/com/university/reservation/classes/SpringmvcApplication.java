package com.university.reservation.classes;

import com.university.reservation.classes.controllers.ReservationController;
import com.university.reservation.classes.dtos.ClassRoom;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringmvcApplication {

    public static void main(String[] args) {
        ApplicationContext ctx =
                SpringApplication.run(SpringmvcApplication.class, args);
        /*InjectedByConstructorService injected =
                (InjectedByConstructorService) ctx.getBean("injectedByConstructorService");
        injected.getMessage();*/
        //GreetingController greetingController = (GreetingController) ctx.getBean("greetingController");
        //greetingController.sayHello();
        ReservationController reservationController
                = (ReservationController) ctx.getBean("reservationController");
        reservationController.startReservation(new ClassRoom(12));
    }
}
