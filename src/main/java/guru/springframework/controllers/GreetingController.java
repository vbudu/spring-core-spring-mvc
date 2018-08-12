package guru.springframework.controllers;

import guru.springframework.services.HelloWorldService;
import guru.springframework.services.HelloWorldServiceEnglishImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class GreetingController {

    private HelloWorldService helloWorldService;

    @Autowired
    public GreetingController(HelloWorldService helloWorldService) {
        this.helloWorldService = helloWorldService;
    }

    public String sayHello(){
        String greeting = helloWorldService.getGreeting();
        System.out.println(greeting);
        return greeting;
    }
}
